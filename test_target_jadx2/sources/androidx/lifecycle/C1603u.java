package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

/* renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1603u {

    /* renamed from: a, reason: collision with root package name */
    public static final C1603u f17151a = new C1603u();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f17152b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Map f17153c = new HashMap();

    private C1603u() {
    }

    private final InterfaceC1589f a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            constructo…tance(`object`)\n        }");
            android.support.v4.media.session.b.a(newInstance);
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor b(Class cls) {
        try {
            Package r02 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r02 != null ? r02.getName() : BuildConfig.FLAVOR;
            Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                Intrinsics.checkNotNullExpressionValue(name, "name");
                name = name.substring(fullPackage.length() + 1);
                Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
            }
            Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c10 = c(name);
            if (fullPackage.length() != 0) {
                c10 = fullPackage + '.' + c10;
            }
            Class<?> cls2 = Class.forName(c10);
            Intrinsics.e(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt.z(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) {
        Map map = f17152b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g10 = g(cls);
        map.put(cls, Integer.valueOf(g10));
        return g10;
    }

    private final boolean e(Class cls) {
        return cls != null && InterfaceC1598o.class.isAssignableFrom(cls);
    }

    public static final InterfaceC1596m f(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z10 = object instanceof InterfaceC1596m;
        boolean z11 = object instanceof DefaultLifecycleObserver;
        if (z10 && z11) {
            return new C1587d((DefaultLifecycleObserver) object, (InterfaceC1596m) object);
        }
        if (z11) {
            return new C1587d((DefaultLifecycleObserver) object, null);
        }
        if (z10) {
            return (InterfaceC1596m) object;
        }
        Class<?> cls = object.getClass();
        C1603u c1603u = f17151a;
        if (c1603u.d(cls) != 2) {
            return new C(object);
        }
        Object obj = f17153c.get(cls);
        Intrinsics.d(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            c1603u.a((Constructor) list.get(0), object);
            return new P(null);
        }
        int size = list.size();
        InterfaceC1589f[] interfaceC1589fArr = new InterfaceC1589f[size];
        for (int i10 = 0; i10 < size; i10++) {
            f17151a.a((Constructor) list.get(i10), object);
            interfaceC1589fArr[i10] = null;
        }
        return new C1586c(interfaceC1589fArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b10 = b(cls);
        if (b10 != null) {
            f17153c.put(cls, CollectionsKt.e(b10));
            return 2;
        }
        if (C1585b.f17114c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f17153c.get(superclass);
            Intrinsics.d(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f17153c.get(intrface);
                Intrinsics.d(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f17153c.put(cls, arrayList);
        return 2;
    }
}
