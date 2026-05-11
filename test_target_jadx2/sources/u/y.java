package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import u.C4845i;

/* loaded from: classes.dex */
class y implements C4845i.a {

    /* renamed from: a, reason: collision with root package name */
    final CameraCaptureSession f43475a;

    /* renamed from: b, reason: collision with root package name */
    final Object f43476b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Handler f43477a;

        a(Handler handler) {
            this.f43477a = handler;
        }
    }

    y(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f43475a = (CameraCaptureSession) y0.f.g(cameraCaptureSession);
        this.f43476b = obj;
    }

    static C4845i.a d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new y(cameraCaptureSession, new a(handler));
    }

    @Override // u.C4845i.a
    public CameraCaptureSession a() {
        return this.f43475a;
    }

    @Override // u.C4845i.a
    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f43475a.setRepeatingRequest(captureRequest, new C4845i.b(executor, captureCallback), ((a) this.f43476b).f43477a);
    }

    @Override // u.C4845i.a
    public int c(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f43475a.captureBurst(list, new C4845i.b(executor, captureCallback), ((a) this.f43476b).f43477a);
    }
}
