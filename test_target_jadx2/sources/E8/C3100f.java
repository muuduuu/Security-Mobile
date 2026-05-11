package e8;

import D7.C0787k;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e8.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3100f {

    /* renamed from: o, reason: collision with root package name */
    private static final Map f32268o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f32269a;

    /* renamed from: b, reason: collision with root package name */
    private final z f32270b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32271c;

    /* renamed from: g, reason: collision with root package name */
    private boolean f32275g;

    /* renamed from: h, reason: collision with root package name */
    private final Intent f32276h;

    /* renamed from: i, reason: collision with root package name */
    private final G f32277i;

    /* renamed from: m, reason: collision with root package name */
    private ServiceConnection f32281m;

    /* renamed from: n, reason: collision with root package name */
    private IInterface f32282n;

    /* renamed from: d, reason: collision with root package name */
    private final List f32272d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f32273e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Object f32274f = new Object();

    /* renamed from: k, reason: collision with root package name */
    private final IBinder.DeathRecipient f32279k = new IBinder.DeathRecipient() { // from class: e8.B
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C3100f.k(C3100f.this);
        }
    };

    /* renamed from: l, reason: collision with root package name */
    private final AtomicInteger f32280l = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    private final WeakReference f32278j = new WeakReference(null);

    public C3100f(Context context, z zVar, String str, Intent intent, G g10, F f10) {
        this.f32269a = context;
        this.f32270b = zVar;
        this.f32271c = str;
        this.f32276h = intent;
        this.f32277i = g10;
    }

    public static /* synthetic */ void k(C3100f c3100f) {
        c3100f.f32270b.c("reportBinderDeath", new Object[0]);
        android.support.v4.media.session.b.a(c3100f.f32278j.get());
        c3100f.f32270b.c("%s : Binder has died.", c3100f.f32271c);
        Iterator it = c3100f.f32272d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC3093A) it.next()).a(c3100f.w());
        }
        c3100f.f32272d.clear();
        synchronized (c3100f.f32274f) {
            c3100f.x();
        }
    }

    static /* bridge */ /* synthetic */ void o(final C3100f c3100f, final C0787k c0787k) {
        c3100f.f32273e.add(c0787k);
        c0787k.a().addOnCompleteListener(new OnCompleteListener() { // from class: e8.C
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C3100f.this.u(c0787k, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void q(C3100f c3100f, AbstractRunnableC3093A abstractRunnableC3093A) {
        if (c3100f.f32282n != null || c3100f.f32275g) {
            if (!c3100f.f32275g) {
                abstractRunnableC3093A.run();
                return;
            } else {
                c3100f.f32270b.c("Waiting to bind to the service.", new Object[0]);
                c3100f.f32272d.add(abstractRunnableC3093A);
                return;
            }
        }
        c3100f.f32270b.c("Initiate binding to the service.", new Object[0]);
        c3100f.f32272d.add(abstractRunnableC3093A);
        ServiceConnectionC3099e serviceConnectionC3099e = new ServiceConnectionC3099e(c3100f, null);
        c3100f.f32281m = serviceConnectionC3099e;
        c3100f.f32275g = true;
        if (c3100f.f32269a.bindService(c3100f.f32276h, serviceConnectionC3099e, 1)) {
            return;
        }
        c3100f.f32270b.c("Failed to bind to the service.", new Object[0]);
        c3100f.f32275g = false;
        Iterator it = c3100f.f32272d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC3093A) it.next()).a(new C3101g());
        }
        c3100f.f32272d.clear();
    }

    static /* bridge */ /* synthetic */ void r(C3100f c3100f) {
        c3100f.f32270b.c("linkToDeath", new Object[0]);
        try {
            c3100f.f32282n.asBinder().linkToDeath(c3100f.f32279k, 0);
        } catch (RemoteException e10) {
            c3100f.f32270b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void s(C3100f c3100f) {
        c3100f.f32270b.c("unlinkToDeath", new Object[0]);
        c3100f.f32282n.asBinder().unlinkToDeath(c3100f.f32279k, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f32271c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Iterator it = this.f32273e.iterator();
        while (it.hasNext()) {
            ((C0787k) it.next()).d(w());
        }
        this.f32273e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f32268o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f32271c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f32271c, 10);
                    handlerThread.start();
                    map.put(this.f32271c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f32271c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f32282n;
    }

    public final void t(AbstractRunnableC3093A abstractRunnableC3093A, C0787k c0787k) {
        c().post(new D(this, abstractRunnableC3093A.c(), c0787k, abstractRunnableC3093A));
    }

    final /* synthetic */ void u(C0787k c0787k, Task task) {
        synchronized (this.f32274f) {
            this.f32273e.remove(c0787k);
        }
    }

    public final void v(C0787k c0787k) {
        synchronized (this.f32274f) {
            this.f32273e.remove(c0787k);
        }
        c().post(new E(this));
    }
}
