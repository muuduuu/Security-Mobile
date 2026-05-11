package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2507s0 {
    static int a(byte[] bArr, int i10, C2502r0 c2502r0) {
        int j10 = j(bArr, i10, c2502r0);
        int i11 = c2502r0.f24918a;
        if (i11 < 0) {
            throw C2499q1.d();
        }
        if (i11 > bArr.length - j10) {
            throw C2499q1.g();
        }
        if (i11 == 0) {
            c2502r0.f24920c = E0.f24749b;
            return j10;
        }
        c2502r0.f24920c = E0.G(bArr, j10, i11);
        return j10 + i11;
    }

    static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int c(InterfaceC2460i2 interfaceC2460i2, byte[] bArr, int i10, int i11, int i12, C2502r0 c2502r0) {
        Object g10 = interfaceC2460i2.g();
        int n10 = n(g10, interfaceC2460i2, bArr, i10, i11, i12, c2502r0);
        interfaceC2460i2.f(g10);
        c2502r0.f24920c = g10;
        return n10;
    }

    static int d(InterfaceC2460i2 interfaceC2460i2, byte[] bArr, int i10, int i11, C2502r0 c2502r0) {
        Object g10 = interfaceC2460i2.g();
        int o10 = o(g10, interfaceC2460i2, bArr, i10, i11, c2502r0);
        interfaceC2460i2.f(g10);
        c2502r0.f24920c = g10;
        return o10;
    }

    static int e(InterfaceC2460i2 interfaceC2460i2, int i10, byte[] bArr, int i11, int i12, InterfaceC2484n1 interfaceC2484n1, C2502r0 c2502r0) {
        int d10 = d(interfaceC2460i2, bArr, i11, i12, c2502r0);
        interfaceC2484n1.add(c2502r0.f24920c);
        while (d10 < i12) {
            int j10 = j(bArr, d10, c2502r0);
            if (i10 != c2502r0.f24918a) {
                break;
            }
            d10 = d(interfaceC2460i2, bArr, j10, i12, c2502r0);
            interfaceC2484n1.add(c2502r0.f24920c);
        }
        return d10;
    }

    static int f(byte[] bArr, int i10, InterfaceC2484n1 interfaceC2484n1, C2502r0 c2502r0) {
        C2449g1 c2449g1 = (C2449g1) interfaceC2484n1;
        int j10 = j(bArr, i10, c2502r0);
        int i11 = c2502r0.f24918a + j10;
        while (j10 < i11) {
            j10 = j(bArr, j10, c2502r0);
            c2449g1.j(c2502r0.f24918a);
        }
        if (j10 == i11) {
            return j10;
        }
        throw C2499q1.g();
    }

    static int g(byte[] bArr, int i10, C2502r0 c2502r0) {
        int j10 = j(bArr, i10, c2502r0);
        int i11 = c2502r0.f24918a;
        if (i11 < 0) {
            throw C2499q1.d();
        }
        if (i11 == 0) {
            c2502r0.f24920c = BuildConfig.FLAVOR;
            return j10;
        }
        c2502r0.f24920c = new String(bArr, j10, i11, AbstractC2489o1.f24885b);
        return j10 + i11;
    }

    static int h(byte[] bArr, int i10, C2502r0 c2502r0) {
        int j10 = j(bArr, i10, c2502r0);
        int i11 = c2502r0.f24918a;
        if (i11 < 0) {
            throw C2499q1.d();
        }
        if (i11 == 0) {
            c2502r0.f24920c = BuildConfig.FLAVOR;
            return j10;
        }
        int length = bArr.length;
        int i12 = O2.f24788b;
        if ((j10 | i11 | ((length - j10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(j10), Integer.valueOf(i11)));
        }
        int i13 = j10 + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (j10 < i13) {
            byte b10 = bArr[j10];
            if (!K2.d(b10)) {
                break;
            }
            j10++;
            cArr[i14] = (char) b10;
            i14++;
        }
        int i15 = i14;
        while (j10 < i13) {
            int i16 = j10 + 1;
            byte b11 = bArr[j10];
            if (K2.d(b11)) {
                cArr[i15] = (char) b11;
                i15++;
                j10 = i16;
                while (j10 < i13) {
                    byte b12 = bArr[j10];
                    if (K2.d(b12)) {
                        j10++;
                        cArr[i15] = (char) b12;
                        i15++;
                    }
                }
            } else if (b11 < -32) {
                if (i16 >= i13) {
                    throw C2499q1.c();
                }
                j10 += 2;
                K2.c(b11, bArr[i16], cArr, i15);
                i15++;
            } else if (b11 < -16) {
                if (i16 >= i13 - 1) {
                    throw C2499q1.c();
                }
                int i17 = j10 + 2;
                j10 += 3;
                K2.b(b11, bArr[i16], bArr[i17], cArr, i15);
                i15++;
            } else {
                if (i16 >= i13 - 2) {
                    throw C2499q1.c();
                }
                byte b13 = bArr[i16];
                int i18 = j10 + 3;
                byte b14 = bArr[j10 + 2];
                j10 += 4;
                K2.a(b11, b13, b14, bArr[i18], cArr, i15);
                i15 += 2;
            }
        }
        c2502r0.f24920c = new String(cArr, 0, i15);
        return i13;
    }

    static int i(int i10, byte[] bArr, int i11, int i12, C2544z2 c2544z2, C2502r0 c2502r0) {
        if ((i10 >>> 3) == 0) {
            throw C2499q1.b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int m10 = m(bArr, i11, c2502r0);
            c2544z2.j(i10, Long.valueOf(c2502r0.f24919b));
            return m10;
        }
        if (i13 == 1) {
            c2544z2.j(i10, Long.valueOf(q(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int j10 = j(bArr, i11, c2502r0);
            int i14 = c2502r0.f24918a;
            if (i14 < 0) {
                throw C2499q1.d();
            }
            if (i14 > bArr.length - j10) {
                throw C2499q1.g();
            }
            if (i14 == 0) {
                c2544z2.j(i10, E0.f24749b);
            } else {
                c2544z2.j(i10, E0.G(bArr, j10, i14));
            }
            return j10 + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw C2499q1.b();
            }
            c2544z2.j(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        C2544z2 f10 = C2544z2.f();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int j11 = j(bArr, i11, c2502r0);
            int i17 = c2502r0.f24918a;
            i16 = i17;
            if (i17 == i15) {
                i11 = j11;
                break;
            }
            int i18 = i(i16, bArr, j11, i12, f10, c2502r0);
            i16 = i17;
            i11 = i18;
        }
        if (i11 > i12 || i16 != i15) {
            throw C2499q1.e();
        }
        c2544z2.j(i10, f10);
        return i11;
    }

    static int j(byte[] bArr, int i10, C2502r0 c2502r0) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return k(b10, bArr, i11, c2502r0);
        }
        c2502r0.f24918a = b10;
        return i11;
    }

    static int k(int i10, byte[] bArr, int i11, C2502r0 c2502r0) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            c2502r0.f24918a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c2502r0.f24918a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c2502r0.f24918a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c2502r0.f24918a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c2502r0.f24918a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int l(int i10, byte[] bArr, int i11, int i12, InterfaceC2484n1 interfaceC2484n1, C2502r0 c2502r0) {
        C2449g1 c2449g1 = (C2449g1) interfaceC2484n1;
        int j10 = j(bArr, i11, c2502r0);
        c2449g1.j(c2502r0.f24918a);
        while (j10 < i12) {
            int j11 = j(bArr, j10, c2502r0);
            if (i10 != c2502r0.f24918a) {
                break;
            }
            j10 = j(bArr, j11, c2502r0);
            c2449g1.j(c2502r0.f24918a);
        }
        return j10;
    }

    static int m(byte[] bArr, int i10, C2502r0 c2502r0) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c2502r0.f24919b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        c2502r0.f24919b = j11;
        return i12;
    }

    static int n(Object obj, InterfaceC2460i2 interfaceC2460i2, byte[] bArr, int i10, int i11, int i12, C2502r0 c2502r0) {
        int F10 = ((S1) interfaceC2460i2).F(obj, bArr, i10, i11, i12, c2502r0);
        c2502r0.f24920c = obj;
        return F10;
    }

    static int o(Object obj, InterfaceC2460i2 interfaceC2460i2, byte[] bArr, int i10, int i11, C2502r0 c2502r0) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = k(i13, bArr, i12, c2502r0);
            i13 = c2502r0.f24918a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw C2499q1.g();
        }
        int i15 = i13 + i14;
        interfaceC2460i2.j(obj, bArr, i14, i15, c2502r0);
        c2502r0.f24920c = obj;
        return i15;
    }

    static int p(int i10, byte[] bArr, int i11, int i12, C2502r0 c2502r0) {
        if ((i10 >>> 3) == 0) {
            throw C2499q1.b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return m(bArr, i11, c2502r0);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return j(bArr, i11, c2502r0) + c2502r0.f24918a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw C2499q1.b();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = j(bArr, i11, c2502r0);
            i15 = c2502r0.f24918a;
            if (i15 == i14) {
                break;
            }
            i11 = p(i15, bArr, i11, i12, c2502r0);
        }
        if (i11 > i12 || i15 != i14) {
            throw C2499q1.e();
        }
        return i11;
    }

    static long q(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
