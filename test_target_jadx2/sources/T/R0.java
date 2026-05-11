package t;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.AbstractC1450n;

/* loaded from: classes.dex */
final class R0 extends AbstractC1450n {

    /* renamed from: a, reason: collision with root package name */
    private final CameraCaptureSession.CaptureCallback f41900a;

    private R0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f41900a = captureCallback;
    }

    static R0 e(CameraCaptureSession.CaptureCallback captureCallback) {
        return new R0(captureCallback);
    }

    CameraCaptureSession.CaptureCallback f() {
        return this.f41900a;
    }
}
