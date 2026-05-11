package b4;

import Z3.C1327d;
import Z3.x;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.producers.A;
import com.facebook.imagepipeline.producers.C1835b;
import com.facebook.imagepipeline.producers.C1840g;
import com.facebook.imagepipeline.producers.C1841h;
import com.facebook.imagepipeline.producers.C1842i;
import com.facebook.imagepipeline.producers.C1843j;
import com.facebook.imagepipeline.producers.C1844k;
import com.facebook.imagepipeline.producers.C1846m;
import com.facebook.imagepipeline.producers.C1848o;
import com.facebook.imagepipeline.producers.C1849p;
import com.facebook.imagepipeline.producers.C1851s;
import com.facebook.imagepipeline.producers.C1854v;
import com.facebook.imagepipeline.producers.C1856x;
import com.facebook.imagepipeline.producers.C1857y;
import com.facebook.imagepipeline.producers.C1858z;
import com.facebook.imagepipeline.producers.H;
import com.facebook.imagepipeline.producers.I;
import com.facebook.imagepipeline.producers.J;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.M;
import com.facebook.imagepipeline.producers.N;
import com.facebook.imagepipeline.producers.S;
import com.facebook.imagepipeline.producers.T;
import com.facebook.imagepipeline.producers.W;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.a0;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.r0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u0;
import e3.InterfaceC3074a;
import java.util.Map;
import o4.InterfaceC3751d;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    protected ContentResolver f18766a;

    /* renamed from: b, reason: collision with root package name */
    protected Resources f18767b;

    /* renamed from: c, reason: collision with root package name */
    protected AssetManager f18768c;

    /* renamed from: d, reason: collision with root package name */
    protected final InterfaceC3074a f18769d;

    /* renamed from: e, reason: collision with root package name */
    protected final e4.c f18770e;

    /* renamed from: f, reason: collision with root package name */
    protected final e4.e f18771f;

    /* renamed from: g, reason: collision with root package name */
    protected final e f18772g;

    /* renamed from: h, reason: collision with root package name */
    protected final boolean f18773h;

    /* renamed from: i, reason: collision with root package name */
    protected final boolean f18774i;

    /* renamed from: j, reason: collision with root package name */
    protected final g f18775j;

    /* renamed from: k, reason: collision with root package name */
    protected final e3.i f18776k;

    /* renamed from: l, reason: collision with root package name */
    protected final Z3.j f18777l;

    /* renamed from: m, reason: collision with root package name */
    protected final Z3.j f18778m;

    /* renamed from: n, reason: collision with root package name */
    protected final x f18779n;

    /* renamed from: o, reason: collision with root package name */
    protected final x f18780o;

    /* renamed from: p, reason: collision with root package name */
    protected final Z3.k f18781p;

    /* renamed from: q, reason: collision with root package name */
    protected final C1327d f18782q;

    /* renamed from: r, reason: collision with root package name */
    protected final C1327d f18783r;

    /* renamed from: s, reason: collision with root package name */
    protected final Y3.d f18784s;

    /* renamed from: t, reason: collision with root package name */
    protected final int f18785t;

    /* renamed from: u, reason: collision with root package name */
    protected final int f18786u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f18787v;

    /* renamed from: w, reason: collision with root package name */
    protected final C1649a f18788w;

    /* renamed from: x, reason: collision with root package name */
    protected final int f18789x;

    /* renamed from: y, reason: collision with root package name */
    protected final boolean f18790y;

    /* renamed from: z, reason: collision with root package name */
    protected final Map f18791z;

    public s(Context context, InterfaceC3074a interfaceC3074a, e4.c cVar, e4.e eVar, e eVar2, boolean z10, boolean z11, g gVar, e3.i iVar, x xVar, x xVar2, Z3.j jVar, Z3.j jVar2, Map map, Z3.k kVar, Y3.d dVar, int i10, int i11, boolean z12, int i12, C1649a c1649a, boolean z13, int i13) {
        this.f18766a = context.getApplicationContext().getContentResolver();
        this.f18767b = context.getApplicationContext().getResources();
        this.f18768c = context.getApplicationContext().getAssets();
        this.f18769d = interfaceC3074a;
        this.f18770e = cVar;
        this.f18771f = eVar;
        this.f18772g = eVar2;
        this.f18773h = z10;
        this.f18774i = z11;
        this.f18775j = gVar;
        this.f18776k = iVar;
        this.f18780o = xVar;
        this.f18779n = xVar2;
        this.f18777l = jVar;
        this.f18778m = jVar2;
        this.f18791z = map;
        this.f18781p = kVar;
        this.f18784s = dVar;
        this.f18782q = new C1327d(i13);
        this.f18783r = new C1327d(i13);
        this.f18785t = i10;
        this.f18786u = i11;
        this.f18787v = z12;
        this.f18789x = i12;
        this.f18788w = c1649a;
        this.f18790y = z13;
    }

    public static C1835b a(d0 d0Var) {
        return new C1835b(d0Var);
    }

    public static C1846m h(d0 d0Var, d0 d0Var2) {
        return new C1846m(d0Var, d0Var2);
    }

    public a0 A(d0 d0Var) {
        return new a0(this.f18780o, this.f18781p, d0Var);
    }

    public b0 B(d0 d0Var) {
        return new b0(d0Var, this.f18784s, this.f18775j.c());
    }

    public i0 C() {
        return new i0(this.f18775j.e(), this.f18776k, this.f18766a);
    }

    public k0 D(d0 d0Var, boolean z10, InterfaceC3751d interfaceC3751d) {
        return new k0(this.f18775j.c(), this.f18776k, d0Var, z10, interfaceC3751d);
    }

    public n0 E(d0 d0Var) {
        return new n0(d0Var);
    }

    public r0 F(d0 d0Var) {
        return new r0(5, this.f18775j.b(), d0Var);
    }

    public t0 G(u0[] u0VarArr) {
        return new t0(u0VarArr);
    }

    public d0 b(d0 d0Var, p0 p0Var) {
        return new o0(d0Var, p0Var);
    }

    public C1840g c(d0 d0Var) {
        return new C1840g(this.f18780o, this.f18781p, d0Var);
    }

    public C1841h d(d0 d0Var) {
        return new C1841h(this.f18781p, d0Var);
    }

    public C1842i e(d0 d0Var) {
        return new C1842i(this.f18780o, this.f18781p, d0Var);
    }

    public C1843j f(d0 d0Var) {
        return new C1843j(d0Var, this.f18785t, this.f18786u, this.f18787v);
    }

    public C1844k g(d0 d0Var) {
        return new C1844k(this.f18779n, this.f18777l, this.f18778m, this.f18781p, this.f18782q, this.f18783r, d0Var);
    }

    public C1848o i() {
        return new C1848o(this.f18776k);
    }

    public C1849p j(d0 d0Var) {
        return new C1849p(this.f18769d, this.f18775j.a(), this.f18770e, this.f18771f, this.f18772g, this.f18773h, this.f18774i, d0Var, this.f18789x, this.f18788w, null, b3.p.f18551b);
    }

    public C1851s k(d0 d0Var) {
        return new C1851s(d0Var, this.f18775j.g());
    }

    public C1854v l(d0 d0Var) {
        return new C1854v(this.f18777l, this.f18778m, this.f18791z, this.f18781p, d0Var);
    }

    public C1856x m(d0 d0Var) {
        return new C1856x(this.f18777l, this.f18778m, this.f18791z, this.f18781p, d0Var);
    }

    public C1857y n(d0 d0Var) {
        return new C1857y(this.f18781p, this.f18790y, d0Var);
    }

    public d0 o(d0 d0Var) {
        return new C1858z(this.f18779n, this.f18781p, d0Var);
    }

    public A p(d0 d0Var) {
        return new A(this.f18777l, this.f18778m, this.f18781p, this.f18782q, this.f18783r, d0Var);
    }

    public H q() {
        return new H(this.f18775j.e(), this.f18776k, this.f18768c);
    }

    public I r() {
        return new I(this.f18775j.e(), this.f18776k, this.f18766a);
    }

    public J s() {
        return new J(this.f18775j.e(), this.f18776k, this.f18766a);
    }

    public LocalExifThumbnailProducer t() {
        return new LocalExifThumbnailProducer(this.f18775j.f(), this.f18776k, this.f18766a);
    }

    public M u() {
        return new M(this.f18775j.e(), this.f18776k);
    }

    public N v() {
        return new N(this.f18775j.e(), this.f18776k, this.f18767b);
    }

    public S w() {
        return new S(this.f18775j.c(), this.f18766a);
    }

    public T x() {
        return new T(this.f18775j.e(), this.f18766a);
    }

    public d0 y(X x10) {
        return new W(this.f18776k, this.f18769d, x10);
    }

    public Y z(d0 d0Var) {
        return new Y(this.f18777l, this.f18781p, this.f18776k, this.f18769d, d0Var);
    }
}
