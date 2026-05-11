package rd;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class j {
    public static final Set a(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set e10 = ((h) it.next()).e();
            if (e10 == null) {
                return null;
            }
            CollectionsKt.z(hashSet, e10);
        }
        return hashSet;
    }
}
