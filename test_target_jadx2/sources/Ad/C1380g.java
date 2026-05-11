package ad;

import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.AbstractC5215q;
import yd.AbstractC5222y;
import yd.C5198F;
import yd.J;
import yd.M;
import yd.a0;
import yd.q0;
import yd.s0;
import yd.t0;

/* renamed from: ad.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1380g extends AbstractC5215q implements J {

    /* renamed from: b, reason: collision with root package name */
    private final M f12674b;

    public C1380g(M delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f12674b = delegate;
    }

    private final M i1(M m10) {
        M a12 = m10.a1(false);
        return !Bd.a.t(m10) ? a12 : new C1380g(a12);
    }

    @Override // yd.InterfaceC5211m
    public AbstractC5197E D(AbstractC5197E replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        t0 Z02 = replacement.Z0();
        if (!Bd.a.t(Z02) && !q0.l(Z02)) {
            return Z02;
        }
        if (Z02 instanceof M) {
            return i1((M) Z02);
        }
        if (Z02 instanceof AbstractC5222y) {
            AbstractC5222y abstractC5222y = (AbstractC5222y) Z02;
            return s0.d(C5198F.d(i1(abstractC5222y.e1()), i1(abstractC5222y.f1())), s0.a(Z02));
        }
        throw new IllegalStateException(("Incorrect type: " + Z02).toString());
    }

    @Override // yd.InterfaceC5211m
    public boolean I0() {
        return true;
    }

    @Override // yd.AbstractC5215q, yd.AbstractC5197E
    public boolean X0() {
        return false;
    }

    @Override // yd.t0
    /* renamed from: d1 */
    public M a1(boolean z10) {
        return z10 ? f1().a1(true) : this;
    }

    @Override // yd.AbstractC5215q
    protected M f1() {
        return this.f12674b;
    }

    @Override // yd.M
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public C1380g c1(a0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new C1380g(f1().c1(newAttributes));
    }

    @Override // yd.AbstractC5215q
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public C1380g h1(M delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new C1380g(delegate);
    }
}
