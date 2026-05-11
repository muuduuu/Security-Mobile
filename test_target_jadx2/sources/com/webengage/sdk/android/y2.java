package com.webengage.sdk.android;

/* loaded from: classes2.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    private String f31156a;

    public y2(String str) {
        this.f31156a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof y2) {
            return ((y2) obj).f31156a.equalsIgnoreCase(this.f31156a);
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return this.f31156a;
    }
}
