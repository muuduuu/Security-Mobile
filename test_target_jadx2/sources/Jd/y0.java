package Jd;

/* loaded from: classes3.dex */
public class y0 extends C0 implements InterfaceC0919z {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5073c;

    public y0(InterfaceC0915w0 interfaceC0915w0) {
        super(true);
        q0(interfaceC0915w0);
        this.f5073c = R0();
    }

    private final boolean R0() {
        C0 v10;
        InterfaceC0908t k02 = k0();
        C0910u c0910u = k02 instanceof C0910u ? (C0910u) k02 : null;
        if (c0910u != null && (v10 = c0910u.v()) != null) {
            while (!v10.g0()) {
                InterfaceC0908t k03 = v10.k0();
                C0910u c0910u2 = k03 instanceof C0910u ? (C0910u) k03 : null;
                if (c0910u2 != null && (v10 = c0910u2.v()) != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // Jd.C0
    public boolean g0() {
        return this.f5073c;
    }

    @Override // Jd.C0
    public boolean h0() {
        return true;
    }
}
