package yd;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yd.f0;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: f, reason: collision with root package name */
    public static final a f45529f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5219v f45530a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f45531b;

    /* renamed from: c, reason: collision with root package name */
    private final xd.f f45532c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f45533d;

    /* renamed from: e, reason: collision with root package name */
    private final xd.g f45534e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC5197E a(AbstractC5197E abstractC5197E, n0 substitutor, Set set, boolean z10) {
            t0 t0Var;
            AbstractC5197E type;
            AbstractC5197E type2;
            AbstractC5197E type3;
            Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
            Intrinsics.checkNotNullParameter(substitutor, "substitutor");
            t0 Z02 = abstractC5197E.Z0();
            if (Z02 instanceof AbstractC5222y) {
                AbstractC5222y abstractC5222y = (AbstractC5222y) Z02;
                M e12 = abstractC5222y.e1();
                if (!e12.W0().c().isEmpty() && e12.W0().d() != null) {
                    List c10 = e12.W0().c();
                    Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
                    List<Kc.f0> list = c10;
                    ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
                    for (Kc.f0 f0Var : list) {
                        i0 i0Var = (i0) CollectionsKt.f0(abstractC5197E.U0(), f0Var.getIndex());
                        if (z10 && i0Var != null && (type3 = i0Var.getType()) != null) {
                            Intrinsics.d(type3);
                            if (!Bd.a.e(type3)) {
                                arrayList.add(i0Var);
                            }
                        }
                        boolean z11 = set != null && set.contains(f0Var);
                        if (i0Var != null && !z11) {
                            l0 j10 = substitutor.j();
                            AbstractC5197E type4 = i0Var.getType();
                            Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                            if (j10.e(type4) != null) {
                                arrayList.add(i0Var);
                            }
                        }
                        i0Var = new T(f0Var);
                        arrayList.add(i0Var);
                    }
                    e12 = m0.f(e12, arrayList, null, 2, null);
                }
                M f12 = abstractC5222y.f1();
                if (!f12.W0().c().isEmpty() && f12.W0().d() != null) {
                    List c11 = f12.W0().c();
                    Intrinsics.checkNotNullExpressionValue(c11, "getParameters(...)");
                    List<Kc.f0> list2 = c11;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list2, 10));
                    for (Kc.f0 f0Var2 : list2) {
                        i0 i0Var2 = (i0) CollectionsKt.f0(abstractC5197E.U0(), f0Var2.getIndex());
                        if (z10 && i0Var2 != null && (type2 = i0Var2.getType()) != null) {
                            Intrinsics.d(type2);
                            if (!Bd.a.e(type2)) {
                                arrayList2.add(i0Var2);
                            }
                        }
                        boolean z12 = set != null && set.contains(f0Var2);
                        if (i0Var2 != null && !z12) {
                            l0 j11 = substitutor.j();
                            AbstractC5197E type5 = i0Var2.getType();
                            Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                            if (j11.e(type5) != null) {
                                arrayList2.add(i0Var2);
                            }
                        }
                        i0Var2 = new T(f0Var2);
                        arrayList2.add(i0Var2);
                    }
                    f12 = m0.f(f12, arrayList2, null, 2, null);
                }
                t0Var = C5198F.d(e12, f12);
            } else {
                if (!(Z02 instanceof M)) {
                    throw new lc.m();
                }
                M m10 = (M) Z02;
                if (m10.W0().c().isEmpty() || m10.W0().d() == null) {
                    t0Var = m10;
                } else {
                    List c12 = m10.W0().c();
                    Intrinsics.checkNotNullExpressionValue(c12, "getParameters(...)");
                    List<Kc.f0> list3 = c12;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.u(list3, 10));
                    for (Kc.f0 f0Var3 : list3) {
                        i0 i0Var3 = (i0) CollectionsKt.f0(abstractC5197E.U0(), f0Var3.getIndex());
                        if (z10 && i0Var3 != null && (type = i0Var3.getType()) != null) {
                            Intrinsics.d(type);
                            if (!Bd.a.e(type)) {
                                arrayList3.add(i0Var3);
                            }
                        }
                        boolean z13 = set != null && set.contains(f0Var3);
                        if (i0Var3 != null && !z13) {
                            l0 j12 = substitutor.j();
                            AbstractC5197E type6 = i0Var3.getType();
                            Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                            if (j12.e(type6) != null) {
                                arrayList3.add(i0Var3);
                            }
                        }
                        i0Var3 = new T(f0Var3);
                        arrayList3.add(i0Var3);
                    }
                    t0Var = m0.f(m10, arrayList3, null, 2, null);
                }
            }
            AbstractC5197E n10 = substitutor.n(s0.b(t0Var, Z02), u0.OUT_VARIANCE);
            Intrinsics.checkNotNullExpressionValue(n10, "safeSubstitute(...)");
            return n10;
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Kc.f0 f45535a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC5220w f45536b;

        public b(Kc.f0 typeParameter, AbstractC5220w typeAttr) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
            this.f45535a = typeParameter;
            this.f45536b = typeAttr;
        }

        public final AbstractC5220w a() {
            return this.f45536b;
        }

        public final Kc.f0 b() {
            return this.f45535a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.b(bVar.f45535a, this.f45535a) && Intrinsics.b(bVar.f45536b, this.f45536b);
        }

        public int hashCode() {
            int hashCode = this.f45535a.hashCode();
            return hashCode + (hashCode * 31) + this.f45536b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f45535a + ", typeAttr=" + this.f45536b + ')';
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.types.error.h invoke() {
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.CANNOT_COMPUTE_ERASED_BOUND, h0.this.toString());
        }
    }

    static final class d extends xc.m implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke(b bVar) {
            return h0.this.d(bVar.b(), bVar.a());
        }
    }

    public h0(AbstractC5219v projectionComputer, g0 options) {
        Intrinsics.checkNotNullParameter(projectionComputer, "projectionComputer");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f45530a = projectionComputer;
        this.f45531b = options;
        xd.f fVar = new xd.f("Type parameter upper bound erasure results");
        this.f45532c = fVar;
        this.f45533d = lc.i.a(new c());
        xd.g h10 = fVar.h(new d());
        Intrinsics.checkNotNullExpressionValue(h10, "createMemoizedFunction(...)");
        this.f45534e = h10;
    }

    private final AbstractC5197E b(AbstractC5220w abstractC5220w) {
        AbstractC5197E y10;
        M a10 = abstractC5220w.a();
        return (a10 == null || (y10 = Bd.a.y(a10)) == null) ? e() : y10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5197E d(Kc.f0 f0Var, AbstractC5220w abstractC5220w) {
        i0 a10;
        Set c10 = abstractC5220w.c();
        if (c10 != null && c10.contains(f0Var.a())) {
            return b(abstractC5220w);
        }
        M y10 = f0Var.y();
        Intrinsics.checkNotNullExpressionValue(y10, "getDefaultType(...)");
        Set<Kc.f0> g10 = Bd.a.g(y10, c10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(kotlin.collections.G.d(CollectionsKt.u(g10, 10)), 16));
        for (Kc.f0 f0Var2 : g10) {
            if (c10 == null || !c10.contains(f0Var2)) {
                a10 = this.f45530a.a(f0Var2, abstractC5220w, this, c(f0Var2, abstractC5220w.d(f0Var)));
            } else {
                a10 = q0.t(f0Var2, abstractC5220w);
                Intrinsics.checkNotNullExpressionValue(a10, "makeStarProjection(...)");
            }
            Pair a11 = lc.t.a(f0Var2.r(), a10);
            linkedHashMap.put(a11.c(), a11.d());
        }
        n0 g11 = n0.g(f0.a.e(f0.f45524c, linkedHashMap, false, 2, null));
        Intrinsics.checkNotNullExpressionValue(g11, "create(...)");
        List upperBounds = f0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        Set f10 = f(g11, upperBounds, abstractC5220w);
        if (f10.isEmpty()) {
            return b(abstractC5220w);
        }
        if (!this.f45531b.a()) {
            if (f10.size() == 1) {
                return (AbstractC5197E) CollectionsKt.z0(f10);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
        List O02 = CollectionsKt.O0(f10);
        ArrayList arrayList = new ArrayList(CollectionsKt.u(O02, 10));
        Iterator it = O02.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC5197E) it.next()).Z0());
        }
        return kotlin.reflect.jvm.internal.impl.types.checker.d.a(arrayList);
    }

    private final kotlin.reflect.jvm.internal.impl.types.error.h e() {
        return (kotlin.reflect.jvm.internal.impl.types.error.h) this.f45533d.getValue();
    }

    private final Set f(n0 n0Var, List list, AbstractC5220w abstractC5220w) {
        Set b10 = kotlin.collections.O.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5197E abstractC5197E = (AbstractC5197E) it.next();
            InterfaceC0936h d10 = abstractC5197E.W0().d();
            if (d10 instanceof InterfaceC0933e) {
                b10.add(f45529f.a(abstractC5197E, n0Var, abstractC5220w.c(), this.f45531b.b()));
            } else if (d10 instanceof Kc.f0) {
                Set c10 = abstractC5220w.c();
                if (c10 == null || !c10.contains(d10)) {
                    List upperBounds = ((Kc.f0) d10).getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                    b10.addAll(f(n0Var, upperBounds, abstractC5220w));
                } else {
                    b10.add(b(abstractC5220w));
                }
            }
            if (!this.f45531b.a()) {
                break;
            }
        }
        return kotlin.collections.O.a(b10);
    }

    public final AbstractC5197E c(Kc.f0 typeParameter, AbstractC5220w typeAttr) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Object invoke = this.f45534e.invoke(new b(typeParameter, typeAttr));
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return (AbstractC5197E) invoke;
    }

    public /* synthetic */ h0(AbstractC5219v abstractC5219v, g0 g0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5219v, (i10 & 2) != 0 ? new g0(false, false) : g0Var);
    }
}
