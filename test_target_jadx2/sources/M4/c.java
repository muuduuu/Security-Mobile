package m4;

import a4.C1349a;
import a4.f;
import a4.g;
import android.net.Uri;
import b4.l;
import i4.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import m4.b;

/* loaded from: classes.dex */
public class c {

    /* renamed from: s, reason: collision with root package name */
    private static final Set f37359s = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    private e f37373n;

    /* renamed from: q, reason: collision with root package name */
    private int f37376q;

    /* renamed from: a, reason: collision with root package name */
    private Uri f37360a = null;

    /* renamed from: b, reason: collision with root package name */
    private b.c f37361b = b.c.FULL_FETCH;

    /* renamed from: c, reason: collision with root package name */
    private int f37362c = 0;

    /* renamed from: d, reason: collision with root package name */
    private f f37363d = null;

    /* renamed from: e, reason: collision with root package name */
    private g f37364e = null;

    /* renamed from: f, reason: collision with root package name */
    private a4.c f37365f = a4.c.a();

    /* renamed from: g, reason: collision with root package name */
    private b.EnumC0557b f37366g = b.EnumC0557b.DEFAULT;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37367h = l.J().a();

    /* renamed from: i, reason: collision with root package name */
    private boolean f37368i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f37369j = false;

    /* renamed from: k, reason: collision with root package name */
    private a4.e f37370k = a4.e.HIGH;

    /* renamed from: l, reason: collision with root package name */
    private d f37371l = null;

    /* renamed from: m, reason: collision with root package name */
    private Boolean f37372m = null;

    /* renamed from: o, reason: collision with root package name */
    private C1349a f37374o = null;

    /* renamed from: p, reason: collision with root package name */
    private Boolean f37375p = null;

    /* renamed from: r, reason: collision with root package name */
    private String f37377r = null;

    public static class a extends RuntimeException {
        public a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private c() {
    }

    private c A(int i10) {
        this.f37362c = i10;
        if (this.f37366g != b.EnumC0557b.DYNAMIC) {
            this.f37377r = null;
        }
        return this;
    }

    public static c b(b bVar) {
        return w(bVar.u()).D(bVar.g()).y(bVar.b()).z(bVar.c()).F(bVar.i()).E(bVar.h()).G(bVar.j()).A(bVar.d()).H(bVar.k()).I(bVar.o()).K(bVar.n()).L(bVar.q()).J(bVar.p()).M(bVar.s()).N(bVar.y()).B(bVar.e()).C(bVar.f());
    }

    public static boolean r(Uri uri) {
        Set set = f37359s;
        if (set != null && uri != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static c w(Uri uri) {
        return new c().O(uri);
    }

    public c B(int i10) {
        this.f37376q = i10;
        return this;
    }

    public c C(String str) {
        this.f37377r = str;
        return this;
    }

    public c D(a4.c cVar) {
        this.f37365f = cVar;
        return this;
    }

    public c E(boolean z10) {
        this.f37369j = z10;
        return this;
    }

    public c F(boolean z10) {
        this.f37368i = z10;
        return this;
    }

    public c G(b.c cVar) {
        this.f37361b = cVar;
        return this;
    }

    public c H(d dVar) {
        this.f37371l = dVar;
        return this;
    }

    public c I(boolean z10) {
        this.f37367h = z10;
        return this;
    }

    public c J(e eVar) {
        this.f37373n = eVar;
        return this;
    }

    public c K(a4.e eVar) {
        this.f37370k = eVar;
        return this;
    }

    public c L(f fVar) {
        this.f37363d = fVar;
        return this;
    }

    public c M(g gVar) {
        this.f37364e = gVar;
        return this;
    }

    public c N(Boolean bool) {
        this.f37372m = bool;
        return this;
    }

    public c O(Uri uri) {
        b3.l.g(uri);
        this.f37360a = uri;
        return this;
    }

    public Boolean P() {
        return this.f37372m;
    }

    protected void Q() {
        Uri uri = this.f37360a;
        if (uri == null) {
            throw new a("Source must be set!");
        }
        if (j3.f.m(uri)) {
            if (!this.f37360a.isAbsolute()) {
                throw new a("Resource URI path must be absolute.");
            }
            if (this.f37360a.getPath().isEmpty()) {
                throw new a("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f37360a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new a("Resource URI path must be a resource id.");
            }
        }
        if (j3.f.h(this.f37360a) && !this.f37360a.isAbsolute()) {
            throw new a("Asset URI path must be absolute.");
        }
        if (this.f37366g == b.EnumC0557b.DYNAMIC) {
            if (this.f37377r == null) {
                throw new a("Disk cache id must be set for dynamic cache choice");
            }
        } else {
            String str = this.f37377r;
            if (str != null && str.length() != 0) {
                throw new a("Ensure that if you want to use a disk cache id, you set the CacheChoice to DYNAMIC");
            }
        }
    }

    public b a() {
        Q();
        return new b(this);
    }

    public C1349a c() {
        return this.f37374o;
    }

    public b.EnumC0557b d() {
        return this.f37366g;
    }

    public int e() {
        return this.f37362c;
    }

    public int f() {
        return this.f37376q;
    }

    public String g() {
        return this.f37377r;
    }

    public a4.c h() {
        return this.f37365f;
    }

    public boolean i() {
        return this.f37369j;
    }

    public b.c j() {
        return this.f37361b;
    }

    public d k() {
        return this.f37371l;
    }

    public e l() {
        return this.f37373n;
    }

    public a4.e m() {
        return this.f37370k;
    }

    public f n() {
        return this.f37363d;
    }

    public Boolean o() {
        return this.f37375p;
    }

    public g p() {
        return this.f37364e;
    }

    public Uri q() {
        return this.f37360a;
    }

    public boolean s() {
        return (this.f37362c & 48) == 0 && (j3.f.n(this.f37360a) || r(this.f37360a));
    }

    public boolean t() {
        return this.f37368i;
    }

    public boolean u() {
        return (this.f37362c & 15) == 0;
    }

    public boolean v() {
        return this.f37367h;
    }

    public c x(boolean z10) {
        return z10 ? M(g.c()) : M(g.e());
    }

    public c y(C1349a c1349a) {
        this.f37374o = c1349a;
        return this;
    }

    public c z(b.EnumC0557b enumC0557b) {
        this.f37366g = enumC0557b;
        return this;
    }
}
