package O9;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final double f7108a;

    /* renamed from: b, reason: collision with root package name */
    private final double f7109b;

    public a(double d10, double d11) {
        this.f7108a = d10;
        this.f7109b = d11;
    }

    public final double a() {
        return this.f7109b;
    }

    public final double b() {
        return this.f7108a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Double.compare(this.f7108a, aVar.f7108a) == 0 && Double.compare(this.f7109b, aVar.f7109b) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.f7108a) * 31) + Double.hashCode(this.f7109b);
    }

    public String toString() {
        return "Dimensions(width=" + this.f7108a + ", height=" + this.f7109b + ")";
    }
}
