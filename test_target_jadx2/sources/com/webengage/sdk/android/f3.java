package com.webengage.sdk.android;

/* loaded from: classes2.dex */
public class f3 {

    /* renamed from: a, reason: collision with root package name */
    private final u0 f30535a;

    /* renamed from: b, reason: collision with root package name */
    private final e f30536b;

    /* renamed from: c, reason: collision with root package name */
    private final j3 f30537c;

    /* renamed from: d, reason: collision with root package name */
    private final d f30538d;

    /* renamed from: e, reason: collision with root package name */
    private final c f30539e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f30540f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f30541g;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f30542h;

    /* renamed from: i, reason: collision with root package name */
    private final b f30543i;

    /* renamed from: j, reason: collision with root package name */
    private final a f30544j;

    /* renamed from: k, reason: collision with root package name */
    private final j3 f30545k;

    /* renamed from: l, reason: collision with root package name */
    private final j3 f30546l;

    /* renamed from: m, reason: collision with root package name */
    private final j3 f30547m;

    /* renamed from: n, reason: collision with root package name */
    private final j3 f30548n;

    /* renamed from: o, reason: collision with root package name */
    private final j3 f30549o;

    /* renamed from: p, reason: collision with root package name */
    private final j3 f30550p;

    /* renamed from: q, reason: collision with root package name */
    private final j3 f30551q;

    /* renamed from: r, reason: collision with root package name */
    private final f f30552r;

    public enum a {
        SOLID,
        DASHED,
        DOTTED,
        DOUBLE
    }

    public enum b {
        BLOCK,
        INLINE
    }

    public enum c {
        NORMAL,
        ITALIC
    }

    public enum d {
        NORMAL,
        BOLD
    }

    public enum e {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum f {
        UNDERLINE,
        LINETHROUGH
    }

    public f3() {
        this.f30535a = null;
        this.f30536b = null;
        this.f30537c = null;
        this.f30538d = null;
        this.f30539e = null;
        this.f30540f = null;
        this.f30541g = null;
        this.f30543i = null;
        this.f30548n = null;
        this.f30546l = null;
        this.f30547m = null;
        this.f30549o = null;
        this.f30550p = null;
        this.f30542h = null;
        this.f30544j = null;
        this.f30545k = null;
        this.f30551q = null;
        this.f30552r = null;
    }

    public f3 a(a aVar) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, this.f30538d, this.f30539e, this.f30540f, this.f30541g, this.f30543i, this.f30547m, this.f30548n, this.f30549o, this.f30550p, this.f30546l, this.f30542h, aVar, this.f30545k, this.f30551q, this.f30552r);
    }

    public f3 b(j3 j3Var) {
        return new f3(this.f30535a, this.f30536b, j3Var, this.f30538d, this.f30539e, this.f30540f, this.f30541g, this.f30543i, this.f30547m, this.f30548n, this.f30549o, this.f30550p, this.f30546l, this.f30542h, this.f30544j, this.f30545k, this.f30551q, this.f30552r);
    }

    public a c() {
        return this.f30544j;
    }

    public f3 d(j3 j3Var) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, this.f30538d, this.f30539e, this.f30540f, this.f30541g, this.f30543i, this.f30547m, j3Var, this.f30549o, this.f30550p, this.f30546l, this.f30542h, this.f30544j, this.f30545k, this.f30551q, this.f30552r);
    }

    public f3 e(j3 j3Var) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, this.f30538d, this.f30539e, this.f30540f, this.f30541g, this.f30543i, this.f30547m, this.f30548n, j3Var, this.f30550p, this.f30546l, this.f30542h, this.f30544j, this.f30545k, this.f30551q, this.f30552r);
    }

    public b f() {
        return this.f30543i;
    }

    public f3 g(j3 j3Var) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, this.f30538d, this.f30539e, this.f30540f, this.f30541g, this.f30543i, j3Var, this.f30548n, this.f30549o, this.f30550p, this.f30546l, this.f30542h, this.f30544j, this.f30545k, this.f30551q, this.f30552r);
    }

    public f3 h(j3 j3Var) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, this.f30538d, this.f30539e, this.f30540f, this.f30541g, this.f30543i, this.f30547m, this.f30548n, this.f30549o, this.f30550p, j3Var, this.f30542h, this.f30544j, this.f30545k, this.f30551q, this.f30552r);
    }

    public c i() {
        return this.f30539e;
    }

    public d j() {
        return this.f30538d;
    }

    public j3 k() {
        return this.f30551q;
    }

    public j3 l() {
        return this.f30548n;
    }

    public j3 m() {
        return this.f30549o;
    }

    public j3 n() {
        return this.f30547m;
    }

    public e o() {
        return this.f30536b;
    }

    public f p() {
        return this.f30552r;
    }

    public j3 q() {
        return this.f30546l;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\n");
        if (this.f30535a != null) {
            sb2.append("  font-family: ");
            sb2.append(this.f30535a.e());
            sb2.append("\n");
        }
        if (this.f30536b != null) {
            sb2.append("  text-alignment: ");
            sb2.append(this.f30536b);
            sb2.append("\n");
        }
        if (this.f30537c != null) {
            sb2.append("  font-size: ");
            sb2.append(this.f30537c);
            sb2.append("\n");
        }
        if (this.f30538d != null) {
            sb2.append("  font-weight: ");
            sb2.append(this.f30538d);
            sb2.append("\n");
        }
        if (this.f30539e != null) {
            sb2.append("  font-style: " + this.f30539e + "\n");
        }
        if (this.f30540f != null) {
            sb2.append("  color: " + this.f30540f + "\n");
        }
        if (this.f30541g != null) {
            sb2.append("  background-color: " + this.f30541g + "\n");
        }
        if (this.f30543i != null) {
            sb2.append("  display: " + this.f30543i + "\n");
        }
        if (this.f30547m != null) {
            sb2.append("  margin-top: " + this.f30547m + "\n");
        }
        if (this.f30548n != null) {
            sb2.append("  margin-bottom: " + this.f30548n + "\n");
        }
        if (this.f30549o != null) {
            sb2.append("  margin-left: " + this.f30549o + "\n");
        }
        if (this.f30550p != null) {
            sb2.append("  margin-right: " + this.f30550p + "\n");
        }
        if (this.f30546l != null) {
            sb2.append("  text-indent: " + this.f30546l + "\n");
        }
        if (this.f30544j != null) {
            sb2.append("  border-style: " + this.f30544j + "\n");
        }
        if (this.f30542h != null) {
            sb2.append("  border-color: " + this.f30542h + "\n");
        }
        if (this.f30545k != null) {
            sb2.append("  border-style: " + this.f30545k + "\n");
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    public f3(u0 u0Var, e eVar, j3 j3Var, d dVar, c cVar, Integer num, Integer num2, b bVar, j3 j3Var2, j3 j3Var3, j3 j3Var4, j3 j3Var5, j3 j3Var6, Integer num3, a aVar, j3 j3Var7, j3 j3Var8, f fVar) {
        this.f30535a = u0Var;
        this.f30536b = eVar;
        this.f30537c = j3Var;
        this.f30538d = dVar;
        this.f30539e = cVar;
        this.f30540f = num;
        this.f30541g = num2;
        this.f30543i = bVar;
        this.f30548n = j3Var3;
        this.f30546l = j3Var6;
        this.f30547m = j3Var2;
        this.f30549o = j3Var4;
        this.f30550p = j3Var5;
        this.f30542h = num3;
        this.f30545k = j3Var7;
        this.f30544j = aVar;
        this.f30551q = j3Var8;
        this.f30552r = fVar;
    }

    public f3 a(b bVar) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, this.f30538d, this.f30539e, this.f30540f, this.f30541g, bVar, this.f30547m, this.f30548n, this.f30549o, this.f30550p, this.f30546l, this.f30542h, this.f30544j, this.f30545k, this.f30551q, this.f30552r);
    }

    public f3 b(Integer num) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, this.f30538d, this.f30539e, this.f30540f, this.f30541g, this.f30543i, this.f30547m, this.f30548n, this.f30549o, this.f30550p, this.f30546l, num, this.f30544j, this.f30545k, this.f30551q, this.f30552r);
    }

    public f3 c(j3 j3Var) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, this.f30538d, this.f30539e, this.f30540f, this.f30541g, this.f30543i, this.f30547m, this.f30548n, this.f30549o, this.f30550p, this.f30546l, this.f30542h, this.f30544j, this.f30545k, j3Var, this.f30552r);
    }

    public j3 d() {
        return this.f30545k;
    }

    public Integer e() {
        return this.f30540f;
    }

    public f3 f(j3 j3Var) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, this.f30538d, this.f30539e, this.f30540f, this.f30541g, this.f30543i, this.f30547m, this.f30548n, this.f30549o, j3Var, this.f30546l, this.f30542h, this.f30544j, this.f30545k, this.f30551q, this.f30552r);
    }

    public u0 g() {
        return this.f30535a;
    }

    public j3 h() {
        return this.f30537c;
    }

    public f3 a(c cVar) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, this.f30538d, cVar, this.f30540f, this.f30541g, this.f30543i, this.f30547m, this.f30548n, this.f30549o, this.f30550p, this.f30546l, this.f30542h, this.f30544j, this.f30545k, this.f30551q, this.f30552r);
    }

    public Integer b() {
        return this.f30542h;
    }

    public f3 c(Integer num) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, this.f30538d, this.f30539e, num, this.f30541g, this.f30543i, this.f30547m, this.f30548n, this.f30549o, this.f30550p, this.f30546l, this.f30542h, this.f30544j, this.f30545k, this.f30551q, this.f30552r);
    }

    public f3 a(d dVar) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, dVar, this.f30539e, this.f30540f, this.f30541g, this.f30543i, this.f30547m, this.f30548n, this.f30549o, this.f30550p, this.f30546l, this.f30542h, this.f30544j, this.f30545k, this.f30551q, this.f30552r);
    }

    public f3 a(e eVar) {
        return new f3(this.f30535a, eVar, this.f30537c, this.f30538d, this.f30539e, this.f30540f, this.f30541g, this.f30543i, this.f30547m, this.f30548n, this.f30549o, this.f30550p, this.f30546l, this.f30542h, this.f30544j, this.f30545k, this.f30551q, this.f30552r);
    }

    public f3 a(f fVar) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, this.f30538d, this.f30539e, this.f30540f, this.f30541g, this.f30543i, this.f30547m, this.f30548n, this.f30549o, this.f30550p, this.f30546l, this.f30542h, this.f30544j, this.f30545k, this.f30551q, fVar);
    }

    public f3 a(j3 j3Var) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, this.f30538d, this.f30539e, this.f30540f, this.f30541g, this.f30543i, this.f30547m, this.f30548n, this.f30549o, this.f30550p, this.f30546l, this.f30542h, this.f30544j, j3Var, this.f30551q, this.f30552r);
    }

    public f3 a(u0 u0Var) {
        return new f3(u0Var, this.f30536b, this.f30537c, this.f30538d, this.f30539e, this.f30540f, this.f30541g, this.f30543i, this.f30547m, this.f30548n, this.f30549o, this.f30550p, this.f30546l, this.f30542h, this.f30544j, this.f30545k, this.f30551q, this.f30552r);
    }

    public f3 a(Integer num) {
        return new f3(this.f30535a, this.f30536b, this.f30537c, this.f30538d, this.f30539e, this.f30540f, num, this.f30543i, this.f30547m, this.f30548n, this.f30549o, this.f30550p, this.f30546l, this.f30542h, this.f30544j, this.f30545k, this.f30551q, this.f30552r);
    }

    public Integer a() {
        return this.f30541g;
    }
}
