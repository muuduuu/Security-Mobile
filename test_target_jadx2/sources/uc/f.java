package Uc;

import Kc.AbstractC0948u;
import Kc.C0938j;
import Kc.D;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0941m;
import Kc.U;
import Kc.W;
import Kc.a0;
import Kc.j0;
import Mc.C;
import Mc.E;
import ad.AbstractC1393r;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.List;
import kd.AbstractC3565e;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public class f extends C implements a {

    /* renamed from: C, reason: collision with root package name */
    private final boolean f10424C;

    /* renamed from: D, reason: collision with root package name */
    private final Pair f10425D;

    /* renamed from: E, reason: collision with root package name */
    private AbstractC5197E f10426E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected f(InterfaceC0941m interfaceC0941m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, D d10, AbstractC0948u abstractC0948u, boolean z10, id.f fVar, a0 a0Var, U u10, InterfaceC0930b.a aVar, boolean z11, Pair pair) {
        super(interfaceC0941m, u10, gVar, d10, abstractC0948u, z10, fVar, aVar, a0Var, false, false, false, false, false, false);
        if (interfaceC0941m == null) {
            D(0);
        }
        if (gVar == null) {
            D(1);
        }
        if (d10 == null) {
            D(2);
        }
        if (abstractC0948u == null) {
            D(3);
        }
        if (fVar == null) {
            D(4);
        }
        if (a0Var == null) {
            D(5);
        }
        if (aVar == null) {
            D(6);
        }
        this.f10426E = null;
        this.f10424C = z11;
        this.f10425D = pair;
    }

    private static /* synthetic */ void D(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[0] = "newModality";
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[0] = "newVisibility";
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[0] = "enhancedReturnType";
                break;
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[2] = "enhance";
                break;
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(format);
        }
    }

    public static f o1(InterfaceC0941m interfaceC0941m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, D d10, AbstractC0948u abstractC0948u, boolean z10, id.f fVar, a0 a0Var, boolean z11) {
        if (interfaceC0941m == null) {
            D(7);
        }
        if (gVar == null) {
            D(8);
        }
        if (d10 == null) {
            D(9);
        }
        if (abstractC0948u == null) {
            D(10);
        }
        if (fVar == null) {
            D(11);
        }
        if (a0Var == null) {
            D(12);
        }
        return new f(interfaceC0941m, gVar, d10, abstractC0948u, z10, fVar, a0Var, null, InterfaceC0930b.a.DECLARATION, z11, null);
    }

    @Override // Mc.C, Kc.InterfaceC0929a
    public Object A0(InterfaceC0929a.InterfaceC0107a interfaceC0107a) {
        Pair pair = this.f10425D;
        if (pair == null || !((InterfaceC0929a.InterfaceC0107a) pair.c()).equals(interfaceC0107a)) {
            return null;
        }
        return this.f10425D.d();
    }

    @Override // Mc.C, Kc.k0
    public boolean G() {
        AbstractC5197E type = getType();
        return this.f10424C && C0938j.a(type) && (!AbstractC1393r.i(type) || Hc.g.v0(type));
    }

    @Override // Mc.M, Kc.InterfaceC0929a
    public boolean M() {
        return false;
    }

    @Override // Mc.C
    protected C Y0(InterfaceC0941m interfaceC0941m, D d10, AbstractC0948u abstractC0948u, U u10, InterfaceC0930b.a aVar, id.f fVar, a0 a0Var) {
        if (interfaceC0941m == null) {
            D(13);
        }
        if (d10 == null) {
            D(14);
        }
        if (abstractC0948u == null) {
            D(15);
        }
        if (aVar == null) {
            D(16);
        }
        if (fVar == null) {
            D(17);
        }
        if (a0Var == null) {
            D(18);
        }
        return new f(interfaceC0941m, i(), d10, abstractC0948u, q0(), fVar, a0Var, u10, aVar, this.f10424C, this.f10425D);
    }

    @Override // Uc.a
    public a g0(AbstractC5197E abstractC5197E, List list, AbstractC5197E abstractC5197E2, Pair pair) {
        Mc.D d10;
        E e10;
        if (list == null) {
            D(19);
        }
        if (abstractC5197E2 == null) {
            D(20);
        }
        U a10 = a() == this ? null : a();
        f fVar = new f(b(), i(), s(), h(), q0(), getName(), j(), a10, o(), this.f10424C, pair);
        Mc.D d11 = d();
        if (d11 != null) {
            d10 = r15;
            Mc.D d12 = new Mc.D(fVar, d11.i(), d11.s(), d11.h(), d11.a0(), d11.q(), d11.p(), o(), a10 == null ? null : a10.d(), d11.j());
            d10.V0(d11.j0());
            d10.Y0(abstractC5197E2);
        } else {
            d10 = null;
        }
        W l10 = l();
        if (l10 != null) {
            E e11 = new E(fVar, l10.i(), l10.s(), l10.h(), l10.a0(), l10.q(), l10.p(), o(), a10 == null ? null : a10.l(), l10.j());
            e11.V0(e11.j0());
            e11.Z0((j0) l10.m().get(0));
            e10 = e11;
        } else {
            e10 = null;
        }
        fVar.e1(d10, e10, w0(), t0());
        fVar.j1(f1());
        Function0 function0 = this.f6216h;
        if (function0 != null) {
            fVar.T0(this.f6215g, function0);
        }
        fVar.F0(f());
        fVar.k1(abstractC5197E2, n(), l0(), abstractC5197E == null ? null : AbstractC3565e.i(this, abstractC5197E, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b()), CollectionsKt.j());
        return fVar;
    }

    @Override // Mc.C
    public void i1(AbstractC5197E abstractC5197E) {
        if (abstractC5197E == null) {
            D(22);
        }
        this.f10426E = abstractC5197E;
    }
}
