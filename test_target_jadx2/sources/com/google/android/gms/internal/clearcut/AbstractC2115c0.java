package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.clearcut.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2115c0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f24018a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f24019b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f24020c;

    /* renamed from: d, reason: collision with root package name */
    private static final ByteBuffer f24021d;

    /* renamed from: e, reason: collision with root package name */
    private static final H f24022e;

    static {
        byte[] bArr = new byte[0];
        f24020c = bArr;
        f24021d = ByteBuffer.wrap(bArr);
        f24022e = H.b(bArr, 0, bArr.length, false);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int c10 = c(length, bArr, 0, length);
        if (c10 == 0) {
            return 1;
        }
        return c10;
    }

    static int c(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object d(Object obj, Object obj2) {
        return ((B0) obj).n().a1((B0) obj2).Z0();
    }

    static Object e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int f(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static boolean g(byte[] bArr) {
        return AbstractC2131h1.h(bArr);
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f24018a);
    }

    public static int i(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
