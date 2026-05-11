package e9;

import V6.AbstractC1287s;
import X8.InterfaceC1302h;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import f9.C3156c;
import java.nio.ByteBuffer;
import s7.G5;
import s7.I5;

/* renamed from: e9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3102a implements InterfaceC1302h {

    /* renamed from: a, reason: collision with root package name */
    private volatile Bitmap f32293a;

    /* renamed from: b, reason: collision with root package name */
    private volatile ByteBuffer f32294b;

    /* renamed from: c, reason: collision with root package name */
    private volatile C3103b f32295c;

    /* renamed from: d, reason: collision with root package name */
    private final int f32296d;

    /* renamed from: e, reason: collision with root package name */
    private final int f32297e;

    /* renamed from: f, reason: collision with root package name */
    private final int f32298f;

    /* renamed from: g, reason: collision with root package name */
    private final int f32299g;

    /* renamed from: h, reason: collision with root package name */
    private final Matrix f32300h;

    private C3102a(Bitmap bitmap, int i10) {
        this.f32293a = (Bitmap) AbstractC1287s.m(bitmap);
        this.f32296d = bitmap.getWidth();
        this.f32297e = bitmap.getHeight();
        n(i10);
        this.f32298f = i10;
        this.f32299g = -1;
        this.f32300h = null;
    }

    public static C3102a a(Bitmap bitmap, int i10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C3102a c3102a = new C3102a(bitmap, i10);
        p(-1, 1, elapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i10);
        return c3102a;
    }

    public static C3102a b(byte[] bArr, int i10, int i11, int i12, int i13) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C3102a c3102a = new C3102a(ByteBuffer.wrap((byte[]) AbstractC1287s.m(bArr)), i10, i11, i12, i13);
        p(i13, 2, elapsedRealtime, i11, i10, bArr.length, i12);
        return c3102a;
    }

    public static C3102a c(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C3102a c3102a = new C3102a(byteBuffer, i10, i11, i12, i13);
        p(i13, 3, elapsedRealtime, i11, i10, byteBuffer.limit(), i12);
        return c3102a;
    }

    public static C3102a d(Image image, int i10) {
        return o(image, i10, null);
    }

    private static int n(int i10) {
        boolean z10 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180) {
            if (i10 == 270) {
                i10 = 270;
            } else {
                z10 = false;
            }
        }
        AbstractC1287s.b(z10, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i10;
    }

    private static C3102a o(Image image, int i10, Matrix matrix) {
        C3102a c3102a;
        int limit;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AbstractC1287s.n(image, "Please provide a valid image");
        n(i10);
        boolean z10 = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z10 = false;
        }
        AbstractC1287s.b(z10, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            c3102a = new C3102a(C3156c.d().b(image, i10), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            c3102a = new C3102a(image, image.getWidth(), image.getHeight(), i10, matrix);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int i11 = limit;
        C3102a c3102a2 = c3102a;
        p(image.getFormat(), 5, elapsedRealtime, image.getHeight(), image.getWidth(), i11, i10);
        return c3102a2;
    }

    private static void p(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        I5.a(G5.b("vision-common"), i10, i11, j10, i12, i13, i14, i15);
    }

    public Bitmap e() {
        return this.f32293a;
    }

    public ByteBuffer f() {
        return this.f32294b;
    }

    public Matrix g() {
        return this.f32300h;
    }

    public int h() {
        return this.f32299g;
    }

    public int i() {
        return this.f32297e;
    }

    public Image j() {
        if (this.f32295c == null) {
            return null;
        }
        return this.f32295c.a();
    }

    public Image.Plane[] k() {
        if (this.f32295c == null) {
            return null;
        }
        return this.f32295c.b();
    }

    public int l() {
        return this.f32298f;
    }

    public int m() {
        return this.f32296d;
    }

    private C3102a(Image image, int i10, int i11, int i12, Matrix matrix) {
        AbstractC1287s.m(image);
        this.f32295c = new C3103b(image);
        this.f32296d = i10;
        this.f32297e = i11;
        n(i12);
        this.f32298f = i12;
        this.f32299g = 35;
        this.f32300h = matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C3102a(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        boolean z10;
        if (i13 != 842094169) {
            if (i13 != 17) {
                z10 = false;
                AbstractC1287s.a(z10);
                this.f32294b = (ByteBuffer) AbstractC1287s.m(byteBuffer);
                AbstractC1287s.b(byteBuffer.limit() > i10 * i11, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
                byteBuffer.rewind();
                this.f32296d = i10;
                this.f32297e = i11;
                n(i12);
                this.f32298f = i12;
                this.f32299g = i13;
                this.f32300h = null;
            }
            i13 = 17;
        }
        z10 = true;
        AbstractC1287s.a(z10);
        this.f32294b = (ByteBuffer) AbstractC1287s.m(byteBuffer);
        AbstractC1287s.b(byteBuffer.limit() > i10 * i11, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.f32296d = i10;
        this.f32297e = i11;
        n(i12);
        this.f32298f = i12;
        this.f32299g = i13;
        this.f32300h = null;
    }
}
