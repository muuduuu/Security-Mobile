package E7;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final C0039b f1904a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f1905b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f1906c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final b f1907a = new b();

        public b a() {
            if (this.f1907a.f1905b != null || this.f1907a.f1906c != null) {
                return this.f1907a;
            }
            b.i(this.f1907a);
            throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
        }

        public a b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.f1907a.f1906c = bitmap;
            C0039b c10 = this.f1907a.c();
            c10.f1908a = width;
            c10.f1909b = height;
            return this;
        }

        public a c(ByteBuffer byteBuffer, int i10, int i11, int i12) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            }
            if (byteBuffer.capacity() < i10 * i11) {
                throw new IllegalArgumentException("Invalid image data size.");
            }
            if (i12 != 16 && i12 != 17 && i12 != 842094169) {
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unsupported image format: ");
                sb2.append(i12);
                throw new IllegalArgumentException(sb2.toString());
            }
            this.f1907a.f1905b = byteBuffer;
            C0039b c10 = this.f1907a.c();
            c10.f1908a = i10;
            c10.f1909b = i11;
            c10.f1913f = i12;
            return this;
        }
    }

    /* renamed from: E7.b$b, reason: collision with other inner class name */
    public static class C0039b {

        /* renamed from: a, reason: collision with root package name */
        private int f1908a;

        /* renamed from: b, reason: collision with root package name */
        private int f1909b;

        /* renamed from: c, reason: collision with root package name */
        private int f1910c;

        /* renamed from: d, reason: collision with root package name */
        private long f1911d;

        /* renamed from: e, reason: collision with root package name */
        private int f1912e;

        /* renamed from: f, reason: collision with root package name */
        private int f1913f = -1;

        public int a() {
            return this.f1909b;
        }

        public int b() {
            return this.f1910c;
        }

        public int c() {
            return this.f1912e;
        }

        public long d() {
            return this.f1911d;
        }

        public int e() {
            return this.f1908a;
        }
    }

    private static class c {
    }

    private b() {
        this.f1904a = new C0039b();
        this.f1905b = null;
        this.f1906c = null;
    }

    static /* synthetic */ c i(b bVar) {
        bVar.getClass();
        return null;
    }

    public Bitmap a() {
        return this.f1906c;
    }

    public ByteBuffer b() {
        Bitmap bitmap = this.f1906c;
        if (bitmap == null) {
            return this.f1905b;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = this.f1906c.getHeight();
        int i10 = width * height;
        this.f1906c.getPixels(new int[i10], 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((Color.red(r9[i11]) * 0.299f) + (Color.green(r9[i11]) * 0.587f) + (Color.blue(r9[i11]) * 0.114f));
        }
        return ByteBuffer.wrap(bArr);
    }

    public C0039b c() {
        return this.f1904a;
    }

    public Image.Plane[] d() {
        return null;
    }
}
