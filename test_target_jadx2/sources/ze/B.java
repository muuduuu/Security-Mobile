package ze;

/* loaded from: classes3.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    private final String f45863a;

    /* renamed from: b, reason: collision with root package name */
    private final int f45864b;

    /* renamed from: c, reason: collision with root package name */
    private final String f45865c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f45866d;

    /* renamed from: e, reason: collision with root package name */
    private final String f45867e;

    public B(String str, int i10, String str2, boolean z10) {
        this.f45863a = str;
        this.f45864b = i10;
        String str3 = "&" + str + ";";
        if (str2 != null) {
            this.f45865c = str2;
        } else {
            this.f45865c = str3;
        }
        if (z10) {
            this.f45867e = String.valueOf((char) i10);
        } else {
            this.f45867e = str3;
        }
        this.f45866d = z10;
    }

    public String a() {
        return "&#" + this.f45864b + ";";
    }

    public String b(boolean z10) {
        return z10 ? f() : d();
    }

    public String c() {
        return "&" + this.f45863a + ";";
    }

    public String d() {
        return this.f45867e;
    }

    public String e() {
        return "&#x" + Integer.toHexString(this.f45864b) + ";";
    }

    public String f() {
        return this.f45865c;
    }

    public String g() {
        return this.f45863a;
    }

    public int h() {
        return this.f45864b;
    }

    public boolean i() {
        return this.f45866d;
    }
}
