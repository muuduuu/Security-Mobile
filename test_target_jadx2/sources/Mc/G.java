package Mc;

import Kc.AbstractC0948u;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.X;
import Kc.Z;
import Kc.a0;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public class G extends p implements Z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected G(InterfaceC0941m interfaceC0941m, Z z10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar, InterfaceC0930b.a aVar, a0 a0Var) {
        super(interfaceC0941m, z10, gVar, fVar, aVar, a0Var);
        if (interfaceC0941m == null) {
            D(0);
        }
        if (gVar == null) {
            D(1);
        }
        if (fVar == null) {
            D(2);
        }
        if (aVar == null) {
            D(3);
        }
        if (a0Var == null) {
            D(4);
        }
    }

    private static /* synthetic */ void D(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case 29:
            case 30:
                break;
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static G u1(InterfaceC0941m interfaceC0941m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar, InterfaceC0930b.a aVar, a0 a0Var) {
        if (interfaceC0941m == null) {
            D(5);
        }
        if (gVar == null) {
            D(6);
        }
        if (fVar == null) {
            D(7);
        }
        if (aVar == null) {
            D(8);
        }
        if (a0Var == null) {
            D(9);
        }
        return new G(interfaceC0941m, null, gVar, fVar, aVar, a0Var);
    }

    @Override // Mc.p, Kc.InterfaceC0952y
    public InterfaceC0952y.a A() {
        InterfaceC0952y.a A10 = super.A();
        if (A10 == null) {
            D(30);
        }
        return A10;
    }

    @Override // Mc.p
    protected p U0(InterfaceC0941m interfaceC0941m, InterfaceC0952y interfaceC0952y, InterfaceC0930b.a aVar, id.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, a0 a0Var) {
        if (interfaceC0941m == null) {
            D(25);
        }
        if (aVar == null) {
            D(26);
        }
        if (gVar == null) {
            D(27);
        }
        if (a0Var == null) {
            D(28);
        }
        Z z10 = (Z) interfaceC0952y;
        if (fVar == null) {
            fVar = getName();
        }
        return new G(interfaceC0941m, z10, gVar, fVar, aVar, a0Var);
    }

    @Override // Kc.InterfaceC0930b
    /* renamed from: t1 */
    public Z o0(InterfaceC0941m interfaceC0941m, Kc.D d10, AbstractC0948u abstractC0948u, InterfaceC0930b.a aVar, boolean z10) {
        Z z11 = (Z) super.T0(interfaceC0941m, d10, abstractC0948u, aVar, z10);
        if (z11 == null) {
            D(29);
        }
        return z11;
    }

    @Override // Mc.p, Mc.AbstractC0985k, Mc.AbstractC0984j, Kc.InterfaceC0941m
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public Z a() {
        Z z10 = (Z) super.a();
        if (z10 == null) {
            D(24);
        }
        return z10;
    }

    @Override // Mc.p
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public G a1(X x10, X x11, List list, List list2, List list3, AbstractC5197E abstractC5197E, Kc.D d10, AbstractC0948u abstractC0948u) {
        if (list == null) {
            D(14);
        }
        if (list2 == null) {
            D(15);
        }
        if (list3 == null) {
            D(16);
        }
        if (abstractC0948u == null) {
            D(17);
        }
        G x12 = x1(x10, x11, list, list2, list3, abstractC5197E, d10, abstractC0948u, null);
        if (x12 == null) {
            D(18);
        }
        return x12;
    }

    public G x1(X x10, X x11, List list, List list2, List list3, AbstractC5197E abstractC5197E, Kc.D d10, AbstractC0948u abstractC0948u, Map map) {
        if (list == null) {
            D(19);
        }
        if (list2 == null) {
            D(20);
        }
        if (list3 == null) {
            D(21);
        }
        if (abstractC0948u == null) {
            D(22);
        }
        super.a1(x10, x11, list, list2, list3, abstractC5197E, d10, abstractC0948u);
        if (map != null && !map.isEmpty()) {
            this.f6284D = new LinkedHashMap(map);
        }
        return this;
    }
}
