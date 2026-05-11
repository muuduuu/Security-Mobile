package u;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4841e {
    public static void a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
