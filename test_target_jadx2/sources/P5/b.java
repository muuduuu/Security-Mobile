package P5;

import D5.B;
import D5.z;
import E5.e;
import K5.AbstractC0921b;
import K5.AbstractC0928i;
import K5.C0922c;
import R5.A;
import R5.C;
import R5.C1130c;
import R5.C1132e;
import R5.C1134g;
import R5.C1135h;
import R5.C1137j;
import R5.C1138k;
import R5.C1140m;
import R5.C1141n;
import R5.D;
import R5.F;
import R5.I;
import R5.J;
import R5.K;
import R5.L;
import R5.N;
import R5.t;
import R5.v;
import R5.w;
import R5.x;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import v5.InterfaceC4942i;
import v5.InterfaceC4947n;
import v5.p;
import v5.q;

/* loaded from: classes2.dex */
public abstract class b extends q implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    protected static final HashMap f7472b;

    /* renamed from: c, reason: collision with root package name */
    protected static final HashMap f7473c;

    /* renamed from: a, reason: collision with root package name */
    protected final F5.o f7474a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7475a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f7476b;

        static {
            int[] iArr = new int[p.a.values().length];
            f7476b = iArr;
            try {
                iArr[p.a.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7476b[p.a.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7476b[p.a.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7476b[p.a.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7476b[p.a.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7476b[p.a.USE_DEFAULTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[InterfaceC4942i.c.values().length];
            f7475a = iArr2;
            try {
                iArr2[InterfaceC4942i.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7475a[InterfaceC4942i.c.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7475a[InterfaceC4942i.c.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(String.class.getName(), new I());
        L l10 = L.f8474c;
        hashMap2.put(StringBuffer.class.getName(), l10);
        hashMap2.put(StringBuilder.class.getName(), l10);
        hashMap2.put(Character.class.getName(), l10);
        hashMap2.put(Character.TYPE.getName(), l10);
        w.a(hashMap2);
        hashMap2.put(Boolean.TYPE.getName(), new C1132e(true));
        hashMap2.put(Boolean.class.getName(), new C1132e(false));
        hashMap2.put(BigInteger.class.getName(), new v(BigInteger.class));
        hashMap2.put(BigDecimal.class.getName(), new v(BigDecimal.class));
        hashMap2.put(Calendar.class.getName(), C1135h.f8499f);
        hashMap2.put(Date.class.getName(), C1138k.f8500f);
        for (Map.Entry entry : D.a()) {
            Object value = entry.getValue();
            if (value instanceof D5.o) {
                hashMap2.put(((Class) entry.getKey()).getName(), (D5.o) value);
            } else {
                hashMap.put(((Class) entry.getKey()).getName(), (Class) value);
            }
        }
        hashMap.put(T5.q.class.getName(), N.class);
        f7472b = hashMap2;
        f7473c = hashMap;
    }

    protected b(F5.o oVar) {
        this.f7474a = oVar == null ? new F5.o() : oVar;
    }

    protected final D5.o A(B b10, D5.j jVar, D5.c cVar) {
        if (D5.n.class.isAssignableFrom(jVar.q())) {
            return A.f8458c;
        }
        AbstractC0928i e10 = cVar.e();
        if (e10 == null) {
            return null;
        }
        if (b10.q()) {
            T5.f.g(e10.l(), b10.Y(D5.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        D5.j e11 = e10.e();
        D5.o D10 = D(b10, e10);
        if (D10 == null) {
            D10 = (D5.o) e11.u();
        }
        M5.g gVar = (M5.g) e11.t();
        if (gVar == null) {
            gVar = c(b10.f(), e11);
        }
        return new R5.s(e10, gVar, D10);
    }

    protected final D5.o B(D5.j jVar, z zVar, D5.c cVar, boolean z10) {
        Class cls;
        String name = jVar.q().getName();
        D5.o oVar = (D5.o) f7472b.get(name);
        return (oVar != null || (cls = (Class) f7473c.get(name)) == null) ? oVar : (D5.o) T5.f.k(cls, false);
    }

    protected final D5.o C(B b10, D5.j jVar, D5.c cVar, boolean z10) {
        if (jVar.C()) {
            return m(b10.f(), jVar, cVar);
        }
        Class q10 = jVar.q();
        D5.o x10 = x(b10, jVar, cVar, z10);
        if (x10 != null) {
            return x10;
        }
        if (Calendar.class.isAssignableFrom(q10)) {
            return C1135h.f8499f;
        }
        if (Date.class.isAssignableFrom(q10)) {
            return C1138k.f8500f;
        }
        if (Map.Entry.class.isAssignableFrom(q10)) {
            D5.j i10 = jVar.i(Map.Entry.class);
            return r(b10, jVar, cVar, z10, i10.h(0), i10.h(1));
        }
        if (ByteBuffer.class.isAssignableFrom(q10)) {
            return new C1134g();
        }
        if (InetAddress.class.isAssignableFrom(q10)) {
            return new R5.p();
        }
        if (InetSocketAddress.class.isAssignableFrom(q10)) {
            return new R5.q();
        }
        if (TimeZone.class.isAssignableFrom(q10)) {
            return new J();
        }
        if (Charset.class.isAssignableFrom(q10)) {
            return L.f8474c;
        }
        if (!Number.class.isAssignableFrom(q10)) {
            if (ClassLoader.class.isAssignableFrom(q10)) {
                return new K(jVar);
            }
            return null;
        }
        int i11 = a.f7475a[cVar.c(null).h().ordinal()];
        if (i11 == 1) {
            return L.f8474c;
        }
        if (i11 == 2 || i11 == 3) {
            return null;
        }
        return v.f8535d;
    }

    protected D5.o D(B b10, AbstractC0921b abstractC0921b) {
        Object O10 = b10.J().O(abstractC0921b);
        if (O10 == null) {
            return null;
        }
        return v(b10, abstractC0921b, b10.g0(abstractC0921b, O10));
    }

    protected boolean E(Class cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    protected boolean F(z zVar, D5.c cVar, M5.g gVar) {
        if (gVar != null) {
            return false;
        }
        e.b N10 = zVar.g().N(cVar.k());
        return (N10 == null || N10 == e.b.DEFAULT_TYPING) ? zVar.D(D5.q.USE_STATIC_TYPING) : N10 == e.b.STATIC;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    @Override // P5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D5.o a(B b10, D5.j jVar, D5.o oVar) {
        z f10 = b10.f();
        D5.c Y10 = f10.Y(jVar);
        if (this.f7474a.a()) {
            Iterator it = this.f7474a.c().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        D5.o g10 = g(b10, Y10.k());
        if (g10 == null) {
            if (oVar == null) {
                g10 = F.b(f10, jVar.q(), false);
                if (g10 == null) {
                    AbstractC0928i d10 = Y10.d();
                    if (d10 == null) {
                        d10 = Y10.e();
                    }
                    if (d10 != null) {
                        D5.o a10 = a(b10, d10.e(), oVar);
                        if (f10.b()) {
                            T5.f.g(d10.l(), f10.D(D5.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                        }
                        oVar = new R5.s(d10, null, a10);
                    } else {
                        oVar = F.a(f10, jVar.q());
                    }
                }
            }
            if (this.f7474a.b()) {
                Iterator it2 = this.f7474a.d().iterator();
                if (it2.hasNext()) {
                    android.support.v4.media.session.b.a(it2.next());
                    throw null;
                }
            }
            return oVar;
        }
        oVar = g10;
        if (this.f7474a.b()) {
        }
        return oVar;
    }

    @Override // P5.q
    public M5.g c(z zVar, D5.j jVar) {
        Collection a10;
        C0922c k10 = zVar.B(jVar.q()).k();
        M5.f S10 = zVar.g().S(zVar, k10, jVar);
        if (S10 == null) {
            S10 = zVar.s(jVar);
            a10 = null;
        } else {
            a10 = zVar.R().a(zVar, k10);
        }
        if (S10 == null) {
            return null;
        }
        return S10.d(zVar, jVar, a10);
    }

    protected t d(B b10, D5.c cVar, t tVar) {
        D5.j H10 = tVar.H();
        p.b f10 = f(b10, cVar, H10, Map.class);
        p.a f11 = f10 == null ? p.a.USE_DEFAULTS : f10.f();
        Object obj = null;
        boolean z10 = true;
        if (f11 == p.a.USE_DEFAULTS || f11 == p.a.ALWAYS) {
            return !b10.Z(D5.A.WRITE_NULL_MAP_VALUES) ? tVar.Q(null, true) : tVar;
        }
        int i10 = a.f7476b[f11.ordinal()];
        if (i10 == 1) {
            obj = T5.d.b(H10);
            if (obj != null && obj.getClass().isArray()) {
                obj = T5.b.a(obj);
            }
        } else if (i10 != 2) {
            if (i10 == 3) {
                obj = t.f8517s;
            } else if (i10 == 4 && (obj = b10.W(null, f10.e())) != null) {
                z10 = b10.X(obj);
            }
        } else if (H10.b()) {
            obj = t.f8517s;
        }
        return tVar.Q(obj, z10);
    }

    protected D5.o e(B b10, AbstractC0921b abstractC0921b) {
        Object f10 = b10.J().f(abstractC0921b);
        if (f10 != null) {
            return b10.g0(abstractC0921b, f10);
        }
        return null;
    }

    protected p.b f(B b10, D5.c cVar, D5.j jVar, Class cls) {
        z f10 = b10.f();
        p.b q10 = f10.q(cls, cVar.g(f10.N()));
        p.b q11 = f10.q(jVar.q(), null);
        if (q11 == null) {
            return q10;
        }
        int i10 = a.f7476b[q11.h().ordinal()];
        return i10 != 4 ? i10 != 6 ? q10.l(q11.h()) : q10 : q10.k(q11.e());
    }

    protected D5.o g(B b10, AbstractC0921b abstractC0921b) {
        Object o10 = b10.J().o(abstractC0921b);
        if (o10 != null) {
            return b10.g0(abstractC0921b, o10);
        }
        return null;
    }

    protected D5.o h(B b10, S5.a aVar, D5.c cVar, boolean z10, M5.g gVar, D5.o oVar) {
        b10.f();
        Iterator it = t().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        Class q10 = aVar.q();
        D5.o a10 = (oVar == null || T5.f.J(oVar)) ? String[].class == q10 ? Q5.m.f8222g : C.a(q10) : null;
        if (a10 == null) {
            a10 = new x(aVar.k(), z10, gVar, oVar);
        }
        if (this.f7474a.b()) {
            Iterator it2 = this.f7474a.d().iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        return a10;
    }

    protected D5.o i(B b10, S5.j jVar, D5.c cVar, boolean z10, M5.g gVar, D5.o oVar) {
        boolean z11;
        D5.j a10 = jVar.a();
        p.b f10 = f(b10, cVar, a10, AtomicReference.class);
        p.a f11 = f10 == null ? p.a.USE_DEFAULTS : f10.f();
        Object obj = null;
        if (f11 == p.a.USE_DEFAULTS || f11 == p.a.ALWAYS) {
            z11 = false;
        } else {
            int i10 = a.f7476b[f11.ordinal()];
            z11 = true;
            if (i10 == 1) {
                obj = T5.d.b(a10);
                if (obj != null && obj.getClass().isArray()) {
                    obj = T5.b.a(obj);
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    obj = t.f8517s;
                } else if (i10 == 4 && (obj = b10.W(null, f10.e())) != null) {
                    z11 = b10.X(obj);
                }
            } else if (a10.b()) {
                obj = t.f8517s;
            }
        }
        return new C1130c(jVar, z10, gVar, oVar).B(obj, z11);
    }

    protected D5.o j(B b10, S5.e eVar, D5.c cVar, boolean z10, M5.g gVar, D5.o oVar) {
        b10.f();
        Iterator it = t().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        D5.o A10 = A(b10, eVar, cVar);
        if (A10 == null) {
            if (cVar.c(null).h() == InterfaceC4942i.c.OBJECT) {
                return null;
            }
            Class q10 = eVar.q();
            if (EnumSet.class.isAssignableFrom(q10)) {
                D5.j k10 = eVar.k();
                if (!k10.B()) {
                    k10 = null;
                }
                A10 = n(k10);
            } else {
                Class q11 = eVar.k().q();
                if (E(q10)) {
                    if (q11 != String.class) {
                        A10 = o(eVar.k(), z10, gVar, oVar);
                    } else if (T5.f.J(oVar)) {
                        A10 = Q5.f.f8179d;
                    }
                } else if (q11 == String.class && T5.f.J(oVar)) {
                    A10 = Q5.n.f8224d;
                }
                if (A10 == null) {
                    A10 = k(eVar.k(), z10, gVar, oVar);
                }
            }
        }
        if (this.f7474a.b()) {
            Iterator it2 = this.f7474a.d().iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        return A10;
    }

    public h k(D5.j jVar, boolean z10, M5.g gVar, D5.o oVar) {
        return new C1137j(jVar, z10, gVar, oVar);
    }

    protected D5.o l(B b10, D5.j jVar, D5.c cVar, boolean z10) {
        z f10 = b10.f();
        if (!z10 && jVar.M() && (!jVar.A() || !jVar.k().F())) {
            z10 = true;
        }
        M5.g c10 = c(f10, jVar.k());
        if (c10 != null) {
            z10 = false;
        }
        boolean z11 = z10;
        D5.o e10 = e(b10, cVar.k());
        if (jVar.G()) {
            S5.g gVar = (S5.g) jVar;
            D5.o g10 = g(b10, cVar.k());
            if (gVar instanceof S5.h) {
                return s(b10, (S5.h) gVar, cVar, z11, g10, c10, e10);
            }
            Iterator it = t().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            D5.o A10 = A(b10, jVar, cVar);
            if (A10 != null && this.f7474a.b()) {
                Iterator it2 = this.f7474a.d().iterator();
                if (it2.hasNext()) {
                    android.support.v4.media.session.b.a(it2.next());
                    throw null;
                }
            }
            return A10;
        }
        if (!jVar.z()) {
            if (jVar.y()) {
                return h(b10, (S5.a) jVar, cVar, z11, c10, e10);
            }
            return null;
        }
        S5.d dVar = (S5.d) jVar;
        if (dVar instanceof S5.e) {
            return j(b10, (S5.e) dVar, cVar, z11, c10, e10);
        }
        Iterator it3 = t().iterator();
        if (it3.hasNext()) {
            android.support.v4.media.session.b.a(it3.next());
            throw null;
        }
        D5.o A11 = A(b10, jVar, cVar);
        if (A11 != null && this.f7474a.b()) {
            Iterator it4 = this.f7474a.d().iterator();
            if (it4.hasNext()) {
                android.support.v4.media.session.b.a(it4.next());
                throw null;
            }
        }
        return A11;
    }

    protected D5.o m(z zVar, D5.j jVar, D5.c cVar) {
        InterfaceC4942i.d c10 = cVar.c(null);
        if (c10.h() == InterfaceC4942i.c.OBJECT) {
            ((K5.q) cVar).t("declaringClass");
            return null;
        }
        C1140m x10 = C1140m.x(jVar.q(), zVar, cVar, c10);
        if (this.f7474a.b()) {
            Iterator it = this.f7474a.d().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        return x10;
    }

    public D5.o n(D5.j jVar) {
        return new C1141n(jVar);
    }

    public h o(D5.j jVar, boolean z10, M5.g gVar, D5.o oVar) {
        return new Q5.e(jVar, z10, gVar, oVar);
    }

    protected D5.o p(z zVar, D5.j jVar, D5.c cVar, boolean z10, D5.j jVar2) {
        return new R5.r(jVar2, z10, c(zVar, jVar2));
    }

    protected D5.o q(z zVar, D5.j jVar, D5.c cVar, boolean z10, D5.j jVar2) {
        return new Q5.g(jVar2, z10, c(zVar, jVar2));
    }

    protected D5.o r(B b10, D5.j jVar, D5.c cVar, boolean z10, D5.j jVar2, D5.j jVar3) {
        Object obj = null;
        if (InterfaceC4942i.d.o(cVar.c(null), b10.N(Map.Entry.class)).h() == InterfaceC4942i.c.OBJECT) {
            return null;
        }
        Q5.h hVar = new Q5.h(jVar3, jVar2, jVar3, z10, c(b10.f(), jVar3), null);
        D5.j z11 = hVar.z();
        p.b f10 = f(b10, cVar, z11, Map.Entry.class);
        p.a f11 = f10 == null ? p.a.USE_DEFAULTS : f10.f();
        if (f11 == p.a.USE_DEFAULTS || f11 == p.a.ALWAYS) {
            return hVar;
        }
        int i10 = a.f7476b[f11.ordinal()];
        boolean z12 = true;
        if (i10 == 1) {
            obj = T5.d.b(z11);
            if (obj != null && obj.getClass().isArray()) {
                obj = T5.b.a(obj);
            }
        } else if (i10 != 2) {
            if (i10 == 3) {
                obj = t.f8517s;
            } else if (i10 == 4 && (obj = b10.W(null, f10.e())) != null) {
                z12 = b10.X(obj);
            }
        } else if (z11.b()) {
            obj = t.f8517s;
        }
        return hVar.E(obj, z12);
    }

    protected D5.o s(B b10, S5.h hVar, D5.c cVar, boolean z10, D5.o oVar, M5.g gVar, D5.o oVar2) {
        if (cVar.c(null).h() == InterfaceC4942i.c.OBJECT) {
            return null;
        }
        z f10 = b10.f();
        Iterator it = t().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        D5.o A10 = A(b10, hVar, cVar);
        if (A10 == null) {
            Object w10 = w(f10, cVar);
            InterfaceC4947n.a M10 = f10.M(Map.class, cVar.k());
            Set g10 = M10 == null ? null : M10.g();
            q.a O10 = f10.O(Map.class, cVar.k());
            A10 = d(b10, cVar, t.G(g10, O10 == null ? null : O10.e(), hVar, z10, gVar, oVar, oVar2, w10));
        }
        if (this.f7474a.b()) {
            Iterator it2 = this.f7474a.d().iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        return A10;
    }

    protected abstract Iterable t();

    protected T5.h u(B b10, AbstractC0921b abstractC0921b) {
        Object K10 = b10.J().K(abstractC0921b);
        if (K10 == null) {
            return null;
        }
        b10.e(abstractC0921b, K10);
        return null;
    }

    protected D5.o v(B b10, AbstractC0921b abstractC0921b, D5.o oVar) {
        u(b10, abstractC0921b);
        return oVar;
    }

    protected Object w(z zVar, D5.c cVar) {
        return zVar.g().j(cVar.k());
    }

    protected D5.o x(B b10, D5.j jVar, D5.c cVar, boolean z10) {
        return J5.e.f4784e.b(b10.f(), jVar, cVar);
    }

    public D5.o y(B b10, S5.j jVar, D5.c cVar, boolean z10) {
        D5.j k10 = jVar.k();
        M5.g gVar = (M5.g) k10.t();
        z f10 = b10.f();
        if (gVar == null) {
            gVar = c(f10, k10);
        }
        M5.g gVar2 = gVar;
        D5.o oVar = (D5.o) k10.u();
        Iterator it = t().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        if (jVar.J(AtomicReference.class)) {
            return i(b10, jVar, cVar, z10, gVar2, oVar);
        }
        return null;
    }

    protected final D5.o z(z zVar, D5.j jVar, D5.c cVar, boolean z10) {
        Class q10 = jVar.q();
        if (Iterator.class.isAssignableFrom(q10)) {
            D5.j[] E10 = zVar.z().E(jVar, Iterator.class);
            return q(zVar, jVar, cVar, z10, (E10 == null || E10.length != 1) ? S5.o.H() : E10[0]);
        }
        if (Iterable.class.isAssignableFrom(q10)) {
            D5.j[] E11 = zVar.z().E(jVar, Iterable.class);
            return p(zVar, jVar, cVar, z10, (E11 == null || E11.length != 1) ? S5.o.H() : E11[0]);
        }
        if (CharSequence.class.isAssignableFrom(q10)) {
            return L.f8474c;
        }
        return null;
    }
}
