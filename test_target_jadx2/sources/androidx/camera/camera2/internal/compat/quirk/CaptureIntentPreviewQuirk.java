package androidx.camera.camera2.internal.compat.quirk;

import androidx.camera.core.impl.K0;
import androidx.camera.core.impl.P0;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface CaptureIntentPreviewQuirk extends K0 {
    static boolean d(P0 p02) {
        Iterator it = p02.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).c()) {
                return true;
            }
        }
        return false;
    }

    default boolean c() {
        return true;
    }
}
