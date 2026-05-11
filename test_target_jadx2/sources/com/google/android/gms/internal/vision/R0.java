package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class R0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f25076a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f25077b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f25078c;

    /* renamed from: d, reason: collision with root package name */
    private static final ByteBuffer f25079d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC2608t0 f25080e;

    static {
        byte[] bArr = new byte[0];
        f25078c = bArr;
        f25079d = ByteBuffer.wrap(bArr);
        f25080e = AbstractC2608t0.b(bArr, 0, bArr.length, false);
    }

    static int a(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object e(Object obj, Object obj2) {
        return ((InterfaceC2609t1) obj).b().o1((InterfaceC2609t1) obj2).g();
    }

    static Object f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static boolean g(InterfaceC2609t1 interfaceC2609t1) {
        return false;
    }

    public static boolean h(byte[] bArr) {
        return k2.f(bArr);
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f25076a);
    }

    public static int j(byte[] bArr) {
        int length = bArr.length;
        int a10 = a(length, bArr, 0, length);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
