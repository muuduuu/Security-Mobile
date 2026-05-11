package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;

/* loaded from: classes.dex */
public class ExtensionDisabledQuirk implements K0 {
    private static boolean f() {
        return "motorola".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean g() {
        return "google".equalsIgnoreCase(Build.BRAND) && "redfin".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean h() {
        return "realme".equalsIgnoreCase(Build.BRAND);
    }

    static boolean i() {
        return g() || f() || h();
    }
}
