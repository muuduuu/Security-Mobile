package ad;

import Kc.AbstractC0946s;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.U;
import Kc.X;
import Kc.f0;
import Kc.j0;
import Mc.D;
import Sc.C1160j;
import Sc.EnumC1152b;
import Sc.J;
import Zc.InterfaceC1328a;
import bd.C1673A;
import bd.x;
import bd.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import nd.AbstractC3734d;
import od.AbstractC3778c;
import yd.AbstractC5197E;
import yd.L;
import yd.q0;
import yd.t0;

/* renamed from: ad.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1387l {

    /* renamed from: a, reason: collision with root package name */
    private final C1377d f12717a;

    /* renamed from: ad.l$a */
    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12718a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 t0Var) {
            InterfaceC0936h d10 = t0Var.W0().d();
            if (d10 == null) {
                return Boolean.FALSE;
            }
            id.f name = d10.getName();
            Jc.c cVar = Jc.c.f4890a;
            return Boolean.valueOf(Intrinsics.b(name, cVar.h().g()) && Intrinsics.b(AbstractC3778c.h(d10), cVar.h()));
        }
    }

    /* renamed from: ad.l$b */
    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f12719a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke(InterfaceC0930b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            X s02 = it.s0();
            Intrinsics.d(s02);
            AbstractC5197E type = s02.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return type;
        }
    }

    /* renamed from: ad.l$c */
    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f12720a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke(InterfaceC0930b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC5197E g10 = it.g();
            Intrinsics.d(g10);
            return g10;
        }
    }

    /* renamed from: ad.l$d */
    static final class d extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j0 f12721a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j0 j0Var) {
            super(1);
            this.f12721a = j0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke(InterfaceC0930b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC5197E type = ((j0) it.m().get(this.f12721a.getIndex())).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return type;
        }
    }

    /* renamed from: ad.l$e */
    static final class e extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f12722a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof L);
        }
    }

    public C1387l(C1377d typeEnhancement) {
        Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
        this.f12717a = typeEnhancement;
    }

    private final boolean a(AbstractC5197E abstractC5197E) {
        return q0.c(abstractC5197E, a.f12718a);
    }

    private final AbstractC5197E b(InterfaceC0930b interfaceC0930b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z10, Vc.g gVar, EnumC1152b enumC1152b, C1392q c1392q, boolean z11, Function1 function1) {
        C1389n c1389n = new C1389n(aVar, z10, gVar, enumC1152b, false, 16, null);
        AbstractC5197E abstractC5197E = (AbstractC5197E) function1.invoke(interfaceC0930b);
        Collection f10 = interfaceC0930b.f();
        Intrinsics.checkNotNullExpressionValue(f10, "getOverriddenDescriptors(...)");
        Collection<InterfaceC0930b> collection = f10;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(collection, 10));
        for (InterfaceC0930b interfaceC0930b2 : collection) {
            Intrinsics.d(interfaceC0930b2);
            arrayList.add((AbstractC5197E) function1.invoke(interfaceC0930b2));
        }
        return c(c1389n, abstractC5197E, arrayList, c1392q, z11);
    }

    private final AbstractC5197E c(C1389n c1389n, AbstractC5197E abstractC5197E, List list, C1392q c1392q, boolean z10) {
        return this.f12717a.a(abstractC5197E, c1389n.b(abstractC5197E, list, c1392q, z10), c1389n.u());
    }

    static /* synthetic */ AbstractC5197E d(C1387l c1387l, InterfaceC0930b interfaceC0930b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, boolean z10, Vc.g gVar, EnumC1152b enumC1152b, C1392q c1392q, boolean z11, Function1 function1, int i10, Object obj) {
        return c1387l.b(interfaceC0930b, aVar, z10, gVar, enumC1152b, c1392q, (i10 & 32) != 0 ? false : z11, function1);
    }

    static /* synthetic */ AbstractC5197E e(C1387l c1387l, C1389n c1389n, AbstractC5197E abstractC5197E, List list, C1392q c1392q, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c1392q = null;
        }
        C1392q c1392q2 = c1392q;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c1387l.c(c1389n, abstractC5197E, list, c1392q2, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final InterfaceC0930b f(InterfaceC0930b interfaceC0930b, Vc.g gVar) {
        InterfaceC0930b interfaceC0930b2;
        AbstractC5197E abstractC5197E;
        C1386k c1386k;
        AbstractC5197E d10;
        AbstractC5197E g10;
        boolean z10;
        AbstractC5197E abstractC5197E2;
        boolean z11;
        AbstractC5197E type;
        List a10;
        Uc.f fVar;
        D d11;
        if (!(interfaceC0930b instanceof Uc.a)) {
            return interfaceC0930b;
        }
        Uc.a aVar = (Uc.a) interfaceC0930b;
        boolean z12 = true;
        if (aVar.o() == InterfaceC0930b.a.FAKE_OVERRIDE && aVar.a().f().size() == 1) {
            return interfaceC0930b;
        }
        Vc.g h10 = Vc.a.h(gVar, k(interfaceC0930b, gVar));
        if (!(interfaceC0930b instanceof Uc.f) || (d11 = (fVar = (Uc.f) interfaceC0930b).d()) == null || d11.a0()) {
            interfaceC0930b2 = interfaceC0930b;
        } else {
            D d12 = fVar.d();
            Intrinsics.d(d12);
            interfaceC0930b2 = d12;
        }
        C1392q c1392q = null;
        if (aVar.s0() != null) {
            InterfaceC0952y interfaceC0952y = interfaceC0930b2 instanceof InterfaceC0952y ? (InterfaceC0952y) interfaceC0930b2 : null;
            abstractC5197E = j(interfaceC0930b, interfaceC0952y != null ? (j0) interfaceC0952y.A0(Uc.e.f10420G) : null, h10, null, false, b.f12719a);
        } else {
            abstractC5197E = null;
        }
        Uc.e eVar = interfaceC0930b instanceof Uc.e ? (Uc.e) interfaceC0930b : null;
        if (eVar != null) {
            C1673A c1673a = C1673A.f18936a;
            InterfaceC0941m b10 = eVar.b();
            Intrinsics.e(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            String a11 = x.a(c1673a, (InterfaceC0933e) b10, y.c(eVar, false, false, 3, null));
            if (a11 != null) {
                c1386k = (C1386k) AbstractC1383j.d().get(a11);
                if (c1386k != null) {
                    c1386k.a().size();
                    aVar.m().size();
                }
                boolean z13 = (!J.c(gVar.a().i()) || h10.a().q().b()) && J.b(interfaceC0930b);
                List m10 = interfaceC0930b2.m();
                String str = "getValueParameters(...)";
                Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
                List<j0> list = m10;
                char c10 = '\n';
                ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
                for (j0 j0Var : list) {
                    C1392q c1392q2 = (c1386k == null || (a10 = c1386k.a()) == null) ? c1392q : (C1392q) CollectionsKt.f0(a10, j0Var.getIndex());
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(j(interfaceC0930b, j0Var, h10, c1392q2, z13, new d(j0Var)));
                    arrayList = arrayList2;
                    str = str;
                    c10 = '\n';
                    c1392q = null;
                }
                ArrayList arrayList3 = arrayList;
                String str2 = str;
                U u10 = !(interfaceC0930b instanceof U) ? (U) interfaceC0930b : null;
                d10 = d(this, interfaceC0930b, interfaceC0930b2, true, h10, (u10 == null && Wc.c.a(u10)) ? EnumC1152b.FIELD : EnumC1152b.METHOD_RETURN_TYPE, c1386k == null ? c1386k.b() : null, false, c.f12720a, 32, null);
                g10 = aVar.g();
                Intrinsics.d(g10);
                if (!a(g10)) {
                    X s02 = aVar.s0();
                    if (!((s02 == null || (type = s02.getType()) == null) ? false : a(type))) {
                        List m11 = aVar.m();
                        Intrinsics.checkNotNullExpressionValue(m11, str2);
                        List list2 = m11;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                AbstractC5197E type2 = ((j0) it.next()).getType();
                                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                if (a(type2)) {
                                    z11 = true;
                                    break;
                                }
                            }
                        }
                        z11 = false;
                        if (!z11) {
                            z10 = false;
                            Pair a12 = z10 ? t.a(AbstractC3734d.a(), new C1160j(interfaceC0930b)) : null;
                            if (abstractC5197E == null && d10 == null) {
                                if (!arrayList3.isEmpty()) {
                                    Iterator it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        if (((AbstractC5197E) it2.next()) != null) {
                                            break;
                                        }
                                    }
                                }
                                z12 = false;
                                if (!z12 && a12 == null) {
                                    return interfaceC0930b;
                                }
                            }
                            if (abstractC5197E == null) {
                                X s03 = aVar.s0();
                                abstractC5197E2 = s03 != null ? s03.getType() : null;
                            } else {
                                abstractC5197E2 = abstractC5197E;
                            }
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.u(arrayList3, 10));
                            int i10 = 0;
                            for (Object obj : arrayList3) {
                                int i11 = i10 + 1;
                                if (i10 < 0) {
                                    CollectionsKt.t();
                                }
                                AbstractC5197E abstractC5197E3 = (AbstractC5197E) obj;
                                if (abstractC5197E3 == null) {
                                    abstractC5197E3 = ((j0) aVar.m().get(i10)).getType();
                                    Intrinsics.checkNotNullExpressionValue(abstractC5197E3, "getType(...)");
                                }
                                arrayList4.add(abstractC5197E3);
                                i10 = i11;
                            }
                            if (d10 == null) {
                                d10 = aVar.g();
                                Intrinsics.d(d10);
                            }
                            Uc.a g02 = aVar.g0(abstractC5197E2, arrayList4, d10, a12);
                            Intrinsics.e(g02, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                            return g02;
                        }
                    }
                }
                z10 = true;
                if (z10) {
                }
                if (abstractC5197E == null) {
                    if (!arrayList3.isEmpty()) {
                    }
                    z12 = false;
                    if (!z12) {
                        return interfaceC0930b;
                    }
                }
                if (abstractC5197E == null) {
                }
                ArrayList arrayList42 = new ArrayList(CollectionsKt.u(arrayList3, 10));
                int i102 = 0;
                while (r5.hasNext()) {
                }
                if (d10 == null) {
                }
                Uc.a g022 = aVar.g0(abstractC5197E2, arrayList42, d10, a12);
                Intrinsics.e(g022, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                return g022;
            }
        }
        c1386k = null;
        if (c1386k != null) {
        }
        if (J.c(gVar.a().i())) {
        }
        List m102 = interfaceC0930b2.m();
        String str3 = "getValueParameters(...)";
        Intrinsics.checkNotNullExpressionValue(m102, "getValueParameters(...)");
        List<j0> list3 = m102;
        char c102 = '\n';
        ArrayList arrayList5 = new ArrayList(CollectionsKt.u(list3, 10));
        while (r18.hasNext()) {
        }
        ArrayList arrayList32 = arrayList5;
        String str22 = str3;
        if (!(interfaceC0930b instanceof U)) {
        }
        d10 = d(this, interfaceC0930b, interfaceC0930b2, true, h10, (u10 == null && Wc.c.a(u10)) ? EnumC1152b.FIELD : EnumC1152b.METHOD_RETURN_TYPE, c1386k == null ? c1386k.b() : null, false, c.f12720a, 32, null);
        g10 = aVar.g();
        Intrinsics.d(g10);
        if (!a(g10)) {
        }
        z10 = true;
        if (z10) {
        }
        if (abstractC5197E == null) {
        }
        if (abstractC5197E == null) {
        }
        ArrayList arrayList422 = new ArrayList(CollectionsKt.u(arrayList32, 10));
        int i1022 = 0;
        while (r5.hasNext()) {
        }
        if (d10 == null) {
        }
        Uc.a g0222 = aVar.g0(abstractC5197E2, arrayList422, d10, a12);
        Intrinsics.e(g0222, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
        return g0222;
    }

    private final AbstractC5197E j(InterfaceC0930b interfaceC0930b, j0 j0Var, Vc.g gVar, C1392q c1392q, boolean z10, Function1 function1) {
        Vc.g h10;
        return b(interfaceC0930b, j0Var, false, (j0Var == null || (h10 = Vc.a.h(gVar, j0Var.i())) == null) ? gVar : h10, EnumC1152b.VALUE_PARAMETER, c1392q, z10, function1);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g k(InterfaceC0930b interfaceC0930b, Vc.g gVar) {
        InterfaceC0936h a10 = AbstractC0946s.a(interfaceC0930b);
        if (a10 == null) {
            return interfaceC0930b.i();
        }
        Wc.f fVar = a10 instanceof Wc.f ? (Wc.f) a10 : null;
        List Z02 = fVar != null ? fVar.Z0() : null;
        List list = Z02;
        if (list == null || list.isEmpty()) {
            return interfaceC0930b.i();
        }
        List list2 = Z02;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Wc.e(gVar, (InterfaceC1328a) it.next(), true));
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.a(CollectionsKt.u0(interfaceC0930b.i(), arrayList));
    }

    public final Collection g(Vc.g c10, Collection platformSignatures) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(platformSignatures, "platformSignatures");
        Collection collection = platformSignatures;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(f((InterfaceC0930b) it.next(), c10));
        }
        return arrayList;
    }

    public final AbstractC5197E h(AbstractC5197E type, Vc.g context) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        AbstractC5197E e10 = e(this, new C1389n(null, false, context, EnumC1152b.TYPE_USE, true), type, CollectionsKt.j(), null, false, 12, null);
        return e10 == null ? type : e10;
    }

    public final List i(f0 typeParameter, List bounds, Vc.g context) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        List<AbstractC5197E> list = bounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        for (AbstractC5197E abstractC5197E : list) {
            if (!Bd.a.b(abstractC5197E, e.f12722a)) {
                AbstractC5197E e10 = e(this, new C1389n(typeParameter, false, context, EnumC1152b.TYPE_PARAMETER_BOUNDS, false, 16, null), abstractC5197E, CollectionsKt.j(), null, false, 12, null);
                if (e10 != null) {
                    abstractC5197E = e10;
                }
            }
            arrayList.add(abstractC5197E);
        }
        return arrayList;
    }
}
