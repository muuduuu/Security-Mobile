package com.google.android.gms.common;

/* loaded from: classes2.dex */
final class T {

    /* renamed from: a, reason: collision with root package name */
    private String f23321a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f23322b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f23323c = null;

    /* synthetic */ T(byte[] bArr) {
    }

    final T a(String str) {
        this.f23321a = str;
        return this;
    }

    final T b(boolean z10) {
        this.f23322b = Boolean.valueOf(z10);
        return this;
    }

    final T c(boolean z10) {
        this.f23323c = Boolean.valueOf(z10);
        return this;
    }

    final U d() {
        Boolean bool = this.f23322b;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.f23323c != null) {
            return new U(this.f23321a, bool.booleanValue(), false, false, this.f23323c.booleanValue(), false, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }
}
