package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.impl.K0;
import androidx.camera.core.impl.P0;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface SurfaceProcessingQuirk extends K0 {
    static boolean b(P0 p02) {
        Iterator it = p02.c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    default boolean a() {
        return true;
    }
}
