package Kc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import od.AbstractC3778c;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public abstract class g0 {

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5566a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC0941m it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof InterfaceC0929a);
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5567a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC0941m it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!(it instanceof InterfaceC0940l));
        }
    }

    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f5568a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Sequence invoke(InterfaceC0941m it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List n10 = ((InterfaceC0929a) it).n();
            Intrinsics.checkNotNullExpressionValue(n10, "getTypeParameters(...)");
            return CollectionsKt.T(n10);
        }
    }

    public static final S a(AbstractC5197E abstractC5197E) {
        Intrinsics.checkNotNullParameter(abstractC5197E, "<this>");
        InterfaceC0936h d10 = abstractC5197E.W0().d();
        return b(abstractC5197E, d10 instanceof InterfaceC0937i ? (InterfaceC0937i) d10 : null, 0);
    }

    private static final S b(AbstractC5197E abstractC5197E, InterfaceC0937i interfaceC0937i, int i10) {
        if (interfaceC0937i == null || kotlin.reflect.jvm.internal.impl.types.error.k.m(interfaceC0937i)) {
            return null;
        }
        int size = interfaceC0937i.B().size() + i10;
        if (interfaceC0937i.S()) {
            List subList = abstractC5197E.U0().subList(i10, size);
            InterfaceC0941m b10 = interfaceC0937i.b();
            return new S(interfaceC0937i, subList, b(abstractC5197E, b10 instanceof InterfaceC0937i ? (InterfaceC0937i) b10 : null, size));
        }
        if (size != abstractC5197E.U0().size()) {
            kd.f.E(interfaceC0937i);
        }
        return new S(interfaceC0937i, abstractC5197E.U0().subList(i10, abstractC5197E.U0().size()), null);
    }

    private static final C0931c c(f0 f0Var, InterfaceC0941m interfaceC0941m, int i10) {
        return new C0931c(f0Var, interfaceC0941m, i10);
    }

    public static final List d(InterfaceC0937i interfaceC0937i) {
        List list;
        Object obj;
        yd.e0 r10;
        Intrinsics.checkNotNullParameter(interfaceC0937i, "<this>");
        List B10 = interfaceC0937i.B();
        Intrinsics.checkNotNullExpressionValue(B10, "getDeclaredTypeParameters(...)");
        if (!interfaceC0937i.S() && !(interfaceC0937i.b() instanceof InterfaceC0929a)) {
            return B10;
        }
        List C10 = kotlin.sequences.j.C(kotlin.sequences.j.r(kotlin.sequences.j.n(kotlin.sequences.j.A(AbstractC3778c.r(interfaceC0937i), a.f5566a), b.f5567a), c.f5568a));
        Iterator it = AbstractC3778c.r(interfaceC0937i).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof InterfaceC0933e) {
                break;
            }
        }
        InterfaceC0933e interfaceC0933e = (InterfaceC0933e) obj;
        if (interfaceC0933e != null && (r10 = interfaceC0933e.r()) != null) {
            list = r10.c();
        }
        if (list == null) {
            list = CollectionsKt.j();
        }
        if (C10.isEmpty() && list.isEmpty()) {
            List B11 = interfaceC0937i.B();
            Intrinsics.checkNotNullExpressionValue(B11, "getDeclaredTypeParameters(...)");
            return B11;
        }
        List<f0> w02 = CollectionsKt.w0(C10, list);
        ArrayList arrayList = new ArrayList(CollectionsKt.u(w02, 10));
        for (f0 f0Var : w02) {
            Intrinsics.d(f0Var);
            arrayList.add(c(f0Var, interfaceC0937i, B10.size()));
        }
        return CollectionsKt.w0(B10, arrayList);
    }
}
