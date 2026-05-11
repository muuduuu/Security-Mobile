package t;

import A.C0696f0;
import A.C0716t;
import A.InterfaceC0713p;
import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import u.C4844h;

/* loaded from: classes.dex */
abstract class N0 {
    private static String a(u.P p10, Integer num, List list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) p10.c("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) p10.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    static List b(C4590w c4590w, A.r rVar) {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(c4590w.c().d());
            if (rVar == null) {
                Iterator it = asList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return arrayList;
            }
            try {
                str = a(c4590w.c(), rVar.d(), asList);
            } catch (IllegalStateException unused) {
                str = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : asList) {
                if (!str2.equals(str)) {
                    arrayList2.add(c4590w.f(str2));
                }
            }
            Iterator it2 = rVar.b(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList.add(((androidx.camera.core.impl.G) ((InterfaceC0713p) it2.next())).f());
            }
            return arrayList;
        } catch (C0716t e10) {
            throw new C0696f0(e10);
        } catch (C4844h e11) {
            throw new C0696f0(P0.a(e11));
        }
    }
}
