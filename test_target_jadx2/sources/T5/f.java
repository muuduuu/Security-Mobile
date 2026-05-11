package T5;

import D5.w;
import com.fasterxml.jackson.core.f;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f9278a = Object.class;

    /* renamed from: b, reason: collision with root package name */
    private static final Annotation[] f9279b = new Annotation[0];

    /* renamed from: c, reason: collision with root package name */
    private static final a[] f9280c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    private static final Iterator f9281d = Collections.emptyIterator();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Constructor f9282a;

        /* renamed from: b, reason: collision with root package name */
        private transient Annotation[] f9283b;

        /* renamed from: c, reason: collision with root package name */
        private transient Annotation[][] f9284c;

        /* renamed from: d, reason: collision with root package name */
        private int f9285d = -1;

        public a(Constructor constructor) {
            this.f9282a = constructor;
        }

        public Constructor a() {
            return this.f9282a;
        }

        public Annotation[] b() {
            Annotation[] annotationArr = this.f9283b;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[] declaredAnnotations = this.f9282a.getDeclaredAnnotations();
            this.f9283b = declaredAnnotations;
            return declaredAnnotations;
        }

        public Class c() {
            return this.f9282a.getDeclaringClass();
        }

        public int d() {
            int i10 = this.f9285d;
            if (i10 >= 0) {
                return i10;
            }
            int length = this.f9282a.getParameterTypes().length;
            this.f9285d = length;
            return length;
        }

        public Annotation[][] e() {
            Annotation[][] annotationArr = this.f9284c;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[][] parameterAnnotations = this.f9282a.getParameterAnnotations();
            this.f9284c = parameterAnnotations;
            return parameterAnnotations;
        }
    }

    private static class b {

        /* renamed from: e, reason: collision with root package name */
        static final b f9286e = new b();

        /* renamed from: a, reason: collision with root package name */
        private final Field f9287a;

        /* renamed from: b, reason: collision with root package name */
        private final Field f9288b;

        /* renamed from: c, reason: collision with root package name */
        private final String f9289c;

        /* renamed from: d, reason: collision with root package name */
        private final String f9290d;

        private b() {
            String obj;
            Field field;
            String obj2;
            Field field2 = null;
            try {
                field = d(EnumSet.class, "elementType", Class.class);
                obj = null;
            } catch (Exception e10) {
                obj = e10.toString();
                field = null;
            }
            this.f9287a = field;
            this.f9289c = obj;
            try {
                field2 = d(EnumMap.class, "keyType", Class.class);
                obj2 = null;
            } catch (Exception e11) {
                obj2 = e11.toString();
            }
            this.f9288b = field2;
            this.f9290d = obj2;
        }

        private Object c(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        private static Field d(Class cls, String str, Class cls2) {
            String typeName;
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    field.setAccessible(true);
                    return field;
                }
            }
            typeName = cls.getTypeName();
            throw new IllegalStateException(String.format("No field named '%s' in class '%s'", str, typeName));
        }

        public Class a(EnumMap enumMap) {
            Field field = this.f9288b;
            if (field != null) {
                return (Class) c(enumMap, field);
            }
            throw new IllegalStateException("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: " + this.f9290d);
        }

        public Class b(EnumSet enumSet) {
            Field field = this.f9287a;
            if (field != null) {
                return (Class) c(enumSet, field);
            }
            throw new IllegalStateException("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: " + this.f9289c);
        }
    }

    public static Class A(Class cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (E(cls)) {
                    return null;
                }
                return x(cls);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public static Throwable B(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static String C(D5.j jVar) {
        if (jVar == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append('`');
        sb2.append(jVar.d());
        sb2.append('`');
        return sb2.toString();
    }

    public static boolean D(Object obj, Class cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean E(Class cls) {
        return (L(cls) || cls.getEnclosingMethod() == null) ? false : true;
    }

    public static boolean F(Class cls) {
        return cls == Void.class || cls == Void.TYPE || cls == E5.h.class;
    }

    public static boolean G(Class cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    public static boolean H(Class cls) {
        String name = cls.getName();
        return name.startsWith("java.") || name.startsWith("javax.");
    }

    public static boolean I(Class cls) {
        return cls.getAnnotation(E5.a.class) != null;
    }

    public static boolean J(Object obj) {
        return obj == null || I(obj.getClass());
    }

    public static boolean K(Class cls) {
        return (Modifier.isStatic(cls.getModifiers()) || x(cls) == null) ? false : true;
    }

    public static boolean L(Class cls) {
        return cls == f9278a || cls.isPrimitive();
    }

    public static boolean M(Class cls) {
        String name = cls.getName();
        return name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.");
    }

    public static boolean N(Class cls) {
        Class superclass = cls.getSuperclass();
        return superclass != null && "com.android.tools.r8.RecordTag".equals(superclass.getName());
    }

    public static String O(w wVar) {
        return wVar == null ? "[null]" : d(wVar.c());
    }

    public static String P(String str) {
        return str == null ? "[null]" : d(str);
    }

    public static String Q(Class cls) {
        if (cls == null) {
            return "[null]";
        }
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i10 > 0) {
            StringBuilder sb2 = new StringBuilder(simpleName);
            do {
                sb2.append("[]");
                i10--;
            } while (i10 > 0);
            simpleName = sb2.toString();
        }
        return e(simpleName);
    }

    public static String R(String str) {
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public static Class S(Class cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static void T(Throwable th, String str) {
        W(th);
        U(th);
        throw new IllegalArgumentException(str, th);
    }

    public static Throwable U(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th;
    }

    public static Throwable V(Throwable th) {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        return th;
    }

    public static Throwable W(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        return th;
    }

    public static void X(Throwable th, String str) {
        T(B(th), str);
    }

    public static void Y(Class cls, Object obj, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", obj.getClass().getName(), cls.getName(), str));
        }
    }

    public static Class Z(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    private static void a(Class cls, Class cls2, Collection collection, boolean z10) {
        if (cls == cls2 || cls == null || cls == Object.class) {
            return;
        }
        if (z10) {
            if (collection.contains(cls)) {
                return;
            } else {
                collection.add(cls);
            }
        }
        for (Class cls3 : c(cls)) {
            a(cls3, cls2, collection, true);
        }
        a(cls.getSuperclass(), cls2, collection, true);
    }

    private static Method[] b(Class cls, Throwable th) {
        throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", cls.getName(), th.getClass().getName(), th.getMessage()), th);
    }

    private static Class[] c(Class cls) {
        return cls.getInterfaces();
    }

    public static String d(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('\'');
        sb2.append(str);
        sb2.append('\'');
        return sb2.toString();
    }

    public static String e(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('`');
        sb2.append(str);
        sb2.append('`');
        return sb2.toString();
    }

    public static String f(Class cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(Member member, boolean z10) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers()) && (!z10 || H(declaringClass))) {
                return;
            }
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            if (accessibleObject.isAccessible()) {
                return;
            }
            throw new IllegalArgumentException("Cannot access " + member + " (from class " + member.getDeclaringClass().getName() + "; failed to set access: " + e10.getMessage());
        } catch (RuntimeException e11) {
            if (!"InaccessibleObjectException".equals(e11.getClass().getSimpleName())) {
                throw e11;
            }
            throw new IllegalArgumentException(String.format("Failed to call `setAccess()` on %s '%s' due to `%s`, problem: %s", member.getClass().getSimpleName(), member.getName(), e11.getClass().getName(), e11.getMessage()), e11);
        }
    }

    public static String h(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return Q(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static void i(com.fasterxml.jackson.core.f fVar, Closeable closeable, Exception exc) {
        if (fVar != null) {
            fVar.i(f.b.AUTO_CLOSE_JSON_CONTENT);
            try {
                fVar.close();
            } catch (Exception e10) {
                exc.addSuppressed(e10);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e11) {
                exc.addSuppressed(e11);
            }
        }
        V(exc);
        W(exc);
        throw new RuntimeException(exc);
    }

    public static void j(com.fasterxml.jackson.core.f fVar, Exception exc) {
        fVar.i(f.b.AUTO_CLOSE_JSON_CONTENT);
        try {
            fVar.close();
        } catch (Exception e10) {
            exc.addSuppressed(e10);
        }
        V(exc);
        W(exc);
        throw new RuntimeException(exc);
    }

    public static Object k(Class cls, boolean z10) {
        Constructor o10 = o(cls, z10);
        if (o10 == null) {
            throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
        }
        try {
            return o10.newInstance(null);
        } catch (Exception e10) {
            X(e10, "Failed to instantiate class " + cls.getName() + ", problem: " + e10.getMessage());
            return null;
        }
    }

    public static Object l(Class cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static String m(Throwable th) {
        return th instanceof com.fasterxml.jackson.core.c ? ((com.fasterxml.jackson.core.c) th).b() : (!(th instanceof InvocationTargetException) || th.getCause() == null) ? th.getMessage() : th.getCause().getMessage();
    }

    public static Annotation[] n(Class cls) {
        return L(cls) ? f9279b : cls.getDeclaredAnnotations();
    }

    public static Constructor o(Class cls, boolean z10) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (z10) {
                g(declaredConstructor, z10);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e10) {
            X(e10, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e10.getMessage());
            return null;
        }
    }

    public static Class p(Class cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static Class q(Enum r02) {
        return r02.getDeclaringClass();
    }

    public static Class r(EnumMap enumMap) {
        return !enumMap.isEmpty() ? q((Enum) enumMap.keySet().iterator().next()) : b.f9286e.a(enumMap);
    }

    public static Class s(EnumSet enumSet) {
        return !enumSet.isEmpty() ? q((Enum) enumSet.iterator().next()) : b.f9286e.b(enumSet);
    }

    public static List t(Class cls, Class cls2, boolean z10) {
        if (cls == null || cls == cls2 || cls == Object.class) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(8);
        a(cls, cls2, arrayList, z10);
        return arrayList;
    }

    public static List u(Class cls, Class cls2, boolean z10) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z10) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    public static Method[] v(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                return b(cls, e10);
            }
            try {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (Throwable th) {
                    return b(cls, th);
                }
            } catch (ClassNotFoundException e11) {
                e10.addSuppressed(e11);
                return b(cls, e10);
            }
        } catch (Throwable th2) {
            return b(cls, th2);
        }
    }

    public static a[] w(Class cls) {
        if (cls.isInterface() || L(cls)) {
            return f9280c;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10] = new a(declaredConstructors[i10]);
        }
        return aVarArr;
    }

    public static Class x(Class cls) {
        if (L(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static Type[] y(Class cls) {
        return cls.getGenericInterfaces();
    }

    public static Type z(Class cls) {
        return cls.getGenericSuperclass();
    }
}
