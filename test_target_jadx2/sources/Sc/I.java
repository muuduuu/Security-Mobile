package Sc;

import bd.C1673A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import qc.AbstractC3958a;

/* loaded from: classes3.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8994a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final List f8995b;

    /* renamed from: c, reason: collision with root package name */
    private static final List f8996c;

    /* renamed from: d, reason: collision with root package name */
    private static final List f8997d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map f8998e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map f8999f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set f9000g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set f9001h;

    /* renamed from: i, reason: collision with root package name */
    private static final a.C0176a f9002i;

    /* renamed from: j, reason: collision with root package name */
    private static final Map f9003j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map f9004k;

    /* renamed from: l, reason: collision with root package name */
    private static final Set f9005l;

    /* renamed from: m, reason: collision with root package name */
    private static final List f9006m;

    /* renamed from: n, reason: collision with root package name */
    private static final Map f9007n;

    public static final class a {

        /* renamed from: Sc.I$a$a, reason: collision with other inner class name */
        public static final class C0176a {

            /* renamed from: a, reason: collision with root package name */
            private final String f9008a;

            /* renamed from: b, reason: collision with root package name */
            private final id.f f9009b;

            /* renamed from: c, reason: collision with root package name */
            private final String f9010c;

            /* renamed from: d, reason: collision with root package name */
            private final String f9011d;

            /* renamed from: e, reason: collision with root package name */
            private final String f9012e;

            public C0176a(String classInternalName, id.f name, String parameters, String returnType) {
                Intrinsics.checkNotNullParameter(classInternalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                this.f9008a = classInternalName;
                this.f9009b = name;
                this.f9010c = parameters;
                this.f9011d = returnType;
                this.f9012e = C1673A.f18936a.k(classInternalName, name + '(' + parameters + ')' + returnType);
            }

            public static /* synthetic */ C0176a b(C0176a c0176a, String str, id.f fVar, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = c0176a.f9008a;
                }
                if ((i10 & 2) != 0) {
                    fVar = c0176a.f9009b;
                }
                if ((i10 & 4) != 0) {
                    str2 = c0176a.f9010c;
                }
                if ((i10 & 8) != 0) {
                    str3 = c0176a.f9011d;
                }
                return c0176a.a(str, fVar, str2, str3);
            }

            public final C0176a a(String classInternalName, id.f name, String parameters, String returnType) {
                Intrinsics.checkNotNullParameter(classInternalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                return new C0176a(classInternalName, name, parameters, returnType);
            }

            public final id.f c() {
                return this.f9009b;
            }

            public final String d() {
                return this.f9012e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0176a)) {
                    return false;
                }
                C0176a c0176a = (C0176a) obj;
                return Intrinsics.b(this.f9008a, c0176a.f9008a) && Intrinsics.b(this.f9009b, c0176a.f9009b) && Intrinsics.b(this.f9010c, c0176a.f9010c) && Intrinsics.b(this.f9011d, c0176a.f9011d);
            }

            public int hashCode() {
                return (((((this.f9008a.hashCode() * 31) + this.f9009b.hashCode()) * 31) + this.f9010c.hashCode()) * 31) + this.f9011d.hashCode();
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f9008a + ", name=" + this.f9009b + ", parameters=" + this.f9010c + ", returnType=" + this.f9011d + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C0176a m(String str, String str2, String str3, String str4) {
            id.f o10 = id.f.o(str2);
            Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
            return new C0176a(str, o10, str3, str4);
        }

        public final id.f b(id.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return (id.f) f().get(name);
        }

        public final List c() {
            return I.f8996c;
        }

        public final Set d() {
            return I.f9000g;
        }

        public final Set e() {
            return I.f9001h;
        }

        public final Map f() {
            return I.f9007n;
        }

        public final List g() {
            return I.f9006m;
        }

        public final C0176a h() {
            return I.f9002i;
        }

        public final Map i() {
            return I.f8999f;
        }

        public final Map j() {
            return I.f9004k;
        }

        public final boolean k(id.f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            return g().contains(fVar);
        }

        public final b l(String builtinSignature) {
            Intrinsics.checkNotNullParameter(builtinSignature, "builtinSignature");
            return c().contains(builtinSignature) ? b.ONE_COLLECTION_PARAMETER : ((c) kotlin.collections.G.i(i(), builtinSignature)) == c.NULL ? b.OBJECT_PARAMETER_GENERIC : b.OBJECT_PARAMETER_NON_GENERIC;
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;
        public static final b ONE_COLLECTION_PARAMETER = new b("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);
        public static final b OBJECT_PARAMETER_NON_GENERIC = new b("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);
        public static final b OBJECT_PARAMETER_GENERIC = new b("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);

        private static final /* synthetic */ b[] $values() {
            return new b[]{ONE_COLLECTION_PARAMETER, OBJECT_PARAMETER_NON_GENERIC, OBJECT_PARAMETER_GENERIC};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private b(String str, int i10, String str2, boolean z10) {
            this.valueParametersSignature = str2;
            this.isObjectReplacedWithTypeParameter = z10;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        private final Object defaultValue;
        public static final c NULL = new c("NULL", 0, null);
        public static final c INDEX = new c("INDEX", 1, -1);
        public static final c FALSE = new c("FALSE", 2, Boolean.FALSE);
        public static final c MAP_GET_OR_DEFAULT = new a("MAP_GET_OR_DEFAULT", 3);

        static final class a extends c {
            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            a(String str, int i10) {
                super(str, i10, r0, r0);
                DefaultConstructorMarker defaultConstructorMarker = null;
            }
        }

        private static final /* synthetic */ c[] $values() {
            return new c[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        public /* synthetic */ c(String str, int i10, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, obj);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        private c(String str, int i10, Object obj) {
            this.defaultValue = obj;
        }
    }

    static {
        Set<String> h10 = O.h("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(CollectionsKt.u(h10, 10));
        for (String str : h10) {
            a aVar = f8994a;
            String desc = pd.e.BOOLEAN.getDesc();
            Intrinsics.checkNotNullExpressionValue(desc, "getDesc(...)");
            arrayList.add(aVar.m("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f8995b = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((a.C0176a) it.next()).d());
        }
        f8996c = arrayList3;
        List list = f8995b;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((a.C0176a) it2.next()).c().c());
        }
        f8997d = arrayList4;
        C1673A c1673a = C1673A.f18936a;
        a aVar2 = f8994a;
        String i10 = c1673a.i("Collection");
        pd.e eVar = pd.e.BOOLEAN;
        String desc2 = eVar.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc2, "getDesc(...)");
        a.C0176a m10 = aVar2.m(i10, "contains", "Ljava/lang/Object;", desc2);
        c cVar = c.FALSE;
        Pair a10 = lc.t.a(m10, cVar);
        String i11 = c1673a.i("Collection");
        String desc3 = eVar.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc3, "getDesc(...)");
        Pair a11 = lc.t.a(aVar2.m(i11, "remove", "Ljava/lang/Object;", desc3), cVar);
        String i12 = c1673a.i("Map");
        String desc4 = eVar.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc4, "getDesc(...)");
        Pair a12 = lc.t.a(aVar2.m(i12, "containsKey", "Ljava/lang/Object;", desc4), cVar);
        String i13 = c1673a.i("Map");
        String desc5 = eVar.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc5, "getDesc(...)");
        Pair a13 = lc.t.a(aVar2.m(i13, "containsValue", "Ljava/lang/Object;", desc5), cVar);
        String i14 = c1673a.i("Map");
        String desc6 = eVar.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc6, "getDesc(...)");
        Pair a14 = lc.t.a(aVar2.m(i14, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), cVar);
        Pair a15 = lc.t.a(aVar2.m(c1673a.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.MAP_GET_OR_DEFAULT);
        a.C0176a m11 = aVar2.m(c1673a.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.NULL;
        Pair a16 = lc.t.a(m11, cVar2);
        Pair a17 = lc.t.a(aVar2.m(c1673a.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String i15 = c1673a.i("List");
        pd.e eVar2 = pd.e.INT;
        String desc7 = eVar2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc7, "getDesc(...)");
        a.C0176a m12 = aVar2.m(i15, "indexOf", "Ljava/lang/Object;", desc7);
        c cVar3 = c.INDEX;
        Pair a18 = lc.t.a(m12, cVar3);
        String i16 = c1673a.i("List");
        String desc8 = eVar2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc8, "getDesc(...)");
        Map k10 = kotlin.collections.G.k(a10, a11, a12, a13, a14, a15, a16, a17, a18, lc.t.a(aVar2.m(i16, "lastIndexOf", "Ljava/lang/Object;", desc8), cVar3));
        f8998e = k10;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.G.d(k10.size()));
        for (Map.Entry entry : k10.entrySet()) {
            linkedHashMap.put(((a.C0176a) entry.getKey()).d(), entry.getValue());
        }
        f8999f = linkedHashMap;
        Set k11 = O.k(f8998e.keySet(), f8995b);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.u(k11, 10));
        Iterator it3 = k11.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((a.C0176a) it3.next()).c());
        }
        f9000g = CollectionsKt.S0(arrayList5);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.u(k11, 10));
        Iterator it4 = k11.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((a.C0176a) it4.next()).d());
        }
        f9001h = CollectionsKt.S0(arrayList6);
        a aVar3 = f8994a;
        pd.e eVar3 = pd.e.INT;
        String desc9 = eVar3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc9, "getDesc(...)");
        a.C0176a m13 = aVar3.m("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f9002i = m13;
        C1673A c1673a2 = C1673A.f18936a;
        String h11 = c1673a2.h("Number");
        String desc10 = pd.e.BYTE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc10, "getDesc(...)");
        Pair a19 = lc.t.a(aVar3.m(h11, "toByte", BuildConfig.FLAVOR, desc10), id.f.o("byteValue"));
        String h12 = c1673a2.h("Number");
        String desc11 = pd.e.SHORT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc11, "getDesc(...)");
        Pair a20 = lc.t.a(aVar3.m(h12, "toShort", BuildConfig.FLAVOR, desc11), id.f.o("shortValue"));
        String h13 = c1673a2.h("Number");
        String desc12 = eVar3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc12, "getDesc(...)");
        Pair a21 = lc.t.a(aVar3.m(h13, "toInt", BuildConfig.FLAVOR, desc12), id.f.o("intValue"));
        String h14 = c1673a2.h("Number");
        String desc13 = pd.e.LONG.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc13, "getDesc(...)");
        Pair a22 = lc.t.a(aVar3.m(h14, "toLong", BuildConfig.FLAVOR, desc13), id.f.o("longValue"));
        String h15 = c1673a2.h("Number");
        String desc14 = pd.e.FLOAT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc14, "getDesc(...)");
        Pair a23 = lc.t.a(aVar3.m(h15, "toFloat", BuildConfig.FLAVOR, desc14), id.f.o("floatValue"));
        String h16 = c1673a2.h("Number");
        String desc15 = pd.e.DOUBLE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc15, "getDesc(...)");
        Pair a24 = lc.t.a(aVar3.m(h16, "toDouble", BuildConfig.FLAVOR, desc15), id.f.o("doubleValue"));
        Pair a25 = lc.t.a(m13, id.f.o("remove"));
        String h17 = c1673a2.h("CharSequence");
        String desc16 = eVar3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc16, "getDesc(...)");
        String desc17 = pd.e.CHAR.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc17, "getDesc(...)");
        Map k12 = kotlin.collections.G.k(a19, a20, a21, a22, a23, a24, a25, lc.t.a(aVar3.m(h17, "get", desc16, desc17), id.f.o("charAt")));
        f9003j = k12;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.G.d(k12.size()));
        for (Map.Entry entry2 : k12.entrySet()) {
            linkedHashMap2.put(((a.C0176a) entry2.getKey()).d(), entry2.getValue());
        }
        f9004k = linkedHashMap2;
        Map map = f9003j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            linkedHashSet.add(a.C0176a.b((a.C0176a) entry3.getKey(), null, (id.f) entry3.getValue(), null, null, 13, null).d());
        }
        f9005l = linkedHashSet;
        Set keySet = f9003j.keySet();
        ArrayList arrayList7 = new ArrayList(CollectionsKt.u(keySet, 10));
        Iterator it5 = keySet.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((a.C0176a) it5.next()).c());
        }
        f9006m = arrayList7;
        Set<Map.Entry> entrySet = f9003j.entrySet();
        ArrayList<Pair> arrayList8 = new ArrayList(CollectionsKt.u(entrySet, 10));
        for (Map.Entry entry4 : entrySet) {
            arrayList8.add(new Pair(((a.C0176a) entry4.getKey()).c(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(kotlin.ranges.d.d(kotlin.collections.G.d(CollectionsKt.u(arrayList8, 10)), 16));
        for (Pair pair : arrayList8) {
            linkedHashMap3.put((id.f) pair.d(), (id.f) pair.c());
        }
        f9007n = linkedHashMap3;
    }
}
