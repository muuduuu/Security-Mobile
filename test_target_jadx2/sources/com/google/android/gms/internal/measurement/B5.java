package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class B5 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final B5 f24197b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f24198a;

    static {
        B5 b52 = new B5();
        f24197b = b52;
        b52.f24198a = false;
    }

    private B5() {
        this.f24198a = true;
    }

    public static B5 a() {
        return f24197b;
    }

    private static int l(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC2263i5) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC2308n5.f24582b;
        int length = bArr.length;
        int c10 = AbstractC2308n5.c(length, bArr, 0, length);
        if (c10 == 0) {
            return 1;
        }
        return c10;
    }

    private final void m() {
        if (!this.f24198a) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(B5 b52) {
        m();
        if (b52.isEmpty()) {
            return;
        }
        putAll(b52);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m();
        super.clear();
    }

    public final B5 d() {
        return isEmpty() ? new B5() : new B5(this);
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

    public final void h() {
        this.f24198a = false;
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
        return this.f24198a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m();
        byte[] bArr = AbstractC2308n5.f24582b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m();
        for (Object obj : map.keySet()) {
            byte[] bArr = AbstractC2308n5.f24582b;
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

    private B5(Map map) {
        super(map);
        this.f24198a = true;
    }
}
