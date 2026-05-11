package com.google.android.gms.internal.clearcut;

/* loaded from: classes2.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    private int f23830a;

    /* renamed from: b, reason: collision with root package name */
    private int f23831b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23832c;

    private H() {
        this.f23830a = 100;
        this.f23831b = Integer.MAX_VALUE;
        this.f23832c = false;
    }

    public static long a(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    static H b(byte[] bArr, int i10, int i11, boolean z10) {
        J j10 = new J(bArr, 0, i11, false);
        try {
            j10.d(i11);
            return j10;
        } catch (C2127g0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int e(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract int c();

    public abstract int d(int i10);
}
