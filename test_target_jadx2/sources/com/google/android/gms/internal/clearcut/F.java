package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
class F extends E {

    /* renamed from: d, reason: collision with root package name */
    protected final byte[] f23805d;

    F(byte[] bArr) {
        this.f23805d = bArr;
    }

    @Override // com.google.android.gms.internal.clearcut.E
    final boolean B(AbstractC2179y abstractC2179y, int i10, int i11) {
        if (i11 > abstractC2179y.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 > abstractC2179y.size()) {
            int size2 = abstractC2179y.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: 0, ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (!(abstractC2179y instanceof F)) {
            return abstractC2179y.e(0, i11).equals(e(0, i11));
        }
        F f10 = (F) abstractC2179y;
        byte[] bArr = this.f23805d;
        byte[] bArr2 = f10.f23805d;
        int D10 = D() + i11;
        int D11 = D();
        int D12 = f10.D();
        while (D11 < D10) {
            if (bArr[D11] != bArr2[D12]) {
                return false;
            }
            D11++;
            D12++;
        }
        return true;
    }

    protected int D() {
        return 0;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2179y
    protected final int c(int i10, int i11, int i12) {
        return AbstractC2115c0.c(i10, this.f23805d, D(), i12);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2179y
    public final AbstractC2179y e(int i10, int i11) {
        int r10 = AbstractC2179y.r(0, i11, size());
        return r10 == 0 ? AbstractC2179y.f24108b : new B(this.f23805d, D(), r10);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2179y
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2179y) || size() != ((AbstractC2179y) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof F)) {
            return obj.equals(this);
        }
        F f10 = (F) obj;
        int m10 = m();
        int m11 = f10.m();
        if (m10 == 0 || m11 == 0 || m10 == m11) {
            return B(f10, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2179y
    protected final String h(Charset charset) {
        return new String(this.f23805d, D(), size(), charset);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2179y
    final void j(AbstractC2176x abstractC2176x) {
        abstractC2176x.a(this.f23805d, D(), size());
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2179y
    public final boolean k() {
        int D10 = D();
        return AbstractC2131h1.i(this.f23805d, D10, size() + D10);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2179y
    public int size() {
        return this.f23805d.length;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2179y
    public byte v(int i10) {
        return this.f23805d[i10];
    }
}
