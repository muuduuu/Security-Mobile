package com.google.android.gms.internal.clearcut;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.clearcut.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2167u {
    static int a(int i10, byte[] bArr, int i11, int i12, C2170v c2170v) {
        if ((i10 >>> 3) == 0) {
            throw C2127g0.b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return g(bArr, i11, c2170v);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return e(bArr, i11, c2170v) + c2170v.f24100a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw C2127g0.b();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = e(bArr, i11, c2170v);
            i15 = c2170v.f24100a;
            if (i15 == i14) {
                break;
            }
            i11 = a(i15, bArr, i11, i12, c2170v);
        }
        if (i11 > i12 || i15 != i14) {
            throw C2127g0.d();
        }
        return i11;
    }

    static int b(int i10, byte[] bArr, int i11, int i12, InterfaceC2124f0 interfaceC2124f0, C2170v c2170v) {
        android.support.v4.media.session.b.a(interfaceC2124f0);
        e(bArr, i11, c2170v);
        int i13 = c2170v.f24100a;
        throw null;
    }

    static int c(int i10, byte[] bArr, int i11, int i12, Z0 z02, C2170v c2170v) {
        if ((i10 >>> 3) == 0) {
            throw C2127g0.b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int g10 = g(bArr, i11, c2170v);
            z02.e(i10, Long.valueOf(c2170v.f24101b));
            return g10;
        }
        if (i13 == 1) {
            z02.e(i10, Long.valueOf(k(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int e10 = e(bArr, i11, c2170v);
            int i14 = c2170v.f24100a;
            z02.e(i10, i14 == 0 ? AbstractC2179y.f24108b : AbstractC2179y.t(bArr, e10, i14));
            return e10 + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw C2127g0.b();
            }
            z02.e(i10, Integer.valueOf(h(bArr, i11)));
            return i11 + 4;
        }
        Z0 i15 = Z0.i();
        int i16 = (i10 & (-8)) | 4;
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int e11 = e(bArr, i11, c2170v);
            int i18 = c2170v.f24100a;
            i17 = i18;
            if (i18 == i16) {
                i11 = e11;
                break;
            }
            int c10 = c(i17, bArr, e11, i12, i15, c2170v);
            i17 = i18;
            i11 = c10;
        }
        if (i11 > i12 || i17 != i16) {
            throw C2127g0.d();
        }
        z02.e(i10, i15);
        return i11;
    }

    static int d(int i10, byte[] bArr, int i11, C2170v c2170v) {
        int i12;
        int i13 = i10 & 127;
        int i14 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            i12 = b10 << 7;
        } else {
            int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
            int i16 = i11 + 2;
            byte b11 = bArr[i14];
            if (b11 >= 0) {
                c2170v.f24100a = i15 | (b11 << 14);
                return i16;
            }
            i13 = i15 | ((b11 & Byte.MAX_VALUE) << 14);
            i14 = i11 + 3;
            byte b12 = bArr[i16];
            if (b12 >= 0) {
                i12 = b12 << 21;
            } else {
                int i17 = i13 | ((b12 & Byte.MAX_VALUE) << 21);
                int i18 = i11 + 4;
                byte b13 = bArr[i14];
                if (b13 >= 0) {
                    c2170v.f24100a = i17 | (b13 << 28);
                    return i18;
                }
                int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
                while (true) {
                    int i20 = i18 + 1;
                    if (bArr[i18] >= 0) {
                        c2170v.f24100a = i19;
                        return i20;
                    }
                    i18 = i20;
                }
            }
        }
        c2170v.f24100a = i13 | i12;
        return i14;
    }

    static int e(byte[] bArr, int i10, C2170v c2170v) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return d(b10, bArr, i11, c2170v);
        }
        c2170v.f24100a = b10;
        return i11;
    }

    static int f(byte[] bArr, int i10, InterfaceC2124f0 interfaceC2124f0, C2170v c2170v) {
        android.support.v4.media.session.b.a(interfaceC2124f0);
        int e10 = e(bArr, i10, c2170v);
        int i11 = c2170v.f24100a + e10;
        if (e10 < i11) {
            e(bArr, e10, c2170v);
            throw null;
        }
        if (e10 == i11) {
            return e10;
        }
        throw C2127g0.a();
    }

    static int g(byte[] bArr, int i10, C2170v c2170v) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            c2170v.f24101b = j10;
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
        c2170v.f24101b = j11;
        return i12;
    }

    static int h(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int i(byte[] bArr, int i10, C2170v c2170v) {
        int e10 = e(bArr, i10, c2170v);
        int i11 = c2170v.f24100a;
        if (i11 == 0) {
            c2170v.f24102c = BuildConfig.FLAVOR;
            return e10;
        }
        c2170v.f24102c = new String(bArr, e10, i11, AbstractC2115c0.f24018a);
        return e10 + i11;
    }

    static int j(byte[] bArr, int i10, C2170v c2170v) {
        int e10 = e(bArr, i10, c2170v);
        int i11 = c2170v.f24100a;
        if (i11 == 0) {
            c2170v.f24102c = BuildConfig.FLAVOR;
            return e10;
        }
        int i12 = e10 + i11;
        if (!AbstractC2131h1.i(bArr, e10, i12)) {
            throw C2127g0.e();
        }
        c2170v.f24102c = new String(bArr, e10, i11, AbstractC2115c0.f24018a);
        return i12;
    }

    static long k(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    static double l(byte[] bArr, int i10) {
        return Double.longBitsToDouble(k(bArr, i10));
    }

    static int m(byte[] bArr, int i10, C2170v c2170v) {
        int e10 = e(bArr, i10, c2170v);
        int i11 = c2170v.f24100a;
        if (i11 == 0) {
            c2170v.f24102c = AbstractC2179y.f24108b;
            return e10;
        }
        c2170v.f24102c = AbstractC2179y.t(bArr, e10, i11);
        return e10 + i11;
    }

    static float n(byte[] bArr, int i10) {
        return Float.intBitsToFloat(h(bArr, i10));
    }
}
