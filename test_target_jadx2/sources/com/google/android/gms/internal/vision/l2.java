package com.google.android.gms.internal.vision;

/* loaded from: classes2.dex */
abstract class l2 {
    l2() {
    }

    abstract int a(int i10, byte[] bArr, int i11, int i12);

    abstract int b(CharSequence charSequence, byte[] bArr, int i10, int i11);

    final boolean c(byte[] bArr, int i10, int i11) {
        return a(0, bArr, i10, i11) == 0;
    }

    abstract String d(byte[] bArr, int i10, int i11);
}
