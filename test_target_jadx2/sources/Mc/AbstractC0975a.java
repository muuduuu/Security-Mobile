package Mc;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0943o;
import Kc.X;
import Kc.e0;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import od.AbstractC3778c;
import yd.C5198F;
import yd.l0;
import yd.n0;
import yd.q0;

/* renamed from: Mc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0975a extends t {

    /* renamed from: b, reason: collision with root package name */
    private final id.f f6217b;

    /* renamed from: c, reason: collision with root package name */
    protected final xd.i f6218c;

    /* renamed from: d, reason: collision with root package name */
    private final xd.i f6219d;

    /* renamed from: e, reason: collision with root package name */
    private final xd.i f6220e;

    /* renamed from: Mc.a$a, reason: collision with other inner class name */
    class C0124a implements Function0 {

        /* renamed from: Mc.a$a$a, reason: collision with other inner class name */
        class C0125a implements Function1 {
            C0125a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public yd.M invoke(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
                InterfaceC0936h f10 = gVar.f(AbstractC0975a.this);
                return f10 == null ? (yd.M) AbstractC0975a.this.f6218c.invoke() : f10 instanceof e0 ? C5198F.b((e0) f10, q0.g(f10.r().c())) : f10 instanceof t ? q0.v(f10.r().b(gVar), ((t) f10).N(gVar), this) : f10.y();
            }
        }

        C0124a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public yd.M invoke() {
            AbstractC0975a abstractC0975a = AbstractC0975a.this;
            return q0.u(abstractC0975a, abstractC0975a.L0(), new C0125a());
        }
    }

    /* renamed from: Mc.a$b */
    class b implements Function0 {
        b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rd.h invoke() {
            return new rd.f(AbstractC0975a.this.L0());
        }
    }

    /* renamed from: Mc.a$c */
    class c implements Function0 {
        c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public X invoke() {
            return new q(AbstractC0975a.this);
        }
    }

    public AbstractC0975a(xd.n nVar, id.f fVar) {
        if (nVar == null) {
            I0(0);
        }
        if (fVar == null) {
            I0(1);
        }
        this.f6217b = fVar;
        this.f6218c = nVar.d(new C0124a());
        this.f6219d = nVar.d(new b());
        this.f6220e = nVar.d(new c());
    }

    private static /* synthetic */ void I0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                break;
            case 7:
            case 8:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // Mc.t
    public rd.h D(l0 l0Var, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (l0Var == null) {
            I0(10);
        }
        if (gVar == null) {
            I0(11);
        }
        if (!l0Var.f()) {
            return new rd.m(N(gVar), n0.g(l0Var));
        }
        rd.h N10 = N(gVar);
        if (N10 == null) {
            I0(12);
        }
        return N10;
    }

    @Override // Kc.InterfaceC0933e
    public rd.h G0() {
        rd.h hVar = (rd.h) this.f6219d.invoke();
        if (hVar == null) {
            I0(4);
        }
        return hVar;
    }

    @Override // Kc.InterfaceC0933e
    public rd.h L0() {
        rd.h N10 = N(AbstractC3778c.o(kd.f.g(this)));
        if (N10 == null) {
            I0(17);
        }
        return N10;
    }

    @Override // Kc.c0
    /* renamed from: N0 */
    public InterfaceC0933e c(n0 n0Var) {
        if (n0Var == null) {
            I0(18);
        }
        return n0Var.k() ? this : new s(this, n0Var);
    }

    @Override // Kc.InterfaceC0933e
    public rd.h O0(l0 l0Var) {
        if (l0Var == null) {
            I0(15);
        }
        rd.h D10 = D(l0Var, AbstractC3778c.o(kd.f.g(this)));
        if (D10 == null) {
            I0(16);
        }
        return D10;
    }

    @Override // Kc.InterfaceC0933e
    public List P0() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            I0(6);
        }
        return emptyList;
    }

    @Override // Kc.InterfaceC0933e
    public X S0() {
        X x10 = (X) this.f6220e.invoke();
        if (x10 == null) {
            I0(5);
        }
        return x10;
    }

    @Override // Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o interfaceC0943o, Object obj) {
        return interfaceC0943o.h(this, obj);
    }

    @Override // Kc.I
    public id.f getName() {
        id.f fVar = this.f6217b;
        if (fVar == null) {
            I0(2);
        }
        return fVar;
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0936h
    public yd.M y() {
        yd.M m10 = (yd.M) this.f6218c.invoke();
        if (m10 == null) {
            I0(20);
        }
        return m10;
    }

    @Override // Kc.InterfaceC0941m
    public InterfaceC0933e a() {
        return this;
    }
}
