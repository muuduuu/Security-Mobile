package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import u.C4845i;
import v.C4906q;

/* loaded from: classes.dex */
public interface K1 {

    public interface a {
        Executor b();

        C4906q f(int i10, List list, c cVar);

        h8.d l(CameraDevice cameraDevice, C4906q c4906q, List list);

        h8.d m(List list, long j10);

        boolean stop();
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f41789a;

        /* renamed from: b, reason: collision with root package name */
        private final ScheduledExecutorService f41790b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f41791c;

        /* renamed from: d, reason: collision with root package name */
        private final C4539e1 f41792d;

        /* renamed from: e, reason: collision with root package name */
        private final androidx.camera.core.impl.P0 f41793e;

        /* renamed from: f, reason: collision with root package name */
        private final androidx.camera.core.impl.P0 f41794f;

        b(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C4539e1 c4539e1, androidx.camera.core.impl.P0 p02, androidx.camera.core.impl.P0 p03) {
            this.f41789a = executor;
            this.f41790b = scheduledExecutorService;
            this.f41791c = handler;
            this.f41792d = c4539e1;
            this.f41793e = p02;
            this.f41794f = p03;
        }

        a a() {
            return new U1(this.f41793e, this.f41794f, this.f41792d, this.f41789a, this.f41790b, this.f41791c);
        }
    }

    void a();

    c c();

    void close();

    void d();

    void e();

    int g(List list, CameraCaptureSession.CaptureCallback captureCallback);

    C4845i h();

    void i(int i10);

    CameraDevice j();

    int k(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    h8.d n();

    public static abstract class c {
        public abstract void r(K1 k12);

        abstract void s(K1 k12);

        abstract void t(K1 k12);

        abstract void u(K1 k12);

        void o(K1 k12) {
        }

        void p(K1 k12) {
        }

        public void q(K1 k12) {
        }

        void v(K1 k12, Surface surface) {
        }
    }
}
