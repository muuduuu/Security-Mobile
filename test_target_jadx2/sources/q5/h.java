package Q5;

import D5.AbstractC0776b;
import D5.B;
import K5.AbstractC0928i;
import Q5.k;
import java.util.Map;
import org.conscrypt.BuildConfig;
import v5.p;

/* loaded from: classes2.dex */
public class h extends P5.h implements P5.i {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f8180n = p.a.NON_EMPTY;

    /* renamed from: c, reason: collision with root package name */
    protected final D5.d f8181c;

    /* renamed from: d, reason: collision with root package name */
    protected final boolean f8182d;

    /* renamed from: e, reason: collision with root package name */
    protected final D5.j f8183e;

    /* renamed from: f, reason: collision with root package name */
    protected final D5.j f8184f;

    /* renamed from: g, reason: collision with root package name */
    protected final D5.j f8185g;

    /* renamed from: h, reason: collision with root package name */
    protected D5.o f8186h;

    /* renamed from: i, reason: collision with root package name */
    protected D5.o f8187i;

    /* renamed from: j, reason: collision with root package name */
    protected final M5.g f8188j;

    /* renamed from: k, reason: collision with root package name */
    protected k f8189k;

    /* renamed from: l, reason: collision with root package name */
    protected final Object f8190l;

    /* renamed from: m, reason: collision with root package name */
    protected final boolean f8191m;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8192a;

        static {
            int[] iArr = new int[p.a.values().length];
            f8192a = iArr;
            try {
                iArr[p.a.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8192a[p.a.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8192a[p.a.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8192a[p.a.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8192a[p.a.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8192a[p.a.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public h(D5.j jVar, D5.j jVar2, D5.j jVar3, boolean z10, M5.g gVar, D5.d dVar) {
        super(jVar);
        this.f8183e = jVar;
        this.f8184f = jVar2;
        this.f8185g = jVar3;
        this.f8182d = z10;
        this.f8188j = gVar;
        this.f8181c = dVar;
        this.f8189k = k.c();
        this.f8190l = null;
        this.f8191m = false;
    }

    @Override // D5.o
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean d(B b10, Map.Entry entry) {
        Object value = entry.getValue();
        if (value == null) {
            return this.f8191m;
        }
        if (this.f8190l == null) {
            return false;
        }
        D5.o oVar = this.f8187i;
        if (oVar == null) {
            Class<?> cls = value.getClass();
            D5.o j10 = this.f8189k.j(cls);
            if (j10 == null) {
                try {
                    oVar = y(this.f8189k, cls, b10);
                } catch (D5.l unused) {
                    return false;
                }
            } else {
                oVar = j10;
            }
        }
        Object obj = this.f8190l;
        return obj == f8180n ? oVar.d(b10, value) : obj.equals(value);
    }

    @Override // R5.H, D5.o
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void f(Map.Entry entry, com.fasterxml.jackson.core.f fVar, B b10) {
        fVar.e2(entry);
        C(entry, fVar, b10);
        fVar.N();
    }

    protected void C(Map.Entry entry, com.fasterxml.jackson.core.f fVar, B b10) {
        D5.o oVar;
        M5.g gVar = this.f8188j;
        Object key = entry.getKey();
        D5.o A10 = key == null ? b10.A(this.f8184f, this.f8181c) : this.f8186h;
        Object value = entry.getValue();
        if (value != null) {
            oVar = this.f8187i;
            if (oVar == null) {
                Class<?> cls = value.getClass();
                D5.o j10 = this.f8189k.j(cls);
                oVar = j10 == null ? this.f8185g.v() ? x(this.f8189k, b10.r(this.f8185g, cls), b10) : y(this.f8189k, cls, b10) : j10;
            }
            Object obj = this.f8190l;
            if (obj != null && ((obj == f8180n && oVar.d(b10, value)) || this.f8190l.equals(value))) {
                return;
            }
        } else if (this.f8191m) {
            return;
        } else {
            oVar = b10.M();
        }
        A10.f(key, fVar, b10);
        try {
            if (gVar == null) {
                oVar.f(value, fVar, b10);
            } else {
                oVar.g(value, fVar, b10, gVar);
            }
        } catch (Exception e10) {
            u(b10, e10, entry, BuildConfig.FLAVOR + key);
        }
    }

    @Override // D5.o
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void g(Map.Entry entry, com.fasterxml.jackson.core.f fVar, B b10, M5.g gVar) {
        fVar.q(entry);
        B5.b g10 = gVar.g(fVar, gVar.d(entry, com.fasterxml.jackson.core.k.START_OBJECT));
        C(entry, fVar, b10);
        gVar.h(fVar, g10);
    }

    public h E(Object obj, boolean z10) {
        return (this.f8190l == obj && this.f8191m == z10) ? this : new h(this, this.f8181c, this.f8188j, this.f8186h, this.f8187i, obj, z10);
    }

    public h F(D5.d dVar, D5.o oVar, D5.o oVar2, Object obj, boolean z10) {
        return new h(this, dVar, this.f8188j, oVar, oVar2, obj, z10);
    }

    @Override // P5.i
    public D5.o a(B b10, D5.d dVar) {
        D5.o oVar;
        D5.o oVar2;
        Object obj;
        boolean z10;
        p.b c10;
        p.a f10;
        boolean X10;
        AbstractC0776b J10 = b10.J();
        Object obj2 = null;
        AbstractC0928i a10 = dVar == null ? null : dVar.a();
        if (a10 == null || J10 == null) {
            oVar = null;
            oVar2 = null;
        } else {
            Object o10 = J10.o(a10);
            oVar2 = o10 != null ? b10.g0(a10, o10) : null;
            Object f11 = J10.f(a10);
            oVar = f11 != null ? b10.g0(a10, f11) : null;
        }
        if (oVar == null) {
            oVar = this.f8187i;
        }
        D5.o m10 = m(b10, dVar, oVar);
        if (m10 == null && this.f8182d && !this.f8185g.F()) {
            m10 = b10.w(this.f8185g, dVar);
        }
        D5.o oVar3 = m10;
        if (oVar2 == null) {
            oVar2 = this.f8186h;
        }
        D5.o y10 = oVar2 == null ? b10.y(this.f8184f, dVar) : b10.V(oVar2, dVar);
        Object obj3 = this.f8190l;
        boolean z11 = this.f8191m;
        if (dVar == null || (c10 = dVar.c(b10.f(), null)) == null || (f10 = c10.f()) == p.a.USE_DEFAULTS) {
            obj = obj3;
        } else {
            int i10 = a.f8192a[f10.ordinal()];
            z11 = true;
            if (i10 == 1) {
                obj2 = T5.d.b(this.f8185g);
                if (obj2 != null && obj2.getClass().isArray()) {
                    obj2 = T5.b.a(obj2);
                }
            } else if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        obj2 = b10.W(null, c10.e());
                        if (obj2 != null) {
                            X10 = b10.X(obj2);
                            z10 = X10;
                            obj = obj2;
                        }
                    } else if (i10 != 5) {
                        X10 = false;
                        z10 = X10;
                        obj = obj2;
                    }
                    return F(dVar, y10, oVar3, obj, z10);
                }
                obj2 = f8180n;
            } else if (this.f8185g.b()) {
                obj2 = f8180n;
            }
            obj = obj2;
        }
        z10 = z11;
        return F(dVar, y10, oVar3, obj, z10);
    }

    @Override // P5.h
    public P5.h v(M5.g gVar) {
        return new h(this, this.f8181c, gVar, this.f8186h, this.f8187i, this.f8190l, this.f8191m);
    }

    protected final D5.o x(k kVar, D5.j jVar, B b10) {
        k.d g10 = kVar.g(jVar, b10, this.f8181c);
        k kVar2 = g10.f8208b;
        if (kVar != kVar2) {
            this.f8189k = kVar2;
        }
        return g10.f8207a;
    }

    protected final D5.o y(k kVar, Class cls, B b10) {
        k.d h10 = kVar.h(cls, b10, this.f8181c);
        k kVar2 = h10.f8208b;
        if (kVar != kVar2) {
            this.f8189k = kVar2;
        }
        return h10.f8207a;
    }

    public D5.j z() {
        return this.f8185g;
    }

    protected h(h hVar, D5.d dVar, M5.g gVar, D5.o oVar, D5.o oVar2, Object obj, boolean z10) {
        super(Map.class, false);
        this.f8183e = hVar.f8183e;
        this.f8184f = hVar.f8184f;
        this.f8185g = hVar.f8185g;
        this.f8182d = hVar.f8182d;
        this.f8188j = hVar.f8188j;
        this.f8186h = oVar;
        this.f8187i = oVar2;
        this.f8189k = k.c();
        this.f8181c = hVar.f8181c;
        this.f8190l = obj;
        this.f8191m = z10;
    }
}
