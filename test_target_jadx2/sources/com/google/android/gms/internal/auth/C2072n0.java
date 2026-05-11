package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.auth.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2072n0 extends AbstractC2069m0 {

    /* renamed from: e, reason: collision with root package name */
    protected final byte[] f23744e;

    C2072n0(byte[] bArr) {
        bArr.getClass();
        this.f23744e = bArr;
    }

    protected int A() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2081q0
    public byte c(int i10) {
        return this.f23744e[i10];
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2081q0
    byte e(int i10) {
        return this.f23744e[i10];
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2081q0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2081q0) || h() != ((AbstractC2081q0) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof C2072n0)) {
            return obj.equals(this);
        }
        C2072n0 c2072n0 = (C2072n0) obj;
        int u10 = u();
        int u11 = c2072n0.u();
        if (u10 != 0 && u11 != 0 && u10 != u11) {
            return false;
        }
        int h10 = h();
        if (h10 > c2072n0.h()) {
            throw new IllegalArgumentException("Length too large: " + h10 + h());
        }
        if (h10 > c2072n0.h()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + h10 + ", " + c2072n0.h());
        }
        byte[] bArr = this.f23744e;
        byte[] bArr2 = c2072n0.f23744e;
        c2072n0.A();
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

    @Override // com.google.android.gms.internal.auth.AbstractC2081q0
    public int h() {
        return this.f23744e.length;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2081q0
    protected final int j(int i10, int i11, int i12) {
        return G0.b(i10, this.f23744e, 0, i12);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2081q0
    public final AbstractC2081q0 k(int i10, int i11) {
        int t10 = AbstractC2081q0.t(0, i11, h());
        return t10 == 0 ? AbstractC2081q0.f23760b : new C2060j0(this.f23744e, 0, t10);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2081q0
    protected final String m(Charset charset) {
        return new String(this.f23744e, 0, h(), charset);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2081q0
    public final boolean r() {
        return F1.c(this.f23744e, 0, h());
    }
}
