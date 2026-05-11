package com.webengage.sdk.android;

/* loaded from: classes2.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f30632a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30633b;

    public h2(String str, String str2) {
        this.f30632a = str;
        this.f30633b = str2;
    }

    public String a() {
        return this.f30632a.trim();
    }

    public String b() {
        return this.f30633b.trim();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return h2Var.f30632a.trim().equalsIgnoreCase(this.f30632a.trim()) && h2Var.f30633b.trim().equalsIgnoreCase(this.f30633b.trim());
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return this.f30632a + ": " + this.f30633b;
    }
}
