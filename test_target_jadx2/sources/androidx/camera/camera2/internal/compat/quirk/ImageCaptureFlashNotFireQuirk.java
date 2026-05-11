package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import u.C4832C;

/* loaded from: classes.dex */
public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a, reason: collision with root package name */
    private static final List f14324a = Arrays.asList("itel w6004");

    /* renamed from: b, reason: collision with root package name */
    private static final List f14325b = Arrays.asList("sm-j700f", "sm-j710f");

    static boolean f(C4832C c4832c) {
        List list = f14325b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) c4832c.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f14324a.contains(str.toLowerCase(locale));
    }
}
