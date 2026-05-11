package t2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k2.v;
import l2.InterfaceC3600b;
import q2.C3915l;

/* renamed from: t2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4612h {

    /* renamed from: a, reason: collision with root package name */
    private final List f42283a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3600b f42284b;

    /* renamed from: t2.h$a */
    private static final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        private final AnimatedImageDrawable f42285a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f42285a = animatedImageDrawable;
        }

        @Override // k2.v
        public Class a() {
            return Drawable.class;
        }

        @Override // k2.v
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f42285a;
        }

        @Override // k2.v
        public int k() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.f42285a.getIntrinsicWidth();
            intrinsicHeight = this.f42285a.getIntrinsicHeight();
            return intrinsicWidth * intrinsicHeight * D2.l.j(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // k2.v
        public void recycle() {
            this.f42285a.stop();
            this.f42285a.clearAnimationCallbacks();
        }
    }

    /* renamed from: t2.h$b */
    private static final class b implements i2.j {

        /* renamed from: a, reason: collision with root package name */
        private final C4612h f42286a;

        b(C4612h c4612h) {
            this.f42286a = c4612h;
        }

        @Override // i2.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public v b(ByteBuffer byteBuffer, int i10, int i11, i2.h hVar) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.f42286a.b(createSource, i10, i11, hVar);
        }

        @Override // i2.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ByteBuffer byteBuffer, i2.h hVar) {
            return this.f42286a.d(byteBuffer);
        }
    }

    /* renamed from: t2.h$c */
    private static final class c implements i2.j {

        /* renamed from: a, reason: collision with root package name */
        private final C4612h f42287a;

        c(C4612h c4612h) {
            this.f42287a = c4612h;
        }

        @Override // i2.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public v b(InputStream inputStream, int i10, int i11, i2.h hVar) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(D2.a.b(inputStream));
            return this.f42287a.b(createSource, i10, i11, hVar);
        }

        @Override // i2.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(InputStream inputStream, i2.h hVar) {
            return this.f42287a.c(inputStream);
        }
    }

    private C4612h(List list, InterfaceC3600b interfaceC3600b) {
        this.f42283a = list;
        this.f42284b = interfaceC3600b;
    }

    public static i2.j a(List list, InterfaceC3600b interfaceC3600b) {
        return new b(new C4612h(list, interfaceC3600b));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }

    public static i2.j f(List list, InterfaceC3600b interfaceC3600b) {
        return new c(new C4612h(list, interfaceC3600b));
    }

    v b(ImageDecoder.Source source, int i10, int i11, i2.h hVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new C3915l(i10, i11, hVar));
        if (AbstractC4606b.a(decodeDrawable)) {
            return new a(AbstractC4607c.a(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f42283a, inputStream, this.f42284b));
    }

    boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f42283a, byteBuffer));
    }
}
