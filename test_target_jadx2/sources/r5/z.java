package R5;

import D5.AbstractC0776b;
import E5.e;
import v5.p;

/* loaded from: classes2.dex */
public abstract class z extends H implements P5.i {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f8551k = p.a.NON_EMPTY;

    /* renamed from: c, reason: collision with root package name */
    protected final D5.j f8552c;

    /* renamed from: d, reason: collision with root package name */
    protected final D5.d f8553d;

    /* renamed from: e, reason: collision with root package name */
    protected final M5.g f8554e;

    /* renamed from: f, reason: collision with root package name */
    protected final D5.o f8555f;

    /* renamed from: g, reason: collision with root package name */
    protected final T5.m f8556g;

    /* renamed from: h, reason: collision with root package name */
    protected transient Q5.k f8557h;

    /* renamed from: i, reason: collision with root package name */
    protected final Object f8558i;

    /* renamed from: j, reason: collision with root package name */
    protected final boolean f8559j;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8560a;

        static {
            int[] iArr = new int[p.a.values().length];
            f8560a = iArr;
            try {
                iArr[p.a.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8560a[p.a.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8560a[p.a.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8560a[p.a.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8560a[p.a.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8560a[p.a.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public z(S5.j jVar, boolean z10, M5.g gVar, D5.o oVar) {
        super(jVar);
        this.f8552c = jVar.a();
        this.f8553d = null;
        this.f8554e = gVar;
        this.f8555f = oVar;
        this.f8556g = null;
        this.f8558i = null;
        this.f8559j = false;
        this.f8557h = Q5.k.c();
    }

    private final D5.o v(D5.B b10, Class cls) {
        D5.o j10 = this.f8557h.j(cls);
        if (j10 != null) {
            return j10;
        }
        D5.o D10 = this.f8552c.v() ? b10.D(b10.r(this.f8552c, cls), this.f8553d) : b10.E(cls, this.f8553d);
        T5.m mVar = this.f8556g;
        if (mVar != null) {
            D10 = D10.h(mVar);
        }
        D5.o oVar = D10;
        this.f8557h = this.f8557h.i(cls, oVar);
        return oVar;
    }

    private final D5.o w(D5.B b10, D5.j jVar, D5.d dVar) {
        return b10.D(jVar, dVar);
    }

    protected boolean A(D5.B b10, D5.d dVar, D5.j jVar) {
        if (jVar.F()) {
            return false;
        }
        if (jVar.D() || jVar.M()) {
            return true;
        }
        AbstractC0776b J10 = b10.J();
        if (J10 != null && dVar != null && dVar.a() != null) {
            e.b N10 = J10.N(dVar.a());
            if (N10 == e.b.STATIC) {
                return true;
            }
            if (N10 == e.b.DYNAMIC) {
                return false;
            }
        }
        return b10.Y(D5.q.USE_STATIC_TYPING);
    }

    public abstract z B(Object obj, boolean z10);

    protected abstract z C(D5.d dVar, M5.g gVar, D5.o oVar, T5.m mVar);

    @Override // P5.i
    public D5.o a(D5.B b10, D5.d dVar) {
        p.b c10;
        p.a f10;
        Object b11;
        M5.g gVar = this.f8554e;
        if (gVar != null) {
            gVar = gVar.a(dVar);
        }
        D5.o l10 = l(b10, dVar);
        if (l10 == null) {
            l10 = this.f8555f;
            if (l10 != null) {
                l10 = b10.U(l10, dVar);
            } else if (A(b10, dVar, this.f8552c)) {
                l10 = w(b10, this.f8552c, dVar);
            }
        }
        z C10 = (this.f8553d == dVar && this.f8554e == gVar && this.f8555f == l10) ? this : C(dVar, gVar, l10, this.f8556g);
        if (dVar == null || (c10 = dVar.c(b10.f(), c())) == null || (f10 = c10.f()) == p.a.USE_DEFAULTS) {
            return C10;
        }
        int i10 = a.f8560a[f10.ordinal()];
        boolean z10 = true;
        if (i10 != 1) {
            b11 = null;
            if (i10 != 2) {
                if (i10 == 3) {
                    b11 = f8551k;
                } else if (i10 == 4) {
                    b11 = b10.W(null, c10.e());
                    if (b11 != null) {
                        z10 = b10.X(b11);
                    }
                } else if (i10 != 5) {
                    z10 = false;
                }
            } else if (this.f8552c.b()) {
                b11 = f8551k;
            }
        } else {
            b11 = T5.d.b(this.f8552c);
            if (b11 != null && b11.getClass().isArray()) {
                b11 = T5.b.a(b11);
            }
        }
        return (this.f8558i == b11 && this.f8559j == z10) ? C10 : C10.B(b11, z10);
    }

    @Override // D5.o
    public boolean d(D5.B b10, Object obj) {
        if (!z(obj)) {
            return true;
        }
        Object x10 = x(obj);
        if (x10 == null) {
            return this.f8559j;
        }
        if (this.f8558i == null) {
            return false;
        }
        D5.o oVar = this.f8555f;
        if (oVar == null) {
            try {
                oVar = v(b10, x10.getClass());
            } catch (D5.l e10) {
                throw new D5.y(e10);
            }
        }
        Object obj2 = this.f8558i;
        return obj2 == f8551k ? oVar.d(b10, x10) : obj2.equals(x10);
    }

    @Override // D5.o
    public boolean e() {
        return this.f8556g != null;
    }

    @Override // R5.H, D5.o
    public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        Object y10 = y(obj);
        if (y10 == null) {
            if (this.f8556g == null) {
                b10.v(fVar);
                return;
            }
            return;
        }
        D5.o oVar = this.f8555f;
        if (oVar == null) {
            oVar = v(b10, y10.getClass());
        }
        M5.g gVar = this.f8554e;
        if (gVar != null) {
            oVar.g(y10, fVar, b10, gVar);
        } else {
            oVar.f(y10, fVar, b10);
        }
    }

    @Override // D5.o
    public void g(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        Object y10 = y(obj);
        if (y10 == null) {
            if (this.f8556g == null) {
                b10.v(fVar);
            }
        } else {
            D5.o oVar = this.f8555f;
            if (oVar == null) {
                oVar = v(b10, y10.getClass());
            }
            oVar.g(y10, fVar, b10, gVar);
        }
    }

    @Override // D5.o
    public D5.o h(T5.m mVar) {
        D5.o oVar = this.f8555f;
        if (oVar != null && (oVar = oVar.h(mVar)) == this.f8555f) {
            return this;
        }
        T5.m mVar2 = this.f8556g;
        if (mVar2 != null) {
            mVar = T5.m.a(mVar, mVar2);
        }
        return (this.f8555f == oVar && this.f8556g == mVar) ? this : C(this.f8553d, this.f8554e, oVar, mVar);
    }

    protected abstract Object x(Object obj);

    protected abstract Object y(Object obj);

    protected abstract boolean z(Object obj);

    protected z(z zVar, D5.d dVar, M5.g gVar, D5.o oVar, T5.m mVar, Object obj, boolean z10) {
        super(zVar);
        this.f8552c = zVar.f8552c;
        this.f8557h = Q5.k.c();
        this.f8553d = dVar;
        this.f8554e = gVar;
        this.f8555f = oVar;
        this.f8556g = mVar;
        this.f8558i = obj;
        this.f8559j = z10;
    }
}
