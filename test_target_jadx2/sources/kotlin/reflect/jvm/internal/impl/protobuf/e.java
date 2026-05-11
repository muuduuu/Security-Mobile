package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    private int f36479d;

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f36481f;

    /* renamed from: g, reason: collision with root package name */
    private int f36482g;

    /* renamed from: k, reason: collision with root package name */
    private int f36486k;

    /* renamed from: h, reason: collision with root package name */
    private boolean f36483h = false;

    /* renamed from: j, reason: collision with root package name */
    private int f36485j = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    private int f36487l = 64;

    /* renamed from: m, reason: collision with root package name */
    private int f36488m = 67108864;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f36476a = new byte[4096];

    /* renamed from: c, reason: collision with root package name */
    private int f36478c = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f36480e = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f36484i = 0;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36477b = false;

    private e(InputStream inputStream) {
        this.f36481f = inputStream;
    }

    public static int A(int i10, InputStream inputStream) {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw k.k();
            }
            i11 |= (read & 127) << i12;
            if ((read & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw k.k();
            }
            if ((read2 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw k.f();
    }

    private void M() {
        int i10 = this.f36478c + this.f36479d;
        this.f36478c = i10;
        int i11 = this.f36484i + i10;
        int i12 = this.f36485j;
        if (i11 <= i12) {
            this.f36479d = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f36479d = i13;
        this.f36478c = i10 - i13;
    }

    private void N(int i10) {
        if (!S(i10)) {
            throw k.k();
        }
    }

    private void R(int i10) {
        if (i10 < 0) {
            throw k.g();
        }
        int i11 = this.f36484i;
        int i12 = this.f36480e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f36485j;
        if (i13 > i14) {
            Q((i14 - i11) - i12);
            throw k.k();
        }
        int i15 = this.f36478c;
        int i16 = i15 - i12;
        this.f36480e = i15;
        N(1);
        while (true) {
            int i17 = i10 - i16;
            int i18 = this.f36478c;
            if (i17 <= i18) {
                this.f36480e = i17;
                return;
            } else {
                i16 += i18;
                this.f36480e = i18;
                N(1);
            }
        }
    }

    private boolean S(int i10) {
        int i11 = this.f36480e;
        int i12 = i11 + i10;
        int i13 = this.f36478c;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f36484i + i11 + i10 <= this.f36485j && this.f36481f != null) {
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f36476a;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f36484i += i11;
                this.f36478c -= i11;
                this.f36480e = 0;
            }
            InputStream inputStream = this.f36481f;
            byte[] bArr2 = this.f36476a;
            int i14 = this.f36478c;
            int read = inputStream.read(bArr2, i14, bArr2.length - i14);
            if (read == 0 || read < -1 || read > this.f36476a.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(read);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (read > 0) {
                this.f36478c += read;
                if ((this.f36484i + i10) - this.f36488m > 0) {
                    throw k.j();
                }
                M();
                if (this.f36478c >= i10) {
                    return true;
                }
                return S(i10);
            }
        }
        return false;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    private void d(int i10) {
        if (this.f36478c - this.f36480e < i10) {
            N(i10);
        }
    }

    public static e g(InputStream inputStream) {
        return new e(inputStream);
    }

    private byte[] w(int i10) {
        if (i10 <= 0) {
            if (i10 == 0) {
                return j.f36524a;
            }
            throw k.g();
        }
        int i11 = this.f36484i;
        int i12 = this.f36480e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f36485j;
        if (i13 > i14) {
            Q((i14 - i11) - i12);
            throw k.k();
        }
        if (i10 < 4096) {
            byte[] bArr = new byte[i10];
            int i15 = this.f36478c - i12;
            System.arraycopy(this.f36476a, i12, bArr, 0, i15);
            this.f36480e = this.f36478c;
            int i16 = i10 - i15;
            d(i16);
            System.arraycopy(this.f36476a, 0, bArr, i15, i16);
            this.f36480e = i16;
            return bArr;
        }
        int i17 = this.f36478c;
        this.f36484i = i11 + i17;
        this.f36480e = 0;
        this.f36478c = 0;
        int i18 = i17 - i12;
        int i19 = i10 - i18;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i19 > 0) {
            int min = Math.min(i19, 4096);
            byte[] bArr2 = new byte[min];
            int i20 = 0;
            while (i20 < min) {
                InputStream inputStream = this.f36481f;
                int read = inputStream == null ? -1 : inputStream.read(bArr2, i20, min - i20);
                if (read == -1) {
                    throw k.k();
                }
                this.f36484i += read;
                i20 += read;
            }
            i19 -= min;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(this.f36476a, i12, bArr3, 0, i18);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, i18, bArr4.length);
            i18 += bArr4.length;
        }
        return bArr3;
    }

    public long B() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f36480e;
        int i11 = this.f36478c;
        if (i11 != i10) {
            byte[] bArr = this.f36476a;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f36480e = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                long j13 = (bArr[i12] << 7) ^ b10;
                if (j13 >= 0) {
                    int i14 = i10 + 3;
                    long j14 = j13 ^ (bArr[i13] << 14);
                    if (j14 >= 0) {
                        j12 = 16256;
                    } else {
                        i13 = i10 + 4;
                        j13 = j14 ^ (bArr[i14] << 21);
                        if (j13 < 0) {
                            j11 = -2080896;
                        } else {
                            i14 = i10 + 5;
                            j14 = j13 ^ (bArr[i13] << 28);
                            if (j14 >= 0) {
                                j12 = 266354560;
                            } else {
                                i13 = i10 + 6;
                                j13 = j14 ^ (bArr[i14] << 35);
                                if (j13 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i14 = i10 + 7;
                                    j14 = j13 ^ (bArr[i13] << 42);
                                    if (j14 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j13 = j14 ^ (bArr[i14] << 49);
                                        if (j13 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i14 = i10 + 9;
                                            long j15 = (j13 ^ (bArr[i13] << 56)) ^ 71499008037633920L;
                                            if (j15 >= 0) {
                                                j10 = j15;
                                                i13 = i14;
                                                this.f36480e = i13;
                                                return j10;
                                            }
                                            i13 = i10 + 10;
                                            if (bArr[i14] >= 0) {
                                                j10 = j15;
                                                this.f36480e = i13;
                                                return j10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j10 = j14 ^ j12;
                    i13 = i14;
                    this.f36480e = i13;
                    return j10;
                }
                j11 = -128;
                j10 = j13 ^ j11;
                this.f36480e = i13;
                return j10;
            }
        }
        return C();
    }

    long C() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((v() & 128) == 0) {
                return j10;
            }
        }
        throw k.f();
    }

    public int D() {
        return x();
    }

    public long E() {
        return y();
    }

    public int F() {
        return b(z());
    }

    public long G() {
        return c(B());
    }

    public String H() {
        int z10 = z();
        int i10 = this.f36478c;
        int i11 = this.f36480e;
        if (z10 > i10 - i11 || z10 <= 0) {
            return z10 == 0 ? BuildConfig.FLAVOR : new String(w(z10), "UTF-8");
        }
        String str = new String(this.f36476a, i11, z10, "UTF-8");
        this.f36480e += z10;
        return str;
    }

    public String I() {
        byte[] w10;
        int z10 = z();
        int i10 = this.f36480e;
        if (z10 <= this.f36478c - i10 && z10 > 0) {
            w10 = this.f36476a;
            this.f36480e = i10 + z10;
        } else {
            if (z10 == 0) {
                return BuildConfig.FLAVOR;
            }
            w10 = w(z10);
            i10 = 0;
        }
        if (x.f(w10, i10, i10 + z10)) {
            return new String(w10, i10, z10, "UTF-8");
        }
        throw k.d();
    }

    public int J() {
        if (f()) {
            this.f36482g = 0;
            return 0;
        }
        int z10 = z();
        this.f36482g = z10;
        if (y.a(z10) != 0) {
            return this.f36482g;
        }
        throw k.c();
    }

    public int K() {
        return z();
    }

    public long L() {
        return B();
    }

    public boolean O(int i10, f fVar) {
        int b10 = y.b(i10);
        if (b10 == 0) {
            long s10 = s();
            fVar.n0(i10);
            fVar.y0(s10);
            return true;
        }
        if (b10 == 1) {
            long y10 = y();
            fVar.n0(i10);
            fVar.U(y10);
            return true;
        }
        if (b10 == 2) {
            d k10 = k();
            fVar.n0(i10);
            fVar.O(k10);
            return true;
        }
        if (b10 == 3) {
            fVar.n0(i10);
            P(fVar);
            int c10 = y.c(y.a(i10), 4);
            a(c10);
            fVar.n0(c10);
            return true;
        }
        if (b10 == 4) {
            return false;
        }
        if (b10 != 5) {
            throw k.e();
        }
        int x10 = x();
        fVar.n0(i10);
        fVar.T(x10);
        return true;
    }

    public void P(f fVar) {
        int J10;
        do {
            J10 = J();
            if (J10 == 0) {
                return;
            }
        } while (O(J10, fVar));
    }

    public void Q(int i10) {
        int i11 = this.f36478c;
        int i12 = this.f36480e;
        if (i10 > i11 - i12 || i10 < 0) {
            R(i10);
        } else {
            this.f36480e = i12 + i10;
        }
    }

    public void a(int i10) {
        if (this.f36482g != i10) {
            throw k.b();
        }
    }

    public int e() {
        int i10 = this.f36485j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f36484i + this.f36480e);
    }

    public boolean f() {
        return this.f36480e == this.f36478c && !S(1);
    }

    public void h(int i10) {
        this.f36485j = i10;
        M();
    }

    public int i(int i10) {
        if (i10 < 0) {
            throw k.g();
        }
        int i11 = i10 + this.f36484i + this.f36480e;
        int i12 = this.f36485j;
        if (i11 > i12) {
            throw k.k();
        }
        this.f36485j = i11;
        M();
        return i12;
    }

    public boolean j() {
        return B() != 0;
    }

    public d k() {
        int z10 = z();
        int i10 = this.f36478c;
        int i11 = this.f36480e;
        if (z10 > i10 - i11 || z10 <= 0) {
            return z10 == 0 ? d.f36469a : new o(w(z10));
        }
        d cVar = (this.f36477b && this.f36483h) ? new c(this.f36476a, this.f36480e, z10) : d.k(this.f36476a, i11, z10);
        this.f36480e += z10;
        return cVar;
    }

    public double l() {
        return Double.longBitsToDouble(y());
    }

    public int m() {
        return z();
    }

    public int n() {
        return x();
    }

    public long o() {
        return y();
    }

    public float p() {
        return Float.intBitsToFloat(x());
    }

    public void q(int i10, p.a aVar, g gVar) {
        int i11 = this.f36486k;
        if (i11 >= this.f36487l) {
            throw k.h();
        }
        this.f36486k = i11 + 1;
        aVar.y0(this, gVar);
        a(y.c(i10, 4));
        this.f36486k--;
    }

    public int r() {
        return z();
    }

    public long s() {
        return B();
    }

    public p t(r rVar, g gVar) {
        int z10 = z();
        if (this.f36486k >= this.f36487l) {
            throw k.h();
        }
        int i10 = i(z10);
        this.f36486k++;
        p pVar = (p) rVar.b(this, gVar);
        a(0);
        this.f36486k--;
        h(i10);
        return pVar;
    }

    public void u(p.a aVar, g gVar) {
        int z10 = z();
        if (this.f36486k >= this.f36487l) {
            throw k.h();
        }
        int i10 = i(z10);
        this.f36486k++;
        aVar.y0(this, gVar);
        a(0);
        this.f36486k--;
        h(i10);
    }

    public byte v() {
        if (this.f36480e == this.f36478c) {
            N(1);
        }
        byte[] bArr = this.f36476a;
        int i10 = this.f36480e;
        this.f36480e = i10 + 1;
        return bArr[i10];
    }

    public int x() {
        int i10 = this.f36480e;
        if (this.f36478c - i10 < 4) {
            N(4);
            i10 = this.f36480e;
        }
        byte[] bArr = this.f36476a;
        this.f36480e = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public long y() {
        int i10 = this.f36480e;
        if (this.f36478c - i10 < 8) {
            N(8);
            i10 = this.f36480e;
        }
        byte[] bArr = this.f36476a;
        this.f36480e = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public int z() {
        int i10;
        int i11 = this.f36480e;
        int i12 = this.f36478c;
        if (i12 != i11) {
            byte[] bArr = this.f36476a;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f36480e = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                long j10 = i15;
                if (j10 < 0) {
                    i10 = (int) ((-128) ^ j10);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    long j11 = i17;
                    if (j11 >= 0) {
                        i10 = (int) (16256 ^ j11);
                    } else {
                        int i18 = i11 + 4;
                        long j12 = i17 ^ (bArr[i16] << 21);
                        if (j12 < 0) {
                            i10 = (int) ((-2080896) ^ j12);
                        } else {
                            i16 = i11 + 5;
                            int i19 = (int) ((r1 ^ (r3 << 28)) ^ 266354560);
                            if (bArr[i18] < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i20 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i20;
                                                    i10 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i19;
                            }
                            i10 = i19;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f36480e = i14;
                return i10;
            }
        }
        return (int) C();
    }
}
