package x2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.AbstractActivityC1577t;
import j0.C3476a;
import r2.x;

/* loaded from: classes.dex */
public class o implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    private static final b f44747f = new a();

    /* renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.l f44748a;

    /* renamed from: b, reason: collision with root package name */
    private final b f44749b;

    /* renamed from: c, reason: collision with root package name */
    private final C3476a f44750c = new C3476a();

    /* renamed from: d, reason: collision with root package name */
    private final i f44751d;

    /* renamed from: e, reason: collision with root package name */
    private final m f44752e;

    class a implements b {
        a() {
        }

        @Override // x2.o.b
        public com.bumptech.glide.l a(com.bumptech.glide.c cVar, j jVar, p pVar, Context context) {
            return new com.bumptech.glide.l(cVar, jVar, pVar, context);
        }
    }

    public interface b {
        com.bumptech.glide.l a(com.bumptech.glide.c cVar, j jVar, p pVar, Context context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f44747f : bVar;
        this.f44749b = bVar;
        this.f44752e = new m(bVar);
        this.f44751d = b();
    }

    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        return (x.f39190f && x.f39189e) ? new h() : new f();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private com.bumptech.glide.l f(Context context) {
        if (this.f44748a == null) {
            synchronized (this) {
                try {
                    if (this.f44748a == null) {
                        this.f44748a = this.f44749b.a(com.bumptech.glide.c.d(context.getApplicationContext()), new C5106a(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f44748a;
    }

    private static boolean g(Context context) {
        Activity c10 = c(context);
        return c10 == null || !c10.isFinishing();
    }

    public com.bumptech.glide.l d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (D2.l.s() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC1577t) {
                return e((AbstractActivityC1577t) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return d(contextWrapper.getBaseContext());
                }
            }
        }
        return f(context);
    }

    public com.bumptech.glide.l e(AbstractActivityC1577t abstractActivityC1577t) {
        if (D2.l.r()) {
            return d(abstractActivityC1577t.getApplicationContext());
        }
        a(abstractActivityC1577t);
        this.f44751d.a(abstractActivityC1577t);
        boolean g10 = g(abstractActivityC1577t);
        return this.f44752e.b(abstractActivityC1577t, com.bumptech.glide.c.d(abstractActivityC1577t.getApplicationContext()), abstractActivityC1577t.getLifecycle(), abstractActivityC1577t.getSupportFragmentManager(), g10);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }
}
