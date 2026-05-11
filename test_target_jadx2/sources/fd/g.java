package fd;

import dd.C3040q;
import dd.C3043t;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final List f33042a;

    public g(C3043t typeTable) {
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List x10 = typeTable.x();
        if (typeTable.y()) {
            int u10 = typeTable.u();
            List x11 = typeTable.x();
            Intrinsics.checkNotNullExpressionValue(x11, "getTypeList(...)");
            List list = x11;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.t();
                }
                C3040q c3040q = (C3040q) obj;
                if (i10 >= u10) {
                    c3040q = c3040q.b().M(true).c();
                }
                arrayList.add(c3040q);
                i10 = i11;
            }
            x10 = arrayList;
        }
        Intrinsics.checkNotNullExpressionValue(x10, "run(...)");
        this.f33042a = x10;
    }

    public final C3040q a(int i10) {
        return (C3040q) this.f33042a.get(i10);
    }
}
