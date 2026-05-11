package s7;

import java.util.Iterator;
import java.util.Set;

/* renamed from: s7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4333b {
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
