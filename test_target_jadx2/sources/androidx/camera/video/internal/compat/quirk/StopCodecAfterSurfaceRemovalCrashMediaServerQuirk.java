package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;

/* loaded from: classes.dex */
public class StopCodecAfterSurfaceRemovalCrashMediaServerQuirk implements K0 {
    private static boolean f() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    static boolean g() {
        return f();
    }
}
