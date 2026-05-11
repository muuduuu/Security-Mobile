package com.facebook.react;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import r4.AbstractC4012a;

/* renamed from: com.facebook.react.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1893h extends Service implements J4.d {

    /* renamed from: b, reason: collision with root package name */
    private static PowerManager.WakeLock f21693b;

    /* renamed from: a, reason: collision with root package name */
    private final Set f21694a = new CopyOnWriteArraySet();

    /* renamed from: com.facebook.react.h$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J4.c f21695a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J4.a f21696b;

        a(J4.c cVar, J4.a aVar) {
            this.f21695a = cVar;
            this.f21696b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractServiceC1893h.this.f21694a.add(Integer.valueOf(this.f21695a.n(this.f21696b)));
        }
    }

    /* renamed from: com.facebook.react.h$b */
    class b implements B {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J4.a f21698a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f21699b;

        b(J4.a aVar, A a10) {
            this.f21698a = aVar;
            this.f21699b = a10;
        }

        @Override // com.facebook.react.B
        public void a(ReactContext reactContext) {
            AbstractServiceC1893h.this.k(reactContext, this.f21698a);
            this.f21699b.e(this);
        }
    }

    /* renamed from: com.facebook.react.h$c */
    class c implements B {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J4.a f21701a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f21702b;

        c(J4.a aVar, J j10) {
            this.f21701a = aVar;
            this.f21702b = j10;
        }

        @Override // com.facebook.react.B
        public void a(ReactContext reactContext) {
            AbstractServiceC1893h.this.k(reactContext, this.f21701a);
            this.f21702b.r0(this);
        }
    }

    public static void e(Context context) {
        PowerManager.WakeLock wakeLock = f21693b;
        if (wakeLock == null || !wakeLock.isHeld()) {
            PowerManager.WakeLock newWakeLock = ((PowerManager) AbstractC4012a.c((PowerManager) context.getSystemService("power"))).newWakeLock(1, AbstractServiceC1893h.class.getCanonicalName());
            f21693b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            f21693b.acquire();
        }
    }

    private void f(J4.a aVar) {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            A h10 = h();
            h10.l(new b(aVar, h10));
            h10.start();
        } else {
            J c10 = i().c();
            c10.s(new c(aVar, c10));
            c10.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(ReactContext reactContext, J4.a aVar) {
        J4.c f10 = J4.c.f(reactContext);
        f10.d(this);
        UiThreadUtil.runOnUiThread(new a(f10, aVar));
    }

    @Override // J4.d
    public void a(int i10) {
        this.f21694a.remove(Integer.valueOf(i10));
        if (this.f21694a.size() == 0) {
            stopSelf();
        }
    }

    @Override // J4.d
    public void b(int i10) {
    }

    protected ReactContext g() {
        if (!ReactFeatureFlags.enableBridgelessArchitecture) {
            return i().c().D();
        }
        A h10 = h();
        AbstractC4012a.d(h10, "getReactHost() is null in New Architecture");
        return h10.k();
    }

    protected A h() {
        return ((InterfaceC1995x) getApplication()).b();
    }

    protected O i() {
        return ((InterfaceC1995x) getApplication()).a();
    }

    protected abstract J4.a j(Intent intent);

    protected void l(J4.a aVar) {
        UiThreadUtil.assertOnUiThread();
        e(this);
        ReactContext g10 = g();
        if (g10 == null) {
            f(aVar);
        } else {
            k(g10, aVar);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ReactContext g10 = g();
        if (g10 != null) {
            J4.c.f(g10).j(this);
        }
        PowerManager.WakeLock wakeLock = f21693b;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        J4.a j10 = j(intent);
        if (j10 == null) {
            return 2;
        }
        l(j10);
        return 3;
    }
}
