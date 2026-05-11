package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class G0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f23596a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f23597b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f23598c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f23599d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f23600e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC2092u0 f23601f;

    static {
        byte[] bArr = new byte[0];
        f23599d = bArr;
        f23600e = ByteBuffer.wrap(bArr);
        int i10 = AbstractC2092u0.f23774a;
        C2086s0 c2086s0 = new C2086s0(bArr, 0, 0, false, null);
        try {
            c2086s0.c(0);
            f23601f = c2086s0;
        } catch (H0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f23597b);
    }
}
