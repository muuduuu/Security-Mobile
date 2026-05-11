package kd;

import Kc.AbstractC0947t;
import Kc.InterfaceC0930b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class s {
    public static final InterfaceC0930b a(Collection descriptors) {
        Integer d10;
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        descriptors.isEmpty();
        Iterator it = descriptors.iterator();
        InterfaceC0930b interfaceC0930b = null;
        while (it.hasNext()) {
            InterfaceC0930b interfaceC0930b2 = (InterfaceC0930b) it.next();
            if (interfaceC0930b == null || ((d10 = AbstractC0947t.d(interfaceC0930b.h(), interfaceC0930b2.h())) != null && d10.intValue() < 0)) {
                interfaceC0930b = interfaceC0930b2;
            }
        }
        Intrinsics.d(interfaceC0930b);
        return interfaceC0930b;
    }
}
