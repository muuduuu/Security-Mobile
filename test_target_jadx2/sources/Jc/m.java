package Jc;

import Kc.InterfaceC0933e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import yd.M;
import yd.f0;

/* loaded from: classes3.dex */
public abstract class m {
    public static final f0 a(InterfaceC0933e from, InterfaceC0933e to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        from.B().size();
        to.B().size();
        f0.a aVar = f0.f45524c;
        List B10 = from.B();
        Intrinsics.checkNotNullExpressionValue(B10, "getDeclaredTypeParameters(...)");
        List list = B10;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Kc.f0) it.next()).r());
        }
        List B11 = to.B();
        Intrinsics.checkNotNullExpressionValue(B11, "getDeclaredTypeParameters(...)");
        List list2 = B11;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            M y10 = ((Kc.f0) it2.next()).y();
            Intrinsics.checkNotNullExpressionValue(y10, "getDefaultType(...)");
            arrayList2.add(Bd.a.a(y10));
        }
        return f0.a.e(aVar, G.r(CollectionsKt.V0(arrayList, arrayList2)), false, 2, null);
    }
}
