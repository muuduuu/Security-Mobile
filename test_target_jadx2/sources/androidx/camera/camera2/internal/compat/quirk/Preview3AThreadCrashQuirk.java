package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;

/* loaded from: classes.dex */
public class Preview3AThreadCrashQuirk implements K0 {
    static boolean f() {
        return "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE);
    }
}
