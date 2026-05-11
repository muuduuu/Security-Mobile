package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractServiceC1602t;
import androidx.work.impl.foreground.b;
import x1.n;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC1602t implements b.InterfaceC0315b {

    /* renamed from: f, reason: collision with root package name */
    private static final String f18326f = n.i("SystemFgService");

    /* renamed from: g, reason: collision with root package name */
    private static SystemForegroundService f18327g = null;

    /* renamed from: b, reason: collision with root package name */
    private Handler f18328b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18329c;

    /* renamed from: d, reason: collision with root package name */
    androidx.work.impl.foreground.b f18330d;

    /* renamed from: e, reason: collision with root package name */
    NotificationManager f18331e;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18332a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f18333b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f18334c;

        a(int i10, Notification notification, int i11) {
            this.f18332a = i10;
            this.f18333b = notification;
            this.f18334c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                e.a(SystemForegroundService.this, this.f18332a, this.f18333b, this.f18334c);
            } else if (i10 >= 29) {
                d.a(SystemForegroundService.this, this.f18332a, this.f18333b, this.f18334c);
            } else {
                SystemForegroundService.this.startForeground(this.f18332a, this.f18333b);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18336a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f18337b;

        b(int i10, Notification notification) {
            this.f18336a = i10;
            this.f18337b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f18331e.notify(this.f18336a, this.f18337b);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18339a;

        c(int i10) {
            this.f18339a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f18331e.cancel(this.f18339a);
        }
    }

    static class d {
        static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    static class e {
        static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                n.e().l(SystemForegroundService.f18326f, "Unable to start foreground service", e10);
            } catch (SecurityException e11) {
                n.e().l(SystemForegroundService.f18326f, "Unable to start foreground service", e11);
            }
        }
    }

    private void f() {
        this.f18328b = new Handler(Looper.getMainLooper());
        this.f18331e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.b bVar = new androidx.work.impl.foreground.b(getApplicationContext());
        this.f18330d = bVar;
        bVar.n(this);
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0315b
    public void b(int i10, int i11, Notification notification) {
        this.f18328b.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0315b
    public void c(int i10, Notification notification) {
        this.f18328b.post(new b(i10, notification));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0315b
    public void d(int i10) {
        this.f18328b.post(new c(i10));
    }

    @Override // androidx.lifecycle.AbstractServiceC1602t, android.app.Service
    public void onCreate() {
        super.onCreate();
        f18327g = this;
        f();
    }

    @Override // androidx.lifecycle.AbstractServiceC1602t, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f18330d.l();
    }

    @Override // androidx.lifecycle.AbstractServiceC1602t, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f18329c) {
            n.e().f(f18326f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f18330d.l();
            f();
            this.f18329c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f18330d.m(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0315b
    public void stop() {
        this.f18329c = true;
        n.e().a(f18326f, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f18327g = null;
        stopSelf();
    }
}
