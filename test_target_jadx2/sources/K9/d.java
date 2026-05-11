package K9;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f5483a;

    /* renamed from: b, reason: collision with root package name */
    private final double f5484b;

    /* renamed from: c, reason: collision with root package name */
    private final double f5485c;

    /* renamed from: d, reason: collision with root package name */
    private final double f5486d;

    /* renamed from: e, reason: collision with root package name */
    private final double f5487e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5488f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5489g;

    public d(int i10, double d10, double d11, double d12, double d13, int i11, int i12) {
        this.f5483a = i10;
        this.f5484b = d10;
        this.f5485c = d11;
        this.f5486d = d12;
        this.f5487e = d13;
        this.f5488f = i11;
        this.f5489g = i12;
    }

    public final int a() {
        return this.f5489g;
    }

    public final double b() {
        return this.f5486d;
    }

    public final double c() {
        return this.f5487e;
    }

    public final int d() {
        return this.f5488f;
    }

    public final double e() {
        return this.f5484b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f5483a == dVar.f5483a && Double.compare(this.f5484b, dVar.f5484b) == 0 && Double.compare(this.f5485c, dVar.f5485c) == 0 && Double.compare(this.f5486d, dVar.f5486d) == 0 && Double.compare(this.f5487e, dVar.f5487e) == 0 && this.f5488f == dVar.f5488f && this.f5489g == dVar.f5489g;
    }

    public final double f() {
        return this.f5485c;
    }

    public final int g() {
        return this.f5483a;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f5483a) * 31) + Double.hashCode(this.f5484b)) * 31) + Double.hashCode(this.f5485c)) * 31) + Double.hashCode(this.f5486d)) * 31) + Double.hashCode(this.f5487e)) * 31) + Integer.hashCode(this.f5488f)) * 31) + Integer.hashCode(this.f5489g);
    }

    public String toString() {
        return "FocusedInputSelectionChangedEventData(target=" + this.f5483a + ", startX=" + this.f5484b + ", startY=" + this.f5485c + ", endX=" + this.f5486d + ", endY=" + this.f5487e + ", start=" + this.f5488f + ", end=" + this.f5489g + ")";
    }
}
