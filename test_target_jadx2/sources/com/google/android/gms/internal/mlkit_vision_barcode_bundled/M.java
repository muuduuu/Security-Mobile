package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import e7.InterfaceC3089a;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class M extends B implements N {
    public M() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.B
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            a();
            parcel2.writeNoException();
        } else if (i10 == 2) {
            f();
            parcel2.writeNoException();
        } else {
            if (i10 != 3) {
                return false;
            }
            InterfaceC3089a k12 = InterfaceC3089a.AbstractBinderC0469a.k1(parcel.readStrongBinder());
            X x10 = (X) AbstractC2433d0.a(parcel, X.CREATOR);
            AbstractC2433d0.b(parcel);
            List k10 = k(k12, x10);
            parcel2.writeNoException();
            parcel2.writeTypedList(k10);
        }
        return true;
    }
}
