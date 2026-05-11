package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import u.C4832C;

/* loaded from: classes.dex */
public class JpegCaptureDownsizingQuirk implements SoftwareJpegEncodingPreferredQuirk {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f14332a = new HashSet(Arrays.asList("redmi note 8 pro"));

    static boolean f(C4832C c4832c) {
        return f14332a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) c4832c.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
