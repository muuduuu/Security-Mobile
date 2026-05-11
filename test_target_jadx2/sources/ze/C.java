package ze;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

/* loaded from: classes3.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    private String f45868a;

    /* renamed from: b, reason: collision with root package name */
    private m f45869b;

    /* renamed from: i, reason: collision with root package name */
    private EnumC5279d f45876i;

    /* renamed from: o, reason: collision with root package name */
    private boolean f45882o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f45883p;

    /* renamed from: q, reason: collision with root package name */
    private j f45884q;

    /* renamed from: r, reason: collision with root package name */
    private n f45885r;

    /* renamed from: c, reason: collision with root package name */
    private Set f45870c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private Set f45871d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private Set f45872e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private Set f45873f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private Set f45874g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private Set f45875h = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private Set f45877j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private Set f45878k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    private String f45879l = null;

    /* renamed from: m, reason: collision with root package name */
    private String f45880m = null;

    /* renamed from: n, reason: collision with root package name */
    private String f45881n = null;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45886a;

        static {
            int[] iArr = new int[m.values().length];
            f45886a = iArr;
            try {
                iArr[m.all.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45886a[m.text.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45886a[m.none.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C(String str, m mVar, EnumC5279d enumC5279d, boolean z10, boolean z11, boolean z12, j jVar, n nVar) {
        this.f45876i = EnumC5279d.BODY;
        this.f45868a = str;
        this.f45869b = mVar;
        this.f45876i = enumC5279d;
        this.f45882o = z10;
        this.f45883p = z11;
        this.f45884q = jVar;
        this.f45885r = nVar;
    }

    boolean A(C c10) {
        if (c10 != null) {
            return this.f45870c.contains(c10.n()) || c10.f45869b == m.text;
        }
        return false;
    }

    public boolean B() {
        return this.f45883p;
    }

    public void C(String str) {
        this.f45880m = str;
    }

    public void D(String str) {
        this.f45881n = str;
    }

    public void E(String str) {
        this.f45879l = str;
    }

    boolean a() {
        return m.all == this.f45869b && this.f45872e.isEmpty();
    }

    boolean b() {
        return m.none != this.f45869b;
    }

    boolean c(InterfaceC5277b interfaceC5277b) {
        if (this.f45869b != m.none && (interfaceC5277b instanceof F) && "script".equals(((F) interfaceC5277b).e())) {
            return true;
        }
        int i10 = a.f45886a[this.f45869b.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return !(interfaceC5277b instanceof F);
            }
            if (i10 != 3) {
                return false;
            }
            return interfaceC5277b instanceof l ? ((l) interfaceC5277b).e() : !(interfaceC5277b instanceof F);
        }
        if (this.f45872e.isEmpty()) {
            if (!this.f45873f.isEmpty() && (interfaceC5277b instanceof F)) {
                return !this.f45873f.contains(((F) interfaceC5277b).e());
            }
        } else if (interfaceC5277b instanceof F) {
            return this.f45872e.contains(((F) interfaceC5277b).e());
        }
        return true;
    }

    public void d(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.f45872e.add(stringTokenizer.nextToken());
        }
    }

    public void e(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            this.f45874g.add(nextToken);
            this.f45870c.add(nextToken);
        }
    }

    public void f(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.f45870c.add(stringTokenizer.nextToken());
        }
    }

    public void g(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.f45875h.add(stringTokenizer.nextToken());
        }
    }

    public void h(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            this.f45878k.add(nextToken);
            this.f45871d.add(nextToken);
        }
    }

    public void i(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.f45873f.add(stringTokenizer.nextToken());
        }
    }

    public void j(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            this.f45871d.add(stringTokenizer.nextToken());
        }
    }

    public void k(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str.toLowerCase(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            this.f45877j.add(nextToken);
            this.f45871d.add(nextToken);
        }
    }

    public String l() {
        return this.f45880m;
    }

    public Set m() {
        return this.f45878k;
    }

    public String n() {
        return this.f45868a;
    }

    public Set o() {
        return this.f45873f;
    }

    public String p() {
        return this.f45879l;
    }

    public Set q() {
        return this.f45877j;
    }

    boolean r() {
        return !this.f45874g.isEmpty();
    }

    boolean s() {
        return !this.f45873f.isEmpty();
    }

    boolean t(String str) {
        return this.f45875h.contains(str);
    }

    boolean u(String str) {
        return this.f45874g.contains(str);
    }

    public boolean v() {
        return this.f45882o;
    }

    public boolean w(String str) {
        Iterator it = this.f45878k.iterator();
        while (it.hasNext()) {
            if (str.equals((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    boolean x() {
        EnumC5279d enumC5279d = this.f45876i;
        return enumC5279d == EnumC5279d.HEAD || enumC5279d == EnumC5279d.HEAD_AND_BODY;
    }

    boolean y() {
        return this.f45876i == EnumC5279d.HEAD;
    }

    boolean z(String str) {
        return this.f45871d.contains(str);
    }
}
