package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* loaded from: classes2.dex */
final class M4 extends O4 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f24287e;

    /* renamed from: f, reason: collision with root package name */
    private final int f24288f;

    /* renamed from: g, reason: collision with root package name */
    private int f24289g;

    M4(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f24287e = bArr;
        this.f24289g = 0;
        this.f24288f = i11;
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void A(long j10) {
        int i10 = this.f24289g;
        try {
            byte[] bArr = this.f24287e;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f24289g = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new N4(i10, this.f24288f, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void B(byte[] bArr, int i10, int i11) {
        F(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void C(String str) {
        int i10 = this.f24289g;
        try {
            int E10 = O4.E(str.length() * 3);
            int E11 = O4.E(str.length());
            if (E11 != E10) {
                x(AbstractC2309n6.b(str));
                byte[] bArr = this.f24287e;
                int i11 = this.f24289g;
                this.f24289g = AbstractC2309n6.c(str, bArr, i11, this.f24288f - i11);
                return;
            }
            int i12 = i10 + E11;
            this.f24289g = i12;
            int c10 = AbstractC2309n6.c(str, this.f24287e, i12, this.f24288f - i12);
            this.f24289g = i10;
            x((c10 - i10) - E11);
            this.f24289g = c10;
        } catch (C2300m6 e10) {
            this.f24289g = i10;
            f(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new N4(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final int D() {
        return this.f24288f - this.f24289g;
    }

    public final void F(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f24287e, this.f24289g, i11);
            this.f24289g += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new N4(this.f24289g, this.f24288f, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void i(int i10, int i11) {
        x((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void j(int i10, int i11) {
        x(i10 << 3);
        w(i11);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void k(int i10, int i11) {
        x(i10 << 3);
        x(i11);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void l(int i10, int i11) {
        x((i10 << 3) | 5);
        y(i11);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void m(int i10, long j10) {
        x(i10 << 3);
        z(j10);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void n(int i10, long j10) {
        x((i10 << 3) | 1);
        A(j10);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void o(int i10, boolean z10) {
        x(i10 << 3);
        v(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void p(int i10, String str) {
        x((i10 << 3) | 2);
        C(str);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void q(int i10, J4 j42) {
        x((i10 << 3) | 2);
        r(j42);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void r(J4 j42) {
        x(j42.h());
        j42.k(this);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void s(byte[] bArr, int i10, int i11) {
        x(i11);
        F(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    final void t(int i10, H5 h52, S5 s52) {
        x((i10 << 3) | 2);
        x(((AbstractC2369u4) h52).e(s52));
        s52.h(h52, this.f24320a);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void u(H5 h52) {
        x(h52.a());
        h52.d(this);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void v(byte b10) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i10 = this.f24289g;
        try {
            int i11 = i10 + 1;
            try {
                this.f24287e[i10] = b10;
                this.f24289g = i11;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i10 = i11;
                throw new N4(i10, this.f24288f, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e11) {
            indexOutOfBoundsException = e11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void w(int i10) {
        if (i10 >= 0) {
            x(i10);
        } else {
            z(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void x(int i10) {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f24289g;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.f24287e[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new N4(i12, this.f24288f, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new N4(i12, this.f24288f, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f24287e[i12] = (byte) i10;
        this.f24289g = i11;
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void y(int i10) {
        int i11 = this.f24289g;
        try {
            byte[] bArr = this.f24287e;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f24289g = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new N4(i11, this.f24288f, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final void z(long j10) {
        boolean z10;
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11;
        z10 = O4.f24318c;
        int i12 = this.f24289g;
        if (!z10 || this.f24288f - i12 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    i11 = i12 + 1;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                }
                try {
                    this.f24287e[i12] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                    i12 = i11;
                    throw new N4(i12, this.f24288f, 1, indexOutOfBoundsException);
                }
            }
            i10 = i12 + 1;
            try {
                this.f24287e[i12] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i12 = i10;
                throw new N4(i12, this.f24288f, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                AbstractC2282k6.u(this.f24287e, i12, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i12++;
            }
            i10 = i12 + 1;
            AbstractC2282k6.u(this.f24287e, i12, (byte) j10);
        }
        this.f24289g = i10;
    }
}
