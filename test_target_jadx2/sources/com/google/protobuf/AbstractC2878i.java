package com.google.protobuf;

/* renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2878i {

    /* renamed from: d, reason: collision with root package name */
    private static volatile int f28740d = 100;

    /* renamed from: a, reason: collision with root package name */
    int f28741a;

    /* renamed from: b, reason: collision with root package name */
    int f28742b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28743c;

    /* renamed from: com.google.protobuf.i$b */
    private static final class b extends AbstractC2878i {

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f28744e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f28745f;

        /* renamed from: g, reason: collision with root package name */
        private int f28746g;

        /* renamed from: h, reason: collision with root package name */
        private int f28747h;

        /* renamed from: i, reason: collision with root package name */
        private int f28748i;

        /* renamed from: j, reason: collision with root package name */
        private int f28749j;

        /* renamed from: k, reason: collision with root package name */
        private int f28750k;

        private void h() {
            int i10 = this.f28746g + this.f28747h;
            this.f28746g = i10;
            int i11 = i10 - this.f28749j;
            int i12 = this.f28750k;
            if (i11 <= i12) {
                this.f28747h = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f28747h = i13;
            this.f28746g = i10 - i13;
        }

        public int f() {
            return this.f28748i - this.f28749j;
        }

        public int g(int i10) {
            if (i10 < 0) {
                throw C2894z.e();
            }
            int f10 = i10 + f();
            if (f10 < 0) {
                throw C2894z.f();
            }
            int i11 = this.f28750k;
            if (f10 > i11) {
                throw C2894z.h();
            }
            this.f28750k = f10;
            h();
            return i11;
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f28750k = Integer.MAX_VALUE;
            this.f28744e = bArr;
            this.f28746g = i11 + i10;
            this.f28748i = i10;
            this.f28749j = i10;
            this.f28745f = z10;
        }
    }

    public static int a(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long b(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC2878i c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public static AbstractC2878i d(byte[] bArr, int i10, int i11) {
        return e(bArr, i10, i11, false);
    }

    static AbstractC2878i e(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.g(i11);
            return bVar;
        } catch (C2894z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private AbstractC2878i() {
        this.f28741a = f28740d;
        this.f28742b = Integer.MAX_VALUE;
        this.f28743c = false;
    }
}
