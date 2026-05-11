package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import u.C4845i;

/* renamed from: u.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4845i {

    /* renamed from: a, reason: collision with root package name */
    private final a f43426a;

    /* renamed from: u.i$a */
    interface a {
        CameraCaptureSession a();

        int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int c(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    /* renamed from: u.i$b */
    static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraCaptureSession.CaptureCallback f43427a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f43428b;

        b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f43428b = executor;
            this.f43427a = captureCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            AbstractC4839c.a(this.f43427a, cameraCaptureSession, captureRequest, surface, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f43427a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f43427a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f43427a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(CameraCaptureSession cameraCaptureSession, int i10) {
            this.f43427a.onCaptureSequenceAborted(cameraCaptureSession, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            this.f43427a.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            this.f43427a.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j10) {
            this.f43428b.execute(new Runnable() { // from class: u.o
                @Override // java.lang.Runnable
                public final void run() {
                    C4845i.b.this.h(cameraCaptureSession, captureRequest, surface, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f43428b.execute(new Runnable() { // from class: u.k
                @Override // java.lang.Runnable
                public final void run() {
                    C4845i.b.this.i(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f43428b.execute(new Runnable() { // from class: u.n
                @Override // java.lang.Runnable
                public final void run() {
                    C4845i.b.this.j(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f43428b.execute(new Runnable() { // from class: u.l
                @Override // java.lang.Runnable
                public final void run() {
                    C4845i.b.this.k(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i10) {
            this.f43428b.execute(new Runnable() { // from class: u.p
                @Override // java.lang.Runnable
                public final void run() {
                    C4845i.b.this.l(cameraCaptureSession, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i10, final long j10) {
            this.f43428b.execute(new Runnable() { // from class: u.m
                @Override // java.lang.Runnable
                public final void run() {
                    C4845i.b.this.m(cameraCaptureSession, i10, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j10, final long j11) {
            this.f43428b.execute(new Runnable() { // from class: u.j
                @Override // java.lang.Runnable
                public final void run() {
                    C4845i.b.this.n(cameraCaptureSession, captureRequest, j10, j11);
                }
            });
        }
    }

    /* renamed from: u.i$c */
    static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraCaptureSession.StateCallback f43429a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f43430b;

        c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f43430b = executor;
            this.f43429a = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(CameraCaptureSession cameraCaptureSession) {
            this.f43429a.onActive(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(CameraCaptureSession cameraCaptureSession) {
            AbstractC4841e.a(this.f43429a, cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(CameraCaptureSession cameraCaptureSession) {
            this.f43429a.onClosed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(CameraCaptureSession cameraCaptureSession) {
            this.f43429a.onConfigureFailed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(CameraCaptureSession cameraCaptureSession) {
            this.f43429a.onConfigured(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(CameraCaptureSession cameraCaptureSession) {
            this.f43429a.onReady(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            AbstractC4838b.a(this.f43429a, cameraCaptureSession, surface);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f43430b.execute(new Runnable() { // from class: u.q
                @Override // java.lang.Runnable
                public final void run() {
                    C4845i.c.this.h(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f43430b.execute(new Runnable() { // from class: u.t
                @Override // java.lang.Runnable
                public final void run() {
                    C4845i.c.this.i(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f43430b.execute(new Runnable() { // from class: u.r
                @Override // java.lang.Runnable
                public final void run() {
                    C4845i.c.this.j(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f43430b.execute(new Runnable() { // from class: u.w
                @Override // java.lang.Runnable
                public final void run() {
                    C4845i.c.this.k(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f43430b.execute(new Runnable() { // from class: u.u
                @Override // java.lang.Runnable
                public final void run() {
                    C4845i.c.this.l(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f43430b.execute(new Runnable() { // from class: u.v
                @Override // java.lang.Runnable
                public final void run() {
                    C4845i.c.this.m(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f43430b.execute(new Runnable() { // from class: u.s
                @Override // java.lang.Runnable
                public final void run() {
                    C4845i.c.this.n(cameraCaptureSession, surface);
                }
            });
        }
    }

    private C4845i(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f43426a = new C4859x(cameraCaptureSession);
        } else {
            this.f43426a = y.d(cameraCaptureSession, handler);
        }
    }

    public static C4845i d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C4845i(cameraCaptureSession, handler);
    }

    public int a(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f43426a.c(list, executor, captureCallback);
    }

    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f43426a.b(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession c() {
        return this.f43426a.a();
    }
}
