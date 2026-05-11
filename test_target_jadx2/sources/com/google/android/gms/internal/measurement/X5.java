package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class X5 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f24409a;

    /* renamed from: b, reason: collision with root package name */
    private Object f24410b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2192a6 f24411c;

    X5(AbstractC2192a6 abstractC2192a6, Comparable comparable, Object obj) {
        Objects.requireNonNull(abstractC2192a6);
        this.f24411c = abstractC2192a6;
        this.f24409a = comparable;
        this.f24410b = obj;
    }

    private static final boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable b() {
        return this.f24409a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f24409a.compareTo(((X5) obj).f24409a);
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
        return c(this.f24409a, entry.getKey()) && c(this.f24410b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f24409a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f24410b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f24409a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f24410b;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f24411c.h();
        Object obj2 = this.f24410b;
        this.f24410b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24409a);
        String valueOf2 = String.valueOf(this.f24410b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}
