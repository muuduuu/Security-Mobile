package com.google.android.gms.common;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class H extends G {

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f23287g;

    H(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f23287g = bArr;
    }

    @Override // com.google.android.gms.common.G
    final byte[] l1() {
        return this.f23287g;
    }
}
