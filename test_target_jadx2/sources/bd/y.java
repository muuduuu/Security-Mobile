package bd;

import Hc.j;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.X;
import Kc.Z;
import Kc.j0;
import Sc.C1156f;
import Sc.H;
import bd.o;
import id.C3367b;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public abstract class y {
    private static final void a(StringBuilder sb2, AbstractC5197E abstractC5197E) {
        sb2.append(g(abstractC5197E));
    }

    public static final String b(InterfaceC0952y interfaceC0952y, boolean z10, boolean z11) {
        String c10;
        Intrinsics.checkNotNullParameter(interfaceC0952y, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (interfaceC0952y instanceof InterfaceC0940l) {
                c10 = "<init>";
            } else {
                c10 = interfaceC0952y.getName().c();
                Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
            }
            sb2.append(c10);
        }
        sb2.append("(");
        X s02 = interfaceC0952y.s0();
        if (s02 != null) {
            AbstractC5197E type = s02.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            a(sb2, type);
        }
        Iterator it = interfaceC0952y.m().iterator();
        while (it.hasNext()) {
            AbstractC5197E type2 = ((j0) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            a(sb2, type2);
        }
        sb2.append(")");
        if (z10) {
            if (g.c(interfaceC0952y)) {
                sb2.append("V");
            } else {
                AbstractC5197E g10 = interfaceC0952y.g();
                Intrinsics.d(g10);
                a(sb2, g10);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static /* synthetic */ String c(InterfaceC0952y interfaceC0952y, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return b(interfaceC0952y, z10, z11);
    }

    public static final String d(InterfaceC0929a interfaceC0929a) {
        Intrinsics.checkNotNullParameter(interfaceC0929a, "<this>");
        C1673A c1673a = C1673A.f18936a;
        if (kd.f.E(interfaceC0929a)) {
            return null;
        }
        InterfaceC0941m b10 = interfaceC0929a.b();
        InterfaceC0933e interfaceC0933e = b10 instanceof InterfaceC0933e ? (InterfaceC0933e) b10 : null;
        if (interfaceC0933e == null || interfaceC0933e.getName().p()) {
            return null;
        }
        InterfaceC0929a a10 = interfaceC0929a.a();
        Z z10 = a10 instanceof Z ? (Z) a10 : null;
        if (z10 == null) {
            return null;
        }
        return x.a(c1673a, interfaceC0933e, c(z10, false, false, 3, null));
    }

    public static final boolean e(InterfaceC0929a f10) {
        InterfaceC0952y k10;
        Intrinsics.checkNotNullParameter(f10, "f");
        if (!(f10 instanceof InterfaceC0952y)) {
            return false;
        }
        InterfaceC0952y interfaceC0952y = (InterfaceC0952y) f10;
        if (!Intrinsics.b(interfaceC0952y.getName().c(), "remove") || interfaceC0952y.m().size() != 1 || H.h((InterfaceC0930b) f10)) {
            return false;
        }
        List m10 = interfaceC0952y.a().m();
        Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
        AbstractC5197E type = ((j0) CollectionsKt.A0(m10)).getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        o g10 = g(type);
        o.d dVar = g10 instanceof o.d ? (o.d) g10 : null;
        if ((dVar != null ? dVar.i() : null) != pd.e.INT || (k10 = C1156f.k(interfaceC0952y)) == null) {
            return false;
        }
        List m11 = k10.a().m();
        Intrinsics.checkNotNullExpressionValue(m11, "getValueParameters(...)");
        AbstractC5197E type2 = ((j0) CollectionsKt.A0(m11)).getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        o g11 = g(type2);
        InterfaceC0941m b10 = k10.b();
        Intrinsics.checkNotNullExpressionValue(b10, "getContainingDeclaration(...)");
        return Intrinsics.b(AbstractC3778c.m(b10), j.a.f3938d0.j()) && (g11 instanceof o.c) && Intrinsics.b(((o.c) g11).i(), "java/lang/Object");
    }

    public static final String f(InterfaceC0933e interfaceC0933e) {
        Intrinsics.checkNotNullParameter(interfaceC0933e, "<this>");
        Jc.c cVar = Jc.c.f4890a;
        id.d j10 = AbstractC3778c.l(interfaceC0933e).j();
        Intrinsics.checkNotNullExpressionValue(j10, "toUnsafe(...)");
        C3367b n10 = cVar.n(j10);
        if (n10 == null) {
            return g.b(interfaceC0933e, null, 2, null);
        }
        String f10 = pd.d.b(n10).f();
        Intrinsics.checkNotNullExpressionValue(f10, "getInternalName(...)");
        return f10;
    }

    public static final o g(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return (o) g.e(abstractC5197E, q.f19039a, D.f18943o, C.f18938a, null, null, 32, null);
    }
}
