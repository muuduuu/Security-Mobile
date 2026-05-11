package Hc;

import Hc.j;
import Ic.f;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import md.AbstractC3680g;
import md.C3686m;
import md.C3694u;
import od.AbstractC3778c;
import yd.AbstractC5197E;
import yd.C5198F;
import yd.M;
import yd.b0;
import yd.i0;

/* loaded from: classes3.dex */
public abstract class f {
    public static final int a(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c p10 = abstractC5197E.i().p(j.a.f3899D);
        if (p10 == null) {
            return 0;
        }
        AbstractC3680g abstractC3680g = (AbstractC3680g) G.i(p10.a(), j.f3881o);
        Intrinsics.e(abstractC3680g, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((C3686m) abstractC3680g).b()).intValue();
    }

    public static final M b(g builtIns, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, AbstractC5197E abstractC5197E, List contextReceiverTypes, List parameterTypes, List list, AbstractC5197E returnType, boolean z10) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        List g10 = g(abstractC5197E, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        InterfaceC0933e f10 = f(builtIns, parameterTypes.size() + contextReceiverTypes.size() + (abstractC5197E == null ? 0 : 1), z10);
        if (abstractC5197E != null) {
            annotations = u(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = t(annotations, builtIns, contextReceiverTypes.size());
        }
        return C5198F.g(b0.b(annotations), f10, g10);
    }

    public static final id.f d(AbstractC5197E abstractC5197E) {
        String str;
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c p10 = abstractC5197E.i().p(j.a.f3901E);
        if (p10 == null) {
            return null;
        }
        Object B02 = CollectionsKt.B0(p10.a().values());
        C3694u c3694u = B02 instanceof C3694u ? (C3694u) B02 : null;
        if (c3694u != null && (str = (String) c3694u.b()) != null) {
            if (!id.f.q(str)) {
                str = null;
            }
            if (str != null) {
                return id.f.o(str);
            }
        }
        return null;
    }

    public static final List e(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        p(abstractC5197E);
        int a10 = a(abstractC5197E);
        if (a10 == 0) {
            return CollectionsKt.j();
        }
        List subList = abstractC5197E.U0().subList(0, a10);
        ArrayList arrayList = new ArrayList(CollectionsKt.u(subList, 10));
        Iterator it = subList.iterator();
        while (it.hasNext()) {
            AbstractC5197E type = ((i0) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            arrayList.add(type);
        }
        return arrayList;
    }

    public static final InterfaceC0933e f(g builtIns, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        InterfaceC0933e X10 = z10 ? builtIns.X(i10) : builtIns.C(i10);
        Intrinsics.d(X10);
        return X10;
    }

    public static final List g(AbstractC5197E abstractC5197E, List contextReceiverTypes, List parameterTypes, List list, AbstractC5197E returnType, g builtIns) {
        id.f fVar;
        Intrinsics.checkNotNullParameter(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        int i10 = 0;
        ArrayList arrayList = new ArrayList(parameterTypes.size() + contextReceiverTypes.size() + (abstractC5197E != null ? 1 : 0) + 1);
        List list2 = contextReceiverTypes;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(Bd.a.a((AbstractC5197E) it.next()));
        }
        arrayList.addAll(arrayList2);
        Gd.a.a(arrayList, abstractC5197E != null ? Bd.a.a(abstractC5197E) : null);
        for (Object obj : parameterTypes) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.t();
            }
            AbstractC5197E abstractC5197E2 = (AbstractC5197E) obj;
            if (list == null || (fVar = (id.f) list.get(i10)) == null || fVar.p()) {
                fVar = null;
            }
            if (fVar != null) {
                id.c cVar = j.a.f3901E;
                id.f fVar2 = j.f3877k;
                String c10 = fVar.c();
                Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
                abstractC5197E2 = Bd.a.x(abstractC5197E2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.a(CollectionsKt.v0(abstractC5197E2.i(), new kotlin.reflect.jvm.internal.impl.descriptors.annotations.j(builtIns, cVar, G.e(t.a(fVar2, new C3694u(c10))), false, 8, null))));
            }
            arrayList.add(Bd.a.a(abstractC5197E2));
            i10 = i11;
        }
        arrayList.add(Bd.a.a(returnType));
        return arrayList;
    }

    public static final Ic.f h(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        if ((interfaceC0941m instanceof InterfaceC0933e) && g.B0(interfaceC0941m)) {
            return i(AbstractC3778c.m(interfaceC0941m));
        }
        return null;
    }

    private static final Ic.f i(id.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        Ic.g a10 = Ic.g.f4422c.a();
        id.c e10 = dVar.l().e();
        Intrinsics.checkNotNullExpressionValue(e10, "parent(...)");
        String c10 = dVar.i().c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        return a10.b(e10, c10);
    }

    public static final Ic.f j(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        if (d10 != null) {
            return h(d10);
        }
        return null;
    }

    public static final AbstractC5197E k(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        p(abstractC5197E);
        if (!s(abstractC5197E)) {
            return null;
        }
        return ((i0) abstractC5197E.U0().get(a(abstractC5197E))).getType();
    }

    public static final AbstractC5197E l(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        p(abstractC5197E);
        AbstractC5197E type = ((i0) CollectionsKt.n0(abstractC5197E.U0())).getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    public static final List m(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        p(abstractC5197E);
        return abstractC5197E.U0().subList(a(abstractC5197E) + (n(abstractC5197E) ? 1 : 0), r0.size() - 1);
    }

    public static final boolean n(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return p(abstractC5197E) && s(abstractC5197E);
    }

    public static final boolean o(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        Ic.f h10 = h(interfaceC0941m);
        return Intrinsics.b(h10, f.a.f4418e) || Intrinsics.b(h10, f.d.f4421e);
    }

    public static final boolean p(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        return d10 != null && o(d10);
    }

    public static final boolean q(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return Intrinsics.b(j(abstractC5197E), f.a.f4418e);
    }

    public static final boolean r(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return Intrinsics.b(j(abstractC5197E), f.d.f4421e);
    }

    private static final boolean s(AbstractC5197E abstractC5197E) {
        return abstractC5197E.i().p(j.a.f3897C) != null;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g t(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, g builtIns, int i10) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        id.c cVar = j.a.f3899D;
        if (gVar.A1(cVar)) {
            return gVar;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.a(CollectionsKt.v0(gVar, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.j(builtIns, cVar, G.e(t.a(j.f3881o, new C3686m(i10))), false, 8, null)));
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g u(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, g builtIns) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        id.c cVar = j.a.f3897C;
        if (gVar.A1(cVar)) {
            return gVar;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.a(CollectionsKt.v0(gVar, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.j(builtIns, cVar, G.h(), false, 8, null)));
    }
}
