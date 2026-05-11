package I8;

/* loaded from: classes2.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f4356a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4357b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f4356a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f4357b = str2;
    }

    @Override // I8.f
    public String b() {
        return this.f4356a;
    }

    @Override // I8.f
    public String c() {
        return this.f4357b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f4356a.equals(fVar.b()) && this.f4357b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f4356a.hashCode() ^ 1000003) * 1000003) ^ this.f4357b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f4356a + ", version=" + this.f4357b + "}";
    }
}
