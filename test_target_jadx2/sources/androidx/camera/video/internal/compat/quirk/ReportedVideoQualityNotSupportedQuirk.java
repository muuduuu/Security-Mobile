package androidx.camera.video.internal.compat.quirk;

import V.AbstractC1258v;
import android.os.Build;
import androidx.camera.core.impl.G;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk, SurfaceProcessingQuirk {
    private static boolean f() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean g() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean h() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    private static boolean i() {
        return "OPPO".equalsIgnoreCase(Build.BRAND) && "PHT110".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean j() {
        return "Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL);
    }

    static boolean k() {
        return f() || g() || j() || h() || i();
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public boolean a() {
        return f() || g() || h() || i();
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean e(G g10, AbstractC1258v abstractC1258v) {
        if (f() || g()) {
            return abstractC1258v == AbstractC1258v.f10729d;
        }
        if (j()) {
            return abstractC1258v == AbstractC1258v.f10727b || abstractC1258v == AbstractC1258v.f10728c;
        }
        if (h()) {
            return g10.i() == 0 && (abstractC1258v == AbstractC1258v.f10728c || abstractC1258v == AbstractC1258v.f10727b);
        }
        if (i()) {
            return g10.i() == 1 && abstractC1258v == AbstractC1258v.f10729d;
        }
        return false;
    }
}
