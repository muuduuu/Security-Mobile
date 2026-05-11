package Jd;

/* renamed from: Jd.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0880e0 implements InterfaceC0905r0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5036a;

    public C0880e0(boolean z10) {
        this.f5036a = z10;
    }

    @Override // Jd.InterfaceC0905r0
    public boolean b() {
        return this.f5036a;
    }

    @Override // Jd.InterfaceC0905r0
    public H0 d() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(b() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
