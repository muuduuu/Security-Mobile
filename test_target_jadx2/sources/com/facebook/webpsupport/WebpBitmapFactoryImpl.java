package com.facebook.webpsupport;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import com.facebook.imagepipeline.nativecode.e;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import k3.InterfaceC3538a;
import k3.InterfaceC3539b;

/* loaded from: classes2.dex */
public class WebpBitmapFactoryImpl implements InterfaceC3539b {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC3538a f23092a;

    private static byte[] c(InputStream inputStream, BitmapFactory.Options options) {
        byte[] bArr;
        inputStream.mark(20);
        if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
            bArr = new byte[20];
        }
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    private static Bitmap createBitmap(int i10, int i11, BitmapFactory.Options options) {
        Bitmap bitmap;
        return (options == null || (bitmap = options.inBitmap) == null || !bitmap.isMutable()) ? f23092a.a(i10, i11, Bitmap.Config.ARGB_8888) : options.inBitmap;
    }

    private static void d(String str) {
    }

    private static InputStream e(InputStream inputStream) {
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream, 20) : inputStream;
    }

    private static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        return (options == null || (bArr = options.inTempStorage) == null) ? new byte[8192] : bArr;
    }

    private static float getScaleFromOptions(BitmapFactory.Options options) {
        if (options == null) {
            return 1.0f;
        }
        int i10 = options.inSampleSize;
        float f10 = i10 > 1 ? 1.0f / i10 : 1.0f;
        if (!options.inScaled) {
            return f10;
        }
        int i11 = options.inDensity;
        int i12 = options.inTargetDensity;
        return (i11 == 0 || i12 == 0 || i11 == options.inScreenDensity) ? f10 : i12 / i11;
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i10, int i11, BitmapFactory.Options options) {
        e.a();
        Bitmap originalDecodeByteArray = originalDecodeByteArray(bArr, i10, i11, options);
        if (originalDecodeByteArray == null) {
            d("webp_direct_decode_array_failed_on_no_webp");
        }
        return originalDecodeByteArray;
    }

    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) {
        Bitmap bitmap = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                bitmap = hookDecodeStream(fileInputStream, null, options);
                fileInputStream.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        return bitmap;
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        e.a();
        long nativeSeek = nativeSeek(fileDescriptor, 0L, false);
        if (nativeSeek == -1) {
            Bitmap hookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return hookDecodeStream;
        }
        InputStream e10 = e(new FileInputStream(fileDescriptor));
        try {
            c(e10, options);
            nativeSeek(fileDescriptor, nativeSeek, true);
            Bitmap originalDecodeFileDescriptor = originalDecodeFileDescriptor(fileDescriptor, rect, options);
            if (originalDecodeFileDescriptor == null) {
                d("webp_direct_decode_fd_failed_on_no_webp");
            }
            try {
                return originalDecodeFileDescriptor;
            } catch (Throwable unused) {
                return originalDecodeFileDescriptor;
            }
        } finally {
            try {
                e10.close();
            } catch (Throwable unused2) {
            }
        }
    }

    public static Bitmap hookDecodeResource(Resources resources, int i10, BitmapFactory.Options options) {
        TypedValue typedValue = new TypedValue();
        Bitmap bitmap = null;
        try {
            InputStream openRawResource = resources.openRawResource(i10, typedValue);
            try {
                bitmap = hookDecodeResourceStream(resources, typedValue, openRawResource, null, options);
                if (openRawResource != null) {
                    openRawResource.close();
                }
            } finally {
            }
        } catch (Exception unused) {
        }
        if (bitmap != null || options == null || options.inBitmap == null) {
            return bitmap;
        }
        throw new IllegalArgumentException("Problem decoding into existing bitmap");
    }

    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i10 = typedValue.density;
            if (i10 == 0) {
                options.inDensity = 160;
            } else if (i10 != 65535) {
                options.inDensity = i10;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }

    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        e.a();
        Bitmap originalDecodeStream = originalDecodeStream(e(inputStream), rect, options);
        if (originalDecodeStream == null) {
            d("webp_direct_decode_stream_failed_on_no_webp");
        }
        return originalDecodeStream;
    }

    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i10, int i11, BitmapFactory.Options options, float f10, byte[] bArr2);

    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f10, byte[] bArr);

    private static native long nativeSeek(FileDescriptor fileDescriptor, long j10, boolean z10);

    private static Bitmap originalDecodeByteArray(byte[] bArr, int i10, int i11, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i10, i11, options);
    }

    private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    private static Bitmap originalDecodeResource(Resources resources, int i10, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i10, options);
    }

    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    private static void setBitmapSize(BitmapFactory.Options options, int i10, int i11) {
        if (options != null) {
            options.outWidth = i10;
            options.outHeight = i11;
        }
    }

    private static boolean setOutDimensions(BitmapFactory.Options options, int i10, int i11) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i10;
        options.outHeight = i11;
        return true;
    }

    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    private static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    @Override // k3.InterfaceC3539b
    public Bitmap a(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return hookDecodeFileDescriptor(fileDescriptor, rect, options);
    }

    @Override // k3.InterfaceC3539b
    public void b(InterfaceC3538a interfaceC3538a) {
        f23092a = interfaceC3538a;
    }

    private static Bitmap originalDecodeByteArray(byte[] bArr, int i10, int i11) {
        return BitmapFactory.decodeByteArray(bArr, i10, i11);
    }

    private static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    private static Bitmap originalDecodeResource(Resources resources, int i10) {
        return BitmapFactory.decodeResource(resources, i10);
    }

    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i10, int i11) {
        return hookDecodeByteArray(bArr, i10, i11, null);
    }

    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    public static Bitmap hookDecodeResource(Resources resources, int i10) {
        return hookDecodeResource(resources, i10, null);
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }
}
