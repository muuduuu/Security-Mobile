package kd;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import xc.C5142C;
import yd.AbstractC5197E;
import yd.d0;
import yd.e0;

/* loaded from: classes3.dex */
public final class m implements kotlin.reflect.jvm.internal.impl.types.checker.b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f36312a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a f36313b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.g f36314c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.f f36315d;

    /* renamed from: e, reason: collision with root package name */
    private final Function2 f36316e;

    public static final class a extends d0 {

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ m f36317k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, boolean z11, m mVar, kotlin.reflect.jvm.internal.impl.types.checker.f fVar, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            super(z10, z11, true, mVar, fVar, gVar);
            this.f36317k = mVar;
        }

        @Override // yd.d0
        public boolean f(Ad.i subType, Ad.i superType) {
            Intrinsics.checkNotNullParameter(subType, "subType");
            Intrinsics.checkNotNullParameter(superType, "superType");
            if (!(subType instanceof AbstractC5197E)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (superType instanceof AbstractC5197E) {
                return ((Boolean) this.f36317k.f36316e.invoke(subType, superType)).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public m(Map map, e.a equalityAxioms, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypePreparator, Function2 function2) {
        Intrinsics.checkNotNullParameter(equalityAxioms, "equalityAxioms");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        this.f36312a = map;
        this.f36313b = equalityAxioms;
        this.f36314c = kotlinTypeRefiner;
        this.f36315d = kotlinTypePreparator;
        this.f36316e = function2;
    }

    private final boolean G0(e0 e0Var, e0 e0Var2) {
        if (this.f36313b.a(e0Var, e0Var2)) {
            return true;
        }
        Map map = this.f36312a;
        if (map == null) {
            return false;
        }
        e0 e0Var3 = (e0) map.get(e0Var);
        e0 e0Var4 = (e0) this.f36312a.get(e0Var2);
        if (e0Var3 == null || !Intrinsics.b(e0Var3, e0Var2)) {
            return e0Var4 != null && Intrinsics.b(e0Var4, e0Var);
        }
        return true;
    }

    @Override // Ad.o
    public boolean A(Ad.n nVar, Ad.m mVar) {
        return b.a.B(this, nVar, mVar);
    }

    @Override // Ad.o
    public boolean A0(Ad.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return (iVar instanceof Ad.j) && u((Ad.j) iVar);
    }

    @Override // Ad.o
    public boolean B(Ad.m mVar) {
        return b.a.G(this, mVar);
    }

    @Override // Ad.o
    public int B0(Ad.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar instanceof Ad.j) {
            return s0((Ad.i) kVar);
        }
        if (kVar instanceof Ad.a) {
            return ((Ad.a) kVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + kVar + ", " + C5142C.b(kVar.getClass())).toString());
    }

    @Override // Ad.o
    public boolean C(Ad.m mVar) {
        return b.a.L(this, mVar);
    }

    @Override // Ad.o
    public Ad.n C0(Ad.m mVar) {
        return b.a.v(this, mVar);
    }

    @Override // Ad.o
    public List D(Ad.i iVar) {
        return b.a.n(this, iVar);
    }

    @Override // Ad.o
    public Ad.i D0(Ad.i iVar) {
        return b.a.d0(this, iVar);
    }

    @Override // Ad.o
    public boolean E(Ad.l lVar) {
        return b.a.W(this, lVar);
    }

    @Override // Ad.o
    public Ad.j E0(Ad.e eVar) {
        return b.a.f0(this, eVar);
    }

    @Override // Ad.o
    public Ad.i F(List list) {
        return b.a.D(this, list);
    }

    @Override // Ad.r
    public boolean G(Ad.j jVar, Ad.j jVar2) {
        return b.a.C(this, jVar, jVar2);
    }

    @Override // Ad.o
    public boolean H(Ad.m mVar) {
        return b.a.K(this, mVar);
    }

    public d0 H0(boolean z10, boolean z11) {
        if (this.f36316e != null) {
            return new a(z10, z11, this, this.f36315d, this.f36314c);
        }
        return kotlin.reflect.jvm.internal.impl.types.checker.a.a(z10, z11, this, this.f36315d, this.f36314c);
    }

    @Override // Ad.o
    public Ad.l I(Ad.c cVar) {
        return b.a.i0(this, cVar);
    }

    @Override // yd.o0
    public Hc.h J(Ad.m mVar) {
        return b.a.s(this, mVar);
    }

    @Override // Ad.o
    public boolean K(Ad.i iVar) {
        return b.a.T(this, iVar);
    }

    @Override // Ad.o
    public boolean L(Ad.m mVar) {
        return b.a.O(this, mVar);
    }

    @Override // Ad.o
    public Ad.l M(Ad.j jVar, int i10) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (i10 < 0 || i10 >= s0(jVar)) {
            return null;
        }
        return s(jVar, i10);
    }

    @Override // Ad.o
    public boolean N(Ad.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Ad.j b10 = b(iVar);
        return (b10 != null ? Q(b10) : null) != null;
    }

    @Override // yd.o0
    public boolean O(Ad.i iVar, id.c cVar) {
        return b.a.A(this, iVar, cVar);
    }

    @Override // Ad.o
    public Ad.b P(Ad.d dVar) {
        return b.a.k(this, dVar);
    }

    @Override // Ad.o
    public Ad.e Q(Ad.j jVar) {
        return b.a.e(this, jVar);
    }

    @Override // Ad.o
    public boolean R(Ad.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Ad.j b10 = b(iVar);
        return (b10 != null ? a(b10) : null) != null;
    }

    @Override // Ad.o
    public List S(Ad.m mVar) {
        return b.a.q(this, mVar);
    }

    @Override // Ad.o
    public Ad.i T(Ad.d dVar) {
        return b.a.c0(this, dVar);
    }

    @Override // yd.o0
    public boolean U(Ad.m mVar) {
        return b.a.J(this, mVar);
    }

    @Override // Ad.o
    public Ad.j V(Ad.i iVar) {
        Ad.j g10;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Ad.g i10 = i(iVar);
        if (i10 != null && (g10 = g(i10)) != null) {
            return g10;
        }
        Ad.j b10 = b(iVar);
        Intrinsics.d(b10);
        return b10;
    }

    @Override // Ad.o
    public boolean W(Ad.j jVar) {
        return b.a.Y(this, jVar);
    }

    @Override // Ad.o
    public d0.c X(Ad.j jVar) {
        return b.a.j0(this, jVar);
    }

    @Override // yd.o0
    public Ad.i Y(Ad.n nVar) {
        return b.a.t(this, nVar);
    }

    @Override // Ad.o
    public boolean Z(Ad.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return L(e0(iVar)) && !z0(iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, Ad.o
    public Ad.d a(Ad.j jVar) {
        return b.a.d(this, jVar);
    }

    @Override // Ad.o
    public Ad.c a0(Ad.d dVar) {
        return b.a.l0(this, dVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, Ad.o
    public Ad.j b(Ad.i iVar) {
        return b.a.h(this, iVar);
    }

    @Override // Ad.o
    public boolean b0(Ad.i iVar) {
        return b.a.N(this, iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, Ad.o
    public Ad.j c(Ad.j jVar, boolean z10) {
        return b.a.p0(this, jVar, z10);
    }

    @Override // Ad.o
    public boolean c0(Ad.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Ad.g i10 = i(iVar);
        if (i10 == null) {
            return false;
        }
        u0(i10);
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, Ad.o
    public boolean d(Ad.j jVar) {
        return b.a.U(this, jVar);
    }

    @Override // Ad.o
    public Ad.l d0(Ad.k kVar, int i10) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar instanceof Ad.j) {
            return s((Ad.i) kVar, i10);
        }
        if (kVar instanceof Ad.a) {
            E e10 = ((Ad.a) kVar).get(i10);
            Intrinsics.checkNotNullExpressionValue(e10, "get(...)");
            return (Ad.l) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + kVar + ", " + C5142C.b(kVar.getClass())).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, Ad.o
    public Ad.m e(Ad.j jVar) {
        return b.a.m0(this, jVar);
    }

    @Override // Ad.o
    public Ad.m e0(Ad.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Ad.j b10 = b(iVar);
        if (b10 == null) {
            b10 = V(iVar);
        }
        return e(b10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, Ad.o
    public Ad.j f(Ad.g gVar) {
        return b.a.n0(this, gVar);
    }

    @Override // Ad.o
    public boolean f0(Ad.j jVar) {
        return b.a.X(this, jVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b, Ad.o
    public Ad.j g(Ad.g gVar) {
        return b.a.b0(this, gVar);
    }

    @Override // yd.o0
    public Ad.i g0(Ad.i iVar) {
        Ad.j c10;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Ad.j b10 = b(iVar);
        return (b10 == null || (c10 = c(b10, true)) == null) ? iVar : c10;
    }

    @Override // Ad.o
    public Ad.s h(Ad.n nVar) {
        return b.a.z(this, nVar);
    }

    @Override // Ad.o
    public boolean h0(Ad.m c12, Ad.m c22) {
        Intrinsics.checkNotNullParameter(c12, "c1");
        Intrinsics.checkNotNullParameter(c22, "c2");
        if (!(c12 instanceof e0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c22 instanceof e0) {
            return b.a.a(this, c12, c22) || G0((e0) c12, (e0) c22);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // Ad.o
    public Ad.g i(Ad.i iVar) {
        return b.a.g(this, iVar);
    }

    @Override // Ad.o
    public List i0(Ad.n nVar) {
        return b.a.x(this, nVar);
    }

    @Override // Ad.o
    public Ad.n j(Ad.m mVar, int i10) {
        return b.a.p(this, mVar, i10);
    }

    @Override // Ad.o
    public Ad.k j0(Ad.j jVar) {
        return b.a.c(this, jVar);
    }

    @Override // Ad.o
    public boolean k(Ad.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return H(e(jVar));
    }

    @Override // Ad.o
    public List k0(Ad.j jVar, Ad.m constructor) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        return null;
    }

    @Override // Ad.o
    public boolean l(Ad.d dVar) {
        return b.a.S(this, dVar);
    }

    @Override // Ad.o
    public boolean l0(Ad.i iVar) {
        return b.a.I(this, iVar);
    }

    @Override // Ad.o
    public Collection m(Ad.j jVar) {
        return b.a.h0(this, jVar);
    }

    @Override // Ad.o
    public boolean m0(Ad.m mVar) {
        return b.a.F(this, mVar);
    }

    @Override // Ad.o
    public boolean n(Ad.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return u(V(iVar)) != u(t0(iVar));
    }

    @Override // Ad.o
    public Ad.i n0(Ad.l lVar) {
        return b.a.u(this, lVar);
    }

    @Override // Ad.o
    public int o(Ad.m mVar) {
        return b.a.g0(this, mVar);
    }

    @Override // Ad.o
    public Ad.j o0(Ad.j jVar, Ad.b bVar) {
        return b.a.j(this, jVar, bVar);
    }

    @Override // Ad.o
    public boolean p(Ad.m mVar) {
        return b.a.H(this, mVar);
    }

    @Override // Ad.o
    public boolean p0(Ad.j jVar) {
        return b.a.R(this, jVar);
    }

    @Override // Ad.o
    public Collection q(Ad.m mVar) {
        return b.a.k0(this, mVar);
    }

    @Override // Ad.o
    public Ad.j q0(Ad.j jVar) {
        Ad.j E02;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Ad.e Q10 = Q(jVar);
        return (Q10 == null || (E02 = E0(Q10)) == null) ? jVar : E02;
    }

    @Override // Ad.o
    public boolean r(Ad.m mVar) {
        return b.a.E(this, mVar);
    }

    @Override // Ad.o
    public Ad.s r0(Ad.l lVar) {
        return b.a.y(this, lVar);
    }

    @Override // Ad.o
    public Ad.l s(Ad.i iVar, int i10) {
        return b.a.m(this, iVar, i10);
    }

    @Override // Ad.o
    public int s0(Ad.i iVar) {
        return b.a.b(this, iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.b
    public Ad.i t(Ad.j jVar, Ad.j jVar2) {
        return b.a.l(this, jVar, jVar2);
    }

    @Override // Ad.o
    public Ad.j t0(Ad.i iVar) {
        Ad.j f10;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Ad.g i10 = i(iVar);
        if (i10 != null && (f10 = f(i10)) != null) {
            return f10;
        }
        Ad.j b10 = b(iVar);
        Intrinsics.d(b10);
        return b10;
    }

    @Override // Ad.o
    public boolean u(Ad.j jVar) {
        return b.a.M(this, jVar);
    }

    @Override // Ad.o
    public Ad.f u0(Ad.g gVar) {
        b.a.f(this, gVar);
        return null;
    }

    @Override // yd.o0
    public Hc.h v(Ad.m mVar) {
        return b.a.r(this, mVar);
    }

    @Override // Ad.o
    public Ad.i v0(Ad.i iVar, boolean z10) {
        return b.a.o0(this, iVar, z10);
    }

    @Override // yd.o0
    public Ad.i w(Ad.i iVar) {
        return b.a.w(this, iVar);
    }

    @Override // Ad.o
    public boolean w0(Ad.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return m0(e(jVar));
    }

    @Override // yd.o0
    public id.d x(Ad.m mVar) {
        return b.a.o(this, mVar);
    }

    @Override // Ad.o
    public boolean x0(Ad.i iVar) {
        return b.a.Z(this, iVar);
    }

    @Override // Ad.o
    public boolean y(Ad.d dVar) {
        return b.a.Q(this, dVar);
    }

    @Override // yd.o0
    public boolean y0(Ad.m mVar) {
        return b.a.a0(this, mVar);
    }

    @Override // Ad.o
    public Ad.l z(Ad.i iVar) {
        return b.a.i(this, iVar);
    }

    @Override // Ad.o
    public boolean z0(Ad.i iVar) {
        return b.a.P(this, iVar);
    }
}
