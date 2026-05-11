package Uc;

import Dd.p;
import Kc.AbstractC0948u;
import Kc.D;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.X;
import Kc.Z;
import Kc.a0;
import Mc.G;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.List;
import java.util.Map;
import kd.AbstractC3565e;
import kotlin.Pair;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public class e extends G implements Uc.a {

    /* renamed from: G, reason: collision with root package name */
    public static final InterfaceC0929a.InterfaceC0107a f10420G = new a();

    /* renamed from: H, reason: collision with root package name */
    public static final InterfaceC0929a.InterfaceC0107a f10421H = new b();

    /* renamed from: E, reason: collision with root package name */
    private c f10422E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f10423F;

    static class a implements InterfaceC0929a.InterfaceC0107a {
        a() {
        }
    }

    static class b implements InterfaceC0929a.InterfaceC0107a {
        b() {
        }
    }

    private enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);

        public final boolean isStable;
        public final boolean isSynthesized;

        private static /* synthetic */ void $$$reportNull$$$0(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        c(boolean z10, boolean z11) {
            this.isStable = z10;
            this.isSynthesized = z11;
        }

        public static c get(boolean z10, boolean z11) {
            c cVar = z10 ? z11 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z11 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                $$$reportNull$$$0(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(InterfaceC0941m interfaceC0941m, Z z10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar, InterfaceC0930b.a aVar, a0 a0Var, boolean z11) {
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
        this.f10422E = null;
        this.f10423F = z11;
    }

    private static /* synthetic */ void D(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static e y1(InterfaceC0941m interfaceC0941m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar, a0 a0Var, boolean z10) {
        if (interfaceC0941m == null) {
            D(5);
        }
        if (gVar == null) {
            D(6);
        }
        if (fVar == null) {
            D(7);
        }
        if (a0Var == null) {
            D(8);
        }
        return new e(interfaceC0941m, null, gVar, fVar, InterfaceC0930b.a.DECLARATION, a0Var, z10);
    }

    @Override // Uc.a
    /* renamed from: A1, reason: merged with bridge method [inline-methods] */
    public e g0(AbstractC5197E abstractC5197E, List list, AbstractC5197E abstractC5197E2, Pair pair) {
        if (list == null) {
            D(19);
        }
        if (abstractC5197E2 == null) {
            D(20);
        }
        e eVar = (e) A().e(h.a(list, m(), this)).v(abstractC5197E2).s(abstractC5197E == null ? null : AbstractC3565e.i(this, abstractC5197E, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b())).d().h().c();
        if (pair != null) {
            eVar.d1((InterfaceC0929a.InterfaceC0107a) pair.c(), pair.d());
        }
        if (eVar == null) {
            D(21);
        }
        return eVar;
    }

    public void B1(boolean z10, boolean z11) {
        this.f10422E = c.get(z10, z11);
    }

    @Override // Mc.p, Kc.InterfaceC0929a
    public boolean M() {
        return this.f10422E.isSynthesized;
    }

    @Override // Mc.p
    public boolean Z0() {
        return this.f10422E.isStable;
    }

    @Override // Mc.G
    public G x1(X x10, X x11, List list, List list2, List list3, AbstractC5197E abstractC5197E, D d10, AbstractC0948u abstractC0948u, Map map) {
        if (list == null) {
            D(9);
        }
        if (list2 == null) {
            D(10);
        }
        if (list3 == null) {
            D(11);
        }
        if (abstractC0948u == null) {
            D(12);
        }
        G x12 = super.x1(x10, x11, list, list2, list3, abstractC5197E, d10, abstractC0948u, map);
        o1(p.f1528a.a(x12).a());
        if (x12 == null) {
            D(13);
        }
        return x12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mc.G, Mc.p
    /* renamed from: z1, reason: merged with bridge method [inline-methods] */
    public e U0(InterfaceC0941m interfaceC0941m, InterfaceC0952y interfaceC0952y, InterfaceC0930b.a aVar, id.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, a0 a0Var) {
        if (interfaceC0941m == null) {
            D(14);
        }
        if (aVar == null) {
            D(15);
        }
        if (gVar == null) {
            D(16);
        }
        if (a0Var == null) {
            D(17);
        }
        Z z10 = (Z) interfaceC0952y;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(interfaceC0941m, z10, gVar, fVar, aVar, a0Var, this.f10423F);
        eVar.B1(Z0(), M());
        return eVar;
    }
}
