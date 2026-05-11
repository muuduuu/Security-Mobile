package yd;

import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: yd.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5216s {
    private static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(format);
        }
    }

    public static n0 b(List list, l0 l0Var, InterfaceC0941m interfaceC0941m, List list2) {
        if (list == null) {
            a(0);
        }
        if (l0Var == null) {
            a(1);
        }
        if (interfaceC0941m == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        n0 c10 = c(list, l0Var, interfaceC0941m, list2, null);
        if (c10 != null) {
            return c10;
        }
        throw new AssertionError("Substitution failed");
    }

    public static n0 c(List list, l0 l0Var, InterfaceC0941m interfaceC0941m, List list2, boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (l0Var == null) {
            a(6);
        }
        if (interfaceC0941m == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Kc.f0 f0Var = (Kc.f0) it.next();
            Mc.K Z02 = Mc.K.Z0(interfaceC0941m, f0Var.i(), f0Var.L(), f0Var.u(), f0Var.getName(), i10, Kc.a0.f5560a, f0Var.n0());
            hashMap.put(f0Var.r(), new k0(Z02.y()));
            hashMap2.put(f0Var, Z02);
            list2.add(Z02);
            i10++;
        }
        f0 j10 = f0.j(hashMap);
        n0 h10 = n0.h(l0Var, j10);
        n0 h11 = n0.h(l0Var.h(), j10);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Kc.f0 f0Var2 = (Kc.f0) it2.next();
            Mc.K k10 = (Mc.K) hashMap2.get(f0Var2);
            for (AbstractC5197E abstractC5197E : f0Var2.getUpperBounds()) {
                InterfaceC0936h d10 = abstractC5197E.W0().d();
                AbstractC5197E p10 = (((d10 instanceof Kc.f0) && Bd.a.k((Kc.f0) d10)) ? h10 : h11).p(abstractC5197E, u0.OUT_VARIANCE);
                if (p10 == null) {
                    return null;
                }
                if (p10 != abstractC5197E && zArr != null) {
                    zArr[0] = true;
                }
                k10.V0(p10);
            }
            k10.e1();
        }
        return h10;
    }
}
