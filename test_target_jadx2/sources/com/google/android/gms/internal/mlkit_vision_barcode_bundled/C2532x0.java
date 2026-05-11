package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2532x0 extends A0 {

    /* renamed from: f, reason: collision with root package name */
    private final int f24979f;

    /* renamed from: g, reason: collision with root package name */
    private final int f24980g;

    C2532x0(byte[] bArr, int i10, int i11) {
        super(bArr);
        E0.D(i10, i10 + i11, bArr.length);
        this.f24979f = i10;
        this.f24980g = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0
    protected final int S() {
        return this.f24979f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final byte c(int i10) {
        E0.M(i10, this.f24980g);
        return this.f24724e[this.f24979f + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    final byte e(int i10) {
        return this.f24724e[this.f24979f + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final int j() {
        return this.f24980g;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    protected final void k(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f24724e, this.f24979f + i10, bArr, i11, i12);
    }
}
