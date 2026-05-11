package Hc;

import Kc.AbstractC0947t;
import Kc.D;
import Kc.EnumC0934f;
import Kc.a0;
import Mc.C0987m;
import Mc.K;
import Mc.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.C5198F;
import yd.M;
import yd.e0;
import yd.i0;
import yd.u0;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final y f3983a;

    static {
        C0987m c0987m = new C0987m(kotlin.reflect.jvm.internal.impl.types.error.k.f36726a.i(), j.f3883q);
        EnumC0934f enumC0934f = EnumC0934f.INTERFACE;
        id.f g10 = j.f3886t.g();
        a0 a0Var = a0.f5560a;
        xd.n nVar = xd.f.f45006e;
        y yVar = new y(c0987m, enumC0934f, false, false, g10, a0Var, nVar);
        yVar.V0(D.ABSTRACT);
        yVar.X0(AbstractC0947t.f5589e);
        yVar.W0(CollectionsKt.e(K.a1(yVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), false, u0.IN_VARIANCE, id.f.o("T"), 0, nVar)));
        yVar.T0();
        f3983a = yVar;
    }

    public static final M a(AbstractC5197E suspendFunType) {
        M b10;
        Intrinsics.checkNotNullParameter(suspendFunType, "suspendFunType");
        f.r(suspendFunType);
        g i10 = Bd.a.i(suspendFunType);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i11 = suspendFunType.i();
        AbstractC5197E k10 = f.k(suspendFunType);
        List e10 = f.e(suspendFunType);
        List m10 = f.m(suspendFunType);
        ArrayList arrayList = new ArrayList(CollectionsKt.u(m10, 10));
        Iterator it = m10.iterator();
        while (it.hasNext()) {
            arrayList.add(((i0) it.next()).getType());
        }
        yd.a0 i12 = yd.a0.f45478b.i();
        e0 r10 = f3983a.r();
        Intrinsics.checkNotNullExpressionValue(r10, "getTypeConstructor(...)");
        List x02 = CollectionsKt.x0(arrayList, C5198F.j(i12, r10, CollectionsKt.e(Bd.a.a(f.l(suspendFunType))), false, null, 16, null));
        M I10 = Bd.a.i(suspendFunType).I();
        Intrinsics.checkNotNullExpressionValue(I10, "getNullableAnyType(...)");
        b10 = f.b(i10, i11, k10, e10, x02, null, I10, (r17 & 128) != 0 ? false : false);
        return b10.a1(suspendFunType.X0());
    }
}
