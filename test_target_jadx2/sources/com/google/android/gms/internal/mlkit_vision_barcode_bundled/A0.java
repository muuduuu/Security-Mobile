package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
class A0 extends AbstractC2542z0 {

    /* renamed from: e, reason: collision with root package name */
    protected final byte[] f24724e;

    A0(byte[] bArr) {
        bArr.getClass();
        this.f24724e = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    final void A(AbstractC2512t0 abstractC2512t0) {
        ((J0) abstractC2512t0).C(this.f24724e, S(), j());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final boolean B() {
        int S10 = S();
        return O2.h(this.f24724e, S10, j() + S10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2542z0
    final boolean R(E0 e02, int i10, int i11) {
        if (i11 > e02.j()) {
            throw new IllegalArgumentException("Length too large: " + i11 + j());
        }
        int i12 = i10 + i11;
        if (i12 > e02.j()) {
            throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + e02.j());
        }
        if (!(e02 instanceof A0)) {
            return e02.v(i10, i12).equals(v(0, i11));
        }
        A0 a02 = (A0) e02;
        byte[] bArr = this.f24724e;
        byte[] bArr2 = a02.f24724e;
        int S10 = S() + i11;
        int S11 = S();
        int S12 = a02.S() + i10;
        while (S11 < S10) {
            if (bArr[S11] != bArr2[S12]) {
                return false;
            }
            S11++;
            S12++;
        }
        return true;
    }

    protected int S() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public byte c(int i10) {
        return this.f24724e[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    byte e(int i10) {
        return this.f24724e[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E0) || j() != ((E0) obj).j()) {
            return false;
        }
        if (j() == 0) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return obj.equals(this);
        }
        A0 a02 = (A0) obj;
        int E10 = E();
        int E11 = a02.E();
        if (E10 == 0 || E11 == 0 || E10 == E11) {
            return R(a02, 0, j());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public int j() {
        return this.f24724e.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    protected void k(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f24724e, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    protected final int t(int i10, int i11, int i12) {
        return AbstractC2489o1.b(i10, this.f24724e, S() + i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    protected final int u(int i10, int i11, int i12) {
        int S10 = S() + i11;
        return O2.f(i10, this.f24724e, S10, i12 + S10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final E0 v(int i10, int i11) {
        int D10 = E0.D(i10, i11, j());
        return D10 == 0 ? E0.f24749b : new C2532x0(this.f24724e, S() + i10, D10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    protected final String w(Charset charset) {
        return new String(this.f24724e, S(), j(), charset);
    }
}
