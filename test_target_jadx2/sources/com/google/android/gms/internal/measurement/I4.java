package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
class I4 extends H4 {

    /* renamed from: c, reason: collision with root package name */
    protected final byte[] f24240c;

    I4(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f24240c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public byte c(int i10) {
        return this.f24240c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.J4
    byte e(int i10) {
        return this.f24240c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J4) || h() != ((J4) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof I4)) {
            return obj.equals(this);
        }
        I4 i42 = (I4) obj;
        int t10 = t();
        int t11 = i42.t();
        if (t10 != 0 && t11 != 0 && t10 != t11) {
            return false;
        }
        int h10 = h();
        if (h10 > i42.h()) {
            int h11 = h();
            StringBuilder sb2 = new StringBuilder(String.valueOf(h10).length() + 18 + String.valueOf(h11).length());
            sb2.append("Length too large: ");
            sb2.append(h10);
            sb2.append(h11);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (h10 > i42.h()) {
            int h12 = i42.h();
            StringBuilder sb3 = new StringBuilder(String.valueOf(h10).length() + 27 + String.valueOf(h12).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(h10);
            sb3.append(", ");
            sb3.append(h12);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f24240c;
        byte[] bArr2 = i42.f24240c;
        i42.v();
        int i10 = 0;
        int i11 = 0;
        while (i10 < h10) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public int h() {
        return this.f24240c.length;
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final J4 j(int i10, int i11) {
        int u10 = J4.u(0, i11, h());
        return u10 == 0 ? J4.f24246b : new E4(this.f24240c, 0, u10);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    final void k(A4 a42) {
        ((M4) a42).F(this.f24240c, 0, h());
    }

    @Override // com.google.android.gms.internal.measurement.J4
    protected final int m(int i10, int i11, int i12) {
        return AbstractC2308n5.c(i10, this.f24240c, 0, i12);
    }

    protected int v() {
        return 0;
    }
}
