package Ec;

import Kc.InterfaceC0929a;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.X;
import Kc.a0;
import Oc.l;
import dd.C3032i;
import dd.C3037n;
import fd.AbstractC3165a;
import id.C3367b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import md.AbstractC3680g;
import md.AbstractC3684k;
import md.C3674a;
import md.C3675b;
import md.C3683j;
import md.C3689p;
import md.C3691r;
import md.C3695v;
import od.AbstractC3778c;
import vc.AbstractC5011a;
import xc.AbstractC5156i;
import xc.InterfaceC5144E;
import yd.AbstractC5197E;
import yd.i0;

/* loaded from: classes3.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    private static final id.c f1953a = new id.c("kotlin.jvm.JvmStatic");

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1954a;

        static {
            int[] iArr = new int[Hc.h.values().length];
            try {
                iArr[Hc.h.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Hc.h.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Hc.h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Hc.h.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Hc.h.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Hc.h.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Hc.h.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Hc.h.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f1954a = iArr;
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v12, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v14, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Object a(C3675b c3675b, ClassLoader classLoader) {
        AbstractC5197E c10;
        Class o10;
        short[] sArr;
        C3695v c3695v = c3675b instanceof C3695v ? (C3695v) c3675b : null;
        if (c3695v == null || (c10 = c3695v.c()) == null) {
            return null;
        }
        Iterable iterable = (Iterable) c3675b.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(r((AbstractC3680g) it.next(), classLoader));
        }
        Hc.h N10 = Hc.g.N(c10);
        int i10 = 0;
        switch (N10 == null ? -1 : a.f1954a[N10.ordinal()]) {
            case -1:
                if (!Hc.g.c0(c10)) {
                    throw new IllegalStateException(("Not an array type: " + c10).toString());
                }
                AbstractC5197E type = ((i0) CollectionsKt.A0(c10.U0())).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                InterfaceC0936h d10 = type.W0().d();
                InterfaceC0933e interfaceC0933e = d10 instanceof InterfaceC0933e ? (InterfaceC0933e) d10 : null;
                if (interfaceC0933e == null) {
                    throw new IllegalStateException(("Not a class type: " + type).toString());
                }
                if (Hc.g.v0(type)) {
                    int size = ((List) c3675b.b()).size();
                    sArr = new String[size];
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.String");
                        sArr[i10] = obj;
                        i10++;
                    }
                } else if (Hc.g.l0(interfaceC0933e)) {
                    int size2 = ((List) c3675b.b()).size();
                    sArr = new Class[size2];
                    while (i10 < size2) {
                        Object obj2 = arrayList.get(i10);
                        Intrinsics.e(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                        sArr[i10] = obj2;
                        i10++;
                    }
                } else {
                    C3367b k10 = AbstractC3778c.k(interfaceC0933e);
                    if (k10 == null || (o10 = o(classLoader, k10, 0, 4, null)) == null) {
                        return null;
                    }
                    Object newInstance = Array.newInstance((Class<?>) o10, ((List) c3675b.b()).size());
                    Intrinsics.e(newInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                    sArr = (Object[]) newInstance;
                    int size3 = arrayList.size();
                    while (i10 < size3) {
                        sArr[i10] = arrayList.get(i10);
                        i10++;
                    }
                }
                return sArr;
            case 0:
            default:
                throw new lc.m();
            case 1:
                int size4 = ((List) c3675b.b()).size();
                sArr = new boolean[size4];
                while (i10 < size4) {
                    Object obj3 = arrayList.get(i10);
                    Intrinsics.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    sArr[i10] = ((Boolean) obj3).booleanValue();
                    i10++;
                }
                return sArr;
            case 2:
                int size5 = ((List) c3675b.b()).size();
                sArr = new char[size5];
                while (i10 < size5) {
                    Object obj4 = arrayList.get(i10);
                    Intrinsics.e(obj4, "null cannot be cast to non-null type kotlin.Char");
                    sArr[i10] = ((Character) obj4).charValue();
                    i10++;
                }
                return sArr;
            case 3:
                int size6 = ((List) c3675b.b()).size();
                sArr = new byte[size6];
                while (i10 < size6) {
                    Object obj5 = arrayList.get(i10);
                    Intrinsics.e(obj5, "null cannot be cast to non-null type kotlin.Byte");
                    sArr[i10] = ((Byte) obj5).byteValue();
                    i10++;
                }
                return sArr;
            case 4:
                int size7 = ((List) c3675b.b()).size();
                sArr = new short[size7];
                while (i10 < size7) {
                    Object obj6 = arrayList.get(i10);
                    Intrinsics.e(obj6, "null cannot be cast to non-null type kotlin.Short");
                    sArr[i10] = ((Short) obj6).shortValue();
                    i10++;
                }
                return sArr;
            case 5:
                int size8 = ((List) c3675b.b()).size();
                sArr = new int[size8];
                while (i10 < size8) {
                    Object obj7 = arrayList.get(i10);
                    Intrinsics.e(obj7, "null cannot be cast to non-null type kotlin.Int");
                    sArr[i10] = ((Integer) obj7).intValue();
                    i10++;
                }
                return sArr;
            case 6:
                int size9 = ((List) c3675b.b()).size();
                sArr = new float[size9];
                while (i10 < size9) {
                    Object obj8 = arrayList.get(i10);
                    Intrinsics.e(obj8, "null cannot be cast to non-null type kotlin.Float");
                    sArr[i10] = ((Float) obj8).floatValue();
                    i10++;
                }
                return sArr;
            case 7:
                int size10 = ((List) c3675b.b()).size();
                sArr = new long[size10];
                while (i10 < size10) {
                    Object obj9 = arrayList.get(i10);
                    Intrinsics.e(obj9, "null cannot be cast to non-null type kotlin.Long");
                    sArr[i10] = ((Long) obj9).longValue();
                    i10++;
                }
                return sArr;
            case 8:
                int size11 = ((List) c3675b.b()).size();
                sArr = new double[size11];
                while (i10 < size11) {
                    Object obj10 = arrayList.get(i10);
                    Intrinsics.e(obj10, "null cannot be cast to non-null type kotlin.Double");
                    sArr[i10] = ((Double) obj10).doubleValue();
                    i10++;
                }
                return sArr;
        }
    }

    public static final AbstractC0831j b(Object obj) {
        AbstractC0831j abstractC0831j = obj instanceof AbstractC0831j ? (AbstractC0831j) obj : null;
        if (abstractC0831j != null) {
            return abstractC0831j;
        }
        o c10 = c(obj);
        return c10 != null ? c10 : d(obj);
    }

    public static final o c(Object obj) {
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar != null) {
            return oVar;
        }
        AbstractC5156i abstractC5156i = obj instanceof AbstractC5156i ? (AbstractC5156i) obj : null;
        kotlin.reflect.c u10 = abstractC5156i != null ? abstractC5156i.u() : null;
        if (u10 instanceof o) {
            return (o) u10;
        }
        return null;
    }

    public static final y d(Object obj) {
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar != null) {
            return yVar;
        }
        xc.x xVar = obj instanceof xc.x ? (xc.x) obj : null;
        kotlin.reflect.c u10 = xVar != null ? xVar.u() : null;
        if (u10 instanceof y) {
            return (y) u10;
        }
        return null;
    }

    public static final List e(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar) {
        Annotation p10;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> i10 = aVar.i();
        ArrayList arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : i10) {
            a0 j10 = cVar.j();
            if (j10 instanceof Oc.b) {
                p10 = ((Oc.b) j10).d();
            } else if (j10 instanceof l.a) {
                Pc.p b10 = ((l.a) j10).b();
                Pc.e eVar = b10 instanceof Pc.e ? (Pc.e) b10 : null;
                p10 = eVar != null ? eVar.X() : null;
            } else {
                p10 = p(cVar);
            }
            if (p10 != null) {
                arrayList.add(p10);
            }
        }
        return s(arrayList);
    }

    public static final Class f(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static final Object g(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (Intrinsics.b(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (Intrinsics.b(type, Character.TYPE)) {
            return (char) 0;
        }
        if (Intrinsics.b(type, Byte.TYPE)) {
            return (byte) 0;
        }
        if (Intrinsics.b(type, Short.TYPE)) {
            return (short) 0;
        }
        if (Intrinsics.b(type, Integer.TYPE)) {
            return 0;
        }
        if (Intrinsics.b(type, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (Intrinsics.b(type, Long.TYPE)) {
            return 0L;
        }
        if (Intrinsics.b(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (Intrinsics.b(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final InterfaceC0929a h(Class moduleAnchor, kotlin.reflect.jvm.internal.impl.protobuf.p proto, fd.c nameResolver, fd.g typeTable, AbstractC3165a metadataVersion, Function2 createDescriptor) {
        List j02;
        Intrinsics.checkNotNullParameter(moduleAnchor, "moduleAnchor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(createDescriptor, "createDescriptor");
        Oc.k a10 = E.a(moduleAnchor);
        if (proto instanceof C3032i) {
            j02 = ((C3032i) proto).i0();
        } else {
            if (!(proto instanceof C3037n)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            j02 = ((C3037n) proto).j0();
        }
        List list = j02;
        ud.k a11 = a10.a();
        Kc.G b10 = a10.b();
        fd.h b11 = fd.h.f33043b.b();
        Intrinsics.d(list);
        return (InterfaceC0929a) createDescriptor.invoke(new ud.x(new ud.m(a11, nameResolver, b10, typeTable, b11, metadataVersion, null, null, list)), proto);
    }

    public static final X i(InterfaceC0929a interfaceC0929a) {
        Intrinsics.checkNotNullParameter(interfaceC0929a, "<this>");
        if (interfaceC0929a.l0() == null) {
            return null;
        }
        InterfaceC0941m b10 = interfaceC0929a.b();
        Intrinsics.e(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC0933e) b10).S0();
    }

    public static final id.c j() {
        return f1953a;
    }

    public static final boolean k(kotlin.reflect.o oVar) {
        AbstractC5197E r10;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        A a10 = oVar instanceof A ? (A) oVar : null;
        return (a10 == null || (r10 = a10.r()) == null || !kd.h.i(r10)) ? false : true;
    }

    public static final boolean l(kotlin.reflect.o oVar) {
        AbstractC5197E r10;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        A a10 = oVar instanceof A ? (A) oVar : null;
        return (a10 == null || (r10 = a10.r()) == null || !kd.h.c(r10)) ? false : true;
    }

    private static final Class m(ClassLoader classLoader, C3367b c3367b, int i10) {
        Jc.c cVar = Jc.c.f4890a;
        id.d j10 = c3367b.b().j();
        Intrinsics.checkNotNullExpressionValue(j10, "toUnsafe(...)");
        C3367b n10 = cVar.n(j10);
        if (n10 != null) {
            c3367b = n10;
        }
        String b10 = c3367b.h().b();
        Intrinsics.checkNotNullExpressionValue(b10, "asString(...)");
        String b11 = c3367b.i().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        return n(classLoader, b10, b11, i10);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static final Class n(ClassLoader classLoader, String str, String str2, int i10) {
        if (Intrinsics.b(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (str.length() > 0) {
            sb2.append(str + '.');
        }
        sb2.append(StringsKt.y(str2, '.', '$', false, 4, null));
        if (i10 > 0) {
            sb2.append(";");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return Oc.e.a(classLoader, sb3);
    }

    static /* synthetic */ Class o(ClassLoader classLoader, C3367b c3367b, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m(classLoader, c3367b, i10);
    }

    private static final Annotation p(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        InterfaceC0933e i10 = AbstractC3778c.i(cVar);
        Class q10 = i10 != null ? q(i10) : null;
        if (q10 == null) {
            q10 = null;
        }
        if (q10 == null) {
            return null;
        }
        Set<Map.Entry> entrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            id.f fVar = (id.f) entry.getKey();
            AbstractC3680g abstractC3680g = (AbstractC3680g) entry.getValue();
            ClassLoader classLoader = q10.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
            Object r10 = r(abstractC3680g, classLoader);
            Pair a10 = r10 != null ? lc.t.a(fVar.c(), r10) : null;
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return (Annotation) Fc.c.e(q10, kotlin.collections.G.r(arrayList), null, 4, null);
    }

    public static final Class q(InterfaceC0933e interfaceC0933e) {
        Intrinsics.checkNotNullParameter(interfaceC0933e, "<this>");
        a0 j10 = interfaceC0933e.j();
        Intrinsics.checkNotNullExpressionValue(j10, "getSource(...)");
        if (j10 instanceof bd.v) {
            bd.t d10 = ((bd.v) j10).d();
            Intrinsics.e(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((Oc.f) d10).d();
        }
        if (j10 instanceof l.a) {
            Pc.p b10 = ((l.a) j10).b();
            Intrinsics.e(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((Pc.l) b10).C();
        }
        C3367b k10 = AbstractC3778c.k(interfaceC0933e);
        if (k10 == null) {
            return null;
        }
        return m(Pc.d.f(interfaceC0933e.getClass()), k10, 0);
    }

    private static final Object r(AbstractC3680g abstractC3680g, ClassLoader classLoader) {
        if (abstractC3680g instanceof C3674a) {
            return p((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) ((C3674a) abstractC3680g).b());
        }
        if (abstractC3680g instanceof C3675b) {
            return a((C3675b) abstractC3680g, classLoader);
        }
        if (abstractC3680g instanceof C3683j) {
            Pair pair = (Pair) ((C3683j) abstractC3680g).b();
            C3367b c3367b = (C3367b) pair.getFirst();
            id.f fVar = (id.f) pair.getSecond();
            Class o10 = o(classLoader, c3367b, 0, 4, null);
            if (o10 != null) {
                return K.a(o10, fVar.c());
            }
        } else if (abstractC3680g instanceof C3689p) {
            C3689p.b bVar = (C3689p.b) ((C3689p) abstractC3680g).b();
            if (bVar instanceof C3689p.b.C0566b) {
                C3689p.b.C0566b c0566b = (C3689p.b.C0566b) bVar;
                return m(classLoader, c0566b.b(), c0566b.a());
            }
            if (!(bVar instanceof C3689p.b.a)) {
                throw new lc.m();
            }
            InterfaceC0936h d10 = ((C3689p.b.a) bVar).a().W0().d();
            InterfaceC0933e interfaceC0933e = d10 instanceof InterfaceC0933e ? (InterfaceC0933e) d10 : null;
            if (interfaceC0933e != null) {
                return q(interfaceC0933e);
            }
        } else {
            if (!(abstractC3680g instanceof AbstractC3684k ? true : abstractC3680g instanceof C3691r)) {
                return abstractC3680g.b();
            }
        }
        return null;
    }

    private static final List s(List list) {
        List e10;
        List<Annotation> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Intrinsics.b(AbstractC5011a.b(AbstractC5011a.a((Annotation) it.next())).getSimpleName(), "Container")) {
                    list = new ArrayList();
                    for (Annotation annotation : list2) {
                        Class b10 = AbstractC5011a.b(AbstractC5011a.a(annotation));
                        if (!Intrinsics.b(b10.getSimpleName(), "Container") || b10.getAnnotation(InterfaceC5144E.class) == null) {
                            e10 = CollectionsKt.e(annotation);
                        } else {
                            Object invoke = b10.getDeclaredMethod("value", null).invoke(annotation, null);
                            Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            e10 = AbstractC3574i.d((Annotation[]) invoke);
                        }
                        CollectionsKt.z(list, e10);
                    }
                }
            }
        }
        return list;
    }
}
