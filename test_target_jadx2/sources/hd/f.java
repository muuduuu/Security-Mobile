package hd;

import gd.AbstractC3218a;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.O;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends g {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC3218a.e f34071h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(AbstractC3218a.e types, String[] strings) {
        super(strings, r0, h.a(r1));
        Set S02;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(strings, "strings");
        List u10 = types.u();
        if (u10.isEmpty()) {
            S02 = O.d();
        } else {
            Intrinsics.d(u10);
            S02 = CollectionsKt.S0(u10);
        }
        List v10 = types.v();
        Intrinsics.checkNotNullExpressionValue(v10, "getRecordList(...)");
        this.f34071h = types;
    }
}
