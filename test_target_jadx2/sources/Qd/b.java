package Qd;

import Jd.AbstractC0896m0;
import Jd.J;
import Od.E;
import Od.G;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class b extends AbstractC0896m0 implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final b f8325d = new b();

    /* renamed from: e, reason: collision with root package name */
    private static final J f8326e;

    static {
        int e10;
        k kVar = k.f8343c;
        e10 = G.e("kotlinx.coroutines.io.parallelism", kotlin.ranges.d.d(64, E.a()), 0, 0, 12, null);
        f8326e = J.o0(kVar, e10, null, 2, null);
    }

    private b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        s(kotlin.coroutines.g.f36372a, runnable);
    }

    @Override // Jd.J
    public J i0(int i10, String str) {
        return k.f8343c.i0(i10, str);
    }

    @Override // Jd.J
    public void s(CoroutineContext coroutineContext, Runnable runnable) {
        f8326e.s(coroutineContext, runnable);
    }

    @Override // Jd.J
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // Jd.J
    public void u(CoroutineContext coroutineContext, Runnable runnable) {
        f8326e.u(coroutineContext, runnable);
    }
}
