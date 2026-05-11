package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e7.InterfaceC3089a;

/* loaded from: classes2.dex */
public final class B2 extends AbstractC2546a implements z2 {
    B2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // com.google.android.gms.internal.vision.z2
    public final H1 C0(InterfaceC3089a interfaceC3089a, C2577i1 c2577i1) {
        H1 a22;
        Parcel p10 = p();
        AbstractC2550b.a(p10, interfaceC3089a);
        AbstractC2550b.b(p10, c2577i1);
        Parcel k12 = k1(1, p10);
        IBinder readStrongBinder = k12.readStrongBinder();
        if (readStrongBinder == null) {
            a22 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            a22 = queryLocalInterface instanceof H1 ? (H1) queryLocalInterface : new A2(readStrongBinder);
        }
        k12.recycle();
        return a22;
    }
}
