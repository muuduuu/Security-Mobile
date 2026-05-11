package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import b3.l;
import b3.q;
import f3.AbstractC3142a;
import g4.i;
import j4.C3499g;
import j4.h;
import java.util.Locale;
import q4.C3919a;

/* loaded from: classes.dex */
public abstract class DalvikPurgeableDecoder implements k4.d {

    /* renamed from: b, reason: collision with root package name */
    protected static final byte[] f20720b;

    /* renamed from: a, reason: collision with root package name */
    private final C3499g f20721a = h.a();

    private static class OreoUtils {
        private OreoUtils() {
        }

        static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            ColorSpace.Named named;
            if (colorSpace == null) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        a.a();
        f20720b = new byte[]{-1, -39};
    }

    protected DalvikPurgeableDecoder() {
    }

    public static boolean e(AbstractC3142a abstractC3142a, int i10) {
        e3.h hVar = (e3.h) abstractC3142a.p();
        return i10 >= 2 && hVar.B(i10 + (-2)) == -1 && hVar.B(i10 - 1) == -39;
    }

    public static BitmapFactory.Options f(int i10, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i10;
        options.inMutable = true;
        return options;
    }

    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // k4.d
    public AbstractC3142a a(i iVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace) {
        BitmapFactory.Options f10 = f(iVar.o(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(f10, colorSpace);
        }
        AbstractC3142a e10 = iVar.e();
        l.g(e10);
        try {
            return g(d(e10, i10, f10));
        } finally {
            AbstractC3142a.n(e10);
        }
    }

    @Override // k4.d
    public AbstractC3142a b(i iVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options f10 = f(iVar.o(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(f10, colorSpace);
        }
        AbstractC3142a e10 = iVar.e();
        l.g(e10);
        try {
            return g(c(e10, f10));
        } finally {
            AbstractC3142a.n(e10);
        }
    }

    protected abstract Bitmap c(AbstractC3142a abstractC3142a, BitmapFactory.Options options);

    protected abstract Bitmap d(AbstractC3142a abstractC3142a, int i10, BitmapFactory.Options options);

    public AbstractC3142a g(Bitmap bitmap) {
        l.g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f20721a.g(bitmap)) {
                return AbstractC3142a.C(bitmap, this.f20721a.e());
            }
            int g10 = C3919a.g(bitmap);
            bitmap.recycle();
            throw new a4.h(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(g10), Integer.valueOf(this.f20721a.b()), Long.valueOf(this.f20721a.f()), Integer.valueOf(this.f20721a.c()), Integer.valueOf(this.f20721a.d())));
        } catch (Exception e10) {
            bitmap.recycle();
            throw q.a(e10);
        }
    }
}
