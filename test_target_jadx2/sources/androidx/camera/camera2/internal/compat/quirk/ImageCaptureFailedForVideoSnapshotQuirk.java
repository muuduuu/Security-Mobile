package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f14323a = new HashSet(Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "tecno mobile bf6"));

    private static boolean f() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "FIG-LX1".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if ("Spreadtrum".equalsIgnoreCase(r1) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean g() {
        String str;
        Set set = f14323a;
        String str2 = Build.MODEL;
        Locale locale = Locale.US;
        if (!set.contains(str2.toLowerCase(locale))) {
            if (Build.VERSION.SDK_INT >= 31) {
                str = Build.SOC_MANUFACTURER;
            }
            String str3 = Build.HARDWARE;
            if (!str3.toLowerCase(locale).startsWith("ums") && (!"itel".equalsIgnoreCase(Build.BRAND) || !str3.toLowerCase(locale).startsWith("sp"))) {
                return false;
            }
        }
        return true;
    }

    static boolean h() {
        return g() || f();
    }
}
