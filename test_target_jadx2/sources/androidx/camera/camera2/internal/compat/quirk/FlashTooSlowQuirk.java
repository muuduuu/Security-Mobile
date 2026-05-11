package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import u.C4832C;

/* loaded from: classes.dex */
public class FlashTooSlowQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a, reason: collision with root package name */
    private static final List f14321a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL", "PIXEL 4", "PIXEL 5", "SM-A320", "MOTO G(20)", "ITEL L6006", "RMX3231");

    private static boolean f() {
        Iterator it = f14321a.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    static boolean g(C4832C c4832c) {
        return f() && ((Integer) c4832c.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
