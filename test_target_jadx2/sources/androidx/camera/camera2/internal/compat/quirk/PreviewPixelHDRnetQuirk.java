package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class PreviewPixelHDRnetQuirk implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List f14335a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    static boolean f() {
        return "Google".equals(Build.MANUFACTURER) && f14335a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
