package q2;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import i2.EnumC3314b;
import r2.t;
import r2.x;

/* renamed from: q2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3915l implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    private final x f38739a = x.b();

    /* renamed from: b, reason: collision with root package name */
    private final int f38740b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38741c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC3314b f38742d;

    /* renamed from: e, reason: collision with root package name */
    private final r2.n f38743e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f38744f;

    /* renamed from: g, reason: collision with root package name */
    private final i2.i f38745g;

    /* renamed from: q2.l$a */
    class a implements ImageDecoder$OnPartialImageListener {
        a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C3915l(int i10, int i11, i2.h hVar) {
        this.f38740b = i10;
        this.f38741c = i11;
        this.f38742d = (EnumC3314b) hVar.c(t.f39172f);
        this.f38743e = (r2.n) hVar.c(r2.n.f39170h);
        i2.g gVar = t.f39176j;
        this.f38744f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f38745g = (i2.i) hVar.c(t.f39173g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        if (this.f38739a.f(this.f38740b, this.f38741c, this.f38744f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f38742d == EnumC3314b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        size = imageInfo.getSize();
        int i10 = this.f38740b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = size.getWidth();
        }
        int i11 = this.f38741c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = size.getHeight();
        }
        float b10 = this.f38743e.b(size.getWidth(), size.getHeight(), i10, i11);
        int round = Math.round(size.getWidth() * b10);
        int round2 = Math.round(size.getHeight() * b10);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b10);
        }
        imageDecoder.setTargetSize(round, round2);
        i2.i iVar = this.f38745g;
        if (iVar != null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 < 28) {
                if (i12 >= 26) {
                    named = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(named);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    return;
                }
                return;
            }
            if (iVar == i2.i.DISPLAY_P3) {
                colorSpace3 = imageInfo.getColorSpace();
                if (colorSpace3 != null) {
                    colorSpace4 = imageInfo.getColorSpace();
                    isWideGamut = colorSpace4.isWideGamut();
                    if (isWideGamut) {
                        named2 = ColorSpace.Named.DISPLAY_P3;
                        colorSpace2 = ColorSpace.get(named2);
                        imageDecoder.setTargetColorSpace(colorSpace2);
                    }
                }
            }
            named2 = ColorSpace.Named.SRGB;
            colorSpace2 = ColorSpace.get(named2);
            imageDecoder.setTargetColorSpace(colorSpace2);
        }
    }
}
