package v;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import androidx.camera.core.impl.V;
import kotlin.jvm.internal.Intrinsics;
import s.C4301a;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4891b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4891b f43782a = new C4891b();

    private C4891b() {
    }

    public static final void a(C4301a.C0609a options, V.c priority) {
        CaptureRequest.Key key;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            key = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
            options.g(key, 1, priority);
        }
    }
}
