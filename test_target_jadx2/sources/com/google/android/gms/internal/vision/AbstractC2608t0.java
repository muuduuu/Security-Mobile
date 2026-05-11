package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2608t0 {

    /* renamed from: a, reason: collision with root package name */
    int f25184a;

    /* renamed from: b, reason: collision with root package name */
    private int f25185b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25186c;

    private AbstractC2608t0() {
        this.f25184a = 100;
        this.f25185b = Integer.MAX_VALUE;
        this.f25186c = false;
    }

    public static long a(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    static AbstractC2608t0 b(byte[] bArr, int i10, int i11, boolean z10) {
        C2611u0 c2611u0 = new C2611u0(bArr, i11);
        try {
            c2611u0.c(i11);
            return c2611u0;
        } catch (W0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int d(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract int c(int i10);

    public abstract int e();
}
