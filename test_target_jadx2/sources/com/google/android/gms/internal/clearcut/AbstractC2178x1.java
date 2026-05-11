package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2178x1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f24105a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f24106b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final Object f24107c = new Object();

    public static boolean a(int[] iArr, int[] iArr2) {
        return (iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2);
    }

    public static boolean b(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length || objArr[i10] != null) {
                while (i11 < length2 && objArr2[i11] == null) {
                    i11++;
                }
                boolean z10 = i10 >= length;
                boolean z11 = i11 >= length2;
                if (z10 && z11) {
                    return true;
                }
                if (z10 != z11 || !objArr[i10].equals(objArr2[i11])) {
                    return false;
                }
                i10++;
                i11++;
            } else {
                i10++;
            }
        }
    }

    public static int c(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(iArr);
    }

    public static int d(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = objArr[i11];
            if (obj != null) {
                i10 = (i10 * 31) + obj.hashCode();
            }
        }
        return i10;
    }

    public static void e(AbstractC2175w1 abstractC2175w1, AbstractC2175w1 abstractC2175w12) {
        abstractC2175w1.getClass();
    }
}
