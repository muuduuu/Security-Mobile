package Jd;

import pc.AbstractC3868b;

/* renamed from: Jd.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0916x extends C0 implements InterfaceC0914w {
    public C0916x(InterfaceC0915w0 interfaceC0915w0) {
        super(true);
        q0(interfaceC0915w0);
    }

    @Override // Jd.InterfaceC0914w
    public boolean F(Throwable th) {
        return u0(new B(th, false, 2, null));
    }

    @Override // Jd.InterfaceC0914w
    public boolean H(Object obj) {
        return u0(obj);
    }

    @Override // Jd.V
    public Object g() {
        return d0();
    }

    @Override // Jd.C0
    public boolean h0() {
        return true;
    }

    @Override // Jd.V
    public Object q(kotlin.coroutines.d dVar) {
        Object P10 = P(dVar);
        AbstractC3868b.e();
        return P10;
    }
}
