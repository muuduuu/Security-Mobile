package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2579j0 extends C2602r0 {

    /* renamed from: f, reason: collision with root package name */
    private final int f25169f;

    /* renamed from: g, reason: collision with root package name */
    private final int f25170g;

    C2579j0(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC2570g0.A(i10, i10 + i11, bArr.length);
        this.f25169f = i10;
        this.f25170g = i11;
    }

    @Override // com.google.android.gms.internal.vision.C2602r0
    protected final int G() {
        return this.f25169f;
    }

    @Override // com.google.android.gms.internal.vision.C2602r0, com.google.android.gms.internal.vision.AbstractC2570g0
    public final byte c(int i10) {
        int e10 = e();
        if (((e10 - (i10 + 1)) | i10) >= 0) {
            return this.f25181e[this.f25169f + i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append("Index < 0: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Index > length: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(e10);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.vision.C2602r0, com.google.android.gms.internal.vision.AbstractC2570g0
    public final int e() {
        return this.f25170g;
    }

    @Override // com.google.android.gms.internal.vision.C2602r0, com.google.android.gms.internal.vision.AbstractC2570g0
    final byte v(int i10) {
        return this.f25181e[this.f25169f + i10];
    }
}
