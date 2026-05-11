package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.auth.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2032a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f23675f;

    /* renamed from: g, reason: collision with root package name */
    private final String f23676g;

    protected AbstractC2032a(IBinder iBinder, String str) {
        this.f23675f = iBinder;
        this.f23676g = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f23675f;
    }

    protected final Parcel k1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f23675f.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void l1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f23675f.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    protected final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23676g);
        return obtain;
    }
}
