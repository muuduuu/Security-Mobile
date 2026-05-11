package P8;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f7560a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7561b;

    /* renamed from: c, reason: collision with root package name */
    private final List f7562c;

    class a implements P8.j {
        a() {
        }

        @Override // P8.j
        public Object a() {
            return new TreeSet();
        }
    }

    class b implements P8.j {
        b() {
        }

        @Override // P8.j
        public Object a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: P8.c$c, reason: collision with other inner class name */
    class C0146c implements P8.j {
        C0146c() {
        }

        @Override // P8.j
        public Object a() {
            return new ArrayDeque();
        }
    }

    class d implements P8.j {
        d() {
        }

        @Override // P8.j
        public Object a() {
            return new ArrayList();
        }
    }

    class e implements P8.j {
        e() {
        }

        @Override // P8.j
        public Object a() {
            return new ConcurrentSkipListMap();
        }
    }

    class f implements P8.j {
        f() {
        }

        @Override // P8.j
        public Object a() {
            return new ConcurrentHashMap();
        }
    }

    class g implements P8.j {
        g() {
        }

        @Override // P8.j
        public Object a() {
            return new TreeMap();
        }
    }

    class h implements P8.j {
        h() {
        }

        @Override // P8.j
        public Object a() {
            return new LinkedHashMap();
        }
    }

    class i implements P8.j {
        i() {
        }

        @Override // P8.j
        public Object a() {
            return new P8.h();
        }
    }

    class j implements P8.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f7563a;

        j(Class cls) {
            this.f7563a = cls;
        }

        @Override // P8.j
        public Object a() {
            try {
                return P8.p.f7624a.d(this.f7563a);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to create instance of " + this.f7563a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
            }
        }
    }

    class k implements P8.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7565a;

        k(String str) {
            this.f7565a = str;
        }

        @Override // P8.j
        public Object a() {
            throw new com.google.gson.i(this.f7565a);
        }
    }

    class l implements P8.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7567a;

        l(String str) {
            this.f7567a = str;
        }

        @Override // P8.j
        public Object a() {
            throw new com.google.gson.i(this.f7567a);
        }
    }

    class m implements P8.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7569a;

        m(String str) {
            this.f7569a = str;
        }

        @Override // P8.j
        public Object a() {
            throw new com.google.gson.i(this.f7569a);
        }
    }

    class n implements P8.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f7571a;

        n(Type type) {
            this.f7571a = type;
        }

        @Override // P8.j
        public Object a() {
            Type type = this.f7571a;
            if (!(type instanceof ParameterizedType)) {
                throw new com.google.gson.i("Invalid EnumSet type: " + this.f7571a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new com.google.gson.i("Invalid EnumSet type: " + this.f7571a.toString());
        }
    }

    class o implements P8.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f7572a;

        o(Type type) {
            this.f7572a = type;
        }

        @Override // P8.j
        public Object a() {
            Type type = this.f7572a;
            if (!(type instanceof ParameterizedType)) {
                throw new com.google.gson.i("Invalid EnumMap type: " + this.f7572a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new com.google.gson.i("Invalid EnumMap type: " + this.f7572a.toString());
        }
    }

    class p implements P8.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7573a;

        p(String str) {
            this.f7573a = str;
        }

        @Override // P8.j
        public Object a() {
            throw new com.google.gson.i(this.f7573a);
        }
    }

    class q implements P8.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7574a;

        q(String str) {
            this.f7574a = str;
        }

        @Override // P8.j
        public Object a() {
            throw new com.google.gson.i(this.f7574a);
        }
    }

    class r implements P8.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f7575a;

        r(Constructor constructor) {
            this.f7575a = constructor;
        }

        @Override // P8.j
        public Object a() {
            try {
                return this.f7575a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw R8.a.e(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + R8.a.c(this.f7575a) + "' with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke constructor '" + R8.a.c(this.f7575a) + "' with no args", e12.getCause());
            }
        }
    }

    public c(Map map, boolean z10, List list) {
        this.f7560a = map;
        this.f7561b = z10;
        this.f7562c = list;
    }

    static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + P8.o.a("r8-abstract-class");
    }

    private static P8.j c(Class cls, com.google.gson.q qVar) {
        String p10;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            com.google.gson.q qVar2 = com.google.gson.q.ALLOW;
            if (qVar == qVar2 || (P8.m.a(declaredConstructor, null) && (qVar != com.google.gson.q.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (qVar != qVar2 || (p10 = R8.a.p(declaredConstructor)) == null) ? new r(declaredConstructor) : new q(p10);
            }
            return new p("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static P8.j d(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new a() : Set.class.isAssignableFrom(cls) ? new b() : Queue.class.isAssignableFrom(cls) ? new C0146c() : new d();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new e() : ConcurrentMap.class.isAssignableFrom(cls) ? new f() : SortedMap.class.isAssignableFrom(cls) ? new g() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new i() : new h();
        }
        return null;
    }

    private static P8.j e(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new n(type);
        }
        if (cls == EnumMap.class) {
            return new o(type);
        }
        return null;
    }

    private P8.j f(Class cls) {
        if (this.f7561b) {
            return new j(cls);
        }
        String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new k(str);
    }

    public P8.j b(TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        android.support.v4.media.session.b.a(this.f7560a.get(type));
        android.support.v4.media.session.b.a(this.f7560a.get(rawType));
        P8.j e10 = e(type, rawType);
        if (e10 != null) {
            return e10;
        }
        com.google.gson.q b10 = P8.m.b(this.f7562c, rawType);
        P8.j c10 = c(rawType, b10);
        if (c10 != null) {
            return c10;
        }
        P8.j d10 = d(type, rawType);
        if (d10 != null) {
            return d10;
        }
        String a10 = a(rawType);
        if (a10 != null) {
            return new l(a10);
        }
        if (b10 == com.google.gson.q.ALLOW) {
            return f(rawType);
        }
        return new m("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public String toString() {
        return this.f7560a.toString();
    }
}
