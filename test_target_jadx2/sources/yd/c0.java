package yd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c0 {
    public static final InterfaceC5211m a(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        Ad.i Z02 = abstractC5197E.Z0();
        InterfaceC5211m interfaceC5211m = Z02 instanceof InterfaceC5211m ? (InterfaceC5211m) Z02 : null;
        if (interfaceC5211m == null || !interfaceC5211m.I0()) {
            return null;
        }
        return interfaceC5211m;
    }

    public static final boolean b(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        Ad.i Z02 = abstractC5197E.Z0();
        InterfaceC5211m interfaceC5211m = Z02 instanceof InterfaceC5211m ? (InterfaceC5211m) Z02 : null;
        if (interfaceC5211m != null) {
            return interfaceC5211m.I0();
        }
        return false;
    }
}
