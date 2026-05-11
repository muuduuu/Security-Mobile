package ze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import org.conscrypt.BuildConfig;

/* renamed from: ze.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5283h implements Ae.b {

    /* renamed from: A, reason: collision with root package name */
    private boolean f45935A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f45936B;

    /* renamed from: C, reason: collision with root package name */
    private String f45937C;

    /* renamed from: D, reason: collision with root package name */
    private String f45938D;

    /* renamed from: E, reason: collision with root package name */
    private String f45939E;

    /* renamed from: G, reason: collision with root package name */
    private List f45941G;

    /* renamed from: K, reason: collision with root package name */
    private boolean f45945K;

    /* renamed from: a, reason: collision with root package name */
    private v f45946a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f45947b;

    /* renamed from: c, reason: collision with root package name */
    private String f45948c;

    /* renamed from: d, reason: collision with root package name */
    private List f45949d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f45950e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f45951f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f45952g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f45953h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f45954i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f45955j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f45956k;

    /* renamed from: l, reason: collision with root package name */
    private y f45957l;

    /* renamed from: m, reason: collision with root package name */
    private y f45958m;

    /* renamed from: n, reason: collision with root package name */
    private y f45959n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f45960o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f45961p;

    /* renamed from: q, reason: collision with root package name */
    private String f45962q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f45963r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f45964s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f45965t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f45966u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f45967v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f45968w;

    /* renamed from: x, reason: collision with root package name */
    private int f45969x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f45970y;

    /* renamed from: z, reason: collision with root package name */
    private String f45971z;

    /* renamed from: F, reason: collision with root package name */
    private i f45940F = new i();

    /* renamed from: H, reason: collision with root package name */
    private Set f45942H = new HashSet();

    /* renamed from: I, reason: collision with root package name */
    private Set f45943I = new HashSet();

    /* renamed from: J, reason: collision with root package name */
    private String f45944J = "UTF-8";

    public C5283h() {
        C();
    }

    private void D() {
        this.f45942H.clear();
        this.f45942H.add(Be.b.f579a);
    }

    private void F(String str) {
        this.f45943I.clear();
        e(this.f45943I, str);
    }

    private void e(Set set, String str) {
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            while (stringTokenizer.hasMoreTokens()) {
                set.add(new Be.c(stringTokenizer.nextToken().trim().toLowerCase()));
            }
        }
    }

    public boolean A() {
        return this.f45968w;
    }

    public boolean B(String str) {
        List list = this.f45949d;
        if (list == null || str == null) {
            return false;
        }
        return list.contains(str.toLowerCase());
    }

    public void C() {
        this.f45947b = true;
        Q("script,style");
        this.f45950e = true;
        this.f45951f = true;
        this.f45952g = false;
        this.f45953h = false;
        this.f45954i = false;
        this.f45956k = false;
        this.f45955j = false;
        y yVar = y.alwaysOutput;
        this.f45957l = yVar;
        this.f45958m = yVar;
        this.f45959n = yVar;
        this.f45960o = true;
        this.f45961p = true;
        this.f45964s = false;
        this.f45963r = true;
        this.f45965t = true;
        this.f45935A = true;
        this.f45936B = true;
        this.f45937C = "=";
        K(null);
        G(null);
        this.f45962q = "self";
        this.f45944J = "UTF-8";
        this.f45940F.a();
        D();
        if (i() == s.f45987c) {
            this.f45946a = q.f45983b;
        } else {
            this.f45946a = r.f45985b;
        }
        this.f45941G = new ArrayList();
        this.f45966u = false;
        this.f45968w = true;
        this.f45971z = BuildConfig.FLAVOR;
        this.f45970y = false;
    }

    public void E(boolean z10) {
        this.f45947b = z10;
    }

    public void G(String str) {
        this.f45939E = str;
        F(str);
    }

    public void H(boolean z10) {
        this.f45963r = z10;
    }

    public void I(boolean z10) {
        this.f45958m = z10 ? y.omit : y.alwaysOutput;
    }

    public void J(boolean z10) {
        this.f45957l = z10 ? y.omit : y.alwaysOutput;
    }

    public void K(String str) {
        this.f45938D = str;
        D();
        e(this.f45942H, str);
    }

    public void L(boolean z10) {
        this.f45951f = z10;
    }

    void M(v vVar) {
        this.f45946a = vVar;
    }

    public void N(boolean z10) {
        this.f45945K = z10;
    }

    public void O(boolean z10) {
        this.f45950e = z10;
    }

    public void P(boolean z10) {
        this.f45968w = z10;
    }

    public void Q(String str) {
        if (str != null) {
            this.f45948c = str;
            this.f45949d = Arrays.asList(str.toLowerCase().split(","));
        } else {
            this.f45948c = BuildConfig.FLAVOR;
            this.f45949d = null;
        }
    }

    public void R(boolean z10) {
        this.f45960o = z10;
    }

    @Override // Ae.b
    public void a(boolean z10, D d10, Ae.a aVar) {
        Iterator it = this.f45941G.iterator();
        while (it.hasNext()) {
            ((Ae.b) it.next()).a(z10, d10, aVar);
        }
    }

    @Override // Ae.b
    public void b(boolean z10, D d10, Ae.a aVar) {
        Iterator it = this.f45941G.iterator();
        while (it.hasNext()) {
            ((Ae.b) it.next()).b(z10, d10, aVar);
        }
    }

    @Override // Ae.b
    public void c(Be.a aVar, D d10) {
        Iterator it = this.f45941G.iterator();
        while (it.hasNext()) {
            ((Ae.b) it.next()).c(aVar, d10);
        }
    }

    @Override // Ae.b
    public void d(boolean z10, D d10, Ae.a aVar) {
        Iterator it = this.f45941G.iterator();
        while (it.hasNext()) {
            ((Ae.b) it.next()).d(z10, d10, aVar);
        }
    }

    public Set f() {
        return this.f45943I;
    }

    public String g() {
        return this.f45962q;
    }

    public i h() {
        return this.f45940F;
    }

    public int i() {
        return this.f45969x;
    }

    public String j() {
        return this.f45937C;
    }

    public Set k() {
        return this.f45942H;
    }

    public v l() {
        return this.f45946a;
    }

    public boolean m() {
        return this.f45964s;
    }

    public boolean n() {
        return this.f45961p;
    }

    public boolean o() {
        return this.f45967v;
    }

    public boolean p() {
        return this.f45963r;
    }

    public boolean q() {
        return this.f45936B;
    }

    public boolean r() {
        return this.f45965t;
    }

    public boolean s() {
        return this.f45966u;
    }

    public boolean t() {
        return this.f45955j;
    }

    public boolean u() {
        return this.f45954i;
    }

    public boolean v() {
        return this.f45959n == y.omit;
    }

    public boolean w() {
        return this.f45952g;
    }

    public boolean x() {
        return this.f45951f;
    }

    public boolean y() {
        return this.f45956k;
    }

    public boolean z() {
        return this.f45953h;
    }
}
