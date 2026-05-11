package Na;

import Td.v;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class f {
    public static final v a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        v.a aVar = new v.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            aVar.a((String) pair.c(), (String) pair.d());
        }
        return aVar.f();
    }
}
