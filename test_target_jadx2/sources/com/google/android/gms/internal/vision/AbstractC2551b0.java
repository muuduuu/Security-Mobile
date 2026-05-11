package com.google.android.gms.internal.vision;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.vision.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2551b0 {
    static int a(int i10, byte[] bArr, int i11, int i12, X0 x02, C2555c0 c2555c0) {
        P0 p02 = (P0) x02;
        int h10 = h(bArr, i11, c2555c0);
        p02.h(c2555c0.f25109a);
        while (h10 < i12) {
            int h11 = h(bArr, h10, c2555c0);
            if (i10 != c2555c0.f25109a) {
                break;
            }
            h10 = h(bArr, h11, c2555c0);
            p02.h(c2555c0.f25109a);
        }
        return h10;
    }

    static int b(int i10, byte[] bArr, int i11, int i12, C2561d2 c2561d2, C2555c0 c2555c0) {
        if ((i10 >>> 3) == 0) {
            throw W0.c();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int j10 = j(bArr, i11, c2555c0);
            c2561d2.c(i10, Long.valueOf(c2555c0.f25110b));
            return j10;
        }
        if (i13 == 1) {
            c2561d2.c(i10, Long.valueOf(k(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int h10 = h(bArr, i11, c2555c0);
            int i14 = c2555c0.f25109a;
            if (i14 < 0) {
                throw W0.b();
            }
            if (i14 > bArr.length - h10) {
                throw W0.a();
            }
            if (i14 == 0) {
                c2561d2.c(i10, AbstractC2570g0.f25133b);
            } else {
                c2561d2.c(i10, AbstractC2570g0.r(bArr, h10, i14));
            }
            return h10 + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw W0.c();
            }
            c2561d2.c(i10, Integer.valueOf(g(bArr, i11)));
            return i11 + 4;
        }
        C2561d2 g10 = C2561d2.g();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int h11 = h(bArr, i11, c2555c0);
            int i17 = c2555c0.f25109a;
            i16 = i17;
            if (i17 == i15) {
                i11 = h11;
                break;
            }
            int b10 = b(i16, bArr, h11, i12, g10, c2555c0);
            i16 = i17;
            i11 = b10;
        }
        if (i11 > i12 || i16 != i15) {
            throw W0.e();
        }
        c2561d2.c(i10, g10);
        return i11;
    }

    static int c(int i10, byte[] bArr, int i11, C2555c0 c2555c0) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            c2555c0.f25109a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            c2555c0.f25109a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c2555c0.f25109a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c2555c0.f25109a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c2555c0.f25109a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int d(K1 k12, int i10, byte[] bArr, int i11, int i12, X0 x02, C2555c0 c2555c0) {
        int f10 = f(k12, bArr, i11, i12, c2555c0);
        x02.add(c2555c0.f25111c);
        while (f10 < i12) {
            int h10 = h(bArr, f10, c2555c0);
            if (i10 != c2555c0.f25109a) {
                break;
            }
            f10 = f(k12, bArr, h10, i12, c2555c0);
            x02.add(c2555c0.f25111c);
        }
        return f10;
    }

    static int e(K1 k12, byte[] bArr, int i10, int i11, int i12, C2555c0 c2555c0) {
        C2621x1 c2621x1 = (C2621x1) k12;
        Object zza = c2621x1.zza();
        int n10 = c2621x1.n(zza, bArr, i10, i11, i12, c2555c0);
        c2621x1.a(zza);
        c2555c0.f25111c = zza;
        return n10;
    }

    static int f(K1 k12, byte[] bArr, int i10, int i11, C2555c0 c2555c0) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = c(i13, bArr, i12, c2555c0);
            i13 = c2555c0.f25109a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw W0.a();
        }
        Object zza = k12.zza();
        int i15 = i13 + i14;
        k12.h(zza, bArr, i14, i15, c2555c0);
        k12.a(zza);
        c2555c0.f25111c = zza;
        return i15;
    }

    static int g(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int h(byte[] bArr, int i10, C2555c0 c2555c0) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return c(b10, bArr, i11, c2555c0);
        }
        c2555c0.f25109a = b10;
        return i11;
    }

    static int i(byte[] bArr, int i10, X0 x02, C2555c0 c2555c0) {
        P0 p02 = (P0) x02;
        int h10 = h(bArr, i10, c2555c0);
        int i11 = c2555c0.f25109a + h10;
        while (h10 < i11) {
            h10 = h(bArr, h10, c2555c0);
            p02.h(c2555c0.f25109a);
        }
        if (h10 == i11) {
            return h10;
        }
        throw W0.a();
    }

    static int j(byte[] bArr, int i10, C2555c0 c2555c0) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            c2555c0.f25110b = j10;
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
        c2555c0.f25110b = j11;
        return i12;
    }

    static long k(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    static double l(byte[] bArr, int i10) {
        return Double.longBitsToDouble(k(bArr, i10));
    }

    static int m(byte[] bArr, int i10, C2555c0 c2555c0) {
        int h10 = h(bArr, i10, c2555c0);
        int i11 = c2555c0.f25109a;
        if (i11 < 0) {
            throw W0.b();
        }
        if (i11 == 0) {
            c2555c0.f25111c = BuildConfig.FLAVOR;
            return h10;
        }
        c2555c0.f25111c = new String(bArr, h10, i11, R0.f25076a);
        return h10 + i11;
    }

    static float n(byte[] bArr, int i10) {
        return Float.intBitsToFloat(g(bArr, i10));
    }

    static int o(byte[] bArr, int i10, C2555c0 c2555c0) {
        int h10 = h(bArr, i10, c2555c0);
        int i11 = c2555c0.f25109a;
        if (i11 < 0) {
            throw W0.b();
        }
        if (i11 == 0) {
            c2555c0.f25111c = BuildConfig.FLAVOR;
            return h10;
        }
        c2555c0.f25111c = k2.k(bArr, h10, i11);
        return h10 + i11;
    }

    static int p(byte[] bArr, int i10, C2555c0 c2555c0) {
        int h10 = h(bArr, i10, c2555c0);
        int i11 = c2555c0.f25109a;
        if (i11 < 0) {
            throw W0.b();
        }
        if (i11 > bArr.length - h10) {
            throw W0.a();
        }
        if (i11 == 0) {
            c2555c0.f25111c = AbstractC2570g0.f25133b;
            return h10;
        }
        c2555c0.f25111c = AbstractC2570g0.r(bArr, h10, i11);
        return h10 + i11;
    }
}
