package bd;

import dd.C3040q;
import gd.AbstractC3218a;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.C5198F;
import yd.M;

/* loaded from: classes3.dex */
public final class l implements ud.s {

    /* renamed from: a, reason: collision with root package name */
    public static final l f19019a = new l();

    private l() {
    }

    @Override // ud.s
    public AbstractC5197E a(C3040q proto, String flexibleId, M lowerBound, M upperBound) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        return !Intrinsics.b(flexibleId, "kotlin.jvm.PlatformType") ? kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString()) : proto.u(AbstractC3218a.f33680g) ? new Xc.h(lowerBound, upperBound) : C5198F.d(lowerBound, upperBound);
    }
}
