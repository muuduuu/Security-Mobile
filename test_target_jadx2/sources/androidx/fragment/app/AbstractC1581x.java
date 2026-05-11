package androidx.fragment.app;

import androidx.fragment.app.ComponentCallbacksC1573o;

/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1581x {

    /* renamed from: a, reason: collision with root package name */
    private static final j0.i f17023a = new j0.i();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return ComponentCallbacksC1573o.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) {
        j0.i iVar = f17023a;
        j0.i iVar2 = (j0.i) iVar.get(classLoader);
        if (iVar2 == null) {
            iVar2 = new j0.i();
            iVar.put(classLoader, iVar2);
        }
        Class cls = (Class) iVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        iVar2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new ComponentCallbacksC1573o.m("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new ComponentCallbacksC1573o.m("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    public abstract ComponentCallbacksC1573o a(ClassLoader classLoader, String str);
}
