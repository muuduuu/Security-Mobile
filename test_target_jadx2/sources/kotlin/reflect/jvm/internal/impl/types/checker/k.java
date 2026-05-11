package kotlin.reflect.jvm.internal.impl.types.checker;

import Kc.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import yd.AbstractC5197E;
import yd.C5198F;
import yd.M;
import yd.i0;
import yd.n0;
import yd.t0;
import yd.u0;

/* loaded from: classes3.dex */
public abstract class k {
    private static final List a(t0 t0Var, Ad.b bVar) {
        if (t0Var.U0().size() != t0Var.W0().c().size()) {
            return null;
        }
        List U02 = t0Var.U0();
        List list = U02;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((i0) it.next()).a() != u0.INVARIANT) {
                    List c10 = t0Var.W0().c();
                    Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
                    List<Pair> V02 = CollectionsKt.V0(list, c10);
                    ArrayList arrayList = new ArrayList(CollectionsKt.u(V02, 10));
                    for (Pair pair : V02) {
                        i0 i0Var = (i0) pair.getFirst();
                        f0 f0Var = (f0) pair.getSecond();
                        if (i0Var.a() != u0.INVARIANT) {
                            t0 Z02 = (i0Var.c() || i0Var.a() != u0.IN_VARIANCE) ? null : i0Var.getType().Z0();
                            Intrinsics.d(f0Var);
                            i0Var = Bd.a.a(new i(bVar, Z02, i0Var, f0Var));
                        }
                        arrayList.add(i0Var);
                    }
                    n0 c11 = yd.f0.f45524c.b(t0Var.W0(), arrayList).c();
                    int size = U02.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        i0 i0Var2 = (i0) U02.get(i10);
                        i0 i0Var3 = (i0) arrayList.get(i10);
                        if (i0Var2.a() != u0.INVARIANT) {
                            List upperBounds = ((f0) t0Var.W0().c().get(i10)).getUpperBounds();
                            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(f.a.f36673a.a(c11.n((AbstractC5197E) it2.next(), u0.INVARIANT).Z0()));
                            }
                            if (!i0Var2.c() && i0Var2.a() == u0.OUT_VARIANCE) {
                                arrayList2.add(f.a.f36673a.a(i0Var2.getType().Z0()));
                            }
                            AbstractC5197E type = i0Var3.getType();
                            Intrinsics.e(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((i) type).W0().j(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static final M b(M type, Ad.b status) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        List a10 = a(type, status);
        if (a10 != null) {
            return c(type, a10);
        }
        return null;
    }

    private static final M c(t0 t0Var, List list) {
        return C5198F.j(t0Var.V0(), t0Var.W0(), list, t0Var.X0(), null, 16, null);
    }
}
