package com.webengage.sdk.android;

/* loaded from: classes2.dex */
public class m4 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f30725a = {7, 12, 17, 22, 5, 9, 14, 20, 4, 11, 16, 23, 6, 10, 15, 21};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f30726b = new int[64];

    static {
        for (int i10 = 0; i10 < 64; i10++) {
            f30726b[i10] = (int) (Math.abs(Math.sin(r3)) * 4.294967296E9d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2 A[LOOP:5: B:49:0x00f0->B:50:0x00f2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int length = bArr.length;
        int i16 = 1;
        int i17 = ((length + 8) >>> 6) + 1;
        int i18 = (i17 << 6) - length;
        byte[] bArr2 = new byte[i18];
        int i19 = 0;
        bArr2[0] = Byte.MIN_VALUE;
        long j10 = length << 3;
        for (int i20 = 0; i20 < 8; i20++) {
            bArr2[(i18 - 8) + i20] = (byte) j10;
            j10 >>>= 8;
        }
        int i21 = 16;
        int[] iArr = new int[16];
        int i22 = 1732584193;
        int i23 = -271733879;
        int i24 = -1732584194;
        int i25 = 271733878;
        int i26 = 0;
        while (true) {
            int i27 = 2;
            if (i26 >= i17) {
                break;
            }
            int i28 = i19;
            int i29 = i26 << 6;
            while (true) {
                i12 = 64;
                if (i28 >= 64) {
                    break;
                }
                int i30 = i28 >>> 2;
                iArr[i30] = ((i29 < length ? bArr[i29] : bArr2[i29 - length]) << 24) | (iArr[i30] >>> 8);
                i28++;
                i29++;
            }
            int i31 = i22;
            int i32 = i23;
            int i33 = i24;
            int i34 = i25;
            int i35 = 0;
            while (i35 < i12) {
                int i36 = i35 >>> 4;
                if (i36 == 0) {
                    i13 = ((~i32) & i34) | (i32 & i33);
                    i14 = i35;
                } else if (i36 != i16) {
                    if (i36 == i27) {
                        i13 = (i32 ^ i33) ^ i34;
                        i15 = (i35 * 3) + 5;
                    } else if (i36 != 3) {
                        i14 = i35;
                        i13 = 0;
                    } else {
                        i13 = i33 ^ ((~i34) | i32);
                        i15 = i35 * 7;
                    }
                    i14 = i15 & 15;
                } else {
                    i13 = (i32 & i34) | (i33 & (~i34));
                    i14 = ((i35 * 5) + 1) & 15;
                }
                int rotateLeft = Integer.rotateLeft(i31 + i13 + iArr[i14] + f30726b[i35], f30725a[(i36 << 2) | (i35 & 3)]) + i32;
                i35++;
                i31 = i34;
                i34 = i33;
                i12 = 64;
                i27 = 2;
                i33 = i32;
                i32 = rotateLeft;
                i16 = 1;
            }
            i22 = i31 + i22;
            i23 += i32;
            i24 = i33 + i24;
            i25 += i34;
            i26++;
            i16 = 1;
            i21 = 16;
            i19 = 0;
        }
        byte[] bArr3 = new byte[i21];
        int i37 = 0;
        int i38 = 0;
        while (i37 < 4) {
            if (i37 == 0) {
                i10 = i22;
            } else if (i37 == 1) {
                i10 = i23;
            } else {
                i10 = i37 == 2 ? i24 : i25;
                i11 = 0;
                while (i11 < 4) {
                    bArr3[i38] = (byte) i10;
                    i10 >>>= 8;
                    i11++;
                    i38++;
                }
                i37++;
            }
            i11 = 0;
            while (i11 < 4) {
            }
            i37++;
        }
        return bArr3;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(String.format("%02X", Integer.valueOf(b10 & 255)));
        }
        return sb2.toString();
    }
}
