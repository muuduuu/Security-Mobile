package Bd;

import Hc.g;
import Kc.EnumC0934f;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0937i;
import Kc.e0;
import Kc.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.error.h;
import xc.m;
import yd.AbstractC5197E;
import yd.AbstractC5222y;
import yd.C5198F;
import yd.C5213o;
import yd.M;
import yd.T;
import yd.b0;
import yd.i0;
import yd.k0;
import yd.m0;
import yd.q0;
import yd.s0;
import yd.t0;
import yd.u0;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: Bd.a$a, reason: collision with other inner class name */
    static final class C0013a extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0013a f576a = new C0013a();

        C0013a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC0936h d10 = it.W0().d();
            return Boolean.valueOf(d10 != null ? a.s(d10) : false);
        }
    }

    static final class b extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f577a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 t0Var) {
            return Boolean.valueOf(q0.m(t0Var));
        }
    }

    static final class c extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f578a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC0936h d10 = it.W0().d();
            boolean z10 = false;
            if (d10 != null && ((d10 instanceof e0) || (d10 instanceof f0))) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final i0 a(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return new k0(abstractC5197E);
    }

    public static final boolean b(AbstractC5197E abstractC5197E, Function1 predicate) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return q0.c(abstractC5197E, predicate);
    }

    private static final boolean c(AbstractC5197E abstractC5197E, yd.e0 e0Var, Set set) {
        boolean c10;
        if (Intrinsics.b(abstractC5197E.W0(), e0Var)) {
            return true;
        }
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        InterfaceC0937i interfaceC0937i = d10 instanceof InterfaceC0937i ? (InterfaceC0937i) d10 : null;
        List B10 = interfaceC0937i != null ? interfaceC0937i.B() : null;
        Iterable<IndexedValue> U02 = CollectionsKt.U0(abstractC5197E.U0());
        if (!(U02 instanceof Collection) || !((Collection) U02).isEmpty()) {
            for (IndexedValue indexedValue : U02) {
                int index = indexedValue.getIndex();
                i0 i0Var = (i0) indexedValue.getValue();
                f0 f0Var = B10 != null ? (f0) CollectionsKt.f0(B10, index) : null;
                if ((f0Var == null || set == null || !set.contains(f0Var)) && !i0Var.c()) {
                    AbstractC5197E type = i0Var.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    c10 = c(type, e0Var, set);
                } else {
                    c10 = false;
                }
                if (c10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean d(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return b(abstractC5197E, C0013a.f576a);
    }

    public static final boolean e(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return q0.c(abstractC5197E, b.f577a);
    }

    public static final i0 f(AbstractC5197E type, u0 projectionKind, f0 f0Var) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(projectionKind, "projectionKind");
        if ((f0Var != null ? f0Var.u() : null) == projectionKind) {
            projectionKind = u0.INVARIANT;
        }
        return new k0(projectionKind, type);
    }

    public static final Set g(AbstractC5197E abstractC5197E, Set set) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h(abstractC5197E, abstractC5197E, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void h(AbstractC5197E abstractC5197E, AbstractC5197E abstractC5197E2, Set set, Set set2) {
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        if (d10 instanceof f0) {
            if (!Intrinsics.b(abstractC5197E.W0(), abstractC5197E2.W0())) {
                set.add(d10);
                return;
            }
            for (AbstractC5197E abstractC5197E3 : ((f0) d10).getUpperBounds()) {
                Intrinsics.d(abstractC5197E3);
                h(abstractC5197E3, abstractC5197E2, set, set2);
            }
            return;
        }
        InterfaceC0936h d11 = abstractC5197E.W0().d();
        InterfaceC0937i interfaceC0937i = d11 instanceof InterfaceC0937i ? (InterfaceC0937i) d11 : null;
        List B10 = interfaceC0937i != null ? interfaceC0937i.B() : null;
        int i10 = 0;
        for (i0 i0Var : abstractC5197E.U0()) {
            int i11 = i10 + 1;
            f0 f0Var = B10 != null ? (f0) CollectionsKt.f0(B10, i10) : null;
            if ((f0Var == null || set2 == null || !set2.contains(f0Var)) && !i0Var.c() && !CollectionsKt.V(set, i0Var.getType().W0().d()) && !Intrinsics.b(i0Var.getType().W0(), abstractC5197E2.W0())) {
                AbstractC5197E type = i0Var.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                h(type, abstractC5197E2, set, set2);
            }
            i10 = i11;
        }
    }

    public static final g i(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        g v10 = abstractC5197E.W0().v();
        Intrinsics.checkNotNullExpressionValue(v10, "getBuiltIns(...)");
        return v10;
    }

    public static final AbstractC5197E j(f0 f0Var) {
        Object obj;
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        List upperBounds = f0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = f0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC0936h d10 = ((AbstractC5197E) next).W0().d();
            InterfaceC0933e interfaceC0933e = d10 instanceof InterfaceC0933e ? (InterfaceC0933e) d10 : null;
            if (interfaceC0933e != null && interfaceC0933e.o() != EnumC0934f.INTERFACE && interfaceC0933e.o() != EnumC0934f.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        AbstractC5197E abstractC5197E = (AbstractC5197E) obj;
        if (abstractC5197E != null) {
            return abstractC5197E;
        }
        List upperBounds3 = f0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds3, "getUpperBounds(...)");
        Object d02 = CollectionsKt.d0(upperBounds3);
        Intrinsics.checkNotNullExpressionValue(d02, "first(...)");
        return (AbstractC5197E) d02;
    }

    public static final boolean k(f0 typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        return m(typeParameter, null, null, 6, null);
    }

    public static final boolean l(f0 typeParameter, yd.e0 e0Var, Set set) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        List upperBounds = typeParameter.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        List<AbstractC5197E> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (AbstractC5197E abstractC5197E : list) {
            Intrinsics.d(abstractC5197E);
            if (c(abstractC5197E, typeParameter.y().W0(), set) && (e0Var == null || Intrinsics.b(abstractC5197E.W0(), e0Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean m(f0 f0Var, yd.e0 e0Var, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e0Var = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return l(f0Var, e0Var, set);
    }

    public static final boolean n(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return g.f0(abstractC5197E);
    }

    public static final boolean o(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return g.n0(abstractC5197E);
    }

    public static final boolean p(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        if (!(abstractC5197E instanceof C5213o)) {
            return false;
        }
        ((C5213o) abstractC5197E).i1();
        return false;
    }

    public static final boolean q(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        if (!(abstractC5197E instanceof C5213o)) {
            return false;
        }
        ((C5213o) abstractC5197E).i1();
        return false;
    }

    public static final boolean r(AbstractC5197E abstractC5197E, AbstractC5197E superType) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return e.f36672a.c(abstractC5197E, superType);
    }

    public static final boolean s(InterfaceC0936h interfaceC0936h) {
        Intrinsics.checkNotNullParameter(interfaceC0936h, "<this>");
        return (interfaceC0936h instanceof f0) && (((f0) interfaceC0936h).b() instanceof e0);
    }

    public static final boolean t(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return q0.m(abstractC5197E);
    }

    public static final boolean u(AbstractC5197E type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return (type instanceof h) && ((h) type).g1().isUnresolved();
    }

    public static final AbstractC5197E v(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        AbstractC5197E n10 = q0.n(abstractC5197E);
        Intrinsics.checkNotNullExpressionValue(n10, "makeNotNullable(...)");
        return n10;
    }

    public static final AbstractC5197E w(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        AbstractC5197E o10 = q0.o(abstractC5197E);
        Intrinsics.checkNotNullExpressionValue(o10, "makeNullable(...)");
        return o10;
    }

    public static final AbstractC5197E x(AbstractC5197E abstractC5197E, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        return (abstractC5197E.i().isEmpty() && newAnnotations.isEmpty()) ? abstractC5197E : abstractC5197E.Z0().c1(b0.a(abstractC5197E.V0(), newAnnotations));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [yd.t0] */
    public static final AbstractC5197E y(AbstractC5197E abstractC5197E) {
        M m10;
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        t0 Z02 = abstractC5197E.Z0();
        if (Z02 instanceof AbstractC5222y) {
            AbstractC5222y abstractC5222y = (AbstractC5222y) Z02;
            M e12 = abstractC5222y.e1();
            if (!e12.W0().c().isEmpty() && e12.W0().d() != null) {
                List c10 = e12.W0().c();
                Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
                List list = c10;
                ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new T((f0) it.next()));
                }
                e12 = m0.f(e12, arrayList, null, 2, null);
            }
            M f12 = abstractC5222y.f1();
            if (!f12.W0().c().isEmpty() && f12.W0().d() != null) {
                List c11 = f12.W0().c();
                Intrinsics.checkNotNullExpressionValue(c11, "getParameters(...)");
                List list2 = c11;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new T((f0) it2.next()));
                }
                f12 = m0.f(f12, arrayList2, null, 2, null);
            }
            m10 = C5198F.d(e12, f12);
        } else {
            if (!(Z02 instanceof M)) {
                throw new lc.m();
            }
            M m11 = (M) Z02;
            boolean isEmpty = m11.W0().c().isEmpty();
            m10 = m11;
            if (!isEmpty) {
                InterfaceC0936h d10 = m11.W0().d();
                m10 = m11;
                if (d10 != null) {
                    List c12 = m11.W0().c();
                    Intrinsics.checkNotNullExpressionValue(c12, "getParameters(...)");
                    List list3 = c12;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.u(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new T((f0) it3.next()));
                    }
                    m10 = m0.f(m11, arrayList3, null, 2, null);
                }
            }
        }
        return s0.b(m10, Z02);
    }

    public static final boolean z(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return b(abstractC5197E, c.f578a);
    }
}
