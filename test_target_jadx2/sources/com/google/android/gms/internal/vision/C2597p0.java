package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2597p0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2614v0 f25179a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f25180b;

    private C2597p0(int i10) {
        byte[] bArr = new byte[i10];
        this.f25180b = bArr;
        this.f25179a = AbstractC2614v0.d(bArr);
    }

    public final AbstractC2570g0 a() {
        this.f25179a.J();
        return new C2602r0(this.f25180b);
    }

    public final AbstractC2614v0 b() {
        return this.f25179a;
    }

    /* synthetic */ C2597p0(int i10, C2567f0 c2567f0) {
        this(i10);
    }
}
