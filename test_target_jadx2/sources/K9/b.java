package K9;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final double f5473a;

    /* renamed from: b, reason: collision with root package name */
    private final double f5474b;

    /* renamed from: c, reason: collision with root package name */
    private final double f5475c;

    /* renamed from: d, reason: collision with root package name */
    private final double f5476d;

    /* renamed from: e, reason: collision with root package name */
    private final double f5477e;

    /* renamed from: f, reason: collision with root package name */
    private final double f5478f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5479g;

    /* renamed from: h, reason: collision with root package name */
    private final int f5480h;

    public b(double d10, double d11, double d12, double d13, double d14, double d15, int i10, int i11) {
        this.f5473a = d10;
        this.f5474b = d11;
        this.f5475c = d12;
        this.f5476d = d13;
        this.f5477e = d14;
        this.f5478f = d15;
        this.f5479g = i10;
        this.f5480h = i11;
    }

    public final double a() {
        return this.f5477e;
    }

    public final double b() {
        return this.f5478f;
    }

    public final double c() {
        return this.f5476d;
    }

    public final int d() {
        return this.f5480h;
    }

    public final int e() {
        return this.f5479g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Double.compare(this.f5473a, bVar.f5473a) == 0 && Double.compare(this.f5474b, bVar.f5474b) == 0 && Double.compare(this.f5475c, bVar.f5475c) == 0 && Double.compare(this.f5476d, bVar.f5476d) == 0 && Double.compare(this.f5477e, bVar.f5477e) == 0 && Double.compare(this.f5478f, bVar.f5478f) == 0 && this.f5479g == bVar.f5479g && this.f5480h == bVar.f5480h;
    }

    public final double f() {
        return this.f5475c;
    }

    public final double g() {
        return this.f5473a;
    }

    public final double h() {
        return this.f5474b;
    }

    public int hashCode() {
        return (((((((((((((Double.hashCode(this.f5473a) * 31) + Double.hashCode(this.f5474b)) * 31) + Double.hashCode(this.f5475c)) * 31) + Double.hashCode(this.f5476d)) * 31) + Double.hashCode(this.f5477e)) * 31) + Double.hashCode(this.f5478f)) * 31) + Integer.hashCode(this.f5479g)) * 31) + Integer.hashCode(this.f5480h);
    }

    public String toString() {
        return "FocusedInputLayoutChangedEventData(x=" + this.f5473a + ", y=" + this.f5474b + ", width=" + this.f5475c + ", height=" + this.f5476d + ", absoluteX=" + this.f5477e + ", absoluteY=" + this.f5478f + ", target=" + this.f5479g + ", parentScrollViewTarget=" + this.f5480h + ")";
    }
}
