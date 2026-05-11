package G;

import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.InterfaceC3735a;

/* loaded from: classes.dex */
public class d implements h8.d {

    /* renamed from: a, reason: collision with root package name */
    private final h8.d f2719a;

    /* renamed from: b, reason: collision with root package name */
    c.a f2720b;

    class a implements c.InterfaceC0253c {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC0253c
        public Object a(c.a aVar) {
            y0.f.j(d.this.f2720b == null, "The result can only set once!");
            d.this.f2720b = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    d(h8.d dVar) {
        this.f2719a = (h8.d) y0.f.g(dVar);
    }

    public static d a(h8.d dVar) {
        return dVar instanceof d ? (d) dVar : new d(dVar);
    }

    boolean b(Object obj) {
        c.a aVar = this.f2720b;
        if (aVar != null) {
            return aVar.c(obj);
        }
        return false;
    }

    boolean c(Throwable th) {
        c.a aVar = this.f2720b;
        if (aVar != null) {
            return aVar.f(th);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f2719a.cancel(z10);
    }

    public final d d(InterfaceC3735a interfaceC3735a, Executor executor) {
        return (d) n.G(this, interfaceC3735a, executor);
    }

    @Override // h8.d
    public void e(Runnable runnable, Executor executor) {
        this.f2719a.e(runnable, executor);
    }

    public final d f(G.a aVar, Executor executor) {
        return (d) n.H(this, aVar, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f2719a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f2719a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f2719a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f2719a.get(j10, timeUnit);
    }

    d() {
        this.f2719a = androidx.concurrent.futures.c.a(new a());
    }
}
