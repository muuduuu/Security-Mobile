package Mc;

import Kc.InterfaceC0941m;
import Kc.a0;
import Kc.d0;
import Kc.f0;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import od.AbstractC3778c;
import yd.AbstractC5197E;
import yd.u0;

/* loaded from: classes3.dex */
public class K extends AbstractC0979e {

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f6201k;

    /* renamed from: l, reason: collision with root package name */
    private final List f6202l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6203m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private K(InterfaceC0941m interfaceC0941m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z10, u0 u0Var, id.f fVar, int i10, a0 a0Var, Function1 function1, d0 d0Var, xd.n nVar) {
        super(nVar, interfaceC0941m, gVar, fVar, u0Var, z10, i10, a0Var, d0Var);
        if (interfaceC0941m == null) {
            D(19);
        }
        if (gVar == null) {
            D(20);
        }
        if (u0Var == null) {
            D(21);
        }
        if (fVar == null) {
            D(22);
        }
        if (a0Var == null) {
            D(23);
        }
        if (d0Var == null) {
            D(24);
        }
        if (nVar == null) {
            D(25);
        }
        this.f6202l = new ArrayList(1);
        this.f6203m = false;
        this.f6201k = function1;
    }

    private static /* synthetic */ void D(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                objArr[0] = "source";
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    private void W0() {
        if (this.f6203m) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + d1());
    }

    private void X0() {
        if (this.f6203m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + d1());
        }
    }

    public static K Y0(InterfaceC0941m interfaceC0941m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z10, u0 u0Var, id.f fVar, int i10, a0 a0Var, Function1 function1, d0 d0Var, xd.n nVar) {
        if (interfaceC0941m == null) {
            D(12);
        }
        if (gVar == null) {
            D(13);
        }
        if (u0Var == null) {
            D(14);
        }
        if (fVar == null) {
            D(15);
        }
        if (a0Var == null) {
            D(16);
        }
        if (d0Var == null) {
            D(17);
        }
        if (nVar == null) {
            D(18);
        }
        return new K(interfaceC0941m, gVar, z10, u0Var, fVar, i10, a0Var, function1, d0Var, nVar);
    }

    public static K Z0(InterfaceC0941m interfaceC0941m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z10, u0 u0Var, id.f fVar, int i10, a0 a0Var, xd.n nVar) {
        if (interfaceC0941m == null) {
            D(6);
        }
        if (gVar == null) {
            D(7);
        }
        if (u0Var == null) {
            D(8);
        }
        if (fVar == null) {
            D(9);
        }
        if (a0Var == null) {
            D(10);
        }
        if (nVar == null) {
            D(11);
        }
        return Y0(interfaceC0941m, gVar, z10, u0Var, fVar, i10, a0Var, null, d0.a.f5565a, nVar);
    }

    public static f0 a1(InterfaceC0941m interfaceC0941m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z10, u0 u0Var, id.f fVar, int i10, xd.n nVar) {
        if (interfaceC0941m == null) {
            D(0);
        }
        if (gVar == null) {
            D(1);
        }
        if (u0Var == null) {
            D(2);
        }
        if (fVar == null) {
            D(3);
        }
        if (nVar == null) {
            D(4);
        }
        K Z02 = Z0(interfaceC0941m, gVar, z10, u0Var, fVar, i10, a0.f5560a, nVar);
        Z02.V0(AbstractC3778c.j(interfaceC0941m).y());
        Z02.e1();
        return Z02;
    }

    private void b1(AbstractC5197E abstractC5197E) {
        if (yd.G.a(abstractC5197E)) {
            return;
        }
        this.f6202l.add(abstractC5197E);
    }

    private String d1() {
        return getName() + " declared in " + kd.f.m(b());
    }

    @Override // Mc.AbstractC0979e
    protected void T0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            D(27);
        }
        Function1 function1 = this.f6201k;
        if (function1 == null) {
            return;
        }
        function1.invoke(abstractC5197E);
    }

    @Override // Mc.AbstractC0979e
    protected List U0() {
        W0();
        List list = this.f6202l;
        if (list == null) {
            D(28);
        }
        return list;
    }

    public void V0(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            D(26);
        }
        X0();
        b1(abstractC5197E);
    }

    public boolean c1() {
        return this.f6203m;
    }

    public void e1() {
        X0();
        this.f6203m = true;
    }
}
