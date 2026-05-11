package o4;

import android.graphics.Matrix;
import g4.i;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3752e {

    /* renamed from: a, reason: collision with root package name */
    public static final C3752e f37923a = new C3752e();

    /* renamed from: b, reason: collision with root package name */
    public static final b3.f f37924b;

    static {
        b3.f h10 = b3.f.h(2, 7, 4, 5);
        Intrinsics.checkNotNullExpressionValue(h10, "of(\n          ExifInterf…ce.ORIENTATION_TRANSPOSE)");
        f37924b = h10;
    }

    private C3752e() {
    }

    public static final int a(int i10) {
        return Math.max(1, 8 / i10);
    }

    public static final float b(a4.f fVar, int i10, int i11) {
        if (fVar == null) {
            return 1.0f;
        }
        float f10 = i10;
        float f11 = i11;
        float max = Math.max(fVar.f12599a / f10, fVar.f12600b / f11);
        float f12 = f10 * max;
        float f13 = fVar.f12601c;
        if (f12 > f13) {
            max = f13 / f10;
        }
        return f11 * max > f13 ? f13 / f11 : max;
    }

    private final int c(i iVar) {
        int t02 = iVar.t0();
        if (t02 == 90 || t02 == 180 || t02 == 270) {
            return iVar.t0();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int d(a4.g rotationOptions, i encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int c22 = encodedImage.c2();
        b3.f fVar = f37924b;
        int indexOf = fVar.indexOf(Integer.valueOf(c22));
        if (indexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        E e10 = fVar.get((indexOf + ((!rotationOptions.h() ? rotationOptions.f() : 0) / 90)) % fVar.size());
        Intrinsics.checkNotNullExpressionValue(e10, "INVERTED_EXIF_ORIENTATIO…D_EXIF_ORIENTATIONS.size]");
        return ((Number) e10).intValue();
    }

    public static final int e(a4.g rotationOptions, i encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!rotationOptions.g()) {
            return 0;
        }
        int c10 = f37923a.c(encodedImage);
        return rotationOptions.h() ? c10 : (c10 + rotationOptions.f()) % 360;
    }

    public static final int f(a4.g rotationOptions, a4.f fVar, i encodedImage, boolean z10) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!z10 || fVar == null) {
            return 8;
        }
        int e10 = e(rotationOptions, encodedImage);
        int d10 = f37924b.contains(Integer.valueOf(encodedImage.c2())) ? d(rotationOptions, encodedImage) : 0;
        boolean z11 = e10 == 90 || e10 == 270 || d10 == 5 || d10 == 7;
        int k10 = k(b(fVar, z11 ? encodedImage.getHeight() : encodedImage.getWidth(), z11 ? encodedImage.getWidth() : encodedImage.getHeight()), fVar.f12602d);
        if (k10 > 8) {
            return 8;
        }
        if (k10 < 1) {
            return 1;
        }
        return k10;
    }

    public static final Matrix g(i encodedImage, a4.g rotationOptions) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        if (f37924b.contains(Integer.valueOf(encodedImage.c2()))) {
            return f37923a.h(d(rotationOptions, encodedImage));
        }
        int e10 = e(rotationOptions, encodedImage);
        if (e10 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(e10);
        return matrix;
    }

    private final Matrix h(int i10) {
        Matrix matrix = new Matrix();
        if (i10 == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i10 == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i10 == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else {
            if (i10 != 5) {
                return null;
            }
            matrix.setRotate(90.0f);
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    public static final boolean i(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static final boolean j(int i10) {
        return i10 >= 0 && i10 <= 270 && i10 % 90 == 0;
    }

    public static final int k(float f10, float f11) {
        return (int) (f11 + (f10 * 8));
    }
}
