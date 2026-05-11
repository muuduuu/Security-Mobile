package Mc;

import Kc.InterfaceC0941m;
import Kc.a0;
import Kc.d0;
import org.conscrypt.BuildConfig;
import yd.u0;

/* renamed from: Mc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0976b extends AbstractC0979e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0976b(xd.n nVar, InterfaceC0941m interfaceC0941m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar, u0 u0Var, boolean z10, int i10, a0 a0Var, d0 d0Var) {
        super(nVar, interfaceC0941m, gVar, fVar, u0Var, z10, i10, a0Var, d0Var);
        if (nVar == null) {
            D(0);
        }
        if (interfaceC0941m == null) {
            D(1);
        }
        if (gVar == null) {
            D(2);
        }
        if (fVar == null) {
            D(3);
        }
        if (u0Var == null) {
            D(4);
        }
        if (a0Var == null) {
            D(5);
        }
        if (d0Var == null) {
            D(6);
        }
    }

    private static /* synthetic */ void D(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Mc.AbstractC0984j
    public String toString() {
        boolean L10 = L();
        String str = BuildConfig.FLAVOR;
        String str2 = L10 ? "reified " : BuildConfig.FLAVOR;
        if (u() != u0.INVARIANT) {
            str = u() + " ";
        }
        return String.format("%s%s%s", str2, str, getName());
    }
}
