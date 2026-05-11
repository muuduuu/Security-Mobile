package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.vision.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2577i1 extends W6.a {
    public static final Parcelable.Creator<C2577i1> CREATOR = new L0();

    /* renamed from: a, reason: collision with root package name */
    public int f25165a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25166b;

    public C2577i1() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 2, this.f25165a);
        W6.c.c(parcel, 3, this.f25166b);
        W6.c.b(parcel, a10);
    }

    public C2577i1(int i10, boolean z10) {
        this.f25165a = i10;
        this.f25166b = z10;
    }
}
