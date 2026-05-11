package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2489o1 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f24884a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f24885b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f24886c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f24887d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f24888e;

    /* renamed from: f, reason: collision with root package name */
    public static final I0 f24889f;

    static {
        byte[] bArr = new byte[0];
        f24887d = bArr;
        f24888e = ByteBuffer.wrap(bArr);
        int i10 = I0.f24763a;
        G0 g02 = new G0(bArr, 0, 0, false, null);
        try {
            g02.c(0);
            f24889f = g02;
        } catch (C2499q1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f24885b);
    }
}
