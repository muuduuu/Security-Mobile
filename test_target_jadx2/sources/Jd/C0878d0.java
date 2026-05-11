package Jd;

/* renamed from: Jd.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0878d0 implements InterfaceC0893l {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0876c0 f5027a;

    public C0878d0(InterfaceC0876c0 interfaceC0876c0) {
        this.f5027a = interfaceC0876c0;
    }

    @Override // Jd.InterfaceC0893l
    public void a(Throwable th) {
        this.f5027a.a();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f5027a + ']';
    }
}
