package com.swmansion.rnscreens.utils;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f30058a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30059b;

    public b(int i10, boolean z10) {
        this.f30058a = i10;
        this.f30059b = z10;
    }

    public final int a() {
        return this.f30058a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f30058a == bVar.f30058a && this.f30059b == bVar.f30059b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f30058a) * 31) + Boolean.hashCode(this.f30059b);
    }

    public String toString() {
        return "CacheKey(fontSize=" + this.f30058a + ", isTitleEmpty=" + this.f30059b + ")";
    }
}
