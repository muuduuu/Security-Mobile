package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.conscrypt.BuildConfig;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1541h {

    /* renamed from: f, reason: collision with root package name */
    private static volatile int f16357f = 100;

    /* renamed from: a, reason: collision with root package name */
    int f16358a;

    /* renamed from: b, reason: collision with root package name */
    int f16359b;

    /* renamed from: c, reason: collision with root package name */
    int f16360c;

    /* renamed from: d, reason: collision with root package name */
    C1542i f16361d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16362e;

    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    private static final class b extends AbstractC1541h {

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f16363g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f16364h;

        /* renamed from: i, reason: collision with root package name */
        private int f16365i;

        /* renamed from: j, reason: collision with root package name */
        private int f16366j;

        /* renamed from: k, reason: collision with root package name */
        private int f16367k;

        /* renamed from: l, reason: collision with root package name */
        private int f16368l;

        /* renamed from: m, reason: collision with root package name */
        private int f16369m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f16370n;

        /* renamed from: o, reason: collision with root package name */
        private int f16371o;

        private void O() {
            int i10 = this.f16365i + this.f16366j;
            this.f16365i = i10;
            int i11 = i10 - this.f16368l;
            int i12 = this.f16371o;
            if (i11 <= i12) {
                this.f16366j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f16366j = i13;
            this.f16365i = i10 - i13;
        }

        private void Q() {
            if (this.f16365i - this.f16367k >= 10) {
                R();
            } else {
                S();
            }
        }

        private void R() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f16363g;
                int i11 = this.f16367k;
                this.f16367k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C1558z.f();
        }

        private void S() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw C1558z.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public String A() {
            int L10 = L();
            if (L10 > 0) {
                int i10 = this.f16365i;
                int i11 = this.f16367k;
                if (L10 <= i10 - i11) {
                    String str = new String(this.f16363g, i11, L10, AbstractC1557y.f16477b);
                    this.f16367k += L10;
                    return str;
                }
            }
            if (L10 == 0) {
                return BuildConfig.FLAVOR;
            }
            if (L10 < 0) {
                throw C1558z.g();
            }
            throw C1558z.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public String B() {
            int L10 = L();
            if (L10 > 0) {
                int i10 = this.f16365i;
                int i11 = this.f16367k;
                if (L10 <= i10 - i11) {
                    String a10 = q0.a(this.f16363g, i11, L10);
                    this.f16367k += L10;
                    return a10;
                }
            }
            if (L10 == 0) {
                return BuildConfig.FLAVOR;
            }
            if (L10 <= 0) {
                throw C1558z.g();
            }
            throw C1558z.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int C() {
            if (f()) {
                this.f16369m = 0;
                return 0;
            }
            int L10 = L();
            this.f16369m = L10;
            if (r0.a(L10) != 0) {
                return this.f16369m;
            }
            throw C1558z.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int D() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public long E() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public boolean F(int i10) {
            int b10 = r0.b(i10);
            if (b10 == 0) {
                Q();
                return true;
            }
            if (b10 == 1) {
                P(8);
                return true;
            }
            if (b10 == 2) {
                P(L());
                return true;
            }
            if (b10 == 3) {
                G();
                a(r0.c(r0.a(i10), 4));
                return true;
            }
            if (b10 == 4) {
                return false;
            }
            if (b10 != 5) {
                throw C1558z.e();
            }
            P(4);
            return true;
        }

        public byte H() {
            int i10 = this.f16367k;
            if (i10 == this.f16365i) {
                throw C1558z.m();
            }
            byte[] bArr = this.f16363g;
            this.f16367k = i10 + 1;
            return bArr[i10];
        }

        public byte[] I(int i10) {
            if (i10 > 0) {
                int i11 = this.f16365i;
                int i12 = this.f16367k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f16367k = i13;
                    return Arrays.copyOfRange(this.f16363g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw C1558z.m();
            }
            if (i10 == 0) {
                return AbstractC1557y.f16479d;
            }
            throw C1558z.g();
        }

        public int J() {
            int i10 = this.f16367k;
            if (this.f16365i - i10 < 4) {
                throw C1558z.m();
            }
            byte[] bArr = this.f16363g;
            this.f16367k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long K() {
            int i10 = this.f16367k;
            if (this.f16365i - i10 < 8) {
                throw C1558z.m();
            }
            byte[] bArr = this.f16363g;
            this.f16367k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int L() {
            int i10;
            int i11 = this.f16367k;
            int i12 = this.f16365i;
            if (i12 != i11) {
                byte[] bArr = this.f16363g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f16367k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f16367k = i14;
                    return i10;
                }
            }
            return (int) N();
        }

        public long M() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f16367k;
            int i11 = this.f16365i;
            if (i11 != i10) {
                byte[] bArr = this.f16363g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f16367k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (bArr[i17] << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (bArr[i13] << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (bArr[i19] << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (bArr[i13] << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f16367k = i13;
                    return j10;
                }
            }
            return N();
        }

        long N() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((H() & 128) == 0) {
                    return j10;
                }
            }
            throw C1558z.f();
        }

        public void P(int i10) {
            if (i10 >= 0) {
                int i11 = this.f16365i;
                int i12 = this.f16367k;
                if (i10 <= i11 - i12) {
                    this.f16367k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw C1558z.m();
            }
            throw C1558z.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public void a(int i10) {
            if (this.f16369m != i10) {
                throw C1558z.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int e() {
            return this.f16367k - this.f16368l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public boolean f() {
            return this.f16367k == this.f16365i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public void l(int i10) {
            this.f16371o = i10;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int m(int i10) {
            if (i10 < 0) {
                throw C1558z.g();
            }
            int e10 = i10 + e();
            if (e10 < 0) {
                throw C1558z.h();
            }
            int i11 = this.f16371o;
            if (e10 > i11) {
                throw C1558z.m();
            }
            this.f16371o = e10;
            O();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public boolean n() {
            return M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public AbstractC1540g o() {
            int L10 = L();
            if (L10 > 0) {
                int i10 = this.f16365i;
                int i11 = this.f16367k;
                if (L10 <= i10 - i11) {
                    AbstractC1540g I10 = (this.f16364h && this.f16370n) ? AbstractC1540g.I(this.f16363g, i11, L10) : AbstractC1540g.m(this.f16363g, i11, L10);
                    this.f16367k += L10;
                    return I10;
                }
            }
            return L10 == 0 ? AbstractC1540g.f16347b : AbstractC1540g.G(I(L10));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int q() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int r() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public long s() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int u() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public long v() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int w() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public long x() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int y() {
            return AbstractC1541h.c(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public long z() {
            return AbstractC1541h.d(M());
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f16371o = Integer.MAX_VALUE;
            this.f16363g = bArr;
            this.f16365i = i11 + i10;
            this.f16367k = i10;
            this.f16368l = i10;
            this.f16364h = z10;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$c */
    private static final class c extends AbstractC1541h {

        /* renamed from: g, reason: collision with root package name */
        private final InputStream f16372g;

        /* renamed from: h, reason: collision with root package name */
        private final byte[] f16373h;

        /* renamed from: i, reason: collision with root package name */
        private int f16374i;

        /* renamed from: j, reason: collision with root package name */
        private int f16375j;

        /* renamed from: k, reason: collision with root package name */
        private int f16376k;

        /* renamed from: l, reason: collision with root package name */
        private int f16377l;

        /* renamed from: m, reason: collision with root package name */
        private int f16378m;

        /* renamed from: n, reason: collision with root package name */
        private int f16379n;

        private static int H(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (C1558z e10) {
                e10.j();
                throw e10;
            }
        }

        private static int I(InputStream inputStream, byte[] bArr, int i10, int i11) {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (C1558z e10) {
                e10.j();
                throw e10;
            }
        }

        private AbstractC1540g J(int i10) {
            byte[] M10 = M(i10);
            if (M10 != null) {
                return AbstractC1540g.k(M10);
            }
            int i11 = this.f16376k;
            int i12 = this.f16374i;
            int i13 = i12 - i11;
            this.f16378m += i12;
            this.f16376k = 0;
            this.f16374i = 0;
            List<byte[]> N10 = N(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f16373h, i11, bArr, 0, i13);
            for (byte[] bArr2 : N10) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return AbstractC1540g.G(bArr);
        }

        private byte[] L(int i10, boolean z10) {
            byte[] M10 = M(i10);
            if (M10 != null) {
                return z10 ? (byte[]) M10.clone() : M10;
            }
            int i11 = this.f16376k;
            int i12 = this.f16374i;
            int i13 = i12 - i11;
            this.f16378m += i12;
            this.f16376k = 0;
            this.f16374i = 0;
            List<byte[]> N10 = N(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f16373h, i11, bArr, 0, i13);
            for (byte[] bArr2 : N10) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        private byte[] M(int i10) {
            if (i10 == 0) {
                return AbstractC1557y.f16479d;
            }
            if (i10 < 0) {
                throw C1558z.g();
            }
            int i11 = this.f16378m;
            int i12 = this.f16376k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f16360c > 0) {
                throw C1558z.l();
            }
            int i14 = this.f16379n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw C1558z.m();
            }
            int i15 = this.f16374i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > H(this.f16372g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f16373h, this.f16376k, bArr, 0, i15);
            this.f16378m += this.f16374i;
            this.f16376k = 0;
            this.f16374i = 0;
            while (i15 < i10) {
                int I10 = I(this.f16372g, bArr, i15, i10 - i15);
                if (I10 == -1) {
                    throw C1558z.m();
                }
                this.f16378m += I10;
                i15 += I10;
            }
            return bArr;
        }

        private List N(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f16372g.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw C1558z.m();
                    }
                    this.f16378m += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void T() {
            int i10 = this.f16374i + this.f16375j;
            this.f16374i = i10;
            int i11 = this.f16378m + i10;
            int i12 = this.f16379n;
            if (i11 <= i12) {
                this.f16375j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f16375j = i13;
            this.f16374i = i10 - i13;
        }

        private void U(int i10) {
            if (b0(i10)) {
                return;
            }
            if (i10 <= (this.f16360c - this.f16378m) - this.f16376k) {
                throw C1558z.m();
            }
            throw C1558z.l();
        }

        private static long V(InputStream inputStream, long j10) {
            try {
                return inputStream.skip(j10);
            } catch (C1558z e10) {
                e10.j();
                throw e10;
            }
        }

        private void X(int i10) {
            if (i10 < 0) {
                throw C1558z.g();
            }
            int i11 = this.f16378m;
            int i12 = this.f16376k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f16379n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw C1558z.m();
            }
            this.f16378m = i11 + i12;
            int i15 = this.f16374i - i12;
            this.f16374i = 0;
            this.f16376k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long V10 = V(this.f16372g, j10);
                    if (V10 < 0 || V10 > j10) {
                        throw new IllegalStateException(this.f16372g.getClass() + "#skip returned invalid result: " + V10 + "\nThe InputStream implementation is buggy.");
                    }
                    if (V10 == 0) {
                        break;
                    } else {
                        i15 += (int) V10;
                    }
                } finally {
                    this.f16378m += i15;
                    T();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f16374i;
            int i17 = i16 - this.f16376k;
            this.f16376k = i16;
            U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f16374i;
                if (i18 <= i19) {
                    this.f16376k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f16376k = i19;
                    U(1);
                }
            }
        }

        private void Y() {
            if (this.f16374i - this.f16376k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f16373h;
                int i11 = this.f16376k;
                this.f16376k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C1558z.f();
        }

        private void a0() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw C1558z.f();
        }

        private boolean b0(int i10) {
            int i11 = this.f16376k;
            int i12 = i11 + i10;
            int i13 = this.f16374i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f16360c;
            int i15 = this.f16378m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f16379n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f16373h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f16378m += i11;
                this.f16374i -= i11;
                this.f16376k = 0;
            }
            InputStream inputStream = this.f16372g;
            byte[] bArr2 = this.f16373h;
            int i16 = this.f16374i;
            int I10 = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f16360c - this.f16378m) - i16));
            if (I10 == 0 || I10 < -1 || I10 > this.f16373h.length) {
                throw new IllegalStateException(this.f16372g.getClass() + "#read(byte[]) returned invalid result: " + I10 + "\nThe InputStream implementation is buggy.");
            }
            if (I10 <= 0) {
                return false;
            }
            this.f16374i += I10;
            T();
            if (this.f16374i >= i10) {
                return true;
            }
            return b0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public String A() {
            int Q10 = Q();
            if (Q10 > 0) {
                int i10 = this.f16374i;
                int i11 = this.f16376k;
                if (Q10 <= i10 - i11) {
                    String str = new String(this.f16373h, i11, Q10, AbstractC1557y.f16477b);
                    this.f16376k += Q10;
                    return str;
                }
            }
            if (Q10 == 0) {
                return BuildConfig.FLAVOR;
            }
            if (Q10 < 0) {
                throw C1558z.g();
            }
            if (Q10 > this.f16374i) {
                return new String(L(Q10, false), AbstractC1557y.f16477b);
            }
            U(Q10);
            String str2 = new String(this.f16373h, this.f16376k, Q10, AbstractC1557y.f16477b);
            this.f16376k += Q10;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public String B() {
            byte[] L10;
            int Q10 = Q();
            int i10 = this.f16376k;
            int i11 = this.f16374i;
            if (Q10 <= i11 - i10 && Q10 > 0) {
                L10 = this.f16373h;
                this.f16376k = i10 + Q10;
            } else {
                if (Q10 == 0) {
                    return BuildConfig.FLAVOR;
                }
                if (Q10 < 0) {
                    throw C1558z.g();
                }
                i10 = 0;
                if (Q10 <= i11) {
                    U(Q10);
                    L10 = this.f16373h;
                    this.f16376k = Q10;
                } else {
                    L10 = L(Q10, false);
                }
            }
            return q0.a(L10, i10, Q10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int C() {
            if (f()) {
                this.f16377l = 0;
                return 0;
            }
            int Q10 = Q();
            this.f16377l = Q10;
            if (r0.a(Q10) != 0) {
                return this.f16377l;
            }
            throw C1558z.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int D() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public long E() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public boolean F(int i10) {
            int b10 = r0.b(i10);
            if (b10 == 0) {
                Y();
                return true;
            }
            if (b10 == 1) {
                W(8);
                return true;
            }
            if (b10 == 2) {
                W(Q());
                return true;
            }
            if (b10 == 3) {
                G();
                a(r0.c(r0.a(i10), 4));
                return true;
            }
            if (b10 == 4) {
                return false;
            }
            if (b10 != 5) {
                throw C1558z.e();
            }
            W(4);
            return true;
        }

        public byte K() {
            if (this.f16376k == this.f16374i) {
                U(1);
            }
            byte[] bArr = this.f16373h;
            int i10 = this.f16376k;
            this.f16376k = i10 + 1;
            return bArr[i10];
        }

        public int O() {
            int i10 = this.f16376k;
            if (this.f16374i - i10 < 4) {
                U(4);
                i10 = this.f16376k;
            }
            byte[] bArr = this.f16373h;
            this.f16376k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long P() {
            int i10 = this.f16376k;
            if (this.f16374i - i10 < 8) {
                U(8);
                i10 = this.f16376k;
            }
            byte[] bArr = this.f16373h;
            this.f16376k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public int Q() {
            int i10;
            int i11 = this.f16376k;
            int i12 = this.f16374i;
            if (i12 != i11) {
                byte[] bArr = this.f16373h;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f16376k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f16376k = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        public long R() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f16376k;
            int i11 = this.f16374i;
            if (i11 != i10) {
                byte[] bArr = this.f16373h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f16376k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (bArr[i17] << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (bArr[i13] << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (bArr[i19] << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (bArr[i13] << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f16376k = i13;
                    return j10;
                }
            }
            return S();
        }

        long S() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((K() & 128) == 0) {
                    return j10;
                }
            }
            throw C1558z.f();
        }

        public void W(int i10) {
            int i11 = this.f16374i;
            int i12 = this.f16376k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f16376k = i12 + i10;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public void a(int i10) {
            if (this.f16377l != i10) {
                throw C1558z.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int e() {
            return this.f16378m + this.f16376k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public boolean f() {
            return this.f16376k == this.f16374i && !b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public void l(int i10) {
            this.f16379n = i10;
            T();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int m(int i10) {
            if (i10 < 0) {
                throw C1558z.g();
            }
            int i11 = i10 + this.f16378m + this.f16376k;
            if (i11 < 0) {
                throw C1558z.h();
            }
            int i12 = this.f16379n;
            if (i11 > i12) {
                throw C1558z.m();
            }
            this.f16379n = i11;
            T();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public boolean n() {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public AbstractC1540g o() {
            int Q10 = Q();
            int i10 = this.f16374i;
            int i11 = this.f16376k;
            if (Q10 <= i10 - i11 && Q10 > 0) {
                AbstractC1540g m10 = AbstractC1540g.m(this.f16373h, i11, Q10);
                this.f16376k += Q10;
                return m10;
            }
            if (Q10 == 0) {
                return AbstractC1540g.f16347b;
            }
            if (Q10 >= 0) {
                return J(Q10);
            }
            throw C1558z.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int q() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int r() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public long s() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int u() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public long v() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int w() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public long x() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public int y() {
            return AbstractC1541h.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1541h
        public long z() {
            return AbstractC1541h.d(R());
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f16379n = Integer.MAX_VALUE;
            AbstractC1557y.b(inputStream, "input");
            this.f16372g = inputStream;
            this.f16373h = new byte[i10];
            this.f16374i = 0;
            this.f16376k = 0;
            this.f16378m = 0;
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC1541h g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static AbstractC1541h h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(AbstractC1557y.f16479d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC1541h i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static AbstractC1541h j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    static AbstractC1541h k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.m(i11);
            return bVar;
        } catch (C1558z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i10);

    public void G() {
        int C10;
        do {
            C10 = C();
            if (C10 == 0) {
                return;
            }
            b();
            this.f16358a++;
            this.f16358a--;
        } while (F(C10));
    }

    public abstract void a(int i10);

    public void b() {
        if (this.f16358a >= this.f16359b) {
            throw C1558z.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i10);

    public abstract int m(int i10);

    public abstract boolean n();

    public abstract AbstractC1540g o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    private AbstractC1541h() {
        this.f16359b = f16357f;
        this.f16360c = Integer.MAX_VALUE;
        this.f16362e = false;
    }
}
