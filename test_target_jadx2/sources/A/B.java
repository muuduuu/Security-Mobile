package A;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: c, reason: collision with root package name */
    public static final B f6c = new B(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final B f7d = new B(1, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final B f8e = new B(2, 10);

    /* renamed from: f, reason: collision with root package name */
    public static final B f9f = new B(3, 10);

    /* renamed from: g, reason: collision with root package name */
    public static final B f10g = new B(4, 10);

    /* renamed from: h, reason: collision with root package name */
    public static final B f11h = new B(5, 10);

    /* renamed from: i, reason: collision with root package name */
    public static final B f12i = new B(6, 10);

    /* renamed from: j, reason: collision with root package name */
    public static final B f13j = new B(6, 8);

    /* renamed from: a, reason: collision with root package name */
    private final int f14a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15b;

    public B(int i10, int i11) {
        this.f14a = i10;
        this.f15b = i11;
    }

    private static String c(int i10) {
        switch (i10) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public int a() {
        return this.f15b;
    }

    public int b() {
        return this.f14a;
    }

    public boolean d() {
        return e() && b() != 1 && a() == 10;
    }

    public boolean e() {
        return (b() == 0 || b() == 2 || a() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return this.f14a == b10.b() && this.f15b == b10.a();
    }

    public int hashCode() {
        return ((this.f14a ^ 1000003) * 1000003) ^ this.f15b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.f14a) + ", bitDepth=" + this.f15b + "}";
    }
}
