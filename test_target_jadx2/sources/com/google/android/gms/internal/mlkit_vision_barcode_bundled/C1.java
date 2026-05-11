package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
final class C1 extends E1 {
    /* synthetic */ C1(A1 a12) {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E1
    final void a(Object obj, long j10) {
        ((InterfaceC2484n1) J2.k(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E1
    final void b(Object obj, Object obj2, long j10) {
        InterfaceC2484n1 interfaceC2484n1 = (InterfaceC2484n1) J2.k(obj, j10);
        InterfaceC2484n1 interfaceC2484n12 = (InterfaceC2484n1) J2.k(obj2, j10);
        int size = interfaceC2484n1.size();
        int size2 = interfaceC2484n12.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC2484n1.a()) {
                interfaceC2484n1 = interfaceC2484n1.l(size2 + size);
            }
            interfaceC2484n1.addAll(interfaceC2484n12);
        }
        if (size > 0) {
            interfaceC2484n12 = interfaceC2484n1;
        }
        J2.x(obj, j10, interfaceC2484n12);
    }
}
