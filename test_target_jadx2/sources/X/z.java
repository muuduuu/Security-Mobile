package x;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.core.impl.P0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44623a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44624b;

    public z(P0 p02) {
        this.f44623a = CaptureIntentPreviewQuirk.d(p02);
        this.f44624b = p02.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    public Map a(int i10) {
        if (i10 == 3 && this.f44623a) {
            HashMap hashMap = new HashMap();
            hashMap.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            return Collections.unmodifiableMap(hashMap);
        }
        if (i10 != 4 || !this.f44624b) {
            return Collections.emptyMap();
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        return Collections.unmodifiableMap(hashMap2);
    }
}
