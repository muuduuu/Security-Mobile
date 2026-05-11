package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.clearcut.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2171v0 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final C2171v0 f24103b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f24104a;

    static {
        C2171v0 c2171v0 = new C2171v0();
        f24103b = c2171v0;
        c2171v0.f24104a = false;
    }

    private C2171v0() {
        this.f24104a = true;
    }

    public static C2171v0 d() {
        return f24103b;
    }

    private final void i() {
        if (!this.f24104a) {
            throw new UnsupportedOperationException();
        }
    }

    private static int l(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC2115c0.b((byte[]) obj);
        }
        if (obj instanceof InterfaceC2118d0) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public final boolean a() {
        return this.f24104a;
    }

    public final void b(C2171v0 c2171v0) {
        i();
        if (c2171v0.isEmpty()) {
            return;
        }
        putAll(c2171v0);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
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

    public final C2171v0 h() {
        return isEmpty() ? new C2171v0() : new C2171v0(this);
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

    public final void m() {
        this.f24104a = false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        i();
        AbstractC2115c0.a(obj);
        AbstractC2115c0.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            AbstractC2115c0.a(obj);
            AbstractC2115c0.a(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }

    private C2171v0(Map map) {
        super(map);
        this.f24104a = true;
    }
}
