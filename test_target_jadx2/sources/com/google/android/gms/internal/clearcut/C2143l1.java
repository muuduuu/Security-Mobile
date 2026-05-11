package com.google.android.gms.internal.clearcut;

import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.clearcut.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2143l1 extends AbstractC2134i1 {
    C2143l1() {
    }

    private static int f(byte[] bArr, int i10, long j10, int i11) {
        int d10;
        int l10;
        int f10;
        if (i11 == 0) {
            d10 = AbstractC2131h1.d(i10);
            return d10;
        }
        if (i11 == 1) {
            l10 = AbstractC2131h1.l(i10, AbstractC2125f1.a(bArr, j10));
            return l10;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        f10 = AbstractC2131h1.f(i10, AbstractC2125f1.a(bArr, j10), AbstractC2125f1.a(bArr, j10 + 1));
        return f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x005f, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.clearcut.AbstractC2134i1
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
                if (AbstractC2125f1.a(bArr, j11) < 0) {
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
                b10 = AbstractC2125f1.a(bArr, j13);
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
                            byte a10 = AbstractC2125f1.a(bArr, j13);
                            if (a10 > -65 || (((b10 << 28) + (a10 + 112)) >> 30) != 0) {
                                break;
                            }
                            long j16 = j13 + 2;
                            if (AbstractC2125f1.a(bArr, j15) > -65) {
                                break;
                            }
                            j13 += 3;
                            if (AbstractC2125f1.a(bArr, j16) > -65) {
                                break;
                            }
                        } else {
                            return f(bArr, b10, j13, i16);
                        }
                    } else if (i16 >= 2) {
                        i15 -= 3;
                        long j17 = j13 + 1;
                        byte a11 = AbstractC2125f1.a(bArr, j13);
                        if (a11 > -65 || ((b10 == -32 && a11 < -96) || (b10 == -19 && a11 >= -96))) {
                            break;
                        }
                        j13 += 2;
                        if (AbstractC2125f1.a(bArr, j17) > -65) {
                            break;
                        }
                    } else {
                        return f(bArr, b10, j13, i16);
                    }
                } else if (i16 != 0) {
                    i15 -= 2;
                    if (b10 < -62) {
                        break;
                    }
                    long j18 = j13 + 1;
                    if (AbstractC2125f1.a(bArr, j13) > -65) {
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

    @Override // com.google.android.gms.internal.clearcut.AbstractC2134i1
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
            AbstractC2125f1.k(bArr, j13, (byte) charAt);
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
                                throw new C2140k1(i13, length);
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
                                AbstractC2125f1.k(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                j12 = j14;
                                AbstractC2125f1.k(bArr, j13 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j15 = j13 + 3;
                                AbstractC2125f1.k(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j13 += 4;
                                AbstractC2125f1.k(bArr, j15, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new C2140k1(i13 - 1, length);
                    }
                    AbstractC2125f1.k(bArr, j13, (byte) ((charAt3 >>> '\f') | HVFrameRecorder.VIDEO_WIDTH));
                    long j16 = j13 + 2;
                    AbstractC2125f1.k(bArr, j13 + 1, (byte) (((charAt3 >>> 6) & 63) | 128));
                    j13 += 3;
                    AbstractC2125f1.k(bArr, j16, (byte) ((charAt3 & '?') | 128));
                } else {
                    str = str3;
                    str2 = str4;
                    long j17 = j13 + j10;
                    AbstractC2125f1.k(bArr, j13, (byte) ((charAt3 >>> 6) | 960));
                    j13 += 2;
                    AbstractC2125f1.k(bArr, j17, (byte) ((charAt3 & '?') | 128));
                }
                j12 = j14;
                j11 = 1;
            } else {
                AbstractC2125f1.k(bArr, j13, (byte) charAt3);
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

    @Override // com.google.android.gms.internal.clearcut.AbstractC2134i1
    final void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j10;
        char c10;
        int i10;
        long j11;
        int i11;
        int i12;
        char c11;
        char charAt;
        ByteBuffer byteBuffer2 = byteBuffer;
        long o10 = AbstractC2125f1.o(byteBuffer);
        long position = byteBuffer.position() + o10;
        long limit = byteBuffer.limit() + o10;
        int length = charSequence.length();
        if (length > limit - position) {
            char charAt2 = charSequence.charAt(length - 1);
            int limit2 = byteBuffer.limit();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Failed writing ");
            sb2.append(charAt2);
            sb2.append(" at index ");
            sb2.append(limit2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        int i13 = 0;
        while (true) {
            j10 = 1;
            c10 = 128;
            if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                break;
            }
            AbstractC2125f1.c(position, (byte) charAt);
            i13++;
            position = 1 + position;
        }
        if (i13 == length) {
            i10 = (int) (position - o10);
        } else {
            while (i13 < length) {
                char charAt3 = charSequence.charAt(i13);
                if (charAt3 >= c10 || position >= limit) {
                    if (charAt3 >= 2048 || position > limit - 2) {
                        j11 = o10;
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || position > limit - 3) {
                            if (position > limit - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i11 = i13 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i11)))) {
                                    throw new C2140k1(i13, length);
                                }
                                StringBuilder sb3 = new StringBuilder(46);
                                sb3.append("Failed writing ");
                                sb3.append(charAt3);
                                sb3.append(" at index ");
                                sb3.append(position);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            i12 = i13 + 1;
                            if (i12 != length) {
                                char charAt4 = charSequence.charAt(i12);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    AbstractC2125f1.c(position, (byte) ((codePoint >>> 18) | 240));
                                    c11 = 128;
                                    AbstractC2125f1.c(position + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j12 = position + 3;
                                    AbstractC2125f1.c(position + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    position += 4;
                                    AbstractC2125f1.c(j12, (byte) ((codePoint & 63) | 128));
                                } else {
                                    i13 = i12;
                                }
                            }
                            throw new C2140k1(i13 - 1, length);
                        }
                        long j13 = position + j10;
                        AbstractC2125f1.c(position, (byte) ((charAt3 >>> '\f') | HVFrameRecorder.VIDEO_WIDTH));
                        long j14 = position + 2;
                        AbstractC2125f1.c(j13, (byte) (((charAt3 >>> 6) & 63) | 128));
                        position += 3;
                        AbstractC2125f1.c(j14, (byte) ((charAt3 & '?') | 128));
                    } else {
                        j11 = o10;
                        long j15 = position + j10;
                        AbstractC2125f1.c(position, (byte) ((charAt3 >>> 6) | 960));
                        position += 2;
                        AbstractC2125f1.c(j15, (byte) ((charAt3 & '?') | 128));
                    }
                    i12 = i13;
                    c11 = 128;
                } else {
                    AbstractC2125f1.c(position, (byte) charAt3);
                    j11 = o10;
                    i12 = i13;
                    c11 = c10;
                    position += j10;
                }
                c10 = c11;
                o10 = j11;
                j10 = 1;
                i13 = i12 + 1;
            }
            i10 = (int) (position - o10);
            byteBuffer2 = byteBuffer;
        }
        byteBuffer2.position(i10);
    }
}
