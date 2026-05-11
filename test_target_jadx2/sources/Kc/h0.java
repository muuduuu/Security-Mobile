package Kc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class h0 {
    public /* synthetic */ h0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean a(id.f fVar);

    public abstract List b();

    public final h0 c(Function1 transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (this instanceof C0953z) {
            C0953z c0953z = (C0953z) this;
            return new C0953z(c0953z.d(), (Ad.j) transform.invoke(c0953z.e()));
        }
        if (!(this instanceof H)) {
            throw new lc.m();
        }
        List<Pair> b10 = b();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(b10, 10));
        for (Pair pair : b10) {
            arrayList.add(lc.t.a((id.f) pair.getFirst(), transform.invoke((Ad.j) pair.getSecond())));
        }
        return new H(arrayList);
    }

    private h0() {
    }
}
