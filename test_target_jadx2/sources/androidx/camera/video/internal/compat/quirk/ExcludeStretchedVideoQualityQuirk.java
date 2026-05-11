package androidx.camera.video.internal.compat.quirk;

import V.AbstractC1258v;
import android.os.Build;
import androidx.camera.core.impl.G;

/* loaded from: classes.dex */
public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    private static boolean f() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J260F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean g() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J400G".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean h() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J530F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean i() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "sm-j600g".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean j() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    private static boolean k() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J701F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean l() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    static boolean m() {
        return f() || g() || h() || i() || k() || l() || j();
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean e(G g10, AbstractC1258v abstractC1258v) {
        return g() ? abstractC1258v == AbstractC1258v.f10728c || abstractC1258v == AbstractC1258v.f10729d : (f() || h() || i() || k() || l() || j()) && abstractC1258v == AbstractC1258v.f10728c;
    }
}
