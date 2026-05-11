package u;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4838b {
    public static void a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
