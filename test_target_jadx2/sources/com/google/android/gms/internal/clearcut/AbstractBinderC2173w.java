package com.google.android.gms.internal.clearcut;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.clearcut.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2173w extends Binder implements IInterface {
    protected AbstractBinderC2173w(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z10;
        if (i10 > 16777215) {
            z10 = super.onTransact(i10, parcel, parcel2, i11);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return p(i10, parcel, parcel2, i11);
    }

    protected abstract boolean p(int i10, Parcel parcel, Parcel parcel2, int i11);
}
