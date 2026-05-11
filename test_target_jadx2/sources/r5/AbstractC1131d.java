package R5;

import D5.AbstractC0776b;
import K5.AbstractC0928i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.conscrypt.BuildConfig;
import v5.InterfaceC4942i;

/* renamed from: R5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1131d extends H implements P5.i, P5.o {

    /* renamed from: k, reason: collision with root package name */
    protected static final D5.w f8486k = new D5.w("#object-ref");

    /* renamed from: l, reason: collision with root package name */
    protected static final P5.c[] f8487l = new P5.c[0];

    /* renamed from: c, reason: collision with root package name */
    protected final D5.j f8488c;

    /* renamed from: d, reason: collision with root package name */
    protected final P5.c[] f8489d;

    /* renamed from: e, reason: collision with root package name */
    protected final P5.c[] f8490e;

    /* renamed from: f, reason: collision with root package name */
    protected final P5.a f8491f;

    /* renamed from: g, reason: collision with root package name */
    protected final Object f8492g;

    /* renamed from: h, reason: collision with root package name */
    protected final AbstractC0928i f8493h;

    /* renamed from: i, reason: collision with root package name */
    protected final Q5.i f8494i;

    /* renamed from: j, reason: collision with root package name */
    protected final InterfaceC4942i.c f8495j;

    /* renamed from: R5.d$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8496a;

        static {
            int[] iArr = new int[InterfaceC4942i.c.values().length];
            f8496a = iArr;
            try {
                iArr[InterfaceC4942i.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8496a[InterfaceC4942i.c.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8496a[InterfaceC4942i.c.NUMBER_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected AbstractC1131d(D5.j jVar, P5.e eVar, P5.c[] cVarArr, P5.c[] cVarArr2) {
        super(jVar);
        this.f8488c = jVar;
        this.f8489d = cVarArr;
        this.f8490e = cVarArr2;
        if (eVar == null) {
            this.f8493h = null;
            this.f8491f = null;
            this.f8492g = null;
            this.f8494i = null;
            this.f8495j = null;
            return;
        }
        this.f8493h = eVar.h();
        this.f8491f = eVar.c();
        this.f8492g = eVar.e();
        this.f8494i = eVar.f();
        this.f8495j = eVar.d().c(null).h();
    }

    private static final P5.c[] B(P5.c[] cVarArr, T5.m mVar) {
        if (cVarArr == null || cVarArr.length == 0 || mVar == null || mVar == T5.m.f9298a) {
            return cVarArr;
        }
        int length = cVarArr.length;
        P5.c[] cVarArr2 = new P5.c[length];
        for (int i10 = 0; i10 < length; i10++) {
            P5.c cVar = cVarArr[i10];
            if (cVar != null) {
                cVarArr2[i10] = cVar.r(mVar);
            }
        }
        return cVarArr2;
    }

    protected D5.o A(D5.B b10, P5.c cVar) {
        AbstractC0928i a10;
        Object K10;
        AbstractC0776b J10 = b10.J();
        if (J10 == null || (a10 = cVar.a()) == null || (K10 = J10.K(a10)) == null) {
            return null;
        }
        b10.e(cVar.a(), K10);
        b10.g();
        throw null;
    }

    protected void C(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        P5.c[] cVarArr = (this.f8490e == null || b10.I() == null) ? this.f8489d : this.f8490e;
        int i10 = 0;
        try {
            int length = cVarArr.length;
            while (i10 < length) {
                P5.c cVar = cVarArr[i10];
                if (cVar != null) {
                    cVar.t(obj, fVar, b10);
                }
                i10++;
            }
            P5.a aVar = this.f8491f;
            if (aVar != null) {
                aVar.b(obj, fVar, b10);
            }
        } catch (Exception e10) {
            u(b10, e10, obj, i10 != cVarArr.length ? cVarArr[i10].l() : "[anySetter]");
        } catch (StackOverflowError e11) {
            D5.l lVar = new D5.l(fVar, "Infinite recursion (StackOverflowError)", e11);
            lVar.e(obj, i10 != cVarArr.length ? cVarArr[i10].l() : "[anySetter]");
            throw lVar;
        }
    }

    protected void D(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        if (this.f8490e != null) {
            b10.I();
        }
        r(b10, this.f8492g, obj);
        C(obj, fVar, b10);
    }

    protected abstract AbstractC1131d E(Set set, Set set2);

    public abstract AbstractC1131d F(Object obj);

    public abstract AbstractC1131d G(Q5.i iVar);

    protected abstract AbstractC1131d H(P5.c[] cVarArr, P5.c[] cVarArr2);

    @Override // P5.i
    public D5.o a(D5.B b10, D5.d dVar) {
        InterfaceC4942i.c cVar;
        Object obj;
        Set set;
        Set set2;
        int i10;
        AbstractC1131d abstractC1131d;
        Q5.i c10;
        P5.c cVar2;
        Object obj2;
        K5.B v10;
        AbstractC0776b J10 = b10.J();
        P5.c[] cVarArr = null;
        AbstractC0928i a10 = (dVar == null || J10 == null) ? null : dVar.a();
        D5.z f10 = b10.f();
        InterfaceC4942i.d p10 = p(b10, dVar, this.f8473a);
        if (p10 == null || !p10.m()) {
            cVar = null;
        } else {
            cVar = p10.h();
            if (cVar != InterfaceC4942i.c.ANY && cVar != this.f8495j) {
                if (this.f8488c.C()) {
                    int i11 = a.f8496a[cVar.ordinal()];
                    if (i11 == 1 || i11 == 2 || i11 == 3) {
                        return b10.U(C1140m.x(this.f8488c.q(), b10.f(), f10.A(this.f8488c), p10), dVar);
                    }
                } else if (cVar == InterfaceC4942i.c.NATURAL && ((!this.f8488c.G() || !Map.class.isAssignableFrom(this.f8473a)) && Map.Entry.class.isAssignableFrom(this.f8473a))) {
                    D5.j i12 = this.f8488c.i(Map.Entry.class);
                    return b10.U(new Q5.h(this.f8488c, i12.h(0), i12.h(1), false, null, dVar), dVar);
                }
            }
        }
        Q5.i iVar = this.f8494i;
        if (a10 != null) {
            set2 = J10.A(f10, a10).g();
            set = J10.D(f10, a10).e();
            K5.B u10 = J10.u(a10);
            if (u10 == null) {
                if (iVar != null && (v10 = J10.v(a10, null)) != null) {
                    iVar = this.f8494i.b(v10.b());
                }
                i10 = 0;
            } else {
                K5.B v11 = J10.v(a10, u10);
                Class c11 = v11.c();
                D5.j jVar = b10.g().E(b10.d(c11), v5.I.class)[0];
                if (c11 == v5.L.class) {
                    String c12 = v11.d().c();
                    int length = this.f8489d.length;
                    i10 = 0;
                    while (true) {
                        if (i10 == length) {
                            b10.i(this.f8488c, String.format("Invalid Object Id definition for %s: cannot find property with name %s", T5.f.Q(c()), T5.f.P(c12)));
                        }
                        cVar2 = this.f8489d[i10];
                        if (c12.equals(cVar2.l())) {
                            break;
                        }
                        i10++;
                    }
                    iVar = Q5.i.a(cVar2.getType(), null, new Q5.j(v11, cVar2), v11.b());
                } else {
                    iVar = Q5.i.a(jVar, v11.d(), b10.h(a10, v11), v11.b());
                    i10 = 0;
                }
            }
            obj = J10.j(a10);
            if (obj == null || ((obj2 = this.f8492g) != null && obj.equals(obj2))) {
                obj = null;
            }
        } else {
            obj = null;
            set = null;
            set2 = null;
            i10 = 0;
        }
        if (i10 > 0) {
            P5.c[] cVarArr2 = this.f8489d;
            P5.c[] cVarArr3 = (P5.c[]) Arrays.copyOf(cVarArr2, cVarArr2.length);
            P5.c cVar3 = cVarArr3[i10];
            System.arraycopy(cVarArr3, 0, cVarArr3, 1, i10);
            cVarArr3[0] = cVar3;
            P5.c[] cVarArr4 = this.f8490e;
            if (cVarArr4 != null) {
                cVarArr = (P5.c[]) Arrays.copyOf(cVarArr4, cVarArr4.length);
                P5.c cVar4 = cVarArr[i10];
                System.arraycopy(cVarArr, 0, cVarArr, 1, i10);
                cVarArr[0] = cVar4;
            }
            abstractC1131d = H(cVarArr3, cVarArr);
        } else {
            abstractC1131d = this;
        }
        if (iVar != null && (c10 = iVar.c(b10.G(iVar.f8193a, dVar))) != this.f8494i) {
            abstractC1131d = abstractC1131d.G(c10);
        }
        if ((set2 != null && !set2.isEmpty()) || set != null) {
            abstractC1131d = abstractC1131d.E(set2, set);
        }
        if (obj != null) {
            abstractC1131d = abstractC1131d.F(obj);
        }
        if (cVar == null) {
            cVar = this.f8495j;
        }
        return cVar == InterfaceC4942i.c.ARRAY ? abstractC1131d.z() : abstractC1131d;
    }

    @Override // P5.o
    public void b(D5.B b10) {
        P5.c cVar;
        M5.g gVar;
        D5.o B10;
        P5.c cVar2;
        P5.c[] cVarArr = this.f8490e;
        int length = cVarArr == null ? 0 : cVarArr.length;
        int length2 = this.f8489d.length;
        for (int i10 = 0; i10 < length2; i10++) {
            P5.c cVar3 = this.f8489d[i10];
            if (!cVar3.y() && !cVar3.p() && (B10 = b10.B(cVar3)) != null) {
                cVar3.g(B10);
                if (i10 < length && (cVar2 = this.f8490e[i10]) != null) {
                    cVar2.g(B10);
                }
            }
            if (!cVar3.q()) {
                D5.o A10 = A(b10, cVar3);
                if (A10 == null) {
                    D5.j m10 = cVar3.m();
                    if (m10 == null) {
                        m10 = cVar3.getType();
                        if (!m10.D()) {
                            if (m10.A() || m10.g() > 0) {
                                cVar3.w(m10);
                            }
                        }
                    }
                    D5.o G10 = b10.G(m10, cVar3);
                    A10 = (m10.A() && (gVar = (M5.g) m10.k().t()) != null && (G10 instanceof P5.h)) ? ((P5.h) G10).w(gVar) : G10;
                }
                if (i10 >= length || (cVar = this.f8490e[i10]) == null) {
                    cVar3.h(A10);
                } else {
                    cVar.h(A10);
                }
            }
        }
        P5.a aVar = this.f8491f;
        if (aVar != null) {
            aVar.c(b10);
        }
    }

    @Override // D5.o
    public void g(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        if (this.f8494i != null) {
            w(obj, fVar, b10, gVar);
            return;
        }
        B5.b y10 = y(gVar, obj, com.fasterxml.jackson.core.k.START_OBJECT);
        gVar.g(fVar, y10);
        fVar.q(obj);
        if (this.f8492g != null) {
            D(obj, fVar, b10);
        } else {
            C(obj, fVar, b10);
        }
        gVar.h(fVar, y10);
    }

    @Override // D5.o
    public boolean i() {
        return this.f8494i != null;
    }

    protected void v(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar, Q5.t tVar) {
        Q5.i iVar = this.f8494i;
        B5.b y10 = y(gVar, obj, com.fasterxml.jackson.core.k.START_OBJECT);
        gVar.g(fVar, y10);
        fVar.q(obj);
        tVar.b(fVar, b10, iVar);
        if (this.f8492g != null) {
            D(obj, fVar, b10);
        } else {
            C(obj, fVar, b10);
        }
        gVar.h(fVar, y10);
    }

    protected final void w(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        Q5.i iVar = this.f8494i;
        Q5.t C10 = b10.C(obj, iVar.f8195c);
        if (C10.c(fVar, b10, iVar)) {
            return;
        }
        Object a10 = C10.a(obj);
        if (iVar.f8197e) {
            iVar.f8196d.f(a10, fVar, b10);
        } else {
            v(obj, fVar, b10, gVar, C10);
        }
    }

    protected final void x(Object obj, com.fasterxml.jackson.core.f fVar, D5.B b10, boolean z10) {
        Q5.i iVar = this.f8494i;
        Q5.t C10 = b10.C(obj, iVar.f8195c);
        if (C10.c(fVar, b10, iVar)) {
            return;
        }
        Object a10 = C10.a(obj);
        if (iVar.f8197e) {
            iVar.f8196d.f(a10, fVar, b10);
            return;
        }
        if (z10) {
            fVar.e2(obj);
        }
        C10.b(fVar, b10, iVar);
        if (this.f8492g != null) {
            D(obj, fVar, b10);
        } else {
            C(obj, fVar, b10);
        }
        if (z10) {
            fVar.N();
        }
    }

    protected final B5.b y(M5.g gVar, Object obj, com.fasterxml.jackson.core.k kVar) {
        AbstractC0928i abstractC0928i = this.f8493h;
        if (abstractC0928i == null) {
            return gVar.d(obj, kVar);
        }
        Object m10 = abstractC0928i.m(obj);
        if (m10 == null) {
            m10 = BuildConfig.FLAVOR;
        }
        return gVar.e(obj, kVar, m10);
    }

    protected abstract AbstractC1131d z();

    protected AbstractC1131d(AbstractC1131d abstractC1131d, P5.c[] cVarArr, P5.c[] cVarArr2) {
        super(abstractC1131d.f8473a);
        this.f8488c = abstractC1131d.f8488c;
        this.f8489d = cVarArr;
        this.f8490e = cVarArr2;
        this.f8493h = abstractC1131d.f8493h;
        this.f8491f = abstractC1131d.f8491f;
        this.f8494i = abstractC1131d.f8494i;
        this.f8492g = abstractC1131d.f8492g;
        this.f8495j = abstractC1131d.f8495j;
    }

    protected AbstractC1131d(AbstractC1131d abstractC1131d, Q5.i iVar) {
        this(abstractC1131d, iVar, abstractC1131d.f8492g);
    }

    protected AbstractC1131d(AbstractC1131d abstractC1131d, Q5.i iVar, Object obj) {
        super(abstractC1131d.f8473a);
        this.f8488c = abstractC1131d.f8488c;
        this.f8489d = abstractC1131d.f8489d;
        this.f8490e = abstractC1131d.f8490e;
        this.f8493h = abstractC1131d.f8493h;
        this.f8491f = abstractC1131d.f8491f;
        this.f8494i = iVar;
        this.f8492g = obj;
        this.f8495j = abstractC1131d.f8495j;
    }

    protected AbstractC1131d(AbstractC1131d abstractC1131d, Set set, Set set2) {
        super(abstractC1131d.f8473a);
        this.f8488c = abstractC1131d.f8488c;
        P5.c[] cVarArr = abstractC1131d.f8489d;
        P5.c[] cVarArr2 = abstractC1131d.f8490e;
        int length = cVarArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = cVarArr2 == null ? null : new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            P5.c cVar = cVarArr[i10];
            if (!T5.j.b(cVar.l(), set, set2)) {
                arrayList.add(cVar);
                if (cVarArr2 != null) {
                    arrayList2.add(cVarArr2[i10]);
                }
            }
        }
        this.f8489d = (P5.c[]) arrayList.toArray(new P5.c[arrayList.size()]);
        this.f8490e = arrayList2 != null ? (P5.c[]) arrayList2.toArray(new P5.c[arrayList2.size()]) : null;
        this.f8493h = abstractC1131d.f8493h;
        this.f8491f = abstractC1131d.f8491f;
        this.f8494i = abstractC1131d.f8494i;
        this.f8492g = abstractC1131d.f8492g;
        this.f8495j = abstractC1131d.f8495j;
    }

    protected AbstractC1131d(AbstractC1131d abstractC1131d, T5.m mVar) {
        this(abstractC1131d, B(abstractC1131d.f8489d, mVar), B(abstractC1131d.f8490e, mVar));
    }
}
