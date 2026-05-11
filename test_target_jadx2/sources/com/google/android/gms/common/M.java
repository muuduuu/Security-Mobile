package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e7.BinderC3090b;
import e7.InterfaceC3089a;

/* loaded from: classes2.dex */
public final class M extends W6.a {
    public static final Parcelable.Creator<M> CREATOR = new N();

    /* renamed from: a, reason: collision with root package name */
    private final String f23305a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23306b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23307c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f23308d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f23309e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f23310f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f23311g;

    M(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13, boolean z14) {
        this.f23305a = str;
        this.f23306b = z10;
        this.f23307c = z11;
        this.f23308d = (Context) BinderC3090b.l1(InterfaceC3089a.AbstractBinderC0469a.k1(iBinder));
        this.f23309e = z12;
        this.f23310f = z13;
        this.f23311g = z14;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, e7.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f23305a;
        int a10 = W6.c.a(parcel);
        W6.c.u(parcel, 1, str, false);
        W6.c.c(parcel, 2, this.f23306b);
        W6.c.c(parcel, 3, this.f23307c);
        W6.c.l(parcel, 4, BinderC3090b.m1(this.f23308d), false);
        W6.c.c(parcel, 5, this.f23309e);
        W6.c.c(parcel, 6, this.f23310f);
        W6.c.c(parcel, 8, this.f23311g);
        W6.c.b(parcel, a10);
    }
}
