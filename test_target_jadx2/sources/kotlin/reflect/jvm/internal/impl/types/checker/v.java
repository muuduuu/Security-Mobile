package kotlin.reflect.jvm.internal.impl.types.checker;

import Kc.InterfaceC0941m;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ld.AbstractC3629d;
import yd.AbstractC5197E;
import yd.e0;
import yd.f0;
import yd.i0;
import yd.q0;
import yd.u0;

/* loaded from: classes3.dex */
public abstract class v {
    private static final AbstractC5197E a(AbstractC5197E abstractC5197E) {
        return (AbstractC5197E) Cd.b.a(abstractC5197E).d();
    }

    private static final String b(e0 e0Var) {
        StringBuilder sb2 = new StringBuilder();
        c("type: " + e0Var, sb2);
        c("hashCode: " + e0Var.hashCode(), sb2);
        c("javaClass: " + e0Var.getClass().getCanonicalName(), sb2);
        for (InterfaceC0941m d10 = e0Var.d(); d10 != null; d10 = d10.b()) {
            c("fqName: " + kotlin.reflect.jvm.internal.impl.renderer.c.f36584g.q(d10), sb2);
            c("javaClass: " + d10.getClass().getCanonicalName(), sb2);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    private static final StringBuilder c(String str, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        sb2.append(str);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    public static final AbstractC5197E d(AbstractC5197E subtype, AbstractC5197E supertype, t typeCheckingProcedureCallbacks) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new q(subtype, null));
        e0 W02 = supertype.W0();
        while (!arrayDeque.isEmpty()) {
            q qVar = (q) arrayDeque.poll();
            AbstractC5197E b10 = qVar.b();
            e0 W03 = b10.W0();
            if (typeCheckingProcedureCallbacks.a(W03, W02)) {
                boolean X02 = b10.X0();
                for (q a10 = qVar.a(); a10 != null; a10 = a10.a()) {
                    AbstractC5197E b11 = a10.b();
                    List U02 = b11.U0();
                    if (!(U02 instanceof Collection) || !U02.isEmpty()) {
                        Iterator it = U02.iterator();
                        while (it.hasNext()) {
                            u0 a11 = ((i0) it.next()).a();
                            u0 u0Var = u0.INVARIANT;
                            if (a11 != u0Var) {
                                AbstractC5197E n10 = AbstractC3629d.f(f0.f45524c.a(b11), false, 1, null).c().n(b10, u0Var);
                                Intrinsics.checkNotNullExpressionValue(n10, "safeSubstitute(...)");
                                b10 = a(n10);
                                break;
                            }
                        }
                    }
                    b10 = f0.f45524c.a(b11).c().n(b10, u0.INVARIANT);
                    Intrinsics.d(b10);
                    X02 = X02 || b11.X0();
                }
                e0 W04 = b10.W0();
                if (typeCheckingProcedureCallbacks.a(W04, W02)) {
                    return q0.p(b10, X02);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(W04) + ", \n\nsupertype: " + b(W02) + " \n" + typeCheckingProcedureCallbacks.a(W04, W02));
            }
            for (AbstractC5197E abstractC5197E : W03.a()) {
                Intrinsics.d(abstractC5197E);
                arrayDeque.add(new q(abstractC5197E, qVar));
            }
        }
        return null;
    }
}
