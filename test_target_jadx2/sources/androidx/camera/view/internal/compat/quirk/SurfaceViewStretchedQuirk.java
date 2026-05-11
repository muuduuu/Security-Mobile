package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;

/* loaded from: classes.dex */
public class SurfaceViewStretchedQuirk implements K0 {
    private static boolean f() {
        return "LENOVO".equalsIgnoreCase(Build.MANUFACTURER) && "Q706F".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean g() {
        return "OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean h() {
        if ("SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.DEVICE;
            if ("F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    static boolean i() {
        return Build.VERSION.SDK_INT < 33 && (h() || g() || f());
    }
}
