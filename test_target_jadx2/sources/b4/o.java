package b4;

import Z3.u;
import Z3.v;
import android.content.Context;
import c3.AbstractC1721a;
import com.facebook.imagepipeline.producers.B;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.q0;
import e4.C3078b;
import f4.InterfaceC3146a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o4.C3753f;
import o4.C3755h;
import o4.InterfaceC3751d;

/* loaded from: classes.dex */
public class o {

    /* renamed from: u, reason: collision with root package name */
    private static final Class f18735u = o.class;

    /* renamed from: v, reason: collision with root package name */
    private static o f18736v;

    /* renamed from: w, reason: collision with root package name */
    private static k f18737w;

    /* renamed from: x, reason: collision with root package name */
    private static boolean f18738x;

    /* renamed from: a, reason: collision with root package name */
    private final p0 f18739a;

    /* renamed from: b, reason: collision with root package name */
    private final m f18740b;

    /* renamed from: c, reason: collision with root package name */
    private final C1649a f18741c;

    /* renamed from: d, reason: collision with root package name */
    private Z3.n f18742d;

    /* renamed from: e, reason: collision with root package name */
    private u f18743e;

    /* renamed from: f, reason: collision with root package name */
    private Z3.n f18744f;

    /* renamed from: g, reason: collision with root package name */
    private u f18745g;

    /* renamed from: h, reason: collision with root package name */
    private Z3.j f18746h;

    /* renamed from: i, reason: collision with root package name */
    private W2.n f18747i;

    /* renamed from: j, reason: collision with root package name */
    private e4.c f18748j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC3751d f18749k;

    /* renamed from: l, reason: collision with root package name */
    private s f18750l;

    /* renamed from: m, reason: collision with root package name */
    private t f18751m;

    /* renamed from: n, reason: collision with root package name */
    private Z3.j f18752n;

    /* renamed from: o, reason: collision with root package name */
    private W2.n f18753o;

    /* renamed from: p, reason: collision with root package name */
    private Map f18754p;

    /* renamed from: q, reason: collision with root package name */
    private b3.g f18755q;

    /* renamed from: r, reason: collision with root package name */
    private Y3.d f18756r;

    /* renamed from: s, reason: collision with root package name */
    private k4.d f18757s;

    /* renamed from: t, reason: collision with root package name */
    private U3.a f18758t;

    public o(m mVar) {
        if (n4.b.d()) {
            n4.b.a("ImagePipelineConfig()");
        }
        m mVar2 = (m) b3.l.g(mVar);
        this.f18740b = mVar2;
        this.f18739a = mVar2.F().E() ? new B(mVar.H().b()) : new q0(mVar.H().b());
        this.f18741c = new C1649a(mVar.e());
        if (n4.b.d()) {
            n4.b.b();
        }
    }

    private k a() {
        t t10 = t();
        Set j10 = this.f18740b.j();
        Set b10 = this.f18740b.b();
        b3.o u10 = this.f18740b.u();
        u e10 = e();
        u j11 = j();
        Z3.j o10 = o();
        Z3.j u11 = u();
        Z3.k l10 = this.f18740b.l();
        p0 p0Var = this.f18739a;
        b3.o s10 = this.f18740b.F().s();
        b3.o G10 = this.f18740b.F().G();
        this.f18740b.C();
        return new k(t10, j10, b10, u10, e10, j11, o10, u11, l10, p0Var, s10, G10, null, this.f18740b);
    }

    private U3.a c() {
        if (this.f18758t == null) {
            this.f18758t = U3.b.a(q(), this.f18740b.H(), d(), this.f18740b.F().i(), this.f18740b.F().u(), this.f18740b.F().c(), this.f18740b.v());
        }
        return this.f18758t;
    }

    private b3.g g() {
        if (this.f18755q == null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : h().entrySet()) {
                hashMap.put((String) entry.getKey(), new Z3.j((W2.n) entry.getValue(), this.f18740b.a().i(this.f18740b.c()), this.f18740b.a().j(), this.f18740b.H().e(), this.f18740b.H().d(), this.f18740b.s()));
            }
            this.f18755q = b3.g.a(hashMap);
        }
        return this.f18755q;
    }

    private Map h() {
        if (this.f18754p == null) {
            this.f18754p = new HashMap();
            if (this.f18740b.q() != null) {
                for (Map.Entry entry : this.f18740b.q().entrySet()) {
                    this.f18754p.put((String) entry.getKey(), this.f18740b.d().a((W2.g) entry.getValue()));
                }
            }
        }
        return this.f18754p;
    }

    private e4.c k() {
        e4.c cVar;
        e4.c cVar2;
        if (this.f18748j == null) {
            if (this.f18740b.E() != null) {
                this.f18748j = this.f18740b.E();
            } else {
                U3.a c10 = c();
                if (c10 != null) {
                    cVar = c10.b();
                    cVar2 = c10.c();
                } else {
                    cVar = null;
                    cVar2 = null;
                }
                this.f18740b.z();
                this.f18748j = new C3078b(cVar, cVar2, r());
            }
        }
        return this.f18748j;
    }

    private InterfaceC3751d m() {
        if (this.f18749k == null) {
            if (this.f18740b.x() == null && this.f18740b.w() == null && this.f18740b.F().H()) {
                this.f18749k = new C3755h(this.f18740b.F().l());
            } else {
                this.f18749k = new C3753f(this.f18740b.F().l(), this.f18740b.F().w(), this.f18740b.x(), this.f18740b.w(), this.f18740b.F().D());
            }
        }
        return this.f18749k;
    }

    public static o n() {
        return (o) b3.l.h(f18736v, "ImagePipelineFactory was not initialized!");
    }

    private s s() {
        if (this.f18750l == null) {
            this.f18750l = this.f18740b.F().o().a(this.f18740b.getContext(), this.f18740b.a().k(), k(), this.f18740b.p(), this.f18740b.B(), this.f18740b.m(), this.f18740b.F().z(), this.f18740b.H(), this.f18740b.a().i(this.f18740b.c()), this.f18740b.a().j(), e(), j(), o(), u(), g(), this.f18740b.l(), q(), this.f18740b.F().f(), this.f18740b.F().e(), this.f18740b.F().d(), this.f18740b.F().l(), f(), this.f18740b.F().k(), this.f18740b.F().t());
        }
        return this.f18750l;
    }

    private t t() {
        boolean v10 = this.f18740b.F().v();
        if (this.f18751m == null) {
            this.f18751m = new t(this.f18740b.getContext().getApplicationContext().getContentResolver(), s(), this.f18740b.g(), this.f18740b.m(), this.f18740b.F().J(), this.f18739a, this.f18740b.B(), v10, this.f18740b.F().I(), this.f18740b.A(), m(), this.f18740b.F().C(), this.f18740b.F().A(), this.f18740b.F().a(), this.f18740b.o());
        }
        return this.f18751m;
    }

    private Z3.j u() {
        if (this.f18752n == null) {
            this.f18752n = new Z3.j(v(), this.f18740b.a().i(this.f18740b.c()), this.f18740b.a().j(), this.f18740b.H().e(), this.f18740b.H().d(), this.f18740b.s());
        }
        return this.f18752n;
    }

    public static synchronized void w(Context context) {
        synchronized (o.class) {
            try {
                if (n4.b.d()) {
                    n4.b.a("ImagePipelineFactory#initialize");
                }
                x(l.K(context).a());
                if (n4.b.d()) {
                    n4.b.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void x(m mVar) {
        synchronized (o.class) {
            if (f18736v != null) {
                AbstractC1721a.F(f18735u, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                if (f18738x) {
                    return;
                }
            }
            f18736v = new o(mVar);
        }
    }

    public InterfaceC3146a b(Context context) {
        U3.a c10 = c();
        if (c10 == null) {
            return null;
        }
        return c10.a(context);
    }

    public Z3.n d() {
        if (this.f18742d == null) {
            this.f18742d = this.f18740b.f().a(this.f18740b.D(), this.f18740b.y(), this.f18740b.n(), this.f18740b.F().q(), this.f18740b.F().p(), this.f18740b.t());
        }
        return this.f18742d;
    }

    public u e() {
        if (this.f18743e == null) {
            this.f18743e = v.a(d(), this.f18740b.s());
        }
        return this.f18743e;
    }

    public C1649a f() {
        return this.f18741c;
    }

    public Z3.n i() {
        if (this.f18744f == null) {
            this.f18744f = Z3.r.a(this.f18740b.G(), this.f18740b.y(), this.f18740b.k());
        }
        return this.f18744f;
    }

    public u j() {
        if (this.f18745g == null) {
            this.f18745g = Z3.s.a(this.f18740b.h() != null ? this.f18740b.h() : i(), this.f18740b.s());
        }
        return this.f18745g;
    }

    public k l() {
        if (f18737w == null) {
            f18737w = a();
        }
        return f18737w;
    }

    public Z3.j o() {
        if (this.f18746h == null) {
            this.f18746h = new Z3.j(p(), this.f18740b.a().i(this.f18740b.c()), this.f18740b.a().j(), this.f18740b.H().e(), this.f18740b.H().d(), this.f18740b.s());
        }
        return this.f18746h;
    }

    public W2.n p() {
        if (this.f18747i == null) {
            this.f18747i = this.f18740b.d().a(this.f18740b.i());
        }
        return this.f18747i;
    }

    public Y3.d q() {
        if (this.f18756r == null) {
            this.f18756r = Y3.e.a(this.f18740b.a(), r(), f());
        }
        return this.f18756r;
    }

    public k4.d r() {
        if (this.f18757s == null) {
            this.f18757s = k4.e.a(this.f18740b.a(), this.f18740b.F().F(), this.f18740b.F().r(), this.f18740b.F().n());
        }
        return this.f18757s;
    }

    public W2.n v() {
        if (this.f18753o == null) {
            this.f18753o = this.f18740b.d().a(this.f18740b.r());
        }
        return this.f18753o;
    }
}
