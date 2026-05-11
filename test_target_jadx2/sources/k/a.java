package K;

import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final CaptureFailedRetryQuirk f5074a = (CaptureFailedRetryQuirk) androidx.camera.core.internal.compat.quirk.a.b(CaptureFailedRetryQuirk.class);

    public int a() {
        CaptureFailedRetryQuirk captureFailedRetryQuirk = this.f5074a;
        if (captureFailedRetryQuirk == null) {
            return 0;
        }
        return captureFailedRetryQuirk.f();
    }
}
