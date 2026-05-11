package androidx.work;

import android.content.Context;
import androidx.work.c;
import h8.d;
import x1.C5104h;

/* loaded from: classes.dex */
public abstract class Worker extends c {

    /* renamed from: e, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f18094e;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f18094e.p(Worker.this.q());
            } catch (Throwable th) {
                Worker.this.f18094e.q(th);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f18096a;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f18096a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f18096a.p(Worker.this.r());
            } catch (Throwable th) {
                this.f18096a.q(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.c
    public d c() {
        androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
        b().execute(new b(t10));
        return t10;
    }

    @Override // androidx.work.c
    public final d o() {
        this.f18094e = androidx.work.impl.utils.futures.c.t();
        b().execute(new a());
        return this.f18094e;
    }

    public abstract c.a q();

    public C5104h r() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}
