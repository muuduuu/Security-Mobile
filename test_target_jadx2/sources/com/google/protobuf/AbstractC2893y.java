package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2893y {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f28818a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f28819b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f28820c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f28821d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f28822e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC2878i f28823f;

    /* renamed from: com.google.protobuf.y$a */
    public interface a {
        boolean a(int i10);
    }

    /* renamed from: com.google.protobuf.y$b */
    public interface b extends List, RandomAccess {
        boolean N();

        void x();

        b y(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f28821d = bArr;
        f28822e = ByteBuffer.wrap(bArr);
        f28823f = AbstractC2878i.c(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int h10 = h(i11, bArr, i10, i11);
        if (h10 == 0) {
            return 1;
        }
        return h10;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return n0.m(bArr);
    }

    static int h(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f28819b);
    }
}
