package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.E;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P;
import e7.BinderC3090b;
import e7.InterfaceC3089a;

/* loaded from: classes2.dex */
public class ThickBarcodeScannerCreator extends P {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q
    public N newBarcodeScanner(InterfaceC3089a interfaceC3089a, E e10) {
        return new a((Context) BinderC3090b.l1(interfaceC3089a), e10);
    }
}
