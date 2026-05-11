package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class Nexus4AndroidLTargetAspectRatioQuirk implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List f14334a = Arrays.asList("NEXUS 4");

    static boolean g() {
        "GOOGLE".equalsIgnoreCase(Build.BRAND);
        return false;
    }

    public int f() {
        return 2;
    }
}
