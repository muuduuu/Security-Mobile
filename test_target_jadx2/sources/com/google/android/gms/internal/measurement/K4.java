package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class K4 extends L4 {

    /* renamed from: b, reason: collision with root package name */
    private int f24252b;

    /* renamed from: c, reason: collision with root package name */
    private int f24253c;

    /* renamed from: d, reason: collision with root package name */
    private int f24254d;

    /* synthetic */ K4(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.f24254d = Integer.MAX_VALUE;
        this.f24252b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f24254d;
        this.f24254d = 0;
        int i12 = this.f24252b + this.f24253c;
        this.f24252b = i12;
        if (i12 > 0) {
            this.f24253c = i12;
            this.f24252b = 0;
        } else {
            this.f24253c = 0;
        }
        return i11;
    }
}
