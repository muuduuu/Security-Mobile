package ad;

import Kc.InterfaceC0936h;
import Kc.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5194B;
import yd.AbstractC5197E;
import yd.AbstractC5222y;
import yd.C5198F;
import yd.G;
import yd.L;
import yd.M;
import yd.Q;
import yd.a0;
import yd.b0;
import yd.e0;
import yd.i0;
import yd.q0;
import yd.s0;
import yd.t0;
import yd.u0;

/* renamed from: ad.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1377d {

    /* renamed from: a, reason: collision with root package name */
    private final Vc.c f12662a;

    /* renamed from: ad.d$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5197E f12663a;

        /* renamed from: b, reason: collision with root package name */
        private final int f12664b;

        public a(AbstractC5197E abstractC5197E, int i10) {
            this.f12663a = abstractC5197E;
            this.f12664b = i10;
        }

        public final int a() {
            return this.f12664b;
        }

        public final AbstractC5197E b() {
            return this.f12663a;
        }
    }

    /* renamed from: ad.d$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final M f12665a;

        /* renamed from: b, reason: collision with root package name */
        private final int f12666b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f12667c;

        public b(M m10, int i10, boolean z10) {
            this.f12665a = m10;
            this.f12666b = i10;
            this.f12667c = z10;
        }

        public final boolean a() {
            return this.f12667c;
        }

        public final int b() {
            return this.f12666b;
        }

        public final M c() {
            return this.f12665a;
        }
    }

    public C1377d(Vc.c javaResolverSettings) {
        Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
        this.f12662a = javaResolverSettings;
    }

    private final b b(M m10, Function1 function1, int i10, EnumC1390o enumC1390o, boolean z10, boolean z11) {
        InterfaceC0936h f10;
        Boolean h10;
        e0 W02;
        C1376c c1376c;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g e10;
        boolean z12;
        a aVar;
        i0 s10;
        Function1 function12 = function1;
        boolean a10 = AbstractC1391p.a(enumC1390o);
        boolean z13 = (z11 && z10) ? false : true;
        AbstractC5197E abstractC5197E = null;
        if (!a10 && m10.U0().isEmpty()) {
            return new b(null, 1, false);
        }
        InterfaceC0936h d10 = m10.W0().d();
        if (d10 == null) {
            return new b(null, 1, false);
        }
        C1378e c1378e = (C1378e) function12.invoke(Integer.valueOf(i10));
        f10 = AbstractC1393r.f(d10, c1378e, enumC1390o);
        h10 = AbstractC1393r.h(c1378e, enumC1390o);
        if (f10 == null || (W02 = f10.r()) == null) {
            W02 = m10.W0();
        }
        e0 e0Var = W02;
        Intrinsics.d(e0Var);
        int i11 = i10 + 1;
        List U02 = m10.U0();
        List c10 = e0Var.c();
        Intrinsics.checkNotNullExpressionValue(c10, "getParameters(...)");
        List list = c10;
        Iterator it = U02.iterator();
        Iterator it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.u(U02, 10), CollectionsKt.u(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            f0 f0Var = (f0) it2.next();
            i0 i0Var = (i0) next;
            if (z13) {
                z12 = z13;
                if (!i0Var.c()) {
                    aVar = d(i0Var.getType().Z0(), function12, i11, z11);
                } else if (((C1378e) function12.invoke(Integer.valueOf(i11))).d() == EnumC1381h.FORCE_FLEXIBILITY) {
                    t0 Z02 = i0Var.getType().Z0();
                    aVar = new a(C5198F.d(AbstractC5194B.c(Z02).a1(false), AbstractC5194B.d(Z02).a1(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            } else {
                z12 = z13;
                aVar = new a(abstractC5197E, 0);
            }
            i11 += aVar.a();
            if (aVar.b() != null) {
                AbstractC5197E b10 = aVar.b();
                u0 a11 = i0Var.a();
                Intrinsics.checkNotNullExpressionValue(a11, "getProjectionKind(...)");
                s10 = Bd.a.f(b10, a11, f0Var);
            } else if (f10 == null || i0Var.c()) {
                s10 = f10 != null ? q0.s(f0Var) : null;
            } else {
                AbstractC5197E type = i0Var.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                u0 a12 = i0Var.a();
                Intrinsics.checkNotNullExpressionValue(a12, "getProjectionKind(...)");
                s10 = Bd.a.f(type, a12, f0Var);
            }
            arrayList.add(s10);
            function12 = function1;
            z13 = z12;
            abstractC5197E = null;
        }
        int i12 = i11 - i10;
        if (f10 == null && h10 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((i0) it3.next()) == null) {
                    }
                }
            }
            return new b(null, i12, false);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i13 = m10.i();
        c1376c = AbstractC1393r.f12737b;
        if (f10 == null) {
            c1376c = null;
        }
        boolean z14 = false;
        e10 = AbstractC1393r.e(CollectionsKt.o(i13, c1376c, h10 != null ? AbstractC1393r.g() : null));
        a0 b11 = b0.b(e10);
        List U03 = m10.U0();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = U03.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt.u(arrayList, 10), CollectionsKt.u(U03, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            i0 i0Var2 = (i0) it5.next();
            i0 i0Var3 = (i0) next2;
            if (i0Var3 != null) {
                i0Var2 = i0Var3;
            }
            arrayList2.add(i0Var2);
        }
        M j10 = C5198F.j(b11, e0Var, arrayList2, h10 != null ? h10.booleanValue() : m10.X0(), null, 16, null);
        if (c1378e.b()) {
            j10 = e(j10);
        }
        if (h10 != null && c1378e.e()) {
            z14 = true;
        }
        return new b(j10, i12, z14);
    }

    static /* synthetic */ b c(C1377d c1377d, M m10, Function1 function1, int i10, EnumC1390o enumC1390o, boolean z10, boolean z11, int i11, Object obj) {
        return c1377d.b(m10, function1, i10, enumC1390o, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
    
        if (r13 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final a d(t0 t0Var, Function1 function1, int i10, boolean z10) {
        AbstractC5197E c10;
        AbstractC5197E abstractC5197E = null;
        if (G.a(t0Var)) {
            return new a(null, 1);
        }
        if (!(t0Var instanceof AbstractC5222y)) {
            if (!(t0Var instanceof M)) {
                throw new lc.m();
            }
            b c11 = c(this, (M) t0Var, function1, i10, EnumC1390o.INFLEXIBLE, false, z10, 8, null);
            return new a(c11.a() ? s0.d(t0Var, c11.c()) : c11.c(), c11.b());
        }
        boolean z11 = t0Var instanceof L;
        AbstractC5222y abstractC5222y = (AbstractC5222y) t0Var;
        b b10 = b(abstractC5222y.e1(), function1, i10, EnumC1390o.FLEXIBLE_LOWER, z11, z10);
        b b11 = b(abstractC5222y.f1(), function1, i10, EnumC1390o.FLEXIBLE_UPPER, z11, z10);
        b10.b();
        b11.b();
        if (b10.c() != null || b11.c() != null) {
            if (b10.a() || b11.a()) {
                M c12 = b11.c();
                if (c12 != null) {
                    M c13 = b10.c();
                    if (c13 == null) {
                        c13 = c12;
                    }
                    c10 = C5198F.d(c13, c12);
                }
                c10 = b10.c();
                Intrinsics.d(c10);
                abstractC5197E = s0.d(t0Var, c10);
            } else if (z11) {
                M c14 = b10.c();
                if (c14 == null) {
                    c14 = abstractC5222y.e1();
                }
                M c15 = b11.c();
                if (c15 == null) {
                    c15 = abstractC5222y.f1();
                }
                abstractC5197E = new Xc.h(c14, c15);
            } else {
                M c16 = b10.c();
                if (c16 == null) {
                    c16 = abstractC5222y.e1();
                }
                M c17 = b11.c();
                if (c17 == null) {
                    c17 = abstractC5222y.f1();
                }
                abstractC5197E = C5198F.d(c16, c17);
            }
        }
        return new a(abstractC5197E, b10.b());
    }

    private final M e(M m10) {
        return this.f12662a.a() ? Q.h(m10, true) : new C1380g(m10);
    }

    public final AbstractC5197E a(AbstractC5197E abstractC5197E, Function1 qualifiers, boolean z10) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        return d(abstractC5197E.Z0(), qualifiers, 0, z10).b();
    }
}
