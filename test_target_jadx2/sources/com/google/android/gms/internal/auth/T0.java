package com.google.android.gms.internal.auth;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class T0 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final T0 f23655b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f23656a;

    static {
        T0 t02 = new T0();
        f23655b = t02;
        t02.f23656a = false;
    }

    private T0() {
        this.f23656a = true;
    }

    public static T0 a() {
        return f23655b;
    }

    private static int l(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = G0.f23599d;
        int length = bArr.length;
        int b10 = G0.b(length, bArr, 0, length);
        if (b10 == 0) {
            return 1;
        }
        return b10;
    }

    private final void m() {
        if (!this.f23656a) {
            throw new UnsupportedOperationException();
        }
    }

    public final T0 b() {
        return isEmpty() ? new T0() : new T0(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m();
        super.clear();
    }

    public final void d() {
        this.f23656a = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final void h(T0 t02) {
        m();
        if (t02.isEmpty()) {
            return;
        }
        putAll(t02);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i10 += l(entry.getValue()) ^ l(entry.getKey());
        }
        return i10;
    }

    public final boolean i() {
        return this.f23656a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m();
        byte[] bArr = G0.f23599d;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m();
        for (Object obj : map.keySet()) {
            byte[] bArr = G0.f23599d;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m();
        return super.remove(obj);
    }

    private T0(Map map) {
        super(map);
        this.f23656a = true;
    }
}
