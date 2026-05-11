package bd;

import Jc.c;
import ad.AbstractC1394s;
import id.C3367b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yd.o0;

/* loaded from: classes3.dex */
public abstract class E {
    public static final Object a(p pVar, Object possiblyPrimitiveType, boolean z10) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
        return z10 ? pVar.e(possiblyPrimitiveType) : possiblyPrimitiveType;
    }

    public static final Object b(o0 o0Var, Ad.i type, p typeFactory, D mode) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeFactory, "typeFactory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Ad.m e02 = o0Var.e0(type);
        if (!o0Var.m0(e02)) {
            return null;
        }
        Hc.h J10 = o0Var.J(e02);
        if (J10 != null) {
            return a(typeFactory, typeFactory.b(J10), o0Var.z0(type) || AbstractC1394s.c(o0Var, type));
        }
        Hc.h v10 = o0Var.v(e02);
        if (v10 != null) {
            return typeFactory.c('[' + pd.e.get(v10).getDesc());
        }
        if (o0Var.y0(e02)) {
            id.d x10 = o0Var.x(e02);
            C3367b n10 = x10 != null ? Jc.c.f4890a.n(x10) : null;
            if (n10 != null) {
                if (!mode.a()) {
                    List i10 = Jc.c.f4890a.i();
                    if (!(i10 instanceof Collection) || !i10.isEmpty()) {
                        Iterator it = i10.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.b(((c.a) it.next()).d(), n10)) {
                                return null;
                            }
                        }
                    }
                }
                String f10 = pd.d.b(n10).f();
                Intrinsics.checkNotNullExpressionValue(f10, "getInternalName(...)");
                return typeFactory.d(f10);
            }
        }
        return null;
    }
}
