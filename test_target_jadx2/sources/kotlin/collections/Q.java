package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class Q extends P {
    public static Set d() {
        return A.f36325a;
    }

    public static LinkedHashSet e(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (LinkedHashSet) C3578m.f0(elements, new LinkedHashSet(G.d(elements.length)));
    }

    public static Set f(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) C3578m.f0(elements, new LinkedHashSet(G.d(elements.length)));
    }

    public static final Set g(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : O.c(set.iterator().next()) : O.d();
    }

    public static Set h(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return AbstractC3574i.y0(elements);
    }
}
