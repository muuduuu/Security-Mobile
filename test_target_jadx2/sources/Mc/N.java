package Mc;

import Kc.InterfaceC0941m;
import Kc.a0;
import kotlin.jvm.functions.Function0;
import md.AbstractC3680g;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public abstract class N extends M {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6214f;

    /* renamed from: g, reason: collision with root package name */
    protected xd.j f6215g;

    /* renamed from: h, reason: collision with root package name */
    protected Function0 f6216h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC0941m interfaceC0941m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar, AbstractC5197E abstractC5197E, boolean z10, a0 a0Var) {
        super(interfaceC0941m, gVar, fVar, abstractC5197E, a0Var);
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
        this.f6214f = z10;
    }

    private static /* synthetic */ void D(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void T0(xd.j jVar, Function0 function0) {
        if (function0 == null) {
            D(5);
        }
        this.f6216h = function0;
        if (jVar == null) {
            jVar = (xd.j) function0.invoke();
        }
        this.f6215g = jVar;
    }

    public void U0(Function0 function0) {
        if (function0 == null) {
            D(4);
        }
        T0(null, function0);
    }

    @Override // Kc.k0
    public AbstractC3680g c0() {
        xd.j jVar = this.f6215g;
        if (jVar != null) {
            return (AbstractC3680g) jVar.invoke();
        }
        return null;
    }

    @Override // Kc.k0
    public boolean q0() {
        return this.f6214f;
    }
}
