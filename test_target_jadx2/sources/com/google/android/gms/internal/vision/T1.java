package com.google.android.gms.internal.vision;

import java.util.Map;

/* loaded from: classes2.dex */
final class T1 implements Comparable, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f25084a;

    /* renamed from: b, reason: collision with root package name */
    private Object f25085b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ O1 f25086c;

    T1(O1 o12, Map.Entry entry) {
        this(o12, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((T1) obj).getKey());
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
        return b(this.f25084a, entry.getKey()) && b(this.f25085b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f25084a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f25085b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f25084a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f25085b;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f25086c.q();
        Object obj2 = this.f25085b;
        this.f25085b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25084a);
        String valueOf2 = String.valueOf(this.f25085b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }

    T1(O1 o12, Comparable comparable, Object obj) {
        this.f25086c = o12;
        this.f25084a = comparable;
        this.f25085b = obj;
    }
}
