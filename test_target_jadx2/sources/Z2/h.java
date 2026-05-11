package Z2;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected final AtomicInteger f12362a = new AtomicInteger(0);

    public void a() {
        if (this.f12362a.compareAndSet(0, 2)) {
            d();
        }
    }

    protected abstract void b(Object obj);

    protected abstract Object c();

    protected abstract void d();

    protected abstract void e(Exception exc);

    protected abstract void f(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12362a.compareAndSet(0, 1)) {
            try {
                Object c10 = c();
                this.f12362a.set(3);
                try {
                    f(c10);
                } finally {
                    b(c10);
                }
            } catch (Exception e10) {
                this.f12362a.set(4);
                e(e10);
            }
        }
    }
}
