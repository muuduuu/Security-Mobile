package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class EncoderNotUsePersistentInputSurfaceQuirk implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List f14787a = Arrays.asList("SM-N9208", "SM-G920V");

    static boolean f() {
        return f14787a.contains(Build.MODEL.toUpperCase());
    }
}
