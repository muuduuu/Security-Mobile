package Fd;

import Gd.f;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import rd.h;

/* loaded from: classes3.dex */
public abstract class a {
    public static final Collection a(Collection collection, Collection collection2) {
        Intrinsics.checkNotNullParameter(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final f b(Iterable scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        f fVar = new f();
        for (Object obj : scopes) {
            h hVar = (h) obj;
            if (hVar != null && hVar != h.b.f40647b) {
                fVar.add(obj);
            }
        }
        return fVar;
    }
}
