package Dd;

import Dd.g;
import Kc.InterfaceC0952y;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b {
    public final g a(InterfaceC0952y functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        for (h hVar : b()) {
            if (hVar.b(functionDescriptor)) {
                return hVar.a(functionDescriptor);
            }
        }
        return g.a.f1504b;
    }

    public abstract List b();
}
