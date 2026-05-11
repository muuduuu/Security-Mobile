package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
final class P0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f24789a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24790b;

    P0(Object obj, int i10) {
        this.f24789a = obj;
        this.f24790b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P0)) {
            return false;
        }
        P0 p02 = (P0) obj;
        return this.f24789a == p02.f24789a && this.f24790b == p02.f24790b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f24789a) * 65535) + this.f24790b;
    }
}
