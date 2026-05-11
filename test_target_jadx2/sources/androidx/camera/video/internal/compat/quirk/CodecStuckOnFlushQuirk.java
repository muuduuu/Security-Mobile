package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;

/* loaded from: classes.dex */
public class CodecStuckOnFlushQuirk implements K0 {
    private static boolean f() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    static boolean h() {
        return f();
    }

    public boolean g(String str) {
        return "video/mp4v-es".equals(str);
    }
}
