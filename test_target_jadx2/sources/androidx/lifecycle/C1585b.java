package androidx.lifecycle;

import androidx.lifecycle.AbstractC1592i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1585b {

    /* renamed from: c, reason: collision with root package name */
    static C1585b f17114c = new C1585b();

    /* renamed from: a, reason: collision with root package name */
    private final Map f17115a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f17116b = new HashMap();

    /* renamed from: androidx.lifecycle.b$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map f17117a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map f17118b;

        a(Map map) {
            this.f17118b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC1592i.a aVar = (AbstractC1592i.a) entry.getValue();
                List list = (List) this.f17117a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f17117a.put(aVar, list);
                }
                list.add((C0291b) entry.getKey());
            }
        }

        private static void b(List list, InterfaceC1599p interfaceC1599p, AbstractC1592i.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0291b) list.get(size)).a(interfaceC1599p, aVar, obj);
                }
            }
        }

        void a(InterfaceC1599p interfaceC1599p, AbstractC1592i.a aVar, Object obj) {
            b((List) this.f17117a.get(aVar), interfaceC1599p, aVar, obj);
            b((List) this.f17117a.get(AbstractC1592i.a.ON_ANY), interfaceC1599p, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    static final class C0291b {

        /* renamed from: a, reason: collision with root package name */
        final int f17119a;

        /* renamed from: b, reason: collision with root package name */
        final Method f17120b;

        C0291b(int i10, Method method) {
            this.f17119a = i10;
            this.f17120b = method;
            method.setAccessible(true);
        }

        void a(InterfaceC1599p interfaceC1599p, AbstractC1592i.a aVar, Object obj) {
            try {
                int i10 = this.f17119a;
                if (i10 == 0) {
                    this.f17120b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f17120b.invoke(obj, interfaceC1599p);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f17120b.invoke(obj, interfaceC1599p, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0291b)) {
                return false;
            }
            C0291b c0291b = (C0291b) obj;
            return this.f17119a == c0291b.f17119a && this.f17120b.getName().equals(c0291b.f17120b.getName());
        }

        public int hashCode() {
            return (this.f17119a * 31) + this.f17120b.getName().hashCode();
        }
    }

    C1585b() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i10;
        a c10;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c10 = c(superclass)) != null) {
            hashMap.putAll(c10.f17118b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f17118b.entrySet()) {
                e(hashMap, (C0291b) entry.getKey(), (AbstractC1592i.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            A a10 = (A) method.getAnnotation(A.class);
            if (a10 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC1599p.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                AbstractC1592i.a value = a10.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC1592i.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC1592i.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new C0291b(i10, method), value, cls);
                z10 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f17115a.put(cls, aVar);
        this.f17116b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map map, C0291b c0291b, AbstractC1592i.a aVar, Class cls) {
        AbstractC1592i.a aVar2 = (AbstractC1592i.a) map.get(c0291b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0291b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0291b.f17120b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class cls) {
        a aVar = (a) this.f17115a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f17116b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method method : b10) {
            if (((A) method.getAnnotation(A.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f17116b.put(cls, Boolean.FALSE);
        return false;
    }
}
