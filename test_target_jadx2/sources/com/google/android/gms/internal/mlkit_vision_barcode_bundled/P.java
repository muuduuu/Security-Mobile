package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e7.InterfaceC3089a;

/* loaded from: classes2.dex */
public abstract class P extends B implements Q {
    public P() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    public static Q asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return queryLocalInterface instanceof Q ? (Q) queryLocalInterface : new O(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.B
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        InterfaceC3089a k12 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
        E e10 = (E) AbstractC2433d0.a(parcel, E.CREATOR);
        AbstractC2433d0.b(parcel);
        N newBarcodeScanner = newBarcodeScanner(k12, e10);
        parcel2.writeNoException();
        if (newBarcodeScanner == null) {
            parcel2.writeStrongBinder(null);
        } else {
            parcel2.writeStrongBinder(newBarcodeScanner.asBinder());
        }
        return true;
    }
}
