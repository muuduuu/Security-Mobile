package u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;
import u.C4845i;
import u.L;
import v.C4899j;
import v.C4906q;

/* loaded from: classes.dex */
class J extends I {
    J(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    static J e(CameraDevice cameraDevice, Handler handler) {
        return new J(cameraDevice, new L.a(handler));
    }

    @Override // u.C4833D.a
    public void a(C4906q c4906q) {
        L.c(this.f43398a, c4906q);
        C4845i.c cVar = new C4845i.c(c4906q.a(), c4906q.e());
        List c10 = c4906q.c();
        Handler handler = ((L.a) y0.f.g((L.a) this.f43399b)).f43400a;
        C4899j b10 = c4906q.b();
        try {
            if (b10 != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) b10.a();
                y0.f.g(inputConfiguration);
                this.f43398a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, C4906q.h(c10), cVar, handler);
            } else if (c4906q.d() == 1) {
                this.f43398a.createConstrainedHighSpeedCaptureSession(L.d(c10), cVar, handler);
            } else {
                this.f43398a.createCaptureSessionByOutputConfigurations(C4906q.h(c10), cVar, handler);
            }
        } catch (CameraAccessException e10) {
            throw C4844h.e(e10);
        }
    }
}
