package Qd;

import Jd.AbstractC0896m0;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public abstract class f extends AbstractC0896m0 {

    /* renamed from: d, reason: collision with root package name */
    private final int f8329d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8330e;

    /* renamed from: f, reason: collision with root package name */
    private final long f8331f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8332g;

    /* renamed from: h, reason: collision with root package name */
    private a f8333h = y0();

    public f(int i10, int i11, long j10, String str) {
        this.f8329d = i10;
        this.f8330e = i11;
        this.f8331f = j10;
        this.f8332g = str;
    }

    private final a y0() {
        return new a(this.f8329d, this.f8330e, this.f8331f, this.f8332g);
    }

    @Override // Jd.J
    public void s(CoroutineContext coroutineContext, Runnable runnable) {
        a.i(this.f8333h, runnable, false, false, 6, null);
    }

    @Override // Jd.J
    public void u(CoroutineContext coroutineContext, Runnable runnable) {
        a.i(this.f8333h, runnable, false, true, 2, null);
    }

    public final void z0(Runnable runnable, boolean z10, boolean z11) {
        this.f8333h.g(runnable, z10, z11);
    }
}
