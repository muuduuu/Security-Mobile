package Mc;

import Kc.InterfaceC0941m;

/* renamed from: Mc.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0984j extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.b implements InterfaceC0941m {

    /* renamed from: b, reason: collision with root package name */
    private final id.f f6261b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0984j(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar) {
        super(gVar);
        if (gVar == null) {
            D(0);
        }
        if (fVar == null) {
            D(1);
        }
        this.f6261b = fVar;
    }

    private static /* synthetic */ void D(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static String N(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            D(4);
        }
        try {
            String str = kotlin.reflect.jvm.internal.impl.renderer.c.f36587j.q(interfaceC0941m) + "[" + interfaceC0941m.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC0941m)) + "]";
            if (str == null) {
                D(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = interfaceC0941m.getClass().getSimpleName() + " " + interfaceC0941m.getName();
            if (str2 == null) {
                D(6);
            }
            return str2;
        }
    }

    @Override // Kc.I
    public id.f getName() {
        id.f fVar = this.f6261b;
        if (fVar == null) {
            D(2);
        }
        return fVar;
    }

    public String toString() {
        return N(this);
    }

    public InterfaceC0941m a() {
        return this;
    }
}
