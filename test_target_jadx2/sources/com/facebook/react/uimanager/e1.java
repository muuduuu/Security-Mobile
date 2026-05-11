package com.facebook.react.uimanager;

import android.view.View;
import c3.AbstractC1721a;
import com.facebook.react.uimanager.k1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f22335a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f22336b = new HashMap();

    private static class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final Map f22337a;

        @Override // com.facebook.react.uimanager.e1.c
        public void a(Map map) {
            for (k1.m mVar : this.f22337a.values()) {
                map.put(mVar.a(), mVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.e1.d
        public void c(InterfaceC1969t0 interfaceC1969t0, String str, Object obj) {
            k1.m mVar = (k1.m) this.f22337a.get(str);
            if (mVar != null) {
                mVar.d(interfaceC1969t0, obj);
            }
        }

        private a(Class cls) {
            this.f22337a = k1.h(cls);
        }
    }

    private static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        private final Map f22338a;

        @Override // com.facebook.react.uimanager.e1.c
        public void a(Map map) {
            for (k1.m mVar : this.f22338a.values()) {
                map.put(mVar.a(), mVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.e1.e
        public void b(ViewManager viewManager, View view, String str, Object obj) {
            k1.m mVar = (k1.m) this.f22338a.get(str);
            if (mVar != null) {
                mVar.e(viewManager, view, obj);
            }
        }

        private b(Class cls) {
            this.f22338a = k1.i(cls);
        }
    }

    public interface c {
        void a(Map map);
    }

    public interface d extends c {
        void c(InterfaceC1969t0 interfaceC1969t0, String str, Object obj);
    }

    public interface e extends c {
        void b(ViewManager viewManager, View view, String str, Object obj);
    }

    public static void a() {
        k1.b();
        f22335a.clear();
        f22336b.clear();
    }

    private static Object b(Class cls) {
        String name = cls.getName();
        try {
            return Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            AbstractC1721a.J("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        }
    }

    private static e c(Class cls) {
        Map map = f22335a;
        e eVar = (e) map.get(cls);
        if (eVar == null) {
            eVar = (e) b(cls);
            if (eVar == null) {
                eVar = new b(cls);
            }
            map.put(cls, eVar);
        }
        return eVar;
    }

    private static d d(Class cls) {
        Map map = f22336b;
        d dVar = (d) map.get(cls);
        if (dVar == null) {
            dVar = (d) b(cls);
            if (dVar == null) {
                dVar = new a(cls);
            }
            map.put(cls, dVar);
        }
        return dVar;
    }

    public static Map e(Class cls, Class cls2) {
        HashMap hashMap = new HashMap();
        c(cls).a(hashMap);
        d(cls2).a(hashMap);
        return hashMap;
    }

    public static void f(InterfaceC1969t0 interfaceC1969t0, C1973v0 c1973v0) {
        d d10 = d(interfaceC1969t0.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = c1973v0.f22495a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            d10.c(interfaceC1969t0, next.getKey(), next.getValue());
        }
    }

    public static void g(ViewManager viewManager, View view, C1973v0 c1973v0) {
        e c10 = c(viewManager.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = c1973v0.f22495a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            c10.b(viewManager, view, next.getKey(), next.getValue());
        }
    }

    public static void h(c1 c1Var, View view, C1973v0 c1973v0) {
        Iterator<Map.Entry<String, Object>> entryIterator = c1973v0.f22495a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            c1Var.b(view, next.getKey(), next.getValue());
        }
    }
}
