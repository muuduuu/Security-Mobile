package f9;

import V6.AbstractC1287s;
import V6.C1279j;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import e7.BinderC3090b;
import e7.InterfaceC3089a;
import e9.C3102a;
import java.nio.ByteBuffer;
import org.conscrypt.BuildConfig;

/* renamed from: f9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3157d {

    /* renamed from: a, reason: collision with root package name */
    private static final C1279j f32886a = new C1279j("MLKitImageUtils", BuildConfig.FLAVOR);

    /* renamed from: b, reason: collision with root package name */
    private static final C3157d f32887b = new C3157d();

    private C3157d() {
    }

    public static C3157d b() {
        return f32887b;
    }

    public InterfaceC3089a a(C3102a c3102a) {
        int h10 = c3102a.h();
        if (h10 == -1) {
            return BinderC3090b.m1((Bitmap) AbstractC1287s.m(c3102a.e()));
        }
        if (h10 != 17) {
            if (h10 == 35) {
                return BinderC3090b.m1(c3102a.j());
            }
            if (h10 != 842094169) {
                throw new T8.a("Unsupported image format: " + c3102a.h(), 3);
            }
        }
        return BinderC3090b.m1((ByteBuffer) AbstractC1287s.m(c3102a.f()));
    }

    public int c(C3102a c3102a) {
        return c3102a.h();
    }

    public int d(C3102a c3102a) {
        if (c3102a.h() == -1) {
            return ((Bitmap) AbstractC1287s.m(c3102a.e())).getAllocationByteCount();
        }
        if (c3102a.h() == 17 || c3102a.h() == 842094169) {
            return ((ByteBuffer) AbstractC1287s.m(c3102a.f())).limit();
        }
        if (c3102a.h() != 35) {
            return 0;
        }
        return (((Image.Plane[]) AbstractC1287s.m(c3102a.k()))[0].getBuffer().limit() * 3) / 2;
    }

    public Matrix e(int i10, int i11, int i12) {
        if (i12 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
        matrix.postRotate(i12 * 90);
        int i13 = i12 % 2;
        int i14 = i13 != 0 ? i11 : i10;
        if (i13 == 0) {
            i10 = i11;
        }
        matrix.postTranslate(i14 / 2.0f, i10 / 2.0f);
        return matrix;
    }
}
