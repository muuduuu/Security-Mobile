package Pc;

import id.C3367b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import vc.AbstractC5011a;
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
import xc.C5142C;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final List f7738a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f7739b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f7740c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f7741d;

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7742a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ParameterizedType invoke(ParameterizedType it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Type ownerType = it.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7743a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Sequence invoke(ParameterizedType it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Type[] actualTypeArguments = it.getActualTypeArguments();
            Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
            return AbstractC3574i.t(actualTypeArguments);
        }
    }

    static {
        int i10 = 0;
        List m10 = CollectionsKt.m(C5142C.b(Boolean.TYPE), C5142C.b(Byte.TYPE), C5142C.b(Character.TYPE), C5142C.b(Double.TYPE), C5142C.b(Float.TYPE), C5142C.b(Integer.TYPE), C5142C.b(Long.TYPE), C5142C.b(Short.TYPE));
        f7738a = m10;
        List<kotlin.reflect.d> list = m10;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        for (kotlin.reflect.d dVar : list) {
            arrayList.add(lc.t.a(AbstractC5011a.c(dVar), AbstractC5011a.d(dVar)));
        }
        f7739b = G.r(arrayList);
        List<kotlin.reflect.d> list2 = f7738a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list2, 10));
        for (kotlin.reflect.d dVar2 : list2) {
            arrayList2.add(lc.t.a(AbstractC5011a.d(dVar2), AbstractC5011a.c(dVar2)));
        }
        f7740c = G.r(arrayList2);
        List m11 = CollectionsKt.m(Function0.class, Function1.class, Function2.class, InterfaceC5068n.class, wc.o.class, wc.p.class, wc.q.class, wc.r.class, wc.s.class, wc.t.class, InterfaceC5055a.class, InterfaceC5056b.class, InterfaceC5057c.class, InterfaceC5058d.class, InterfaceC5059e.class, InterfaceC5060f.class, InterfaceC5061g.class, InterfaceC5062h.class, InterfaceC5063i.class, InterfaceC5064j.class, InterfaceC5065k.class, InterfaceC5066l.class, InterfaceC5067m.class);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.u(m11, 10));
        for (Object obj : m11) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.t();
            }
            arrayList3.add(lc.t.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f7741d = G.r(arrayList3);
    }

    public static final C3367b a(Class cls) {
        C3367b m10;
        C3367b a10;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass == null || (a10 = a(declaringClass)) == null || (m10 = a10.d(id.f.o(cls.getSimpleName()))) == null) {
                    m10 = C3367b.m(new id.c(cls.getName()));
                }
                Intrinsics.d(m10);
                return m10;
            }
        }
        id.c cVar = new id.c(cls.getName());
        return new C3367b(cVar.e(), id.c.k(cVar.g()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String b(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return StringsKt.y(name, '.', '/', false, 4, null);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name2 = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            sb2.append(StringsKt.y(name2, '.', '/', false, 4, null));
            sb2.append(';');
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final Integer c(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return (Integer) f7741d.get(cls);
    }

    public static final List d(Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return CollectionsKt.j();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return kotlin.sequences.j.C(kotlin.sequences.j.r(kotlin.sequences.j.h(type, a.f7742a), b.f7743a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC3574i.m0(actualTypeArguments);
    }

    public static final Class e(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return (Class) f7739b.get(cls);
    }

    public static final ClassLoader f(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Intrinsics.checkNotNullExpressionValue(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class g(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return (Class) f7740c.get(cls);
    }

    public static final boolean h(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
