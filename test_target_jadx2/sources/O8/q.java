package o8;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final C3762D f38022a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38023b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38024c;

    private q(Class cls, int i10, int i11) {
        this(C3762D.b(cls), i10, i11);
    }

    private static String a(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static q g(Class cls) {
        return new q(cls, 0, 0);
    }

    public static q h(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q i(C3762D c3762d) {
        return new q(c3762d, 0, 1);
    }

    public static q j(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q k(C3762D c3762d) {
        return new q(c3762d, 1, 0);
    }

    public static q l(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q m(Class cls) {
        return new q(cls, 2, 0);
    }

    public C3762D b() {
        return this.f38022a;
    }

    public boolean c() {
        return this.f38024c == 2;
    }

    public boolean d() {
        return this.f38024c == 0;
    }

    public boolean e() {
        return this.f38023b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f38022a.equals(qVar.f38022a) && this.f38023b == qVar.f38023b && this.f38024c == qVar.f38024c;
    }

    public boolean f() {
        return this.f38023b == 2;
    }

    public int hashCode() {
        return ((((this.f38022a.hashCode() ^ 1000003) * 1000003) ^ this.f38023b) * 1000003) ^ this.f38024c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f38022a);
        sb2.append(", type=");
        int i10 = this.f38023b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(a(this.f38024c));
        sb2.append("}");
        return sb2.toString();
    }

    private q(C3762D c3762d, int i10, int i11) {
        this.f38022a = (C3762D) AbstractC3761C.c(c3762d, "Null dependency anInterface.");
        this.f38023b = i10;
        this.f38024c = i11;
    }
}
