package Wc;

import Gd.g;
import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.D;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0952y;
import Kc.U;
import Kc.V;
import Kc.X;
import Kc.Z;
import Kc.f0;
import Kc.j0;
import Mc.C0980f;
import Mc.C0988n;
import Mc.E;
import Mc.L;
import Sc.A;
import Sc.B;
import Sc.C1155e;
import Sc.C1156f;
import Sc.C1159i;
import Sc.F;
import Sc.H;
import Sc.I;
import Sc.J;
import Sc.p;
import Sc.s;
import Sc.t;
import Tc.j;
import Wc.j;
import Zc.q;
import Zc.r;
import Zc.w;
import Zc.x;
import ad.C1387l;
import bd.y;
import id.C3367b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kd.AbstractC3565e;
import kd.l;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.collections.O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import xc.AbstractC5156i;
import xc.C5142C;
import yd.AbstractC5197E;
import yd.i0;
import yd.p0;
import yd.q0;

/* loaded from: classes3.dex */
public final class g extends Wc.j {

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC0933e f11479n;

    /* renamed from: o, reason: collision with root package name */
    private final Zc.g f11480o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f11481p;

    /* renamed from: q, reason: collision with root package name */
    private final xd.i f11482q;

    /* renamed from: r, reason: collision with root package name */
    private final xd.i f11483r;

    /* renamed from: s, reason: collision with root package name */
    private final xd.i f11484s;

    /* renamed from: t, reason: collision with root package name */
    private final xd.i f11485t;

    /* renamed from: u, reason: collision with root package name */
    private final xd.h f11486u;

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11487a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(q it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.o());
        }
    }

    /* synthetic */ class b extends AbstractC5156i implements Function1 {
        b(Object obj) {
            super(1, obj);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(g.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(id.f p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return ((g) this.f44980b).J0(p02);
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }
    }

    /* synthetic */ class c extends AbstractC5156i implements Function1 {
        c(Object obj) {
            super(1, obj);
        }

        @Override // xc.AbstractC5150c
        public final kotlin.reflect.f E() {
            return C5142C.b(g.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(id.f p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return ((g) this.f44980b).K0(p02);
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }
    }

    static final class d extends xc.m implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(id.f it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return g.this.J0(it);
        }
    }

    static final class e extends xc.m implements Function1 {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(id.f it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return g.this.K0(it);
        }
    }

    static final class f extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Vc.g f11491b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Vc.g gVar) {
            super(0);
            this.f11491b = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            Collection k10 = g.this.f11480o.k();
            ArrayList arrayList = new ArrayList(k10.size());
            Iterator it = k10.iterator();
            while (it.hasNext()) {
                arrayList.add(g.this.H0((Zc.k) it.next()));
            }
            if (g.this.f11480o.z()) {
                InterfaceC0932d f02 = g.this.f0();
                String c10 = y.c(f02, false, false, 2, null);
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.b(y.c((InterfaceC0932d) it2.next(), false, false, 2, null), c10)) {
                            break;
                        }
                    }
                }
                arrayList.add(f02);
                this.f11491b.a().h().e(g.this.f11480o, f02);
            }
            Vc.g gVar = this.f11491b;
            gVar.a().w().g(gVar, g.this.C(), arrayList);
            C1387l r10 = this.f11491b.a().r();
            Vc.g gVar2 = this.f11491b;
            g gVar3 = g.this;
            boolean isEmpty = arrayList.isEmpty();
            Collection collection = arrayList;
            if (isEmpty) {
                collection = CollectionsKt.n(gVar3.e0());
            }
            return CollectionsKt.O0(r10.g(gVar2, collection));
        }
    }

    /* renamed from: Wc.g$g, reason: collision with other inner class name */
    static final class C0215g extends xc.m implements Function0 {
        C0215g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            Collection I10 = g.this.f11480o.I();
            ArrayList arrayList = new ArrayList();
            for (Object obj : I10) {
                if (((Zc.n) obj).M()) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(G.d(CollectionsKt.u(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((Zc.n) obj2).getName(), obj2);
            }
            return linkedHashMap;
        }
    }

    static final class h extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Vc.g f11493a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f11494b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Vc.g gVar, g gVar2) {
            super(0);
            this.f11493a = gVar;
            this.f11494b = gVar2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            Vc.g gVar = this.f11493a;
            return CollectionsKt.S0(gVar.a().w().c(gVar, this.f11494b.C()));
        }
    }

    static final class i extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z f11495a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f11496b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Z z10, g gVar) {
            super(1);
            this.f11495a = z10;
            this.f11496b = gVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(id.f accessorName) {
            Intrinsics.checkNotNullParameter(accessorName, "accessorName");
            return Intrinsics.b(this.f11495a.getName(), accessorName) ? CollectionsKt.e(this.f11495a) : CollectionsKt.w0(this.f11496b.J0(accessorName), this.f11496b.K0(accessorName));
        }
    }

    static final class j extends xc.m implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            return CollectionsKt.S0(g.this.f11480o.R());
        }
    }

    static final class k extends xc.m implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Vc.g f11499b;

        static final class a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f11500a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.f11500a = gVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set invoke() {
                return O.k(this.f11500a.b(), this.f11500a.d());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Vc.g gVar) {
            super(1);
            this.f11499b = gVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0933e invoke(id.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (((Set) g.this.f11483r.invoke()).contains(name)) {
                p d10 = this.f11499b.a().d();
                C3367b k10 = AbstractC3778c.k(g.this.C());
                Intrinsics.d(k10);
                C3367b d11 = k10.d(name);
                Intrinsics.checkNotNullExpressionValue(d11, "createNestedClassId(...)");
                Zc.g a10 = d10.a(new p.a(d11, null, g.this.f11480o, 2, null));
                if (a10 == null) {
                    return null;
                }
                Vc.g gVar = this.f11499b;
                Wc.f fVar = new Wc.f(gVar, g.this.C(), a10, null, 8, null);
                gVar.a().e().a(fVar);
                return fVar;
            }
            if (!((Set) g.this.f11484s.invoke()).contains(name)) {
                Zc.n nVar = (Zc.n) ((Map) g.this.f11485t.invoke()).get(name);
                if (nVar == null) {
                    return null;
                }
                return C0988n.U0(this.f11499b.e(), g.this.C(), name, this.f11499b.e().d(new a(g.this)), Vc.e.a(this.f11499b, nVar), this.f11499b.a().t().a(nVar));
            }
            Vc.g gVar2 = this.f11499b;
            g gVar3 = g.this;
            List c10 = CollectionsKt.c();
            gVar2.a().w().e(gVar2, gVar3.C(), name, c10);
            List a11 = CollectionsKt.a(c10);
            int size = a11.size();
            if (size == 0) {
                return null;
            }
            if (size == 1) {
                return (InterfaceC0933e) CollectionsKt.A0(a11);
            }
            throw new IllegalStateException(("Multiple classes with same name are generated: " + a11).toString());
        }
    }

    public /* synthetic */ g(Vc.g gVar, InterfaceC0933e interfaceC0933e, Zc.g gVar2, boolean z10, g gVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, interfaceC0933e, gVar2, z10, (i10 & 16) != 0 ? null : gVar3);
    }

    private final Set A0(id.f fVar) {
        Collection c02 = c0();
        ArrayList arrayList = new ArrayList();
        Iterator it = c02.iterator();
        while (it.hasNext()) {
            Collection c10 = ((AbstractC5197E) it.next()).w().c(fVar, Rc.d.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.u(c10, 10));
            Iterator it2 = c10.iterator();
            while (it2.hasNext()) {
                arrayList2.add((U) it2.next());
            }
            CollectionsKt.z(arrayList, arrayList2);
        }
        return CollectionsKt.S0(arrayList);
    }

    private final boolean B0(Z z10, InterfaceC0952y interfaceC0952y) {
        String c10 = y.c(z10, false, false, 2, null);
        InterfaceC0952y a10 = interfaceC0952y.a();
        Intrinsics.checkNotNullExpressionValue(a10, "getOriginal(...)");
        return Intrinsics.b(c10, y.c(a10, false, false, 2, null)) && !p0(z10, interfaceC0952y);
    }

    private final boolean C0(Z z10) {
        id.f name = z10.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        List a10 = F.a(name);
        if (!(a10 instanceof Collection) || !a10.isEmpty()) {
            Iterator it = a10.iterator();
            while (it.hasNext()) {
                Set<U> A02 = A0((id.f) it.next());
                if (A02 == null || !A02.isEmpty()) {
                    for (U u10 : A02) {
                        if (o0(u10, new i(z10, this))) {
                            if (!u10.q0()) {
                                String c10 = z10.getName().c();
                                Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
                                if (!A.d(c10)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (q0(z10) || L0(z10) || s0(z10)) ? false : true;
    }

    private final Z D0(Z z10, Function1 function1, Collection collection) {
        Z h02;
        InterfaceC0952y k10 = C1156f.k(z10);
        if (k10 == null || (h02 = h0(k10, function1)) == null) {
            return null;
        }
        if (!C0(h02)) {
            h02 = null;
        }
        if (h02 != null) {
            return g0(h02, k10, collection);
        }
        return null;
    }

    private final Z E0(Z z10, Function1 function1, id.f fVar, Collection collection) {
        Z z11 = (Z) H.d(z10);
        if (z11 == null) {
            return null;
        }
        String b10 = H.b(z11);
        Intrinsics.d(b10);
        id.f o10 = id.f.o(b10);
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        Iterator it = ((Collection) function1.invoke(o10)).iterator();
        while (it.hasNext()) {
            Z m02 = m0((Z) it.next(), fVar);
            if (r0(z11, m02)) {
                return g0(m02, z11, collection);
            }
        }
        return null;
    }

    private final Z F0(Z z10, Function1 function1) {
        if (!z10.z()) {
            return null;
        }
        id.f name = z10.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Iterator it = ((Iterable) function1.invoke(name)).iterator();
        while (it.hasNext()) {
            Z n02 = n0((Z) it.next());
            if (n02 == null || !p0(n02, z10)) {
                n02 = null;
            }
            if (n02 != null) {
                return n02;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uc.b H0(Zc.k kVar) {
        InterfaceC0933e C10 = C();
        Uc.b C12 = Uc.b.C1(C10, Vc.e.a(w(), kVar), false, w().a().t().a(kVar));
        Intrinsics.checkNotNullExpressionValue(C12, "createJavaConstructor(...)");
        Vc.g e10 = Vc.a.e(w(), C12, kVar, C10.B().size());
        j.b K10 = K(e10, C12, kVar.m());
        List B10 = C10.B();
        Intrinsics.checkNotNullExpressionValue(B10, "getDeclaredTypeParameters(...)");
        List list = B10;
        List n10 = kVar.n();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(n10, 10));
        Iterator it = n10.iterator();
        while (it.hasNext()) {
            f0 a10 = e10.f().a((Zc.y) it.next());
            Intrinsics.d(a10);
            arrayList.add(a10);
        }
        C12.A1(K10.a(), J.d(kVar.h()), CollectionsKt.w0(list, arrayList));
        C12.h1(false);
        C12.i1(K10.b());
        C12.p1(C10.y());
        e10.a().h().e(kVar, C12);
        return C12;
    }

    private final Uc.e I0(w wVar) {
        Uc.e y12 = Uc.e.y1(C(), Vc.e.a(w(), wVar), wVar.getName(), w().a().t().a(wVar), true);
        Intrinsics.checkNotNullExpressionValue(y12, "createJavaMethod(...)");
        y12.x1(null, z(), CollectionsKt.j(), CollectionsKt.j(), CollectionsKt.j(), w().g().o(wVar.getType(), Xc.b.b(p0.COMMON, false, false, null, 6, null)), D.Companion.a(false, false, true), AbstractC0947t.f5589e, null);
        y12.B1(false, false);
        w().a().h().b(wVar, y12);
        return y12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection J0(id.f fVar) {
        Collection b10 = ((Wc.b) y().invoke()).b(fVar);
        ArrayList arrayList = new ArrayList(CollectionsKt.u(b10, 10));
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            arrayList.add(I((r) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection K0(id.f fVar) {
        Set y02 = y0(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : y02) {
            Z z10 = (Z) obj;
            if (!H.a(z10) && C1156f.k(z10) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean L0(Z z10) {
        C1156f c1156f = C1156f.f9028o;
        id.f name = z10.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (!c1156f.l(name)) {
            return false;
        }
        id.f name2 = z10.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        Set y02 = y0(name2);
        ArrayList arrayList = new ArrayList();
        Iterator it = y02.iterator();
        while (it.hasNext()) {
            InterfaceC0952y k10 = C1156f.k((Z) it.next());
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (B0(z10, (InterfaceC0952y) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private final void V(List list, InterfaceC0940l interfaceC0940l, int i10, r rVar, AbstractC5197E abstractC5197E, AbstractC5197E abstractC5197E2) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b10 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b();
        id.f name = rVar.getName();
        AbstractC5197E n10 = q0.n(abstractC5197E);
        Intrinsics.checkNotNullExpressionValue(n10, "makeNotNullable(...)");
        list.add(new L(interfaceC0940l, null, i10, b10, name, n10, rVar.S(), false, false, abstractC5197E2 != null ? q0.n(abstractC5197E2) : null, w().a().t().a(rVar)));
    }

    private final void W(Collection collection, id.f fVar, Collection collection2, boolean z10) {
        Collection d10 = Tc.a.d(fVar, collection2, collection, C(), w().a().c(), w().a().k().a());
        Intrinsics.checkNotNullExpressionValue(d10, "resolveOverridesForNonStaticMembers(...)");
        if (!z10) {
            collection.addAll(d10);
            return;
        }
        Collection<Z> collection3 = d10;
        List w02 = CollectionsKt.w0(collection, collection3);
        ArrayList arrayList = new ArrayList(CollectionsKt.u(collection3, 10));
        for (Z z11 : collection3) {
            Z z12 = (Z) H.e(z11);
            if (z12 == null) {
                Intrinsics.d(z11);
            } else {
                Intrinsics.d(z11);
                z11 = g0(z11, z12, w02);
            }
            arrayList.add(z11);
        }
        collection.addAll(arrayList);
    }

    private final void X(id.f fVar, Collection collection, Collection collection2, Collection collection3, Function1 function1) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            Z z10 = (Z) it.next();
            Gd.a.a(collection3, E0(z10, function1, fVar, collection));
            Gd.a.a(collection3, D0(z10, function1, collection));
            Gd.a.a(collection3, F0(z10, function1));
        }
    }

    private final void Y(Set set, Collection collection, Set set2, Function1 function1) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            U u10 = (U) it.next();
            Uc.f i02 = i0(u10, function1);
            if (i02 != null) {
                collection.add(i02);
                if (set2 != null) {
                    set2.add(u10);
                    return;
                }
                return;
            }
        }
    }

    private final void Z(id.f fVar, Collection collection) {
        r rVar = (r) CollectionsKt.B0(((Wc.b) y().invoke()).b(fVar));
        if (rVar == null) {
            return;
        }
        collection.add(k0(this, rVar, null, D.FINAL, 2, null));
    }

    private final Collection c0() {
        if (!this.f11481p) {
            return w().a().k().d().g(C());
        }
        Collection a10 = C().r().a();
        Intrinsics.checkNotNullExpressionValue(a10, "getSupertypes(...)");
        return a10;
    }

    private final List d0(C0980f c0980f) {
        Pair pair;
        Collection T10 = this.f11480o.T();
        ArrayList arrayList = new ArrayList(T10.size());
        Xc.a b10 = Xc.b.b(p0.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : T10) {
            if (Intrinsics.b(((r) obj).getName(), B.f8945c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.getFirst();
        List<r> list2 = (List) pair2.getSecond();
        list.size();
        r rVar = (r) CollectionsKt.firstOrNull(list);
        if (rVar != null) {
            x g10 = rVar.g();
            if (g10 instanceof Zc.f) {
                Zc.f fVar = (Zc.f) g10;
                pair = new Pair(w().g().k(fVar, b10, true), w().g().o(fVar.t(), b10));
            } else {
                pair = new Pair(w().g().o(g10, b10), null);
            }
            V(arrayList, c0980f, 0, rVar, (AbstractC5197E) pair.getFirst(), (AbstractC5197E) pair.getSecond());
        }
        int i10 = 0;
        int i11 = rVar == null ? 0 : 1;
        for (r rVar2 : list2) {
            V(arrayList, c0980f, i10 + i11, rVar2, w().g().o(rVar2.g(), b10), null);
            i10++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0932d e0() {
        boolean x10 = this.f11480o.x();
        if ((this.f11480o.N() || !this.f11480o.A()) && !x10) {
            return null;
        }
        InterfaceC0933e C10 = C();
        Uc.b C12 = Uc.b.C1(C10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), true, w().a().t().a(this.f11480o));
        Intrinsics.checkNotNullExpressionValue(C12, "createJavaConstructor(...)");
        List d02 = x10 ? d0(C12) : Collections.emptyList();
        C12.i1(false);
        C12.z1(d02, w0(C10));
        C12.h1(true);
        C12.p1(C10.y());
        w().a().h().e(this.f11480o, C12);
        return C12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0932d f0() {
        InterfaceC0933e C10 = C();
        Uc.b C12 = Uc.b.C1(C10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), true, w().a().t().a(this.f11480o));
        Intrinsics.checkNotNullExpressionValue(C12, "createJavaConstructor(...)");
        List l02 = l0(C12);
        C12.i1(false);
        C12.z1(l02, w0(C10));
        C12.h1(false);
        C12.p1(C10.y());
        return C12;
    }

    private final Z g0(Z z10, InterfaceC0929a interfaceC0929a, Collection collection) {
        Collection<Z> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return z10;
        }
        for (Z z11 : collection2) {
            if (!Intrinsics.b(z10, z11) && z11.j0() == null && p0(z11, interfaceC0929a)) {
                InterfaceC0952y c10 = z10.A().q().c();
                Intrinsics.d(c10);
                return (Z) c10;
            }
        }
        return z10;
    }

    private final Z h0(InterfaceC0952y interfaceC0952y, Function1 function1) {
        Object obj;
        id.f name = interfaceC0952y.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Iterator it = ((Iterable) function1.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (B0((Z) obj, interfaceC0952y)) {
                break;
            }
        }
        Z z10 = (Z) obj;
        if (z10 == null) {
            return null;
        }
        InterfaceC0952y.a A10 = z10.A();
        List m10 = interfaceC0952y.m();
        Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
        List list = m10;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((j0) it2.next()).getType());
        }
        List m11 = z10.m();
        Intrinsics.checkNotNullExpressionValue(m11, "getValueParameters(...)");
        A10.e(Uc.h.a(arrayList, m11, interfaceC0952y));
        A10.w();
        A10.h();
        A10.t(Uc.e.f10421H, Boolean.TRUE);
        return (Z) A10.c();
    }

    private final Uc.f i0(U u10, Function1 function1) {
        Z z10;
        E e10 = null;
        if (!o0(u10, function1)) {
            return null;
        }
        Z u02 = u0(u10, function1);
        Intrinsics.d(u02);
        if (u10.q0()) {
            z10 = v0(u10, function1);
            Intrinsics.d(z10);
        } else {
            z10 = null;
        }
        if (z10 != null) {
            z10.s();
            u02.s();
        }
        Uc.d dVar = new Uc.d(C(), u02, z10, u10);
        AbstractC5197E g10 = u02.g();
        Intrinsics.d(g10);
        dVar.k1(g10, CollectionsKt.j(), z(), null, CollectionsKt.j());
        Mc.D k10 = AbstractC3565e.k(dVar, u02.i(), false, false, false, u02.j());
        k10.V0(u02);
        k10.Y0(dVar.getType());
        Intrinsics.checkNotNullExpressionValue(k10, "apply(...)");
        if (z10 != null) {
            List m10 = z10.m();
            Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
            j0 j0Var = (j0) CollectionsKt.firstOrNull(m10);
            if (j0Var == null) {
                throw new AssertionError("No parameter found for " + z10);
            }
            e10 = AbstractC3565e.m(dVar, z10.i(), j0Var.i(), false, false, false, z10.h(), z10.j());
            e10.V0(z10);
        }
        dVar.d1(k10, e10);
        return dVar;
    }

    private final Uc.f j0(r rVar, AbstractC5197E abstractC5197E, D d10) {
        Uc.f o12 = Uc.f.o1(C(), Vc.e.a(w(), rVar), d10, J.d(rVar.h()), false, rVar.getName(), w().a().t().a(rVar), false);
        Intrinsics.checkNotNullExpressionValue(o12, "create(...)");
        Mc.D d11 = AbstractC3565e.d(o12, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b());
        Intrinsics.checkNotNullExpressionValue(d11, "createDefaultGetter(...)");
        o12.d1(d11, null);
        AbstractC5197E q10 = abstractC5197E == null ? q(rVar, Vc.a.f(w(), o12, rVar, 0, 4, null)) : abstractC5197E;
        o12.k1(q10, CollectionsKt.j(), z(), null, CollectionsKt.j());
        d11.Y0(q10);
        return o12;
    }

    static /* synthetic */ Uc.f k0(g gVar, r rVar, AbstractC5197E abstractC5197E, D d10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            abstractC5197E = null;
        }
        return gVar.j0(rVar, abstractC5197E, d10);
    }

    private final List l0(C0980f c0980f) {
        Collection r10 = this.f11480o.r();
        ArrayList arrayList = new ArrayList(r10.size());
        Xc.a b10 = Xc.b.b(p0.COMMON, false, false, null, 6, null);
        Iterator it = r10.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return arrayList;
            }
            i10 = i11 + 1;
            w wVar = (w) it.next();
            AbstractC5197E o10 = w().g().o(wVar.getType(), b10);
            arrayList.add(new L(c0980f, null, i11, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), wVar.getName(), o10, false, false, false, wVar.b() ? w().a().m().v().k(o10) : null, w().a().t().a(wVar)));
        }
    }

    private final Z m0(Z z10, id.f fVar) {
        InterfaceC0952y.a A10 = z10.A();
        A10.j(fVar);
        A10.w();
        A10.h();
        InterfaceC0952y c10 = A10.c();
        Intrinsics.d(c10);
        return (Z) c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Z n0(Z z10) {
        id.c cVar;
        id.d m10;
        List m11 = z10.m();
        Intrinsics.checkNotNullExpressionValue(m11, "getValueParameters(...)");
        j0 j0Var = (j0) CollectionsKt.p0(m11);
        if (j0Var != null) {
            InterfaceC0936h d10 = j0Var.getType().W0().d();
            if (d10 != null && (m10 = AbstractC3778c.m(d10)) != null) {
                if (!m10.f()) {
                    m10 = null;
                }
                if (m10 != null) {
                    cVar = m10.l();
                    if (!Intrinsics.b(cVar, Hc.j.f3886t)) {
                        j0Var = null;
                    }
                    if (j0Var != null) {
                        InterfaceC0952y.a A10 = z10.A();
                        List m12 = z10.m();
                        Intrinsics.checkNotNullExpressionValue(m12, "getValueParameters(...)");
                        Z z11 = (Z) A10.e(CollectionsKt.Y(m12, 1)).v(((i0) j0Var.getType().U0().get(0)).getType()).c();
                        Mc.G g10 = (Mc.G) z11;
                        if (g10 != null) {
                            g10.q1(true);
                        }
                        return z11;
                    }
                }
            }
            cVar = null;
            if (!Intrinsics.b(cVar, Hc.j.f3886t)) {
            }
            if (j0Var != null) {
            }
        }
        return null;
    }

    private final boolean o0(U u10, Function1 function1) {
        if (Wc.c.a(u10)) {
            return false;
        }
        Z u02 = u0(u10, function1);
        Z v02 = v0(u10, function1);
        if (u02 == null) {
            return false;
        }
        if (u10.q0()) {
            return v02 != null && v02.s() == u02.s();
        }
        return true;
    }

    private final boolean p0(InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2) {
        l.i.a c10 = kd.l.f36296f.F(interfaceC0929a2, interfaceC0929a, true).c();
        Intrinsics.checkNotNullExpressionValue(c10, "getResult(...)");
        return c10 == l.i.a.OVERRIDABLE && !t.f9056a.a(interfaceC0929a2, interfaceC0929a);
    }

    private final boolean q0(Z z10) {
        I.a aVar = I.f8994a;
        id.f name = z10.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        id.f b10 = aVar.b(name);
        if (b10 == null) {
            return false;
        }
        Set y02 = y0(b10);
        ArrayList arrayList = new ArrayList();
        for (Object obj : y02) {
            if (H.a((Z) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Z m02 = m0(z10, b10);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (r0((Z) it.next(), m02)) {
                return true;
            }
        }
        return false;
    }

    private final boolean r0(Z z10, InterfaceC0952y interfaceC0952y) {
        if (C1155e.f9026o.k(z10)) {
            interfaceC0952y = interfaceC0952y.a();
        }
        Intrinsics.d(interfaceC0952y);
        return p0(interfaceC0952y, z10);
    }

    private final boolean s0(Z z10) {
        Z n02 = n0(z10);
        if (n02 == null) {
            return false;
        }
        id.f name = z10.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Set<Z> y02 = y0(name);
        if (y02 != null && y02.isEmpty()) {
            return false;
        }
        for (Z z11 : y02) {
            if (z11.z() && p0(n02, z11)) {
                return true;
            }
        }
        return false;
    }

    private final Z t0(U u10, String str, Function1 function1) {
        Z z10;
        id.f o10 = id.f.o(str);
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(o10)).iterator();
        do {
            z10 = null;
            if (!it.hasNext()) {
                break;
            }
            Z z11 = (Z) it.next();
            if (z11.m().size() == 0) {
                kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f36672a;
                AbstractC5197E g10 = z11.g();
                if (g10 == null ? false : eVar.c(g10, u10.getType())) {
                    z10 = z11;
                }
            }
        } while (z10 == null);
        return z10;
    }

    private final Z u0(U u10, Function1 function1) {
        V d10 = u10.d();
        V v10 = d10 != null ? (V) H.d(d10) : null;
        String a10 = v10 != null ? C1159i.f9037a.a(v10) : null;
        if (a10 != null && !H.f(C(), v10)) {
            return t0(u10, a10, function1);
        }
        String c10 = u10.getName().c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        return t0(u10, A.b(c10), function1);
    }

    private final Z v0(U u10, Function1 function1) {
        Z z10;
        AbstractC5197E g10;
        String c10 = u10.getName().c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        id.f o10 = id.f.o(A.e(c10));
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(o10)).iterator();
        do {
            z10 = null;
            if (!it.hasNext()) {
                break;
            }
            Z z11 = (Z) it.next();
            if (z11.m().size() == 1 && (g10 = z11.g()) != null && Hc.g.C0(g10)) {
                kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f36672a;
                List m10 = z11.m();
                Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
                if (eVar.b(((j0) CollectionsKt.A0(m10)).getType(), u10.getType())) {
                    z10 = z11;
                }
            }
        } while (z10 == null);
        return z10;
    }

    private final AbstractC0948u w0(InterfaceC0933e interfaceC0933e) {
        AbstractC0948u h10 = interfaceC0933e.h();
        Intrinsics.checkNotNullExpressionValue(h10, "getVisibility(...)");
        if (!Intrinsics.b(h10, s.f9053b)) {
            return h10;
        }
        AbstractC0948u PROTECTED_AND_PACKAGE = s.f9054c;
        Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
        return PROTECTED_AND_PACKAGE;
    }

    private final Set y0(id.f fVar) {
        Collection c02 = c0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = c02.iterator();
        while (it.hasNext()) {
            CollectionsKt.z(linkedHashSet, ((AbstractC5197E) it.next()).w().a(fVar, Rc.d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // Wc.j
    protected boolean G(Uc.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (this.f11480o.x()) {
            return false;
        }
        return C0(eVar);
    }

    public void G0(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        Qc.a.a(w().a().l(), location, C(), name);
    }

    @Override // Wc.j
    protected j.a H(r method, List methodTypeParameters, AbstractC5197E returnType, List valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        j.b b10 = w().a().s().b(method, C(), returnType, null, valueParameters, methodTypeParameters);
        Intrinsics.checkNotNullExpressionValue(b10, "resolvePropagatedSignature(...)");
        AbstractC5197E d10 = b10.d();
        Intrinsics.checkNotNullExpressionValue(d10, "getReturnType(...)");
        AbstractC5197E c10 = b10.c();
        List f10 = b10.f();
        Intrinsics.checkNotNullExpressionValue(f10, "getValueParameters(...)");
        List e10 = b10.e();
        Intrinsics.checkNotNullExpressionValue(e10, "getTypeParameters(...)");
        boolean g10 = b10.g();
        List b11 = b10.b();
        Intrinsics.checkNotNullExpressionValue(b11, "getErrors(...)");
        return new j.a(d10, c10, f10, e10, g10, b11);
    }

    @Override // Wc.j, rd.i, rd.h
    public Collection a(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        G0(name, location);
        return super.a(name, location);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Wc.j
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet n(rd.d kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Collection a10 = C().r().a();
        Intrinsics.checkNotNullExpressionValue(a10, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            CollectionsKt.z(linkedHashSet, ((AbstractC5197E) it.next()).w().b());
        }
        linkedHashSet.addAll(((Wc.b) y().invoke()).a());
        linkedHashSet.addAll(((Wc.b) y().invoke()).d());
        linkedHashSet.addAll(l(kindFilter, function1));
        linkedHashSet.addAll(w().a().w().f(w(), C()));
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Wc.j
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public Wc.a p() {
        return new Wc.a(this.f11480o, a.f11487a);
    }

    @Override // Wc.j, rd.i, rd.h
    public Collection c(id.f name, Rc.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        G0(name, location);
        return super.c(name, location);
    }

    @Override // rd.i, rd.k
    public InterfaceC0936h f(id.f name, Rc.b location) {
        xd.h hVar;
        InterfaceC0933e interfaceC0933e;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        G0(name, location);
        g gVar = (g) B();
        return (gVar == null || (hVar = gVar.f11486u) == null || (interfaceC0933e = (InterfaceC0933e) hVar.invoke(name)) == null) ? (InterfaceC0936h) this.f11486u.invoke(name) : interfaceC0933e;
    }

    @Override // Wc.j
    protected Set l(rd.d kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return O.k((Set) this.f11483r.invoke(), ((Map) this.f11485t.invoke()).keySet());
    }

    @Override // Wc.j
    protected void o(Collection result, id.f name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f11480o.z() && ((Wc.b) y().invoke()).e(name) != null) {
            Collection collection = result;
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (((Z) it.next()).m().isEmpty()) {
                        break;
                    }
                }
            }
            w e10 = ((Wc.b) y().invoke()).e(name);
            Intrinsics.d(e10);
            result.add(I0(e10));
        }
        w().a().w().a(w(), C(), name, result);
    }

    @Override // Wc.j
    protected void r(Collection result, id.f name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        Set y02 = y0(name);
        if (!I.f8994a.k(name) && !C1156f.f9028o.l(name)) {
            if (y02 == null || !y02.isEmpty()) {
                Iterator it = y02.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC0952y) it.next()).z()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : y02) {
                if (C0((Z) obj)) {
                    arrayList.add(obj);
                }
            }
            W(result, name, arrayList, false);
            return;
        }
        Gd.g a10 = Gd.g.f3017c.a();
        Collection d10 = Tc.a.d(name, y02, CollectionsKt.j(), C(), ud.r.f43722a, w().a().k().a());
        Intrinsics.checkNotNullExpressionValue(d10, "resolveOverridesForNonStaticMembers(...)");
        X(name, result, d10, result, new b(this));
        X(name, result, d10, a10, new c(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : y02) {
            if (C0((Z) obj2)) {
                arrayList2.add(obj2);
            }
        }
        W(result, name, CollectionsKt.w0(arrayList2, a10), true);
    }

    @Override // Wc.j
    protected void s(id.f name, Collection result) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        if (this.f11480o.x()) {
            Z(name, result);
        }
        Set A02 = A0(name);
        if (A02.isEmpty()) {
            return;
        }
        g.b bVar = Gd.g.f3017c;
        Gd.g a10 = bVar.a();
        Gd.g a11 = bVar.a();
        Y(A02, result, a10, new d());
        Y(O.i(A02, a10), a11, null, new e());
        Collection d10 = Tc.a.d(name, O.k(A02, a11), result, C(), w().a().c(), w().a().k().a());
        Intrinsics.checkNotNullExpressionValue(d10, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(d10);
    }

    @Override // Wc.j
    protected Set t(rd.d kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (this.f11480o.x()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((Wc.b) y().invoke()).f());
        Collection a10 = C().r().a();
        Intrinsics.checkNotNullExpressionValue(a10, "getSupertypes(...)");
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            CollectionsKt.z(linkedHashSet, ((AbstractC5197E) it.next()).w().d());
        }
        return linkedHashSet;
    }

    @Override // Wc.j
    public String toString() {
        return "Lazy Java member scope for " + this.f11480o.e();
    }

    public final xd.i x0() {
        return this.f11482q;
    }

    @Override // Wc.j
    protected X z() {
        return kd.f.l(C());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Wc.j
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public InterfaceC0933e C() {
        return this.f11479n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Vc.g c10, InterfaceC0933e ownerDescriptor, Zc.g jClass, boolean z10, g gVar) {
        super(c10, gVar);
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f11479n = ownerDescriptor;
        this.f11480o = jClass;
        this.f11481p = z10;
        this.f11482q = c10.e().d(new f(c10));
        this.f11483r = c10.e().d(new j());
        this.f11484s = c10.e().d(new h(c10, this));
        this.f11485t = c10.e().d(new C0215g());
        this.f11486u = c10.e().i(new k(c10));
    }
}
