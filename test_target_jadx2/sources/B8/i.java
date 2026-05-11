package b8;

/* loaded from: classes2.dex */
final class i extends AbstractC1656c {

    /* renamed from: a, reason: collision with root package name */
    private final int f18876a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18877b;

    /* synthetic */ i(int i10, int i11, AbstractC1660g abstractC1660g) {
        this.f18876a = i10;
        this.f18877b = i11;
    }

    @Override // b8.AbstractC1656c
    public final int a() {
        return this.f18876a;
    }

    @Override // b8.AbstractC1656c
    public final int b() {
        return this.f18877b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1656c) {
            AbstractC1656c abstractC1656c = (AbstractC1656c) obj;
            if (this.f18876a == abstractC1656c.a() && this.f18877b == abstractC1656c.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18876a ^ 1000003) * 1000003) ^ this.f18877b;
    }

    public final String toString() {
        int i10 = this.f18876a;
        int i11 = this.f18877b;
        StringBuilder sb2 = new StringBuilder(65);
        sb2.append("ImageProperties{imageFormat=");
        sb2.append(i10);
        sb2.append(", storageType=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }
}
