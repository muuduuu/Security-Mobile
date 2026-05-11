package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
final class H1 implements N1 {

    /* renamed from: a, reason: collision with root package name */
    private final N1[] f24762a;

    H1(N1... n1Arr) {
        this.f24762a = n1Arr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1
    public final M1 b(Class cls) {
        N1[] n1Arr = this.f24762a;
        for (int i10 = 0; i10 < 2; i10++) {
            N1 n12 = n1Arr[i10];
            if (n12.c(cls)) {
                return n12.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1
    public final boolean c(Class cls) {
        N1[] n1Arr = this.f24762a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (n1Arr[i10].c(cls)) {
                return true;
            }
        }
        return false;
    }
}
