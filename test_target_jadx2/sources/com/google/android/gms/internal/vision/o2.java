package com.google.android.gms.internal.vision;

import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;

/* loaded from: classes2.dex */
final class o2 extends l2 {
    o2() {
    }

    @Override // com.google.android.gms.internal.vision.l2
    final int a(int i10, byte[] bArr, int i11, int i12) {
        int m10;
        int m11;
        while (i11 < i12 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i12) {
            return 0;
        }
        while (i11 < i12) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i13 >= i12) {
                        return b10;
                    }
                    if (b10 >= -62) {
                        i11 += 2;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (b10 >= -16) {
                    if (i13 >= i12 - 2) {
                        m11 = k2.m(bArr, i13, i12);
                        return m11;
                    }
                    int i14 = i11 + 2;
                    byte b11 = bArr[i13];
                    if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                        int i15 = i11 + 3;
                        if (bArr[i14] <= -65) {
                            i11 += 4;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i13 >= i12 - 1) {
                    m10 = k2.m(bArr, i13, i12);
                    return m10;
                }
                int i16 = i11 + 2;
                byte b12 = bArr[i13];
                if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                    i11 += 3;
                    if (bArr[i16] > -65) {
                    }
                }
                return -1;
            }
            i11 = i13;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.vision.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char charAt;
        int length = charSequence.length();
        int i14 = i11 + i10;
        int i15 = 0;
        while (i15 < length && (i13 = i15 + i10) < i14 && (charAt = charSequence.charAt(i15)) < 128) {
            bArr[i13] = (byte) charAt;
            i15++;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char charAt2 = charSequence.charAt(i15);
            if (charAt2 < 128 && i16 < i14) {
                bArr[i16] = (byte) charAt2;
                i16++;
            } else if (charAt2 < 2048 && i16 <= i14 - 2) {
                int i17 = i16 + 1;
                bArr[i16] = (byte) ((charAt2 >>> 6) | 960);
                i16 += 2;
                bArr[i17] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && 57343 >= charAt2) || i16 > i14 - 3) {
                    if (i16 > i14 - 4) {
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i12 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                            throw new n2(i15, length);
                        }
                        StringBuilder sb2 = new StringBuilder(37);
                        sb2.append("Failed writing ");
                        sb2.append(charAt2);
                        sb2.append(" at index ");
                        sb2.append(i16);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
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
                    throw new n2(i15 - 1, length);
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

    @Override // com.google.android.gms.internal.vision.l2
    final String d(byte[] bArr, int i10, int i11) {
        boolean l10;
        boolean l11;
        boolean m10;
        boolean n10;
        boolean l12;
        if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            l12 = m2.l(b10);
            if (!l12) {
                break;
            }
            i10++;
            m2.i(b10, cArr, i13);
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = bArr[i10];
            l10 = m2.l(b11);
            if (l10) {
                int i16 = i14 + 1;
                m2.i(b11, cArr, i14);
                while (i15 < i12) {
                    byte b12 = bArr[i15];
                    l11 = m2.l(b12);
                    if (!l11) {
                        break;
                    }
                    i15++;
                    m2.i(b12, cArr, i16);
                    i16++;
                }
                i14 = i16;
                i10 = i15;
            } else {
                m10 = m2.m(b11);
                if (!m10) {
                    n10 = m2.n(b11);
                    if (n10) {
                        if (i15 >= i12 - 1) {
                            throw W0.f();
                        }
                        int i17 = i10 + 2;
                        i10 += 3;
                        m2.g(b11, bArr[i15], bArr[i17], cArr, i14);
                        i14++;
                    } else {
                        if (i15 >= i12 - 2) {
                            throw W0.f();
                        }
                        byte b13 = bArr[i15];
                        int i18 = i10 + 3;
                        byte b14 = bArr[i10 + 2];
                        i10 += 4;
                        m2.f(b11, b13, b14, bArr[i18], cArr, i14);
                        i14 += 2;
                    }
                } else {
                    if (i15 >= i12) {
                        throw W0.f();
                    }
                    i10 += 2;
                    m2.h(b11, bArr[i15], cArr, i14);
                    i14++;
                }
            }
        }
        return new String(cArr, 0, i14);
    }
}
