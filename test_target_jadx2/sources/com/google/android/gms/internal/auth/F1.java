package com.google.android.gms.internal.auth;

/* loaded from: classes2.dex */
abstract class F1 {

    /* renamed from: a, reason: collision with root package name */
    private static final D1 f23594a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f23595b = 0;

    static {
        if (B1.u() && B1.v()) {
            int i10 = AbstractC2042d0.f23685a;
        }
        f23594a = new E1();
    }

    static /* bridge */ /* synthetic */ int a(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 != 0) {
            if (i12 == 1) {
                byte b11 = bArr[i10];
                if (b10 <= -12 && b11 <= -65) {
                    return b10 ^ (b11 << 8);
                }
            } else {
                if (i12 != 2) {
                    throw new AssertionError();
                }
                byte b12 = bArr[i10];
                byte b13 = bArr[i10 + 1];
                if (b10 <= -12 && b12 <= -65 && b13 <= -65) {
                    return ((b12 << 8) ^ b10) ^ (b13 << 16);
                }
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    static boolean b(byte[] bArr) {
        return f23594a.b(bArr, 0, bArr.length);
    }

    static boolean c(byte[] bArr, int i10, int i11) {
        return f23594a.b(bArr, i10, i11);
    }
}
