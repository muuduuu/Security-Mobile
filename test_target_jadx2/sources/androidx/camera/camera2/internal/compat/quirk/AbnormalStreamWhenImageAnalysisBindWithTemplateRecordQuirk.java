package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    public static boolean f() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && Build.MODEL.toLowerCase(Locale.US).startsWith("sm-m556");
    }

    static boolean g() {
        return f();
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public boolean c() {
        return f();
    }
}
