package D5;

import K5.AbstractC0921b;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import v5.I;
import v5.InterfaceC4942i;
import v5.p;

/* loaded from: classes2.dex */
public abstract class B extends e {

    /* renamed from: m, reason: collision with root package name */
    public static final o f1219m = new Q5.c("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");

    /* renamed from: n, reason: collision with root package name */
    protected static final o f1220n = new Q5.p();

    /* renamed from: a, reason: collision with root package name */
    protected final z f1221a;

    /* renamed from: b, reason: collision with root package name */
    protected final Class f1222b;

    /* renamed from: c, reason: collision with root package name */
    protected final P5.q f1223c;

    /* renamed from: d, reason: collision with root package name */
    protected final P5.p f1224d;

    /* renamed from: e, reason: collision with root package name */
    protected transient F5.i f1225e;

    /* renamed from: f, reason: collision with root package name */
    protected o f1226f;

    /* renamed from: g, reason: collision with root package name */
    protected o f1227g;

    /* renamed from: h, reason: collision with root package name */
    protected o f1228h;

    /* renamed from: i, reason: collision with root package name */
    protected o f1229i;

    /* renamed from: j, reason: collision with root package name */
    protected final Q5.l f1230j;

    /* renamed from: k, reason: collision with root package name */
    protected DateFormat f1231k;

    /* renamed from: l, reason: collision with root package name */
    protected final boolean f1232l;

    public B() {
        this.f1226f = f1220n;
        this.f1228h = R5.u.f8534c;
        this.f1229i = f1219m;
        this.f1221a = null;
        this.f1223c = null;
        this.f1224d = new P5.p();
        this.f1230j = null;
        this.f1222b = null;
        this.f1225e = null;
        this.f1232l = true;
    }

    public o A(j jVar, d dVar) {
        return this.f1229i;
    }

    public o B(d dVar) {
        return this.f1228h;
    }

    public abstract Q5.t C(Object obj, I i10);

    public o D(j jVar, d dVar) {
        o d10 = this.f1230j.d(jVar);
        return (d10 == null && (d10 = this.f1224d.g(jVar)) == null && (d10 = k(jVar)) == null) ? T(jVar.q()) : U(d10, dVar);
    }

    public o E(Class cls, d dVar) {
        o e10 = this.f1230j.e(cls);
        return (e10 == null && (e10 = this.f1224d.h(cls)) == null && (e10 = this.f1224d.g(this.f1221a.e(cls))) == null && (e10 = l(cls)) == null) ? T(cls) : U(e10, dVar);
    }

    public o F(Class cls, boolean z10, d dVar) {
        o c10 = this.f1230j.c(cls);
        if (c10 != null) {
            return c10;
        }
        o f10 = this.f1224d.f(cls);
        if (f10 != null) {
            return f10;
        }
        o H10 = H(cls, dVar);
        P5.q qVar = this.f1223c;
        z zVar = this.f1221a;
        M5.g c11 = qVar.c(zVar, zVar.e(cls));
        if (c11 != null) {
            H10 = new Q5.o(c11.a(dVar), H10);
        }
        if (z10) {
            this.f1224d.d(cls, H10);
        }
        return H10;
    }

    public o G(j jVar, d dVar) {
        if (jVar == null) {
            e0("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
        }
        o d10 = this.f1230j.d(jVar);
        return (d10 == null && (d10 = this.f1224d.g(jVar)) == null && (d10 = k(jVar)) == null) ? T(jVar.q()) : V(d10, dVar);
    }

    public o H(Class cls, d dVar) {
        o e10 = this.f1230j.e(cls);
        return (e10 == null && (e10 = this.f1224d.h(cls)) == null && (e10 = this.f1224d.g(this.f1221a.e(cls))) == null && (e10 = l(cls)) == null) ? T(cls) : V(e10, dVar);
    }

    public final Class I() {
        return this.f1222b;
    }

    public final AbstractC0776b J() {
        return this.f1221a.g();
    }

    public Object K(Object obj) {
        return this.f1225e.a(obj);
    }

    @Override // D5.e
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final z f() {
        return this.f1221a;
    }

    public o M() {
        return this.f1228h;
    }

    public final InterfaceC4942i.d N(Class cls) {
        return this.f1221a.o(cls);
    }

    public final p.b O(Class cls) {
        return this.f1221a.p(cls);
    }

    public final P5.k P() {
        this.f1221a.W();
        return null;
    }

    public abstract com.fasterxml.jackson.core.f Q();

    public Locale R() {
        return this.f1221a.v();
    }

    public TimeZone S() {
        return this.f1221a.y();
    }

    public o T(Class cls) {
        return cls == Object.class ? this.f1226f : new Q5.p(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o U(o oVar, d dVar) {
        return (oVar == 0 || !(oVar instanceof P5.i)) ? oVar : ((P5.i) oVar).a(this, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o V(o oVar, d dVar) {
        return (oVar == 0 || !(oVar instanceof P5.i)) ? oVar : ((P5.i) oVar).a(this, dVar);
    }

    public abstract Object W(K5.s sVar, Class cls);

    public abstract boolean X(Object obj);

    public final boolean Y(q qVar) {
        return this.f1221a.D(qVar);
    }

    public final boolean Z(A a10) {
        return this.f1221a.Z(a10);
    }

    public l a0(String str, Object... objArr) {
        return l.h(Q(), a(str, objArr));
    }

    public Object b0(Class cls, String str, Throwable th) {
        throw I5.a.r(Q(), str, d(cls)).m(th);
    }

    public Object c0(c cVar, K5.s sVar, String str, Object... objArr) {
        throw I5.a.q(Q(), String.format("Invalid definition for property %s (of type %s): %s", sVar != null ? b(sVar.u()) : "N/A", cVar != null ? T5.f.Q(cVar.i()) : "N/A", a(str, objArr)), cVar, sVar);
    }

    public Object d0(c cVar, String str, Object... objArr) {
        throw I5.a.q(Q(), String.format("Invalid type definition for type %s: %s", cVar != null ? T5.f.Q(cVar.i()) : "N/A", a(str, objArr)), cVar, null);
    }

    public void e0(String str, Object... objArr) {
        throw a0(str, objArr);
    }

    public void f0(Throwable th, String str, Object... objArr) {
        throw l.i(Q(), a(str, objArr), th);
    }

    @Override // D5.e
    public final S5.o g() {
        return this.f1221a.z();
    }

    public abstract o g0(AbstractC0921b abstractC0921b, Object obj);

    public B h0(Object obj, Object obj2) {
        this.f1225e = this.f1225e.c(obj, obj2);
        return this;
    }

    @Override // D5.e
    public Object i(j jVar, String str) {
        throw I5.a.r(Q(), str, jVar);
    }

    protected o k(j jVar) {
        o oVar;
        try {
            oVar = m(jVar);
        } catch (IllegalArgumentException e10) {
            f0(e10, T5.f.m(e10), new Object[0]);
            oVar = null;
        }
        if (oVar != null) {
            this.f1224d.b(jVar, oVar, this);
        }
        return oVar;
    }

    protected o l(Class cls) {
        o oVar;
        j e10 = this.f1221a.e(cls);
        try {
            oVar = m(e10);
        } catch (IllegalArgumentException e11) {
            i(e10, T5.f.m(e11));
            oVar = null;
        }
        if (oVar != null) {
            this.f1224d.c(cls, e10, oVar, this);
        }
        return oVar;
    }

    protected o m(j jVar) {
        return this.f1223c.b(this, jVar);
    }

    protected final DateFormat n() {
        DateFormat dateFormat = this.f1231k;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.f1221a.k().clone();
        this.f1231k = dateFormat2;
        return dateFormat2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected o o(o oVar, d dVar) {
        if (oVar instanceof P5.o) {
            ((P5.o) oVar).b(this);
        }
        return V(oVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected o p(o oVar) {
        if (oVar instanceof P5.o) {
            ((P5.o) oVar).b(this);
        }
        return oVar;
    }

    public final boolean q() {
        return this.f1221a.b();
    }

    public j r(j jVar, Class cls) {
        return jVar.x(cls) ? jVar : f().z().B(jVar, cls, true);
    }

    public void s(long j10, com.fasterxml.jackson.core.f fVar) {
        if (Z(A.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            fVar.o0(String.valueOf(j10));
        } else {
            fVar.o0(n().format(new Date(j10)));
        }
    }

    public void t(Date date, com.fasterxml.jackson.core.f fVar) {
        if (Z(A.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            fVar.o0(String.valueOf(date.getTime()));
        } else {
            fVar.o0(n().format(date));
        }
    }

    public final void u(Date date, com.fasterxml.jackson.core.f fVar) {
        if (Z(A.WRITE_DATES_AS_TIMESTAMPS)) {
            fVar.Z0(date.getTime());
        } else {
            fVar.h2(n().format(date));
        }
    }

    public final void v(com.fasterxml.jackson.core.f fVar) {
        if (this.f1232l) {
            fVar.y0();
        } else {
            this.f1228h.f(null, fVar, this);
        }
    }

    public o w(j jVar, d dVar) {
        o d10 = this.f1230j.d(jVar);
        return (d10 == null && (d10 = this.f1224d.g(jVar)) == null && (d10 = k(jVar)) == null) ? T(jVar.q()) : V(d10, dVar);
    }

    public o x(Class cls, d dVar) {
        o e10 = this.f1230j.e(cls);
        return (e10 == null && (e10 = this.f1224d.h(cls)) == null && (e10 = this.f1224d.g(this.f1221a.e(cls))) == null && (e10 = l(cls)) == null) ? T(cls) : V(e10, dVar);
    }

    public o y(j jVar, d dVar) {
        return o(this.f1223c.a(this, jVar, this.f1227g), dVar);
    }

    public o z(Class cls, d dVar) {
        return y(this.f1221a.e(cls), dVar);
    }

    protected B(B b10, z zVar, P5.q qVar) {
        this.f1226f = f1220n;
        this.f1228h = R5.u.f8534c;
        o oVar = f1219m;
        this.f1229i = oVar;
        this.f1223c = qVar;
        this.f1221a = zVar;
        P5.p pVar = b10.f1224d;
        this.f1224d = pVar;
        this.f1226f = b10.f1226f;
        this.f1227g = b10.f1227g;
        o oVar2 = b10.f1228h;
        this.f1228h = oVar2;
        this.f1229i = b10.f1229i;
        this.f1232l = oVar2 == oVar;
        this.f1222b = zVar.J();
        this.f1225e = zVar.K();
        this.f1230j = pVar.e();
    }
}
