package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;

/* loaded from: classes.dex */
public class NegativeLatLongSavesIncorrectlyQuirk implements K0 {
    static boolean f() {
        return Build.VERSION.SDK_INT < 34;
    }
}
