package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class LowMemoryQuirk implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f14718a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    static boolean f() {
        return f14718a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
