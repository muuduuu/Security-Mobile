package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class E4 extends I4 {

    /* renamed from: d, reason: collision with root package name */
    private final int f24211d;

    E4(byte[] bArr, int i10, int i11) {
        super(bArr);
        J4.u(0, i11, bArr.length);
        this.f24211d = i11;
    }

    @Override // com.google.android.gms.internal.measurement.I4, com.google.android.gms.internal.measurement.J4
    public final byte c(int i10) {
        int i11 = this.f24211d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f24240c[i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 11);
            sb2.append("Index < 0: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length());
        sb3.append("Index > length: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.I4, com.google.android.gms.internal.measurement.J4
    final byte e(int i10) {
        return this.f24240c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.I4, com.google.android.gms.internal.measurement.J4
    public final int h() {
        return this.f24211d;
    }

    @Override // com.google.android.gms.internal.measurement.I4
    protected final int v() {
        return 0;
    }
}
