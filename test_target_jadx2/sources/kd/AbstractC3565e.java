package kd;

import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.G;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0952y;
import Kc.U;
import Kc.X;
import Kc.Z;
import Kc.a0;
import Mc.C;
import Mc.C0980f;
import Mc.D;
import Mc.E;
import Mc.F;
import Mc.L;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import od.AbstractC3778c;
import sd.C4514b;
import sd.C4515c;
import sd.C4516d;
import yd.AbstractC5197E;
import yd.C5198F;
import yd.k0;
import yd.u0;

/* renamed from: kd.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3565e {

    /* renamed from: kd.e$a */
    private static class a extends C0980f {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0933e interfaceC0933e, a0 a0Var, boolean z10) {
            super(interfaceC0933e, null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), true, InterfaceC0930b.a.DECLARATION, a0Var);
            if (interfaceC0933e == null) {
                D(0);
            }
            if (a0Var == null) {
                D(1);
            }
            z1(Collections.emptyList(), f.k(interfaceC0933e, z10));
        }

        private static /* synthetic */ void D(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case 18:
            case HVError.INSTRUCTION_ERROR /* 31 */:
            case HVError.GPS_ACCESS_DENIED /* 33 */:
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[0] = "visibility";
                break;
            case 12:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[0] = "containingClass";
                break;
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                objArr[0] = "source";
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                break;
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[2] = "createDefaultGetter";
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                objArr[2] = "createEnumValuesMethod";
                break;
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case HVError.INSTRUCTION_ERROR /* 31 */:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case HVError.GPS_ACCESS_DENIED /* 33 */:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static X b(InterfaceC0929a interfaceC0929a, AbstractC5197E abstractC5197E, id.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, int i10) {
        if (interfaceC0929a == null) {
            a(32);
        }
        if (gVar == null) {
            a(33);
        }
        if (abstractC5197E == null) {
            return null;
        }
        return new F(interfaceC0929a, new C4515c(interfaceC0929a, abstractC5197E, fVar, null), gVar, id.g.a(i10));
    }

    public static X c(InterfaceC0933e interfaceC0933e, AbstractC5197E abstractC5197E, id.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, int i10) {
        if (interfaceC0933e == null) {
            a(34);
        }
        if (gVar == null) {
            a(35);
        }
        if (abstractC5197E == null) {
            return null;
        }
        return new F(interfaceC0933e, new C4514b(interfaceC0933e, abstractC5197E, fVar, null), gVar, id.g.a(i10));
    }

    public static D d(U u10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (u10 == null) {
            a(13);
        }
        if (gVar == null) {
            a(14);
        }
        return j(u10, gVar, true, false, false);
    }

    public static E e(U u10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
        if (u10 == null) {
            a(0);
        }
        if (gVar == null) {
            a(1);
        }
        if (gVar2 == null) {
            a(2);
        }
        return n(u10, gVar, gVar2, true, false, false, u10.j());
    }

    public static U f(InterfaceC0933e interfaceC0933e) {
        if (interfaceC0933e == null) {
            a(26);
        }
        G g10 = f.g(interfaceC0933e);
        InterfaceC0933e a10 = r.a(g10).a(g10);
        if (a10 == null) {
            return null;
        }
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b10 = aVar.b();
        Kc.D d10 = Kc.D.FINAL;
        AbstractC0948u abstractC0948u = AbstractC0947t.f5589e;
        id.f fVar = Hc.j.f3871e;
        InterfaceC0930b.a aVar2 = InterfaceC0930b.a.SYNTHESIZED;
        C X02 = C.X0(interfaceC0933e, b10, d10, abstractC0948u, false, fVar, aVar2, interfaceC0933e.j(), false, false, false, false, false, false);
        D d11 = new D(X02, aVar.b(), d10, abstractC0948u, false, false, false, aVar2, null, interfaceC0933e.j());
        X02.d1(d11, null);
        X02.k1(C5198F.h(yd.a0.f45478b.i(), a10.r(), Collections.singletonList(new k0(interfaceC0933e.y())), false), Collections.emptyList(), null, null, Collections.emptyList());
        d11.Y0(X02.g());
        return X02;
    }

    public static Z g(InterfaceC0933e interfaceC0933e) {
        if (interfaceC0933e == null) {
            a(24);
        }
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0;
        Mc.G u12 = Mc.G.u1(interfaceC0933e, aVar.b(), Hc.j.f3872f, InterfaceC0930b.a.SYNTHESIZED, interfaceC0933e.j());
        Mc.G a12 = u12.a1(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new L(u12, null, 0, aVar.b(), id.f.o("value"), AbstractC3778c.j(interfaceC0933e).W(), false, false, false, null, interfaceC0933e.j())), interfaceC0933e.y(), Kc.D.FINAL, AbstractC0947t.f5589e);
        if (a12 == null) {
            a(25);
        }
        return a12;
    }

    public static Z h(InterfaceC0933e interfaceC0933e) {
        if (interfaceC0933e == null) {
            a(22);
        }
        Mc.G a12 = Mc.G.u1(interfaceC0933e, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), Hc.j.f3870d, InterfaceC0930b.a.SYNTHESIZED, interfaceC0933e.j()).a1(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), AbstractC3778c.j(interfaceC0933e).l(u0.INVARIANT, interfaceC0933e.y()), Kc.D.FINAL, AbstractC0947t.f5589e);
        if (a12 == null) {
            a(23);
        }
        return a12;
    }

    public static X i(InterfaceC0929a interfaceC0929a, AbstractC5197E abstractC5197E, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (interfaceC0929a == null) {
            a(30);
        }
        if (gVar == null) {
            a(31);
        }
        if (abstractC5197E == null) {
            return null;
        }
        return new F(interfaceC0929a, new C4516d(interfaceC0929a, abstractC5197E, null), gVar);
    }

    public static D j(U u10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z10, boolean z11, boolean z12) {
        if (u10 == null) {
            a(15);
        }
        if (gVar == null) {
            a(16);
        }
        return k(u10, gVar, z10, z11, z12, u10.j());
    }

    public static D k(U u10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z10, boolean z11, boolean z12, a0 a0Var) {
        if (u10 == null) {
            a(17);
        }
        if (gVar == null) {
            a(18);
        }
        if (a0Var == null) {
            a(19);
        }
        return new D(u10, gVar, u10.s(), u10.h(), z10, z11, z12, InterfaceC0930b.a.DECLARATION, null, a0Var);
    }

    public static C0980f l(InterfaceC0933e interfaceC0933e, a0 a0Var) {
        if (interfaceC0933e == null) {
            a(20);
        }
        if (a0Var == null) {
            a(21);
        }
        return new a(interfaceC0933e, a0Var, false);
    }

    public static E m(U u10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2, boolean z10, boolean z11, boolean z12, AbstractC0948u abstractC0948u, a0 a0Var) {
        if (u10 == null) {
            a(7);
        }
        if (gVar == null) {
            a(8);
        }
        if (gVar2 == null) {
            a(9);
        }
        if (abstractC0948u == null) {
            a(10);
        }
        if (a0Var == null) {
            a(11);
        }
        E e10 = new E(u10, gVar, u10.s(), abstractC0948u, z10, z11, z12, InterfaceC0930b.a.DECLARATION, null, a0Var);
        e10.Z0(E.X0(e10, u10.getType(), gVar2));
        return e10;
    }

    public static E n(U u10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2, boolean z10, boolean z11, boolean z12, a0 a0Var) {
        if (u10 == null) {
            a(3);
        }
        if (gVar == null) {
            a(4);
        }
        if (gVar2 == null) {
            a(5);
        }
        if (a0Var == null) {
            a(6);
        }
        return m(u10, gVar, gVar2, z10, z11, z12, u10.h(), a0Var);
    }

    private static boolean o(InterfaceC0952y interfaceC0952y) {
        if (interfaceC0952y == null) {
            a(29);
        }
        return interfaceC0952y.o() == InterfaceC0930b.a.SYNTHESIZED && f.A(interfaceC0952y.b());
    }

    public static boolean p(InterfaceC0952y interfaceC0952y) {
        if (interfaceC0952y == null) {
            a(28);
        }
        return interfaceC0952y.getName().equals(Hc.j.f3872f) && o(interfaceC0952y);
    }

    public static boolean q(InterfaceC0952y interfaceC0952y) {
        if (interfaceC0952y == null) {
            a(27);
        }
        return interfaceC0952y.getName().equals(Hc.j.f3870d) && o(interfaceC0952y);
    }
}
