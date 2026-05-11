package u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class S extends Q {
    S(Context context) {
        super(context);
    }

    @Override // u.Q, u.U, u.P.b
    public CameraCharacteristics c(String str) {
        try {
            return this.f43412a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw C4844h.e(e10);
        }
    }

    @Override // u.Q, u.U, u.P.b
    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f43412a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw C4844h.e(e10);
        }
    }
}
