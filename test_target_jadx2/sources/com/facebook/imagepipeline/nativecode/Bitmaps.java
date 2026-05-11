package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import b3.l;

/* loaded from: classes.dex */
public class Bitmaps {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20719a = 0;

    static {
        a.a();
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        l.b(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        l.b(Boolean.valueOf(bitmap.isMutable()));
        l.b(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        l.b(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    private static native void nativeCopyBitmap(Bitmap bitmap, int i10, Bitmap bitmap2, int i11, int i12);
}
