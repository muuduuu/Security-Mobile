package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class CameraUseInconsistentTimebaseQuirk implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f14784a = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));

    /* renamed from: b, reason: collision with root package name */
    private static final Set f14785b = new HashSet(Arrays.asList("sm4350", "sm6375", "sm7325"));

    /* renamed from: c, reason: collision with root package name */
    private static final Set f14786c = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));

    private static boolean f() {
        return f14786c.contains(Build.MODEL.toLowerCase());
    }

    private static boolean g() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && f14784a.contains(Build.HARDWARE.toLowerCase());
    }

    static boolean h() {
        return i() || g() || f();
    }

    private static boolean i() {
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            Set set = f14785b;
            str = Build.SOC_MODEL;
            if (set.contains(str.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
