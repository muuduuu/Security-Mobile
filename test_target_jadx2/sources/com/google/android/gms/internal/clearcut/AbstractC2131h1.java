package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.clearcut.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2131h1 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2134i1 f24073a;

    static {
        f24073a = (AbstractC2125f1.x() && AbstractC2125f1.y()) ? new C2143l1() : new C2137j1();
    }

    static int a(CharSequence charSequence) {
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
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new C2140k1(i11, length2);
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
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    static int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        return f24073a.b(charSequence, bArr, i10, i11);
    }

    static void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        AbstractC2134i1 abstractC2134i1 = f24073a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(b(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            abstractC2134i1.c(charSequence, byteBuffer);
        } else {
            AbstractC2134i1.d(charSequence, byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    public static boolean h(byte[] bArr) {
        return f24073a.e(bArr, 0, bArr.length);
    }

    public static boolean i(byte[] bArr, int i10, int i11) {
        return f24073a.e(bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return d(b10);
        }
        if (i12 == 1) {
            return l(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return f(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }
}
