package Mc;

import Kc.AbstractC0948u;
import Kc.EnumC0934f;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0943o;
import Kc.X;
import Kc.a0;
import Kc.f0;
import Kc.h0;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import od.AbstractC3778c;
import yd.AbstractC5197E;
import yd.AbstractC5216s;
import yd.C5198F;
import yd.C5209k;
import yd.C5212n;
import yd.e0;
import yd.l0;
import yd.n0;
import yd.q0;
import yd.u0;

/* loaded from: classes3.dex */
public class s extends t {

    /* renamed from: b, reason: collision with root package name */
    private final t f6345b;

    /* renamed from: c, reason: collision with root package name */
    private final n0 f6346c;

    /* renamed from: d, reason: collision with root package name */
    private n0 f6347d;

    /* renamed from: e, reason: collision with root package name */
    private List f6348e;

    /* renamed from: f, reason: collision with root package name */
    private List f6349f;

    /* renamed from: g, reason: collision with root package name */
    private e0 f6350g;

    class a implements Function1 {
        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(f0 f0Var) {
            return Boolean.valueOf(!f0Var.u0());
        }
    }

    class b implements Function1 {
        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public yd.M invoke(yd.M m10) {
            return s.this.V0(m10);
        }
    }

    public s(t tVar, n0 n0Var) {
        this.f6345b = tVar;
        this.f6346c = n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void I0(int i10) {
        String format;
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? 3 : 2];
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        if (i10 != 8) {
                            if (i10 != 10) {
                                if (i10 != 13) {
                                    if (i10 != 23) {
                                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                    } else {
                                        objArr[0] = "substitutor";
                                    }
                                    switch (i10) {
                                        case 2:
                                        case 3:
                                        case 5:
                                        case 6:
                                        case 8:
                                        case RequestError.EVENT_TIMEOUT /* 10 */:
                                        case 13:
                                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                            break;
                                        case 4:
                                        case 7:
                                        case 9:
                                        case 11:
                                            objArr[1] = "getMemberScope";
                                            break;
                                        case 12:
                                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                                            objArr[1] = "getUnsubstitutedMemberScope";
                                            break;
                                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                                            objArr[1] = "getStaticScope";
                                            break;
                                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                            objArr[1] = "getDefaultType";
                                            break;
                                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                                            objArr[1] = "getContextReceivers";
                                            break;
                                        case 18:
                                            objArr[1] = "getConstructors";
                                            break;
                                        case 19:
                                            objArr[1] = "getAnnotations";
                                            break;
                                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                                            objArr[1] = "getName";
                                            break;
                                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                                            objArr[1] = "getOriginal";
                                            break;
                                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                                            objArr[1] = "getContainingDeclaration";
                                            break;
                                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                                            objArr[1] = "substitute";
                                            break;
                                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                                            objArr[1] = "getKind";
                                            break;
                                        case 26:
                                            objArr[1] = "getModality";
                                            break;
                                        case 27:
                                            objArr[1] = "getVisibility";
                                            break;
                                        case 28:
                                            objArr[1] = "getUnsubstitutedInnerClassesScope";
                                            break;
                                        case 29:
                                            objArr[1] = "getSource";
                                            break;
                                        case 30:
                                            objArr[1] = "getDeclaredTypeParameters";
                                            break;
                                        case HVError.INSTRUCTION_ERROR /* 31 */:
                                            objArr[1] = "getSealedSubclasses";
                                            break;
                                        default:
                                            objArr[1] = "getTypeConstructor";
                                            break;
                                    }
                                    if (i10 != 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10) {
                                        objArr[2] = "getMemberScope";
                                    } else if (i10 == 13) {
                                        objArr[2] = "getUnsubstitutedMemberScope";
                                    } else if (i10 == 23) {
                                        objArr[2] = "substitute";
                                    }
                                    format = String.format(str, objArr);
                                    if (i10 == 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 13 && i10 != 23) {
                                        throw new IllegalStateException(format);
                                    }
                                    throw new IllegalArgumentException(format);
                                }
                            }
                        }
                    }
                }
                objArr[0] = "typeSubstitution";
                switch (i10) {
                }
                if (i10 != 2) {
                }
                objArr[2] = "getMemberScope";
                format = String.format(str, objArr);
                if (i10 == 2) {
                }
                throw new IllegalArgumentException(format);
            }
            objArr[0] = "kotlinTypeRefiner";
            switch (i10) {
            }
            if (i10 != 2) {
            }
            objArr[2] = "getMemberScope";
            format = String.format(str, objArr);
            if (i10 == 2) {
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "typeArguments";
        switch (i10) {
        }
        if (i10 != 2) {
        }
        objArr[2] = "getMemberScope";
        format = String.format(str, objArr);
        if (i10 == 2) {
        }
        throw new IllegalArgumentException(format);
    }

    private n0 T0() {
        if (this.f6347d == null) {
            if (this.f6346c.k()) {
                this.f6347d = this.f6346c;
            } else {
                List c10 = this.f6345b.r().c();
                this.f6348e = new ArrayList(c10.size());
                this.f6347d = AbstractC5216s.b(c10, this.f6346c.j(), this, this.f6348e);
                this.f6349f = CollectionsKt.Z(this.f6348e, new a());
            }
        }
        return this.f6347d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yd.M V0(yd.M m10) {
        return (m10 == null || this.f6346c.k()) ? m10 : (yd.M) T0().p(m10, u0.INVARIANT);
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0937i
    public List B() {
        T0();
        List list = this.f6349f;
        if (list == null) {
            I0(30);
        }
        return list;
    }

    @Override // Mc.t
    public rd.h D(l0 l0Var, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (l0Var == null) {
            I0(5);
        }
        if (gVar == null) {
            I0(6);
        }
        rd.h D10 = this.f6345b.D(l0Var, gVar);
        if (!this.f6346c.k()) {
            return new rd.m(D10, T0());
        }
        if (D10 == null) {
            I0(7);
        }
        return D10;
    }

    @Override // Kc.InterfaceC0933e
    public boolean F() {
        return this.f6345b.F();
    }

    @Override // Kc.InterfaceC0933e
    public rd.h G0() {
        rd.h G02 = this.f6345b.G0();
        if (G02 == null) {
            I0(28);
        }
        return G02;
    }

    @Override // Kc.InterfaceC0933e
    public h0 H0() {
        h0 H02 = this.f6345b.H0();
        if (H02 == null) {
            return null;
        }
        return H02.c(new b());
    }

    @Override // Kc.InterfaceC0933e
    public boolean J() {
        return this.f6345b.J();
    }

    @Override // Kc.InterfaceC0933e
    public rd.h L0() {
        rd.h N10 = N(AbstractC3778c.o(kd.f.g(this.f6345b)));
        if (N10 == null) {
            I0(12);
        }
        return N10;
    }

    @Override // Kc.C
    public boolean M0() {
        return this.f6345b.M0();
    }

    @Override // Mc.t
    public rd.h N(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            I0(13);
        }
        rd.h N10 = this.f6345b.N(gVar);
        if (!this.f6346c.k()) {
            return new rd.m(N10, T0());
        }
        if (N10 == null) {
            I0(14);
        }
        return N10;
    }

    @Override // Kc.InterfaceC0933e
    public rd.h O0(l0 l0Var) {
        if (l0Var == null) {
            I0(10);
        }
        rd.h D10 = D(l0Var, AbstractC3778c.o(kd.f.g(this)));
        if (D10 == null) {
            I0(11);
        }
        return D10;
    }

    @Override // Kc.InterfaceC0933e
    public Collection P() {
        Collection P10 = this.f6345b.P();
        if (P10 == null) {
            I0(31);
        }
        return P10;
    }

    @Override // Kc.InterfaceC0933e
    public List P0() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            I0(17);
        }
        return emptyList;
    }

    @Override // Kc.InterfaceC0933e
    public boolean Q() {
        return this.f6345b.Q();
    }

    @Override // Kc.C
    public boolean R() {
        return this.f6345b.R();
    }

    @Override // Kc.InterfaceC0933e
    public boolean R0() {
        return this.f6345b.R0();
    }

    @Override // Kc.InterfaceC0937i
    public boolean S() {
        return this.f6345b.S();
    }

    @Override // Kc.InterfaceC0933e
    public X S0() {
        throw new UnsupportedOperationException();
    }

    @Override // Kc.c0
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public InterfaceC0933e c(n0 n0Var) {
        if (n0Var == null) {
            I0(23);
        }
        return n0Var.k() ? this : new s(this, n0.h(n0Var.j(), T0().j()));
    }

    @Override // Kc.InterfaceC0933e
    public InterfaceC0932d W() {
        return this.f6345b.W();
    }

    @Override // Kc.InterfaceC0933e
    public rd.h X() {
        rd.h X10 = this.f6345b.X();
        if (X10 == null) {
            I0(15);
        }
        return X10;
    }

    @Override // Kc.InterfaceC0933e
    public InterfaceC0933e Z() {
        return this.f6345b.Z();
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0942n, Kc.InterfaceC0941m
    public InterfaceC0941m b() {
        InterfaceC0941m b10 = this.f6345b.b();
        if (b10 == null) {
            I0(22);
        }
        return b10;
    }

    @Override // Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o interfaceC0943o, Object obj) {
        return interfaceC0943o.h(this, obj);
    }

    @Override // Kc.I
    public id.f getName() {
        id.f name = this.f6345b.getName();
        if (name == null) {
            I0(20);
        }
        return name;
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0945q, Kc.C
    public AbstractC0948u h() {
        AbstractC0948u h10 = this.f6345b.h();
        if (h10 == null) {
            I0(27);
        }
        return h10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i10 = this.f6345b.i();
        if (i10 == null) {
            I0(19);
        }
        return i10;
    }

    @Override // Kc.InterfaceC0944p
    public a0 j() {
        a0 a0Var = a0.f5560a;
        if (a0Var == null) {
            I0(29);
        }
        return a0Var;
    }

    @Override // Kc.InterfaceC0933e
    public Collection k() {
        Collection<InterfaceC0932d> k10 = this.f6345b.k();
        ArrayList arrayList = new ArrayList(k10.size());
        for (InterfaceC0932d interfaceC0932d : k10) {
            arrayList.add(((InterfaceC0932d) interfaceC0932d.A().g(interfaceC0932d.a()).k(interfaceC0932d.s()).i(interfaceC0932d.h()).p(interfaceC0932d.o()).m(false).c()).c(T0()));
        }
        return arrayList;
    }

    @Override // Kc.InterfaceC0933e
    public EnumC0934f o() {
        EnumC0934f o10 = this.f6345b.o();
        if (o10 == null) {
            I0(25);
        }
        return o10;
    }

    @Override // Kc.InterfaceC0933e
    public boolean p() {
        return this.f6345b.p();
    }

    @Override // Kc.C
    public boolean q() {
        return this.f6345b.q();
    }

    @Override // Kc.InterfaceC0936h
    public e0 r() {
        e0 r10 = this.f6345b.r();
        if (this.f6346c.k()) {
            if (r10 == null) {
                I0(0);
            }
            return r10;
        }
        if (this.f6350g == null) {
            n0 T02 = T0();
            Collection a10 = r10.a();
            ArrayList arrayList = new ArrayList(a10.size());
            Iterator it = a10.iterator();
            while (it.hasNext()) {
                arrayList.add(T02.p((AbstractC5197E) it.next(), u0.INVARIANT));
            }
            this.f6350g = new C5209k(this, this.f6348e, arrayList, xd.f.f45006e);
        }
        e0 e0Var = this.f6350g;
        if (e0Var == null) {
            I0(1);
        }
        return e0Var;
    }

    @Override // Kc.InterfaceC0933e, Kc.C
    public Kc.D s() {
        Kc.D s10 = this.f6345b.s();
        if (s10 == null) {
            I0(26);
        }
        return s10;
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0936h
    public yd.M y() {
        yd.M k10 = C5198F.k(C5212n.f45551a.a(i(), null, null), r(), q0.g(r().c()), false, L0());
        if (k10 == null) {
            I0(16);
        }
        return k10;
    }

    @Override // Kc.InterfaceC0941m
    public InterfaceC0933e a() {
        InterfaceC0933e a10 = this.f6345b.a();
        if (a10 == null) {
            I0(21);
        }
        return a10;
    }
}
