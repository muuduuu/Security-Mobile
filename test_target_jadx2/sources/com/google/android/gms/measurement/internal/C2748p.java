package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2748p extends W6.a {
    public static final Parcelable.Creator<C2748p> CREATOR = new C2756q();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f26234a;

    public C2748p(Bundle bundle) {
        this.f26234a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f26234a;
        int a10 = W6.c.a(parcel);
        W6.c.e(parcel, 1, bundle, false);
        W6.c.b(parcel, a10);
    }
}
