package fd;

import dd.C3026c;
import dd.C3032i;
import dd.C3037n;
import dd.C3040q;
import dd.C3041r;
import dd.C3042s;
import dd.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f {
    public static final C3040q a(C3040q c3040q, g typeTable) {
        Intrinsics.checkNotNullParameter(c3040q, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (c3040q.g0()) {
            return c3040q.O();
        }
        if (c3040q.h0()) {
            return typeTable.a(c3040q.P());
        }
        return null;
    }

    public static final List b(C3026c c3026c, g typeTable) {
        Intrinsics.checkNotNullParameter(c3026c, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List u02 = c3026c.u0();
        if (u02.isEmpty()) {
            u02 = null;
        }
        if (u02 == null) {
            List t02 = c3026c.t0();
            Intrinsics.checkNotNullExpressionValue(t02, "getContextReceiverTypeIdList(...)");
            List<Integer> list = t02;
            u02 = new ArrayList(CollectionsKt.u(list, 10));
            for (Integer num : list) {
                Intrinsics.d(num);
                u02.add(typeTable.a(num.intValue()));
            }
        }
        return u02;
    }

    public static final List c(C3032i c3032i, g typeTable) {
        Intrinsics.checkNotNullParameter(c3032i, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List V10 = c3032i.V();
        if (V10.isEmpty()) {
            V10 = null;
        }
        if (V10 == null) {
            List U10 = c3032i.U();
            Intrinsics.checkNotNullExpressionValue(U10, "getContextReceiverTypeIdList(...)");
            List<Integer> list = U10;
            V10 = new ArrayList(CollectionsKt.u(list, 10));
            for (Integer num : list) {
                Intrinsics.d(num);
                V10.add(typeTable.a(num.intValue()));
            }
        }
        return V10;
    }

    public static final List d(C3037n c3037n, g typeTable) {
        Intrinsics.checkNotNullParameter(c3037n, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List U10 = c3037n.U();
        if (U10.isEmpty()) {
            U10 = null;
        }
        if (U10 == null) {
            List T10 = c3037n.T();
            Intrinsics.checkNotNullExpressionValue(T10, "getContextReceiverTypeIdList(...)");
            List<Integer> list = T10;
            U10 = new ArrayList(CollectionsKt.u(list, 10));
            for (Integer num : list) {
                Intrinsics.d(num);
                U10.add(typeTable.a(num.intValue()));
            }
        }
        return U10;
    }

    public static final C3040q e(C3041r c3041r, g typeTable) {
        Intrinsics.checkNotNullParameter(c3041r, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (c3041r.a0()) {
            C3040q Q10 = c3041r.Q();
            Intrinsics.checkNotNullExpressionValue(Q10, "getExpandedType(...)");
            return Q10;
        }
        if (c3041r.b0()) {
            return typeTable.a(c3041r.R());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final C3040q f(C3040q c3040q, g typeTable) {
        Intrinsics.checkNotNullParameter(c3040q, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (c3040q.l0()) {
            return c3040q.Y();
        }
        if (c3040q.m0()) {
            return typeTable.a(c3040q.Z());
        }
        return null;
    }

    public static final boolean g(C3032i c3032i) {
        Intrinsics.checkNotNullParameter(c3032i, "<this>");
        return c3032i.s0() || c3032i.t0();
    }

    public static final boolean h(C3037n c3037n) {
        Intrinsics.checkNotNullParameter(c3037n, "<this>");
        return c3037n.p0() || c3037n.q0();
    }

    public static final C3040q i(C3026c c3026c, g typeTable) {
        Intrinsics.checkNotNullParameter(c3026c, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (c3026c.m1()) {
            return c3026c.H0();
        }
        if (c3026c.n1()) {
            return typeTable.a(c3026c.I0());
        }
        return null;
    }

    public static final C3040q j(C3040q c3040q, g typeTable) {
        Intrinsics.checkNotNullParameter(c3040q, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (c3040q.o0()) {
            return c3040q.b0();
        }
        if (c3040q.p0()) {
            return typeTable.a(c3040q.c0());
        }
        return null;
    }

    public static final C3040q k(C3032i c3032i, g typeTable) {
        Intrinsics.checkNotNullParameter(c3032i, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (c3032i.s0()) {
            return c3032i.c0();
        }
        if (c3032i.t0()) {
            return typeTable.a(c3032i.d0());
        }
        return null;
    }

    public static final C3040q l(C3037n c3037n, g typeTable) {
        Intrinsics.checkNotNullParameter(c3037n, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (c3037n.p0()) {
            return c3037n.b0();
        }
        if (c3037n.q0()) {
            return typeTable.a(c3037n.c0());
        }
        return null;
    }

    public static final C3040q m(C3032i c3032i, g typeTable) {
        Intrinsics.checkNotNullParameter(c3032i, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (c3032i.u0()) {
            C3040q e02 = c3032i.e0();
            Intrinsics.checkNotNullExpressionValue(e02, "getReturnType(...)");
            return e02;
        }
        if (c3032i.v0()) {
            return typeTable.a(c3032i.f0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final C3040q n(C3037n c3037n, g typeTable) {
        Intrinsics.checkNotNullParameter(c3037n, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (c3037n.r0()) {
            C3040q d02 = c3037n.d0();
            Intrinsics.checkNotNullExpressionValue(d02, "getReturnType(...)");
            return d02;
        }
        if (c3037n.s0()) {
            return typeTable.a(c3037n.e0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final List o(C3026c c3026c, g typeTable) {
        Intrinsics.checkNotNullParameter(c3026c, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List Y02 = c3026c.Y0();
        if (Y02.isEmpty()) {
            Y02 = null;
        }
        if (Y02 == null) {
            List X02 = c3026c.X0();
            Intrinsics.checkNotNullExpressionValue(X02, "getSupertypeIdList(...)");
            List<Integer> list = X02;
            Y02 = new ArrayList(CollectionsKt.u(list, 10));
            for (Integer num : list) {
                Intrinsics.d(num);
                Y02.add(typeTable.a(num.intValue()));
            }
        }
        return Y02;
    }

    public static final C3040q p(C3040q.b bVar, g typeTable) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (bVar.y()) {
            return bVar.v();
        }
        if (bVar.z()) {
            return typeTable.a(bVar.w());
        }
        return null;
    }

    public static final C3040q q(u uVar, g typeTable) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (uVar.P()) {
            C3040q J10 = uVar.J();
            Intrinsics.checkNotNullExpressionValue(J10, "getType(...)");
            return J10;
        }
        if (uVar.Q()) {
            return typeTable.a(uVar.K());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final C3040q r(C3041r c3041r, g typeTable) {
        Intrinsics.checkNotNullParameter(c3041r, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (c3041r.e0()) {
            C3040q X10 = c3041r.X();
            Intrinsics.checkNotNullExpressionValue(X10, "getUnderlyingType(...)");
            return X10;
        }
        if (c3041r.f0()) {
            return typeTable.a(c3041r.Y());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final List s(C3042s c3042s, g typeTable) {
        Intrinsics.checkNotNullParameter(c3042s, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List P10 = c3042s.P();
        if (P10.isEmpty()) {
            P10 = null;
        }
        if (P10 == null) {
            List O10 = c3042s.O();
            Intrinsics.checkNotNullExpressionValue(O10, "getUpperBoundIdList(...)");
            List<Integer> list = O10;
            P10 = new ArrayList(CollectionsKt.u(list, 10));
            for (Integer num : list) {
                Intrinsics.d(num);
                P10.add(typeTable.a(num.intValue()));
            }
        }
        return P10;
    }

    public static final C3040q t(u uVar, g typeTable) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (uVar.R()) {
            return uVar.L();
        }
        if (uVar.S()) {
            return typeTable.a(uVar.M());
        }
        return null;
    }
}
