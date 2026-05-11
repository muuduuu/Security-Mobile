package u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import v.C4906q;

/* loaded from: classes.dex */
class K extends J {
    K(CameraDevice cameraDevice) {
        super((CameraDevice) y0.f.g(cameraDevice), null);
    }

    @Override // u.J, u.C4833D.a
    public void a(C4906q c4906q) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) c4906q.j();
        y0.f.g(sessionConfiguration);
        try {
            this.f43398a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw C4844h.e(e10);
        }
    }
}
