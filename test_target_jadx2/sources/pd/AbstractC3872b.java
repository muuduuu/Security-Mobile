package pd;

import Hc.j;
import Kc.AbstractC0947t;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.f0;
import Kc.j0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kd.h;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import yd.AbstractC5197E;

/* renamed from: pd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3872b {
    private static final boolean a(InterfaceC0933e interfaceC0933e) {
        return Intrinsics.b(AbstractC3778c.l(interfaceC0933e), j.f3887u);
    }

    private static final boolean b(AbstractC5197E abstractC5197E, boolean z10) {
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        f0 f0Var = d10 instanceof f0 ? (f0) d10 : null;
        if (f0Var == null) {
            return false;
        }
        return (z10 || !h.d(f0Var)) && e(Bd.a.j(f0Var));
    }

    public static final boolean c(InterfaceC0941m interfaceC0941m) {
        Intrinsics.checkNotNullParameter(interfaceC0941m, "<this>");
        return h.g(interfaceC0941m) && !a((InterfaceC0933e) interfaceC0941m);
    }

    public static final boolean d(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        if (d10 != null) {
            return (h.b(d10) && c(d10)) || h.i(abstractC5197E);
        }
        return false;
    }

    private static final boolean e(AbstractC5197E abstractC5197E) {
        return d(abstractC5197E) || b(abstractC5197E, true);
    }

    public static final boolean f(InterfaceC0930b descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        InterfaceC0932d interfaceC0932d = descriptor instanceof InterfaceC0932d ? (InterfaceC0932d) descriptor : null;
        if (interfaceC0932d == null || AbstractC0947t.g(interfaceC0932d.h())) {
            return false;
        }
        InterfaceC0933e I10 = interfaceC0932d.I();
        Intrinsics.checkNotNullExpressionValue(I10, "getConstructedClass(...)");
        if (h.g(I10) || kd.f.G(interfaceC0932d.I())) {
            return false;
        }
        List m10 = interfaceC0932d.m();
        Intrinsics.checkNotNullExpressionValue(m10, "getValueParameters(...)");
        List list = m10;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5197E type = ((j0) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (e(type)) {
                return true;
            }
        }
        return false;
    }
}
