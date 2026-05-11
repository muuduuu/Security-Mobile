package com.google.android.gms.internal.clearcut;

/* loaded from: classes2.dex */
final class J extends H {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f23833d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f23834e;

    /* renamed from: f, reason: collision with root package name */
    private int f23835f;

    /* renamed from: g, reason: collision with root package name */
    private int f23836g;

    /* renamed from: h, reason: collision with root package name */
    private int f23837h;

    /* renamed from: i, reason: collision with root package name */
    private int f23838i;

    /* renamed from: j, reason: collision with root package name */
    private int f23839j;

    private J(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.f23839j = Integer.MAX_VALUE;
        this.f23833d = bArr;
        this.f23835f = i11 + i10;
        this.f23837h = i10;
        this.f23838i = i10;
        this.f23834e = z10;
    }

    @Override // com.google.android.gms.internal.clearcut.H
    public final int c() {
        return this.f23837h - this.f23838i;
    }

    @Override // com.google.android.gms.internal.clearcut.H
    public final int d(int i10) {
        if (i10 < 0) {
            throw new C2127g0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int c10 = i10 + c();
        int i11 = this.f23839j;
        if (c10 > i11) {
            throw C2127g0.a();
        }
        this.f23839j = c10;
        int i12 = this.f23835f + this.f23836g;
        this.f23835f = i12;
        int i13 = i12 - this.f23838i;
        if (i13 > c10) {
            int i14 = i13 - c10;
            this.f23836g = i14;
            this.f23835f = i12 - i14;
        } else {
            this.f23836g = 0;
        }
        return i11;
    }
}
