package com.google.android.gms.internal.vision;

import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;

/* loaded from: classes2.dex */
final class q2 extends l2 {
    q2() {
    }

    private static int e(byte[] bArr, int i10, long j10, int i11) {
        int h10;
        int i12;
        int j11;
        if (i11 == 0) {
            h10 = k2.h(i10);
            return h10;
        }
        if (i11 == 1) {
            i12 = k2.i(i10, h2.a(bArr, j10));
            return i12;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        j11 = k2.j(i10, h2.a(bArr, j10), h2.a(bArr, j10 + 1));
        return j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x005f, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.vision.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int a(int i10, byte[] bArr, int i11, int i12) {
        int i13;
        if ((i11 | i12 | (bArr.length - i12)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        long j10 = i11;
        int i14 = (int) (i12 - j10);
        if (i14 >= 16) {
            long j11 = j10;
            i13 = 0;
            while (true) {
                if (i13 >= i14) {
                    i13 = i14;
                    break;
                }
                long j12 = j11 + 1;
                if (h2.a(bArr, j11) < 0) {
                    break;
                }
                i13++;
                j11 = j12;
            }
        } else {
            i13 = 0;
        }
        int i15 = i14 - i13;
        long j13 = j10 + i13;
        while (true) {
            byte b10 = 0;
            while (true) {
                if (i15 <= 0) {
                    break;
                }
                long j14 = j13 + 1;
                b10 = h2.a(bArr, j13);
                if (b10 < 0) {
                    j13 = j14;
                    break;
                }
                i15--;
                j13 = j14;
            }
            if (i15 != 0) {
                int i16 = i15 - 1;
                if (b10 >= -32) {
                    if (b10 >= -16) {
                        if (i16 >= 3) {
                            i15 -= 4;
                            long j15 = j13 + 1;
                            byte a10 = h2.a(bArr, j13);
                            if (a10 > -65 || (((b10 << 28) + (a10 + 112)) >> 30) != 0) {
                                break;
                            }
                            long j16 = j13 + 2;
                            if (h2.a(bArr, j15) > -65) {
                                break;
                            }
                            j13 += 3;
                            if (h2.a(bArr, j16) > -65) {
                                break;
                            }
                        } else {
                            return e(bArr, b10, j13, i16);
                        }
                    } else if (i16 >= 2) {
                        i15 -= 3;
                        long j17 = j13 + 1;
                        byte a11 = h2.a(bArr, j13);
                        if (a11 > -65 || ((b10 == -32 && a11 < -96) || (b10 == -19 && a11 >= -96))) {
                            break;
                        }
                        j13 += 2;
                        if (h2.a(bArr, j17) > -65) {
                            break;
                        }
                    } else {
                        return e(bArr, b10, j13, i16);
                    }
                } else if (i16 != 0) {
                    i15 -= 2;
                    if (b10 < -62) {
                        break;
                    }
                    long j18 = j13 + 1;
                    if (h2.a(bArr, j13) > -65) {
                        break;
                    }
                    j13 = j18;
                } else {
                    return b10;
                }
            } else {
                return 0;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.vision.l2
    final int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        long j10;
        String str;
        String str2;
        int i12;
        long j11;
        long j12;
        char charAt;
        long j13 = i10;
        long j14 = i11 + j13;
        int length = charSequence.length();
        String str3 = " at index ";
        String str4 = "Failed writing ";
        if (length > i11 || bArr.length - i11 < i10) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Failed writing ");
            sb2.append(charAt2);
            sb2.append(" at index ");
            sb2.append(i10 + i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        int i13 = 0;
        while (true) {
            j10 = 1;
            if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                break;
            }
            h2.l(bArr, j13, (byte) charAt);
            i13++;
            j13 = 1 + j13;
        }
        if (i13 == length) {
            return (int) j13;
        }
        while (i13 < length) {
            char charAt3 = charSequence.charAt(i13);
            if (charAt3 >= 128 || j13 >= j14) {
                if (charAt3 >= 2048 || j13 > j14 - 2) {
                    str = str3;
                    str2 = str4;
                    if ((charAt3 >= 55296 && 57343 >= charAt3) || j13 > j14 - 3) {
                        if (j13 > j14 - 4) {
                            if (55296 <= charAt3 && charAt3 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i12)))) {
                                throw new n2(i13, length);
                            }
                            StringBuilder sb3 = new StringBuilder(46);
                            sb3.append(str2);
                            sb3.append(charAt3);
                            sb3.append(str);
                            sb3.append(j13);
                            throw new ArrayIndexOutOfBoundsException(sb3.toString());
                        }
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char charAt4 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                j11 = 1;
                                h2.l(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                j12 = j14;
                                h2.l(bArr, j13 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j15 = j13 + 3;
                                h2.l(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j13 += 4;
                                h2.l(bArr, j15, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new n2(i13 - 1, length);
                    }
                    h2.l(bArr, j13, (byte) ((charAt3 >>> '\f') | HVFrameRecorder.VIDEO_WIDTH));
                    long j16 = j13 + 2;
                    h2.l(bArr, j13 + 1, (byte) (((charAt3 >>> 6) & 63) | 128));
                    j13 += 3;
                    h2.l(bArr, j16, (byte) ((charAt3 & '?') | 128));
                } else {
                    str = str3;
                    str2 = str4;
                    long j17 = j13 + j10;
                    h2.l(bArr, j13, (byte) ((charAt3 >>> 6) | 960));
                    j13 += 2;
                    h2.l(bArr, j17, (byte) ((charAt3 & '?') | 128));
                }
                j12 = j14;
                j11 = 1;
            } else {
                h2.l(bArr, j13, (byte) charAt3);
                j12 = j14;
                str2 = str4;
                j11 = j10;
                j13 += j10;
                str = str3;
            }
            i13++;
            str3 = str;
            str4 = str2;
            j10 = j11;
            j14 = j12;
        }
        return (int) j13;
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
            byte a10 = h2.a(bArr, i10);
            l12 = m2.l(a10);
            if (!l12) {
                break;
            }
            i10++;
            m2.i(a10, cArr, i13);
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte a11 = h2.a(bArr, i10);
            l10 = m2.l(a11);
            if (l10) {
                int i16 = i14 + 1;
                m2.i(a11, cArr, i14);
                while (i15 < i12) {
                    byte a12 = h2.a(bArr, i15);
                    l11 = m2.l(a12);
                    if (!l11) {
                        break;
                    }
                    i15++;
                    m2.i(a12, cArr, i16);
                    i16++;
                }
                i14 = i16;
                i10 = i15;
            } else {
                m10 = m2.m(a11);
                if (!m10) {
                    n10 = m2.n(a11);
                    if (n10) {
                        if (i15 >= i12 - 1) {
                            throw W0.f();
                        }
                        int i17 = i10 + 2;
                        i10 += 3;
                        m2.g(a11, h2.a(bArr, i15), h2.a(bArr, i17), cArr, i14);
                        i14++;
                    } else {
                        if (i15 >= i12 - 2) {
                            throw W0.f();
                        }
                        byte a13 = h2.a(bArr, i15);
                        int i18 = i10 + 3;
                        byte a14 = h2.a(bArr, i10 + 2);
                        i10 += 4;
                        m2.f(a11, a13, a14, h2.a(bArr, i18), cArr, i14);
                        i14 += 2;
                    }
                } else {
                    if (i15 >= i12) {
                        throw W0.f();
                    }
                    i10 += 2;
                    m2.h(a11, h2.a(bArr, i15), cArr, i14);
                    i14++;
                }
            }
        }
        return new String(cArr, 0, i14);
    }
}
