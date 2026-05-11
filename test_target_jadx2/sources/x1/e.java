package X1;

import O1.C1038i;
import V1.j;
import V1.k;
import V1.n;
import Z1.C1319j;
import java.util.List;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final List f11672a;

    /* renamed from: b, reason: collision with root package name */
    private final C1038i f11673b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11674c;

    /* renamed from: d, reason: collision with root package name */
    private final long f11675d;

    /* renamed from: e, reason: collision with root package name */
    private final a f11676e;

    /* renamed from: f, reason: collision with root package name */
    private final long f11677f;

    /* renamed from: g, reason: collision with root package name */
    private final String f11678g;

    /* renamed from: h, reason: collision with root package name */
    private final List f11679h;

    /* renamed from: i, reason: collision with root package name */
    private final n f11680i;

    /* renamed from: j, reason: collision with root package name */
    private final int f11681j;

    /* renamed from: k, reason: collision with root package name */
    private final int f11682k;

    /* renamed from: l, reason: collision with root package name */
    private final int f11683l;

    /* renamed from: m, reason: collision with root package name */
    private final float f11684m;

    /* renamed from: n, reason: collision with root package name */
    private final float f11685n;

    /* renamed from: o, reason: collision with root package name */
    private final float f11686o;

    /* renamed from: p, reason: collision with root package name */
    private final float f11687p;

    /* renamed from: q, reason: collision with root package name */
    private final j f11688q;

    /* renamed from: r, reason: collision with root package name */
    private final k f11689r;

    /* renamed from: s, reason: collision with root package name */
    private final V1.b f11690s;

    /* renamed from: t, reason: collision with root package name */
    private final List f11691t;

    /* renamed from: u, reason: collision with root package name */
    private final b f11692u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f11693v;

    /* renamed from: w, reason: collision with root package name */
    private final W1.a f11694w;

    /* renamed from: x, reason: collision with root package name */
    private final C1319j f11695x;

    /* renamed from: y, reason: collision with root package name */
    private final W1.h f11696y;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List list, C1038i c1038i, String str, long j10, a aVar, long j11, String str2, List list2, n nVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, j jVar, k kVar, List list3, b bVar, V1.b bVar2, boolean z10, W1.a aVar2, C1319j c1319j, W1.h hVar) {
        this.f11672a = list;
        this.f11673b = c1038i;
        this.f11674c = str;
        this.f11675d = j10;
        this.f11676e = aVar;
        this.f11677f = j11;
        this.f11678g = str2;
        this.f11679h = list2;
        this.f11680i = nVar;
        this.f11681j = i10;
        this.f11682k = i11;
        this.f11683l = i12;
        this.f11684m = f10;
        this.f11685n = f11;
        this.f11686o = f12;
        this.f11687p = f13;
        this.f11688q = jVar;
        this.f11689r = kVar;
        this.f11691t = list3;
        this.f11692u = bVar;
        this.f11690s = bVar2;
        this.f11693v = z10;
        this.f11694w = aVar2;
        this.f11695x = c1319j;
        this.f11696y = hVar;
    }

    public W1.h a() {
        return this.f11696y;
    }

    public W1.a b() {
        return this.f11694w;
    }

    C1038i c() {
        return this.f11673b;
    }

    public C1319j d() {
        return this.f11695x;
    }

    public long e() {
        return this.f11675d;
    }

    List f() {
        return this.f11691t;
    }

    public a g() {
        return this.f11676e;
    }

    List h() {
        return this.f11679h;
    }

    b i() {
        return this.f11692u;
    }

    public String j() {
        return this.f11674c;
    }

    long k() {
        return this.f11677f;
    }

    float l() {
        return this.f11687p;
    }

    float m() {
        return this.f11686o;
    }

    public String n() {
        return this.f11678g;
    }

    List o() {
        return this.f11672a;
    }

    int p() {
        return this.f11683l;
    }

    int q() {
        return this.f11682k;
    }

    int r() {
        return this.f11681j;
    }

    float s() {
        return this.f11685n / this.f11673b.e();
    }

    j t() {
        return this.f11688q;
    }

    public String toString() {
        return z(BuildConfig.FLAVOR);
    }

    k u() {
        return this.f11689r;
    }

    V1.b v() {
        return this.f11690s;
    }

    float w() {
        return this.f11684m;
    }

    n x() {
        return this.f11680i;
    }

    public boolean y() {
        return this.f11693v;
    }

    public String z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(j());
        sb2.append("\n");
        e t10 = this.f11673b.t(k());
        if (t10 != null) {
            sb2.append("\t\tParents: ");
            sb2.append(t10.j());
            e t11 = this.f11673b.t(t10.k());
            while (t11 != null) {
                sb2.append("->");
                sb2.append(t11.j());
                t11 = this.f11673b.t(t11.k());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!h().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(h().size());
            sb2.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.f11672a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (Object obj : this.f11672a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(obj);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
