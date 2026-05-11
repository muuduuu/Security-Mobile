package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class J0 extends W6.a {
    public static final Parcelable.Creator<J0> CREATOR = new K0();

    /* renamed from: a, reason: collision with root package name */
    public final int f24243a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24244b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f24245c;

    public J0(int i10, String str, Intent intent) {
        this.f24243a = i10;
        this.f24244b = str;
        this.f24245c = intent;
    }

    public static J0 j(Activity activity) {
        return new J0(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j02 = (J0) obj;
        return this.f24243a == j02.f24243a && Objects.equals(this.f24244b, j02.f24244b) && Objects.equals(this.f24245c, j02.f24245c);
    }

    public final int hashCode() {
        return this.f24243a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f24243a;
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, i11);
        W6.c.u(parcel, 2, this.f24244b, false);
        W6.c.s(parcel, 3, this.f24245c, i10, false);
        W6.c.b(parcel, a10);
    }
}
