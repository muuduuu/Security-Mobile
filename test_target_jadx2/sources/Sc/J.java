package Sc;

import Kc.AbstractC0948u;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0952y;
import Kc.n0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class J {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(Vc.g c10, Zc.C wildcardType) {
        Object obj;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(wildcardType, "wildcardType");
        if (wildcardType.H() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator it = new Vc.d(c10, wildcardType, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) obj;
            for (id.c cVar2 : v.f()) {
                if (Intrinsics.b(cVar.e(), cVar2)) {
                    break loop0;
                }
            }
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) obj;
    }

    public static final boolean b(InterfaceC0930b memberDescriptor) {
        Intrinsics.checkNotNullParameter(memberDescriptor, "memberDescriptor");
        return (memberDescriptor instanceof InterfaceC0952y) && Intrinsics.b(memberDescriptor.A0(Uc.e.f10421H), Boolean.TRUE);
    }

    public static final boolean c(x javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        return javaTypeEnhancementState.c().invoke(v.e()) == G.STRICT;
    }

    public static final AbstractC0948u d(n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        AbstractC0948u g10 = s.g(n0Var);
        Intrinsics.checkNotNullExpressionValue(g10, "toDescriptorVisibility(...)");
        return g10;
    }
}
