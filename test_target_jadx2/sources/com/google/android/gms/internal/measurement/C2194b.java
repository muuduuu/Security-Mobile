package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2194b {

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.common.collect.k f24455d = com.google.common.collect.k.B("_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    private String f24456a;

    /* renamed from: b, reason: collision with root package name */
    private final long f24457b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f24458c;

    public C2194b(String str, long j10, Map map) {
        this.f24456a = str;
        this.f24457b = j10;
        HashMap hashMap = new HashMap();
        this.f24458c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object h(String str, Object obj, Object obj2) {
        if (f24455d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final long a() {
        return this.f24457b;
    }

    public final String b() {
        return this.f24456a;
    }

    public final void c(String str) {
        this.f24456a = str;
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f24458c.remove(str);
        } else {
            Map map = this.f24458c;
            map.put(str, h(str, map.get(str), obj));
        }
    }

    public final Object e(String str) {
        Map map = this.f24458c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2194b)) {
            return false;
        }
        C2194b c2194b = (C2194b) obj;
        if (this.f24457b == c2194b.f24457b && this.f24456a.equals(c2194b.f24456a)) {
            return this.f24458c.equals(c2194b.f24458c);
        }
        return false;
    }

    public final Map f() {
        return this.f24458c;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C2194b clone() {
        return new C2194b(this.f24456a, this.f24457b, new HashMap(this.f24458c));
    }

    public final int hashCode() {
        int hashCode = this.f24456a.hashCode() * 31;
        long j10 = this.f24457b;
        return ((hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f24458c.hashCode();
    }

    public final String toString() {
        String str = this.f24456a;
        String obj = this.f24458c.toString();
        int length = String.valueOf(str).length();
        long j10 = this.f24457b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j10).length() + 9 + obj.length() + 1);
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j10);
        sb2.append(", params=");
        sb2.append(obj);
        sb2.append("}");
        return sb2.toString();
    }
}
