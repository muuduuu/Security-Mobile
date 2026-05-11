package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2060j0 extends C2072n0 {

    /* renamed from: f, reason: collision with root package name */
    private final int f23719f;

    C2060j0(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC2081q0.t(0, i11, bArr.length);
        this.f23719f = i11;
    }

    @Override // com.google.android.gms.internal.auth.C2072n0
    protected final int A() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.C2072n0, com.google.android.gms.internal.auth.AbstractC2081q0
    public final byte c(int i10) {
        int i11 = this.f23719f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f23744e[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.auth.C2072n0, com.google.android.gms.internal.auth.AbstractC2081q0
    final byte e(int i10) {
        return this.f23744e[i10];
    }

    @Override // com.google.android.gms.internal.auth.C2072n0, com.google.android.gms.internal.auth.AbstractC2081q0
    public final int h() {
        return this.f23719f;
    }
}
