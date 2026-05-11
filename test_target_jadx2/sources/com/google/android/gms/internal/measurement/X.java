package com.google.android.gms.internal.measurement;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
final class X extends AbstractC2213d0 {

    /* renamed from: a, reason: collision with root package name */
    private String f24402a;

    /* renamed from: b, reason: collision with root package name */
    private byte f24403b;

    /* renamed from: c, reason: collision with root package name */
    private int f24404c;

    /* renamed from: d, reason: collision with root package name */
    private int f24405d;

    X() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2213d0
    public final AbstractC2213d0 a(boolean z10) {
        this.f24403b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2213d0
    public final AbstractC2231f0 b() {
        if (this.f24403b == 1 && this.f24402a != null && this.f24404c != 0 && this.f24405d != 0) {
            return new Y(this.f24402a, false, this.f24404c, null, null, this.f24405d, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f24402a == null) {
            sb2.append(" fileOwner");
        }
        if (this.f24403b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f24404c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f24405d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2213d0
    final AbstractC2213d0 c(int i10) {
        this.f24404c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2213d0
    public final AbstractC2213d0 d(int i10) {
        this.f24405d = 1;
        return this;
    }

    public final AbstractC2213d0 e(String str) {
        this.f24402a = BuildConfig.FLAVOR;
        return this;
    }
}
