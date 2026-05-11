package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.auth.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2050g extends W6.a {
    public static final Parcelable.Creator<C2050g> CREATOR = new C2053h();

    /* renamed from: a, reason: collision with root package name */
    final int f23708a;

    /* renamed from: b, reason: collision with root package name */
    String f23709b;

    public C2050g() {
        this.f23708a = 1;
    }

    public final C2050g j(String str) {
        this.f23709b = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f23708a);
        W6.c.u(parcel, 2, this.f23709b, false);
        W6.c.b(parcel, a10);
    }

    C2050g(int i10, String str) {
        this.f23708a = i10;
        this.f23709b = str;
    }
}
