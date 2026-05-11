package Xc;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.f0;
import Sc.J;
import Vc.k;
import Zc.A;
import Zc.C;
import Zc.i;
import Zc.j;
import Zc.v;
import Zc.x;
import Zc.y;
import id.C3367b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xc.m;
import yd.AbstractC5197E;
import yd.C5198F;
import yd.H;
import yd.M;
import yd.a0;
import yd.b0;
import yd.e0;
import yd.h0;
import yd.i0;
import yd.k0;
import yd.p0;
import yd.q0;
import yd.u0;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Vc.g f11858a;

    /* renamed from: b, reason: collision with root package name */
    private final k f11859b;

    /* renamed from: c, reason: collision with root package name */
    private final f f11860c;

    /* renamed from: d, reason: collision with root package name */
    private final h0 f11861d;

    static final class a extends m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f11863b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Xc.a f11864c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e0 f11865d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j f11866e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var, Xc.a aVar, e0 e0Var, j jVar) {
            super(0);
            this.f11863b = f0Var;
            this.f11864c = aVar;
            this.f11865d = e0Var;
            this.f11866e = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke() {
            h0 h0Var = d.this.f11861d;
            f0 f0Var = this.f11863b;
            Xc.a aVar = this.f11864c;
            InterfaceC0936h d10 = this.f11865d.d();
            return h0Var.c(f0Var, aVar.k(d10 != null ? d10.y() : null).j(this.f11866e.D()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(Vc.g c10, k typeParameterResolver) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        this.f11858a = c10;
        this.f11859b = typeParameterResolver;
        f fVar = new f();
        this.f11860c = fVar;
        this.f11861d = new h0(fVar, null, 2, 0 == true ? 1 : 0);
    }

    private final boolean b(j jVar, InterfaceC0933e interfaceC0933e) {
        u0 u10;
        if (!A.a((x) CollectionsKt.p0(jVar.L()))) {
            return false;
        }
        List c10 = Jc.d.f4910a.b(interfaceC0933e).r().c();
        Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
        f0 f0Var = (f0) CollectionsKt.p0(c10);
        return (f0Var == null || (u10 = f0Var.u()) == null || u10 == u0.OUT_VARIANCE) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r0.isEmpty() == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List c(j jVar, Xc.a aVar, e0 e0Var) {
        boolean z10;
        if (!jVar.D()) {
            if (jVar.L().isEmpty()) {
                List c10 = e0Var.c();
                Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
            }
            z10 = false;
            List c11 = e0Var.c();
            Intrinsics.checkNotNullExpressionValue(c11, "getParameters(...)");
            if (!z10) {
                return d(jVar, c11, e0Var, aVar);
            }
            if (c11.size() != jVar.L().size()) {
                List<f0> list = c11;
                ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
                for (f0 f0Var : list) {
                    kotlin.reflect.jvm.internal.impl.types.error.j jVar2 = kotlin.reflect.jvm.internal.impl.types.error.j.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                    String c12 = f0Var.getName().c();
                    Intrinsics.checkNotNullExpressionValue(c12, "asString(...)");
                    arrayList.add(new k0(kotlin.reflect.jvm.internal.impl.types.error.k.d(jVar2, c12)));
                }
                return CollectionsKt.O0(arrayList);
            }
            Iterable<IndexedValue> U02 = CollectionsKt.U0(jVar.L());
            ArrayList arrayList2 = new ArrayList(CollectionsKt.u(U02, 10));
            for (IndexedValue indexedValue : U02) {
                int index = indexedValue.getIndex();
                x xVar = (x) indexedValue.getValue();
                c11.size();
                f0 f0Var2 = (f0) c11.get(index);
                Xc.a b10 = b.b(p0.COMMON, false, false, null, 7, null);
                Intrinsics.d(f0Var2);
                arrayList2.add(p(xVar, b10, f0Var2));
            }
            return CollectionsKt.O0(arrayList2);
        }
        z10 = true;
        List c112 = e0Var.c();
        Intrinsics.checkNotNullExpressionValue(c112, "getParameters(...)");
        if (!z10) {
        }
    }

    private final List d(j jVar, List list, e0 e0Var, Xc.a aVar) {
        List<f0> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        for (f0 f0Var : list2) {
            arrayList.add(Bd.a.l(f0Var, null, aVar.c()) ? q0.t(f0Var, aVar) : this.f11860c.a(f0Var, aVar.j(jVar.D()), this.f11861d, new H(this.f11858a.e(), new a(f0Var, aVar, e0Var, jVar))));
        }
        return arrayList;
    }

    private final M e(j jVar, Xc.a aVar, M m10) {
        a0 b10;
        if (m10 == null || (b10 = m10.V0()) == null) {
            b10 = b0.b(new Vc.d(this.f11858a, jVar, false, 4, null));
        }
        a0 a0Var = b10;
        e0 f10 = f(jVar, aVar);
        if (f10 == null) {
            return null;
        }
        boolean i10 = i(aVar);
        return (Intrinsics.b(m10 != null ? m10.W0() : null, f10) && !jVar.D() && i10) ? m10.a1(true) : C5198F.j(a0Var, f10, c(jVar, aVar, f10), i10, null, 16, null);
    }

    private final e0 f(j jVar, Xc.a aVar) {
        e0 r10;
        i j10 = jVar.j();
        if (j10 == null) {
            return g(jVar);
        }
        if (!(j10 instanceof Zc.g)) {
            if (j10 instanceof y) {
                f0 a10 = this.f11859b.a((y) j10);
                if (a10 != null) {
                    return a10.r();
                }
                return null;
            }
            throw new IllegalStateException("Unknown classifier kind: " + j10);
        }
        Zc.g gVar = (Zc.g) j10;
        id.c e10 = gVar.e();
        if (e10 != null) {
            InterfaceC0933e j11 = j(jVar, aVar, e10);
            if (j11 == null) {
                j11 = this.f11858a.a().n().a(gVar);
            }
            return (j11 == null || (r10 = j11.r()) == null) ? g(jVar) : r10;
        }
        throw new AssertionError("Class type should have a FQ name: " + j10);
    }

    private final e0 g(j jVar) {
        C3367b m10 = C3367b.m(new id.c(jVar.E()));
        Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
        e0 r10 = this.f11858a.a().b().d().r().d(m10, CollectionsKt.e(0)).r();
        Intrinsics.checkNotNullExpressionValue(r10, "getTypeConstructor(...)");
        return r10;
    }

    private final boolean h(u0 u0Var, f0 f0Var) {
        return (f0Var.u() == u0.INVARIANT || u0Var == f0Var.u()) ? false : true;
    }

    private final boolean i(Xc.a aVar) {
        return (aVar.g() == c.FLEXIBLE_LOWER_BOUND || aVar.h() || aVar.b() == p0.SUPERTYPE) ? false : true;
    }

    private final InterfaceC0933e j(j jVar, Xc.a aVar, id.c cVar) {
        id.c cVar2;
        if (aVar.h()) {
            cVar2 = e.f11867a;
            if (Intrinsics.b(cVar, cVar2)) {
                return this.f11858a.a().p().c();
            }
        }
        Jc.d dVar = Jc.d.f4910a;
        InterfaceC0933e f10 = Jc.d.f(dVar, cVar, this.f11858a.d().v(), null, 4, null);
        if (f10 == null) {
            return null;
        }
        return (dVar.d(f10) && (aVar.g() == c.FLEXIBLE_LOWER_BOUND || aVar.b() == p0.SUPERTYPE || b(jVar, f10))) ? dVar.b(f10) : f10;
    }

    public static /* synthetic */ AbstractC5197E l(d dVar, Zc.f fVar, Xc.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return dVar.k(fVar, aVar, z10);
    }

    private final AbstractC5197E m(j jVar, Xc.a aVar) {
        boolean z10 = (aVar.h() || aVar.b() == p0.SUPERTYPE) ? false : true;
        boolean D10 = jVar.D();
        if (!D10 && !z10) {
            M e10 = e(jVar, aVar, null);
            return e10 != null ? e10 : n(jVar);
        }
        M e11 = e(jVar, aVar.l(c.FLEXIBLE_LOWER_BOUND), null);
        if (e11 == null) {
            return n(jVar);
        }
        M e12 = e(jVar, aVar.l(c.FLEXIBLE_UPPER_BOUND), e11);
        return e12 == null ? n(jVar) : D10 ? new h(e11, e12) : C5198F.d(e11, e12);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.error.h n(j jVar) {
        return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNRESOLVED_JAVA_CLASS, jVar.v());
    }

    private final i0 p(x xVar, Xc.a aVar, f0 f0Var) {
        i0 t10;
        if (!(xVar instanceof C)) {
            return new k0(u0.INVARIANT, o(xVar, aVar));
        }
        C c10 = (C) xVar;
        x H10 = c10.H();
        u0 u0Var = c10.Q() ? u0.OUT_VARIANCE : u0.IN_VARIANCE;
        if (H10 == null || h(u0Var, f0Var)) {
            t10 = q0.t(f0Var, aVar);
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a10 = J.a(this.f11858a, c10);
            AbstractC5197E o10 = o(H10, b.b(p0.COMMON, false, false, null, 7, null));
            if (a10 != null) {
                o10 = Bd.a.x(o10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.a(CollectionsKt.v0(o10.i(), a10)));
            }
            t10 = Bd.a.f(o10, u0Var, f0Var);
        }
        Intrinsics.d(t10);
        return t10;
    }

    public final AbstractC5197E k(Zc.f arrayType, Xc.a attr, boolean z10) {
        Intrinsics.checkNotNullParameter(arrayType, "arrayType");
        Intrinsics.checkNotNullParameter(attr, "attr");
        x t10 = arrayType.t();
        v vVar = t10 instanceof v ? (v) t10 : null;
        Hc.h type = vVar != null ? vVar.getType() : null;
        Vc.d dVar = new Vc.d(this.f11858a, arrayType, true);
        if (type != null) {
            M O10 = this.f11858a.d().v().O(type);
            Intrinsics.d(O10);
            AbstractC5197E x10 = Bd.a.x(O10, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k(O10.i(), dVar));
            Intrinsics.e(x10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            M m10 = (M) x10;
            return attr.h() ? m10 : C5198F.d(m10, m10.a1(true));
        }
        AbstractC5197E o10 = o(t10, b.b(p0.COMMON, attr.h(), false, null, 6, null));
        if (attr.h()) {
            M m11 = this.f11858a.d().v().m(z10 ? u0.OUT_VARIANCE : u0.INVARIANT, o10, dVar);
            Intrinsics.checkNotNullExpressionValue(m11, "getArrayType(...)");
            return m11;
        }
        M m12 = this.f11858a.d().v().m(u0.INVARIANT, o10, dVar);
        Intrinsics.checkNotNullExpressionValue(m12, "getArrayType(...)");
        return C5198F.d(m12, this.f11858a.d().v().m(u0.OUT_VARIANCE, o10, dVar).a1(true));
    }

    public final AbstractC5197E o(x xVar, Xc.a attr) {
        AbstractC5197E o10;
        Intrinsics.checkNotNullParameter(attr, "attr");
        if (xVar instanceof v) {
            Hc.h type = ((v) xVar).getType();
            M R10 = type != null ? this.f11858a.d().v().R(type) : this.f11858a.d().v().Z();
            Intrinsics.d(R10);
            return R10;
        }
        if (xVar instanceof j) {
            return m((j) xVar, attr);
        }
        if (xVar instanceof Zc.f) {
            return l(this, (Zc.f) xVar, attr, false, 4, null);
        }
        if (xVar instanceof C) {
            x H10 = ((C) xVar).H();
            if (H10 != null && (o10 = o(H10, attr)) != null) {
                return o10;
            }
            M y10 = this.f11858a.d().v().y();
            Intrinsics.checkNotNullExpressionValue(y10, "getDefaultBound(...)");
            return y10;
        }
        if (xVar == null) {
            M y11 = this.f11858a.d().v().y();
            Intrinsics.checkNotNullExpressionValue(y11, "getDefaultBound(...)");
            return y11;
        }
        throw new UnsupportedOperationException("Unsupported type: " + xVar);
    }
}
