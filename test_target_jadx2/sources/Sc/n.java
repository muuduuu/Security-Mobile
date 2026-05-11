package Sc;

import Kc.InterfaceC0929a;
import Kc.InterfaceC0933e;
import Kc.U;
import kd.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n implements kd.g {
    @Override // kd.g
    public g.a a() {
        return g.a.BOTH;
    }

    @Override // kd.g
    public g.b b(InterfaceC0929a superDescriptor, InterfaceC0929a subDescriptor, InterfaceC0933e interfaceC0933e) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof U) || !(superDescriptor instanceof U)) {
            return g.b.UNKNOWN;
        }
        U u10 = (U) subDescriptor;
        U u11 = (U) superDescriptor;
        return !Intrinsics.b(u10.getName(), u11.getName()) ? g.b.UNKNOWN : (Wc.c.a(u10) && Wc.c.a(u11)) ? g.b.OVERRIDABLE : (Wc.c.a(u10) || Wc.c.a(u11)) ? g.b.INCOMPATIBLE : g.b.UNKNOWN;
    }
}
