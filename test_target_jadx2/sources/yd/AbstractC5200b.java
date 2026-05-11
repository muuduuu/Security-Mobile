package yd;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import od.AbstractC3778c;

/* renamed from: yd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5200b extends AbstractC5204f implements e0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5200b(xd.n nVar) {
        super(nVar);
        if (nVar == null) {
            u(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void u(int i10) {
        String format;
        String str = (i10 == 1 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 != 1) {
            if (i10 == 2) {
                objArr[0] = "classifier";
            } else if (i10 != 3 && i10 != 4) {
                objArr[0] = "storageManager";
            }
            if (i10 != 1) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 3 || i10 == 4) {
                objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    objArr[2] = "isSameClassifier";
                } else if (i10 != 3 && i10 != 4) {
                    objArr[2] = "<init>";
                }
            }
            format = String.format(str, objArr);
            if (i10 == 1 && i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        if (i10 != 1) {
        }
        if (i10 != 1) {
        }
        format = String.format(str, objArr);
        if (i10 == 1) {
        }
        throw new IllegalStateException(format);
    }

    @Override // yd.AbstractC5210l
    protected boolean i(InterfaceC0936h interfaceC0936h) {
        if (interfaceC0936h == null) {
            u(2);
        }
        return (interfaceC0936h instanceof InterfaceC0933e) && g(w(), interfaceC0936h);
    }

    @Override // yd.AbstractC5204f
    protected AbstractC5197E m() {
        if (Hc.g.u0(w())) {
            return null;
        }
        return v().i();
    }

    @Override // yd.AbstractC5204f
    protected Collection n(boolean z10) {
        InterfaceC0941m b10 = w().b();
        if (!(b10 instanceof InterfaceC0933e)) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                u(3);
            }
            return emptyList;
        }
        Gd.f fVar = new Gd.f();
        InterfaceC0933e interfaceC0933e = (InterfaceC0933e) b10;
        fVar.add(interfaceC0933e.y());
        InterfaceC0933e Z10 = interfaceC0933e.Z();
        if (z10 && Z10 != null) {
            fVar.add(Z10.y());
        }
        return fVar;
    }

    @Override // yd.e0
    public Hc.g v() {
        Hc.g j10 = AbstractC3778c.j(w());
        if (j10 == null) {
            u(1);
        }
        return j10;
    }

    public abstract InterfaceC0933e w();
}
