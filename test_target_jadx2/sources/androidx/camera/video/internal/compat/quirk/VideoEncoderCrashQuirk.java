package androidx.camera.video.internal.compat.quirk;

import V.AbstractC1258v;
import android.os.Build;
import androidx.camera.core.impl.G;

/* loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    private static boolean f() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    static boolean g() {
        return f();
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean e(G g10, AbstractC1258v abstractC1258v) {
        return f() && g10.i() == 0 && abstractC1258v == AbstractC1258v.f10726a;
    }
}
