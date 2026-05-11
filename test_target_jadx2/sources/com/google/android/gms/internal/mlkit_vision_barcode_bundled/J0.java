package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
final class J0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f24767e;

    /* renamed from: f, reason: collision with root package name */
    private final int f24768f;

    /* renamed from: g, reason: collision with root package name */
    private int f24769g;

    J0(byte[] bArr, int i10, int i11) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f24767e = bArr;
        this.f24769g = 0;
        this.f24768f = i11;
    }

    public final void C(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, i10, this.f24767e, this.f24769g, i11);
            this.f24769g += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new K0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24769g), Integer.valueOf(this.f24768f), Integer.valueOf(i11)), e10);
        }
    }

    public final void D(String str) {
        int i10 = this.f24769g;
        try {
            int A10 = M0.A(str.length() * 3);
            int A11 = M0.A(str.length());
            if (A11 != A10) {
                s(O2.e(str));
                byte[] bArr = this.f24767e;
                int i11 = this.f24769g;
                this.f24769g = O2.d(str, bArr, i11, this.f24768f - i11);
                return;
            }
            int i12 = i10 + A11;
            this.f24769g = i12;
            int d10 = O2.d(str, this.f24767e, i12, this.f24768f - i12);
            this.f24769g = i10;
            s((d10 - i10) - A11);
            this.f24769g = d10;
        } catch (N2 e10) {
            this.f24769g = i10;
            c(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new K0(e11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final int e() {
        return this.f24768f - this.f24769g;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void f(byte b10) {
        try {
            byte[] bArr = this.f24767e;
            int i10 = this.f24769g;
            this.f24769g = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new K0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24769g), Integer.valueOf(this.f24768f), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void g(int i10, boolean z10) {
        s(i10 << 3);
        f(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void h(int i10, E0 e02) {
        s((i10 << 3) | 2);
        s(e02.j());
        e02.A(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void i(int i10, int i11) {
        s((i10 << 3) | 5);
        j(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void j(int i10) {
        try {
            byte[] bArr = this.f24767e;
            int i11 = this.f24769g;
            int i12 = i11 + 1;
            this.f24769g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f24769g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f24769g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f24769g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new K0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24769g), Integer.valueOf(this.f24768f), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void k(int i10, long j10) {
        s((i10 << 3) | 1);
        l(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void l(long j10) {
        try {
            byte[] bArr = this.f24767e;
            int i10 = this.f24769g;
            int i11 = i10 + 1;
            this.f24769g = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f24769g = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f24769g = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f24769g = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f24769g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f24769g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f24769g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f24769g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new K0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24769g), Integer.valueOf(this.f24768f), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void m(int i10, int i11) {
        s(i10 << 3);
        n(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void n(int i10) {
        if (i10 >= 0) {
            s(i10);
        } else {
            u(i10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void o(byte[] bArr, int i10, int i11) {
        C(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void p(int i10, String str) {
        s((i10 << 3) | 2);
        D(str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void q(int i10, int i11) {
        s((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void r(int i10, int i11) {
        s(i10 << 3);
        s(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void s(int i10) {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f24767e;
                int i11 = this.f24769g;
                this.f24769g = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new K0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24769g), Integer.valueOf(this.f24768f), 1), e10);
            }
        }
        byte[] bArr2 = this.f24767e;
        int i12 = this.f24769g;
        this.f24769g = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void t(int i10, long j10) {
        s(i10 << 3);
        u(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M0
    public final void u(long j10) {
        boolean z10;
        z10 = M0.f24783c;
        if (z10 && this.f24768f - this.f24769g >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f24767e;
                int i10 = this.f24769g;
                this.f24769g = i10 + 1;
                J2.s(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f24767e;
            int i11 = this.f24769g;
            this.f24769g = i11 + 1;
            J2.s(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f24767e;
                int i12 = this.f24769g;
                this.f24769g = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new K0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f24769g), Integer.valueOf(this.f24768f), 1), e10);
            }
        }
        byte[] bArr4 = this.f24767e;
        int i13 = this.f24769g;
        this.f24769g = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}
