package com.google.android.gms.internal.clearcut;

/* loaded from: classes2.dex */
final class D {

    /* renamed from: a, reason: collision with root package name */
    private final K f23803a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f23804b;

    private D(int i10) {
        byte[] bArr = new byte[i10];
        this.f23804b = bArr;
        this.f23803a = K.P(bArr);
    }

    public final AbstractC2179y a() {
        if (this.f23803a.s() == 0) {
            return new F(this.f23804b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final K b() {
        return this.f23803a;
    }

    /* synthetic */ D(int i10, C2182z c2182z) {
        this(i10);
    }
}
