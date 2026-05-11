package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2048f0 {
    static int a(byte[] bArr, int i10, C2045e0 c2045e0) {
        int h10 = h(bArr, i10, c2045e0);
        int i11 = c2045e0.f23701a;
        if (i11 < 0) {
            throw H0.c();
        }
        if (i11 > bArr.length - h10) {
            throw H0.f();
        }
        if (i11 == 0) {
            c2045e0.f23703c = AbstractC2081q0.f23760b;
            return h10;
        }
        c2045e0.f23703c = AbstractC2081q0.v(bArr, h10, i11);
        return h10 + i11;
    }

    static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int c(InterfaceC2067l1 interfaceC2067l1, byte[] bArr, int i10, int i11, int i12, C2045e0 c2045e0) {
        Object f10 = interfaceC2067l1.f();
        int l10 = l(f10, interfaceC2067l1, bArr, i10, i11, i12, c2045e0);
        interfaceC2067l1.c(f10);
        c2045e0.f23703c = f10;
        return l10;
    }

    static int d(InterfaceC2067l1 interfaceC2067l1, byte[] bArr, int i10, int i11, C2045e0 c2045e0) {
        Object f10 = interfaceC2067l1.f();
        int m10 = m(f10, interfaceC2067l1, bArr, i10, i11, c2045e0);
        interfaceC2067l1.c(f10);
        c2045e0.f23703c = f10;
        return m10;
    }

    static int e(InterfaceC2067l1 interfaceC2067l1, int i10, byte[] bArr, int i11, int i12, E0 e02, C2045e0 c2045e0) {
        int d10 = d(interfaceC2067l1, bArr, i11, i12, c2045e0);
        e02.add(c2045e0.f23703c);
        while (d10 < i12) {
            int h10 = h(bArr, d10, c2045e0);
            if (i10 != c2045e0.f23701a) {
                break;
            }
            d10 = d(interfaceC2067l1, bArr, h10, i12, c2045e0);
            e02.add(c2045e0.f23703c);
        }
        return d10;
    }

    static int f(byte[] bArr, int i10, E0 e02, C2045e0 c2045e0) {
        android.support.v4.media.session.b.a(e02);
        int h10 = h(bArr, i10, c2045e0);
        int i11 = c2045e0.f23701a + h10;
        if (h10 < i11) {
            h(bArr, h10, c2045e0);
            throw null;
        }
        if (h10 == i11) {
            return h10;
        }
        throw H0.f();
    }

    static int g(int i10, byte[] bArr, int i11, int i12, C2087s1 c2087s1, C2045e0 c2045e0) {
        if ((i10 >>> 3) == 0) {
            throw H0.a();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int k10 = k(bArr, i11, c2045e0);
            c2087s1.h(i10, Long.valueOf(c2045e0.f23702b));
            return k10;
        }
        if (i13 == 1) {
            c2087s1.h(i10, Long.valueOf(n(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int h10 = h(bArr, i11, c2045e0);
            int i14 = c2045e0.f23701a;
            if (i14 < 0) {
                throw H0.c();
            }
            if (i14 > bArr.length - h10) {
                throw H0.f();
            }
            if (i14 == 0) {
                c2087s1.h(i10, AbstractC2081q0.f23760b);
            } else {
                c2087s1.h(i10, AbstractC2081q0.v(bArr, h10, i14));
            }
            return h10 + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw H0.a();
            }
            c2087s1.h(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        C2087s1 d10 = C2087s1.d();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int h11 = h(bArr, i11, c2045e0);
            int i17 = c2045e0.f23701a;
            i16 = i17;
            if (i17 == i15) {
                i11 = h11;
                break;
            }
            int g10 = g(i16, bArr, h11, i12, d10, c2045e0);
            i16 = i17;
            i11 = g10;
        }
        if (i11 > i12 || i16 != i15) {
            throw H0.d();
        }
        c2087s1.h(i10, d10);
        return i11;
    }

    static int h(byte[] bArr, int i10, C2045e0 c2045e0) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return i(b10, bArr, i11, c2045e0);
        }
        c2045e0.f23701a = b10;
        return i11;
    }

    static int i(int i10, byte[] bArr, int i11, C2045e0 c2045e0) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            c2045e0.f23701a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c2045e0.f23701a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c2045e0.f23701a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c2045e0.f23701a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c2045e0.f23701a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int j(int i10, byte[] bArr, int i11, int i12, E0 e02, C2045e0 c2045e0) {
        android.support.v4.media.session.b.a(e02);
        h(bArr, i11, c2045e0);
        int i13 = c2045e0.f23701a;
        throw null;
    }

    static int k(byte[] bArr, int i10, C2045e0 c2045e0) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c2045e0.f23702b = j10;
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
        c2045e0.f23702b = j11;
        return i12;
    }

    static int l(Object obj, InterfaceC2067l1 interfaceC2067l1, byte[] bArr, int i10, int i11, int i12, C2045e0 c2045e0) {
        int q10 = ((C2043d1) interfaceC2067l1).q(obj, bArr, i10, i11, i12, c2045e0);
        c2045e0.f23703c = obj;
        return q10;
    }

    static int m(Object obj, InterfaceC2067l1 interfaceC2067l1, byte[] bArr, int i10, int i11, C2045e0 c2045e0) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = i(i13, bArr, i12, c2045e0);
            i13 = c2045e0.f23701a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw H0.f();
        }
        int i15 = i13 + i14;
        interfaceC2067l1.g(obj, bArr, i14, i15, c2045e0);
        c2045e0.f23703c = obj;
        return i15;
    }

    static long n(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
