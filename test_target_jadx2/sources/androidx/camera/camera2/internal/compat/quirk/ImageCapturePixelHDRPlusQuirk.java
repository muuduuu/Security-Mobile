package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class ImageCapturePixelHDRPlusQuirk implements K0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f14326a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    static boolean f() {
        return f14326a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26;
    }
}
