package s;

import A.C;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.V;
import z.j;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4301a extends j {

    /* renamed from: J, reason: collision with root package name */
    public static final V.a f40674J = V.a.a("camera2.captureRequest.templateType", Integer.TYPE);

    /* renamed from: K, reason: collision with root package name */
    public static final V.a f40675K = V.a.a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);

    /* renamed from: L, reason: collision with root package name */
    public static final V.a f40676L = V.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* renamed from: M, reason: collision with root package name */
    public static final V.a f40677M = V.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* renamed from: N, reason: collision with root package name */
    public static final V.a f40678N = V.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* renamed from: O, reason: collision with root package name */
    public static final V.a f40679O = V.a.a("camera2.captureRequest.tag", Object.class);

    /* renamed from: P, reason: collision with root package name */
    public static final V.a f40680P = V.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: s.a$a, reason: collision with other inner class name */
    public static final class C0609a implements C {

        /* renamed from: a, reason: collision with root package name */
        private final B0 f40681a = B0.d0();

        public C4301a a() {
            return new C4301a(G0.b0(this.f40681a));
        }

        @Override // A.C
        public A0 b() {
            return this.f40681a;
        }

        public C0609a d(V v10) {
            e(v10, V.c.OPTIONAL);
            return this;
        }

        public C0609a e(V v10, V.c cVar) {
            for (V.a aVar : v10.e()) {
                this.f40681a.r(aVar, cVar, v10.a(aVar));
            }
            return this;
        }

        public C0609a f(CaptureRequest.Key key, Object obj) {
            this.f40681a.x(C4301a.Z(key), obj);
            return this;
        }

        public C0609a g(CaptureRequest.Key key, Object obj, V.c cVar) {
            this.f40681a.r(C4301a.Z(key), cVar, obj);
            return this;
        }
    }

    public C4301a(V v10) {
        super(v10);
    }

    public static V.a Z(CaptureRequest.Key key) {
        return V.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public j a0() {
        return j.a.e(n()).d();
    }

    public int b0(int i10) {
        return ((Integer) n().f(f40674J, Integer.valueOf(i10))).intValue();
    }

    public CameraDevice.StateCallback c0(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) n().f(f40676L, stateCallback);
    }

    public String d0(String str) {
        return (String) n().f(f40680P, str);
    }

    public CameraCaptureSession.CaptureCallback e0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) n().f(f40678N, captureCallback);
    }

    public CameraCaptureSession.StateCallback f0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) n().f(f40677M, stateCallback);
    }

    public long g0(long j10) {
        return ((Long) n().f(f40675K, Long.valueOf(j10))).longValue();
    }
}
