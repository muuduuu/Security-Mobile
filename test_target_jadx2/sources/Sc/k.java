package Sc;

import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0950w;
import Kc.U;

/* loaded from: classes3.dex */
public abstract class k {
    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "companionObject";
        } else if (i10 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i10 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i10 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i10 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(InterfaceC0930b interfaceC0930b) {
        InterfaceC0950w w02;
        if (interfaceC0930b == null) {
            a(3);
        }
        if ((interfaceC0930b instanceof U) && (w02 = ((U) interfaceC0930b).w0()) != null && w02.i().A1(A.f8939b)) {
            return true;
        }
        return interfaceC0930b.i().A1(A.f8939b);
    }

    public static boolean c(InterfaceC0941m interfaceC0941m) {
        if (interfaceC0941m == null) {
            a(1);
        }
        return kd.f.x(interfaceC0941m) && kd.f.w(interfaceC0941m.b()) && !d((InterfaceC0933e) interfaceC0941m);
    }

    public static boolean d(InterfaceC0933e interfaceC0933e) {
        if (interfaceC0933e == null) {
            a(2);
        }
        return Hc.d.a(Hc.c.f3825a, interfaceC0933e);
    }

    public static boolean e(U u10) {
        if (u10 == null) {
            a(0);
        }
        if (u10.o() == InterfaceC0930b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(u10.b())) {
            return true;
        }
        return kd.f.x(u10.b()) && b(u10);
    }
}
