package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.vision.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2614v0 extends AbstractC2559d0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f25194b = Logger.getLogger(AbstractC2614v0.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f25195c = h2.m();

    /* renamed from: a, reason: collision with root package name */
    C2620x0 f25196a;

    /* renamed from: com.google.android.gms.internal.vision.v0$a */
    private static class a extends AbstractC2614v0 {

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f25197d;

        /* renamed from: e, reason: collision with root package name */
        private final int f25198e;

        /* renamed from: f, reason: collision with root package name */
        private final int f25199f;

        /* renamed from: g, reason: collision with root package name */
        private int f25200g;

        a(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i11) | i11) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)));
            }
            this.f25197d = bArr;
            this.f25198e = 0;
            this.f25200g = 0;
            this.f25199f = i11;
        }

        private final void B0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f25197d, this.f25200g, i11);
                this.f25200g += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25200g), Integer.valueOf(this.f25199f), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void K(int i10) {
            if (!AbstractC2614v0.f25195c || Z.b() || b() < 5) {
                while ((i10 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f25197d;
                        int i11 = this.f25200g;
                        this.f25200g = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25200g), Integer.valueOf(this.f25199f), 1), e10);
                    }
                }
                byte[] bArr2 = this.f25197d;
                int i12 = this.f25200g;
                this.f25200g = i12 + 1;
                bArr2[i12] = (byte) i10;
                return;
            }
            if ((i10 & (-128)) == 0) {
                byte[] bArr3 = this.f25197d;
                int i13 = this.f25200g;
                this.f25200g = i13 + 1;
                h2.l(bArr3, i13, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f25197d;
            int i14 = this.f25200g;
            this.f25200g = i14 + 1;
            h2.l(bArr4, i14, (byte) (i10 | 128));
            int i15 = i10 >>> 7;
            if ((i15 & (-128)) == 0) {
                byte[] bArr5 = this.f25197d;
                int i16 = this.f25200g;
                this.f25200g = i16 + 1;
                h2.l(bArr5, i16, (byte) i15);
                return;
            }
            byte[] bArr6 = this.f25197d;
            int i17 = this.f25200g;
            this.f25200g = i17 + 1;
            h2.l(bArr6, i17, (byte) (i15 | 128));
            int i18 = i10 >>> 14;
            if ((i18 & (-128)) == 0) {
                byte[] bArr7 = this.f25197d;
                int i19 = this.f25200g;
                this.f25200g = i19 + 1;
                h2.l(bArr7, i19, (byte) i18);
                return;
            }
            byte[] bArr8 = this.f25197d;
            int i20 = this.f25200g;
            this.f25200g = i20 + 1;
            h2.l(bArr8, i20, (byte) (i18 | 128));
            int i21 = i10 >>> 21;
            if ((i21 & (-128)) == 0) {
                byte[] bArr9 = this.f25197d;
                int i22 = this.f25200g;
                this.f25200g = i22 + 1;
                h2.l(bArr9, i22, (byte) i21);
                return;
            }
            byte[] bArr10 = this.f25197d;
            int i23 = this.f25200g;
            this.f25200g = i23 + 1;
            h2.l(bArr10, i23, (byte) (i21 | 128));
            byte[] bArr11 = this.f25197d;
            int i24 = this.f25200g;
            this.f25200g = i24 + 1;
            h2.l(bArr11, i24, (byte) (i10 >>> 28));
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void L(int i10, int i11) {
            k(i10, 0);
            h(i11);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void N(int i10, AbstractC2570g0 abstractC2570g0) {
            k(1, 3);
            T(2, i10);
            m(3, abstractC2570g0);
            k(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void T(int i10, int i11) {
            k(i10, 0);
            K(i11);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void U(int i10, long j10) {
            k(i10, 1);
            V(j10);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void V(long j10) {
            try {
                byte[] bArr = this.f25197d;
                int i10 = this.f25200g;
                int i11 = i10 + 1;
                this.f25200g = i11;
                bArr[i10] = (byte) j10;
                int i12 = i10 + 2;
                this.f25200g = i12;
                bArr[i11] = (byte) (j10 >> 8);
                int i13 = i10 + 3;
                this.f25200g = i13;
                bArr[i12] = (byte) (j10 >> 16);
                int i14 = i10 + 4;
                this.f25200g = i14;
                bArr[i13] = (byte) (j10 >> 24);
                int i15 = i10 + 5;
                this.f25200g = i15;
                bArr[i14] = (byte) (j10 >> 32);
                int i16 = i10 + 6;
                this.f25200g = i16;
                bArr[i15] = (byte) (j10 >> 40);
                int i17 = i10 + 7;
                this.f25200g = i17;
                bArr[i16] = (byte) (j10 >> 48);
                this.f25200g = i10 + 8;
                bArr[i17] = (byte) (j10 >> 56);
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25200g), Integer.valueOf(this.f25199f), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2559d0
        public final void a(byte[] bArr, int i10, int i11) {
            B0(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void a0(int i10) {
            try {
                byte[] bArr = this.f25197d;
                int i11 = this.f25200g;
                int i12 = i11 + 1;
                this.f25200g = i12;
                bArr[i11] = (byte) i10;
                int i13 = i11 + 2;
                this.f25200g = i13;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i11 + 3;
                this.f25200g = i14;
                bArr[i13] = (byte) (i10 >> 16);
                this.f25200g = i11 + 4;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25200g), Integer.valueOf(this.f25199f), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final int b() {
            return this.f25199f - this.f25200g;
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void e(byte b10) {
            try {
                byte[] bArr = this.f25197d;
                int i10 = this.f25200g;
                this.f25200g = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25200g), Integer.valueOf(this.f25199f), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void f0(int i10, int i11) {
            k(i10, 5);
            a0(i11);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void h(int i10) {
            if (i10 >= 0) {
                K(i10);
            } else {
                r(i10);
            }
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void k(int i10, int i11) {
            K((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void l(int i10, long j10) {
            k(i10, 0);
            r(j10);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void m(int i10, AbstractC2570g0 abstractC2570g0) {
            k(i10, 2);
            s(abstractC2570g0);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void n(int i10, InterfaceC2609t1 interfaceC2609t1) {
            k(1, 3);
            T(2, i10);
            k(3, 2);
            t(interfaceC2609t1);
            k(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        final void o(int i10, InterfaceC2609t1 interfaceC2609t1, K1 k12) {
            k(i10, 2);
            X x10 = (X) interfaceC2609t1;
            int f10 = x10.f();
            if (f10 == -1) {
                f10 = k12.e(x10);
                x10.d(f10);
            }
            K(f10);
            k12.c(interfaceC2609t1, this.f25196a);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void p(int i10, String str) {
            k(i10, 2);
            u(str);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void q(int i10, boolean z10) {
            k(i10, 0);
            e(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void r(long j10) {
            if (AbstractC2614v0.f25195c && b() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f25197d;
                    int i10 = this.f25200g;
                    this.f25200g = i10 + 1;
                    h2.l(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f25197d;
                int i11 = this.f25200g;
                this.f25200g = i11 + 1;
                h2.l(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f25197d;
                    int i12 = this.f25200g;
                    this.f25200g = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25200g), Integer.valueOf(this.f25199f), 1), e10);
                }
            }
            byte[] bArr4 = this.f25197d;
            int i13 = this.f25200g;
            this.f25200g = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void s(AbstractC2570g0 abstractC2570g0) {
            K(abstractC2570g0.e());
            abstractC2570g0.u(this);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void t(InterfaceC2609t1 interfaceC2609t1) {
            K(interfaceC2609t1.A());
            interfaceC2609t1.a(this);
        }

        @Override // com.google.android.gms.internal.vision.AbstractC2614v0
        public final void u(String str) {
            int i10 = this.f25200g;
            try {
                int k02 = AbstractC2614v0.k0(str.length() * 3);
                int k03 = AbstractC2614v0.k0(str.length());
                if (k03 != k02) {
                    K(k2.d(str));
                    this.f25200g = k2.e(str, this.f25197d, this.f25200g, b());
                    return;
                }
                int i11 = i10 + k03;
                this.f25200g = i11;
                int e10 = k2.e(str, this.f25197d, i11, b());
                this.f25200g = i10;
                K((e10 - i10) - k03);
                this.f25200g = e10;
            } catch (n2 e11) {
                this.f25200g = i10;
                v(str, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new b(e12);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.v0$b */
    public static class b extends IOException {
        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        b(String str, Throwable th) {
            super(r3.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
            String valueOf = String.valueOf(str);
        }
    }

    private AbstractC2614v0() {
    }

    public static int A(int i10, float f10) {
        return k0(i10 << 3) + 4;
    }

    private static int A0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    static int B(int i10, InterfaceC2609t1 interfaceC2609t1, K1 k12) {
        return k0(i10 << 3) + c(interfaceC2609t1, k12);
    }

    public static int C(int i10, String str) {
        return k0(i10 << 3) + G(str);
    }

    public static int D(int i10, boolean z10) {
        return k0(i10 << 3) + 1;
    }

    public static int E(AbstractC2570g0 abstractC2570g0) {
        int e10 = abstractC2570g0.e();
        return k0(e10) + e10;
    }

    public static int F(InterfaceC2609t1 interfaceC2609t1) {
        int A10 = interfaceC2609t1.A();
        return k0(A10) + A10;
    }

    public static int G(String str) {
        int length;
        try {
            length = k2.d(str);
        } catch (n2 unused) {
            length = str.getBytes(R0.f25076a).length;
        }
        return k0(length) + length;
    }

    public static int H(boolean z10) {
        return 1;
    }

    public static int I(byte[] bArr) {
        int length = bArr.length;
        return k0(length) + length;
    }

    public static int P(int i10, AbstractC2570g0 abstractC2570g0) {
        int k02 = k0(i10 << 3);
        int e10 = abstractC2570g0.e();
        return k02 + k0(e10) + e10;
    }

    static int Q(int i10, InterfaceC2609t1 interfaceC2609t1, K1 k12) {
        int k02 = k0(i10 << 3) << 1;
        X x10 = (X) interfaceC2609t1;
        int f10 = x10.f();
        if (f10 == -1) {
            f10 = k12.e(x10);
            x10.d(f10);
        }
        return k02 + f10;
    }

    public static int R(InterfaceC2609t1 interfaceC2609t1) {
        return interfaceC2609t1.A();
    }

    public static int X(int i10, long j10) {
        return k0(i10 << 3) + e0(j10);
    }

    public static int Y(int i10, AbstractC2570g0 abstractC2570g0) {
        return (k0(8) << 1) + l0(2, i10) + P(3, abstractC2570g0);
    }

    public static int Z(long j10) {
        return e0(j10);
    }

    static int c(InterfaceC2609t1 interfaceC2609t1, K1 k12) {
        X x10 = (X) interfaceC2609t1;
        int f10 = x10.f();
        if (f10 == -1) {
            f10 = k12.e(x10);
            x10.d(f10);
        }
        return k0(f10) + f10;
    }

    public static int c0(int i10) {
        return k0(i10 << 3);
    }

    public static AbstractC2614v0 d(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int d0(int i10, long j10) {
        return k0(i10 << 3) + e0(j10);
    }

    public static int e0(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int g0(int i10) {
        if (i10 >= 0) {
            return k0(i10);
        }
        return 10;
    }

    public static int h0(int i10, int i11) {
        return k0(i10 << 3) + g0(i11);
    }

    public static int i0(int i10, long j10) {
        return k0(i10 << 3) + e0(u0(j10));
    }

    public static int j0(long j10) {
        return e0(u0(j10));
    }

    public static int k0(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int l0(int i10, int i11) {
        return k0(i10 << 3) + k0(i11);
    }

    public static int m0(int i10, long j10) {
        return k0(i10 << 3) + 8;
    }

    public static int n0(long j10) {
        return 8;
    }

    public static int o0(int i10) {
        return k0(A0(i10));
    }

    public static int p0(int i10, int i11) {
        return k0(i10 << 3) + k0(A0(i11));
    }

    public static int q0(int i10, long j10) {
        return k0(i10 << 3) + 8;
    }

    public static int r0(long j10) {
        return 8;
    }

    public static int s0(int i10) {
        return 4;
    }

    public static int t0(int i10, int i11) {
        return k0(i10 << 3) + 4;
    }

    private static long u0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int v0(int i10) {
        return 4;
    }

    public static int w0(int i10, int i11) {
        return k0(i10 << 3) + 4;
    }

    public static int x(double d10) {
        return 8;
    }

    public static int x0(int i10) {
        return g0(i10);
    }

    public static int y(float f10) {
        return 4;
    }

    public static int y0(int i10, int i11) {
        return k0(i10 << 3) + g0(i11);
    }

    public static int z(int i10, double d10) {
        return k0(i10 << 3) + 8;
    }

    public static int z0(int i10) {
        return k0(i10);
    }

    public final void J() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void K(int i10);

    public abstract void L(int i10, int i11);

    public final void M(int i10, long j10) {
        l(i10, u0(j10));
    }

    public abstract void N(int i10, AbstractC2570g0 abstractC2570g0);

    public final void O(long j10) {
        r(u0(j10));
    }

    public final void S(int i10) {
        K(A0(i10));
    }

    public abstract void T(int i10, int i11);

    public abstract void U(int i10, long j10);

    public abstract void V(long j10);

    public abstract void a0(int i10);

    public abstract int b();

    public final void b0(int i10, int i11) {
        T(i10, A0(i11));
    }

    public abstract void e(byte b10);

    public final void f(double d10) {
        V(Double.doubleToRawLongBits(d10));
    }

    public abstract void f0(int i10, int i11);

    public final void g(float f10) {
        a0(Float.floatToRawIntBits(f10));
    }

    public abstract void h(int i10);

    public final void i(int i10, double d10) {
        U(i10, Double.doubleToRawLongBits(d10));
    }

    public final void j(int i10, float f10) {
        f0(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void k(int i10, int i11);

    public abstract void l(int i10, long j10);

    public abstract void m(int i10, AbstractC2570g0 abstractC2570g0);

    public abstract void n(int i10, InterfaceC2609t1 interfaceC2609t1);

    abstract void o(int i10, InterfaceC2609t1 interfaceC2609t1, K1 k12);

    public abstract void p(int i10, String str);

    public abstract void q(int i10, boolean z10);

    public abstract void r(long j10);

    public abstract void s(AbstractC2570g0 abstractC2570g0);

    public abstract void t(InterfaceC2609t1 interfaceC2609t1);

    public abstract void u(String str);

    final void v(String str, n2 n2Var) {
        f25194b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) n2Var);
        byte[] bytes = str.getBytes(R0.f25076a);
        try {
            K(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (b e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new b(e11);
        }
    }

    public final void w(boolean z10) {
        e(z10 ? (byte) 1 : (byte) 0);
    }
}
