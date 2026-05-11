package Jd;

/* renamed from: Jd.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0910u extends B0 implements InterfaceC0908t {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0912v f5066e;

    public C0910u(InterfaceC0912v interfaceC0912v) {
        this.f5066e = interfaceC0912v;
    }

    @Override // Jd.InterfaceC0908t
    public boolean c(Throwable th) {
        return v().Y(th);
    }

    @Override // Jd.InterfaceC0908t
    public InterfaceC0915w0 getParent() {
        return v();
    }

    @Override // Jd.B0
    public boolean w() {
        return true;
    }

    @Override // Jd.B0
    public void x(Throwable th) {
        this.f5066e.x(v());
    }
}
