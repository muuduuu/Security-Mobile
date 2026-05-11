package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.vision.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2546a implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f25098f;

    /* renamed from: g, reason: collision with root package name */
    private final String f25099g;

    protected AbstractC2546a(IBinder iBinder, String str) {
        this.f25098f = iBinder;
        this.f25099g = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f25098f;
    }

    protected final Parcel k1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f25098f.transact(i10, parcel, obtain, 0);
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

    protected final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25099g);
        return obtain;
    }
}
