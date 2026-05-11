package X8;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    private boolean f11825b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f11824a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Queue f11826c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f11827d = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        synchronized (this.f11824a) {
            try {
                if (this.f11826c.isEmpty()) {
                    this.f11825b = false;
                } else {
                    H h10 = (H) this.f11826c.remove();
                    e(h10.f11778a, h10.f11779b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: X8.F
                @Override // java.lang.Runnable
                public final void run() {
                    n nVar = n.this;
                    Runnable runnable2 = runnable;
                    J j10 = new J(nVar, null);
                    try {
                        runnable2.run();
                        j10.close();
                    } catch (Throwable th) {
                        try {
                            j10.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            d();
        }
    }

    public void a(Executor executor, Runnable runnable) {
        synchronized (this.f11824a) {
            try {
                if (this.f11825b) {
                    this.f11826c.add(new H(executor, runnable, null));
                } else {
                    this.f11825b = true;
                    e(executor, runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
