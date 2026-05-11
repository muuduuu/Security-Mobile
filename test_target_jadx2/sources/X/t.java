package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import o.InterfaceC3735a;
import t.V;
import x.t;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44613a;

    /* renamed from: b, reason: collision with root package name */
    private final List f44614b = Collections.synchronizedList(new ArrayList());

    static class a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        final h8.d f44615a = androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: x.s
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object c10;
                c10 = t.a.this.c(aVar);
                return c10;
            }
        });

        /* renamed from: b, reason: collision with root package name */
        c.a f44616b;

        a() {
        }

        private void b() {
            c.a aVar = this.f44616b;
            if (aVar != null) {
                aVar.c(null);
                this.f44616b = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object c(c.a aVar) {
            this.f44616b = aVar;
            return "RequestCompleteListener[" + this + "]";
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            b();
        }
    }

    public t(boolean z10) {
        this.f44613a = z10;
    }

    private CameraCaptureSession.CaptureCallback c() {
        final a aVar = new a();
        final h8.d dVar = aVar.f44615a;
        this.f44614b.add(dVar);
        Log.d("RequestMonitor", "RequestListener " + aVar + " monitoring " + this);
        dVar.e(new Runnable() { // from class: x.q
            @Override // java.lang.Runnable
            public final void run() {
                t.this.f(aVar, dVar);
            }
        }, F.c.b());
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(a aVar, h8.d dVar) {
        Log.d("RequestMonitor", "RequestListener " + aVar + " done " + this);
        this.f44614b.remove(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void g(List list) {
        return null;
    }

    public CameraCaptureSession.CaptureCallback d(CameraCaptureSession.CaptureCallback captureCallback) {
        return h() ? V.b(c(), captureCallback) : captureCallback;
    }

    public h8.d e() {
        return this.f44614b.isEmpty() ? G.n.p(null) : G.n.B(G.n.G(G.n.F(new ArrayList(this.f44614b)), new InterfaceC3735a() { // from class: x.r
            @Override // o.InterfaceC3735a
            public final Object apply(Object obj) {
                Void g10;
                g10 = t.g((List) obj);
                return g10;
            }
        }, F.c.b()));
    }

    public boolean h() {
        return this.f44613a;
    }

    public void i() {
        LinkedList linkedList = new LinkedList(this.f44614b);
        while (!linkedList.isEmpty()) {
            h8.d dVar = (h8.d) linkedList.poll();
            Objects.requireNonNull(dVar);
            dVar.cancel(true);
        }
    }
}
