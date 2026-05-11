package yd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yd.C5213o;

/* loaded from: classes3.dex */
public abstract class Q {
    public static final C5199a a(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        t0 Z02 = abstractC5197E.Z0();
        if (Z02 instanceof C5199a) {
            return (C5199a) Z02;
        }
        return null;
    }

    public static final M b(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        C5199a a10 = a(abstractC5197E);
        if (a10 != null) {
            return a10.i1();
        }
        return null;
    }

    public static final boolean c(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return abstractC5197E.Z0() instanceof C5213o;
    }

    private static final C5196D d(C5196D c5196d) {
        AbstractC5197E abstractC5197E;
        Collection a10 = c5196d.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(a10, 10));
        Iterator it = a10.iterator();
        boolean z10 = false;
        while (true) {
            abstractC5197E = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC5197E abstractC5197E2 = (AbstractC5197E) it.next();
            if (q0.l(abstractC5197E2)) {
                abstractC5197E2 = f(abstractC5197E2.Z0(), false, 1, null);
                z10 = true;
            }
            arrayList.add(abstractC5197E2);
        }
        if (!z10) {
            return null;
        }
        AbstractC5197E i10 = c5196d.i();
        if (i10 != null) {
            if (q0.l(i10)) {
                i10 = f(i10.Z0(), false, 1, null);
            }
            abstractC5197E = i10;
        }
        return new C5196D(arrayList).m(abstractC5197E);
    }

    public static final t0 e(t0 t0Var, boolean z10) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        C5213o c10 = C5213o.a.c(C5213o.f45555d, t0Var, z10, false, 4, null);
        if (c10 != null) {
            return c10;
        }
        M g10 = g(t0Var);
        return g10 != null ? g10 : t0Var.a1(false);
    }

    public static /* synthetic */ t0 f(t0 t0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(t0Var, z10);
    }

    private static final M g(AbstractC5197E abstractC5197E) {
        C5196D d10;
        e0 W02 = abstractC5197E.W0();
        C5196D c5196d = W02 instanceof C5196D ? (C5196D) W02 : null;
        if (c5196d == null || (d10 = d(c5196d)) == null) {
            return null;
        }
        return d10.h();
    }

    public static final M h(M m10, boolean z10) {
        Intrinsics.checkNotNullParameter(m10, "<this>");
        C5213o c10 = C5213o.a.c(C5213o.f45555d, m10, z10, false, 4, null);
        if (c10 != null) {
            return c10;
        }
        M g10 = g(m10);
        return g10 == null ? m10.a1(false) : g10;
    }

    public static /* synthetic */ M i(M m10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(m10, z10);
    }

    public static final M j(M m10, M abbreviatedType) {
        Intrinsics.checkNotNullParameter(m10, "<this>");
        Intrinsics.checkNotNullParameter(abbreviatedType, "abbreviatedType");
        return G.a(m10) ? m10 : new C5199a(m10, abbreviatedType);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.checker.i k(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new kotlin.reflect.jvm.internal.impl.types.checker.i(iVar.f1(), iVar.W0(), iVar.h1(), iVar.V0(), iVar.X0(), true);
    }
}
