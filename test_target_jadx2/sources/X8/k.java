package X8;

import D7.AbstractC0777a;
import D7.AbstractC0789m;
import D7.C0778b;
import D7.C0787k;
import V6.AbstractC1287s;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f11796b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f11797c = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    protected final n f11795a = new n();

    public Task a(final Executor executor, final Callable callable, final AbstractC0777a abstractC0777a) {
        AbstractC1287s.p(this.f11796b.get() > 0);
        if (abstractC0777a.a()) {
            return AbstractC0789m.e();
        }
        final C0778b c0778b = new C0778b();
        final C0787k c0787k = new C0787k(c0778b.b());
        this.f11795a.a(new Executor() { // from class: X8.y
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Executor executor2 = executor;
                AbstractC0777a abstractC0777a2 = abstractC0777a;
                C0778b c0778b2 = c0778b;
                C0787k c0787k2 = c0787k;
                try {
                    executor2.execute(runnable);
                } catch (RuntimeException e10) {
                    if (abstractC0777a2.a()) {
                        c0778b2.a();
                    } else {
                        c0787k2.b(e10);
                    }
                    throw e10;
                }
            }
        }, new Runnable() { // from class: X8.z
            @Override // java.lang.Runnable
            public final void run() {
                k.this.g(abstractC0777a, c0778b, callable, c0787k);
            }
        });
        return c0787k.a();
    }

    public abstract void b();

    public void c() {
        this.f11796b.incrementAndGet();
    }

    protected abstract void d();

    public void e(Executor executor) {
        f(executor);
    }

    public Task f(Executor executor) {
        AbstractC1287s.p(this.f11796b.get() > 0);
        final C0787k c0787k = new C0787k();
        this.f11795a.a(executor, new Runnable() { // from class: X8.x
            @Override // java.lang.Runnable
            public final void run() {
                k.this.h(c0787k);
            }
        });
        return c0787k.a();
    }

    final /* synthetic */ void g(AbstractC0777a abstractC0777a, C0778b c0778b, Callable callable, C0787k c0787k) {
        try {
            if (abstractC0777a.a()) {
                c0778b.a();
                return;
            }
            try {
                if (!this.f11797c.get()) {
                    b();
                    this.f11797c.set(true);
                }
                if (abstractC0777a.a()) {
                    c0778b.a();
                    return;
                }
                Object call = callable.call();
                if (abstractC0777a.a()) {
                    c0778b.a();
                } else {
                    c0787k.c(call);
                }
            } catch (RuntimeException e10) {
                throw new T8.a("Internal error has occurred when executing ML Kit tasks", 13, e10);
            }
        } catch (Exception e11) {
            if (abstractC0777a.a()) {
                c0778b.a();
            } else {
                c0787k.b(e11);
            }
        }
    }

    final /* synthetic */ void h(C0787k c0787k) {
        int decrementAndGet = this.f11796b.decrementAndGet();
        AbstractC1287s.p(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            d();
            this.f11797c.set(false);
        }
        q7.D.a();
        c0787k.c(null);
    }
}
