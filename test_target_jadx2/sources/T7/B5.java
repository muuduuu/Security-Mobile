package t7;

/* loaded from: classes2.dex */
final class B5 extends D5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f42439a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f42440b;

    /* renamed from: c, reason: collision with root package name */
    private final int f42441c;

    /* synthetic */ B5(String str, boolean z10, int i10, A5 a52) {
        this.f42439a = str;
        this.f42440b = z10;
        this.f42441c = i10;
    }

    @Override // t7.D5
    public final int a() {
        return this.f42441c;
    }

    @Override // t7.D5
    public final String b() {
        return this.f42439a;
    }

    @Override // t7.D5
    public final boolean c() {
        return this.f42440b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof D5) {
            D5 d52 = (D5) obj;
            if (this.f42439a.equals(d52.b()) && this.f42440b == d52.c() && this.f42441c == d52.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f42439a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f42440b ? 1237 : 1231)) * 1000003) ^ this.f42441c;
    }

    public final String toString() {
        String str = this.f42439a;
        boolean z10 = this.f42440b;
        int i10 = this.f42441c;
        StringBuilder sb2 = new StringBuilder(str.length() + 84);
        sb2.append("MLKitLoggingOptions{libraryName=");
        sb2.append(str);
        sb2.append(", enableFirelog=");
        sb2.append(z10);
        sb2.append(", firelogEventType=");
        sb2.append(i10);
        sb2.append("}");
        return sb2.toString();
    }
}
