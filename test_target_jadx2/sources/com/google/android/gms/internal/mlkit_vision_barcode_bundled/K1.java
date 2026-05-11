package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class K1 {
    K1() {
    }

    public static final int a(int i10, Object obj, Object obj2) {
        J1 j12 = (J1) obj;
        android.support.v4.media.session.b.a(obj2);
        if (j12.isEmpty()) {
            return 0;
        }
        Iterator it = j12.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object b(Object obj, Object obj2) {
        J1 j12 = (J1) obj;
        J1 j13 = (J1) obj2;
        if (!j13.isEmpty()) {
            if (!j12.i()) {
                j12 = j12.b();
            }
            j12.h(j13);
        }
        return j12;
    }
}
