package androidx.camera.core;

import A.AbstractC0700h0;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.e;
import androidx.camera.core.impl.InterfaceC1458r0;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class ImageProcessingUtil {

    /* renamed from: a, reason: collision with root package name */
    private static int f14343a;

    enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static boolean c(n nVar) {
        if (!l(nVar)) {
            AbstractC0700h0.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        if (d(nVar) != a.ERROR_CONVERSION) {
            return true;
        }
        AbstractC0700h0.c("ImageProcessingUtil", "One pixel shift for YUV failure");
        return false;
    }

    private static a d(n nVar) {
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int n10 = nVar.S()[0].n();
        int n11 = nVar.S()[1].n();
        int n12 = nVar.S()[2].n();
        int o10 = nVar.S()[0].o();
        int o11 = nVar.S()[1].o();
        return nativeShiftPixel(nVar.S()[0].m(), n10, nVar.S()[1].m(), n11, nVar.S()[2].m(), n12, o10, o11, width, height, o10, o11, o11) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static n e(InterfaceC1458r0 interfaceC1458r0, byte[] bArr) {
        y0.f.a(interfaceC1458r0.d() == 256);
        y0.f.g(bArr);
        Surface a10 = interfaceC1458r0.a();
        y0.f.g(a10);
        if (nativeWriteJpegToSurface(bArr, a10) != 0) {
            AbstractC0700h0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        n c10 = interfaceC1458r0.c();
        if (c10 == null) {
            AbstractC0700h0.c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return c10;
    }

    public static Bitmap f(n nVar) {
        if (nVar.getFormat() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int n10 = nVar.S()[0].n();
        int n11 = nVar.S()[1].n();
        int n12 = nVar.S()[2].n();
        int o10 = nVar.S()[0].o();
        int o11 = nVar.S()[1].o();
        Bitmap createBitmap = Bitmap.createBitmap(nVar.getWidth(), nVar.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(nVar.S()[0].m(), n10, nVar.S()[1].m(), n11, nVar.S()[2].m(), n12, o10, o11, createBitmap, createBitmap.getRowBytes(), width, height) == 0) {
            return createBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static n g(final n nVar, InterfaceC1458r0 interfaceC1458r0, ByteBuffer byteBuffer, int i10, boolean z10) {
        if (!l(nVar)) {
            AbstractC0700h0.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!k(i10)) {
            AbstractC0700h0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (h(nVar, interfaceC1458r0.a(), byteBuffer, i10, z10) == a.ERROR_CONVERSION) {
            AbstractC0700h0.c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            AbstractC0700h0.a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(f14343a)));
            f14343a++;
        }
        final n c10 = interfaceC1458r0.c();
        if (c10 == null) {
            AbstractC0700h0.c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        s sVar = new s(c10);
        sVar.a(new e.a() { // from class: A.Z
            @Override // androidx.camera.core.e.a
            public final void b(androidx.camera.core.n nVar2) {
                ImageProcessingUtil.m(androidx.camera.core.n.this, nVar, nVar2);
            }
        });
        return sVar;
    }

    private static a h(n nVar, Surface surface, ByteBuffer byteBuffer, int i10, boolean z10) {
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int n10 = nVar.S()[0].n();
        int n11 = nVar.S()[1].n();
        int n12 = nVar.S()[2].n();
        int o10 = nVar.S()[0].o();
        int o11 = nVar.S()[1].o();
        return nativeConvertAndroid420ToABGR(nVar.S()[0].m(), n10, nVar.S()[1].m(), n11, nVar.S()[2].m(), n12, o10, o11, surface, byteBuffer, width, height, z10 ? o10 : 0, z10 ? o11 : 0, z10 ? o11 : 0, i10) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static void i(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i10, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void j(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i10, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    private static boolean k(int i10) {
        return i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270;
    }

    private static boolean l(n nVar) {
        return nVar.getFormat() == 35 && nVar.S().length == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(n nVar, n nVar2, n nVar3) {
        if (nVar == null || nVar2 == null) {
            return;
        }
        nVar2.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(n nVar, n nVar2, n nVar3) {
        if (nVar == null || nVar2 == null) {
            return;
        }
        nVar2.close();
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Surface surface, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18, int i19, int i20);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Bitmap bitmap, int i15, int i16, int i17);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, boolean z10);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, ByteBuffer byteBuffer4, int i14, int i15, ByteBuffer byteBuffer5, int i16, int i17, ByteBuffer byteBuffer6, int i18, int i19, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i20, int i21, int i22);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    public static n o(final n nVar, InterfaceC1458r0 interfaceC1458r0, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (!l(nVar)) {
            AbstractC0700h0.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!k(i10)) {
            AbstractC0700h0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        a aVar = a.ERROR_CONVERSION;
        if ((i10 > 0 ? p(nVar, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i10) : aVar) == aVar) {
            AbstractC0700h0.c("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        final n c10 = interfaceC1458r0.c();
        if (c10 == null) {
            AbstractC0700h0.c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
            return null;
        }
        s sVar = new s(c10);
        sVar.a(new e.a() { // from class: A.a0
            @Override // androidx.camera.core.e.a
            public final void b(androidx.camera.core.n nVar2) {
                ImageProcessingUtil.n(androidx.camera.core.n.this, nVar, nVar2);
            }
        });
        return sVar;
    }

    private static a p(n nVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int n10 = nVar.S()[0].n();
        int n11 = nVar.S()[1].n();
        int n12 = nVar.S()[2].n();
        int o10 = nVar.S()[1].o();
        Image b10 = I.a.b(imageWriter);
        if (b10 == null) {
            return a.ERROR_CONVERSION;
        }
        if (nativeRotateYUV(nVar.S()[0].m(), n10, nVar.S()[1].m(), n11, nVar.S()[2].m(), n12, o10, b10.getPlanes()[0].getBuffer(), b10.getPlanes()[0].getRowStride(), b10.getPlanes()[0].getPixelStride(), b10.getPlanes()[1].getBuffer(), b10.getPlanes()[1].getRowStride(), b10.getPlanes()[1].getPixelStride(), b10.getPlanes()[2].getBuffer(), b10.getPlanes()[2].getRowStride(), b10.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i10) != 0) {
            return a.ERROR_CONVERSION;
        }
        I.a.d(imageWriter, b10);
        return a.SUCCESS;
    }

    public static boolean q(Surface surface, byte[] bArr) {
        y0.f.g(bArr);
        y0.f.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        AbstractC0700h0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }
}
