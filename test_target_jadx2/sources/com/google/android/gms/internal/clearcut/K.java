package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class K extends AbstractC2176x {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f23842b = Logger.getLogger(K.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f23843c = AbstractC2125f1.x();

    /* renamed from: a, reason: collision with root package name */
    M f23844a;

    static class a extends K {

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f23845d;

        /* renamed from: e, reason: collision with root package name */
        private final int f23846e;

        /* renamed from: f, reason: collision with root package name */
        private final int f23847f;

        /* renamed from: g, reason: collision with root package name */
        private int f23848g;

        a(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f23845d = bArr;
            this.f23846e = i10;
            this.f23848g = i10;
            this.f23847f = i12;
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void D(int i10, int i11) {
            s0((i10 << 3) | i11);
        }

        public final int D0() {
            return this.f23848g - this.f23846e;
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void F(int i10, AbstractC2179y abstractC2179y) {
            D(1, 3);
            V(2, i10);
            k(3, abstractC2179y);
            D(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void G(int i10, B0 b02) {
            D(1, 3);
            V(2, i10);
            l(3, b02);
            D(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void H(int i10, boolean z10) {
            D(i10, 0);
            e(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void I(long j10) {
            if (K.f23843c && s() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f23845d;
                    int i10 = this.f23848g;
                    this.f23848g = i10 + 1;
                    AbstractC2125f1.k(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f23845d;
                int i11 = this.f23848g;
                this.f23848g = i11 + 1;
                AbstractC2125f1.k(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f23845d;
                    int i12 = this.f23848g;
                    this.f23848g = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23848g), Integer.valueOf(this.f23847f), 1), e10);
                }
            }
            byte[] bArr4 = this.f23845d;
            int i13 = this.f23848g;
            this.f23848g = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void J(B0 b02) {
            s0(b02.m());
            b02.o(this);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void Q(int i10, int i11) {
            D(i10, 0);
            r0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void R(int i10, long j10) {
            D(i10, 1);
            W(j10);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void V(int i10, int i11) {
            D(i10, 0);
            s0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void W(long j10) {
            try {
                byte[] bArr = this.f23845d;
                int i10 = this.f23848g;
                int i11 = i10 + 1;
                this.f23848g = i11;
                bArr[i10] = (byte) j10;
                int i12 = i10 + 2;
                this.f23848g = i12;
                bArr[i11] = (byte) (j10 >> 8);
                int i13 = i10 + 3;
                this.f23848g = i13;
                bArr[i12] = (byte) (j10 >> 16);
                int i14 = i10 + 4;
                this.f23848g = i14;
                bArr[i13] = (byte) (j10 >> 24);
                int i15 = i10 + 5;
                this.f23848g = i15;
                bArr[i14] = (byte) (j10 >> 32);
                int i16 = i10 + 6;
                this.f23848g = i16;
                bArr[i15] = (byte) (j10 >> 40);
                int i17 = i10 + 7;
                this.f23848g = i17;
                bArr[i16] = (byte) (j10 >> 48);
                this.f23848g = i10 + 8;
                bArr[i17] = (byte) (j10 >> 56);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23848g), Integer.valueOf(this.f23847f), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2176x
        public final void a(byte[] bArr, int i10, int i11) {
            c(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public void b() {
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void c(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f23845d, this.f23848g, i11);
                this.f23848g += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23848g), Integer.valueOf(this.f23847f), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void c0(int i10, int i11) {
            D(i10, 5);
            u0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void e(byte b10) {
            try {
                byte[] bArr = this.f23845d;
                int i10 = this.f23848g;
                this.f23848g = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23848g), Integer.valueOf(this.f23847f), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void g0(String str) {
            int i10 = this.f23848g;
            try {
                int x02 = K.x0(str.length() * 3);
                int x03 = K.x0(str.length());
                if (x03 != x02) {
                    s0(AbstractC2131h1.a(str));
                    this.f23848g = AbstractC2131h1.b(str, this.f23845d, this.f23848g, s());
                    return;
                }
                int i11 = i10 + x03;
                this.f23848g = i11;
                int b10 = AbstractC2131h1.b(str, this.f23845d, i11, s());
                this.f23848g = i10;
                s0((b10 - i10) - x03);
                this.f23848g = b10;
            } catch (C2140k1 e10) {
                this.f23848g = i10;
                q(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new c(e11);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void j(int i10, long j10) {
            D(i10, 0);
            I(j10);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void k(int i10, AbstractC2179y abstractC2179y) {
            D(i10, 2);
            o(abstractC2179y);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void l(int i10, B0 b02) {
            D(i10, 2);
            J(b02);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        final void m(int i10, B0 b02, R0 r02) {
            D(i10, 2);
            AbstractC2153p abstractC2153p = (AbstractC2153p) b02;
            int c10 = abstractC2153p.c();
            if (c10 == -1) {
                c10 = r02.g(abstractC2153p);
                abstractC2153p.b(c10);
            }
            s0(c10);
            r02.e(b02, this.f23844a);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void n(int i10, String str) {
            D(i10, 2);
            g0(str);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void o(AbstractC2179y abstractC2179y) {
            s0(abstractC2179y.size());
            abstractC2179y.j(this);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        final void p(B0 b02, R0 r02) {
            AbstractC2153p abstractC2153p = (AbstractC2153p) b02;
            int c10 = abstractC2153p.c();
            if (c10 == -1) {
                c10 = r02.g(abstractC2153p);
                abstractC2153p.b(c10);
            }
            s0(c10);
            r02.e(b02, this.f23844a);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void r0(int i10) {
            if (i10 >= 0) {
                s0(i10);
            } else {
                I(i10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final int s() {
            return this.f23847f - this.f23848g;
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void s0(int i10) {
            if (K.f23843c && s() >= 10) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f23845d;
                    int i11 = this.f23848g;
                    this.f23848g = i11 + 1;
                    AbstractC2125f1.k(bArr, i11, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f23845d;
                int i12 = this.f23848g;
                this.f23848g = i12 + 1;
                AbstractC2125f1.k(bArr2, i12, (byte) i10);
                return;
            }
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f23845d;
                    int i13 = this.f23848g;
                    this.f23848g = i13 + 1;
                    bArr3[i13] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23848g), Integer.valueOf(this.f23847f), 1), e10);
                }
            }
            byte[] bArr4 = this.f23845d;
            int i14 = this.f23848g;
            this.f23848g = i14 + 1;
            bArr4[i14] = (byte) i10;
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void u0(int i10) {
            try {
                byte[] bArr = this.f23845d;
                int i11 = this.f23848g;
                int i12 = i11 + 1;
                this.f23848g = i12;
                bArr[i11] = (byte) i10;
                int i13 = i11 + 2;
                this.f23848g = i13;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i11 + 3;
                this.f23848g = i14;
                bArr[i13] = (byte) (i10 >> 16);
                this.f23848g = i11 + 4;
                bArr[i14] = i10 >> 24;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23848g), Integer.valueOf(this.f23847f), 1), e10);
            }
        }
    }

    static final class b extends a {

        /* renamed from: h, reason: collision with root package name */
        private final ByteBuffer f23849h;

        /* renamed from: i, reason: collision with root package name */
        private int f23850i;

        b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f23849h = byteBuffer;
            this.f23850i = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.clearcut.K.a, com.google.android.gms.internal.clearcut.K
        public final void b() {
            this.f23849h.position(this.f23850i + D0());
        }
    }

    public static class c extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        c(String str) {
            super(r3.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "));
            String valueOf = String.valueOf(str);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        c(String str, Throwable th) {
            super(r3.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
            String valueOf = String.valueOf(str);
        }

        c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    static final class d extends K {

        /* renamed from: d, reason: collision with root package name */
        private final ByteBuffer f23851d;

        /* renamed from: e, reason: collision with root package name */
        private final ByteBuffer f23852e;

        /* renamed from: f, reason: collision with root package name */
        private final int f23853f;

        d(ByteBuffer byteBuffer) {
            super();
            this.f23851d = byteBuffer;
            this.f23852e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f23853f = byteBuffer.position();
        }

        private final void D0(String str) {
            try {
                AbstractC2131h1.c(str, this.f23852e);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void D(int i10, int i11) {
            s0((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void F(int i10, AbstractC2179y abstractC2179y) {
            D(1, 3);
            V(2, i10);
            k(3, abstractC2179y);
            D(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void G(int i10, B0 b02) {
            D(1, 3);
            V(2, i10);
            l(3, b02);
            D(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void H(int i10, boolean z10) {
            D(i10, 0);
            e(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void I(long j10) {
            while (((-128) & j10) != 0) {
                try {
                    this.f23852e.put((byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new c(e10);
                }
            }
            this.f23852e.put((byte) j10);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void J(B0 b02) {
            s0(b02.m());
            b02.o(this);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void Q(int i10, int i11) {
            D(i10, 0);
            r0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void R(int i10, long j10) {
            D(i10, 1);
            W(j10);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void V(int i10, int i11) {
            D(i10, 0);
            s0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void W(long j10) {
            try {
                this.f23852e.putLong(j10);
            } catch (BufferOverflowException e10) {
                throw new c(e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2176x
        public final void a(byte[] bArr, int i10, int i11) {
            c(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void b() {
            this.f23851d.position(this.f23852e.position());
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void c(byte[] bArr, int i10, int i11) {
            try {
                this.f23852e.put(bArr, i10, i11);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(e10);
            } catch (BufferOverflowException e11) {
                throw new c(e11);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void c0(int i10, int i11) {
            D(i10, 5);
            u0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void e(byte b10) {
            try {
                this.f23852e.put(b10);
            } catch (BufferOverflowException e10) {
                throw new c(e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void g0(String str) {
            int position = this.f23852e.position();
            try {
                int x02 = K.x0(str.length() * 3);
                int x03 = K.x0(str.length());
                if (x03 != x02) {
                    s0(AbstractC2131h1.a(str));
                    D0(str);
                    return;
                }
                int position2 = this.f23852e.position() + x03;
                this.f23852e.position(position2);
                D0(str);
                int position3 = this.f23852e.position();
                this.f23852e.position(position);
                s0(position3 - position2);
                this.f23852e.position(position3);
            } catch (C2140k1 e10) {
                this.f23852e.position(position);
                q(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new c(e11);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void j(int i10, long j10) {
            D(i10, 0);
            I(j10);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void k(int i10, AbstractC2179y abstractC2179y) {
            D(i10, 2);
            o(abstractC2179y);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void l(int i10, B0 b02) {
            D(i10, 2);
            J(b02);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        final void m(int i10, B0 b02, R0 r02) {
            D(i10, 2);
            p(b02, r02);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void n(int i10, String str) {
            D(i10, 2);
            g0(str);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void o(AbstractC2179y abstractC2179y) {
            s0(abstractC2179y.size());
            abstractC2179y.j(this);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        final void p(B0 b02, R0 r02) {
            AbstractC2153p abstractC2153p = (AbstractC2153p) b02;
            int c10 = abstractC2153p.c();
            if (c10 == -1) {
                c10 = r02.g(abstractC2153p);
                abstractC2153p.b(c10);
            }
            s0(c10);
            r02.e(b02, this.f23844a);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void r0(int i10) {
            if (i10 >= 0) {
                s0(i10);
            } else {
                I(i10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final int s() {
            return this.f23852e.remaining();
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void s0(int i10) {
            while ((i10 & (-128)) != 0) {
                try {
                    this.f23852e.put((byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new c(e10);
                }
            }
            this.f23852e.put((byte) i10);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void u0(int i10) {
            try {
                this.f23852e.putInt(i10);
            } catch (BufferOverflowException e10) {
                throw new c(e10);
            }
        }
    }

    static final class e extends K {

        /* renamed from: d, reason: collision with root package name */
        private final ByteBuffer f23854d;

        /* renamed from: e, reason: collision with root package name */
        private final ByteBuffer f23855e;

        /* renamed from: f, reason: collision with root package name */
        private final long f23856f;

        /* renamed from: g, reason: collision with root package name */
        private final long f23857g;

        /* renamed from: h, reason: collision with root package name */
        private final long f23858h;

        /* renamed from: i, reason: collision with root package name */
        private final long f23859i;

        /* renamed from: j, reason: collision with root package name */
        private long f23860j;

        e(ByteBuffer byteBuffer) {
            super();
            this.f23854d = byteBuffer;
            this.f23855e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long o10 = AbstractC2125f1.o(byteBuffer);
            this.f23856f = o10;
            long position = byteBuffer.position() + o10;
            this.f23857g = position;
            long limit = o10 + byteBuffer.limit();
            this.f23858h = limit;
            this.f23859i = limit - 10;
            this.f23860j = position;
        }

        private final void D0(long j10) {
            this.f23855e.position((int) (j10 - this.f23856f));
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void D(int i10, int i11) {
            s0((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void F(int i10, AbstractC2179y abstractC2179y) {
            D(1, 3);
            V(2, i10);
            k(3, abstractC2179y);
            D(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void G(int i10, B0 b02) {
            D(1, 3);
            V(2, i10);
            l(3, b02);
            D(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void H(int i10, boolean z10) {
            D(i10, 0);
            e(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void I(long j10) {
            if (this.f23860j <= this.f23859i) {
                while ((j10 & (-128)) != 0) {
                    long j11 = this.f23860j;
                    this.f23860j = j11 + 1;
                    AbstractC2125f1.c(j11, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                long j12 = this.f23860j;
                this.f23860j = 1 + j12;
                AbstractC2125f1.c(j12, (byte) j10);
                return;
            }
            while (true) {
                long j13 = this.f23860j;
                if (j13 >= this.f23858h) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f23860j), Long.valueOf(this.f23858h), 1));
                }
                if ((j10 & (-128)) == 0) {
                    this.f23860j = 1 + j13;
                    AbstractC2125f1.c(j13, (byte) j10);
                    return;
                } else {
                    this.f23860j = j13 + 1;
                    AbstractC2125f1.c(j13, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void J(B0 b02) {
            s0(b02.m());
            b02.o(this);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void Q(int i10, int i11) {
            D(i10, 0);
            r0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void R(int i10, long j10) {
            D(i10, 1);
            W(j10);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void V(int i10, int i11) {
            D(i10, 0);
            s0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void W(long j10) {
            this.f23855e.putLong((int) (this.f23860j - this.f23856f), j10);
            this.f23860j += 8;
        }

        @Override // com.google.android.gms.internal.clearcut.AbstractC2176x
        public final void a(byte[] bArr, int i10, int i11) {
            c(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void b() {
            this.f23854d.position((int) (this.f23860j - this.f23856f));
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void c(byte[] bArr, int i10, int i11) {
            if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
                long j10 = i11;
                long j11 = this.f23858h - j10;
                long j12 = this.f23860j;
                if (j11 >= j12) {
                    AbstractC2125f1.l(bArr, i10, j12, j10);
                    this.f23860j += j10;
                    return;
                }
            }
            if (bArr != null) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f23860j), Long.valueOf(this.f23858h), Integer.valueOf(i11)));
            }
            throw new NullPointerException("value");
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void c0(int i10, int i11) {
            D(i10, 5);
            u0(i11);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void e(byte b10) {
            long j10 = this.f23860j;
            if (j10 >= this.f23858h) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f23860j), Long.valueOf(this.f23858h), 1));
            }
            this.f23860j = 1 + j10;
            AbstractC2125f1.c(j10, b10);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void g0(String str) {
            long j10 = this.f23860j;
            try {
                int x02 = K.x0(str.length() * 3);
                int x03 = K.x0(str.length());
                if (x03 != x02) {
                    int a10 = AbstractC2131h1.a(str);
                    s0(a10);
                    D0(this.f23860j);
                    AbstractC2131h1.c(str, this.f23855e);
                    this.f23860j += a10;
                    return;
                }
                int i10 = ((int) (this.f23860j - this.f23856f)) + x03;
                this.f23855e.position(i10);
                AbstractC2131h1.c(str, this.f23855e);
                int position = this.f23855e.position() - i10;
                s0(position);
                this.f23860j += position;
            } catch (C2140k1 e10) {
                this.f23860j = j10;
                D0(j10);
                q(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new c(e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new c(e12);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void j(int i10, long j10) {
            D(i10, 0);
            I(j10);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void k(int i10, AbstractC2179y abstractC2179y) {
            D(i10, 2);
            o(abstractC2179y);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void l(int i10, B0 b02) {
            D(i10, 2);
            J(b02);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        final void m(int i10, B0 b02, R0 r02) {
            D(i10, 2);
            p(b02, r02);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void n(int i10, String str) {
            D(i10, 2);
            g0(str);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void o(AbstractC2179y abstractC2179y) {
            s0(abstractC2179y.size());
            abstractC2179y.j(this);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        final void p(B0 b02, R0 r02) {
            AbstractC2153p abstractC2153p = (AbstractC2153p) b02;
            int c10 = abstractC2153p.c();
            if (c10 == -1) {
                c10 = r02.g(abstractC2153p);
                abstractC2153p.b(c10);
            }
            s0(c10);
            r02.e(b02, this.f23844a);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void r0(int i10) {
            if (i10 >= 0) {
                s0(i10);
            } else {
                I(i10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final int s() {
            return (int) (this.f23858h - this.f23860j);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void s0(int i10) {
            long j10;
            if (this.f23860j <= this.f23859i) {
                while (true) {
                    int i11 = i10 & (-128);
                    j10 = this.f23860j;
                    if (i11 == 0) {
                        break;
                    }
                    this.f23860j = j10 + 1;
                    AbstractC2125f1.c(j10, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
            } else {
                while (true) {
                    j10 = this.f23860j;
                    if (j10 >= this.f23858h) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f23860j), Long.valueOf(this.f23858h), 1));
                    }
                    if ((i10 & (-128)) == 0) {
                        break;
                    }
                    this.f23860j = j10 + 1;
                    AbstractC2125f1.c(j10, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
            }
            this.f23860j = 1 + j10;
            AbstractC2125f1.c(j10, (byte) i10);
        }

        @Override // com.google.android.gms.internal.clearcut.K
        public final void u0(int i10) {
            this.f23855e.putInt((int) (this.f23860j - this.f23856f), i10);
            this.f23860j += 4;
        }
    }

    private K() {
    }

    public static int A(AbstractC2179y abstractC2179y) {
        int size = abstractC2179y.size();
        return x0(size) + size;
    }

    public static int A0(int i10) {
        return 4;
    }

    static int B(B0 b02, R0 r02) {
        AbstractC2153p abstractC2153p = (AbstractC2153p) b02;
        int c10 = abstractC2153p.c();
        if (c10 == -1) {
            c10 = r02.g(abstractC2153p);
            abstractC2153p.b(c10);
        }
        return x0(c10) + c10;
    }

    public static int B0(int i10) {
        return w0(i10);
    }

    public static int C(boolean z10) {
        return 1;
    }

    private static int C0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static int K(int i10, AbstractC2179y abstractC2179y) {
        int v02 = v0(i10);
        int size = abstractC2179y.size();
        return v02 + x0(size) + size;
    }

    public static int L(int i10, B0 b02) {
        return v0(i10) + O(b02);
    }

    static int M(int i10, B0 b02, R0 r02) {
        int v02 = v0(i10) << 1;
        AbstractC2153p abstractC2153p = (AbstractC2153p) b02;
        int c10 = abstractC2153p.c();
        if (c10 == -1) {
            c10 = r02.g(abstractC2153p);
            abstractC2153p.b(c10);
        }
        return v02 + c10;
    }

    public static int N(int i10, boolean z10) {
        return v0(i10) + 1;
    }

    public static int O(B0 b02) {
        int m10 = b02.m();
        return x0(m10) + m10;
    }

    public static K P(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int T(int i10, long j10) {
        return v0(i10) + b0(j10);
    }

    public static int U(int i10, AbstractC2179y abstractC2179y) {
        return (v0(1) << 1) + h0(2, i10) + K(3, abstractC2179y);
    }

    public static int X(int i10, long j10) {
        return v0(i10) + b0(j10);
    }

    public static int Y(long j10) {
        return b0(j10);
    }

    public static int a0(int i10, long j10) {
        return v0(i10) + b0(o0(j10));
    }

    public static int b0(long j10) {
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

    public static K d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return AbstractC2125f1.y() ? new e(byteBuffer) : new d(byteBuffer);
    }

    public static int d0(int i10, int i11) {
        return v0(i10) + w0(i11);
    }

    public static int e0(int i10, long j10) {
        return v0(i10) + 8;
    }

    public static int f0(long j10) {
        return b0(o0(j10));
    }

    public static int h0(int i10, int i11) {
        return v0(i10) + x0(i11);
    }

    public static int i0(int i10, long j10) {
        return v0(i10) + 8;
    }

    public static int j0(long j10) {
        return 8;
    }

    public static int k0(String str) {
        int length;
        try {
            length = AbstractC2131h1.a(str);
        } catch (C2140k1 unused) {
            length = str.getBytes(AbstractC2115c0.f24018a).length;
        }
        return x0(length) + length;
    }

    public static int l0(int i10, int i11) {
        return v0(i10) + x0(C0(i11));
    }

    public static int m0(long j10) {
        return 8;
    }

    public static int n0(int i10, int i11) {
        return v0(i10) + 4;
    }

    private static long o0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int p0(int i10, int i11) {
        return v0(i10) + 4;
    }

    public static int q0(int i10, int i11) {
        return v0(i10) + w0(i11);
    }

    public static int u(double d10) {
        return 8;
    }

    public static int v(float f10) {
        return 4;
    }

    public static int v0(int i10) {
        return x0(i10 << 3);
    }

    public static int w(int i10, double d10) {
        return v0(i10) + 8;
    }

    public static int w0(int i10) {
        if (i10 >= 0) {
            return x0(i10);
        }
        return 10;
    }

    public static int x(int i10, float f10) {
        return v0(i10) + 4;
    }

    public static int x0(int i10) {
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

    static int y(int i10, B0 b02, R0 r02) {
        return v0(i10) + B(b02, r02);
    }

    public static int y0(int i10) {
        return x0(C0(i10));
    }

    public static int z(int i10, String str) {
        return v0(i10) + k0(str);
    }

    public static int z0(int i10) {
        return 4;
    }

    public abstract void D(int i10, int i11);

    public final void E(int i10, long j10) {
        j(i10, o0(j10));
    }

    public abstract void F(int i10, AbstractC2179y abstractC2179y);

    public abstract void G(int i10, B0 b02);

    public abstract void H(int i10, boolean z10);

    public abstract void I(long j10);

    public abstract void J(B0 b02);

    public abstract void Q(int i10, int i11);

    public abstract void R(int i10, long j10);

    public final void S(long j10) {
        I(o0(j10));
    }

    public abstract void V(int i10, int i11);

    public abstract void W(long j10);

    public final void Z(int i10, int i11) {
        V(i10, C0(i11));
    }

    public abstract void b();

    public abstract void c(byte[] bArr, int i10, int i11);

    public abstract void c0(int i10, int i11);

    public abstract void e(byte b10);

    public final void f(double d10) {
        W(Double.doubleToRawLongBits(d10));
    }

    public final void g(float f10) {
        u0(Float.floatToRawIntBits(f10));
    }

    public abstract void g0(String str);

    public final void h(int i10, double d10) {
        R(i10, Double.doubleToRawLongBits(d10));
    }

    public final void i(int i10, float f10) {
        c0(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void j(int i10, long j10);

    public abstract void k(int i10, AbstractC2179y abstractC2179y);

    public abstract void l(int i10, B0 b02);

    abstract void m(int i10, B0 b02, R0 r02);

    public abstract void n(int i10, String str);

    public abstract void o(AbstractC2179y abstractC2179y);

    abstract void p(B0 b02, R0 r02);

    final void q(String str, C2140k1 c2140k1) {
        f23842b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c2140k1);
        byte[] bytes = str.getBytes(AbstractC2115c0.f24018a);
        try {
            s0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (c e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new c(e11);
        }
    }

    public final void r(boolean z10) {
        e(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void r0(int i10);

    public abstract int s();

    public abstract void s0(int i10);

    public final void t0(int i10) {
        s0(C0(i10));
    }

    public abstract void u0(int i10);
}
