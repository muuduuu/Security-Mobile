package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
final class G0 extends I0 {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f24757b;

    /* renamed from: c, reason: collision with root package name */
    private int f24758c;

    /* renamed from: d, reason: collision with root package name */
    private int f24759d;

    /* renamed from: e, reason: collision with root package name */
    private int f24760e;

    /* synthetic */ G0(byte[] bArr, int i10, int i11, boolean z10, F0 f02) {
        super(null);
        this.f24760e = Integer.MAX_VALUE;
        this.f24757b = bArr;
        this.f24758c = 0;
    }

    public final int c(int i10) {
        int i11 = this.f24760e;
        this.f24760e = 0;
        int i12 = this.f24758c + this.f24759d;
        this.f24758c = i12;
        if (i12 > 0) {
            this.f24759d = i12;
            this.f24758c = 0;
        } else {
            this.f24759d = 0;
        }
        return i11;
    }
}
