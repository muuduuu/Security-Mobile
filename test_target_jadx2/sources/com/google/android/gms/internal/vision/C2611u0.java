package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2611u0 extends AbstractC2608t0 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f25187d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25188e;

    /* renamed from: f, reason: collision with root package name */
    private int f25189f;

    /* renamed from: g, reason: collision with root package name */
    private int f25190g;

    /* renamed from: h, reason: collision with root package name */
    private int f25191h;

    /* renamed from: i, reason: collision with root package name */
    private int f25192i;

    /* renamed from: j, reason: collision with root package name */
    private int f25193j;

    private C2611u0(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.f25193j = Integer.MAX_VALUE;
        this.f25187d = bArr;
        this.f25189f = i11 + i10;
        this.f25191h = i10;
        this.f25192i = i10;
        this.f25188e = z10;
    }

    private final void f() {
        int i10 = this.f25189f + this.f25190g;
        this.f25189f = i10;
        int i11 = i10 - this.f25192i;
        int i12 = this.f25193j;
        if (i11 <= i12) {
            this.f25190g = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f25190g = i13;
        this.f25189f = i10 - i13;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2608t0
    public final int c(int i10) {
        if (i10 < 0) {
            throw W0.b();
        }
        int e10 = i10 + e();
        int i11 = this.f25193j;
        if (e10 > i11) {
            throw W0.a();
        }
        this.f25193j = e10;
        f();
        return i11;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2608t0
    public final int e() {
        return this.f25191h - this.f25192i;
    }
}
