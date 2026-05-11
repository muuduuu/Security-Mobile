package L;

import A.AbstractC0700h0;
import E.i;
import E.j;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.n;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class b {

    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC0108a f5616a;

        /* renamed from: L.b$a$a, reason: collision with other inner class name */
        public enum EnumC0108a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        a(String str, EnumC0108a enumC0108a) {
            super(str);
            this.f5616a = enumC0108a;
        }
    }

    public static Rect a(Size size, Rational rational) {
        int i10;
        if (!h(rational)) {
            AbstractC0700h0.l("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f10 = width;
        float f11 = height;
        float f12 = f10 / f11;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i11 = 0;
        if (rational.floatValue() > f12) {
            int round = Math.round((f10 / numerator) * denominator);
            i10 = (height - round) / 2;
            height = round;
        } else {
            int round2 = Math.round((f11 / denominator) * numerator);
            int i12 = (width - round2) / 2;
            width = round2;
            i10 = 0;
            i11 = i12;
        }
        return new Rect(i11, i10, width + i11, height + i10);
    }

    public static Bitmap b(n nVar) {
        int format = nVar.getFormat();
        if (format == 1) {
            return d(nVar);
        }
        if (format == 35) {
            return ImageProcessingUtil.f(nVar);
        }
        if (format == 256 || format == 4101) {
            return c(nVar);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    private static Bitmap c(n nVar) {
        byte[] j10 = j(nVar);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(j10, 0, j10.length, null);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    private static Bitmap d(n nVar) {
        Bitmap createBitmap = Bitmap.createBitmap(nVar.getWidth(), nVar.getHeight(), Bitmap.Config.ARGB_8888);
        nVar.S()[0].m().rewind();
        ImageProcessingUtil.j(createBitmap, nVar.S()[0].m(), nVar.S()[0].n());
        return createBitmap;
    }

    public static ByteBuffer e(Bitmap bitmap) {
        y0.f.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.i(bitmap, allocateDirect, bitmap.getRowBytes());
        allocateDirect.rewind();
        return allocateDirect;
    }

    public static Rational f(int i10, Rational rational) {
        return (i10 == 90 || i10 == 270) ? g(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    private static Rational g(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean h(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    public static boolean i(int i10) {
        return i10 == 256 || i10 == 4101;
    }

    public static byte[] j(n nVar) {
        if (!i(nVar.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.getFormat());
        }
        ByteBuffer m10 = nVar.S()[0].m();
        byte[] bArr = new byte[m10.capacity()];
        m10.rewind();
        m10.get(bArr);
        return bArr;
    }

    public static Bitmap k(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static byte[] l(n nVar, Rect rect, int i10, int i11) {
        if (nVar.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.getFormat());
        }
        YuvImage yuvImage = new YuvImage(m(nVar), 17, nVar.getWidth(), nVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        j jVar = new j(byteArrayOutputStream, i.b(nVar, i11));
        if (rect == null) {
            rect = new Rect(0, 0, nVar.getWidth(), nVar.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i10, jVar)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new a("YuvImage failed to encode jpeg.", a.EnumC0108a.ENCODE_FAILED);
    }

    public static byte[] m(n nVar) {
        n.a aVar = nVar.S()[0];
        n.a aVar2 = nVar.S()[1];
        n.a aVar3 = nVar.S()[2];
        ByteBuffer m10 = aVar.m();
        ByteBuffer m11 = aVar2.m();
        ByteBuffer m12 = aVar3.m();
        m10.rewind();
        m11.rewind();
        m12.rewind();
        int remaining = m10.remaining();
        byte[] bArr = new byte[((nVar.getWidth() * nVar.getHeight()) / 2) + remaining];
        int i10 = 0;
        for (int i11 = 0; i11 < nVar.getHeight(); i11++) {
            m10.get(bArr, i10, nVar.getWidth());
            i10 += nVar.getWidth();
            m10.position(Math.min(remaining, (m10.position() - nVar.getWidth()) + aVar.n()));
        }
        int height = nVar.getHeight() / 2;
        int width = nVar.getWidth() / 2;
        int n10 = aVar3.n();
        int n11 = aVar2.n();
        int o10 = aVar3.o();
        int o11 = aVar2.o();
        byte[] bArr2 = new byte[n10];
        byte[] bArr3 = new byte[n11];
        for (int i12 = 0; i12 < height; i12++) {
            m12.get(bArr2, 0, Math.min(n10, m12.remaining()));
            m11.get(bArr3, 0, Math.min(n11, m11.remaining()));
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < width; i15++) {
                int i16 = i10 + 1;
                bArr[i10] = bArr2[i13];
                i10 += 2;
                bArr[i16] = bArr3[i14];
                i13 += o10;
                i14 += o11;
            }
        }
        return bArr;
    }
}
