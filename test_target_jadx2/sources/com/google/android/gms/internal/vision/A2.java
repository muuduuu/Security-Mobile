package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.Parcel;
import e7.InterfaceC3089a;

/* loaded from: classes2.dex */
public final class A2 extends AbstractC2546a implements H1 {
    A2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    @Override // com.google.android.gms.internal.vision.H1
    public final F7.a[] c0(InterfaceC3089a interfaceC3089a, C2 c22) {
        Parcel p10 = p();
        AbstractC2550b.a(p10, interfaceC3089a);
        AbstractC2550b.b(p10, c22);
        Parcel k12 = k1(1, p10);
        F7.a[] aVarArr = (F7.a[]) k12.createTypedArray(F7.a.CREATOR);
        k12.recycle();
        return aVarArr;
    }

    @Override // com.google.android.gms.internal.vision.H1
    public final F7.a[] p0(InterfaceC3089a interfaceC3089a, C2 c22) {
        Parcel p10 = p();
        AbstractC2550b.a(p10, interfaceC3089a);
        AbstractC2550b.b(p10, c22);
        Parcel k12 = k1(2, p10);
        F7.a[] aVarArr = (F7.a[]) k12.createTypedArray(F7.a.CREATOR);
        k12.recycle();
        return aVarArr;
    }
}
