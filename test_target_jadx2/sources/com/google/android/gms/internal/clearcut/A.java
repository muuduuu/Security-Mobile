package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class A implements C {
    private A() {
    }

    @Override // com.google.android.gms.internal.clearcut.C
    public final byte[] a(byte[] bArr, int i10, int i11) {
        return Arrays.copyOfRange(bArr, i10, i11 + i10);
    }

    /* synthetic */ A(C2182z c2182z) {
        this();
    }
}
