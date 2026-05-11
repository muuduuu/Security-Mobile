package com.google.protobuf;

import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f28798a;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
            if (m(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || m(b12) || m(b13)) {
                throw C2894z.c();
            }
            int r10 = ((b10 & 7) << 18) | (r(b11) << 12) | (r(b12) << 6) | r(b13);
            cArr[i10] = l(r10);
            cArr[i10 + 1] = q(r10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b10, byte b11, byte b12, char[] cArr, int i10) {
            if (m(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || m(b12)))) {
                throw C2894z.c();
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | (r(b11) << 6) | r(b12));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b10, byte b11, char[] cArr, int i10) {
            if (b10 < -62 || m(b11)) {
                throw C2894z.c();
            }
            cArr[i10] = (char) (((b10 & 31) << 6) | r(b11));
        }

        private static char l(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        private static boolean m(byte b10) {
            return b10 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b10) {
            return b10 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b10) {
            return b10 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b10) {
            return b10 < -32;
        }

        private static char q(int i10) {
            return (char) ((i10 & 1023) + 56320);
        }

        private static int r(byte b10) {
            return b10 & 63;
        }
    }

    static abstract class b {
        b() {
        }

        abstract String a(byte[] bArr, int i10, int i11);

        abstract int b(CharSequence charSequence, byte[] bArr, int i10, int i11);

        final boolean c(byte[] bArr, int i10, int i11) {
            return d(0, bArr, i10, i11) == 0;
        }

        abstract int d(int i10, byte[] bArr, int i11, int i12);
    }

    static final class c extends b {
        c() {
        }

        private static int e(byte[] bArr, int i10, int i11) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            return f(bArr, i10, i11);
        }

        private static int f(byte[] bArr, int i10, int i11) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i12 >= i11) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i10 += 2;
                            if (bArr[i12] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 >= -16) {
                        if (i12 >= i11 - 2) {
                            return n0.l(bArr, i12, i11);
                        }
                        int i13 = i10 + 2;
                        byte b11 = bArr[i12];
                        if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                            int i14 = i10 + 3;
                            if (bArr[i13] <= -65) {
                                i10 += 4;
                                if (bArr[i14] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i12 >= i11 - 1) {
                        return n0.l(bArr, i12, i11);
                    }
                    int i15 = i10 + 2;
                    byte b12 = bArr[i12];
                    if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                        i10 += 3;
                        if (bArr[i15] > -65) {
                        }
                    }
                    return -1;
                }
                i10 = i12;
            }
            return 0;
        }

        @Override // com.google.protobuf.n0.b
        String a(byte[] bArr, int i10, int i11) {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!a.n(b10)) {
                    break;
                }
                i10++;
                a.i(b10, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = bArr[i10];
                if (a.n(b11)) {
                    int i16 = i14 + 1;
                    a.i(b11, cArr, i14);
                    while (i15 < i12) {
                        byte b12 = bArr[i15];
                        if (!a.n(b12)) {
                            break;
                        }
                        i15++;
                        a.i(b12, cArr, i16);
                        i16++;
                    }
                    i14 = i16;
                    i10 = i15;
                } else if (a.p(b11)) {
                    if (i15 >= i12) {
                        throw C2894z.c();
                    }
                    i10 += 2;
                    a.k(b11, bArr[i15], cArr, i14);
                    i14++;
                } else if (a.o(b11)) {
                    if (i15 >= i12 - 1) {
                        throw C2894z.c();
                    }
                    int i17 = i10 + 2;
                    i10 += 3;
                    a.j(b11, bArr[i15], bArr[i17], cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw C2894z.c();
                    }
                    byte b13 = bArr[i15];
                    int i18 = i10 + 3;
                    byte b14 = bArr[i10 + 2];
                    i10 += 4;
                    a.h(b11, b13, b14, bArr[i18], cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // com.google.protobuf.n0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
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
                                throw new d(i15, length);
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
                        throw new d(i15 - 1, length);
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

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.n0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int d(int i10, byte[] bArr, int i11, int i12) {
            byte b10;
            int i13;
            int i14;
            if (i10 != 0) {
                if (i11 >= i12) {
                    return i10;
                }
                byte b11 = (byte) i10;
                if (b11 < -32) {
                    if (b11 >= -62) {
                        i14 = i11 + 1;
                    }
                    return -1;
                }
                if (b11 < -16) {
                    byte b12 = (byte) (~(i10 >> 8));
                    if (b12 == 0) {
                        int i15 = i11 + 1;
                        byte b13 = bArr[i11];
                        if (i15 >= i12) {
                            return n0.j(b11, b13);
                        }
                        i11 = i15;
                        b12 = b13;
                    }
                    if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                        i14 = i11 + 1;
                    }
                    return -1;
                }
                byte b14 = (byte) (~(i10 >> 8));
                if (b14 == 0) {
                    i13 = i11 + 1;
                    b14 = bArr[i11];
                    if (i13 >= i12) {
                        return n0.j(b11, b14);
                    }
                    b10 = 0;
                } else {
                    b10 = (byte) (i10 >> 16);
                    i13 = i11;
                }
                if (b10 == 0) {
                    int i16 = i13 + 1;
                    byte b15 = bArr[i13];
                    if (i16 >= i12) {
                        return n0.k(b11, b14, b15);
                    }
                    b10 = b15;
                    i13 = i16;
                }
                if (b14 <= -65 && (((b11 << 28) + (b14 + 112)) >> 30) == 0 && b10 <= -65) {
                    i11 = i13 + 1;
                }
                return -1;
                i11 = i14;
            }
            return e(bArr, i11, i12);
        }
    }

    static class d extends IllegalArgumentException {
        d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    static final class e extends b {
        e() {
        }

        static boolean e() {
            return m0.E() && m0.F();
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int f(byte[] bArr, long j10, int i10) {
            int g10 = g(bArr, j10, i10);
            int i11 = i10 - g10;
            long j11 = j10 + g10;
            while (true) {
                byte b10 = 0;
                while (true) {
                    if (i11 <= 0) {
                        break;
                    }
                    long j12 = j11 + 1;
                    b10 = m0.u(bArr, j11);
                    if (b10 < 0) {
                        j11 = j12;
                        break;
                    }
                    i11--;
                    j11 = j12;
                }
                if (i11 != 0) {
                    int i12 = i11 - 1;
                    if (b10 >= -32) {
                        if (b10 >= -16) {
                            if (i12 >= 3) {
                                i11 -= 4;
                                long j13 = 1 + j11;
                                byte u10 = m0.u(bArr, j11);
                                if (u10 > -65 || (((b10 << 28) + (u10 + 112)) >> 30) != 0) {
                                    break;
                                }
                                long j14 = 2 + j11;
                                if (m0.u(bArr, j13) > -65) {
                                    break;
                                }
                                j11 += 3;
                                if (m0.u(bArr, j14) > -65) {
                                    break;
                                }
                            } else {
                                return h(bArr, b10, j11, i12);
                            }
                        } else if (i12 >= 2) {
                            i11 -= 3;
                            long j15 = 1 + j11;
                            byte u11 = m0.u(bArr, j11);
                            if (u11 > -65 || ((b10 == -32 && u11 < -96) || (b10 == -19 && u11 >= -96))) {
                                break;
                            }
                            j11 += 2;
                            if (m0.u(bArr, j15) > -65) {
                                break;
                            }
                        } else {
                            return h(bArr, b10, j11, i12);
                        }
                    } else if (i12 != 0) {
                        i11 -= 2;
                        if (b10 < -62) {
                            break;
                        }
                        long j16 = 1 + j11;
                        if (m0.u(bArr, j11) > -65) {
                            break;
                        }
                        j11 = j16;
                    } else {
                        return b10;
                    }
                } else {
                    return 0;
                }
            }
            return -1;
        }

        private static int g(byte[] bArr, long j10, int i10) {
            int i11 = 0;
            if (i10 < 16) {
                return 0;
            }
            int i12 = 8 - (((int) j10) & 7);
            while (i11 < i12) {
                long j11 = 1 + j10;
                if (m0.u(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j11;
            }
            while (true) {
                int i13 = i11 + 8;
                if (i13 > i10 || (m0.A(bArr, m0.f28780h + j10) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j10 += 8;
                i11 = i13;
            }
            while (i11 < i10) {
                long j12 = j10 + 1;
                if (m0.u(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j12;
            }
            return i10;
        }

        private static int h(byte[] bArr, int i10, long j10, int i11) {
            if (i11 == 0) {
                return n0.i(i10);
            }
            if (i11 == 1) {
                return n0.j(i10, m0.u(bArr, j10));
            }
            if (i11 == 2) {
                return n0.k(i10, m0.u(bArr, j10), m0.u(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.n0.b
        String a(byte[] bArr, int i10, int i11) {
            Charset charset = AbstractC2893y.f28819b;
            String str = new String(bArr, i10, i11, charset);
            if (!str.contains("�")) {
                return str;
            }
            if (Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                return str;
            }
            throw C2894z.c();
        }

        @Override // com.google.protobuf.n0.b
        int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
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
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                j10 = 1;
                if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                    break;
                }
                m0.K(bArr, j13, (byte) charAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char charAt2 = charSequence.charAt(i13);
                if (charAt2 >= 128 || j13 >= j14) {
                    if (charAt2 >= 2048 || j13 > j14 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j13 > j14 - 3) {
                            if (j13 > j14 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                                    throw new d(i13, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j13);
                            }
                            int i14 = i13 + 1;
                            if (i14 != length) {
                                char charAt3 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j11 = 1;
                                    m0.K(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                    j12 = j14;
                                    m0.K(bArr, j13 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j15 = j13 + 3;
                                    m0.K(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j13 += 4;
                                    m0.K(bArr, j15, (byte) ((codePoint & 63) | 128));
                                    i13 = i14;
                                } else {
                                    i13 = i14;
                                }
                            }
                            throw new d(i13 - 1, length);
                        }
                        m0.K(bArr, j13, (byte) ((charAt2 >>> '\f') | HVFrameRecorder.VIDEO_WIDTH));
                        long j16 = j13 + 2;
                        m0.K(bArr, j13 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j13 += 3;
                        m0.K(bArr, j16, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j17 = j13 + j10;
                        m0.K(bArr, j13, (byte) ((charAt2 >>> 6) | 960));
                        j13 += 2;
                        m0.K(bArr, j17, (byte) ((charAt2 & '?') | 128));
                    }
                    j12 = j14;
                    j11 = 1;
                } else {
                    m0.K(bArr, j13, (byte) charAt2);
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

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        
            if (com.google.protobuf.m0.u(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        
            if (com.google.protobuf.m0.u(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.n0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int d(int i10, byte[] bArr, int i11, int i12) {
            byte b10;
            long j10;
            if ((i11 | i12 | (bArr.length - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            long j11 = i11;
            long j12 = i12;
            if (i10 != 0) {
                if (j11 >= j12) {
                    return i10;
                }
                byte b11 = (byte) i10;
                if (b11 < -32) {
                    if (b11 >= -62) {
                        long j13 = 1 + j11;
                        if (m0.u(bArr, j11) <= -65) {
                            j11 = j13;
                        }
                    }
                    return -1;
                }
                if (b11 < -16) {
                    byte b12 = (byte) (~(i10 >> 8));
                    if (b12 == 0) {
                        long j14 = j11 + 1;
                        b12 = m0.u(bArr, j11);
                        if (j14 >= j12) {
                            return n0.j(b11, b12);
                        }
                        j11 = j14;
                    }
                    if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                        j10 = j11 + 1;
                    }
                    return -1;
                }
                byte b13 = (byte) (~(i10 >> 8));
                if (b13 == 0) {
                    long j15 = j11 + 1;
                    b13 = m0.u(bArr, j11);
                    if (j15 >= j12) {
                        return n0.j(b11, b13);
                    }
                    b10 = 0;
                    j11 = j15;
                } else {
                    b10 = (byte) (i10 >> 16);
                }
                if (b10 == 0) {
                    long j16 = j11 + 1;
                    b10 = m0.u(bArr, j11);
                    if (j16 >= j12) {
                        return n0.k(b11, b13, b10);
                    }
                    j11 = j16;
                }
                if (b13 <= -65 && (((b11 << 28) + (b13 + 112)) >> 30) == 0 && b10 <= -65) {
                    j10 = j11 + 1;
                }
                return -1;
                j11 = j10;
            }
            return f(bArr, j11, (int) (j12 - j11));
        }
    }

    static {
        f28798a = (!e.e() || AbstractC2873d.c()) ? new c() : new e();
    }

    static String e(byte[] bArr, int i10, int i11) {
        return f28798a.a(bArr, i10, i11);
    }

    static int f(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        return f28798a.b(charSequence, bArr, i10, i11);
    }

    static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 < length) {
                char charAt = charSequence.charAt(i10);
                if (charAt >= 2048) {
                    i11 += h(charSequence, i10);
                    break;
                }
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                break;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    private static int h(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i10) < 65536) {
                        throw new d(i10, length);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return i(b10);
        }
        if (i12 == 1) {
            return j(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return k(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    static boolean m(byte[] bArr) {
        return f28798a.c(bArr, 0, bArr.length);
    }

    static boolean n(byte[] bArr, int i10, int i11) {
        return f28798a.c(bArr, i10, i11);
    }
}
