package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.vision.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2592n1 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final C2592n1 f25177b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f25178a;

    static {
        C2592n1 c2592n1 = new C2592n1();
        f25177b = c2592n1;
        c2592n1.f25178a = false;
    }

    private C2592n1() {
        this.f25178a = true;
    }

    private static int a(Object obj) {
        if (obj instanceof byte[]) {
            return R0.j((byte[]) obj);
        }
        if (obj instanceof Q0) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static C2592n1 b() {
        return f25177b;
    }

    private final void m() {
        if (!this.f25178a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m();
        super.clear();
    }

    public final void d(C2592n1 c2592n1) {
        m();
        if (c2592n1.isEmpty()) {
            return;
        }
        putAll(c2592n1);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                    return true;
                }
            }
            z10 = true;
            if (!z10) {
            }
        }
        return false;
    }

    public final C2592n1 h() {
        return isEmpty() ? new C2592n1() : new C2592n1(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i10 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i10;
    }

    public final void i() {
        this.f25178a = false;
    }

    public final boolean l() {
        return this.f25178a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m();
        R0.d(obj);
        R0.d(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m();
        for (Object obj : map.keySet()) {
            R0.d(obj);
            R0.d(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m();
        return super.remove(obj);
    }

    private C2592n1(Map map) {
        super(map);
        this.f25178a = true;
    }
}
