package com.google.android.gms.internal.measurement;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.y4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2405y4 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f24698a = 100;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24699b = 0;

    static int a(byte[] bArr, int i10, C2396x4 c2396x4) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return b(b10, bArr, i11, c2396x4);
        }
        c2396x4.f24687a = b10;
        return i11;
    }

    static int b(int i10, byte[] bArr, int i11, C2396x4 c2396x4) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            c2396x4.f24687a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c2396x4.f24687a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c2396x4.f24687a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c2396x4.f24687a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c2396x4.f24687a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int c(byte[] bArr, int i10, C2396x4 c2396x4) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c2396x4.f24688b = j10;
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
        c2396x4.f24688b = j11;
        return i12;
    }

    static int d(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static long e(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    static int f(byte[] bArr, int i10, C2396x4 c2396x4) {
        int i11;
        int a10 = a(bArr, i10, c2396x4);
        int i12 = c2396x4.f24687a;
        if (i12 < 0) {
            throw new C2326p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            c2396x4.f24689c = BuildConfig.FLAVOR;
            return a10;
        }
        int i13 = AbstractC2309n6.f24583a;
        int length = bArr.length;
        if ((((length - a10) - i12) | a10 | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(a10), Integer.valueOf(i12)));
        }
        int i14 = a10 + i12;
        char[] cArr = new char[i12];
        int i15 = 0;
        while (a10 < i14) {
            byte b10 = bArr[a10];
            if (!AbstractC2291l6.a(b10)) {
                break;
            }
            a10++;
            cArr[i15] = (char) b10;
            i15++;
        }
        int i16 = i15;
        while (a10 < i14) {
            int i17 = a10 + 1;
            byte b11 = bArr[a10];
            if (AbstractC2291l6.a(b11)) {
                cArr[i16] = (char) b11;
                i16++;
                a10 = i17;
                while (a10 < i14) {
                    byte b12 = bArr[a10];
                    if (AbstractC2291l6.a(b12)) {
                        a10++;
                        cArr[i16] = (char) b12;
                        i16++;
                    }
                }
            } else {
                if (b11 < -32) {
                    if (i17 >= i14) {
                        throw new C2326p5("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    a10 += 2;
                    AbstractC2291l6.b(b11, bArr[i17], cArr, i16);
                } else if (b11 < -16) {
                    if (i17 >= i14 - 1) {
                        throw new C2326p5("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    int i18 = a10 + 2;
                    a10 += 3;
                    AbstractC2291l6.c(b11, bArr[i17], bArr[i18], cArr, i16);
                } else {
                    if (i17 >= i14 - 2) {
                        throw new C2326p5("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i17];
                    int i19 = a10 + 3;
                    byte b14 = bArr[a10 + 2];
                    a10 += 4;
                    AbstractC2291l6.d(b11, b13, b14, bArr[i19], cArr, i16);
                    i16 += 2;
                }
                i16 = i11;
            }
        }
        c2396x4.f24689c = new String(cArr, 0, i16);
        return i14;
    }

    static int g(byte[] bArr, int i10, C2396x4 c2396x4) {
        int a10 = a(bArr, i10, c2396x4);
        int i11 = c2396x4.f24687a;
        if (i11 < 0) {
            throw new C2326p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - a10) {
            throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            c2396x4.f24689c = J4.f24246b;
            return a10;
        }
        c2396x4.f24689c = J4.r(bArr, a10, i11);
        return a10 + i11;
    }

    static int h(S5 s52, byte[] bArr, int i10, int i11, C2396x4 c2396x4) {
        Object zza = s52.zza();
        int j10 = j(zza, s52, bArr, i10, i11, c2396x4);
        s52.g(zza);
        c2396x4.f24689c = zza;
        return j10;
    }

    static int i(S5 s52, byte[] bArr, int i10, int i11, int i12, C2396x4 c2396x4) {
        Object zza = s52.zza();
        int k10 = k(zza, s52, bArr, i10, i11, i12, c2396x4);
        s52.g(zza);
        c2396x4.f24689c = zza;
        return k10;
    }

    static int j(Object obj, S5 s52, byte[] bArr, int i10, int i11, C2396x4 c2396x4) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = b(i13, bArr, i12, c2396x4);
            i13 = c2396x4.f24687a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = c2396x4.f24691e + 1;
        c2396x4.f24691e = i15;
        q(i15);
        int i16 = i13 + i14;
        s52.e(obj, bArr, i14, i16, c2396x4);
        c2396x4.f24691e--;
        c2396x4.f24689c = obj;
        return i16;
    }

    static int k(Object obj, S5 s52, byte[] bArr, int i10, int i11, int i12, C2396x4 c2396x4) {
        K5 k52 = (K5) s52;
        int i13 = c2396x4.f24691e + 1;
        c2396x4.f24691e = i13;
        q(i13);
        int z10 = k52.z(obj, bArr, i10, i11, i12, c2396x4);
        c2396x4.f24691e--;
        c2396x4.f24689c = obj;
        return z10;
    }

    static int l(int i10, byte[] bArr, int i11, int i12, InterfaceC2299m5 interfaceC2299m5, C2396x4 c2396x4) {
        C2254h5 c2254h5 = (C2254h5) interfaceC2299m5;
        int a10 = a(bArr, i11, c2396x4);
        c2254h5.j(c2396x4.f24687a);
        while (a10 < i12) {
            int a11 = a(bArr, a10, c2396x4);
            if (i10 != c2396x4.f24687a) {
                break;
            }
            a10 = a(bArr, a11, c2396x4);
            c2254h5.j(c2396x4.f24687a);
        }
        return a10;
    }

    static int m(byte[] bArr, int i10, InterfaceC2299m5 interfaceC2299m5, C2396x4 c2396x4) {
        C2254h5 c2254h5 = (C2254h5) interfaceC2299m5;
        int a10 = a(bArr, i10, c2396x4);
        int i11 = c2396x4.f24687a + a10;
        while (a10 < i11) {
            a10 = a(bArr, a10, c2396x4);
            c2254h5.j(c2396x4.f24687a);
        }
        if (a10 == i11) {
            return a10;
        }
        throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int n(S5 s52, int i10, byte[] bArr, int i11, int i12, InterfaceC2299m5 interfaceC2299m5, C2396x4 c2396x4) {
        int h10 = h(s52, bArr, i11, i12, c2396x4);
        interfaceC2299m5.add(c2396x4.f24689c);
        while (h10 < i12) {
            int a10 = a(bArr, h10, c2396x4);
            if (i10 != c2396x4.f24687a) {
                break;
            }
            h10 = h(s52, bArr, a10, i12, c2396x4);
            interfaceC2299m5.add(c2396x4.f24689c);
        }
        return h10;
    }

    static int o(int i10, byte[] bArr, int i11, int i12, C2228e6 c2228e6, C2396x4 c2396x4) {
        if ((i10 >>> 3) == 0) {
            throw new C2326p5("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int c10 = c(bArr, i11, c2396x4);
            c2228e6.j(i10, Long.valueOf(c2396x4.f24688b));
            return c10;
        }
        if (i13 == 1) {
            c2228e6.j(i10, Long.valueOf(e(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int a10 = a(bArr, i11, c2396x4);
            int i14 = c2396x4.f24687a;
            if (i14 < 0) {
                throw new C2326p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - a10) {
                throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                c2228e6.j(i10, J4.f24246b);
            } else {
                c2228e6.j(i10, J4.r(bArr, a10, i14));
            }
            return a10 + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new C2326p5("Protocol message contained an invalid tag (zero).");
            }
            c2228e6.j(i10, Integer.valueOf(d(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        C2228e6 b10 = C2228e6.b();
        int i16 = c2396x4.f24691e + 1;
        c2396x4.f24691e = i16;
        q(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int a11 = a(bArr, i11, c2396x4);
            i17 = c2396x4.f24687a;
            if (i17 == i15) {
                i11 = a11;
                break;
            }
            i11 = o(i17, bArr, a11, i12, b10, c2396x4);
        }
        c2396x4.f24691e--;
        if (i11 > i12 || i17 != i15) {
            throw new C2326p5("Failed to parse the message.");
        }
        c2228e6.j(i10, b10);
        return i11;
    }

    static int p(int i10, byte[] bArr, int i11, int i12, C2396x4 c2396x4) {
        if ((i10 >>> 3) == 0) {
            throw new C2326p5("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return c(bArr, i11, c2396x4);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return a(bArr, i11, c2396x4) + c2396x4.f24687a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new C2326p5("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = a(bArr, i11, c2396x4);
            i15 = c2396x4.f24687a;
            if (i15 == i14) {
                break;
            }
            i11 = p(i15, bArr, i11, i12, c2396x4);
        }
        if (i11 > i12 || i15 != i14) {
            throw new C2326p5("Failed to parse the message.");
        }
        return i11;
    }

    private static void q(int i10) {
        if (i10 >= f24698a) {
            throw new C2326p5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
