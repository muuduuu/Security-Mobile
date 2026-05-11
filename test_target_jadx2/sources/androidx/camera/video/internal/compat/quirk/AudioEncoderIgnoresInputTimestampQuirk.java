package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;

/* loaded from: classes.dex */
public class AudioEncoderIgnoresInputTimestampQuirk implements K0 {
    private static boolean f() {
        return "Sony".equalsIgnoreCase(Build.BRAND) && "G3125".equalsIgnoreCase(Build.MODEL);
    }

    static boolean g() {
        return f();
    }
}
