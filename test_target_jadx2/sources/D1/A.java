package D1;

import android.content.Context;
import android.os.Build;
import x1.C5104h;
import x1.InterfaceC5105i;

/* loaded from: classes.dex */
public class A implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    static final String f1108g = x1.n.i("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c f1109a = androidx.work.impl.utils.futures.c.t();

    /* renamed from: b, reason: collision with root package name */
    final Context f1110b;

    /* renamed from: c, reason: collision with root package name */
    final C1.u f1111c;

    /* renamed from: d, reason: collision with root package name */
    final androidx.work.c f1112d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC5105i f1113e;

    /* renamed from: f, reason: collision with root package name */
    final E1.b f1114f;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f1115a;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f1115a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (A.this.f1109a.isCancelled()) {
                return;
            }
            try {
                C5104h c5104h = (C5104h) this.f1115a.get();
                if (c5104h == null) {
                    throw new IllegalStateException("Worker was marked important (" + A.this.f1111c.f792c + ") but did not provide ForegroundInfo");
                }
                x1.n.e().a(A.f1108g, "Updating notification for " + A.this.f1111c.f792c);
                A a10 = A.this;
                a10.f1109a.r(a10.f1113e.a(a10.f1110b, a10.f1112d.e(), c5104h));
            } catch (Throwable th) {
                A.this.f1109a.q(th);
            }
        }
    }

    public A(Context context, C1.u uVar, androidx.work.c cVar, InterfaceC5105i interfaceC5105i, E1.b bVar) {
        this.f1110b = context;
        this.f1111c = uVar;
        this.f1112d = cVar;
        this.f1113e = interfaceC5105i;
        this.f1114f = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(androidx.work.impl.utils.futures.c cVar) {
        if (this.f1109a.isCancelled()) {
            cVar.cancel(true);
        } else {
            cVar.r(this.f1112d.c());
        }
    }

    public h8.d b() {
        return this.f1109a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f1111c.f806q || Build.VERSION.SDK_INT >= 31) {
            this.f1109a.p(null);
            return;
        }
        final androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
        this.f1114f.b().execute(new Runnable() { // from class: D1.z
            @Override // java.lang.Runnable
            public final void run() {
                A.this.c(t10);
            }
        });
        t10.e(new a(t10), this.f1114f.b());
    }
}
