package Xc;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.f0;
import id.C3367b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.j;
import kotlin.reflect.jvm.internal.impl.types.error.k;
import lc.t;
import od.AbstractC3778c;
import xc.m;
import yd.AbstractC5194B;
import yd.AbstractC5197E;
import yd.AbstractC5219v;
import yd.C5198F;
import yd.G;
import yd.M;
import yd.a0;
import yd.e0;
import yd.h0;
import yd.i0;
import yd.k0;
import yd.l0;
import yd.p0;
import yd.u0;

/* loaded from: classes3.dex */
public final class g extends l0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f11869e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Xc.a f11870f;

    /* renamed from: g, reason: collision with root package name */
    private static final Xc.a f11871g;

    /* renamed from: c, reason: collision with root package name */
    private final f f11872c;

    /* renamed from: d, reason: collision with root package name */
    private final h0 f11873d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0933e f11874a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f11875b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ M f11876c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Xc.a f11877d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC0933e interfaceC0933e, g gVar, M m10, Xc.a aVar) {
            super(1);
            this.f11874a = interfaceC0933e;
            this.f11875b = gVar;
            this.f11876c = m10;
            this.f11877d = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
            C3367b k10;
            InterfaceC0933e b10;
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            InterfaceC0933e interfaceC0933e = this.f11874a;
            if (interfaceC0933e == null) {
                interfaceC0933e = null;
            }
            if (interfaceC0933e == null || (k10 = AbstractC3778c.k(interfaceC0933e)) == null || (b10 = kotlinTypeRefiner.b(k10)) == null || Intrinsics.b(b10, this.f11874a)) {
                return null;
            }
            return (M) this.f11875b.j(this.f11876c, b10, this.f11877d).c();
        }
    }

    static {
        p0 p0Var = p0.COMMON;
        f11870f = Xc.b.b(p0Var, false, true, null, 5, null).l(c.FLEXIBLE_LOWER_BOUND);
        f11871g = Xc.b.b(p0Var, false, true, null, 5, null).l(c.FLEXIBLE_UPPER_BOUND);
    }

    public g(h0 h0Var) {
        f fVar = new f();
        this.f11872c = fVar;
        this.f11873d = h0Var == null ? new h0(fVar, null, 2, null) : h0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair j(M m10, InterfaceC0933e interfaceC0933e, Xc.a aVar) {
        if (m10.W0().c().isEmpty()) {
            return t.a(m10, Boolean.FALSE);
        }
        if (Hc.g.c0(m10)) {
            i0 i0Var = (i0) m10.U0().get(0);
            u0 a10 = i0Var.a();
            AbstractC5197E type = i0Var.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return t.a(C5198F.j(m10.V0(), m10.W0(), CollectionsKt.e(new k0(a10, k(type, aVar))), m10.X0(), null, 16, null), Boolean.FALSE);
        }
        if (G.a(m10)) {
            return t.a(k.d(j.ERROR_RAW_TYPE, m10.W0().toString()), Boolean.FALSE);
        }
        rd.h O02 = interfaceC0933e.O0(this);
        Intrinsics.checkNotNullExpressionValue(O02, "getMemberScope(...)");
        a0 V02 = m10.V0();
        e0 r10 = interfaceC0933e.r();
        Intrinsics.checkNotNullExpressionValue(r10, "getTypeConstructor(...)");
        List c10 = interfaceC0933e.r().c();
        Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
        List<f0> list = c10;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        for (f0 f0Var : list) {
            f fVar = this.f11872c;
            Intrinsics.d(f0Var);
            arrayList.add(AbstractC5219v.b(fVar, f0Var, aVar, this.f11873d, null, 8, null));
        }
        return t.a(C5198F.l(V02, r10, arrayList, m10.X0(), O02, new b(interfaceC0933e, this, m10, aVar)), Boolean.TRUE);
    }

    private final AbstractC5197E k(AbstractC5197E abstractC5197E, Xc.a aVar) {
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        if (d10 instanceof f0) {
            return k(this.f11873d.c((f0) d10, aVar.j(true)), aVar);
        }
        if (!(d10 instanceof InterfaceC0933e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + d10).toString());
        }
        InterfaceC0936h d11 = AbstractC5194B.d(abstractC5197E).W0().d();
        if (d11 instanceof InterfaceC0933e) {
            Pair j10 = j(AbstractC5194B.c(abstractC5197E), (InterfaceC0933e) d10, f11870f);
            M m10 = (M) j10.getFirst();
            boolean booleanValue = ((Boolean) j10.getSecond()).booleanValue();
            Pair j11 = j(AbstractC5194B.d(abstractC5197E), (InterfaceC0933e) d11, f11871g);
            M m11 = (M) j11.getFirst();
            return (booleanValue || ((Boolean) j11.getSecond()).booleanValue()) ? new h(m10, m11) : C5198F.d(m10, m11);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + d11 + "\" while for lower it's \"" + d10 + '\"').toString());
    }

    static /* synthetic */ AbstractC5197E l(g gVar, AbstractC5197E abstractC5197E, Xc.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new Xc.a(p0.COMMON, null, false, false, null, null, 62, null);
        }
        return gVar.k(abstractC5197E, aVar);
    }

    @Override // yd.l0
    public boolean f() {
        return false;
    }

    @Override // yd.l0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public k0 e(AbstractC5197E key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new k0(l(this, key, null, 2, null));
    }

    public /* synthetic */ g(h0 h0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : h0Var);
    }
}
