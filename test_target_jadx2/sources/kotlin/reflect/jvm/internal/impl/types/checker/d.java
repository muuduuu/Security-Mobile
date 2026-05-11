package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5194B;
import yd.AbstractC5218u;
import yd.AbstractC5222y;
import yd.C5198F;
import yd.G;
import yd.M;
import yd.t0;

/* loaded from: classes3.dex */
public abstract class d {
    public static final t0 a(List types) {
        M e12;
        Intrinsics.checkNotNullParameter(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (t0) CollectionsKt.A0(types);
        }
        List<t0> list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        boolean z10 = false;
        boolean z11 = false;
        for (t0 t0Var : list) {
            z10 = z10 || G.a(t0Var);
            if (t0Var instanceof M) {
                e12 = (M) t0Var;
            } else {
                if (!(t0Var instanceof AbstractC5222y)) {
                    throw new lc.m();
                }
                if (AbstractC5218u.a(t0Var)) {
                    return t0Var;
                }
                e12 = ((AbstractC5222y) t0Var).e1();
                z11 = true;
            }
            arrayList.add(e12);
        }
        if (z10) {
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.INTERSECTION_OF_ERROR_TYPES, types.toString());
        }
        if (!z11) {
            return u.f36703a.c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(AbstractC5194B.d((t0) it.next()));
        }
        u uVar = u.f36703a;
        return C5198F.d(uVar.c(arrayList), uVar.c(arrayList2));
    }
}
