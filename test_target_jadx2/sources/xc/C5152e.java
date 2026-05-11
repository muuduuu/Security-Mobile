package xc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import vc.AbstractC5011a;
import vc.C5012b;
import wc.InterfaceC5055a;
import wc.InterfaceC5056b;
import wc.InterfaceC5057c;
import wc.InterfaceC5058d;
import wc.InterfaceC5059e;
import wc.InterfaceC5060f;
import wc.InterfaceC5061g;
import wc.InterfaceC5062h;
import wc.InterfaceC5063i;
import wc.InterfaceC5064j;
import wc.InterfaceC5065k;
import wc.InterfaceC5066l;
import wc.InterfaceC5067m;
import wc.InterfaceC5068n;

/* renamed from: xc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5152e implements kotlin.reflect.d, InterfaceC5151d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f44986b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f44987c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f44988d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap f44989e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f44990f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map f44991g;

    /* renamed from: a, reason: collision with root package name */
    private final Class f44992a;

    /* renamed from: xc.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class jClass) {
            String str;
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) C5152e.f44990f.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) C5152e.f44990f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String b(Class jClass) {
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            String str3 = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (jClass.isLocalClass()) {
                String simpleName = jClass.getSimpleName();
                Method enclosingMethod = jClass.getEnclosingMethod();
                if (enclosingMethod != null) {
                    Intrinsics.d(simpleName);
                    str = StringsKt.I0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                }
                Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    Intrinsics.d(simpleName);
                    return StringsKt.H0(simpleName, '$', null, 2, null);
                }
                Intrinsics.d(simpleName);
                return StringsKt.I0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
            }
            if (!jClass.isArray()) {
                String str4 = (String) C5152e.f44991g.get(jClass.getName());
                return str4 == null ? jClass.getSimpleName() : str4;
            }
            Class<?> componentType = jClass.getComponentType();
            str = "Array";
            if (componentType.isPrimitive() && (str2 = (String) C5152e.f44991g.get(componentType.getName())) != null) {
                str3 = str2 + "Array";
            }
            if (str3 != null) {
                return str3;
            }
            return str;
        }

        public final boolean c(Object obj, Class jClass) {
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            Map map = C5152e.f44987c;
            Intrinsics.e(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return kotlin.jvm.internal.a.m(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = AbstractC5011a.c(AbstractC5011a.e(jClass));
            }
            return jClass.isInstance(obj);
        }

        private a() {
        }
    }

    static {
        List m10 = CollectionsKt.m(Function0.class, Function1.class, Function2.class, InterfaceC5068n.class, wc.o.class, wc.p.class, wc.q.class, wc.r.class, wc.s.class, wc.t.class, InterfaceC5055a.class, InterfaceC5056b.class, InterfaceC5057c.class, InterfaceC5058d.class, InterfaceC5059e.class, InterfaceC5060f.class, InterfaceC5061g.class, InterfaceC5062h.class, InterfaceC5063i.class, InterfaceC5064j.class, InterfaceC5065k.class, InterfaceC5066l.class, InterfaceC5067m.class);
        ArrayList arrayList = new ArrayList(CollectionsKt.u(m10, 10));
        int i10 = 0;
        for (Object obj : m10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.t();
            }
            arrayList.add(lc.t.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f44987c = kotlin.collections.G.r(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f44988d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f44989e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            Intrinsics.d(str);
            sb2.append(StringsKt.L0(str, '.', null, 2, null));
            sb2.append("CompanionObject");
            Pair a10 = lc.t.a(sb2.toString(), str + ".Companion");
            hashMap3.put(a10.c(), a10.d());
        }
        for (Map.Entry entry : f44987c.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f44990f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.G.d(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), StringsKt.L0((String) entry2.getValue(), '.', null, 2, null));
        }
        f44991g = linkedHashMap;
    }

    public C5152e(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f44992a = jClass;
    }

    private final Void w() {
        throw new C5012b();
    }

    @Override // kotlin.reflect.d
    public List a() {
        w();
        throw new lc.e();
    }

    @Override // kotlin.reflect.d
    public String e() {
        return f44986b.a(m());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5152e) && Intrinsics.b(AbstractC5011a.c(this), AbstractC5011a.c((kotlin.reflect.d) obj));
    }

    public int hashCode() {
        return AbstractC5011a.c(this).hashCode();
    }

    @Override // kotlin.reflect.b
    public List i() {
        w();
        throw new lc.e();
    }

    @Override // kotlin.reflect.d
    public Collection k() {
        w();
        throw new lc.e();
    }

    @Override // xc.InterfaceC5151d
    public Class m() {
        return this.f44992a;
    }

    @Override // kotlin.reflect.d
    public String q() {
        return f44986b.b(m());
    }

    public String toString() {
        return m().toString() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.d
    public boolean y(Object obj) {
        return f44986b.c(obj, m());
    }
}
