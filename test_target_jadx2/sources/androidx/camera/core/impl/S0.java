package androidx.camera.core.impl;

/* loaded from: classes.dex */
public class S0 extends AbstractC1445k0 {

    /* renamed from: c, reason: collision with root package name */
    private final D f14452c;

    public S0(D d10, X0 x02) {
        super(d10);
        this.f14452c = d10;
    }

    @Override // androidx.camera.core.impl.AbstractC1445k0, A.InterfaceC0705k
    public h8.d d() {
        return this.f14452c.d();
    }

    @Override // androidx.camera.core.impl.AbstractC1445k0, A.InterfaceC0705k
    public h8.d f(float f10) {
        return !E.p.b(null, 0) ? G.n.n(new IllegalStateException("Zoom is not supported")) : this.f14452c.f(f10);
    }

    @Override // androidx.camera.core.impl.AbstractC1445k0, A.InterfaceC0705k
    public h8.d i(boolean z10) {
        return !E.p.b(null, 6) ? G.n.n(new IllegalStateException("Torch is not supported")) : this.f14452c.i(z10);
    }

    @Override // androidx.camera.core.impl.AbstractC1445k0, A.InterfaceC0705k
    public h8.d l(A.D d10) {
        A.D a10 = E.p.a(null, d10);
        return a10 == null ? G.n.n(new IllegalStateException("FocusMetering is not supported")) : this.f14452c.l(a10);
    }
}
