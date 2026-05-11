package Mc;

import Kc.InterfaceC0941m;
import Kc.InterfaceC0942n;
import Kc.InterfaceC0944p;
import Kc.a0;

/* renamed from: Mc.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0985k extends AbstractC0984j implements InterfaceC0942n {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0941m f6262c;

    /* renamed from: d, reason: collision with root package name */
    private final a0 f6263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC0985k(InterfaceC0941m interfaceC0941m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar, a0 a0Var) {
        super(gVar, fVar);
        if (interfaceC0941m == null) {
            D(0);
        }
        if (gVar == null) {
            D(1);
        }
        if (fVar == null) {
            D(2);
        }
        if (a0Var == null) {
            D(3);
        }
        this.f6262c = interfaceC0941m;
        this.f6263d = a0Var;
    }

    private static /* synthetic */ void D(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // Mc.AbstractC0984j, Kc.InterfaceC0941m
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public InterfaceC0944p a() {
        InterfaceC0944p interfaceC0944p = (InterfaceC0944p) super.a();
        if (interfaceC0944p == null) {
            D(4);
        }
        return interfaceC0944p;
    }

    public InterfaceC0941m b() {
        InterfaceC0941m interfaceC0941m = this.f6262c;
        if (interfaceC0941m == null) {
            D(5);
        }
        return interfaceC0941m;
    }

    @Override // Kc.InterfaceC0944p
    public a0 j() {
        a0 a0Var = this.f6263d;
        if (a0Var == null) {
            D(6);
        }
        return a0Var;
    }
}
