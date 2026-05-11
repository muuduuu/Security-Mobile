package Sc;

import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.j0;
import Sc.I;
import bd.o;
import java.util.List;
import kd.g;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public final class t implements kd.g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9056a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(InterfaceC0952y interfaceC0952y) {
            if (interfaceC0952y.m().size() != 1) {
                return false;
            }
            InterfaceC0941m b10 = interfaceC0952y.b();
            InterfaceC0933e interfaceC0933e = b10 instanceof InterfaceC0933e ? (InterfaceC0933e) b10 : null;
            if (interfaceC0933e == null) {
                return false;
            }
            List m10 = interfaceC0952y.m();
            Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
            InterfaceC0936h d10 = ((j0) CollectionsKt.A0(m10)).getType().W0().d();
            InterfaceC0933e interfaceC0933e2 = d10 instanceof InterfaceC0933e ? (InterfaceC0933e) d10 : null;
            return interfaceC0933e2 != null && Hc.g.r0(interfaceC0933e) && Intrinsics.b(AbstractC3778c.l(interfaceC0933e), AbstractC3778c.l(interfaceC0933e2));
        }

        private final bd.o c(InterfaceC0952y interfaceC0952y, j0 j0Var) {
            if (bd.y.e(interfaceC0952y) || b(interfaceC0952y)) {
                AbstractC5197E type = j0Var.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return bd.y.g(Bd.a.w(type));
            }
            AbstractC5197E type2 = j0Var.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            return bd.y.g(type2);
        }

        public final boolean a(InterfaceC0929a superDescriptor, InterfaceC0929a subDescriptor) {
            Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
            Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof Uc.e) && (superDescriptor instanceof InterfaceC0952y)) {
                Uc.e eVar = (Uc.e) subDescriptor;
                eVar.m().size();
                InterfaceC0952y interfaceC0952y = (InterfaceC0952y) superDescriptor;
                interfaceC0952y.m().size();
                List m10 = eVar.a().m();
                Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
                List m11 = interfaceC0952y.a().m();
                Intrinsics.checkNotNullExpressionValue(m11, "getValueParameters(...)");
                for (Pair pair : CollectionsKt.V0(m10, m11)) {
                    j0 j0Var = (j0) pair.getFirst();
                    j0 j0Var2 = (j0) pair.getSecond();
                    Intrinsics.d(j0Var);
                    boolean z10 = c((InterfaceC0952y) subDescriptor, j0Var) instanceof o.d;
                    Intrinsics.d(j0Var2);
                    if (z10 != (c(interfaceC0952y, j0Var2) instanceof o.d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private a() {
        }
    }

    private final boolean c(InterfaceC0929a interfaceC0929a, InterfaceC0929a interfaceC0929a2, InterfaceC0933e interfaceC0933e) {
        if ((interfaceC0929a instanceof InterfaceC0930b) && (interfaceC0929a2 instanceof InterfaceC0952y) && !Hc.g.g0(interfaceC0929a2)) {
            C1156f c1156f = C1156f.f9028o;
            InterfaceC0952y interfaceC0952y = (InterfaceC0952y) interfaceC0929a2;
            id.f name = interfaceC0952y.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!c1156f.l(name)) {
                I.a aVar = I.f8994a;
                id.f name2 = interfaceC0952y.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (!aVar.k(name2)) {
                    return false;
                }
            }
            InterfaceC0930b e10 = H.e((InterfaceC0930b) interfaceC0929a);
            boolean z10 = interfaceC0929a instanceof InterfaceC0952y;
            InterfaceC0952y interfaceC0952y2 = z10 ? (InterfaceC0952y) interfaceC0929a : null;
            if (!(interfaceC0952y2 != null && interfaceC0952y.D0() == interfaceC0952y2.D0()) && (e10 == null || !interfaceC0952y.D0())) {
                return true;
            }
            if ((interfaceC0933e instanceof Uc.c) && interfaceC0952y.j0() == null && e10 != null && !H.f(interfaceC0933e, e10)) {
                if ((e10 instanceof InterfaceC0952y) && z10 && C1156f.k((InterfaceC0952y) e10) != null) {
                    String c10 = bd.y.c(interfaceC0952y, false, false, 2, null);
                    InterfaceC0952y a10 = ((InterfaceC0952y) interfaceC0929a).a();
                    Intrinsics.checkNotNullExpressionValue(a10, "getOriginal(...)");
                    if (Intrinsics.b(c10, bd.y.c(a10, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kd.g
    public g.a a() {
        return g.a.CONFLICTS_ONLY;
    }

    @Override // kd.g
    public g.b b(InterfaceC0929a superDescriptor, InterfaceC0929a subDescriptor, InterfaceC0933e interfaceC0933e) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        return c(superDescriptor, subDescriptor, interfaceC0933e) ? g.b.INCOMPATIBLE : f9056a.a(superDescriptor, subDescriptor) ? g.b.INCOMPATIBLE : g.b.UNKNOWN;
    }
}
