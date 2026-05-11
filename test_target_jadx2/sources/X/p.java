package x;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.core.impl.V0;
import s.C4301a;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Rational f44608a = new Rational(16, 9);

    private static boolean a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    public static void b(Size size, V0.b bVar) {
        if (((PreviewPixelHDRnetQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(PreviewPixelHDRnetQuirk.class)) == null || a(size, f44608a)) {
            return;
        }
        C4301a.C0609a c0609a = new C4301a.C0609a();
        c0609a.f(CaptureRequest.TONEMAP_MODE, 2);
        bVar.g(c0609a.a());
    }
}
