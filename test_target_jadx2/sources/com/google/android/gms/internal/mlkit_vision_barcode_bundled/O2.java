package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;

/* loaded from: classes2.dex */
abstract class O2 {

    /* renamed from: a, reason: collision with root package name */
    private static final L2 f24787a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24788b = 0;

    static {
        if (J2.C() && J2.D()) {
            int i10 = AbstractC2498q0.f24908a;
        }
        f24787a = new M2();
    }

    static /* bridge */ /* synthetic */ int c(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            return i(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return j(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ff, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int d(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char charAt;
        int length = charSequence.length();
        int i15 = 0;
        while (true) {
            i12 = i10 + i11;
            if (i15 >= length || (i14 = i15 + i10) >= i12 || (charAt = charSequence.charAt(i15)) >= 128) {
                break;
            }
            bArr[i14] = (byte) charAt;
            i15++;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char charAt2 = charSequence.charAt(i15);
            if (charAt2 < 128 && i16 < i12) {
                bArr[i16] = (byte) charAt2;
                i16++;
            } else if (charAt2 < 2048 && i16 <= i12 - 2) {
                int i17 = i16 + 1;
                bArr[i16] = (byte) ((charAt2 >>> 6) | 960);
                i16 += 2;
                bArr[i17] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i16 > i12 - 3) {
                    if (i16 > i12 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i13 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i13)))) {
                            throw new N2(i15, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i16);
                    }
                    int i18 = i15 + 1;
                    if (i18 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i18);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i19 = i16 + 3;
                            bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i16 += 4;
                            bArr[i19] = (byte) ((codePoint & 63) | 128);
                            i15 = i18;
                        } else {
                            i15 = i18;
                        }
                    }
                    throw new N2(i15 - 1, length);
                }
                bArr[i16] = (byte) ((charAt2 >>> '\f') | HVFrameRecorder.VIDEO_WIDTH);
                int i20 = i16 + 2;
                bArr[i16 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i16 += 3;
                bArr[i20] = (byte) ((charAt2 & '?') | 128);
            }
            i15++;
        }
        return i16;
    }

    static int e(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new N2(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    static int f(int i10, byte[] bArr, int i11, int i12) {
        return f24787a.a(i10, bArr, i11, i12);
    }

    static boolean g(byte[] bArr) {
        return f24787a.b(bArr, 0, bArr.length);
    }

    static boolean h(byte[] bArr, int i10, int i11) {
        return f24787a.b(bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
