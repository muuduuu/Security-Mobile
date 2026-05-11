package o4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import c3.AbstractC1721a;
import g4.i;
import java.io.OutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3754g implements InterfaceC3750c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f37930d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37931a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37932b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37933c = "SimpleImageTranscoder";

    /* renamed from: o4.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap.CompressFormat b(S3.c cVar) {
            return cVar == null ? Bitmap.CompressFormat.JPEG : cVar == S3.b.f8722b ? Bitmap.CompressFormat.JPEG : cVar == S3.b.f8723c ? Bitmap.CompressFormat.PNG : S3.b.a(cVar) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
        }

        private a() {
        }
    }

    public C3754g(boolean z10, int i10) {
        this.f37931a = z10;
        this.f37932b = i10;
    }

    private final int e(i iVar, a4.g gVar, a4.f fVar) {
        if (this.f37931a) {
            return C3748a.b(gVar, fVar, iVar, this.f37932b);
        }
        return 1;
    }

    @Override // o4.InterfaceC3750c
    public String a() {
        return this.f37933c;
    }

    @Override // o4.InterfaceC3750c
    public C3749b b(i encodedImage, OutputStream outputStream, a4.g gVar, a4.f fVar, S3.c cVar, Integer num, ColorSpace colorSpace) {
        C3754g c3754g;
        a4.g gVar2;
        Bitmap bitmap;
        C3749b c3749b;
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        Integer num2 = num == null ? 85 : num;
        if (gVar == null) {
            gVar2 = a4.g.f12603c.a();
            c3754g = this;
        } else {
            c3754g = this;
            gVar2 = gVar;
        }
        int e10 = c3754g.e(encodedImage, gVar2, fVar);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = e10;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(encodedImage.l(), null, options);
            if (decodeStream == null) {
                AbstractC1721a.m("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new C3749b(2);
            }
            Matrix g10 = C3752e.g(encodedImage, gVar2);
            if (g10 != null) {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), g10, false);
                    Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …x,\n                false)");
                    bitmap = createBitmap;
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    bitmap = decodeStream;
                    AbstractC1721a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    c3749b = new C3749b(2);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return c3749b;
                } catch (Throwable th) {
                    th = th;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                try {
                    bitmap.compress(f37930d.b(cVar), num2.intValue(), outputStream);
                    c3749b = new C3749b(e10 > 1 ? 0 : 1);
                } catch (OutOfMemoryError e12) {
                    e = e12;
                    AbstractC1721a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    c3749b = new C3749b(2);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return c3749b;
                }
                bitmap.recycle();
                decodeStream.recycle();
                return c3749b;
            } catch (Throwable th2) {
                th = th2;
                bitmap.recycle();
                decodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e13) {
            AbstractC1721a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e13);
            return new C3749b(2);
        }
    }

    @Override // o4.InterfaceC3750c
    public boolean c(i encodedImage, a4.g gVar, a4.f fVar) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (gVar == null) {
            gVar = a4.g.f12603c.a();
        }
        return this.f37931a && C3748a.b(gVar, fVar, encodedImage, this.f37932b) > 1;
    }

    @Override // o4.InterfaceC3750c
    public boolean d(S3.c imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return imageFormat == S3.b.f8732l || imageFormat == S3.b.f8722b;
    }
}
