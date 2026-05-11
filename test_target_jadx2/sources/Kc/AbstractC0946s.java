package Kc;

import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;

/* renamed from: Kc.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0946s {
    public static final InterfaceC0936h a(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        InterfaceC0941m b10 = interfaceC0941m.b();
        if (b10 == null || (interfaceC0941m instanceof K)) {
            return null;
        }
        if (!b(b10)) {
            return a(b10);
        }
        if (b10 instanceof InterfaceC0936h) {
            return (InterfaceC0936h) b10;
        }
        return null;
    }

    public static final boolean b(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        return interfaceC0941m.b() instanceof K;
    }

    public static final boolean c(InterfaceC0952y interfaceC0952y) {
        yd.M y10;
        AbstractC5197E y11;
        AbstractC5197E g10;
        Intrinsics.checkNotNullParameter(interfaceC0952y, "<this>");
        InterfaceC0941m b10 = interfaceC0952y.b();
        InterfaceC0933e interfaceC0933e = b10 instanceof InterfaceC0933e ? (InterfaceC0933e) b10 : null;
        if (interfaceC0933e == null) {
            return false;
        }
        InterfaceC0933e interfaceC0933e2 = kd.h.g(interfaceC0933e) ? interfaceC0933e : null;
        if (interfaceC0933e2 == null || (y10 = interfaceC0933e2.y()) == null || (y11 = Bd.a.y(y10)) == null || (g10 = interfaceC0952y.g()) == null || !Intrinsics.b(interfaceC0952y.getName(), Dd.q.f1562e)) {
            return false;
        }
        if ((!Bd.a.n(g10) && !Bd.a.o(g10)) || interfaceC0952y.m().size() != 1) {
            return false;
        }
        AbstractC5197E type = ((j0) interfaceC0952y.m().get(0)).getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return Intrinsics.b(Bd.a.y(type), y11) && interfaceC0952y.x0().isEmpty() && interfaceC0952y.s0() == null;
    }

    public static final InterfaceC0933e d(G g10, id.c fqName, Rc.b lookupLocation) {
        InterfaceC0936h interfaceC0936h;
        rd.h G02;
        Intrinsics.checkNotNullParameter(g10, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(lookupLocation, "lookupLocation");
        if (fqName.d()) {
            return null;
        }
        id.c e10 = fqName.e();
        Intrinsics.checkNotNullExpressionValue(e10, "parent(...)");
        rd.h w10 = g10.p0(e10).w();
        id.f g11 = fqName.g();
        Intrinsics.checkNotNullExpressionValue(g11, "shortName(...)");
        InterfaceC0936h f10 = w10.f(g11, lookupLocation);
        InterfaceC0933e interfaceC0933e = f10 instanceof InterfaceC0933e ? (InterfaceC0933e) f10 : null;
        if (interfaceC0933e != null) {
            return interfaceC0933e;
        }
        id.c e11 = fqName.e();
        Intrinsics.checkNotNullExpressionValue(e11, "parent(...)");
        InterfaceC0933e d10 = d(g10, e11, lookupLocation);
        if (d10 == null || (G02 = d10.G0()) == null) {
            interfaceC0936h = null;
        } else {
            id.f g12 = fqName.g();
            Intrinsics.checkNotNullExpressionValue(g12, "shortName(...)");
            interfaceC0936h = G02.f(g12, lookupLocation);
        }
        if (interfaceC0936h instanceof InterfaceC0933e) {
            return (InterfaceC0933e) interfaceC0936h;
        }
        return null;
    }
}
