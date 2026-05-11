package androidx.datastore.preferences.protobuf;

import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f16456a;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
            if (m(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || m(b12) || m(b13)) {
                throw C1558z.d();
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
                throw C1558z.d();
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | (r(b11) << 6) | r(b12));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b10, byte b11, char[] cArr, int i10) {
            if (b10 < -62 || m(b11)) {
                throw C1558z.d();
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

        abstract int b(String str, byte[] bArr, int i10, int i11);
    }

    static final class c extends b {
        c() {
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
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
                        throw C1558z.d();
                    }
                    i10 += 2;
                    a.k(b11, bArr[i15], cArr, i14);
                    i14++;
                } else if (a.o(b11)) {
                    if (i15 >= i12 - 1) {
                        throw C1558z.d();
                    }
                    int i17 = i10 + 2;
                    i10 += 3;
                    a.j(b11, bArr[i15], bArr[i17], cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw C1558z.d();
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
        @Override // androidx.datastore.preferences.protobuf.q0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int b(String str, byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            char charAt;
            int length = str.length();
            int i14 = i11 + i10;
            int i15 = 0;
            while (i15 < length && (i13 = i15 + i10) < i14 && (charAt = str.charAt(i15)) < 128) {
                bArr[i13] = (byte) charAt;
                i15++;
            }
            int i16 = i10 + i15;
            while (i15 < length) {
                char charAt2 = str.charAt(i15);
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
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i12 = i15 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i12)))) {
                                throw new d(i15, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i16);
                        }
                        int i18 = i15 + 1;
                        if (i18 != str.length()) {
                            char charAt3 = str.charAt(i18);
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
    }

    static class d extends IllegalArgumentException {
        d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    static final class e extends b {
        e() {
        }

        static boolean c() {
            return p0.B() && p0.C();
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        String a(byte[] bArr, int i10, int i11) {
            Charset charset = AbstractC1557y.f16477b;
            String str = new String(bArr, i10, i11, charset);
            if (str.indexOf(65533) < 0) {
                return str;
            }
            if (Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                return str;
            }
            throw C1558z.d();
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        int b(String str, byte[] bArr, int i10, int i11) {
            long j10;
            String str2;
            String str3;
            int i12;
            long j11;
            long j12;
            char charAt;
            long j13 = i10;
            long j14 = i11 + j13;
            int length = str.length();
            String str4 = " at index ";
            String str5 = "Failed writing ";
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                j10 = 1;
                if (i13 >= length || (charAt = str.charAt(i13)) >= 128) {
                    break;
                }
                p0.H(bArr, j13, (byte) charAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char charAt2 = str.charAt(i13);
                if (charAt2 >= 128 || j13 >= j14) {
                    if (charAt2 >= 2048 || j13 > j14 - 2) {
                        str2 = str4;
                        str3 = str5;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j13 > j14 - 3) {
                            if (j13 > j14 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(charAt2, str.charAt(i12)))) {
                                    throw new d(i13, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str3 + charAt2 + str2 + j13);
                            }
                            int i14 = i13 + 1;
                            if (i14 != length) {
                                char charAt3 = str.charAt(i14);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j11 = 1;
                                    p0.H(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                    j12 = j14;
                                    p0.H(bArr, j13 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j15 = j13 + 3;
                                    p0.H(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j13 += 4;
                                    p0.H(bArr, j15, (byte) ((codePoint & 63) | 128));
                                    i13 = i14;
                                } else {
                                    i13 = i14;
                                }
                            }
                            throw new d(i13 - 1, length);
                        }
                        p0.H(bArr, j13, (byte) ((charAt2 >>> '\f') | HVFrameRecorder.VIDEO_WIDTH));
                        long j16 = j13 + 2;
                        p0.H(bArr, j13 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j13 += 3;
                        p0.H(bArr, j16, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str2 = str4;
                        str3 = str5;
                        long j17 = j13 + j10;
                        p0.H(bArr, j13, (byte) ((charAt2 >>> 6) | 960));
                        j13 += 2;
                        p0.H(bArr, j17, (byte) ((charAt2 & '?') | 128));
                    }
                    j12 = j14;
                    j11 = 1;
                } else {
                    p0.H(bArr, j13, (byte) charAt2);
                    j12 = j14;
                    str3 = str5;
                    j11 = j10;
                    j13 += j10;
                    str2 = str4;
                }
                i13++;
                str4 = str2;
                str5 = str3;
                j10 = j11;
                j14 = j12;
            }
            return (int) j13;
        }
    }

    static {
        f16456a = (!e.c() || AbstractC1537d.c()) ? new c() : new e();
    }

    static String a(byte[] bArr, int i10, int i11) {
        return f16456a.a(bArr, i10, i11);
    }

    static int b(String str, byte[] bArr, int i10, int i11) {
        return f16456a.b(str, bArr, i10, i11);
    }

    static int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 < length) {
                char charAt = str.charAt(i10);
                if (charAt >= 2048) {
                    i11 += d(str, i10);
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

    private static int d(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(str, i10) < 65536) {
                        throw new d(i10, length);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }
}
