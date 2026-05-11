package t;

import A.AbstractC0700h0;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.InterfaceC1469x;
import androidx.camera.core.impl.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z.j;

/* loaded from: classes.dex */
abstract class E0 {

    static class a {
        static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    private static void a(androidx.camera.core.impl.T t10, CaptureRequest.Builder builder) {
        if (t10.e().equals(androidx.camera.core.impl.Z0.f14526a)) {
            return;
        }
        builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, t10.e());
    }

    private static void b(CaptureRequest.Builder builder, androidx.camera.core.impl.V v10) {
        z.j d10 = j.a.e(v10).d();
        for (V.a aVar : d10.e()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, d10.a(aVar));
            } catch (IllegalArgumentException unused) {
                AbstractC0700h0.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    private static void c(CaptureRequest.Builder builder, int i10, x.z zVar) {
        for (Map.Entry entry : zVar.a(i10).entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    static void d(androidx.camera.core.impl.T t10, CaptureRequest.Builder builder) {
        if (t10.h() == 1 || t10.l() == 1) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (t10.h() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (t10.l() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
    }

    public static CaptureRequest e(androidx.camera.core.impl.T t10, CameraDevice cameraDevice, Map map, boolean z10, x.z zVar) {
        CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List g10 = g(t10.i(), map);
        if (g10.isEmpty()) {
            return null;
        }
        InterfaceC1469x d10 = t10.d();
        if (t10.k() == 5 && d10 != null && (d10.i() instanceof TotalCaptureResult)) {
            AbstractC0700h0.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            createCaptureRequest = a.a(cameraDevice, (TotalCaptureResult) d10.i());
        } else {
            AbstractC0700h0.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (t10.k() == 5) {
                createCaptureRequest = cameraDevice.createCaptureRequest(z10 ? 1 : 2);
            } else {
                createCaptureRequest = cameraDevice.createCaptureRequest(t10.k());
            }
        }
        c(createCaptureRequest, t10.k(), zVar);
        a(t10, createCaptureRequest);
        d(t10, createCaptureRequest);
        androidx.camera.core.impl.V g11 = t10.g();
        V.a aVar = androidx.camera.core.impl.T.f14453i;
        if (g11.b(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) t10.g().a(aVar));
        }
        androidx.camera.core.impl.V g12 = t10.g();
        V.a aVar2 = androidx.camera.core.impl.T.f14454j;
        if (g12.b(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) t10.g().a(aVar2)).byteValue()));
        }
        b(createCaptureRequest, t10.g());
        Iterator it = g10.iterator();
        while (it.hasNext()) {
            createCaptureRequest.addTarget((Surface) it.next());
        }
        createCaptureRequest.setTag(t10.j());
        return createCaptureRequest.build();
    }

    public static CaptureRequest f(androidx.camera.core.impl.T t10, CameraDevice cameraDevice, x.z zVar) {
        if (cameraDevice == null) {
            return null;
        }
        AbstractC0700h0.a("Camera2CaptureRequestBuilder", "template type = " + t10.k());
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(t10.k());
        c(createCaptureRequest, t10.k(), zVar);
        b(createCaptureRequest, t10.g());
        return createCaptureRequest.build();
    }

    private static List g(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((AbstractC1429c0) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }
}
