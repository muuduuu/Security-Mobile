package Xc;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import xc.m;
import yd.AbstractC5197E;
import yd.AbstractC5222y;
import yd.L;
import yd.M;
import yd.a0;
import yd.h0;
import yd.i0;

/* loaded from: classes3.dex */
public final class h extends AbstractC5222y implements L {

    static final class a extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11878a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return "(raw) " + it;
        }
    }

    private h(M m10, M m11, boolean z10) {
        super(m10, m11);
        if (z10) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.types.checker.e.f36672a.c(m10, m11);
    }

    private static final boolean j1(String str, String str2) {
        return Intrinsics.b(str, StringsKt.o0(str2, "out ")) || Intrinsics.b(str2, "*");
    }

    private static final List k1(kotlin.reflect.jvm.internal.impl.renderer.c cVar, AbstractC5197E abstractC5197E) {
        List U02 = abstractC5197E.U0();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(U02, 10));
        Iterator it = U02.iterator();
        while (it.hasNext()) {
            arrayList.add(cVar.x((i0) it.next()));
        }
        return arrayList;
    }

    private static final String l1(String str, String str2) {
        if (!StringsKt.J(str, '<', false, 2, null)) {
            return str;
        }
        return StringsKt.P0(str, '<', null, 2, null) + '<' + str2 + '>' + StringsKt.L0(str, '>', null, 2, null);
    }

    @Override // yd.AbstractC5222y
    public M d1() {
        return e1();
    }

    @Override // yd.AbstractC5222y
    public String g1(kotlin.reflect.jvm.internal.impl.renderer.c renderer, kotlin.reflect.jvm.internal.impl.renderer.f options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        String w10 = renderer.w(e1());
        String w11 = renderer.w(f1());
        if (options.n()) {
            return "raw (" + w10 + ".." + w11 + ')';
        }
        if (f1().U0().isEmpty()) {
            return renderer.t(w10, w11, Bd.a.i(this));
        }
        List k12 = k1(renderer, e1());
        List k13 = k1(renderer, f1());
        List list = k12;
        String l02 = CollectionsKt.l0(list, ", ", null, null, 0, null, a.f11878a, 30, null);
        List<Pair> V02 = CollectionsKt.V0(list, k13);
        if (!(V02 instanceof Collection) || !V02.isEmpty()) {
            for (Pair pair : V02) {
                if (!j1((String) pair.c(), (String) pair.d())) {
                    break;
                }
            }
        }
        w11 = l1(w11, l02);
        String l12 = l1(w10, l02);
        return Intrinsics.b(l12, w11) ? l12 : renderer.t(l12, w11, Bd.a.i(this));
    }

    @Override // yd.t0
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public h a1(boolean z10) {
        return new h(e1().a1(z10), f1().a1(z10));
    }

    @Override // yd.t0
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public AbstractC5222y g1(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC5197E a10 = kotlinTypeRefiner.a(e1());
        Intrinsics.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC5197E a11 = kotlinTypeRefiner.a(f1());
        Intrinsics.e(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new h((M) a10, (M) a11, true);
    }

    @Override // yd.t0
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public h c1(a0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new h(e1().c1(newAttributes), f1().c1(newAttributes));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yd.AbstractC5222y, yd.AbstractC5197E
    public rd.h w() {
        InterfaceC0936h d10 = W0().d();
        h0 h0Var = null;
        Object[] objArr = 0;
        InterfaceC0933e interfaceC0933e = d10 instanceof InterfaceC0933e ? (InterfaceC0933e) d10 : null;
        if (interfaceC0933e != null) {
            rd.h O02 = interfaceC0933e.O0(new g(h0Var, 1, objArr == true ? 1 : 0));
            Intrinsics.checkNotNullExpressionValue(O02, "getMemberScope(...)");
            return O02;
        }
        throw new IllegalStateException(("Incorrect classifier: " + W0().d()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(M lowerBound, M upperBound) {
        this(lowerBound, upperBound, false);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }
}
