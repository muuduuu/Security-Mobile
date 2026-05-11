package o4;

import c3.AbstractC1721a;
import g4.i;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3748a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3748a f37921a = new C3748a();

    private C3748a() {
    }

    public static final float a(a4.g rotationOptions, a4.f fVar, i encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!i.u(encodedImage)) {
            throw new IllegalStateException("Check failed.");
        }
        if (fVar == null || fVar.f12600b <= 0 || fVar.f12599a <= 0 || encodedImage.getWidth() == 0 || encodedImage.getHeight() == 0) {
            return 1.0f;
        }
        int d10 = f37921a.d(rotationOptions, encodedImage);
        boolean z10 = d10 == 90 || d10 == 270;
        int height = z10 ? encodedImage.getHeight() : encodedImage.getWidth();
        int width = z10 ? encodedImage.getWidth() : encodedImage.getHeight();
        float f10 = fVar.f12599a / height;
        float f11 = fVar.f12600b / width;
        float c10 = kotlin.ranges.d.c(f10, f11);
        AbstractC1721a.E("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(fVar.f12599a), Integer.valueOf(fVar.f12600b), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(c10));
        return c10;
    }

    public static final int b(a4.g rotationOptions, a4.f fVar, i encodedImage, int i10) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!i.u(encodedImage)) {
            return 1;
        }
        float a10 = a(rotationOptions, fVar, encodedImage);
        int f10 = encodedImage.j() == S3.b.f8722b ? f(a10) : e(a10);
        int max = Math.max(encodedImage.getHeight(), encodedImage.getWidth());
        float f11 = fVar != null ? fVar.f12601c : i10;
        while (max / f10 > f11) {
            f10 = encodedImage.j() == S3.b.f8722b ? f10 * 2 : f10 + 1;
        }
        return f10;
    }

    public static final int c(i encodedImage, int i10, int i11) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int o10 = encodedImage.o();
        while ((((encodedImage.getWidth() * encodedImage.getHeight()) * i10) / o10) / o10 > i11) {
            o10 *= 2;
        }
        return o10;
    }

    private final int d(a4.g gVar, i iVar) {
        if (!gVar.h()) {
            return 0;
        }
        int t02 = iVar.t0();
        if (t02 == 0 || t02 == 90 || t02 == 180 || t02 == 270) {
            return t02;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final int e(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            double d10 = i10;
            if ((1.0d / d10) + ((1.0d / (Math.pow(d10, 2.0d) - d10)) * 0.33333334f) <= f10) {
                return i10 - 1;
            }
            i10++;
        }
    }

    public static final int f(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            int i11 = i10 * 2;
            double d10 = 1.0d / i11;
            if (d10 + (0.33333334f * d10) <= f10) {
                return i10;
            }
            i10 = i11;
        }
    }
}
