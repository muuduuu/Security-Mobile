package yd;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yd.d0;

/* renamed from: yd.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5203e {

    /* renamed from: a, reason: collision with root package name */
    public static final C5203e f45496a = new C5203e();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f45497b;

    /* renamed from: yd.e$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45498a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f45499b;

        static {
            int[] iArr = new int[Ad.s.values().length];
            try {
                iArr[Ad.s.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ad.s.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ad.s.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45498a = iArr;
            int[] iArr2 = new int[d0.b.values().length];
            try {
                iArr2[d0.b.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[d0.b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[d0.b.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f45499b = iArr2;
        }
    }

    /* renamed from: yd.e$b */
    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f45500a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f45501b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ad.o f45502c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ad.j f45503d;

        /* renamed from: yd.e$b$a */
        static final class a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d0 f45504a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ad.o f45505b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ad.j f45506c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ad.j f45507d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, Ad.o oVar, Ad.j jVar, Ad.j jVar2) {
                super(0);
                this.f45504a = d0Var;
                this.f45505b = oVar;
                this.f45506c = jVar;
                this.f45507d = jVar2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(C5203e.f45496a.q(this.f45504a, this.f45505b.j0(this.f45506c), this.f45507d));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, d0 d0Var, Ad.o oVar, Ad.j jVar) {
            super(1);
            this.f45500a = list;
            this.f45501b = d0Var;
            this.f45502c = oVar;
            this.f45503d = jVar;
        }

        public final void a(d0.a runForkingPoint) {
            Intrinsics.checkNotNullParameter(runForkingPoint, "$this$runForkingPoint");
            Iterator it = this.f45500a.iterator();
            while (it.hasNext()) {
                runForkingPoint.a(new a(this.f45501b, this.f45502c, (Ad.j) it.next(), this.f45503d));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((d0.a) obj);
            return Unit.f36324a;
        }
    }

    private C5203e() {
    }

    private final Boolean a(d0 d0Var, Ad.j jVar, Ad.j jVar2) {
        Ad.o j10 = d0Var.j();
        if (!j10.k(jVar) && !j10.k(jVar2)) {
            return null;
        }
        if (d(j10, jVar) && d(j10, jVar2)) {
            return Boolean.TRUE;
        }
        if (j10.k(jVar)) {
            if (e(j10, d0Var, jVar, jVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (j10.k(jVar2) && (c(j10, jVar) || e(j10, d0Var, jVar2, jVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean b(Ad.o oVar, Ad.j jVar) {
        if (!(jVar instanceof Ad.d)) {
            return false;
        }
        Ad.l I10 = oVar.I(oVar.a0((Ad.d) jVar));
        return !oVar.E(I10) && oVar.k(oVar.t0(oVar.n0(I10)));
    }

    private static final boolean c(Ad.o oVar, Ad.j jVar) {
        Ad.m e10 = oVar.e(jVar);
        if (e10 instanceof Ad.h) {
            Collection q10 = oVar.q(e10);
            if (!(q10 instanceof Collection) || !q10.isEmpty()) {
                Iterator it = q10.iterator();
                while (it.hasNext()) {
                    Ad.j b10 = oVar.b((Ad.i) it.next());
                    if (b10 != null && oVar.k(b10)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final boolean d(Ad.o oVar, Ad.j jVar) {
        return oVar.k(jVar) || b(oVar, jVar);
    }

    private static final boolean e(Ad.o oVar, d0 d0Var, Ad.j jVar, Ad.j jVar2, boolean z10) {
        Collection<Ad.i> m10 = oVar.m(jVar);
        if ((m10 instanceof Collection) && m10.isEmpty()) {
            return false;
        }
        for (Ad.i iVar : m10) {
            if (Intrinsics.b(oVar.e0(iVar), oVar.e(jVar2)) || (z10 && t(f45496a, d0Var, jVar2, iVar, false, 8, null))) {
                return true;
            }
        }
        return false;
    }

    private final Boolean f(d0 d0Var, Ad.j jVar, Ad.j jVar2) {
        Ad.j jVar3;
        Ad.o j10 = d0Var.j();
        if (j10.l0(jVar) || j10.l0(jVar2)) {
            return d0Var.m() ? Boolean.TRUE : (!j10.u(jVar) || j10.u(jVar2)) ? Boolean.valueOf(C5202d.f45481a.b(j10, j10.c(jVar, false), j10.c(jVar2, false))) : Boolean.FALSE;
        }
        if (j10.W(jVar) && j10.W(jVar2)) {
            return Boolean.valueOf(f45496a.p(j10, jVar, jVar2) || d0Var.n());
        }
        if (j10.f0(jVar) || j10.f0(jVar2)) {
            return Boolean.valueOf(d0Var.n());
        }
        Ad.e Q10 = j10.Q(jVar2);
        if (Q10 == null || (jVar3 = j10.E0(Q10)) == null) {
            jVar3 = jVar2;
        }
        Ad.d a10 = j10.a(jVar3);
        Ad.i T10 = a10 != null ? j10.T(a10) : null;
        if (a10 != null && T10 != null) {
            if (j10.u(jVar2)) {
                T10 = j10.v0(T10, true);
            } else if (j10.N(jVar2)) {
                T10 = j10.D0(T10);
            }
            Ad.i iVar = T10;
            int i10 = a.f45499b[d0Var.g(jVar, a10).ordinal()];
            if (i10 == 1) {
                return Boolean.valueOf(t(f45496a, d0Var, jVar, iVar, false, 8, null));
            }
            if (i10 == 2 && t(f45496a, d0Var, jVar, iVar, false, 8, null)) {
                return Boolean.TRUE;
            }
        }
        Ad.m e10 = j10.e(jVar2);
        if (j10.C(e10)) {
            j10.u(jVar2);
            Collection q10 = j10.q(e10);
            if (!(q10 instanceof Collection) || !q10.isEmpty()) {
                Iterator it = q10.iterator();
                while (it.hasNext()) {
                    if (!t(f45496a, d0Var, jVar, (Ad.i) it.next(), false, 8, null)) {
                        break;
                    }
                }
            }
            r10 = true;
            return Boolean.valueOf(r10);
        }
        Ad.m e11 = j10.e(jVar);
        if (!(jVar instanceof Ad.d)) {
            if (j10.C(e11)) {
                Collection q11 = j10.q(e11);
                if (!(q11 instanceof Collection) || !q11.isEmpty()) {
                    Iterator it2 = q11.iterator();
                    while (it2.hasNext()) {
                        if (!(((Ad.i) it2.next()) instanceof Ad.d)) {
                            break;
                        }
                    }
                }
            }
            return null;
        }
        Ad.n m10 = f45496a.m(d0Var.j(), jVar2, jVar);
        if (m10 != null && j10.A(m10, j10.e(jVar2))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private final List g(d0 d0Var, Ad.j jVar, Ad.m mVar) {
        d0.c X10;
        Ad.o j10 = d0Var.j();
        List k02 = j10.k0(jVar, mVar);
        if (k02 != null) {
            return k02;
        }
        if (!j10.m0(mVar) && j10.w0(jVar)) {
            return CollectionsKt.j();
        }
        if (j10.B(mVar)) {
            if (!j10.h0(j10.e(jVar), mVar)) {
                return CollectionsKt.j();
            }
            Ad.j o02 = j10.o0(jVar, Ad.b.FOR_SUBTYPING);
            if (o02 != null) {
                jVar = o02;
            }
            return CollectionsKt.e(jVar);
        }
        Gd.f fVar = new Gd.f();
        d0Var.k();
        ArrayDeque h10 = d0Var.h();
        Intrinsics.d(h10);
        Set i10 = d0Var.i();
        Intrinsics.d(i10);
        h10.push(jVar);
        while (!h10.isEmpty()) {
            if (i10.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + jVar + ". Supertypes = " + CollectionsKt.l0(i10, null, null, null, 0, null, null, 63, null)).toString());
            }
            Ad.j jVar2 = (Ad.j) h10.pop();
            Intrinsics.d(jVar2);
            if (i10.add(jVar2)) {
                Ad.j o03 = j10.o0(jVar2, Ad.b.FOR_SUBTYPING);
                if (o03 == null) {
                    o03 = jVar2;
                }
                if (j10.h0(j10.e(o03), mVar)) {
                    fVar.add(o03);
                    X10 = d0.c.C0667c.f45494a;
                } else {
                    X10 = j10.s0(o03) == 0 ? d0.c.b.f45493a : d0Var.j().X(o03);
                }
                if (Intrinsics.b(X10, d0.c.C0667c.f45494a)) {
                    X10 = null;
                }
                if (X10 != null) {
                    Ad.o j11 = d0Var.j();
                    Iterator it = j11.q(j11.e(jVar2)).iterator();
                    while (it.hasNext()) {
                        h10.add(X10.a(d0Var, (Ad.i) it.next()));
                    }
                }
            }
        }
        d0Var.e();
        return fVar;
    }

    private final List h(d0 d0Var, Ad.j jVar, Ad.m mVar) {
        return w(d0Var, g(d0Var, jVar, mVar));
    }

    private final boolean i(d0 d0Var, Ad.i iVar, Ad.i iVar2, boolean z10) {
        Ad.o j10 = d0Var.j();
        Ad.i o10 = d0Var.o(d0Var.p(iVar));
        Ad.i o11 = d0Var.o(d0Var.p(iVar2));
        C5203e c5203e = f45496a;
        Boolean f10 = c5203e.f(d0Var, j10.V(o10), j10.t0(o11));
        if (f10 == null) {
            Boolean c10 = d0Var.c(o10, o11, z10);
            return c10 != null ? c10.booleanValue() : c5203e.u(d0Var, j10.V(o10), j10.t0(o11));
        }
        boolean booleanValue = f10.booleanValue();
        d0Var.c(o10, o11, z10);
        return booleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        return r7.j(r7.e0(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Ad.n m(Ad.o oVar, Ad.i iVar, Ad.i iVar2) {
        Ad.i n02;
        int s02 = oVar.s0(iVar);
        int i10 = 0;
        while (true) {
            if (i10 >= s02) {
                return null;
            }
            Ad.l s10 = oVar.s(iVar, i10);
            Ad.l lVar = oVar.E(s10) ? null : s10;
            if (lVar != null && (n02 = oVar.n0(lVar)) != null) {
                boolean z10 = oVar.R(oVar.q0(oVar.V(n02))) && oVar.R(oVar.q0(oVar.V(iVar2)));
                if (Intrinsics.b(n02, iVar2) || (z10 && Intrinsics.b(oVar.e0(n02), oVar.e0(iVar2)))) {
                    break;
                }
                Ad.n m10 = m(oVar, n02, iVar2);
                if (m10 != null) {
                    return m10;
                }
            }
            i10++;
        }
    }

    private final boolean n(d0 d0Var, Ad.j jVar) {
        Ad.o j10 = d0Var.j();
        Ad.m e10 = j10.e(jVar);
        if (j10.m0(e10)) {
            return j10.L(e10);
        }
        if (j10.L(j10.e(jVar))) {
            return true;
        }
        d0Var.k();
        ArrayDeque h10 = d0Var.h();
        Intrinsics.d(h10);
        Set i10 = d0Var.i();
        Intrinsics.d(i10);
        h10.push(jVar);
        while (!h10.isEmpty()) {
            if (i10.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + jVar + ". Supertypes = " + CollectionsKt.l0(i10, null, null, null, 0, null, null, 63, null)).toString());
            }
            Ad.j jVar2 = (Ad.j) h10.pop();
            Intrinsics.d(jVar2);
            if (i10.add(jVar2)) {
                d0.c cVar = j10.w0(jVar2) ? d0.c.C0667c.f45494a : d0.c.b.f45493a;
                if (Intrinsics.b(cVar, d0.c.C0667c.f45494a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    Ad.o j11 = d0Var.j();
                    Iterator it = j11.q(j11.e(jVar2)).iterator();
                    while (it.hasNext()) {
                        Ad.j a10 = cVar.a(d0Var, (Ad.i) it.next());
                        if (j10.L(j10.e(a10))) {
                            d0Var.e();
                            return true;
                        }
                        h10.add(a10);
                    }
                }
            }
        }
        d0Var.e();
        return false;
    }

    private final boolean o(Ad.o oVar, Ad.i iVar) {
        return (!oVar.p(oVar.e0(iVar)) || oVar.c0(iVar) || oVar.N(iVar) || oVar.b0(iVar) || !Intrinsics.b(oVar.e(oVar.V(iVar)), oVar.e(oVar.t0(iVar)))) ? false : true;
    }

    private final boolean p(Ad.o oVar, Ad.j jVar, Ad.j jVar2) {
        Ad.j jVar3;
        Ad.j jVar4;
        Ad.e Q10 = oVar.Q(jVar);
        if (Q10 == null || (jVar3 = oVar.E0(Q10)) == null) {
            jVar3 = jVar;
        }
        Ad.e Q11 = oVar.Q(jVar2);
        if (Q11 == null || (jVar4 = oVar.E0(Q11)) == null) {
            jVar4 = jVar2;
        }
        if (oVar.e(jVar3) != oVar.e(jVar4)) {
            return false;
        }
        if (oVar.N(jVar) || !oVar.N(jVar2)) {
            return !oVar.u(jVar) || oVar.u(jVar2);
        }
        return false;
    }

    public static /* synthetic */ boolean t(C5203e c5203e, d0 d0Var, Ad.i iVar, Ad.i iVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c5203e.s(d0Var, iVar, iVar2, z10);
    }

    private final boolean u(d0 d0Var, Ad.j jVar, Ad.j jVar2) {
        Ad.i n02;
        Ad.o j10 = d0Var.j();
        if (f45497b) {
            if (!j10.d(jVar) && !j10.C(j10.e(jVar))) {
                d0Var.l(jVar);
            }
            if (!j10.d(jVar2)) {
                d0Var.l(jVar2);
            }
        }
        boolean z10 = false;
        if (!C5201c.f45480a.d(d0Var, jVar, jVar2)) {
            return false;
        }
        C5203e c5203e = f45496a;
        Boolean a10 = c5203e.a(d0Var, j10.V(jVar), j10.t0(jVar2));
        if (a10 != null) {
            boolean booleanValue = a10.booleanValue();
            d0.d(d0Var, jVar, jVar2, false, 4, null);
            return booleanValue;
        }
        Ad.m e10 = j10.e(jVar2);
        boolean z11 = true;
        if ((j10.h0(j10.e(jVar), e10) && j10.o(e10) == 0) || j10.r(j10.e(jVar2))) {
            return true;
        }
        List<Ad.j> l10 = c5203e.l(d0Var, jVar, e10);
        int i10 = 10;
        ArrayList<Ad.j> arrayList = new ArrayList(CollectionsKt.u(l10, 10));
        for (Ad.j jVar3 : l10) {
            Ad.j b10 = j10.b(d0Var.o(jVar3));
            if (b10 != null) {
                jVar3 = b10;
            }
            arrayList.add(jVar3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f45496a.n(d0Var, jVar);
        }
        if (size == 1) {
            return f45496a.q(d0Var, j10.j0((Ad.j) CollectionsKt.d0(arrayList)), jVar2);
        }
        Ad.a aVar = new Ad.a(j10.o(e10));
        int o10 = j10.o(e10);
        int i11 = 0;
        boolean z12 = false;
        while (i11 < o10) {
            z12 = (z12 || j10.h(j10.j(e10, i11)) != Ad.s.OUT) ? z11 : z10;
            if (!z12) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, i10));
                for (Ad.j jVar4 : arrayList) {
                    Ad.l M10 = j10.M(jVar4, i11);
                    if (M10 != null) {
                        if (j10.r0(M10) != Ad.s.INV) {
                            M10 = null;
                        }
                        if (M10 != null && (n02 = j10.n0(M10)) != null) {
                            arrayList2.add(n02);
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + jVar4 + ", subType: " + jVar + ", superType: " + jVar2).toString());
                }
                aVar.add(j10.z(j10.F(arrayList2)));
            }
            i11++;
            z10 = false;
            z11 = true;
            i10 = 10;
        }
        if (z12 || !f45496a.q(d0Var, aVar, jVar2)) {
            return d0Var.q(new b(arrayList, d0Var, j10, jVar2));
        }
        return true;
    }

    private final boolean v(Ad.o oVar, Ad.i iVar, Ad.i iVar2, Ad.m mVar) {
        Ad.j b10 = oVar.b(iVar);
        if (b10 instanceof Ad.d) {
            Ad.d dVar = (Ad.d) b10;
            if (oVar.y(dVar) || !oVar.E(oVar.I(oVar.a0(dVar))) || oVar.P(dVar) != Ad.b.FOR_SUBTYPING) {
                return false;
            }
            oVar.e0(iVar2);
        }
        return false;
    }

    private final List w(d0 d0Var, List list) {
        int i10;
        Ad.o j10 = d0Var.j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Ad.k j02 = j10.j0((Ad.j) obj);
            int B02 = j10.B0(j02);
            while (true) {
                if (i10 >= B02) {
                    arrayList.add(obj);
                    break;
                }
                i10 = j10.i(j10.n0(j10.d0(j02, i10))) == null ? i10 + 1 : 0;
            }
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }

    public final Ad.s j(Ad.s declared, Ad.s useSite) {
        Intrinsics.checkNotNullParameter(declared, "declared");
        Intrinsics.checkNotNullParameter(useSite, "useSite");
        Ad.s sVar = Ad.s.INV;
        if (declared == sVar) {
            return useSite;
        }
        if (useSite == sVar) {
            return declared;
        }
        if (declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean k(d0 state, Ad.i a10, Ad.i b10) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Ad.o j10 = state.j();
        if (a10 == b10) {
            return true;
        }
        C5203e c5203e = f45496a;
        if (c5203e.o(j10, a10) && c5203e.o(j10, b10)) {
            Ad.i o10 = state.o(state.p(a10));
            Ad.i o11 = state.o(state.p(b10));
            Ad.j V10 = j10.V(o10);
            if (!j10.h0(j10.e0(o10), j10.e0(o11))) {
                return false;
            }
            if (j10.s0(V10) == 0) {
                return j10.n(o10) || j10.n(o11) || j10.u(V10) == j10.u(j10.V(o11));
            }
        }
        return t(c5203e, state, a10, b10, false, 8, null) && t(c5203e, state, b10, a10, false, 8, null);
    }

    public final List l(d0 state, Ad.j subType, Ad.m superConstructor) {
        d0.c cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superConstructor, "superConstructor");
        Ad.o j10 = state.j();
        if (j10.w0(subType)) {
            return f45496a.h(state, subType, superConstructor);
        }
        if (!j10.m0(superConstructor) && !j10.H(superConstructor)) {
            return f45496a.g(state, subType, superConstructor);
        }
        Gd.f<Ad.j> fVar = new Gd.f();
        state.k();
        ArrayDeque h10 = state.h();
        Intrinsics.d(h10);
        Set i10 = state.i();
        Intrinsics.d(i10);
        h10.push(subType);
        while (!h10.isEmpty()) {
            if (i10.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + subType + ". Supertypes = " + CollectionsKt.l0(i10, null, null, null, 0, null, null, 63, null)).toString());
            }
            Ad.j jVar = (Ad.j) h10.pop();
            Intrinsics.d(jVar);
            if (i10.add(jVar)) {
                if (j10.w0(jVar)) {
                    fVar.add(jVar);
                    cVar = d0.c.C0667c.f45494a;
                } else {
                    cVar = d0.c.b.f45493a;
                }
                if (Intrinsics.b(cVar, d0.c.C0667c.f45494a)) {
                    cVar = null;
                }
                if (cVar != null) {
                    Ad.o j11 = state.j();
                    Iterator it = j11.q(j11.e(jVar)).iterator();
                    while (it.hasNext()) {
                        h10.add(cVar.a(state, (Ad.i) it.next()));
                    }
                }
            }
        }
        state.e();
        ArrayList arrayList = new ArrayList();
        for (Ad.j jVar2 : fVar) {
            C5203e c5203e = f45496a;
            Intrinsics.d(jVar2);
            CollectionsKt.z(arrayList, c5203e.h(state, jVar2, superConstructor));
        }
        return arrayList;
    }

    public final boolean q(d0 d0Var, Ad.k capturedSubArguments, Ad.j superType) {
        int i10;
        int i11;
        boolean k10;
        int i12;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(capturedSubArguments, "capturedSubArguments");
        Intrinsics.checkNotNullParameter(superType, "superType");
        Ad.o j10 = d0Var.j();
        Ad.m e10 = j10.e(superType);
        int B02 = j10.B0(capturedSubArguments);
        int o10 = j10.o(e10);
        if (B02 != o10 || B02 != j10.s0(superType)) {
            return false;
        }
        for (int i13 = 0; i13 < o10; i13++) {
            Ad.l s10 = j10.s(superType, i13);
            if (!j10.E(s10)) {
                Ad.i n02 = j10.n0(s10);
                Ad.l d02 = j10.d0(capturedSubArguments, i13);
                j10.r0(d02);
                Ad.s sVar = Ad.s.INV;
                Ad.i n03 = j10.n0(d02);
                C5203e c5203e = f45496a;
                Ad.s j11 = c5203e.j(j10.h(j10.j(e10, i13)), j10.r0(s10));
                if (j11 == null) {
                    return d0Var.m();
                }
                if (j11 != sVar || (!c5203e.v(j10, n03, n02, e10) && !c5203e.v(j10, n02, n03, e10))) {
                    i10 = d0Var.f45488g;
                    if (i10 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + n03).toString());
                    }
                    i11 = d0Var.f45488g;
                    d0Var.f45488g = i11 + 1;
                    int i14 = a.f45498a[j11.ordinal()];
                    if (i14 == 1) {
                        k10 = c5203e.k(d0Var, n03, n02);
                    } else if (i14 == 2) {
                        k10 = t(c5203e, d0Var, n03, n02, false, 8, null);
                    } else {
                        if (i14 != 3) {
                            throw new lc.m();
                        }
                        k10 = t(c5203e, d0Var, n02, n03, false, 8, null);
                    }
                    i12 = d0Var.f45488g;
                    d0Var.f45488g = i12 - 1;
                    if (!k10) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean r(d0 state, Ad.i subType, Ad.i superType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return t(this, state, subType, superType, false, 8, null);
    }

    public final boolean s(d0 state, Ad.i subType, Ad.i superType, boolean z10) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.f(subType, superType)) {
            return i(state, subType, superType, z10);
        }
        return false;
    }
}
