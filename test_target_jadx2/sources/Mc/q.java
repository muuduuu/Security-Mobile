package Mc;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import sd.C4517e;
import sd.InterfaceC4519g;

/* loaded from: classes3.dex */
public class q extends AbstractC0977c {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0933e f6334c;

    /* renamed from: d, reason: collision with root package name */
    private final C4517e f6335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InterfaceC0933e interfaceC0933e) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b());
        if (interfaceC0933e == null) {
            D(0);
        }
        this.f6334c = interfaceC0933e;
        this.f6335d = new C4517e(interfaceC0933e, null);
    }

    private static /* synthetic */ void D(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // Kc.InterfaceC0941m
    public InterfaceC0941m b() {
        InterfaceC0933e interfaceC0933e = this.f6334c;
        if (interfaceC0933e == null) {
            D(2);
        }
        return interfaceC0933e;
    }

    @Override // Kc.X
    public InterfaceC4519g getValue() {
        C4517e c4517e = this.f6335d;
        if (c4517e == null) {
            D(1);
        }
        return c4517e;
    }

    @Override // Mc.AbstractC0984j
    public String toString() {
        return "class " + this.f6334c.getName() + "::this";
    }
}
