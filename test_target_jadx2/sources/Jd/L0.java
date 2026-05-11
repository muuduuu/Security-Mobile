package Jd;

import lc.o;

/* loaded from: classes3.dex */
final class L0 extends B0 {

    /* renamed from: e, reason: collision with root package name */
    private final C0899o f5002e;

    public L0(C0899o c0899o) {
        this.f5002e = c0899o;
    }

    @Override // Jd.B0
    public boolean w() {
        return false;
    }

    @Override // Jd.B0
    public void x(Throwable th) {
        Object l02 = v().l0();
        if (l02 instanceof B) {
            C0899o c0899o = this.f5002e;
            o.a aVar = lc.o.f37128b;
            c0899o.resumeWith(lc.o.b(lc.p.a(((B) l02).f4974a)));
        } else {
            C0899o c0899o2 = this.f5002e;
            o.a aVar2 = lc.o.f37128b;
            c0899o2.resumeWith(lc.o.b(D0.h(l02)));
        }
    }
}
