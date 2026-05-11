package Ec;

import Ec.F;
import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0937i;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.U;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import qc.AbstractC3958a;
import rd.k;
import xc.C5142C;
import xc.InterfaceC5151d;

/* loaded from: classes3.dex */
public abstract class n implements InterfaceC5151d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2062a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Class f2063b = DefaultConstructorMarker.class;

    /* renamed from: c, reason: collision with root package name */
    private static final Regex f2064c = new Regex("<v#(\\d+)>");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Regex a() {
            return n.f2064c;
        }

        private a() {
        }
    }

    public abstract class b {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.k[] f2065c = {C5142C.k(new xc.u(C5142C.b(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a, reason: collision with root package name */
        private final F.a f2066a;

        static final class a extends xc.m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f2068a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar) {
                super(0);
                this.f2068a = nVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Oc.k invoke() {
                return E.a(this.f2068a.m());
            }
        }

        public b() {
            this.f2066a = F.c(new a(n.this));
        }

        public final Oc.k a() {
            Object b10 = this.f2066a.b(this, f2065c[0]);
            Intrinsics.checkNotNullExpressionValue(b10, "getValue(...)");
            return (Oc.k) b10;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    protected static final class c {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c DECLARED = new c("DECLARED", 0);
        public static final c INHERITED = new c("INHERITED", 1);

        private static final /* synthetic */ c[] $values() {
            return new c[]{DECLARED, INHERITED};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private c(String str, int i10) {
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final boolean accept(InterfaceC0930b member) {
            Intrinsics.checkNotNullParameter(member, "member");
            return member.o().isReal() == (this == DECLARED);
        }
    }

    static final class d extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f2069a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC0952y descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return kotlin.reflect.jvm.internal.impl.renderer.c.f36587j.q(descriptor) + " | " + I.f1950a.g(descriptor).a();
        }
    }

    static final class e extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f2070a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(U descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return kotlin.reflect.jvm.internal.impl.renderer.c.f36587j.q(descriptor) + " | " + I.f1950a.f(descriptor).a();
        }
    }

    static final class f extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f2071a = new f();

        f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(AbstractC0948u abstractC0948u, AbstractC0948u abstractC0948u2) {
            Integer d10 = AbstractC0947t.d(abstractC0948u, abstractC0948u2);
            return Integer.valueOf(d10 == null ? 0 : d10.intValue());
        }
    }

    public static final class g extends C0826e {
        g(n nVar) {
            super(nVar);
        }

        @Override // Mc.AbstractC0986l, Kc.InterfaceC0943o
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public AbstractC0831j m(InterfaceC0940l descriptor, Unit data) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final List O(String str) {
        int W10;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (str.charAt(i10) != ')') {
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char charAt = str.charAt(i11);
            if (StringsKt.J("VZCBSIFJD", charAt, false, 2, null)) {
                W10 = i11 + 1;
            } else {
                if (charAt != 'L') {
                    throw new D("Unknown type prefix in the method signature: " + str);
                }
                W10 = StringsKt.W(str, ';', i10, false, 4, null) + 1;
            }
            arrayList.add(R(str, i10, W10));
            i10 = W10;
        }
        return arrayList;
    }

    private final Class P(String str) {
        return R(str, StringsKt.W(str, ')', 0, false, 6, null) + 1, str.length());
    }

    private final Method Q(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        Method Q10;
        if (z10) {
            clsArr[0] = cls;
        }
        Method T10 = T(cls, str, clsArr, cls2);
        if (T10 != null) {
            return T10;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (Q10 = Q(superclass, str, clsArr, cls2, z10)) != null) {
            return Q10;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        for (Class<?> cls3 : interfaces) {
            Intrinsics.d(cls3);
            Method Q11 = Q(cls3, str, clsArr, cls2, z10);
            if (Q11 != null) {
                return Q11;
            }
            if (z10) {
                Class a10 = Oc.e.a(Pc.d.f(cls3), cls3.getName() + "$DefaultImpls");
                if (a10 != null) {
                    clsArr[0] = cls3;
                    Method T11 = T(a10, str, clsArr, cls2);
                    if (T11 != null) {
                        return T11;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final Class R(String str, int i10, int i11) {
        char charAt = str.charAt(i10);
        if (charAt == 'L') {
            ClassLoader f10 = Pc.d.f(m());
            String substring = str.substring(i10 + 1, i11 - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Class<?> loadClass = f10.loadClass(StringsKt.y(substring, '/', '.', false, 4, null));
            Intrinsics.checkNotNullExpressionValue(loadClass, "loadClass(...)");
            return loadClass;
        }
        if (charAt == '[') {
            return L.f(R(str, i10 + 1, i11));
        }
        if (charAt == 'V') {
            Class TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            return TYPE;
        }
        if (charAt == 'Z') {
            return Boolean.TYPE;
        }
        if (charAt == 'C') {
            return Character.TYPE;
        }
        if (charAt == 'B') {
            return Byte.TYPE;
        }
        if (charAt == 'S') {
            return Short.TYPE;
        }
        if (charAt == 'I') {
            return Integer.TYPE;
        }
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'J') {
            return Long.TYPE;
        }
        if (charAt == 'D') {
            return Double.TYPE;
        }
        throw new D("Unknown type prefix in the method signature: " + str);
    }

    private final Constructor S(Class cls, List list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method T(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.b(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (Intrinsics.b(method.getName(), str) && Intrinsics.b(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final void w(List list, String str, boolean z10) {
        List O10 = O(str);
        list.addAll(O10);
        int size = (O10.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class TYPE = Integer.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            list.add(TYPE);
        }
        if (!z10) {
            list.add(Object.class);
            return;
        }
        Class DEFAULT_CONSTRUCTOR_MARKER = f2063b;
        list.remove(DEFAULT_CONSTRUCTOR_MARKER);
        Intrinsics.checkNotNullExpressionValue(DEFAULT_CONSTRUCTOR_MARKER, "DEFAULT_CONSTRUCTOR_MARKER");
        list.add(DEFAULT_CONSTRUCTOR_MARKER);
    }

    public final Constructor C(String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Class m10 = m();
        ArrayList arrayList = new ArrayList();
        w(arrayList, desc, true);
        Unit unit = Unit.f36324a;
        return S(m10, arrayList);
    }

    public final Method D(String name, String desc, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.b(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(m());
        }
        w(arrayList, desc, false);
        return Q(M(), name + "$default", (Class[]) arrayList.toArray(new Class[0]), P(desc), z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0952y E(String name, String signature) {
        List J10;
        ArrayList arrayList;
        String a10;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        if (Intrinsics.b(name, "<init>")) {
            J10 = CollectionsKt.O0(I());
            arrayList = new ArrayList();
            for (Object obj : J10) {
                InterfaceC0940l interfaceC0940l = (InterfaceC0940l) obj;
                if (interfaceC0940l.H()) {
                    InterfaceC0937i b10 = interfaceC0940l.b();
                    Intrinsics.checkNotNullExpressionValue(b10, "getContainingDeclaration(...)");
                    if (kd.h.d(b10)) {
                        String a11 = I.f1950a.g(interfaceC0940l).a();
                        if (!StringsKt.F(a11, "constructor-impl", false, 2, null) || !StringsKt.q(a11, ")V", false, 2, null)) {
                            throw new IllegalArgumentException(("Invalid signature of " + interfaceC0940l + ": " + a11).toString());
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(StringsKt.p0(a11, "V"));
                        InterfaceC0937i b11 = interfaceC0940l.b();
                        Intrinsics.checkNotNullExpressionValue(b11, "getContainingDeclaration(...)");
                        sb2.append(Fc.k.t(b11));
                        a10 = sb2.toString();
                        if (!Intrinsics.b(a10, signature)) {
                            arrayList.add(obj);
                        }
                    }
                }
                a10 = I.f1950a.g(interfaceC0940l).a();
                if (!Intrinsics.b(a10, signature)) {
                }
            }
        } else {
            id.f o10 = id.f.o(name);
            Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
            J10 = J(o10);
            arrayList = new ArrayList();
            for (Object obj2 : J10) {
                if (Intrinsics.b(I.f1950a.g((InterfaceC0952y) obj2).a(), signature)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList.size() == 1) {
            return (InterfaceC0952y) CollectionsKt.A0(arrayList);
        }
        String l02 = CollectionsKt.l0(J10, "\n", null, null, 0, null, d.f2069a, 30, null);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Function '");
        sb3.append(name);
        sb3.append("' (JVM signature: ");
        sb3.append(signature);
        sb3.append(") not resolved in ");
        sb3.append(this);
        sb3.append(':');
        sb3.append(l02.length() == 0 ? " no members found" : '\n' + l02);
        throw new D(sb3.toString());
    }

    public final Method F(String name, String desc) {
        Method Q10;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.b(name, "<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) O(desc).toArray(new Class[0]);
        Class P10 = P(desc);
        Method Q11 = Q(M(), name, clsArr, P10, false);
        if (Q11 != null) {
            return Q11;
        }
        if (!M().isInterface() || (Q10 = Q(Object.class, name, clsArr, P10, false)) == null) {
            return null;
        }
        return Q10;
    }

    public final U G(String name, String signature) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        MatchResult c10 = f2064c.c(signature);
        if (c10 != null) {
            String str = (String) c10.a().a().b().get(1);
            U K10 = K(Integer.parseInt(str));
            if (K10 != null) {
                return K10;
            }
            throw new D("Local property #" + str + " not found in " + m());
        }
        id.f o10 = id.f.o(name);
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        Collection N10 = N(o10);
        ArrayList arrayList = new ArrayList();
        for (Object obj : N10) {
            if (Intrinsics.b(I.f1950a.f((U) obj).a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new D("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (U) CollectionsKt.A0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            AbstractC0948u h10 = ((U) obj2).h();
            Object obj3 = linkedHashMap.get(h10);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(h10, obj3);
            }
            ((List) obj3).add(obj2);
        }
        Collection values = kotlin.collections.G.g(linkedHashMap, new C0834m(f.f2071a)).values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        List list = (List) CollectionsKt.m0(values);
        if (list.size() == 1) {
            Intrinsics.d(list);
            return (U) CollectionsKt.d0(list);
        }
        id.f o11 = id.f.o(name);
        Intrinsics.checkNotNullExpressionValue(o11, "identifier(...)");
        String l02 = CollectionsKt.l0(N(o11), "\n", null, null, 0, null, e.f2070a, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Property '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(l02.length() == 0 ? " no members found" : '\n' + l02);
        throw new D(sb2.toString());
    }

    public abstract Collection I();

    public abstract Collection J(id.f fVar);

    public abstract U K(int i10);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Collection L(rd.h scope, c belonginess) {
        AbstractC0831j abstractC0831j;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(belonginess, "belonginess");
        g gVar = new g(this);
        Collection<InterfaceC0941m> a10 = k.a.a(scope, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0941m interfaceC0941m : a10) {
            if (interfaceC0941m instanceof InterfaceC0930b) {
                InterfaceC0930b interfaceC0930b = (InterfaceC0930b) interfaceC0941m;
                if (!Intrinsics.b(interfaceC0930b.h(), AbstractC0947t.f5592h) && belonginess.accept(interfaceC0930b)) {
                    abstractC0831j = (AbstractC0831j) interfaceC0941m.f0(gVar, Unit.f36324a);
                    if (abstractC0831j == null) {
                        arrayList.add(abstractC0831j);
                    }
                }
            }
            abstractC0831j = null;
            if (abstractC0831j == null) {
            }
        }
        return CollectionsKt.O0(arrayList);
    }

    protected Class M() {
        Class g10 = Pc.d.g(m());
        return g10 == null ? m() : g10;
    }

    public abstract Collection N(id.f fVar);

    public final Constructor x(String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        return S(m(), O(desc));
    }
}
