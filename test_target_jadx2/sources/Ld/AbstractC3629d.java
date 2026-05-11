package ld;

import Kc.InterfaceC0936h;
import Kc.f0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xc.m;
import xd.f;
import xd.n;
import yd.AbstractC5197E;
import yd.AbstractC5214p;
import yd.C5195C;
import yd.H;
import yd.i0;
import yd.k0;
import yd.l0;
import yd.u0;

/* renamed from: ld.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3629d {

    /* renamed from: ld.d$a */
    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i0 f37157a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0 i0Var) {
            super(0);
            this.f37157a = i0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke() {
            AbstractC5197E type = this.f37157a.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return type;
        }
    }

    /* renamed from: ld.d$b */
    public static final class b extends AbstractC5214p {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37158d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l0 l0Var, boolean z10) {
            super(l0Var);
            this.f37158d = z10;
        }

        @Override // yd.l0
        public boolean b() {
            return this.f37158d;
        }

        @Override // yd.AbstractC5214p, yd.l0
        public i0 e(AbstractC5197E key) {
            Intrinsics.checkNotNullParameter(key, "key");
            i0 e10 = super.e(key);
            if (e10 == null) {
                return null;
            }
            InterfaceC0936h d10 = key.W0().d();
            return AbstractC3629d.b(e10, d10 instanceof f0 ? (f0) d10 : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b(i0 i0Var, f0 f0Var) {
        if (f0Var == null || i0Var.a() == u0.INVARIANT) {
            return i0Var;
        }
        if (f0Var.u() != i0Var.a()) {
            return new k0(c(i0Var));
        }
        if (!i0Var.c()) {
            return new k0(i0Var.getType());
        }
        n NO_LOCKS = f.f45006e;
        Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
        return new k0(new H(NO_LOCKS, new a(i0Var)));
    }

    public static final AbstractC5197E c(i0 typeProjection) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        return new C3626a(typeProjection, null, false, null, 14, null);
    }

    public static final boolean d(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        return abstractC5197E.W0() instanceof InterfaceC3627b;
    }

    public static final l0 e(l0 l0Var, boolean z10) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        if (!(l0Var instanceof C5195C)) {
            return new b(l0Var, z10);
        }
        C5195C c5195c = (C5195C) l0Var;
        f0[] j10 = c5195c.j();
        List<Pair> C02 = AbstractC3574i.C0(c5195c.i(), c5195c.j());
        ArrayList arrayList = new ArrayList(CollectionsKt.u(C02, 10));
        for (Pair pair : C02) {
            arrayList.add(b((i0) pair.c(), (f0) pair.d()));
        }
        return new C5195C(j10, (i0[]) arrayList.toArray(new i0[0]), z10);
    }

    public static /* synthetic */ l0 f(l0 l0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return e(l0Var, z10);
    }
}
