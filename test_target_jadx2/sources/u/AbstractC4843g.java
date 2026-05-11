package u;

import android.hardware.camera2.CameraManager;

/* renamed from: u.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4843g {
    public static void a(CameraManager.AvailabilityCallback availabilityCallback) {
        availabilityCallback.onCameraAccessPrioritiesChanged();
    }
}
