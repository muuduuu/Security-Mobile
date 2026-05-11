package com.google.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class H extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final H f28675b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f28676a;

    static {
        H h10 = new H();
        f28675b = h10;
        h10.o();
    }

    private H() {
        this.f28676a = true;
    }

    static int a(Map map) {
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            i10 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i10;
    }

    private static int b(Object obj) {
        return obj instanceof byte[] ? AbstractC2893y.d((byte[]) obj) : obj.hashCode();
    }

    private static void d(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC2893y.a(obj);
            AbstractC2893y.a(map.get(obj));
        }
    }

    public static H h() {
        return f28675b;
    }

    private void i() {
        if (!n()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean l(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean m(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !l(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean n() {
        return this.f28676a;
    }

    public void o() {
        this.f28676a = false;
    }

    public void p(H h10) {
        i();
        if (h10.isEmpty()) {
            return;
        }
        putAll(h10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        i();
        AbstractC2893y.a(obj);
        AbstractC2893y.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        i();
        d(map);
        super.putAll(map);
    }

    public H q() {
        return isEmpty() ? new H() : new H(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        i();
        return super.remove(obj);
    }

    private H(Map map) {
        super(map);
        this.f28676a = true;
    }
}
