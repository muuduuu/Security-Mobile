package t;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.AbstractC1450n;
import androidx.camera.core.impl.AbstractC1452o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
abstract class S0 {
    static CameraCaptureSession.CaptureCallback a(AbstractC1450n abstractC1450n) {
        if (abstractC1450n == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(abstractC1450n, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : V.a(arrayList);
    }

    static void b(AbstractC1450n abstractC1450n, List list) {
        if (abstractC1450n instanceof AbstractC1452o.a) {
            Iterator it = ((AbstractC1452o.a) abstractC1450n).e().iterator();
            while (it.hasNext()) {
                b((AbstractC1450n) it.next(), list);
            }
        } else if (abstractC1450n instanceof R0) {
            list.add(((R0) abstractC1450n).f());
        } else {
            list.add(new Q0(abstractC1450n));
        }
    }
}
