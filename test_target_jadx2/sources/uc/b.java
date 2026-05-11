package Uc;

import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.a0;
import Mc.C0980f;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.List;
import kd.AbstractC3565e;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public class b extends C0980f implements a {

    /* renamed from: F, reason: collision with root package name */
    private Boolean f10415F;

    /* renamed from: G, reason: collision with root package name */
    private Boolean f10416G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(InterfaceC0933e interfaceC0933e, b bVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z10, InterfaceC0930b.a aVar, a0 a0Var) {
        super(interfaceC0933e, bVar, gVar, z10, aVar, a0Var);
        if (interfaceC0933e == null) {
            D(0);
        }
        if (gVar == null) {
            D(1);
        }
        if (aVar == null) {
            D(2);
        }
        if (a0Var == null) {
            D(3);
        }
        this.f10415F = null;
        this.f10416G = null;
    }

    public static b C1(InterfaceC0933e interfaceC0933e, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z10, a0 a0Var) {
        if (interfaceC0933e == null) {
            D(4);
        }
        if (gVar == null) {
            D(5);
        }
        if (a0Var == null) {
            D(6);
        }
        return new b(interfaceC0933e, null, gVar, z10, InterfaceC0930b.a.DECLARATION, a0Var);
    }

    private static /* synthetic */ void D(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[0] = "sourceElement";
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[2] = "createDescriptor";
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    protected b B1(InterfaceC0933e interfaceC0933e, b bVar, InterfaceC0930b.a aVar, a0 a0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (interfaceC0933e == null) {
            D(12);
        }
        if (aVar == null) {
            D(13);
        }
        if (a0Var == null) {
            D(14);
        }
        if (gVar == null) {
            D(15);
        }
        return new b(interfaceC0933e, bVar, gVar, this.f6249E, aVar, a0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mc.C0980f
    /* renamed from: D1, reason: merged with bridge method [inline-methods] */
    public b U0(InterfaceC0941m interfaceC0941m, InterfaceC0952y interfaceC0952y, InterfaceC0930b.a aVar, id.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, a0 a0Var) {
        if (interfaceC0941m == null) {
            D(7);
        }
        if (aVar == null) {
            D(8);
        }
        if (gVar == null) {
            D(9);
        }
        if (a0Var == null) {
            D(10);
        }
        if (aVar == InterfaceC0930b.a.DECLARATION || aVar == InterfaceC0930b.a.SYNTHESIZED) {
            b B12 = B1((InterfaceC0933e) interfaceC0941m, (b) interfaceC0952y, aVar, a0Var, gVar);
            B12.h1(Z0());
            B12.i1(M());
            return B12;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC0941m + "\nkind: " + aVar);
    }

    @Override // Uc.a
    /* renamed from: E1, reason: merged with bridge method [inline-methods] */
    public b g0(AbstractC5197E abstractC5197E, List list, AbstractC5197E abstractC5197E2, Pair pair) {
        if (list == null) {
            D(16);
        }
        if (abstractC5197E2 == null) {
            D(17);
        }
        b U02 = U0(b(), null, o(), null, i(), j());
        U02.a1(abstractC5197E == null ? null : AbstractC3565e.i(U02, abstractC5197E, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b()), l0(), CollectionsKt.j(), n(), h.a(list, m(), U02), abstractC5197E2, s(), h());
        if (pair != null) {
            U02.d1((InterfaceC0929a.InterfaceC0107a) pair.c(), pair.d());
        }
        return U02;
    }

    @Override // Mc.p, Kc.InterfaceC0929a
    public boolean M() {
        return this.f10416G.booleanValue();
    }

    @Override // Mc.p
    public boolean Z0() {
        return this.f10415F.booleanValue();
    }

    @Override // Mc.p
    public void h1(boolean z10) {
        this.f10415F = Boolean.valueOf(z10);
    }

    @Override // Mc.p
    public void i1(boolean z10) {
        this.f10416G = Boolean.valueOf(z10);
    }
}
