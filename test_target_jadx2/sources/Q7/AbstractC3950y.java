package q7;

import java.util.Iterator;
import java.util.Set;

/* renamed from: q7.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3950y {
    static int a(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }
}
