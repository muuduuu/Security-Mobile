package b8;

/* renamed from: b8.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1661h extends k {

    /* renamed from: a, reason: collision with root package name */
    private Integer f18874a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f18875b;

    C1661h() {
    }

    @Override // b8.k
    final k a(int i10) {
        this.f18874a = Integer.valueOf(i10);
        return this;
    }

    @Override // b8.k
    final k b(int i10) {
        this.f18875b = Integer.valueOf(i10);
        return this;
    }

    @Override // b8.k
    final AbstractC1656c c() {
        Integer num = this.f18874a;
        if (num != null && this.f18875b != null) {
            return new i(num.intValue(), this.f18875b.intValue(), null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f18874a == null) {
            sb2.append(" imageFormat");
        }
        if (this.f18875b == null) {
            sb2.append(" storageType");
        }
        String valueOf = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(valueOf);
        throw new IllegalStateException(sb3.toString());
    }
}
