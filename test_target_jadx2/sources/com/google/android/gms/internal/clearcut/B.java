package com.google.android.gms.internal.clearcut;

/* loaded from: classes2.dex */
final class B extends F {

    /* renamed from: e, reason: collision with root package name */
    private final int f23793e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23794f;

    B(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC2179y.r(i10, i10 + i11, bArr.length);
        this.f23793e = i10;
        this.f23794f = i11;
    }

    @Override // com.google.android.gms.internal.clearcut.F
    protected final int D() {
        return this.f23793e;
    }

    @Override // com.google.android.gms.internal.clearcut.F, com.google.android.gms.internal.clearcut.AbstractC2179y
    public final int size() {
        return this.f23794f;
    }

    @Override // com.google.android.gms.internal.clearcut.F, com.google.android.gms.internal.clearcut.AbstractC2179y
    public final byte v(int i10) {
        int size = size();
        if (((size - (i10 + 1)) | i10) >= 0) {
            return this.f23805d[this.f23793e + i10];
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
        sb3.append(size);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }
}
