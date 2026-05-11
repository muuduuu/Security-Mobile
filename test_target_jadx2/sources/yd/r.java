package yd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class r extends AbstractC5215q {

    /* renamed from: b, reason: collision with root package name */
    private final M f45564b;

    public r(M delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f45564b = delegate;
    }

    @Override // yd.t0
    /* renamed from: d1 */
    public M a1(boolean z10) {
        return z10 == X0() ? this : f1().a1(z10).c1(V0());
    }

    @Override // yd.t0
    /* renamed from: e1 */
    public M c1(a0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes != V0() ? new O(this, newAttributes) : this;
    }

    @Override // yd.AbstractC5215q
    protected M f1() {
        return this.f45564b;
    }
}
