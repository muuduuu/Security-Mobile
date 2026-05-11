package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;

/* loaded from: classes.dex */
public class GetAvailableKeysNeedsOnInit implements K0 {
    static boolean f() {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG");
    }
}
