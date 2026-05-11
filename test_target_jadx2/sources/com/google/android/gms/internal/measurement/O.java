package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class O implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f24309f;

    /* renamed from: g, reason: collision with root package name */
    private final String f24310g;

    protected O(IBinder iBinder, String str) {
        this.f24309f = iBinder;
        this.f24310g = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f24309f;
    }

    protected final Parcel k1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f24310g);
        return obtain;
    }

    protected final void l1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f24309f.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    protected final void m1(int i10, Parcel parcel) {
        try {
            this.f24309f.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel p(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f24309f.transact(i10, parcel, obtain, 0);
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
}
