package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.clearcut.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2108a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f23987f;

    /* renamed from: g, reason: collision with root package name */
    private final String f23988g;

    protected AbstractC2108a(IBinder iBinder, String str) {
        this.f23987f = iBinder;
        this.f23988g = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f23987f;
    }

    protected final void k1(int i10, Parcel parcel) {
        try {
            this.f23987f.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23988g);
        return obtain;
    }
}
