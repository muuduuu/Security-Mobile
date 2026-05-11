package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.K0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import u.C4832C;

/* loaded from: classes.dex */
public class ImageCaptureFailWithAutoFlashQuirk implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List f14322a = Arrays.asList("sm-j700f", "sm-j710f");

    static boolean f(C4832C c4832c) {
        return f14322a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c4832c.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
