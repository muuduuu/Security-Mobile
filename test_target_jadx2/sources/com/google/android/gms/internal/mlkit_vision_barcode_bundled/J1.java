package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class J1 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final J1 f24770b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f24771a;

    static {
        J1 j12 = new J1();
        f24770b = j12;
        j12.f24771a = false;
    }

    private J1() {
        this.f24771a = true;
    }

    public static J1 a() {
        return f24770b;
    }

    private static int l(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC2454h1) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC2489o1.f24887d;
        int length = bArr.length;
        int b10 = AbstractC2489o1.b(length, bArr, 0, length);
        if (b10 == 0) {
            return 1;
        }
        return b10;
    }

    private final void m() {
        if (!this.f24771a) {
            throw new UnsupportedOperationException();
        }
    }

    public final J1 b() {
        return isEmpty() ? new J1() : new J1(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m();
        super.clear();
    }

    public final void d() {
        this.f24771a = false;
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

    public final void h(J1 j12) {
        m();
        if (j12.isEmpty()) {
            return;
        }
        putAll(j12);
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
        return this.f24771a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m();
        byte[] bArr = AbstractC2489o1.f24887d;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m();
        for (Object obj : map.keySet()) {
            byte[] bArr = AbstractC2489o1.f24887d;
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

    private J1(Map map) {
        super(map);
        this.f24771a = true;
    }
}
