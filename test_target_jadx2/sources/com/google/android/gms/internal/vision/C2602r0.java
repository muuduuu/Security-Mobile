package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.vision.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2602r0 extends AbstractC2594o0 {

    /* renamed from: e, reason: collision with root package name */
    protected final byte[] f25181e;

    C2602r0(byte[] bArr) {
        bArr.getClass();
        this.f25181e = bArr;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2594o0
    final boolean F(AbstractC2570g0 abstractC2570g0, int i10, int i11) {
        if (i11 > abstractC2570g0.e()) {
            int e10 = e();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(e10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 > abstractC2570g0.e()) {
            int e11 = abstractC2570g0.e();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: 0, ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(e11);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (!(abstractC2570g0 instanceof C2602r0)) {
            return abstractC2570g0.k(0, i11).equals(k(0, i11));
        }
        C2602r0 c2602r0 = (C2602r0) abstractC2570g0;
        byte[] bArr = this.f25181e;
        byte[] bArr2 = c2602r0.f25181e;
        int G10 = G() + i11;
        int G11 = G();
        int G12 = c2602r0.G();
        while (G11 < G10) {
            if (bArr[G11] != bArr2[G12]) {
                return false;
            }
            G11++;
            G12++;
        }
        return true;
    }

    protected int G() {
        return 0;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2570g0
    public final boolean a() {
        int G10 = G();
        return k2.g(this.f25181e, G10, e() + G10);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2570g0
    public byte c(int i10) {
        return this.f25181e[i10];
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2570g0
    public int e() {
        return this.f25181e.length;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2570g0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2570g0) || e() != ((AbstractC2570g0) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof C2602r0)) {
            return obj.equals(this);
        }
        C2602r0 c2602r0 = (C2602r0) obj;
        int E10 = E();
        int E11 = c2602r0.E();
        if (E10 == 0 || E11 == 0 || E10 == E11) {
            return F(c2602r0, 0, e());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2570g0
    protected final int j(int i10, int i11, int i12) {
        return R0.a(i10, this.f25181e, G(), i12);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2570g0
    public final AbstractC2570g0 k(int i10, int i11) {
        int A10 = AbstractC2570g0.A(0, i11, e());
        return A10 == 0 ? AbstractC2570g0.f25133b : new C2579j0(this.f25181e, G(), A10);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2570g0
    protected final String t(Charset charset) {
        return new String(this.f25181e, G(), e(), charset);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2570g0
    final void u(AbstractC2559d0 abstractC2559d0) {
        abstractC2559d0.a(this.f25181e, G(), e());
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2570g0
    byte v(int i10) {
        return this.f25181e[i10];
    }
}
