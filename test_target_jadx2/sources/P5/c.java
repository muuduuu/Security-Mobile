package P5;

import D5.A;
import D5.B;
import D5.w;
import D5.z;
import K5.AbstractC0928i;
import K5.C0926g;
import Q5.k;
import R5.AbstractC1131d;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import v5.p;

/* loaded from: classes2.dex */
public class c extends n implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public static final Object f7477s = p.a.NON_EMPTY;

    /* renamed from: b, reason: collision with root package name */
    protected final y5.h f7478b;

    /* renamed from: c, reason: collision with root package name */
    protected final w f7479c;

    /* renamed from: d, reason: collision with root package name */
    protected final D5.j f7480d;

    /* renamed from: e, reason: collision with root package name */
    protected final D5.j f7481e;

    /* renamed from: f, reason: collision with root package name */
    protected D5.j f7482f;

    /* renamed from: g, reason: collision with root package name */
    protected final transient T5.a f7483g;

    /* renamed from: h, reason: collision with root package name */
    protected final AbstractC0928i f7484h;

    /* renamed from: i, reason: collision with root package name */
    protected transient Method f7485i;

    /* renamed from: j, reason: collision with root package name */
    protected transient Field f7486j;

    /* renamed from: k, reason: collision with root package name */
    protected D5.o f7487k;

    /* renamed from: l, reason: collision with root package name */
    protected D5.o f7488l;

    /* renamed from: m, reason: collision with root package name */
    protected M5.g f7489m;

    /* renamed from: n, reason: collision with root package name */
    protected transient Q5.k f7490n;

    /* renamed from: o, reason: collision with root package name */
    protected final boolean f7491o;

    /* renamed from: p, reason: collision with root package name */
    protected final Object f7492p;

    /* renamed from: q, reason: collision with root package name */
    protected final Class[] f7493q;

    /* renamed from: r, reason: collision with root package name */
    protected transient HashMap f7494r;

    public c(K5.s sVar, AbstractC0928i abstractC0928i, T5.a aVar, D5.j jVar, D5.o oVar, M5.g gVar, D5.j jVar2, boolean z10, Object obj, Class[] clsArr) {
        super(sVar);
        this.f7484h = abstractC0928i;
        this.f7483g = aVar;
        this.f7478b = new y5.h(sVar.u());
        this.f7479c = sVar.y();
        this.f7480d = jVar;
        this.f7487k = oVar;
        this.f7490n = oVar == null ? Q5.k.c() : null;
        this.f7489m = gVar;
        this.f7481e = jVar2;
        if (abstractC0928i instanceof C0926g) {
            this.f7485i = null;
            this.f7486j = (Field) abstractC0928i.l();
        } else if (abstractC0928i instanceof K5.j) {
            this.f7485i = (Method) abstractC0928i.l();
            this.f7486j = null;
        } else {
            this.f7485i = null;
            this.f7486j = null;
        }
        this.f7491o = z10;
        this.f7492p = obj;
        this.f7488l = null;
        this.f7493q = clsArr;
    }

    @Override // D5.d
    public AbstractC0928i a() {
        return this.f7484h;
    }

    protected D5.o d(Q5.k kVar, Class cls, B b10) {
        D5.j jVar = this.f7482f;
        k.d e10 = jVar != null ? kVar.e(b10.r(jVar, cls), b10, this) : kVar.f(cls, b10, this);
        Q5.k kVar2 = e10.f8208b;
        if (kVar != kVar2) {
            this.f7490n = kVar2;
        }
        return e10.f8207a;
    }

    protected boolean e(Object obj, com.fasterxml.jackson.core.f fVar, B b10, D5.o oVar) {
        if (oVar.i()) {
            return false;
        }
        if (b10.Z(A.FAIL_ON_SELF_REFERENCES)) {
            if (!(oVar instanceof AbstractC1131d)) {
                return false;
            }
            b10.i(getType(), "Direct self-reference leading to cycle");
            return false;
        }
        if (!b10.Z(A.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        }
        if (this.f7488l == null) {
            return true;
        }
        if (!fVar.j().d()) {
            fVar.i0(this.f7478b);
        }
        this.f7488l.f(null, fVar, b10);
        return true;
    }

    protected c f(w wVar) {
        return new c(this, wVar);
    }

    public void g(D5.o oVar) {
        D5.o oVar2 = this.f7488l;
        if (oVar2 != null && oVar2 != oVar) {
            throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", T5.f.h(this.f7488l), T5.f.h(oVar)));
        }
        this.f7488l = oVar;
    }

    @Override // D5.d
    public D5.j getType() {
        return this.f7480d;
    }

    public void h(D5.o oVar) {
        D5.o oVar2 = this.f7487k;
        if (oVar2 != null && oVar2 != oVar) {
            throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", T5.f.h(this.f7487k), T5.f.h(oVar)));
        }
        this.f7487k = oVar;
    }

    public void i(M5.g gVar) {
        this.f7489m = gVar;
    }

    public void j(z zVar) {
        this.f7484h.h(zVar.D(D5.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public final Object k(Object obj) {
        Method method = this.f7485i;
        return method == null ? this.f7486j.get(obj) : method.invoke(obj, null);
    }

    public String l() {
        return this.f7478b.getValue();
    }

    public D5.j m() {
        return this.f7481e;
    }

    public M5.g n() {
        return this.f7489m;
    }

    public Class[] o() {
        return this.f7493q;
    }

    public boolean p() {
        return this.f7488l != null;
    }

    public boolean q() {
        return this.f7487k != null;
    }

    public c r(T5.m mVar) {
        String c10 = mVar.c(this.f7478b.getValue());
        return c10.equals(this.f7478b.toString()) ? this : f(w.a(c10));
    }

    public void s(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        Method method = this.f7485i;
        Object invoke = method == null ? this.f7486j.get(obj) : method.invoke(obj, null);
        if (invoke == null) {
            D5.o oVar = this.f7488l;
            if (oVar != null) {
                oVar.f(null, fVar, b10);
                return;
            } else {
                fVar.y0();
                return;
            }
        }
        D5.o oVar2 = this.f7487k;
        if (oVar2 == null) {
            Class<?> cls = invoke.getClass();
            Q5.k kVar = this.f7490n;
            D5.o j10 = kVar.j(cls);
            oVar2 = j10 == null ? d(kVar, cls, b10) : j10;
        }
        Object obj2 = this.f7492p;
        if (obj2 != null) {
            if (f7477s == obj2) {
                if (oVar2.d(b10, invoke)) {
                    v(obj, fVar, b10);
                    return;
                }
            } else if (obj2.equals(invoke)) {
                v(obj, fVar, b10);
                return;
            }
        }
        if (invoke == obj && e(obj, fVar, b10, oVar2)) {
            return;
        }
        M5.g gVar = this.f7489m;
        if (gVar == null) {
            oVar2.f(invoke, fVar, b10);
        } else {
            oVar2.g(invoke, fVar, b10, gVar);
        }
    }

    public void t(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        Method method = this.f7485i;
        Object invoke = method == null ? this.f7486j.get(obj) : method.invoke(obj, null);
        if (invoke == null) {
            if (this.f7488l != null) {
                fVar.i0(this.f7478b);
                this.f7488l.f(null, fVar, b10);
                return;
            }
            return;
        }
        D5.o oVar = this.f7487k;
        if (oVar == null) {
            Class<?> cls = invoke.getClass();
            Q5.k kVar = this.f7490n;
            D5.o j10 = kVar.j(cls);
            oVar = j10 == null ? d(kVar, cls, b10) : j10;
        }
        Object obj2 = this.f7492p;
        if (obj2 != null) {
            if (f7477s == obj2) {
                if (oVar.d(b10, invoke)) {
                    return;
                }
            } else if (obj2.equals(invoke)) {
                return;
            }
        }
        if (invoke == obj && e(obj, fVar, b10, oVar)) {
            return;
        }
        fVar.i0(this.f7478b);
        M5.g gVar = this.f7489m;
        if (gVar == null) {
            oVar.f(invoke, fVar, b10);
        } else {
            oVar.g(invoke, fVar, b10, gVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("property '");
        sb2.append(l());
        sb2.append("' (");
        if (this.f7485i != null) {
            sb2.append("via method ");
            sb2.append(this.f7485i.getDeclaringClass().getName());
            sb2.append("#");
            sb2.append(this.f7485i.getName());
        } else if (this.f7486j != null) {
            sb2.append("field \"");
            sb2.append(this.f7486j.getDeclaringClass().getName());
            sb2.append("#");
            sb2.append(this.f7486j.getName());
        } else {
            sb2.append("virtual");
        }
        if (this.f7487k == null) {
            sb2.append(", no static serializer");
        } else {
            sb2.append(", static serializer of type " + this.f7487k.getClass().getName());
        }
        sb2.append(')');
        return sb2.toString();
    }

    public void u(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        if (fVar.d()) {
            return;
        }
        fVar.t1(this.f7478b.getValue());
    }

    public void v(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        D5.o oVar = this.f7488l;
        if (oVar != null) {
            oVar.f(null, fVar, b10);
        } else {
            fVar.y0();
        }
    }

    public void w(D5.j jVar) {
        this.f7482f = jVar;
    }

    public c x(T5.m mVar) {
        return new Q5.r(this, mVar);
    }

    public boolean y() {
        return this.f7491o;
    }

    public boolean z(w wVar) {
        w wVar2 = this.f7479c;
        return wVar2 != null ? wVar2.equals(wVar) : wVar.f(this.f7478b.getValue()) && !wVar.d();
    }

    protected c(c cVar) {
        this(cVar, cVar.f7478b);
    }

    protected c(c cVar, w wVar) {
        super(cVar);
        this.f7478b = new y5.h(wVar.c());
        this.f7479c = cVar.f7479c;
        this.f7483g = cVar.f7483g;
        this.f7480d = cVar.f7480d;
        this.f7484h = cVar.f7484h;
        this.f7485i = cVar.f7485i;
        this.f7486j = cVar.f7486j;
        this.f7487k = cVar.f7487k;
        this.f7488l = cVar.f7488l;
        if (cVar.f7494r != null) {
            this.f7494r = new HashMap(cVar.f7494r);
        }
        this.f7481e = cVar.f7481e;
        this.f7490n = cVar.f7490n;
        this.f7491o = cVar.f7491o;
        this.f7492p = cVar.f7492p;
        this.f7493q = cVar.f7493q;
        this.f7489m = cVar.f7489m;
        this.f7482f = cVar.f7482f;
    }

    protected c(c cVar, y5.h hVar) {
        super(cVar);
        this.f7478b = hVar;
        this.f7479c = cVar.f7479c;
        this.f7484h = cVar.f7484h;
        this.f7483g = cVar.f7483g;
        this.f7480d = cVar.f7480d;
        this.f7485i = cVar.f7485i;
        this.f7486j = cVar.f7486j;
        this.f7487k = cVar.f7487k;
        this.f7488l = cVar.f7488l;
        if (cVar.f7494r != null) {
            this.f7494r = new HashMap(cVar.f7494r);
        }
        this.f7481e = cVar.f7481e;
        this.f7490n = cVar.f7490n;
        this.f7491o = cVar.f7491o;
        this.f7492p = cVar.f7492p;
        this.f7493q = cVar.f7493q;
        this.f7489m = cVar.f7489m;
        this.f7482f = cVar.f7482f;
    }
}
