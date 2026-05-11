package P5;

import D5.AbstractC0776b;
import D5.B;
import D5.d;
import D5.t;
import D5.u;
import D5.v;
import D5.w;
import D5.z;
import K5.AbstractC0928i;
import K5.C0926g;
import R5.K;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import v5.C;
import v5.I;
import v5.InterfaceC4947n;
import v5.L;
import v5.q;

/* loaded from: classes2.dex */
public class f extends b implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final f f7504d = new f(null);

    protected f(F5.o oVar) {
        super(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected c G(B b10, K5.s sVar, l lVar, boolean z10, AbstractC0928i abstractC0928i) {
        w q10 = sVar.q();
        D5.j e10 = abstractC0928i.e();
        D5.d aVar = new d.a(q10, e10, sVar.y(), abstractC0928i, sVar.s());
        D5.o D10 = D(b10, abstractC0928i);
        if (D10 instanceof o) {
            ((o) D10).b(b10);
        }
        return lVar.c(b10, sVar, e10, b10.U(D10, aVar), U(e10, b10.f(), abstractC0928i), (e10.A() || e10.b()) ? T(e10, b10.f(), abstractC0928i) : null, abstractC0928i, z10);
    }

    protected D5.o H(B b10, D5.j jVar, D5.c cVar, boolean z10) {
        D5.o oVar;
        z f10 = b10.f();
        if (jVar.A()) {
            if (!z10) {
                z10 = F(f10, cVar, null);
            }
            oVar = l(b10, jVar, cVar, z10);
            if (oVar != null) {
                return oVar;
            }
        } else {
            if (jVar.b()) {
                oVar = y(b10, (S5.j) jVar, cVar, z10);
            } else {
                Iterator it = t().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
                oVar = null;
            }
            if (oVar == null) {
                oVar = A(b10, jVar, cVar);
            }
        }
        if (oVar == null && (oVar = B(jVar, f10, cVar, z10)) == null && (oVar = C(b10, jVar, cVar, z10)) == null && (oVar = R(b10, jVar, cVar, z10)) == null) {
            oVar = b10.T(cVar.i());
        }
        if (oVar != null && this.f7474a.b()) {
            Iterator it2 = this.f7474a.d().iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        return oVar;
    }

    protected D5.o I(B b10, D5.j jVar, D5.c cVar) {
        String a10 = T5.d.a(jVar);
        if (a10 == null || b10.f().a(jVar.q()) != null) {
            return null;
        }
        return new Q5.q(jVar, a10);
    }

    protected boolean J(B b10, D5.j jVar) {
        Class q10 = jVar.q();
        return D5.s.class.isAssignableFrom(q10) || t.class.isAssignableFrom(q10) || u.class.isAssignableFrom(q10) || D5.e.class.isAssignableFrom(q10) || com.fasterxml.jackson.core.p.class.isAssignableFrom(q10) || com.fasterxml.jackson.core.h.class.isAssignableFrom(q10) || com.fasterxml.jackson.core.f.class.isAssignableFrom(q10);
    }

    protected D5.o K(B b10, D5.j jVar, D5.c cVar, boolean z10) {
        if (cVar.i() == Object.class) {
            return b10.T(Object.class);
        }
        D5.o I10 = I(b10, jVar, cVar);
        if (I10 != null) {
            return I10;
        }
        if (J(b10, jVar)) {
            return new K(jVar);
        }
        z f10 = b10.f();
        e L10 = L(cVar);
        L10.j(f10);
        List S10 = S(b10, cVar, L10);
        List arrayList = S10 == null ? new ArrayList() : Y(b10, cVar, L10, S10);
        b10.J().d(f10, cVar.k(), arrayList);
        if (this.f7474a.b()) {
            Iterator it = this.f7474a.d().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        List P10 = P(f10, cVar, Q(f10, cVar, arrayList));
        if (this.f7474a.b()) {
            Iterator it2 = this.f7474a.d().iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        L10.m(N(b10, cVar, P10));
        L10.n(P10);
        L10.k(w(f10, cVar));
        AbstractC0928i a10 = cVar.a();
        if (a10 != null) {
            D5.j e10 = a10.e();
            D5.j k10 = e10.k();
            M5.g c10 = c(f10, k10);
            D5.o D10 = D(b10, a10);
            if (D10 == null) {
                D10 = R5.t.F(null, e10, f10.D(D5.q.USE_STATIC_TYPING), c10, null, null, null);
            }
            L10.i(new a(new d.a(w.a(a10.c()), k10, null, a10, v.f1284i), a10, D10));
        }
        W(f10, L10);
        if (this.f7474a.b()) {
            Iterator it3 = this.f7474a.d().iterator();
            if (it3.hasNext()) {
                android.support.v4.media.session.b.a(it3.next());
                throw null;
            }
        }
        try {
            D5.o a11 = L10.a();
            if (a11 == null) {
                if (jVar.I()) {
                    return L10.b();
                }
                a11 = z(f10, jVar, cVar, z10);
                if (a11 == null && cVar.n()) {
                    return L10.b();
                }
            }
            return a11;
        } catch (RuntimeException e11) {
            return (D5.o) b10.d0(cVar, "Failed to construct BeanSerializer for %s: (%s) %s", cVar.m(), e11.getClass().getName(), e11.getMessage());
        }
    }

    protected e L(D5.c cVar) {
        return new e(cVar);
    }

    protected c M(c cVar, Class[] clsArr) {
        return Q5.d.a(cVar, clsArr);
    }

    protected Q5.i N(B b10, D5.c cVar, List list) {
        K5.B l10 = cVar.l();
        if (l10 == null) {
            return null;
        }
        Class c10 = l10.c();
        if (c10 != L.class) {
            return Q5.i.a(b10.g().E(b10.d(c10), I.class)[0], l10.d(), b10.h(cVar.k(), l10), l10.b());
        }
        String c11 = l10.d().c();
        int size = list.size();
        for (int i10 = 0; i10 != size; i10++) {
            c cVar2 = (c) list.get(i10);
            if (c11.equals(cVar2.l())) {
                if (i10 > 0) {
                    list.remove(i10);
                    list.add(0, cVar2);
                }
                return Q5.i.a(cVar2.getType(), null, new Q5.j(l10, cVar2), l10.b());
            }
        }
        throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", T5.f.C(cVar.m()), T5.f.P(c11)));
    }

    protected l O(z zVar, D5.c cVar) {
        return new l(zVar, cVar);
    }

    protected List P(z zVar, D5.c cVar, List list) {
        InterfaceC4947n.a M10 = zVar.M(cVar.i(), cVar.k());
        Set g10 = M10 != null ? M10.g() : null;
        q.a O10 = zVar.O(cVar.i(), cVar.k());
        Set e10 = O10 != null ? O10.e() : null;
        if (e10 != null || (g10 != null && !g10.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (T5.j.b(((c) it.next()).l(), g10, e10)) {
                    it.remove();
                }
            }
        }
        return list;
    }

    protected List Q(z zVar, D5.c cVar, List list) {
        if (cVar.m().J(CharSequence.class) && list.size() == 1) {
            AbstractC0928i a10 = ((c) list.get(0)).a();
            if ((a10 instanceof K5.j) && "isEmpty".equals(a10.c()) && a10.j() == CharSequence.class) {
                list.remove(0);
            }
        }
        return list;
    }

    public D5.o R(B b10, D5.j jVar, D5.c cVar, boolean z10) {
        if (V(jVar.q()) || T5.f.G(jVar.q())) {
            return K(b10, jVar, cVar, z10);
        }
        return null;
    }

    protected List S(B b10, D5.c cVar, e eVar) {
        List<K5.s> f10 = cVar.f();
        z f11 = b10.f();
        X(f11, cVar, f10);
        if (f11.D(D5.q.REQUIRE_SETTERS_FOR_GETTERS)) {
            Z(f11, cVar, f10);
        }
        if (f10.isEmpty()) {
            return null;
        }
        boolean F10 = F(f11, cVar, null);
        l O10 = O(f11, cVar);
        ArrayList arrayList = new ArrayList(f10.size());
        for (K5.s sVar : f10) {
            AbstractC0928i n10 = sVar.n();
            if (!sVar.A()) {
                AbstractC0776b.a d10 = sVar.d();
                if (d10 == null || !d10.b()) {
                    if (n10 instanceof K5.j) {
                        arrayList.add(G(b10, sVar, O10, F10, (K5.j) n10));
                    } else {
                        arrayList.add(G(b10, sVar, O10, F10, (C0926g) n10));
                    }
                }
            } else if (n10 != null) {
                eVar.o(n10);
            }
        }
        return arrayList;
    }

    public M5.g T(D5.j jVar, z zVar, AbstractC0928i abstractC0928i) {
        D5.j k10 = jVar.k();
        M5.f x10 = zVar.g().x(zVar, abstractC0928i, jVar);
        return x10 == null ? c(zVar, k10) : x10.d(zVar, k10, zVar.R().b(zVar, abstractC0928i, k10));
    }

    public M5.g U(D5.j jVar, z zVar, AbstractC0928i abstractC0928i) {
        M5.f F10 = zVar.g().F(zVar, abstractC0928i, jVar);
        return F10 == null ? c(zVar, jVar) : F10.d(zVar, jVar, zVar.R().b(zVar, abstractC0928i, jVar));
    }

    protected boolean V(Class cls) {
        return T5.f.f(cls) == null && !T5.f.M(cls);
    }

    protected void W(z zVar, e eVar) {
        List g10 = eVar.g();
        boolean D10 = zVar.D(D5.q.DEFAULT_VIEW_INCLUSION);
        int size = g10.size();
        c[] cVarArr = new c[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) g10.get(i11);
            Class[] o10 = cVar.o();
            if (o10 != null && o10.length != 0) {
                i10++;
                cVarArr[i11] = M(cVar, o10);
            } else if (D10) {
                cVarArr[i11] = cVar;
            }
        }
        if (D10 && i10 == 0) {
            return;
        }
        eVar.l(cVarArr);
    }

    protected void X(z zVar, D5.c cVar, List list) {
        AbstractC0776b g10 = zVar.g();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            K5.s sVar = (K5.s) it.next();
            if (sVar.n() == null) {
                it.remove();
            } else {
                Class w10 = sVar.w();
                Boolean bool = (Boolean) hashMap.get(w10);
                if (bool == null) {
                    bool = zVar.j(w10).f();
                    if (bool == null && (bool = g10.g0(zVar.B(w10).k())) == null) {
                        bool = Boolean.FALSE;
                    }
                    hashMap.put(w10, bool);
                }
                if (bool.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    protected List Y(B b10, D5.c cVar, e eVar, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar2 = (c) list.get(i10);
            M5.g n10 = cVar2.n();
            if (n10 != null && n10.c() == C.a.EXTERNAL_PROPERTY) {
                w a10 = w.a(n10.b());
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    c cVar3 = (c) it.next();
                    if (cVar3 != cVar2 && cVar3.z(a10)) {
                        cVar2.i(null);
                        break;
                    }
                }
            }
        }
        return list;
    }

    protected void Z(z zVar, D5.c cVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            K5.s sVar = (K5.s) it.next();
            if (!sVar.b() && !sVar.z()) {
                it.remove();
            }
        }
    }

    @Override // P5.q
    public D5.o b(B b10, D5.j jVar) {
        D5.j j02;
        z f10 = b10.f();
        D5.c Y10 = f10.Y(jVar);
        D5.o D10 = D(b10, Y10.k());
        if (D10 != null) {
            return D10;
        }
        AbstractC0776b g10 = f10.g();
        boolean z10 = false;
        if (g10 == null) {
            j02 = jVar;
        } else {
            try {
                j02 = g10.j0(f10, Y10.k(), jVar);
            } catch (D5.l e10) {
                return (D5.o) b10.d0(Y10, e10.getMessage(), new Object[0]);
            }
        }
        if (j02 != jVar) {
            z10 = true;
            if (!j02.x(jVar.q())) {
                Y10 = f10.Y(j02);
            }
        }
        Y10.h();
        return H(b10, j02, Y10, z10);
    }

    @Override // P5.b
    protected Iterable t() {
        return this.f7474a.e();
    }
}
