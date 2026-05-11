package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.AbstractC1450n;
import androidx.camera.core.impl.C1454p;

/* loaded from: classes.dex */
final class Q0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1450n f41883a;

    Q0(AbstractC1450n abstractC1450n) {
        if (abstractC1450n == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f41883a = abstractC1450n;
    }

    private int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof androidx.camera.core.impl.d1) && (num = (Integer) ((androidx.camera.core.impl.d1) captureRequest.getTag()).d("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        androidx.camera.core.impl.d1 b10;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            y0.f.b(tag instanceof androidx.camera.core.impl.d1, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            b10 = (androidx.camera.core.impl.d1) tag;
        } else {
            b10 = androidx.camera.core.impl.d1.b();
        }
        this.f41883a.b(a(captureRequest), new C4543g(b10, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f41883a.c(a(captureRequest), new C1454p(C1454p.a.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        this.f41883a.d(a(captureRequest));
    }
}
