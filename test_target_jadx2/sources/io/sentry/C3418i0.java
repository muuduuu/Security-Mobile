package io.sentry;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: io.sentry.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3418i0 {

    /* renamed from: a, reason: collision with root package name */
    private final Set f35147a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final int f35148b;

    C3418i0(int i10) {
        this.f35148b = i10;
    }

    private List a(Collection collection, ILogger iLogger) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next(), iLogger));
        }
        return arrayList;
    }

    private List b(Object[] objArr, ILogger iLogger) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(d(obj, iLogger));
        }
        return arrayList;
    }

    private Map c(Map map, ILogger iLogger) {
        HashMap hashMap = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                hashMap.put(obj.toString(), d(obj2, iLogger));
            } else {
                hashMap.put(obj.toString(), null);
            }
        }
        return hashMap;
    }

    public Object d(Object obj, ILogger iLogger) {
        Object obj2;
        Object obj3 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if (obj instanceof Number) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return io.sentry.util.k.a((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return io.sentry.util.k.c((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        if (this.f35147a.contains(obj)) {
            iLogger.c(K1.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        this.f35147a.add(obj);
        try {
            if (this.f35147a.size() > this.f35148b) {
                this.f35147a.remove(obj);
                iLogger.c(K1.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
            } catch (Exception e10) {
                iLogger.b(K1.INFO, "Not serializing object due to throwing sub-path.", e10);
            }
            if (obj.getClass().isArray()) {
                obj2 = b((Object[]) obj, iLogger);
            } else if (obj instanceof Collection) {
                obj2 = a((Collection) obj, iLogger);
            } else if (obj instanceof Map) {
                obj2 = c((Map) obj, iLogger);
            } else {
                Map e11 = e(obj, iLogger);
                if (!e11.isEmpty()) {
                    obj3 = e11;
                    return obj3;
                }
                obj2 = obj.toString();
            }
            obj3 = obj2;
            return obj3;
        } finally {
            this.f35147a.remove(obj);
        }
    }

    public Map e(Object obj, ILogger iLogger) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap hashMap = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    hashMap.put(name, d(field.get(obj), iLogger));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.c(K1.INFO, "Cannot access field " + name + ".", new Object[0]);
                }
            }
        }
        return hashMap;
    }
}
