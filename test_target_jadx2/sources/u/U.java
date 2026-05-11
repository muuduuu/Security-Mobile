package u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import u.C4833D;
import u.P;

/* loaded from: classes.dex */
class U implements P.b {

    /* renamed from: a, reason: collision with root package name */
    final CameraManager f43412a;

    /* renamed from: b, reason: collision with root package name */
    final Object f43413b;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Map f43414a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Handler f43415b;

        a(Handler handler) {
            this.f43415b = handler;
        }
    }

    U(Context context, Object obj) {
        this.f43412a = (CameraManager) context.getSystemService("camera");
        this.f43413b = obj;
    }

    static U h(Context context, Handler handler) {
        return new U(context, new a(handler));
    }

    @Override // u.P.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        P.a aVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        a aVar2 = (a) this.f43413b;
        if (availabilityCallback != null) {
            synchronized (aVar2.f43414a) {
                try {
                    aVar = (P.a) aVar2.f43414a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new P.a(executor, availabilityCallback);
                        aVar2.f43414a.put(availabilityCallback, aVar);
                    }
                } finally {
                }
            }
        } else {
            aVar = null;
        }
        this.f43412a.registerAvailabilityCallback(aVar, aVar2.f43415b);
    }

    @Override // u.P.b
    public void b(CameraManager.AvailabilityCallback availabilityCallback) {
        P.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.f43413b;
            synchronized (aVar2.f43414a) {
                aVar = (P.a) aVar2.f43414a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.g();
        }
        this.f43412a.unregisterAvailabilityCallback(aVar);
    }

    @Override // u.P.b
    public CameraCharacteristics c(String str) {
        try {
            return this.f43412a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw C4844h.e(e10);
        }
    }

    @Override // u.P.b
    public Set e() {
        return Collections.emptySet();
    }

    @Override // u.P.b
    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        y0.f.g(executor);
        y0.f.g(stateCallback);
        try {
            this.f43412a.openCamera(str, new C4833D.b(executor, stateCallback), ((a) this.f43413b).f43415b);
        } catch (CameraAccessException e10) {
            throw C4844h.e(e10);
        }
    }

    @Override // u.P.b
    public String[] g() {
        try {
            return this.f43412a.getCameraIdList();
        } catch (CameraAccessException e10) {
            throw C4844h.e(e10);
        }
    }
}
