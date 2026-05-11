package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: f, reason: collision with root package name */
    private static final Map f34414f;

    /* renamed from: a, reason: collision with root package name */
    private final Map f34415a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f34416b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private C3396b f34417c = null;

    /* renamed from: d, reason: collision with root package name */
    private C3396b f34418d = null;

    /* renamed from: e, reason: collision with root package name */
    private C3396b f34419e = null;

    static {
        HashMap hashMap = new HashMap();
        f34414f = hashMap;
        hashMap.put("boolean", Boolean.class);
        hashMap.put("char", Character.class);
        hashMap.put("byte", Byte.class);
        hashMap.put("short", Short.class);
        hashMap.put("int", Integer.class);
        hashMap.put("long", Long.class);
        hashMap.put("float", Float.class);
        hashMap.put("double", Double.class);
    }

    private boolean j(Object obj, Class cls) {
        Class cls2 = (Class) f34414f.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    public static A o(C3396b c3396b) {
        A a10 = new A();
        a10.a(c3396b);
        return a10;
    }

    public void a(C3396b c3396b) {
        if (c3396b != null) {
            this.f34416b.add(c3396b);
        }
    }

    public void b(List list) {
        if (list != null) {
            this.f34416b.addAll(list);
        }
    }

    public synchronized void c() {
        try {
            Iterator it = this.f34415a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() != null && ((String) entry.getKey()).startsWith("sentry:")) {
                }
                it.remove();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object d(String str) {
        return this.f34415a.get(str);
    }

    public synchronized Object e(String str, Class cls) {
        Object obj = this.f34415a.get(str);
        if (cls.isInstance(obj)) {
            return obj;
        }
        if (j(obj, cls)) {
            return obj;
        }
        return null;
    }

    public List f() {
        return new ArrayList(this.f34416b);
    }

    public C3396b g() {
        return this.f34417c;
    }

    public C3396b h() {
        return this.f34419e;
    }

    public C3396b i() {
        return this.f34418d;
    }

    public synchronized void k(String str, Object obj) {
        this.f34415a.put(str, obj);
    }

    public void l(C3396b c3396b) {
        this.f34417c = c3396b;
    }

    public void m(C3396b c3396b) {
        this.f34419e = c3396b;
    }

    public void n(C3396b c3396b) {
        this.f34418d = c3396b;
    }
}
