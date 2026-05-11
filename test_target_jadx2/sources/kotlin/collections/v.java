package kotlin.collections;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class v extends u {
    public static List M(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new N(list);
    }

    public static List N(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new M(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O(List list, int i10) {
        if (i10 >= 0 && i10 <= CollectionsKt.l(list)) {
            return CollectionsKt.l(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new IntRange(0, CollectionsKt.l(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P(List list, int i10) {
        return CollectionsKt.l(list) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Q(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new IntRange(0, list.size()) + "].");
    }
}
