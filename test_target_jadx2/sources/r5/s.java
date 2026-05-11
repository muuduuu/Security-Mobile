package R5;

import K5.AbstractC0928i;
import v5.C;

/* loaded from: classes2.dex */
public class s extends H implements P5.i {

    /* renamed from: c, reason: collision with root package name */
    protected final AbstractC0928i f8507c;

    /* renamed from: d, reason: collision with root package name */
    protected final M5.g f8508d;

    /* renamed from: e, reason: collision with root package name */
    protected final D5.o f8509e;

    /* renamed from: f, reason: collision with root package name */
    protected final D5.d f8510f;

    /* renamed from: g, reason: collision with root package name */
    protected final D5.j f8511g;

    /* renamed from: h, reason: collision with root package name */
    protected final boolean f8512h;

    /* renamed from: i, reason: collision with root package name */
    protected transient Q5.k f8513i;

    static class a extends M5.g {

        /* renamed from: a, reason: collision with root package name */
        protected final M5.g f8514a;

        /* renamed from: b, reason: collision with root package name */
        protected final Object f8515b;

        public a(M5.g gVar, Object obj) {
            this.f8514a = gVar;
            this.f8515b = obj;
        }

        @Override // M5.g
        public M5.g a(D5.d dVar) {
            throw new UnsupportedOperationException();
        }

        @Override // M5.g
        public String b() {
            return this.f8514a.b();
        }

        @Override // M5.g
        public C.a c() {
            return this.f8514a.c();
        }

        @Override // M5.g
        public B5.b g(com.fasterxml.jackson.core.f fVar, B5.b bVar) {
            bVar.f441a = this.f8515b;
            return this.f8514a.g(fVar, bVar);
        }

        @Override // M5.g
        public B5.b h(com.fasterxml.jackson.core.f fVar, B5.b bVar) {
            return this.f8514a.h(fVar, bVar);
        }
    }

    public s(AbstractC0928i abstractC0928i, M5.g gVar, D5.o oVar) {
        super(abstractC0928i.e());
        this.f8507c = abstractC0928i;
        this.f8511g = abstractC0928i.e();
        this.f8508d = gVar;
        this.f8509e = oVar;
        this.f8510f = null;
        this.f8512h = true;
        this.f8513i = Q5.k.c();
    }

    private static final Class w(Class cls) {
        return cls == null ? Object.class : cls;
    }

    @Override // P5.i
    public D5.o a(D5.B b10, D5.d dVar) {
        M5.g gVar = this.f8508d;
        if (gVar != null) {
            gVar = gVar.a(dVar);
        }
        D5.o oVar = this.f8509e;
        if (oVar != null) {
            return y(dVar, gVar, b10.U(oVar, dVar), this.f8512h);
        }
        if (!b10.Y(D5.q.USE_STATIC_TYPING) && !this.f8511g.D()) {
            return dVar != this.f8510f ? y(dVar, gVar, oVar, this.f8512h) : this;
        }
        D5.o D10 = b10.D(this.f8511g, dVar);
        return y(dVar, gVar, D10, x(this.f8511g.q(), D10));
    }

    @Override // D5.o
    public boolean d(D5.B b10, Object obj) {
        Object m10 = this.f8507c.m(obj);
        if (m10 == null) {
            return true;
        }
        D5.o oVar = this.f8509e;
        if (oVar == null) {
            try {
                oVar = v(b10, m10.getClass());
            } catch (D5.l e10) {
                throw new D5.y(e10);
            }
        }
        return oVar.d(b10, m10);
    }

    @Override // R5.H, D5.o
    public void f(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        Object obj2;
        try {
            obj2 = this.f8507c.m(obj);
        } catch (Exception e10) {
            u(b10, e10, obj, this.f8507c.c() + "()");
            obj2 = null;
        }
        if (obj2 == null) {
            b10.v(fVar);
            return;
        }
        D5.o oVar = this.f8509e;
        if (oVar == null) {
            oVar = v(b10, obj2.getClass());
        }
        M5.g gVar = this.f8508d;
        if (gVar != null) {
            oVar.g(obj2, fVar, b10, gVar);
        } else {
            oVar.f(obj2, fVar, b10);
        }
    }

    @Override // D5.o
    public void g(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        Object obj2;
        try {
            obj2 = this.f8507c.m(obj);
        } catch (Exception e10) {
            u(b10, e10, obj, this.f8507c.c() + "()");
            obj2 = null;
        }
        if (obj2 == null) {
            b10.v(fVar);
            return;
        }
        D5.o oVar = this.f8509e;
        if (oVar == null) {
            oVar = v(b10, obj2.getClass());
        } else if (this.f8512h) {
            B5.b g10 = gVar.g(fVar, gVar.d(obj, com.fasterxml.jackson.core.k.VALUE_STRING));
            oVar.f(obj2, fVar, b10);
            gVar.h(fVar, g10);
            return;
        }
        oVar.g(obj2, fVar, b10, new a(gVar, obj));
    }

    public String toString() {
        return "(@JsonValue serializer for method " + this.f8507c.j() + "#" + this.f8507c.c() + ")";
    }

    protected D5.o v(D5.B b10, Class cls) {
        D5.o j10 = this.f8513i.j(cls);
        if (j10 != null) {
            return j10;
        }
        if (!this.f8511g.v()) {
            D5.o E10 = b10.E(cls, this.f8510f);
            this.f8513i = this.f8513i.b(cls, E10).f8208b;
            return E10;
        }
        D5.j r10 = b10.r(this.f8511g, cls);
        D5.o D10 = b10.D(r10, this.f8510f);
        this.f8513i = this.f8513i.a(r10, D10).f8208b;
        return D10;
    }

    protected boolean x(Class cls, D5.o oVar) {
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE && cls != Boolean.TYPE && cls != Double.TYPE) {
                return false;
            }
        } else if (cls != String.class && cls != Integer.class && cls != Boolean.class && cls != Double.class) {
            return false;
        }
        return s(oVar);
    }

    protected s y(D5.d dVar, M5.g gVar, D5.o oVar, boolean z10) {
        return (this.f8510f == dVar && this.f8508d == gVar && this.f8509e == oVar && z10 == this.f8512h) ? this : new s(this, dVar, gVar, oVar, z10);
    }

    public s(s sVar, D5.d dVar, M5.g gVar, D5.o oVar, boolean z10) {
        super(w(sVar.c()));
        this.f8507c = sVar.f8507c;
        this.f8511g = sVar.f8511g;
        this.f8508d = gVar;
        this.f8509e = oVar;
        this.f8510f = dVar;
        this.f8512h = z10;
        this.f8513i = Q5.k.c();
    }
}
