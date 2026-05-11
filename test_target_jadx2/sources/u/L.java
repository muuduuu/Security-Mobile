package u;

import A.AbstractC0700h0;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u.C4833D;
import v.C4900k;
import v.C4906q;

/* loaded from: classes.dex */
abstract class L implements C4833D.a {

    /* renamed from: a, reason: collision with root package name */
    final CameraDevice f43398a;

    /* renamed from: b, reason: collision with root package name */
    final Object f43399b;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Handler f43400a;

        a(Handler handler) {
            this.f43400a = handler;
        }
    }

    L(CameraDevice cameraDevice, Object obj) {
        this.f43398a = (CameraDevice) y0.f.g(cameraDevice);
        this.f43399b = obj;
    }

    private static void b(CameraDevice cameraDevice, List list) {
        String id2 = cameraDevice.getId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String c10 = ((C4900k) it.next()).c();
            if (c10 != null && !c10.isEmpty()) {
                AbstractC0700h0.l("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + c10 + ". Ignoring.");
            }
        }
    }

    static void c(CameraDevice cameraDevice, C4906q c4906q) {
        y0.f.g(cameraDevice);
        y0.f.g(c4906q);
        y0.f.g(c4906q.e());
        List c10 = c4906q.c();
        if (c10 == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (c4906q.a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        b(cameraDevice, c10);
    }

    static List d(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C4900k) it.next()).d());
        }
        return arrayList;
    }
}
