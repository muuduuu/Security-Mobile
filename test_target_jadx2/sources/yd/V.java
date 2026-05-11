package yd;

import Kc.InterfaceC0936h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rd.h;
import yd.X;

/* loaded from: classes3.dex */
public final class V {

    /* renamed from: c, reason: collision with root package name */
    public static final a f45466c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final V f45467d = new V(X.a.f45475a, false);

    /* renamed from: a, reason: collision with root package name */
    private final X f45468a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f45469b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(int i10, Kc.e0 e0Var) {
            if (i10 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + e0Var.getName());
        }

        private a() {
        }
    }

    public V(X reportStrategy, boolean z10) {
        Intrinsics.checkNotNullParameter(reportStrategy, "reportStrategy");
        this.f45468a = reportStrategy;
        this.f45469b = z10;
    }

    private final void a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) it.next()).e());
        }
        Iterator it2 = gVar2.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) it2.next();
            if (hashSet.contains(cVar.e())) {
                this.f45468a.c(cVar);
            }
        }
    }

    private final void b(AbstractC5197E abstractC5197E, AbstractC5197E abstractC5197E2) {
        n0 f10 = n0.f(abstractC5197E2);
        Intrinsics.checkNotNullExpressionValue(f10, "create(...)");
        int i10 = 0;
        for (Object obj : abstractC5197E2.U0()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.t();
            }
            i0 i0Var = (i0) obj;
            if (!i0Var.c()) {
                AbstractC5197E type = i0Var.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                if (!Bd.a.d(type)) {
                    i0 i0Var2 = (i0) abstractC5197E.U0().get(i10);
                    Kc.f0 f0Var = (Kc.f0) abstractC5197E.W0().c().get(i10);
                    if (this.f45469b) {
                        X x10 = this.f45468a;
                        AbstractC5197E type2 = i0Var2.getType();
                        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                        AbstractC5197E type3 = i0Var.getType();
                        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                        Intrinsics.d(f0Var);
                        x10.a(f10, type2, type3, f0Var);
                    }
                }
            }
            i10 = i11;
        }
    }

    private final M c(M m10, a0 a0Var) {
        return G.a(m10) ? m10 : m0.f(m10, null, g(m10, a0Var), 1, null);
    }

    private final M d(M m10, AbstractC5197E abstractC5197E) {
        M r10 = q0.r(m10, abstractC5197E.X0());
        Intrinsics.checkNotNullExpressionValue(r10, "makeNullableIfNeeded(...)");
        return r10;
    }

    private final M e(M m10, AbstractC5197E abstractC5197E) {
        return c(d(m10, abstractC5197E), abstractC5197E.V0());
    }

    private final M f(W w10, a0 a0Var, boolean z10) {
        e0 r10 = w10.b().r();
        Intrinsics.checkNotNullExpressionValue(r10, "getTypeConstructor(...)");
        return C5198F.k(a0Var, r10, w10.a(), z10, h.b.f40647b);
    }

    private final a0 g(AbstractC5197E abstractC5197E, a0 a0Var) {
        return G.a(abstractC5197E) ? abstractC5197E.V0() : a0Var.r(abstractC5197E.V0());
    }

    private final i0 i(i0 i0Var, W w10, int i10) {
        t0 Z02 = i0Var.getType().Z0();
        if (AbstractC5218u.a(Z02)) {
            return i0Var;
        }
        M a10 = m0.a(Z02);
        if (G.a(a10) || !Bd.a.z(a10)) {
            return i0Var;
        }
        e0 W02 = a10.W0();
        InterfaceC0936h d10 = W02.d();
        W02.c().size();
        a10.U0().size();
        if (d10 instanceof Kc.f0) {
            return i0Var;
        }
        if (!(d10 instanceof Kc.e0)) {
            M l10 = l(a10, w10, i10);
            b(a10, l10);
            return new k0(i0Var.a(), l10);
        }
        Kc.e0 e0Var = (Kc.e0) d10;
        if (w10.d(e0Var)) {
            this.f45468a.b(e0Var);
            u0 u0Var = u0.INVARIANT;
            kotlin.reflect.jvm.internal.impl.types.error.j jVar = kotlin.reflect.jvm.internal.impl.types.error.j.RECURSIVE_TYPE_ALIAS;
            String fVar = e0Var.getName().toString();
            Intrinsics.checkNotNullExpressionValue(fVar, "toString(...)");
            return new k0(u0Var, kotlin.reflect.jvm.internal.impl.types.error.k.d(jVar, fVar));
        }
        List U02 = a10.U0();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(U02, 10));
        int i11 = 0;
        for (Object obj : U02) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.t();
            }
            arrayList.add(k((i0) obj, w10, (Kc.f0) W02.c().get(i11), i10 + 1));
            i11 = i12;
        }
        M j10 = j(W.f45470e.a(w10, e0Var, arrayList), a10.V0(), a10.X0(), i10 + 1, false);
        M l11 = l(a10, w10, i10);
        if (!AbstractC5218u.a(j10)) {
            j10 = Q.j(j10, l11);
        }
        return new k0(i0Var.a(), j10);
    }

    private final M j(W w10, a0 a0Var, boolean z10, int i10, boolean z11) {
        i0 k10 = k(new k0(u0.INVARIANT, w10.b().m0()), w10, null, i10);
        AbstractC5197E type = k10.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        M a10 = m0.a(type);
        if (G.a(a10)) {
            return a10;
        }
        k10.a();
        a(a10.i(), AbstractC5208j.a(a0Var));
        M r10 = q0.r(c(a10, a0Var), z10);
        Intrinsics.checkNotNullExpressionValue(r10, "let(...)");
        return z11 ? Q.j(r10, f(w10, a0Var, z10)) : r10;
    }

    private final i0 k(i0 i0Var, W w10, Kc.f0 f0Var, int i10) {
        u0 u0Var;
        u0 u0Var2;
        u0 u0Var3;
        f45466c.b(i10, w10.b());
        if (i0Var.c()) {
            Intrinsics.d(f0Var);
            i0 s10 = q0.s(f0Var);
            Intrinsics.checkNotNullExpressionValue(s10, "makeStarProjection(...)");
            return s10;
        }
        AbstractC5197E type = i0Var.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        i0 c10 = w10.c(type.W0());
        if (c10 == null) {
            return i(i0Var, w10, i10);
        }
        if (c10.c()) {
            Intrinsics.d(f0Var);
            i0 s11 = q0.s(f0Var);
            Intrinsics.checkNotNullExpressionValue(s11, "makeStarProjection(...)");
            return s11;
        }
        t0 Z02 = c10.getType().Z0();
        u0 a10 = c10.a();
        Intrinsics.checkNotNullExpressionValue(a10, "getProjectionKind(...)");
        u0 a11 = i0Var.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getProjectionKind(...)");
        if (a11 != a10 && a11 != (u0Var3 = u0.INVARIANT)) {
            if (a10 == u0Var3) {
                a10 = a11;
            } else {
                this.f45468a.d(w10.b(), f0Var, Z02);
            }
        }
        if (f0Var == null || (u0Var = f0Var.u()) == null) {
            u0Var = u0.INVARIANT;
        }
        Intrinsics.d(u0Var);
        if (u0Var != a10 && u0Var != (u0Var2 = u0.INVARIANT)) {
            if (a10 == u0Var2) {
                a10 = u0Var2;
            } else {
                this.f45468a.d(w10.b(), f0Var, Z02);
            }
        }
        a(type.i(), Z02.i());
        return new k0(a10, e(m0.a(Z02), type));
    }

    private final M l(M m10, W w10, int i10) {
        e0 W02 = m10.W0();
        List U02 = m10.U0();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(U02, 10));
        int i11 = 0;
        for (Object obj : U02) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.t();
            }
            i0 i0Var = (i0) obj;
            i0 k10 = k(i0Var, w10, (Kc.f0) W02.c().get(i11), i10 + 1);
            if (!k10.c()) {
                k10 = new k0(k10.a(), q0.q(k10.getType(), i0Var.getType().X0()));
            }
            arrayList.add(k10);
            i11 = i12;
        }
        return m0.f(m10, arrayList, null, 2, null);
    }

    public final M h(W typeAliasExpansion, a0 attributes) {
        Intrinsics.checkNotNullParameter(typeAliasExpansion, "typeAliasExpansion");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return j(typeAliasExpansion, attributes, false, 0, true);
    }
}
