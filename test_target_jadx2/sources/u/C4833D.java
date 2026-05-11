package u;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import u.C4833D;
import v.C4906q;

/* renamed from: u.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4833D {

    /* renamed from: a, reason: collision with root package name */
    private final a f43386a;

    /* renamed from: u.D$a */
    interface a {
        void a(C4906q c4906q);
    }

    /* renamed from: u.D$b */
    static final class b extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraDevice.StateCallback f43387a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f43388b;

        b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f43388b = executor;
            this.f43387a = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(CameraDevice cameraDevice) {
            this.f43387a.onClosed(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(CameraDevice cameraDevice) {
            this.f43387a.onDisconnected(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(CameraDevice cameraDevice, int i10) {
            this.f43387a.onError(cameraDevice, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(CameraDevice cameraDevice) {
            this.f43387a.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f43388b.execute(new Runnable() { // from class: u.E
                @Override // java.lang.Runnable
                public final void run() {
                    C4833D.b.this.e(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f43388b.execute(new Runnable() { // from class: u.G
                @Override // java.lang.Runnable
                public final void run() {
                    C4833D.b.this.f(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i10) {
            this.f43388b.execute(new Runnable() { // from class: u.F
                @Override // java.lang.Runnable
                public final void run() {
                    C4833D.b.this.g(cameraDevice, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f43388b.execute(new Runnable() { // from class: u.H
                @Override // java.lang.Runnable
                public final void run() {
                    C4833D.b.this.h(cameraDevice);
                }
            });
        }
    }

    private C4833D(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f43386a = new K(cameraDevice);
        } else {
            this.f43386a = J.e(cameraDevice, handler);
        }
    }

    public static C4833D b(CameraDevice cameraDevice, Handler handler) {
        return new C4833D(cameraDevice, handler);
    }

    public void a(C4906q c4906q) {
        this.f43386a.a(c4906q);
    }
}
