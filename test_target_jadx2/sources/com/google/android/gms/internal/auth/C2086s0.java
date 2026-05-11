package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2086s0 extends AbstractC2092u0 {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f23765b;

    /* renamed from: c, reason: collision with root package name */
    private int f23766c;

    /* renamed from: d, reason: collision with root package name */
    private int f23767d;

    /* renamed from: e, reason: collision with root package name */
    private int f23768e;

    /* synthetic */ C2086s0(byte[] bArr, int i10, int i11, boolean z10, AbstractC2083r0 abstractC2083r0) {
        super(null);
        this.f23768e = Integer.MAX_VALUE;
        this.f23765b = bArr;
        this.f23766c = 0;
    }

    public final int c(int i10) {
        int i11 = this.f23768e;
        this.f23768e = 0;
        int i12 = this.f23766c + this.f23767d;
        this.f23766c = i12;
        if (i12 > 0) {
            this.f23767d = i12;
            this.f23766c = 0;
        } else {
            this.f23767d = 0;
        }
        return i11;
    }
}
