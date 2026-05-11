package Hc;

import Kc.InterfaceC0933e;
import id.C3367b;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;

/* loaded from: classes3.dex */
public abstract class d {
    public static final boolean a(c cVar, InterfaceC0933e classDescriptor) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (kd.f.x(classDescriptor)) {
            Set b10 = cVar.b();
            C3367b k10 = AbstractC3778c.k(classDescriptor);
            if (CollectionsKt.V(b10, k10 != null ? k10.g() : null)) {
                return true;
            }
        }
        return false;
    }
}
