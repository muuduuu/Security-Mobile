package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o1.AbstractC3740b;
import o1.C3741c;
import o1.InterfaceC3739a;
import q1.AbstractC3901a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f17827d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f17828e = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Context f17831c;

    /* renamed from: b, reason: collision with root package name */
    final Set f17830b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    final Map f17829a = new HashMap();

    a(Context context) {
        this.f17831c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object obj;
        if (AbstractC3901a.h()) {
            try {
                AbstractC3901a.c(cls.getSimpleName());
            } catch (Throwable th) {
                AbstractC3901a.f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f17829a.containsKey(cls)) {
            obj = this.f17829a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC3739a interfaceC3739a = (InterfaceC3739a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a10 = interfaceC3739a.a();
                if (!a10.isEmpty()) {
                    for (Class cls2 : a10) {
                        if (!this.f17829a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                obj = interfaceC3739a.b(this.f17831c);
                set.remove(cls);
                this.f17829a.put(cls, obj);
            } catch (Throwable th2) {
                throw new C3741c(th2);
            }
        }
        AbstractC3901a.f();
        return obj;
    }

    public static a e(Context context) {
        if (f17827d == null) {
            synchronized (f17828e) {
                try {
                    if (f17827d == null) {
                        f17827d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f17827d;
    }

    void a() {
        try {
            try {
                AbstractC3901a.c("Startup");
                b(this.f17831c.getPackageManager().getProviderInfo(new ComponentName(this.f17831c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new C3741c(e10);
            }
        } finally {
            AbstractC3901a.f();
        }
    }

    void b(Bundle bundle) {
        String string = this.f17831c.getString(AbstractC3740b.f37805a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC3739a.class.isAssignableFrom(cls)) {
                            this.f17830b.add(cls);
                        }
                    }
                }
                Iterator it = this.f17830b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new C3741c(e10);
            }
        }
    }

    Object c(Class cls) {
        Object obj;
        synchronized (f17828e) {
            try {
                obj = this.f17829a.get(cls);
                if (obj == null) {
                    obj = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f17830b.contains(cls);
    }
}
