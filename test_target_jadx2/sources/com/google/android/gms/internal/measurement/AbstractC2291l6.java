package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2291l6 {
    static /* synthetic */ boolean a(byte b10) {
        return b10 >= 0;
    }

    static /* synthetic */ void b(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 < -62 || e(b11)) {
            throw new C2326p5("Protocol message had invalid UTF-8.");
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    static /* synthetic */ void c(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (!e(b11)) {
            if (b10 == -32) {
                if (b11 >= -96) {
                    b10 = -32;
                }
            }
            if (b10 == -19) {
                if (b11 < -96) {
                    b10 = -19;
                }
            }
            if (!e(b12)) {
                cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw new C2326p5("Protocol message had invalid UTF-8.");
    }

    static /* synthetic */ void d(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (e(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || e(b12) || e(b13)) {
            throw new C2326p5("Protocol message had invalid UTF-8.");
        }
        int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
        cArr[i10] = (char) ((i11 >>> 10) + 55232);
        cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
    }

    private static boolean e(byte b10) {
        return b10 > -65;
    }
}
