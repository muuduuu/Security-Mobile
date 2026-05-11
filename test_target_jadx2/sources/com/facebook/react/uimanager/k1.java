package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f22444a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f22445b = new HashMap();

    class a extends ThreadLocal {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f22446a;

        a(int i10) {
            this.f22446a = i10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object[] initialValue() {
            return new Object[this.f22446a];
        }
    }

    private static class b extends m {
        public b(Z4.a aVar, Method method) {
            super(aVar, "Array", method);
        }

        @Override // com.facebook.react.uimanager.k1.m
        protected Object c(Object obj, Context context) {
            return (ReadableArray) obj;
        }
    }

    private static class c extends m {

        /* renamed from: i, reason: collision with root package name */
        private final boolean f22447i;

        public c(Z4.a aVar, Method method, boolean z10) {
            super(aVar, "boolean", method);
            this.f22447i = z10;
        }

        @Override // com.facebook.react.uimanager.k1.m
        protected Object c(Object obj, Context context) {
            return obj == null ? this.f22447i : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    private static class d extends m {
        public d(Z4.a aVar, Method method) {
            super(aVar, "boolean", method);
        }

        @Override // com.facebook.react.uimanager.k1.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    private static class e extends m {
        public e(Z4.a aVar, Method method) {
            super(aVar, "mixed", method);
        }

        @Override // com.facebook.react.uimanager.k1.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return ColorPropConverter.getColor(obj, context);
            }
            return null;
        }

        public e(Z4.b bVar, Method method, int i10) {
            super(bVar, "mixed", method, i10);
        }
    }

    private static class f extends m {
        public f(Z4.a aVar, Method method) {
            super(aVar, "number", method);
        }

        @Override // com.facebook.react.uimanager.k1.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return obj instanceof Double ? Integer.valueOf(((Double) obj).intValue()) : (Integer) obj;
            }
            return null;
        }

        public f(Z4.b bVar, Method method, int i10) {
            super(bVar, "number", method, i10);
        }
    }

    private static class i extends m {
        public i(Z4.a aVar, Method method) {
            super(aVar, "mixed", method);
        }

        @Override // com.facebook.react.uimanager.k1.m
        protected Object c(Object obj, Context context) {
            return obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
        }

        public i(Z4.b bVar, Method method, int i10) {
            super(bVar, "mixed", method, i10);
        }
    }

    private static class l extends m {
        public l(Z4.a aVar, Method method) {
            super(aVar, "Map", method);
        }

        @Override // com.facebook.react.uimanager.k1.m
        protected Object c(Object obj, Context context) {
            return (ReadableMap) obj;
        }
    }

    private static class n extends m {
        public n(Z4.a aVar, Method method) {
            super(aVar, "String", method);
        }

        @Override // com.facebook.react.uimanager.k1.m
        protected Object c(Object obj, Context context) {
            return (String) obj;
        }
    }

    public static void b() {
        f22444a.clear();
        f22445b.clear();
    }

    private static m c(Z4.a aVar, Method method, Class cls) {
        if (cls == Dynamic.class) {
            return new i(aVar, method);
        }
        if (cls == Boolean.TYPE) {
            return new c(aVar, method, aVar.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return "Color".equals(aVar.customType()) ? new g(aVar, method, aVar.defaultInt()) : new k(aVar, method, aVar.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new j(aVar, method, aVar.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new h(aVar, method, aVar.defaultDouble());
        }
        if (cls == String.class) {
            return new n(aVar, method);
        }
        if (cls == Boolean.class) {
            return new d(aVar, method);
        }
        if (cls == Integer.class) {
            return "Color".equals(aVar.customType()) ? new e(aVar, method) : new f(aVar, method);
        }
        if (cls == ReadableArray.class) {
            return new b(aVar, method);
        }
        if (cls == ReadableMap.class) {
            return new l(aVar, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    private static void d(Z4.b bVar, Method method, Class cls, Map map) {
        String[] names = bVar.names();
        int i10 = 0;
        if (cls == Dynamic.class) {
            while (i10 < names.length) {
                map.put(names[i10], new i(bVar, method, i10));
                i10++;
            }
            return;
        }
        if (cls == Integer.TYPE) {
            while (i10 < names.length) {
                if ("Color".equals(bVar.customType())) {
                    map.put(names[i10], new g(bVar, method, i10, bVar.defaultInt()));
                } else {
                    map.put(names[i10], new k(bVar, method, i10, bVar.defaultInt()));
                }
                i10++;
            }
            return;
        }
        if (cls == Float.TYPE) {
            while (i10 < names.length) {
                map.put(names[i10], new j(bVar, method, i10, bVar.defaultFloat()));
                i10++;
            }
            return;
        }
        if (cls == Double.TYPE) {
            while (i10 < names.length) {
                map.put(names[i10], new h(bVar, method, i10, bVar.defaultDouble()));
                i10++;
            }
            return;
        }
        if (cls == Integer.class) {
            while (i10 < names.length) {
                if ("Color".equals(bVar.customType())) {
                    map.put(names[i10], new e(bVar, method, i10));
                } else {
                    map.put(names[i10], new f(bVar, method, i10));
                }
                i10++;
            }
            return;
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ThreadLocal e(int i10) {
        if (i10 <= 0) {
            return null;
        }
        return new a(i10);
    }

    private static void f(Class cls, Map map) {
        for (Method method : cls.getDeclaredMethods()) {
            Z4.a aVar = (Z4.a) method.getAnnotation(Z4.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                map.put(aVar.name(), c(aVar, method, parameterTypes[0]));
            }
            Z4.b bVar = (Z4.b) method.getAnnotation(Z4.b.class);
            if (bVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[0] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                d(bVar, method, parameterTypes2[1], map);
            }
        }
    }

    private static void g(Class cls, Map map) {
        for (Method method : cls.getDeclaredMethods()) {
            Z4.a aVar = (Z4.a) method.getAnnotation(Z4.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                map.put(aVar.name(), c(aVar, method, parameterTypes[1]));
            }
            Z4.b bVar = (Z4.b) method.getAnnotation(Z4.b.class);
            if (bVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[1] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                d(bVar, method, parameterTypes2[2], map);
            }
        }
    }

    static Map h(Class cls) {
        if (cls == null) {
            return f22445b;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == InterfaceC1969t0.class) {
                return f22445b;
            }
        }
        Map map = f22444a;
        Map map2 = (Map) map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap hashMap = new HashMap(h(cls.getSuperclass()));
        f(cls, hashMap);
        map.put(cls, hashMap);
        return hashMap;
    }

    static Map i(Class cls) {
        if (cls == ViewManager.class) {
            return f22445b;
        }
        Map map = f22444a;
        Map map2 = (Map) map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap hashMap = new HashMap(i(cls.getSuperclass()));
        g(cls, hashMap);
        map.put(cls, hashMap);
        return hashMap;
    }

    private static class g extends m {

        /* renamed from: i, reason: collision with root package name */
        private final int f22448i;

        public g(Z4.a aVar, Method method, int i10) {
            super(aVar, "mixed", method);
            this.f22448i = i10;
        }

        @Override // com.facebook.react.uimanager.k1.m
        protected Object c(Object obj, Context context) {
            return obj == null ? Integer.valueOf(this.f22448i) : ColorPropConverter.getColor(obj, context);
        }

        public g(Z4.b bVar, Method method, int i10, int i11) {
            super(bVar, "mixed", method, i10);
            this.f22448i = i11;
        }
    }

    private static class h extends m {

        /* renamed from: i, reason: collision with root package name */
        private final double f22449i;

        public h(Z4.a aVar, Method method, double d10) {
            super(aVar, "number", method);
            this.f22449i = d10;
        }

        @Override // com.facebook.react.uimanager.k1.m
        protected Object c(Object obj, Context context) {
            return Double.valueOf(obj == null ? this.f22449i : ((Double) obj).doubleValue());
        }

        public h(Z4.b bVar, Method method, int i10, double d10) {
            super(bVar, "number", method, i10);
            this.f22449i = d10;
        }
    }

    private static class j extends m {

        /* renamed from: i, reason: collision with root package name */
        private final float f22450i;

        public j(Z4.a aVar, Method method, float f10) {
            super(aVar, "number", method);
            this.f22450i = f10;
        }

        @Override // com.facebook.react.uimanager.k1.m
        protected Object c(Object obj, Context context) {
            return Float.valueOf(obj == null ? this.f22450i : ((Double) obj).floatValue());
        }

        public j(Z4.b bVar, Method method, int i10, float f10) {
            super(bVar, "number", method, i10);
            this.f22450i = f10;
        }
    }

    private static class k extends m {

        /* renamed from: i, reason: collision with root package name */
        private final int f22451i;

        public k(Z4.a aVar, Method method, int i10) {
            super(aVar, "number", method);
            this.f22451i = i10;
        }

        @Override // com.facebook.react.uimanager.k1.m
        protected Object c(Object obj, Context context) {
            return Integer.valueOf(obj == null ? this.f22451i : ((Double) obj).intValue());
        }

        public k(Z4.b bVar, Method method, int i10, int i11) {
            super(bVar, "number", method, i10);
            this.f22451i = i11;
        }
    }

    static abstract class m {

        /* renamed from: e, reason: collision with root package name */
        private static final ThreadLocal f22452e = k1.e(2);

        /* renamed from: f, reason: collision with root package name */
        private static final ThreadLocal f22453f = k1.e(3);

        /* renamed from: g, reason: collision with root package name */
        private static final ThreadLocal f22454g = k1.e(1);

        /* renamed from: h, reason: collision with root package name */
        private static final ThreadLocal f22455h = k1.e(2);

        /* renamed from: a, reason: collision with root package name */
        protected final String f22456a;

        /* renamed from: b, reason: collision with root package name */
        protected final String f22457b;

        /* renamed from: c, reason: collision with root package name */
        protected final Method f22458c;

        /* renamed from: d, reason: collision with root package name */
        protected final Integer f22459d;

        public String a() {
            return this.f22456a;
        }

        public String b() {
            return this.f22457b;
        }

        protected abstract Object c(Object obj, Context context);

        public void d(InterfaceC1969t0 interfaceC1969t0, Object obj) {
            Object[] objArr;
            try {
                if (this.f22459d == null) {
                    objArr = (Object[]) f22454g.get();
                    objArr[0] = c(obj, interfaceC1969t0.H());
                } else {
                    objArr = (Object[]) f22455h.get();
                    objArr[0] = this.f22459d;
                    objArr[1] = c(obj, interfaceC1969t0.H());
                }
                this.f22458c.invoke(interfaceC1969t0, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                AbstractC1721a.j(ViewManager.class, "Error while updating prop " + this.f22456a, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f22456a + "' in shadow node of type: " + interfaceC1969t0.O(), th);
            }
        }

        public void e(ViewManager viewManager, View view, Object obj) {
            Object[] objArr;
            try {
                if (this.f22459d == null) {
                    objArr = (Object[]) f22452e.get();
                    objArr[0] = view;
                    objArr[1] = c(obj, view.getContext());
                } else {
                    objArr = (Object[]) f22453f.get();
                    objArr[0] = view;
                    objArr[1] = this.f22459d;
                    objArr[2] = c(obj, view.getContext());
                }
                this.f22458c.invoke(viewManager, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                AbstractC1721a.j(ViewManager.class, "Error while updating prop " + this.f22456a, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f22456a + "' of a view managed by: " + viewManager.getName(), th);
            }
        }

        private m(Z4.a aVar, String str, Method method) {
            this.f22456a = aVar.name();
            this.f22457b = "__default_type__".equals(aVar.customType()) ? str : aVar.customType();
            this.f22458c = method;
            this.f22459d = null;
        }

        private m(Z4.b bVar, String str, Method method, int i10) {
            this.f22456a = bVar.names()[i10];
            this.f22457b = "__default_type__".equals(bVar.customType()) ? str : bVar.customType();
            this.f22458c = method;
            this.f22459d = Integer.valueOf(i10);
        }
    }
}
