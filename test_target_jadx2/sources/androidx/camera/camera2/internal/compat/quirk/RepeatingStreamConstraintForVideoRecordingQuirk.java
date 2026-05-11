package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;

/* loaded from: classes.dex */
public class RepeatingStreamConstraintForVideoRecordingQuirk implements K0 {
    public static boolean f() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL);
    }

    static boolean g() {
        return f();
    }
}
