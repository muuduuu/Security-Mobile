package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2495p2 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f24897a;

    /* renamed from: b, reason: collision with root package name */
    private Object f24898b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2524v2 f24899c;

    C2495p2(AbstractC2524v2 abstractC2524v2, Comparable comparable, Object obj) {
        this.f24899c = abstractC2524v2;
        this.f24897a = comparable;
        this.f24898b = obj;
    }

    private static final boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable b() {
        return this.f24897a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f24897a.compareTo(((C2495p2) obj).f24897a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return c(this.f24897a, entry.getKey()) && c(this.f24898b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f24897a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f24898b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f24897a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f24898b;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f24899c.o();
        Object obj2 = this.f24898b;
        this.f24898b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f24897a) + "=" + String.valueOf(this.f24898b);
    }
}
