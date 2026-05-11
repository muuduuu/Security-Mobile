package F2;

import F2.d;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.util.Pair;
import com.canhub.cropper.CropImageView;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import zc.AbstractC5272a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2261a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final Rect f2262b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    private static final RectF f2263c = new RectF();

    /* renamed from: d, reason: collision with root package name */
    private static final RectF f2264d = new RectF();

    /* renamed from: e, reason: collision with root package name */
    private static final float[] f2265e = new float[6];

    /* renamed from: f, reason: collision with root package name */
    private static final float[] f2266f = new float[6];

    /* renamed from: g, reason: collision with root package name */
    private static int f2267g;

    /* renamed from: h, reason: collision with root package name */
    private static Pair f2268h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Bitmap f2269a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2270b;

        public a(Bitmap bitmap, int i10) {
            this.f2269a = bitmap;
            this.f2270b = i10;
        }

        public final Bitmap a() {
            return this.f2269a;
        }

        public final int b() {
            return this.f2270b;
        }
    }

    /* renamed from: F2.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C0054c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2275a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            f2275a = iArr;
        }
    }

    private c() {
    }

    private final Bitmap I(Bitmap bitmap, int i10, boolean z10, boolean z11) {
        if (i10 <= 0 && !z10 && !z11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10);
        matrix.postScale(z10 ? -1 : 1, z11 ? -1 : 1);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        if (!Intrinsics.b(createBitmap, bitmap)) {
            bitmap.recycle();
        }
        Intrinsics.checkNotNullExpressionValue(createBitmap, "{\n            val matrix…      newBitmap\n        }");
        return createBitmap;
    }

    private final Uri a(Context context, Bitmap.CompressFormat compressFormat) {
        try {
            int i10 = C0054c.f2275a[compressFormat.ordinal()];
            String str = i10 != 1 ? i10 != 2 ? ".webp" : ".png" : ".jpg";
            if (!G2.a.f2841a.c()) {
                return Uri.fromFile(File.createTempFile("cropped", str, context.getCacheDir()));
            }
            try {
                File file = File.createTempFile("cropped", str, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                Intrinsics.checkNotNullExpressionValue(file, "file");
                return I2.c.a(context, file);
            } catch (Exception e10) {
                Log.e("AIC", String.valueOf(e10.getMessage()));
                File file2 = File.createTempFile("cropped", str, context.getCacheDir());
                Intrinsics.checkNotNullExpressionValue(file2, "file");
                return I2.c.a(context, file2);
            }
        } catch (IOException e11) {
            throw new RuntimeException("Failed to create temp file for output image", e11);
        }
    }

    private final int b(int i10, int i11) {
        if (f2267g == 0) {
            f2267g = s();
        }
        int i12 = 1;
        if (f2267g > 0) {
            while (true) {
                int i13 = i11 / i12;
                int i14 = f2267g;
                if (i13 <= i14 && i10 / i12 <= i14) {
                    break;
                }
                i12 *= 2;
            }
        }
        return i12;
    }

    private final int c(int i10, int i11, int i12, int i13) {
        int i14 = 1;
        if (i11 > i13 || i10 > i12) {
            while ((i11 / 2) / i14 > i13 && (i10 / 2) / i14 > i12) {
                i14 *= 2;
            }
        }
        return i14;
    }

    private final void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private final a f(Context context, Uri uri, float[] fArr, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12, int i17) {
        int i18;
        Rect z13 = z(fArr, i11, i12, z10, i13, i14);
        int width = i15 > 0 ? i15 : z13.width();
        int height = i16 > 0 ? i16 : z13.height();
        Bitmap bitmap = null;
        try {
            a n10 = n(context, uri, z13, width, height, i17);
            bitmap = n10.a();
            i18 = n10.b();
        } catch (Exception unused) {
            i18 = 1;
        }
        int i19 = i18;
        if (bitmap == null) {
            return g(context, uri, fArr, i10, z10, i13, i14, i17, z13, width, height, z11, z12);
        }
        try {
            Bitmap I10 = I(bitmap, i10, z11, z12);
            try {
                if (i10 % 90 != 0) {
                    I10 = j(I10, fArr, z13, i10, z10, i13, i14);
                }
                return new a(I10, i19);
            } catch (OutOfMemoryError e10) {
                e = e10;
                bitmap = I10;
                bitmap.recycle();
                throw e;
            }
        } catch (OutOfMemoryError e11) {
            e = e11;
        }
    }

    private final a g(Context context, Uri uri, float[] fArr, int i10, boolean z10, int i11, int i12, int i13, Rect rect, int i14, int i15, boolean z11, boolean z12) {
        Bitmap bitmap = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int c10 = i13 * c(rect.width(), rect.height(), i14, i15);
            options.inSampleSize = c10;
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "context.contentResolver");
            Bitmap k10 = k(contentResolver, uri, options);
            if (k10 != null) {
                try {
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                    for (int i16 = 0; i16 < length; i16++) {
                        fArr2[i16] = fArr2[i16] / options.inSampleSize;
                    }
                    bitmap = i(k10, fArr2, i10, z10, i11, i12, 1.0f, z11, z12);
                    if (!Intrinsics.b(bitmap, k10)) {
                        k10.recycle();
                    }
                } catch (Throwable th) {
                    if (!Intrinsics.b(null, k10)) {
                        k10.recycle();
                    }
                    throw th;
                }
            }
            return new a(bitmap, c10);
        } catch (Exception e10) {
            throw new d.c(uri, e10.getMessage());
        } catch (OutOfMemoryError e11) {
            if (0 != 0) {
                bitmap.recycle();
            }
            throw e11;
        }
    }

    private final Bitmap i(Bitmap bitmap, float[] fArr, int i10, boolean z10, int i11, int i12, float f10, boolean z11, boolean z12) {
        float f11 = f10;
        Rect z13 = z(fArr, bitmap.getWidth(), bitmap.getHeight(), z10, i11, i12);
        Matrix matrix = new Matrix();
        matrix.setRotate(i10, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        float f12 = z11 ? -f11 : f11;
        if (z12) {
            f11 = -f11;
        }
        matrix.postScale(f12, f11);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, z13.left, z13.top, z13.width(), z13.height(), matrix, true);
        if (Intrinsics.b(createBitmap, bitmap)) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        Bitmap bitmap2 = createBitmap;
        return i10 % 90 != 0 ? j(bitmap2, fArr, z13, i10, z10, i11, i12) : bitmap2;
    }

    private final Bitmap j(Bitmap bitmap, float[] fArr, Rect rect, int i10, boolean z10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        if (i10 % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians(i10);
        int i16 = (i10 < 90 || (181 <= i10 && i10 < 270)) ? rect.left : rect.right;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i18 >= fArr.length) {
                i13 = 0;
                i14 = 0;
                i15 = 0;
                break;
            }
            float f10 = fArr[i18];
            if (f10 >= i16 - 1 && f10 <= i16 + 1) {
                int i19 = i18 + 1;
                i17 = (int) Math.abs(Math.sin(radians) * (rect.bottom - fArr[i19]));
                i14 = (int) Math.abs(Math.cos(radians) * (fArr[i19] - rect.top));
                i15 = (int) Math.abs((fArr[i19] - rect.top) / Math.sin(radians));
                i13 = (int) Math.abs((rect.bottom - fArr[i19]) / Math.cos(radians));
                break;
            }
            i18 += 2;
        }
        rect.set(i17, i14, i15 + i17, i13 + i14);
        if (z10) {
            o(rect, i11, i12);
        }
        Intrinsics.d(bitmap);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (!Intrinsics.b(bitmap, createBitmap) && bitmap != null) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    private final Bitmap k(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) {
        do {
            InputStream inputStream = null;
            try {
                try {
                    inputStream = contentResolver.openInputStream(uri);
                    return BitmapFactory.decodeStream(inputStream, f2262b, options);
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    d(inputStream);
                }
            } finally {
                d(inputStream);
            }
        } while (options.inSampleSize <= 512);
        throw new d.b(uri);
    }

    private final BitmapFactory.Options l(ContentResolver contentResolver, Uri uri) {
        InputStream inputStream;
        try {
            inputStream = contentResolver.openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, f2262b, options);
                options.inJustDecodeBounds = false;
                d(inputStream);
                return options;
            } catch (Throwable th) {
                th = th;
                d(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private final a n(Context context, Uri uri, Rect rect, int i10, int i11, int i12) {
        int i13;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i12 * c(rect.width(), rect.height(), i10, i11);
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            Intrinsics.d(openInputStream);
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(openInputStream, false);
            do {
                try {
                    Intrinsics.d(newInstance);
                    return new a(newInstance.decodeRegion(rect, options), options.inSampleSize);
                } catch (OutOfMemoryError unused) {
                    i13 = options.inSampleSize * 2;
                    options.inSampleSize = i13;
                }
            } while (i13 <= 512);
            d(openInputStream);
            if (newInstance != null) {
                newInstance.recycle();
            }
            return new a(null, 1);
        } catch (Exception e10) {
            throw new d.c(uri, e10.getMessage());
        }
    }

    private final void o(Rect rect, int i10, int i11) {
        if (i10 != i11 || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    private final int s() {
        try {
            EGL egl = EGLContext.getEGL();
            Intrinsics.e(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
            EGL10 egl10 = (EGL10) egl;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
            int i10 = iArr[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i10];
            egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, i10, iArr);
            int[] iArr2 = new int[1];
            int i11 = iArr[0];
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i13], 12332, iArr2);
                int i14 = iArr2[0];
                if (i12 < i14) {
                    i12 = i14;
                }
            }
            egl10.eglTerminate(eglGetDisplay);
            return Math.max(i12, 2048);
        } catch (Exception unused) {
            return 2048;
        }
    }

    public final float A(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return w(points) - D(points);
    }

    public final float B(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.min(Math.min(Math.min(points[0], points[2]), points[4]), points[6]);
    }

    public final float C(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.max(Math.max(Math.max(points[0], points[2]), points[4]), points[6]);
    }

    public final float D(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.min(Math.min(Math.min(points[1], points[3]), points[5]), points[7]);
    }

    public final float E(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return C(points) - B(points);
    }

    public final b F(Bitmap bitmap, Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        androidx.exifinterface.media.a aVar = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.d(uri);
            InputStream openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream != null) {
                androidx.exifinterface.media.a aVar2 = new androidx.exifinterface.media.a(openInputStream);
                try {
                    openInputStream.close();
                } catch (Exception unused) {
                }
                aVar = aVar2;
            }
        } catch (Exception unused2) {
        }
        if (aVar != null) {
            return G(bitmap, aVar);
        }
        return new b(bitmap, 0, false, false, 12, null);
    }

    public final b G(Bitmap bitmap, androidx.exifinterface.media.a exif) {
        Intrinsics.checkNotNullParameter(exif, "exif");
        boolean z10 = true;
        int i10 = exif.i("Orientation", 1);
        int i11 = i10 != 3 ? (i10 == 5 || i10 == 6 || i10 == 7) ? 90 : i10 != 8 ? 0 : 270 : 180;
        boolean z11 = i10 == 2 || i10 == 5;
        if (i10 != 4 && i10 != 7) {
            z10 = false;
        }
        return new b(bitmap, i11, z11, z10);
    }

    public final Bitmap H(Bitmap bitmap, int i10, int i11, CropImageView.k options) {
        Bitmap createScaledBitmap;
        Intrinsics.checkNotNullParameter(options, "options");
        if (i10 > 0 && i11 > 0) {
            try {
                CropImageView.k kVar = CropImageView.k.RESIZE_FIT;
                if (options != kVar) {
                    if (options != CropImageView.k.RESIZE_INSIDE) {
                        if (options == CropImageView.k.RESIZE_EXACT) {
                        }
                    }
                }
                if (options == CropImageView.k.RESIZE_EXACT) {
                    Intrinsics.d(bitmap);
                    createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, false);
                } else {
                    Intrinsics.d(bitmap);
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    float max = Math.max(width / i10, height / i11);
                    if (max <= 1.0f && options != kVar) {
                        createScaledBitmap = null;
                    }
                    createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                }
                if (createScaledBitmap != null) {
                    if (!Intrinsics.b(createScaledBitmap, bitmap)) {
                        bitmap.recycle();
                    }
                    return createScaledBitmap;
                }
            } catch (Exception e10) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e10);
            }
        }
        Intrinsics.d(bitmap);
        return bitmap;
    }

    public final void J(Pair pair) {
        f2268h = pair;
    }

    public final Uri K(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i10, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(compressFormat, "compressFormat");
        if (uri == null) {
            uri = a(context, compressFormat);
        }
        OutputStream outputStream = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.d(uri);
            outputStream = contentResolver.openOutputStream(uri, "wt");
            bitmap.compress(compressFormat, i10, outputStream);
            return uri;
        } finally {
            d(outputStream);
        }
    }

    public final Uri L(Context context, Bitmap bitmap, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intrinsics.d(bitmap);
            return K(context, bitmap, Bitmap.CompressFormat.JPEG, 95, uri);
        } catch (Exception e10) {
            Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e10);
            return null;
        }
    }

    public final a e(Context context, Uri uri, float[] points, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(points, "points");
        int i17 = 1;
        while (true) {
            try {
                Intrinsics.d(uri);
                return f(context, uri, points, i10, i11, i12, z10, i13, i14, i15, i16, z11, z12, i17);
            } catch (OutOfMemoryError e10) {
                int i18 = i17 * 2;
                if (i18 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i18 + "): " + uri + "\r\n" + e10.getMessage(), e10);
                }
                i17 = i18;
            }
        }
    }

    public final a h(Bitmap bitmap, float[] points, int i10, boolean z10, int i11, int i12, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(points, "points");
        int i13 = 1;
        do {
            try {
                Intrinsics.d(bitmap);
                return new a(i(bitmap, points, i10, z10, i11, i12, 1 / i13, z11, z12), i13);
            } catch (OutOfMemoryError e10) {
                i13 *= 2;
            }
        } while (i13 <= 8);
        throw e10;
    }

    public final a m(Context context, Uri uri, int i10, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            ContentResolver resolver = context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(resolver, "resolver");
            BitmapFactory.Options l10 = l(resolver, uri);
            int i12 = l10.outWidth;
            if (i12 == -1 && l10.outHeight == -1) {
                throw new RuntimeException("File is not a picture");
            }
            l10.inSampleSize = Math.max(c(i12, l10.outHeight, i10, i11), b(l10.outWidth, l10.outHeight));
            return new a(k(resolver, uri, l10), l10.inSampleSize);
        } catch (Exception e10) {
            throw new d.c(uri, e10.getMessage());
        }
    }

    public final Rect p() {
        return f2262b;
    }

    public final RectF q() {
        return f2263c;
    }

    public final Pair r() {
        return f2268h;
    }

    public final float[] t() {
        return f2265e;
    }

    public final float[] u() {
        return f2266f;
    }

    public final RectF v() {
        return f2264d;
    }

    public final float w(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.max(Math.max(Math.max(points[1], points[3]), points[5]), points[7]);
    }

    public final float x(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return (C(points) + B(points)) / 2.0f;
    }

    public final float y(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return (w(points) + D(points)) / 2.0f;
    }

    public final Rect z(float[] points, int i10, int i11, boolean z10, int i12, int i13) {
        Intrinsics.checkNotNullParameter(points, "points");
        Rect rect = new Rect(AbstractC5272a.c(Math.max(0.0f, B(points))), AbstractC5272a.c(Math.max(0.0f, D(points))), AbstractC5272a.c(Math.min(i10, C(points))), AbstractC5272a.c(Math.min(i11, w(points))));
        if (z10) {
            o(rect, i12, i13);
        }
        return rect;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Bitmap f2271a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2272b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f2273c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f2274d;

        public b(Bitmap bitmap, int i10, boolean z10, boolean z11) {
            this.f2271a = bitmap;
            this.f2272b = i10;
            this.f2273c = z10;
            this.f2274d = z11;
        }

        public final Bitmap a() {
            return this.f2271a;
        }

        public final int b() {
            return this.f2272b;
        }

        public final boolean c() {
            return this.f2273c;
        }

        public final boolean d() {
            return this.f2274d;
        }

        public /* synthetic */ b(Bitmap bitmap, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(bitmap, i10, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? false : z11);
        }
    }
}
