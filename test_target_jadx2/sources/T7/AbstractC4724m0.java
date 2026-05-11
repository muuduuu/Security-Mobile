package t7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: t7.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4724m0 {
    static int a(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }

    static boolean b(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC4668e0) {
            collection = ((InterfaceC4668e0) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return c(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    static boolean c(Set set, Iterator it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
