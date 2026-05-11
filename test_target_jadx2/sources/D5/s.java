package D5;

import G5.d;
import K5.F;
import K5.w;
import P5.j;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class s extends com.fasterxml.jackson.core.l implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    protected static final AbstractC0776b f1269m;

    /* renamed from: n, reason: collision with root package name */
    protected static final F5.a f1270n;

    /* renamed from: a, reason: collision with root package name */
    protected final com.fasterxml.jackson.core.d f1271a;

    /* renamed from: b, reason: collision with root package name */
    protected S5.o f1272b;

    /* renamed from: c, reason: collision with root package name */
    protected M5.d f1273c;

    /* renamed from: d, reason: collision with root package name */
    protected final F5.h f1274d;

    /* renamed from: e, reason: collision with root package name */
    protected final F5.d f1275e;

    /* renamed from: f, reason: collision with root package name */
    protected F f1276f;

    /* renamed from: g, reason: collision with root package name */
    protected z f1277g;

    /* renamed from: h, reason: collision with root package name */
    protected P5.j f1278h;

    /* renamed from: i, reason: collision with root package name */
    protected P5.q f1279i;

    /* renamed from: j, reason: collision with root package name */
    protected g f1280j;

    /* renamed from: k, reason: collision with root package name */
    protected G5.d f1281k;

    /* renamed from: l, reason: collision with root package name */
    protected final ConcurrentHashMap f1282l;

    static {
        K5.x xVar = new K5.x();
        f1269m = xVar;
        f1270n = new F5.a(null, xVar, null, S5.o.D(), null, T5.p.f9317m, null, Locale.getDefault(), null, com.fasterxml.jackson.core.b.a(), N5.g.f6544a, new w.b());
    }

    public s() {
        this(null, null, null);
    }

    private final void c(com.fasterxml.jackson.core.f fVar, Object obj, z zVar) {
        Closeable closeable = (Closeable) obj;
        try {
            b(zVar).o0(fVar, obj);
        } catch (Exception e10) {
            e = e10;
        }
        try {
            closeable.close();
            fVar.close();
        } catch (Exception e11) {
            e = e11;
            closeable = null;
            T5.f.i(fVar, closeable, e);
        }
    }

    protected final void a(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }

    protected P5.j b(z zVar) {
        return this.f1278h.n0(zVar, this.f1279i);
    }

    protected final void d(com.fasterxml.jackson.core.f fVar, Object obj) {
        z h10 = h();
        if (h10.Z(A.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            c(fVar, obj, h10);
            return;
        }
        try {
            b(h10).o0(fVar, obj);
            fVar.close();
        } catch (Exception e10) {
            T5.f.j(fVar, e10);
        }
    }

    public s e(q qVar, boolean z10) {
        this.f1277g = (z) (z10 ? this.f1277g.S(qVar) : this.f1277g.T(qVar));
        this.f1280j = (g) (z10 ? this.f1280j.S(qVar) : this.f1280j.T(qVar));
        return this;
    }

    public com.fasterxml.jackson.core.f f(Writer writer) {
        a("w", writer);
        com.fasterxml.jackson.core.f g10 = this.f1271a.g(writer);
        this.f1277g.X(g10);
        return g10;
    }

    protected K5.t g() {
        return new K5.r();
    }

    public z h() {
        return this.f1277g;
    }

    public String i(Object obj) {
        y5.g gVar = new y5.g(this.f1271a.e());
        try {
            d(f(gVar), obj);
            return gVar.a();
        } catch (com.fasterxml.jackson.core.i e10) {
            throw e10;
        } catch (IOException e11) {
            throw l.j(e11);
        }
    }

    public s(com.fasterxml.jackson.core.d dVar) {
        this(dVar, null, null);
    }

    public s(com.fasterxml.jackson.core.d dVar, P5.j jVar, G5.d dVar2) {
        this.f1282l = new ConcurrentHashMap(64, 0.6f, 2);
        if (dVar == null) {
            this.f1271a = new r(this);
        } else {
            this.f1271a = dVar;
            if (dVar.h() == null) {
                dVar.j(this);
            }
        }
        this.f1273c = new N5.i();
        T5.n nVar = new T5.n();
        this.f1272b = S5.o.D();
        F f10 = new F(null);
        this.f1276f = f10;
        F5.a m10 = f1270n.m(g());
        F5.h hVar = new F5.h();
        this.f1274d = hVar;
        F5.d dVar3 = new F5.d();
        this.f1275e = dVar3;
        this.f1277g = new z(m10, this.f1273c, f10, nVar, hVar);
        this.f1280j = new g(m10, this.f1273c, f10, nVar, hVar, dVar3);
        boolean i10 = this.f1271a.i();
        z zVar = this.f1277g;
        q qVar = q.SORT_PROPERTIES_ALPHABETICALLY;
        if (zVar.D(qVar) ^ i10) {
            e(qVar, i10);
        }
        this.f1278h = jVar == null ? new j.a() : jVar;
        this.f1281k = dVar2 == null ? new d.a(G5.b.f2932k) : dVar2;
        this.f1279i = P5.f.f7504d;
    }
}
