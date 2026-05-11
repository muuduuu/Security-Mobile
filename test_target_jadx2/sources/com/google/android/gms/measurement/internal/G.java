package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class G extends W6.a implements Iterable {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f25406a;

    G(Bundle bundle) {
        this.f25406a = bundle;
    }

    final Double F(String str) {
        return Double.valueOf(this.f25406a.getDouble("value"));
    }

    final String I(String str) {
        return this.f25406a.getString(str);
    }

    public final Bundle Z0() {
        return new Bundle(this.f25406a);
    }

    final /* synthetic */ Bundle a1() {
        return this.f25406a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new F(this);
    }

    final Object j(String str) {
        return this.f25406a.get(str);
    }

    public final String toString() {
        return this.f25406a.toString();
    }

    final Long u(String str) {
        return Long.valueOf(this.f25406a.getLong(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.e(parcel, 2, Z0(), false);
        W6.c.b(parcel, a10);
    }

    public final int y0() {
        return this.f25406a.size();
    }
}
