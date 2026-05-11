package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import b3.l;

/* loaded from: classes.dex */
public class NativeRoundingFilter {
    static {
        b.a();
    }

    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i10, int i11, int i12, int i13);

    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z10);

    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z10);

    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i10, int i11, boolean z10);

    public static void toCircle(Bitmap bitmap, boolean z10) {
        l.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z10);
    }

    public static void toCircleFast(Bitmap bitmap, boolean z10) {
        l.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z10);
    }
}
