package Fc;

import Ec.D;
import Ec.L;
import Kc.H;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0941m;
import Kc.U;
import Kc.X;
import Kc.j0;
import Kc.k0;
import id.C3367b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import yd.AbstractC5197E;
import yd.M;
import yd.m0;
import yd.q0;

/* loaded from: classes3.dex */
public abstract class k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(e eVar, int i10, InterfaceC0930b interfaceC0930b, boolean z10) {
        if (g.a(eVar) == i10) {
            return;
        }
        throw new D("Inconsistent number of parameters in the descriptor and Java reflection object: " + g.a(eVar) + " != " + i10 + "\nCalling: " + interfaceC0930b + "\nParameter types: " + eVar.i() + ")\nDefault: " + z10);
    }

    public static final Object g(Object obj, InterfaceC0930b descriptor) {
        Class s10;
        Method l10;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if ((descriptor instanceof U) && kd.h.e((k0) descriptor)) {
            return obj;
        }
        AbstractC5197E k10 = k(descriptor);
        return (k10 == null || (s10 = s(k10)) == null || (l10 = l(s10, descriptor)) == null) ? obj : l10.invoke(obj, null);
    }

    public static final e h(e eVar, InterfaceC0930b descriptor, boolean z10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!kd.h.a(descriptor)) {
            List x02 = descriptor.x0();
            Intrinsics.checkNotNullExpressionValue(x02, "getContextReceiverParameters(...)");
            List list = x02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC5197E type = ((X) it.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    if (kd.h.h(type)) {
                        break;
                    }
                }
            }
            List m10 = descriptor.m();
            Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
            List list2 = m10;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    AbstractC5197E type2 = ((j0) it2.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    if (kd.h.h(type2)) {
                        break;
                    }
                }
            }
            AbstractC5197E g10 = descriptor.g();
            if ((g10 == null || !kd.h.c(g10)) && !p(descriptor)) {
                return eVar;
            }
        }
        return new j(descriptor, eVar, z10);
    }

    public static /* synthetic */ e i(e eVar, InterfaceC0930b interfaceC0930b, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return h(eVar, interfaceC0930b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method j(Class cls, InterfaceC0930b interfaceC0930b) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", l(cls, interfaceC0930b).getReturnType());
            Intrinsics.d(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new D("No box method found in inline class: " + cls + " (calling " + interfaceC0930b + ')');
        }
    }

    private static final AbstractC5197E k(InterfaceC0930b interfaceC0930b) {
        X s02 = interfaceC0930b.s0();
        X l02 = interfaceC0930b.l0();
        if (s02 != null) {
            return s02.getType();
        }
        if (l02 != null) {
            if (interfaceC0930b instanceof InterfaceC0940l) {
                return l02.getType();
            }
            InterfaceC0941m b10 = interfaceC0930b.b();
            InterfaceC0933e interfaceC0933e = b10 instanceof InterfaceC0933e ? (InterfaceC0933e) b10 : null;
            if (interfaceC0933e != null) {
                return interfaceC0933e.y();
            }
        }
        return null;
    }

    public static final Method l(Class cls, InterfaceC0930b descriptor) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            Intrinsics.d(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new D("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final List m(M type) {
        Intrinsics.checkNotNullParameter(type, "type");
        List n10 = n(m0.a(type));
        if (n10 == null) {
            return null;
        }
        List list = n10;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        InterfaceC0936h d10 = type.W0().d();
        Intrinsics.e(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class q10 = L.q((InterfaceC0933e) d10);
        Intrinsics.d(q10);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(q10.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    private static final List n(M m10) {
        Collection e10;
        if (!kd.h.i(m10)) {
            return null;
        }
        InterfaceC0936h d10 = m10.W0().d();
        Intrinsics.e(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        H q10 = AbstractC3778c.q((InterfaceC0933e) d10);
        Intrinsics.d(q10);
        List<Pair> b10 = q10.b();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : b10) {
            id.f fVar = (id.f) pair.getFirst();
            List n10 = n((M) pair.getSecond());
            if (n10 != null) {
                List list = n10;
                e10 = new ArrayList(CollectionsKt.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e10.add(fVar.e() + '-' + ((String) it.next()));
                }
            } else {
                e10 = CollectionsKt.e(fVar.e());
            }
            CollectionsKt.z(arrayList, e10);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List o(M m10, InterfaceC0930b interfaceC0930b) {
        Method l10;
        List m11 = m(m10);
        if (m11 != null) {
            return m11;
        }
        Class s10 = s(m10);
        if (s10 == null || (l10 = l(s10, interfaceC0930b)) == null) {
            return null;
        }
        return CollectionsKt.e(l10);
    }

    private static final boolean p(InterfaceC0930b interfaceC0930b) {
        AbstractC5197E k10 = k(interfaceC0930b);
        return k10 != null && kd.h.h(k10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List q(InterfaceC0930b interfaceC0930b, Function1 function1) {
        ArrayList arrayList = new ArrayList();
        X s02 = interfaceC0930b.s0();
        AbstractC5197E type = s02 != null ? s02.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (interfaceC0930b instanceof InterfaceC0940l) {
            InterfaceC0933e I10 = ((InterfaceC0940l) interfaceC0930b).I();
            Intrinsics.checkNotNullExpressionValue(I10, "getConstructedClass(...)");
            if (I10.S()) {
                InterfaceC0941m b10 = I10.b();
                Intrinsics.e(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((InterfaceC0933e) b10).y());
            }
        } else {
            InterfaceC0941m b11 = interfaceC0930b.b();
            Intrinsics.checkNotNullExpressionValue(b11, "getContainingDeclaration(...)");
            if ((b11 instanceof InterfaceC0933e) && ((Boolean) function1.invoke(b11)).booleanValue()) {
                arrayList.add(((InterfaceC0933e) b11).y());
            }
        }
        List m10 = interfaceC0930b.m();
        Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
        Iterator it = m10.iterator();
        while (it.hasNext()) {
            arrayList.add(((j0) it.next()).getType());
        }
        return arrayList;
    }

    public static final Class r(InterfaceC0941m interfaceC0941m) {
        if (!(interfaceC0941m instanceof InterfaceC0933e) || !kd.h.b(interfaceC0941m)) {
            return null;
        }
        InterfaceC0933e interfaceC0933e = (InterfaceC0933e) interfaceC0941m;
        Class q10 = L.q(interfaceC0933e);
        if (q10 != null) {
            return q10;
        }
        throw new D("Class object for the class " + interfaceC0933e.getName() + " cannot be found (classId=" + AbstractC3778c.k((InterfaceC0936h) interfaceC0941m) + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class s(AbstractC5197E abstractC5197E) {
        Class r10 = r(abstractC5197E.W0().d());
        if (r10 == null) {
            return null;
        }
        if (!q0.l(abstractC5197E)) {
            return r10;
        }
        AbstractC5197E k10 = kd.h.k(abstractC5197E);
        if (k10 == null || q0.l(k10) || Hc.g.s0(k10)) {
            return null;
        }
        return r10;
    }

    public static final String t(InterfaceC0936h interfaceC0936h) {
        Intrinsics.checkNotNullParameter(interfaceC0936h, "<this>");
        C3367b k10 = AbstractC3778c.k(interfaceC0936h);
        Intrinsics.d(k10);
        String c10 = k10.c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        return hd.b.b(c10);
    }
}
