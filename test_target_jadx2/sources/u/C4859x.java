package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: u.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4859x extends y {
    C4859x(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // u.y, u.C4845i.a
    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f43475a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @Override // u.y, u.C4845i.a
    public int c(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f43475a.captureBurstRequests(list, executor, captureCallback);
    }
}
