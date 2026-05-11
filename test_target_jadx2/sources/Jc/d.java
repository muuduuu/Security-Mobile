package Jc;

import Kc.InterfaceC0933e;
import id.C3367b;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4910a = new d();

    private d() {
    }

    public static /* synthetic */ InterfaceC0933e f(d dVar, id.c cVar, Hc.g gVar, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, gVar, num);
    }

    public final InterfaceC0933e a(InterfaceC0933e mutable) {
        Intrinsics.checkNotNullParameter(mutable, "mutable");
        id.c o10 = c.f4890a.o(kd.f.m(mutable));
        if (o10 != null) {
            InterfaceC0933e o11 = AbstractC3778c.j(mutable).o(o10);
            Intrinsics.checkNotNullExpressionValue(o11, "getBuiltInClassByFqName(...)");
            return o11;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    public final InterfaceC0933e b(InterfaceC0933e readOnly) {
        Intrinsics.checkNotNullParameter(readOnly, "readOnly");
        id.c p10 = c.f4890a.p(kd.f.m(readOnly));
        if (p10 != null) {
            InterfaceC0933e o10 = AbstractC3778c.j(readOnly).o(p10);
            Intrinsics.checkNotNullExpressionValue(o10, "getBuiltInClassByFqName(...)");
            return o10;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public final boolean c(InterfaceC0933e mutable) {
        Intrinsics.checkNotNullParameter(mutable, "mutable");
        return c.f4890a.k(kd.f.m(mutable));
    }

    public final boolean d(InterfaceC0933e readOnly) {
        Intrinsics.checkNotNullParameter(readOnly, "readOnly");
        return c.f4890a.l(kd.f.m(readOnly));
    }

    public final InterfaceC0933e e(id.c fqName, Hc.g builtIns, Integer num) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        C3367b m10 = (num == null || !Intrinsics.b(fqName, c.f4890a.h())) ? c.f4890a.m(fqName) : Hc.j.a(num.intValue());
        if (m10 != null) {
            return builtIns.o(m10.b());
        }
        return null;
    }

    public final Collection g(id.c fqName, Hc.g builtIns) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        InterfaceC0933e f10 = f(this, fqName, builtIns, null, 4, null);
        if (f10 == null) {
            return O.d();
        }
        id.c p10 = c.f4890a.p(AbstractC3778c.m(f10));
        if (p10 == null) {
            return O.c(f10);
        }
        InterfaceC0933e o10 = builtIns.o(p10);
        Intrinsics.checkNotNullExpressionValue(o10, "getBuiltInClassByFqName(...)");
        return CollectionsKt.m(f10, o10);
    }
}
