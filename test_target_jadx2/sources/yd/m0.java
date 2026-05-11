package yd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class m0 {
    public static final M a(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        t0 Z02 = abstractC5197E.Z0();
        M m10 = Z02 instanceof M ? (M) Z02 : null;
        if (m10 != null) {
            return m10;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC5197E).toString());
    }

    public static final AbstractC5197E b(AbstractC5197E abstractC5197E, List newArguments, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        return e(abstractC5197E, newArguments, newAnnotations, null, 4, null);
    }

    public static final AbstractC5197E c(AbstractC5197E abstractC5197E, List newArguments, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations, List newArgumentsForUpperBound) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        Intrinsics.checkNotNullParameter(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == abstractC5197E.U0()) && newAnnotations == abstractC5197E.i()) {
            return abstractC5197E;
        }
        a0 V02 = abstractC5197E.V0();
        if ((newAnnotations instanceof kotlin.reflect.jvm.internal.impl.descriptors.annotations.l) && newAnnotations.isEmpty()) {
            newAnnotations = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b();
        }
        a0 a10 = b0.a(V02, newAnnotations);
        t0 Z02 = abstractC5197E.Z0();
        if (Z02 instanceof AbstractC5222y) {
            AbstractC5222y abstractC5222y = (AbstractC5222y) Z02;
            return C5198F.d(d(abstractC5222y.e1(), newArguments, a10), d(abstractC5222y.f1(), newArgumentsForUpperBound, a10));
        }
        if (Z02 instanceof M) {
            return d((M) Z02, newArguments, a10);
        }
        throw new lc.m();
    }

    public static final M d(M m10, List newArguments, a0 newAttributes) {
        Intrinsics.checkNotNullParameter(m10, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return (newArguments.isEmpty() && newAttributes == m10.V0()) ? m10 : newArguments.isEmpty() ? m10.c1(newAttributes) : m10 instanceof kotlin.reflect.jvm.internal.impl.types.error.h ? ((kotlin.reflect.jvm.internal.impl.types.error.h) m10).i1(newArguments) : C5198F.j(newAttributes, m10.W0(), newArguments, m10.X0(), null, 16, null);
    }

    public static /* synthetic */ AbstractC5197E e(AbstractC5197E abstractC5197E, List list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = abstractC5197E.U0();
        }
        if ((i10 & 2) != 0) {
            gVar = abstractC5197E.i();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        }
        return c(abstractC5197E, list, gVar, list2);
    }

    public static /* synthetic */ M f(M m10, List list, a0 a0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = m10.U0();
        }
        if ((i10 & 2) != 0) {
            a0Var = m10.V0();
        }
        return d(m10, list, a0Var);
    }
}
