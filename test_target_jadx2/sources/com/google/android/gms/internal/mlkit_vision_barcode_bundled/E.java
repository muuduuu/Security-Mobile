package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class E extends W6.a {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    private final int f24747a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24748b;

    public E(int i10, boolean z10) {
        this.f24747a = i10;
        this.f24748b = z10;
    }

    public final int j() {
        return this.f24747a;
    }

    public final boolean u() {
        return this.f24748b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f24747a);
        W6.c.c(parcel, 2, this.f24748b);
        W6.c.b(parcel, a10);
    }
}
