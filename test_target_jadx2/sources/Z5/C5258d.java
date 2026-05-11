package z5;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.j;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.n;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import y5.AbstractC5174a;
import y5.C5176c;
import y5.f;

/* renamed from: z5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5258d extends AbstractC5256b {

    /* renamed from: A, reason: collision with root package name */
    protected static final char[] f45753A = AbstractC5174a.c();

    /* renamed from: r, reason: collision with root package name */
    protected final Writer f45754r;

    /* renamed from: s, reason: collision with root package name */
    protected char f45755s;

    /* renamed from: t, reason: collision with root package name */
    protected char[] f45756t;

    /* renamed from: u, reason: collision with root package name */
    protected int f45757u;

    /* renamed from: v, reason: collision with root package name */
    protected int f45758v;

    /* renamed from: w, reason: collision with root package name */
    protected int f45759w;

    /* renamed from: x, reason: collision with root package name */
    protected char[] f45760x;

    /* renamed from: y, reason: collision with root package name */
    protected n f45761y;

    /* renamed from: z, reason: collision with root package name */
    protected char[] f45762z;

    public C5258d(C5176c c5176c, int i10, l lVar, Writer writer, char c10) {
        super(c5176c, i10, lVar);
        this.f45754r = writer;
        char[] e10 = c5176c.e();
        this.f45756t = e10;
        this.f45759w = e10.length;
        this.f45755s = c10;
        if (c10 != '\"') {
            this.f45743l = AbstractC5174a.e(c10);
        }
    }

    private final void F2(n nVar) {
        char[] a10 = nVar.a();
        z1(a10, 0, a10.length);
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        this.f45758v = i10 + 1;
        cArr[i10] = this.f45755s;
    }

    private void G2(String str) {
        v2();
        int length = str.length();
        int i10 = 0;
        while (true) {
            int i11 = this.f45759w;
            if (i10 + i11 > length) {
                i11 = length - i10;
            }
            int i12 = i10 + i11;
            str.getChars(i10, i12, this.f45756t, 0);
            int i13 = this.f45744m;
            if (i13 != 0) {
                P2(i11, i13);
            } else {
                O2(i11);
            }
            if (i12 >= length) {
                return;
            } else {
                i10 = i12;
            }
        }
    }

    private final void H2() {
        if (this.f45758v + 4 >= this.f45759w) {
            v2();
        }
        int i10 = this.f45758v;
        char[] cArr = this.f45756t;
        cArr[i10] = 'n';
        cArr[i10 + 1] = 'u';
        cArr[i10 + 2] = 'l';
        cArr[i10 + 3] = 'l';
        this.f45758v = i10 + 4;
    }

    private void K2(int i10) {
        if (this.f45758v + 13 >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i11 = this.f45758v;
        int i12 = i11 + 1;
        this.f45758v = i12;
        cArr[i11] = this.f45755s;
        int j10 = f.j(i10, cArr, i12);
        char[] cArr2 = this.f45756t;
        this.f45758v = j10 + 1;
        cArr2[j10] = this.f45755s;
    }

    private void L2(long j10) {
        if (this.f45758v + 23 >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        int i11 = i10 + 1;
        this.f45758v = i11;
        cArr[i10] = this.f45755s;
        int k10 = f.k(j10, cArr, i11);
        char[] cArr2 = this.f45756t;
        this.f45758v = k10 + 1;
        cArr2[k10] = this.f45755s;
    }

    private void M2(String str) {
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        this.f45758v = i10 + 1;
        cArr[i10] = this.f45755s;
        y1(str);
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr2 = this.f45756t;
        int i11 = this.f45758v;
        this.f45758v = i11 + 1;
        cArr2[i11] = this.f45755s;
    }

    private void N2(short s10) {
        if (this.f45758v + 8 >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        int i11 = i10 + 1;
        this.f45758v = i11;
        cArr[i10] = this.f45755s;
        int j10 = f.j(s10, cArr, i11);
        char[] cArr2 = this.f45756t;
        this.f45758v = j10 + 1;
        cArr2[j10] = this.f45755s;
    }

    private void O2(int i10) {
        char[] cArr;
        char c10;
        int[] iArr = this.f45743l;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            do {
                cArr = this.f45756t;
                c10 = cArr[i11];
                if (c10 < length && iArr[c10] != 0) {
                    break;
                } else {
                    i11++;
                }
            } while (i11 < i10);
            int i13 = i11 - i12;
            if (i13 > 0) {
                this.f45754r.write(cArr, i12, i13);
                if (i11 >= i10) {
                    return;
                }
            }
            i11++;
            i12 = w2(this.f45756t, i11, i10, c10, iArr[c10]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[LOOP:1: B:3:0x000e->B:20:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[EDGE_INSN: B:9:0x0021->B:10:0x0021 BREAK  A[LOOP:1: B:3:0x000e->B:20:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void P2(int i10, int i11) {
        char[] cArr;
        char c10;
        int[] iArr = this.f45743l;
        int min = Math.min(iArr.length, i11 + 1);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i10) {
            while (true) {
                cArr = this.f45756t;
                c10 = cArr[i12];
                if (c10 < min) {
                    i14 = iArr[c10];
                    if (i14 != 0) {
                        break;
                    }
                    i12++;
                    if (i12 < i10) {
                        break;
                    }
                } else {
                    if (c10 > i11) {
                        i14 = -1;
                        break;
                    }
                    i12++;
                    if (i12 < i10) {
                    }
                }
            }
            int i15 = i12 - i13;
            if (i15 > 0) {
                this.f45754r.write(cArr, i13, i15);
                if (i12 >= i10) {
                    return;
                }
            }
            i12++;
            i13 = w2(this.f45756t, i12, i10, c10, i14);
        }
    }

    private void Q2(String str) {
        int length = str.length();
        int i10 = this.f45759w;
        if (length > i10) {
            G2(str);
            return;
        }
        if (this.f45758v + length > i10) {
            v2();
        }
        str.getChars(0, length, this.f45756t, this.f45758v);
        int i11 = this.f45744m;
        if (i11 != 0) {
            U2(length, i11);
        } else {
            S2(length);
        }
    }

    private void R2(char[] cArr, int i10, int i11) {
        int i12 = this.f45744m;
        if (i12 != 0) {
            V2(cArr, i10, i11, i12);
            return;
        }
        int i13 = i11 + i10;
        int[] iArr = this.f45743l;
        int length = iArr.length;
        while (i10 < i13) {
            int i14 = i10;
            do {
                char c10 = cArr[i14];
                if (c10 < length && iArr[c10] != 0) {
                    break;
                } else {
                    i14++;
                }
            } while (i14 < i13);
            int i15 = i14 - i10;
            if (i15 < 32) {
                if (this.f45758v + i15 > this.f45759w) {
                    v2();
                }
                if (i15 > 0) {
                    System.arraycopy(cArr, i10, this.f45756t, this.f45758v, i15);
                    this.f45758v += i15;
                }
            } else {
                v2();
                this.f45754r.write(cArr, i10, i15);
            }
            if (i14 >= i13) {
                return;
            }
            i10 = i14 + 1;
            char c11 = cArr[i14];
            u2(c11, iArr[c11]);
        }
    }

    private void S2(int i10) {
        int i11;
        int i12 = this.f45758v + i10;
        int[] iArr = this.f45743l;
        int length = iArr.length;
        while (this.f45758v < i12) {
            do {
                char[] cArr = this.f45756t;
                int i13 = this.f45758v;
                char c10 = cArr[i13];
                if (c10 >= length || iArr[c10] == 0) {
                    i11 = i13 + 1;
                    this.f45758v = i11;
                } else {
                    int i14 = this.f45757u;
                    int i15 = i13 - i14;
                    if (i15 > 0) {
                        this.f45754r.write(cArr, i14, i15);
                    }
                    char[] cArr2 = this.f45756t;
                    int i16 = this.f45758v;
                    this.f45758v = i16 + 1;
                    char c11 = cArr2[i16];
                    x2(c11, iArr[c11]);
                }
            } while (i11 < i12);
            return;
        }
    }

    private void T2(n nVar) {
        char[] a10 = nVar.a();
        int length = a10.length;
        if (length < 32) {
            if (length > this.f45759w - this.f45758v) {
                v2();
            }
            System.arraycopy(a10, 0, this.f45756t, this.f45758v, length);
            this.f45758v += length;
        } else {
            v2();
            this.f45754r.write(a10, 0, length);
        }
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        this.f45758v = i10 + 1;
        cArr[i10] = this.f45755s;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void U2(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15 = this.f45758v + i10;
        int[] iArr = this.f45743l;
        int min = Math.min(iArr.length, i11 + 1);
        while (this.f45758v < i15) {
            do {
                char[] cArr = this.f45756t;
                int i16 = this.f45758v;
                char c10 = cArr[i16];
                if (c10 < min) {
                    i12 = iArr[c10];
                    if (i12 != 0) {
                        int i17 = this.f45757u;
                        i13 = i16 - i17;
                        if (i13 <= 0) {
                            this.f45754r.write(cArr, i17, i13);
                        }
                        this.f45758v++;
                        x2(c10, i12);
                    }
                    i14 = i16 + 1;
                    this.f45758v = i14;
                } else {
                    if (c10 > i11) {
                        i12 = -1;
                        int i172 = this.f45757u;
                        i13 = i16 - i172;
                        if (i13 <= 0) {
                        }
                        this.f45758v++;
                        x2(c10, i12);
                    }
                    i14 = i16 + 1;
                    this.f45758v = i14;
                }
            } while (i14 < i15);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[EDGE_INSN: B:10:0x001f->B:11:0x001f BREAK  A[LOOP:1: B:4:0x000e->B:24:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:1: B:4:0x000e->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void V2(char[] cArr, int i10, int i11, int i12) {
        char c10;
        int i13 = i11 + i10;
        int[] iArr = this.f45743l;
        int min = Math.min(iArr.length, i12 + 1);
        int i14 = 0;
        while (i10 < i13) {
            int i15 = i10;
            while (true) {
                c10 = cArr[i15];
                if (c10 < min) {
                    i14 = iArr[c10];
                    if (i14 != 0) {
                        break;
                    }
                    i15++;
                    if (i15 < i13) {
                        break;
                    }
                } else {
                    if (c10 > i12) {
                        i14 = -1;
                        break;
                    }
                    i15++;
                    if (i15 < i13) {
                    }
                }
            }
            int i16 = i15 - i10;
            if (i16 < 32) {
                if (this.f45758v + i16 > this.f45759w) {
                    v2();
                }
                if (i16 > 0) {
                    System.arraycopy(cArr, i10, this.f45756t, this.f45758v, i16);
                    this.f45758v += i16;
                }
            } else {
                v2();
                this.f45754r.write(cArr, i10, i16);
            }
            if (i15 >= i13) {
                return;
            }
            i10 = i15 + 1;
            u2(c10, i14);
        }
    }

    private void W2(String str) {
        int i10 = this.f45759w;
        int i11 = this.f45758v;
        int i12 = i10 - i11;
        str.getChars(0, i12, this.f45756t, i11);
        this.f45758v += i12;
        v2();
        int length = str.length() - i12;
        while (true) {
            int i13 = this.f45759w;
            if (length <= i13) {
                str.getChars(i12, i12 + length, this.f45756t, 0);
                this.f45757u = 0;
                this.f45758v = length;
                return;
            } else {
                int i14 = i12 + i13;
                str.getChars(i12, i14, this.f45756t, 0);
                this.f45757u = 0;
                this.f45758v = i13;
                v2();
                length -= i13;
                i12 = i14;
            }
        }
    }

    private char[] t2() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.f45760x = cArr;
        return cArr;
    }

    private void u2(char c10, int i10) {
        int i11;
        if (i10 >= 0) {
            if (this.f45758v + 2 > this.f45759w) {
                v2();
            }
            char[] cArr = this.f45756t;
            int i12 = this.f45758v;
            int i13 = i12 + 1;
            this.f45758v = i13;
            cArr[i12] = '\\';
            this.f45758v = i12 + 2;
            cArr[i13] = (char) i10;
            return;
        }
        if (i10 == -2) {
            this.f45761y.getClass();
            String value = this.f45761y.getValue();
            this.f45761y = null;
            int length = value.length();
            if (this.f45758v + length > this.f45759w) {
                v2();
                if (length > this.f45759w) {
                    this.f45754r.write(value);
                    return;
                }
            }
            value.getChars(0, length, this.f45756t, this.f45758v);
            this.f45758v += length;
            return;
        }
        if (this.f45758v + 5 >= this.f45759w) {
            v2();
        }
        int i14 = this.f45758v;
        char[] cArr2 = this.f45756t;
        cArr2[i14] = '\\';
        int i15 = i14 + 2;
        cArr2[i14 + 1] = 'u';
        if (c10 > 255) {
            int i16 = c10 >> '\b';
            int i17 = i14 + 3;
            char[] cArr3 = f45753A;
            cArr2[i15] = cArr3[(i16 & 255) >> 4];
            i11 = i14 + 4;
            cArr2[i17] = cArr3[i16 & 15];
            c10 = (char) (c10 & 255);
        } else {
            int i18 = i14 + 3;
            cArr2[i15] = '0';
            i11 = i14 + 4;
            cArr2[i18] = '0';
        }
        char[] cArr4 = f45753A;
        cArr2[i11] = cArr4[c10 >> 4];
        cArr2[i11 + 1] = cArr4[c10 & 15];
        this.f45758v = i11 + 2;
    }

    private int w2(char[] cArr, int i10, int i11, char c10, int i12) {
        int i13;
        if (i12 >= 0) {
            if (i10 > 1 && i10 < i11) {
                int i14 = i10 - 2;
                cArr[i14] = '\\';
                cArr[i10 - 1] = (char) i12;
                return i14;
            }
            char[] cArr2 = this.f45760x;
            if (cArr2 == null) {
                cArr2 = t2();
            }
            cArr2[1] = (char) i12;
            this.f45754r.write(cArr2, 0, 2);
            return i10;
        }
        if (i12 == -2) {
            this.f45761y.getClass();
            String value = this.f45761y.getValue();
            this.f45761y = null;
            int length = value.length();
            if (i10 < length || i10 >= i11) {
                this.f45754r.write(value);
                return i10;
            }
            int i15 = i10 - length;
            value.getChars(0, length, cArr, i15);
            return i15;
        }
        if (i10 <= 5 || i10 >= i11) {
            char[] cArr3 = this.f45760x;
            if (cArr3 == null) {
                cArr3 = t2();
            }
            this.f45757u = this.f45758v;
            if (c10 <= 255) {
                char[] cArr4 = f45753A;
                cArr3[6] = cArr4[c10 >> 4];
                cArr3[7] = cArr4[c10 & 15];
                this.f45754r.write(cArr3, 2, 6);
                return i10;
            }
            int i16 = c10 >> '\b';
            char[] cArr5 = f45753A;
            cArr3[10] = cArr5[(i16 & 255) >> 4];
            cArr3[11] = cArr5[i16 & 15];
            cArr3[12] = cArr5[(c10 & 255) >> 4];
            cArr3[13] = cArr5[c10 & 15];
            this.f45754r.write(cArr3, 8, 6);
            return i10;
        }
        cArr[i10 - 6] = '\\';
        int i17 = i10 - 4;
        cArr[i10 - 5] = 'u';
        if (c10 > 255) {
            int i18 = c10 >> '\b';
            int i19 = i10 - 3;
            char[] cArr6 = f45753A;
            cArr[i17] = cArr6[(i18 & 255) >> 4];
            i13 = i10 - 2;
            cArr[i19] = cArr6[i18 & 15];
            c10 = (char) (c10 & 255);
        } else {
            int i20 = i10 - 3;
            cArr[i17] = '0';
            i13 = i10 - 2;
            cArr[i20] = '0';
        }
        char[] cArr7 = f45753A;
        cArr[i13] = cArr7[c10 >> 4];
        cArr[i13 + 1] = cArr7[c10 & 15];
        return i13 - 4;
    }

    private void x2(char c10, int i10) {
        int i11;
        if (i10 >= 0) {
            int i12 = this.f45758v;
            if (i12 >= 2) {
                int i13 = i12 - 2;
                this.f45757u = i13;
                char[] cArr = this.f45756t;
                cArr[i13] = '\\';
                cArr[i12 - 1] = (char) i10;
                return;
            }
            char[] cArr2 = this.f45760x;
            if (cArr2 == null) {
                cArr2 = t2();
            }
            this.f45757u = this.f45758v;
            cArr2[1] = (char) i10;
            this.f45754r.write(cArr2, 0, 2);
            return;
        }
        if (i10 == -2) {
            this.f45761y.getClass();
            String value = this.f45761y.getValue();
            this.f45761y = null;
            int length = value.length();
            int i14 = this.f45758v;
            if (i14 < length) {
                this.f45757u = i14;
                this.f45754r.write(value);
                return;
            } else {
                int i15 = i14 - length;
                this.f45757u = i15;
                value.getChars(0, length, this.f45756t, i15);
                return;
            }
        }
        int i16 = this.f45758v;
        if (i16 < 6) {
            char[] cArr3 = this.f45760x;
            if (cArr3 == null) {
                cArr3 = t2();
            }
            this.f45757u = this.f45758v;
            if (c10 <= 255) {
                char[] cArr4 = f45753A;
                cArr3[6] = cArr4[c10 >> 4];
                cArr3[7] = cArr4[c10 & 15];
                this.f45754r.write(cArr3, 2, 6);
                return;
            }
            int i17 = c10 >> '\b';
            char[] cArr5 = f45753A;
            cArr3[10] = cArr5[(i17 & 255) >> 4];
            cArr3[11] = cArr5[i17 & 15];
            cArr3[12] = cArr5[(c10 & 255) >> 4];
            cArr3[13] = cArr5[c10 & 15];
            this.f45754r.write(cArr3, 8, 6);
            return;
        }
        char[] cArr6 = this.f45756t;
        int i18 = i16 - 6;
        this.f45757u = i18;
        cArr6[i18] = '\\';
        cArr6[i16 - 5] = 'u';
        if (c10 > 255) {
            int i19 = c10 >> '\b';
            char[] cArr7 = f45753A;
            cArr6[i16 - 4] = cArr7[(i19 & 255) >> 4];
            i11 = i16 - 3;
            cArr6[i11] = cArr7[i19 & 15];
            c10 = (char) (c10 & 255);
        } else {
            cArr6[i16 - 4] = '0';
            i11 = i16 - 3;
            cArr6[i11] = '0';
        }
        char[] cArr8 = f45753A;
        cArr6[i11 + 1] = cArr8[c10 >> 4];
        cArr6[i11 + 2] = cArr8[c10 & 15];
    }

    private int y2(InputStream inputStream, byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i10 < i11) {
            bArr[i13] = bArr[i10];
            i13++;
            i10++;
        }
        int min = Math.min(i12, bArr.length);
        do {
            int i14 = min - i13;
            if (i14 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i13, i14);
            if (read < 0) {
                return i13;
            }
            i13 += read;
        } while (i13 < 3);
        return i13;
    }

    @Override // com.fasterxml.jackson.core.f
    public void A0(float f10) {
        if (this.f44328g || (f.i(f10) && n(f.b.QUOTE_NON_NUMERIC_NUMBERS))) {
            h2(String.valueOf(f10));
        } else {
            p2("write a number");
            y1(String.valueOf(f10));
        }
    }

    protected final int A2(com.fasterxml.jackson.core.a aVar, InputStream inputStream, byte[] bArr) {
        int i10 = this.f45759w - 6;
        int i11 = 2;
        int i12 = -3;
        int g10 = aVar.g() >> 2;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i13 > i12) {
                i14 = y2(inputStream, bArr, i13, i14, bArr.length);
                if (i14 < 3) {
                    break;
                }
                i12 = i14 - 3;
                i13 = 0;
            }
            if (this.f45758v > i10) {
                v2();
            }
            int i16 = i13 + 2;
            int i17 = ((bArr[i13 + 1] & 255) | (bArr[i13] << 8)) << 8;
            i13 += 3;
            i15 += 3;
            int c10 = aVar.c(i17 | (bArr[i16] & 255), this.f45756t, this.f45758v);
            this.f45758v = c10;
            g10--;
            if (g10 <= 0) {
                char[] cArr = this.f45756t;
                int i18 = c10 + 1;
                this.f45758v = i18;
                cArr[c10] = '\\';
                this.f45758v = c10 + 2;
                cArr[i18] = 'n';
                g10 = aVar.g() >> 2;
            }
        }
        if (i14 <= 0) {
            return i15;
        }
        if (this.f45758v > i10) {
            v2();
        }
        int i19 = bArr[0] << 16;
        if (1 < i14) {
            i19 |= (bArr[1] & 255) << 8;
        } else {
            i11 = 1;
        }
        int i20 = i15 + i11;
        this.f45758v = aVar.e(i19, i11, this.f45756t, this.f45758v);
        return i20;
    }

    protected final int B2(com.fasterxml.jackson.core.a aVar, InputStream inputStream, byte[] bArr, int i10) {
        int y22;
        int i11 = this.f45759w - 6;
        int i12 = 2;
        int i13 = -3;
        int i14 = i10;
        int g10 = aVar.g() >> 2;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i14 <= 2) {
                break;
            }
            if (i15 > i13) {
                i16 = y2(inputStream, bArr, i15, i16, i14);
                if (i16 < 3) {
                    i15 = 0;
                    break;
                }
                i13 = i16 - 3;
                i15 = 0;
            }
            if (this.f45758v > i11) {
                v2();
            }
            int i17 = i15 + 2;
            int i18 = ((bArr[i15 + 1] & 255) | (bArr[i15] << 8)) << 8;
            i15 += 3;
            i14 -= 3;
            int c10 = aVar.c(i18 | (bArr[i17] & 255), this.f45756t, this.f45758v);
            this.f45758v = c10;
            g10--;
            if (g10 <= 0) {
                char[] cArr = this.f45756t;
                int i19 = c10 + 1;
                this.f45758v = i19;
                cArr[c10] = '\\';
                this.f45758v = c10 + 2;
                cArr[i19] = 'n';
                g10 = aVar.g() >> 2;
            }
        }
        if (i14 <= 0 || (y22 = y2(inputStream, bArr, i15, i16, i14)) <= 0) {
            return i14;
        }
        if (this.f45758v > i11) {
            v2();
        }
        int i20 = bArr[0] << 16;
        if (1 < y22) {
            i20 |= (bArr[1] & 255) << 8;
        } else {
            i12 = 1;
        }
        this.f45758v = aVar.e(i20, i12, this.f45756t, this.f45758v);
        return i14 - i12;
    }

    @Override // com.fasterxml.jackson.core.f
    public void C(com.fasterxml.jackson.core.a aVar, byte[] bArr, int i10, int i11) {
        p2("write a binary value");
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i12 = this.f45758v;
        this.f45758v = i12 + 1;
        cArr[i12] = this.f45755s;
        C2(aVar, bArr, i10, i11 + i10);
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr2 = this.f45756t;
        int i13 = this.f45758v;
        this.f45758v = i13 + 1;
        cArr2[i13] = this.f45755s;
    }

    protected final void C2(com.fasterxml.jackson.core.a aVar, byte[] bArr, int i10, int i11) {
        int c10;
        int i12 = i11 - 3;
        int i13 = this.f45759w - 6;
        int g10 = aVar.g();
        loop0: while (true) {
            int i14 = g10 >> 2;
            while (i10 <= i12) {
                if (this.f45758v > i13) {
                    v2();
                }
                int i15 = i10 + 2;
                int i16 = ((bArr[i10 + 1] & 255) | (bArr[i10] << 8)) << 8;
                i10 += 3;
                c10 = aVar.c(i16 | (bArr[i15] & 255), this.f45756t, this.f45758v);
                this.f45758v = c10;
                i14--;
                if (i14 <= 0) {
                    break;
                }
            }
            char[] cArr = this.f45756t;
            int i17 = c10 + 1;
            this.f45758v = i17;
            cArr[c10] = '\\';
            this.f45758v = c10 + 2;
            cArr[i17] = 'n';
            g10 = aVar.g();
        }
        int i18 = i11 - i10;
        if (i18 > 0) {
            if (this.f45758v > i13) {
                v2();
            }
            int i19 = i10 + 1;
            int i20 = bArr[i10] << 16;
            if (i18 == 2) {
                i20 |= (bArr[i19] & 255) << 8;
            }
            this.f45758v = aVar.e(i20, i18, this.f45756t, this.f45758v);
        }
    }

    protected final void D2(n nVar, boolean z10) {
        if (this.f23142a != null) {
            I2(nVar, z10);
            return;
        }
        if (this.f45758v + 1 >= this.f45759w) {
            v2();
        }
        if (z10) {
            char[] cArr = this.f45756t;
            int i10 = this.f45758v;
            this.f45758v = i10 + 1;
            cArr[i10] = ',';
        }
        if (this.f45746o) {
            char[] a10 = nVar.a();
            z1(a10, 0, a10.length);
            return;
        }
        char[] cArr2 = this.f45756t;
        int i11 = this.f45758v;
        int i12 = i11 + 1;
        this.f45758v = i12;
        cArr2[i11] = this.f45755s;
        int c10 = nVar.c(cArr2, i12);
        if (c10 < 0) {
            F2(nVar);
            return;
        }
        int i13 = this.f45758v + c10;
        this.f45758v = i13;
        if (i13 >= this.f45759w) {
            v2();
        }
        char[] cArr3 = this.f45756t;
        int i14 = this.f45758v;
        this.f45758v = i14 + 1;
        cArr3[i14] = this.f45755s;
    }

    protected final void E2(String str, boolean z10) {
        if (this.f23142a != null) {
            J2(str, z10);
            return;
        }
        if (this.f45758v + 1 >= this.f45759w) {
            v2();
        }
        if (z10) {
            char[] cArr = this.f45756t;
            int i10 = this.f45758v;
            this.f45758v = i10 + 1;
            cArr[i10] = ',';
        }
        if (this.f45746o) {
            Q2(str);
            return;
        }
        char[] cArr2 = this.f45756t;
        int i11 = this.f45758v;
        this.f45758v = i11 + 1;
        cArr2[i11] = this.f45755s;
        Q2(str);
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr3 = this.f45756t;
        int i12 = this.f45758v;
        this.f45758v = i12 + 1;
        cArr3[i12] = this.f45755s;
    }

    @Override // com.fasterxml.jackson.core.f
    public void I(boolean z10) {
        int i10;
        p2("write a boolean value");
        if (this.f45758v + 5 >= this.f45759w) {
            v2();
        }
        int i11 = this.f45758v;
        char[] cArr = this.f45756t;
        if (z10) {
            cArr[i11] = 't';
            cArr[i11 + 1] = 'r';
            cArr[i11 + 2] = 'u';
            i10 = i11 + 3;
            cArr[i10] = 'e';
        } else {
            cArr[i11] = 'f';
            cArr[i11 + 1] = 'a';
            cArr[i11 + 2] = 'l';
            cArr[i11 + 3] = 's';
            i10 = i11 + 4;
            cArr[i10] = 'e';
        }
        this.f45758v = i10 + 1;
    }

    protected final void I2(n nVar, boolean z10) {
        if (z10) {
            this.f23142a.i(this);
        } else {
            this.f23142a.d(this);
        }
        char[] a10 = nVar.a();
        if (this.f45746o) {
            z1(a10, 0, a10.length);
            return;
        }
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        this.f45758v = i10 + 1;
        cArr[i10] = this.f45755s;
        z1(a10, 0, a10.length);
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr2 = this.f45756t;
        int i11 = this.f45758v;
        this.f45758v = i11 + 1;
        cArr2[i11] = this.f45755s;
    }

    protected final void J2(String str, boolean z10) {
        if (z10) {
            this.f23142a.i(this);
        } else {
            this.f23142a.d(this);
        }
        if (this.f45746o) {
            Q2(str);
            return;
        }
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        this.f45758v = i10 + 1;
        cArr[i10] = this.f45755s;
        Q2(str);
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr2 = this.f45756t;
        int i11 = this.f45758v;
        this.f45758v = i11 + 1;
        cArr2[i11] = this.f45755s;
    }

    @Override // com.fasterxml.jackson.core.f
    public void K() {
        if (!this.f44329h.d()) {
            a("Current context not Array but " + this.f44329h.f());
        }
        m mVar = this.f23142a;
        if (mVar != null) {
            mVar.j(this, this.f44329h.c());
        } else {
            if (this.f45758v >= this.f45759w) {
                v2();
            }
            char[] cArr = this.f45756t;
            int i10 = this.f45758v;
            this.f45758v = i10 + 1;
            cArr[i10] = ']';
        }
        this.f44329h = this.f44329h.h();
    }

    @Override // com.fasterxml.jackson.core.f
    public void M1() {
        p2("start an array");
        this.f44329h = this.f44329h.i();
        m mVar = this.f23142a;
        if (mVar != null) {
            mVar.g(this);
            return;
        }
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        this.f45758v = i10 + 1;
        cArr[i10] = '[';
    }

    @Override // com.fasterxml.jackson.core.f
    public void N() {
        if (!this.f44329h.e()) {
            a("Current context not Object but " + this.f44329h.f());
        }
        m mVar = this.f23142a;
        if (mVar != null) {
            mVar.f(this, this.f44329h.c());
        } else {
            if (this.f45758v >= this.f45759w) {
                v2();
            }
            char[] cArr = this.f45756t;
            int i10 = this.f45758v;
            this.f45758v = i10 + 1;
            cArr[i10] = '}';
        }
        this.f44329h = this.f44329h.h();
    }

    @Override // com.fasterxml.jackson.core.f
    public void N1(Object obj) {
        p2("start an array");
        this.f44329h = this.f44329h.j(obj);
        m mVar = this.f23142a;
        if (mVar != null) {
            mVar.g(this);
            return;
        }
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        this.f45758v = i10 + 1;
        cArr[i10] = '[';
    }

    @Override // com.fasterxml.jackson.core.f
    public void O0(int i10) {
        p2("write a number");
        if (this.f44328g) {
            K2(i10);
            return;
        }
        if (this.f45758v + 11 >= this.f45759w) {
            v2();
        }
        this.f45758v = y5.f.j(i10, this.f45756t, this.f45758v);
    }

    @Override // com.fasterxml.jackson.core.f
    public void O1(Object obj, int i10) {
        p2("start an array");
        this.f44329h = this.f44329h.j(obj);
        m mVar = this.f23142a;
        if (mVar != null) {
            mVar.g(this);
            return;
        }
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i11 = this.f45758v;
        this.f45758v = i11 + 1;
        cArr[i11] = '[';
    }

    @Override // com.fasterxml.jackson.core.f
    public void U1() {
        p2("start an object");
        this.f44329h = this.f44329h.k();
        m mVar = this.f23142a;
        if (mVar != null) {
            mVar.a(this);
            return;
        }
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        this.f45758v = i10 + 1;
        cArr[i10] = '{';
    }

    @Override // com.fasterxml.jackson.core.f
    public void Z0(long j10) {
        p2("write a number");
        if (this.f44328g) {
            L2(j10);
            return;
        }
        if (this.f45758v + 21 >= this.f45759w) {
            v2();
        }
        this.f45758v = y5.f.k(j10, this.f45756t, this.f45758v);
    }

    @Override // com.fasterxml.jackson.core.f
    public void a1(String str) {
        p2("write a number");
        if (str == null) {
            H2();
        } else if (this.f44328g) {
            M2(str);
        } else {
            y1(str);
        }
    }

    @Override // w5.AbstractC5038a, com.fasterxml.jackson.core.f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        if (this.f45756t != null && n(f.b.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                j j10 = j();
                if (!j10.d()) {
                    if (!j10.e()) {
                        break;
                    } else {
                        N();
                    }
                } else {
                    K();
                }
            }
        }
        v2();
        this.f45757u = 0;
        this.f45758v = 0;
        if (this.f45754r != null) {
            if (this.f45742k.f() || n(f.b.AUTO_CLOSE_TARGET)) {
                this.f45754r.close();
            } else if (n(f.b.FLUSH_PASSED_TO_STREAM)) {
                this.f45754r.flush();
            }
        }
        z2();
    }

    @Override // com.fasterxml.jackson.core.f
    public void e2(Object obj) {
        p2("start an object");
        this.f44329h = this.f44329h.l(obj);
        m mVar = this.f23142a;
        if (mVar != null) {
            mVar.a(this);
            return;
        }
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        this.f45758v = i10 + 1;
        cArr[i10] = '{';
    }

    @Override // java.io.Flushable
    public void flush() {
        v2();
        if (this.f45754r == null || !n(f.b.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.f45754r.flush();
    }

    @Override // com.fasterxml.jackson.core.f
    public void g1(BigDecimal bigDecimal) {
        p2("write a number");
        if (bigDecimal == null) {
            H2();
        } else if (this.f44328g) {
            M2(n2(bigDecimal));
        } else {
            y1(n2(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.f
    public void g2(n nVar) {
        p2("write a string");
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        int i11 = i10 + 1;
        this.f45758v = i11;
        cArr[i10] = this.f45755s;
        int c10 = nVar.c(cArr, i11);
        if (c10 < 0) {
            T2(nVar);
            return;
        }
        int i12 = this.f45758v + c10;
        this.f45758v = i12;
        if (i12 >= this.f45759w) {
            v2();
        }
        char[] cArr2 = this.f45756t;
        int i13 = this.f45758v;
        this.f45758v = i13 + 1;
        cArr2[i13] = this.f45755s;
    }

    @Override // com.fasterxml.jackson.core.f
    public void h2(String str) {
        p2("write a string");
        if (str == null) {
            H2();
            return;
        }
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        this.f45758v = i10 + 1;
        cArr[i10] = this.f45755s;
        Q2(str);
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr2 = this.f45756t;
        int i11 = this.f45758v;
        this.f45758v = i11 + 1;
        cArr2[i11] = this.f45755s;
    }

    @Override // com.fasterxml.jackson.core.f
    public void i0(n nVar) {
        int s10 = this.f44329h.s(nVar.getValue());
        if (s10 == 4) {
            a("Can not write a field name, expecting a value");
        }
        D2(nVar, s10 == 1);
    }

    @Override // com.fasterxml.jackson.core.f
    public void i1(BigInteger bigInteger) {
        p2("write a number");
        if (bigInteger == null) {
            H2();
        } else if (this.f44328g) {
            M2(bigInteger.toString());
        } else {
            y1(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.f
    public void i2(char[] cArr, int i10, int i11) {
        p2("write a string");
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr2 = this.f45756t;
        int i12 = this.f45758v;
        this.f45758v = i12 + 1;
        cArr2[i12] = this.f45755s;
        R2(cArr, i10, i11);
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr3 = this.f45756t;
        int i13 = this.f45758v;
        this.f45758v = i13 + 1;
        cArr3[i13] = this.f45755s;
    }

    @Override // com.fasterxml.jackson.core.f
    public void l1(short s10) {
        p2("write a number");
        if (this.f44328g) {
            N2(s10);
            return;
        }
        if (this.f45758v + 6 >= this.f45759w) {
            v2();
        }
        this.f45758v = y5.f.j(s10, this.f45756t, this.f45758v);
    }

    @Override // com.fasterxml.jackson.core.f
    public void o0(String str) {
        int s10 = this.f44329h.s(str);
        if (s10 == 4) {
            a("Can not write a field name, expecting a value");
        }
        E2(str, s10 == 1);
    }

    @Override // w5.AbstractC5038a
    protected final void p2(String str) {
        char c10;
        int t10 = this.f44329h.t();
        if (this.f23142a != null) {
            r2(str, t10);
            return;
        }
        if (t10 == 1) {
            c10 = ',';
        } else {
            if (t10 != 2) {
                if (t10 != 3) {
                    if (t10 != 5) {
                        return;
                    }
                    q2(str);
                    return;
                } else {
                    n nVar = this.f45745n;
                    if (nVar != null) {
                        y1(nVar.getValue());
                        return;
                    }
                    return;
                }
            }
            c10 = ':';
        }
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        this.f45758v = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // com.fasterxml.jackson.core.f
    public void v1(char c10) {
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i10 = this.f45758v;
        this.f45758v = i10 + 1;
        cArr[i10] = c10;
    }

    protected void v2() {
        int i10 = this.f45758v;
        int i11 = this.f45757u;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this.f45757u = 0;
            this.f45758v = 0;
            this.f45754r.write(this.f45756t, i11, i12);
        }
    }

    @Override // com.fasterxml.jackson.core.f
    public void x1(n nVar) {
        int b10 = nVar.b(this.f45756t, this.f45758v);
        if (b10 < 0) {
            y1(nVar.getValue());
        } else {
            this.f45758v += b10;
        }
    }

    @Override // com.fasterxml.jackson.core.f
    public int y(com.fasterxml.jackson.core.a aVar, InputStream inputStream, int i10) {
        p2("write a binary value");
        if (this.f45758v >= this.f45759w) {
            v2();
        }
        char[] cArr = this.f45756t;
        int i11 = this.f45758v;
        this.f45758v = i11 + 1;
        cArr[i11] = this.f45755s;
        byte[] d10 = this.f45742k.d();
        try {
            if (i10 < 0) {
                i10 = A2(aVar, inputStream, d10);
            } else {
                int B22 = B2(aVar, inputStream, d10, i10);
                if (B22 > 0) {
                    a("Too few bytes available: missing " + B22 + " bytes (out of " + i10 + ")");
                }
            }
            this.f45742k.g(d10);
            if (this.f45758v >= this.f45759w) {
                v2();
            }
            char[] cArr2 = this.f45756t;
            int i12 = this.f45758v;
            this.f45758v = i12 + 1;
            cArr2[i12] = this.f45755s;
            return i10;
        } catch (Throwable th) {
            this.f45742k.g(d10);
            throw th;
        }
    }

    @Override // com.fasterxml.jackson.core.f
    public void y0() {
        p2("write a null");
        H2();
    }

    @Override // com.fasterxml.jackson.core.f
    public void y1(String str) {
        int length = str.length();
        int i10 = this.f45759w - this.f45758v;
        if (i10 == 0) {
            v2();
            i10 = this.f45759w - this.f45758v;
        }
        if (i10 < length) {
            W2(str);
        } else {
            str.getChars(0, length, this.f45756t, this.f45758v);
            this.f45758v += length;
        }
    }

    @Override // com.fasterxml.jackson.core.f
    public void z0(double d10) {
        if (this.f44328g || (y5.f.h(d10) && n(f.b.QUOTE_NON_NUMERIC_NUMBERS))) {
            h2(String.valueOf(d10));
        } else {
            p2("write a number");
            y1(String.valueOf(d10));
        }
    }

    @Override // com.fasterxml.jackson.core.f
    public void z1(char[] cArr, int i10, int i11) {
        if (i11 >= 32) {
            v2();
            this.f45754r.write(cArr, i10, i11);
        } else {
            if (i11 > this.f45759w - this.f45758v) {
                v2();
            }
            System.arraycopy(cArr, i10, this.f45756t, this.f45758v, i11);
            this.f45758v += i11;
        }
    }

    protected void z2() {
        char[] cArr = this.f45756t;
        if (cArr != null) {
            this.f45756t = null;
            this.f45742k.h(cArr);
        }
        char[] cArr2 = this.f45762z;
        if (cArr2 != null) {
            this.f45762z = null;
            this.f45742k.i(cArr2);
        }
    }
}
