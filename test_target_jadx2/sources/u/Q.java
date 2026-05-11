package u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class Q extends U {
    Q(Context context) {
        super(context, null);
    }

    static Q i(Context context) {
        return new Q(context);
    }

    private boolean j(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && k(th);
    }

    private static boolean k(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    private void l(Throwable th) {
        throw new C4844h(10001, th);
    }

    @Override // u.U, u.P.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f43412a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // u.U, u.P.b
    public void b(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f43412a.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // u.U, u.P.b
    public CameraCharacteristics c(String str) {
        try {
            return super.c(str);
        } catch (RuntimeException e10) {
            if (j(e10)) {
                l(e10);
            }
            throw e10;
        }
    }

    @Override // u.U, u.P.b
    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f43412a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw C4844h.e(e10);
        } catch (IllegalArgumentException e11) {
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            if (j(e13)) {
                l(e13);
            }
            throw e13;
        }
    }
}
