package Uc;

import Kc.InterfaceC0929a;
import Kc.InterfaceC0933e;
import Kc.a0;
import Kc.j0;
import Mc.L;
import Wc.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public abstract class h {
    public static final List a(Collection newValueParameterTypes, Collection oldValueParameters, InterfaceC0929a newOwner) {
        Intrinsics.checkNotNullParameter(newValueParameterTypes, "newValueParameterTypes");
        Intrinsics.checkNotNullParameter(oldValueParameters, "oldValueParameters");
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        List V02 = CollectionsKt.V0(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(CollectionsKt.u(V02, 10));
        for (Iterator it = V02.iterator(); it.hasNext(); it = it) {
            Pair pair = (Pair) it.next();
            AbstractC5197E abstractC5197E = (AbstractC5197E) pair.getFirst();
            j0 j0Var = (j0) pair.getSecond();
            int index = j0Var.getIndex();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i10 = j0Var.i();
            id.f name = j0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            boolean B02 = j0Var.B0();
            boolean h02 = j0Var.h0();
            boolean d02 = j0Var.d0();
            AbstractC5197E k10 = j0Var.r0() != null ? AbstractC3778c.p(newOwner).v().k(abstractC5197E) : null;
            a0 j10 = j0Var.j();
            Intrinsics.checkNotNullExpressionValue(j10, "getSource(...)");
            arrayList.add(new L(newOwner, null, index, i10, name, abstractC5197E, B02, h02, d02, k10, j10));
        }
        return arrayList;
    }

    public static final l b(InterfaceC0933e interfaceC0933e) {
        Intrinsics.checkNotNullParameter(interfaceC0933e, "<this>");
        InterfaceC0933e u10 = AbstractC3778c.u(interfaceC0933e);
        if (u10 == null) {
            return null;
        }
        rd.h X10 = u10.X();
        l lVar = X10 instanceof l ? (l) X10 : null;
        return lVar == null ? b(u10) : lVar;
    }
}
