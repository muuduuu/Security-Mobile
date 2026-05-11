package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import b3.l;

/* loaded from: classes.dex */
public class NativeBlurFilter {
    static {
        b.a();
    }

    public static void a(Bitmap bitmap, int i10, int i11) {
        l.g(bitmap);
        l.b(Boolean.valueOf(i10 > 0));
        l.b(Boolean.valueOf(i11 > 0));
        nativeIterativeBoxBlur(bitmap, i10, i11);
    }

    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i10, int i11);
}
