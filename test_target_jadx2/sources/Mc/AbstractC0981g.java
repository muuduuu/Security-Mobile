package Mc;

import Kc.InterfaceC0941m;
import Kc.a0;

/* renamed from: Mc.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0981g extends AbstractC0975a {

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC0941m f6250f;

    /* renamed from: g, reason: collision with root package name */
    private final a0 f6251g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f6252h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC0981g(xd.n nVar, InterfaceC0941m interfaceC0941m, id.f fVar, a0 a0Var, boolean z10) {
        super(nVar, fVar);
        if (nVar == null) {
            I0(0);
        }
        if (interfaceC0941m == null) {
            I0(1);
        }
        if (fVar == null) {
            I0(2);
        }
        if (a0Var == null) {
            I0(3);
        }
        this.f6250f = interfaceC0941m;
        this.f6251g = a0Var;
        this.f6252h = z10;
    }

    private static /* synthetic */ void I0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0942n, Kc.InterfaceC0941m
    public InterfaceC0941m b() {
        InterfaceC0941m interfaceC0941m = this.f6250f;
        if (interfaceC0941m == null) {
            I0(4);
        }
        return interfaceC0941m;
    }

    @Override // Kc.InterfaceC0944p
    public a0 j() {
        a0 a0Var = this.f6251g;
        if (a0Var == null) {
            I0(5);
        }
        return a0Var;
    }

    public boolean q() {
        return this.f6252h;
    }
}
