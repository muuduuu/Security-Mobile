package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class S4 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f24363a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24364b;

    S4(Object obj, int i10) {
        this.f24363a = obj;
        this.f24364b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof S4)) {
            return false;
        }
        S4 s42 = (S4) obj;
        return this.f24363a == s42.f24363a && this.f24364b == s42.f24364b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f24363a) * 65535) + this.f24364b;
    }
}
