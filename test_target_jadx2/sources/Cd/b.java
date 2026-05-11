package Cd;

import Hc.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ld.AbstractC3629d;
import ld.InterfaceC3627b;
import od.AbstractC3778c;
import xc.m;
import yd.AbstractC5194B;
import yd.AbstractC5197E;
import yd.C5198F;
import yd.M;
import yd.e0;
import yd.f0;
import yd.i0;
import yd.k0;
import yd.m0;
import yd.n0;
import yd.q0;
import yd.s0;
import yd.t0;
import yd.u0;

/* loaded from: classes3.dex */
public abstract class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1089a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1089a = iArr;
        }
    }

    /* renamed from: Cd.b$b, reason: collision with other inner class name */
    static final class C0018b extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0018b f1090a = new C0018b();

        C0018b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 t0Var) {
            Intrinsics.d(t0Var);
            return Boolean.valueOf(AbstractC3629d.d(t0Var));
        }
    }

    public static final class c extends f0 {
        c() {
        }

        @Override // yd.f0
        public i0 k(e0 key) {
            Intrinsics.checkNotNullParameter(key, "key");
            InterfaceC3627b interfaceC3627b = key instanceof InterfaceC3627b ? (InterfaceC3627b) key : null;
            if (interfaceC3627b == null) {
                return null;
            }
            return interfaceC3627b.f().c() ? new k0(u0.OUT_VARIANCE, interfaceC3627b.f().getType()) : interfaceC3627b.f();
        }
    }

    public static final Cd.a a(AbstractC5197E type) {
        Object e10;
        Intrinsics.checkNotNullParameter(type, "type");
        if (AbstractC5194B.b(type)) {
            Cd.a a10 = a(AbstractC5194B.c(type));
            Cd.a a11 = a(AbstractC5194B.d(type));
            return new Cd.a(s0.b(C5198F.d(AbstractC5194B.c((AbstractC5197E) a10.c()), AbstractC5194B.d((AbstractC5197E) a11.c())), type), s0.b(C5198F.d(AbstractC5194B.c((AbstractC5197E) a10.d()), AbstractC5194B.d((AbstractC5197E) a11.d())), type));
        }
        e0 W02 = type.W0();
        if (AbstractC3629d.d(type)) {
            Intrinsics.e(W02, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            i0 f10 = ((InterfaceC3627b) W02).f();
            AbstractC5197E type2 = f10.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            AbstractC5197E b10 = b(type2, type);
            int i10 = a.f1089a[f10.a().ordinal()];
            if (i10 == 2) {
                M I10 = Bd.a.i(type).I();
                Intrinsics.checkNotNullExpressionValue(I10, "getNullableAnyType(...)");
                return new Cd.a(b10, I10);
            }
            if (i10 == 3) {
                M H10 = Bd.a.i(type).H();
                Intrinsics.checkNotNullExpressionValue(H10, "getNothingType(...)");
                return new Cd.a(b(H10, type), b10);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + f10);
        }
        if (type.U0().isEmpty() || type.U0().size() != W02.c().size()) {
            return new Cd.a(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List U02 = type.U0();
        List c10 = W02.c();
        Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
        for (Pair pair : CollectionsKt.V0(U02, c10)) {
            i0 i0Var = (i0) pair.getFirst();
            Kc.f0 f0Var = (Kc.f0) pair.getSecond();
            Intrinsics.d(f0Var);
            Cd.c g10 = g(i0Var, f0Var);
            if (i0Var.c()) {
                arrayList.add(g10);
                arrayList2.add(g10);
            } else {
                Cd.a d10 = d(g10);
                Cd.c cVar = (Cd.c) d10.a();
                Cd.c cVar2 = (Cd.c) d10.b();
                arrayList.add(cVar);
                arrayList2.add(cVar2);
            }
        }
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((Cd.c) it.next()).d()) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            e10 = Bd.a.i(type).H();
            Intrinsics.checkNotNullExpressionValue(e10, "getNothingType(...)");
        } else {
            e10 = e(type, arrayList);
        }
        return new Cd.a(e10, e(type, arrayList2));
    }

    private static final AbstractC5197E b(AbstractC5197E abstractC5197E, AbstractC5197E abstractC5197E2) {
        AbstractC5197E q10 = q0.q(abstractC5197E, abstractC5197E2.X0());
        Intrinsics.checkNotNullExpressionValue(q10, "makeNullableIfNeeded(...)");
        return q10;
    }

    public static final i0 c(i0 i0Var, boolean z10) {
        if (i0Var == null) {
            return null;
        }
        if (i0Var.c()) {
            return i0Var;
        }
        AbstractC5197E type = i0Var.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        if (!q0.c(type, C0018b.f1090a)) {
            return i0Var;
        }
        u0 a10 = i0Var.a();
        Intrinsics.checkNotNullExpressionValue(a10, "getProjectionKind(...)");
        return a10 == u0.OUT_VARIANCE ? new k0(a10, (AbstractC5197E) a(type).d()) : z10 ? new k0(a10, (AbstractC5197E) a(type).c()) : f(i0Var);
    }

    private static final Cd.a d(Cd.c cVar) {
        Cd.a a10 = a(cVar.a());
        AbstractC5197E abstractC5197E = (AbstractC5197E) a10.a();
        AbstractC5197E abstractC5197E2 = (AbstractC5197E) a10.b();
        Cd.a a11 = a(cVar.b());
        return new Cd.a(new Cd.c(cVar.c(), abstractC5197E2, (AbstractC5197E) a11.a()), new Cd.c(cVar.c(), abstractC5197E, (AbstractC5197E) a11.b()));
    }

    private static final AbstractC5197E e(AbstractC5197E abstractC5197E, List list) {
        abstractC5197E.U0().size();
        list.size();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(h((Cd.c) it.next()));
        }
        return m0.e(abstractC5197E, arrayList, null, null, 6, null);
    }

    private static final i0 f(i0 i0Var) {
        n0 g10 = n0.g(new c());
        Intrinsics.checkNotNullExpressionValue(g10, "create(...)");
        return g10.t(i0Var);
    }

    private static final Cd.c g(i0 i0Var, Kc.f0 f0Var) {
        int i10 = a.f1089a[n0.c(f0Var.u(), i0Var).ordinal()];
        if (i10 == 1) {
            AbstractC5197E type = i0Var.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            AbstractC5197E type2 = i0Var.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            return new Cd.c(f0Var, type, type2);
        }
        if (i10 == 2) {
            AbstractC5197E type3 = i0Var.getType();
            Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
            M I10 = AbstractC3778c.j(f0Var).I();
            Intrinsics.checkNotNullExpressionValue(I10, "getNullableAnyType(...)");
            return new Cd.c(f0Var, type3, I10);
        }
        if (i10 != 3) {
            throw new lc.m();
        }
        M H10 = AbstractC3778c.j(f0Var).H();
        Intrinsics.checkNotNullExpressionValue(H10, "getNothingType(...)");
        AbstractC5197E type4 = i0Var.getType();
        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
        return new Cd.c(f0Var, H10, type4);
    }

    private static final i0 h(Cd.c cVar) {
        cVar.d();
        if (!Intrinsics.b(cVar.a(), cVar.b())) {
            u0 u10 = cVar.c().u();
            u0 u0Var = u0.IN_VARIANCE;
            if (u10 != u0Var) {
                return (!g.n0(cVar.a()) || cVar.c().u() == u0Var) ? g.p0(cVar.b()) ? new k0(i(cVar, u0Var), cVar.a()) : new k0(i(cVar, u0.OUT_VARIANCE), cVar.b()) : new k0(i(cVar, u0.OUT_VARIANCE), cVar.b());
            }
        }
        return new k0(cVar.a());
    }

    private static final u0 i(Cd.c cVar, u0 u0Var) {
        return u0Var == cVar.c().u() ? u0.INVARIANT : u0Var;
    }
}
