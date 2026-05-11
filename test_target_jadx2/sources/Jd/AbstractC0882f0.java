package Jd;

import Od.AbstractC1084l;
import kotlin.collections.C3573h;

/* renamed from: Jd.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0882f0 extends J {

    /* renamed from: c, reason: collision with root package name */
    private long f5037c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5038d;

    /* renamed from: e, reason: collision with root package name */
    private C3573h f5039e;

    private final long A0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void g1(AbstractC0882f0 abstractC0882f0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC0882f0.a1(z10);
    }

    public static /* synthetic */ void z0(AbstractC0882f0 abstractC0882f0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC0882f0.y0(z10);
    }

    public final void O0(Z z10) {
        C3573h c3573h = this.f5039e;
        if (c3573h == null) {
            c3573h = new C3573h();
            this.f5039e = c3573h;
        }
        c3573h.addLast(z10);
    }

    protected long Z0() {
        C3573h c3573h = this.f5039e;
        return (c3573h == null || c3573h.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void a1(boolean z10) {
        this.f5037c += A0(z10);
        if (z10) {
            return;
        }
        this.f5038d = true;
    }

    @Override // Jd.J
    public final J i0(int i10, String str) {
        AbstractC1084l.a(i10);
        return AbstractC1084l.b(this, str);
    }

    public final boolean i1() {
        return this.f5037c >= A0(true);
    }

    public final boolean l1() {
        C3573h c3573h = this.f5039e;
        if (c3573h != null) {
            return c3573h.isEmpty();
        }
        return true;
    }

    public abstract long m1();

    public final boolean o1() {
        Z z10;
        C3573h c3573h = this.f5039e;
        if (c3573h == null || (z10 = (Z) c3573h.B()) == null) {
            return false;
        }
        z10.run();
        return true;
    }

    public abstract void shutdown();

    public boolean t1() {
        return false;
    }

    public final void y0(boolean z10) {
        long A02 = this.f5037c - A0(z10);
        this.f5037c = A02;
        if (A02 <= 0 && this.f5038d) {
            shutdown();
        }
    }
}
