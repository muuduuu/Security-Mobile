package t7;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class Y extends AbstractC4717l0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f42770a;

    Y(Map map) {
        map.getClass();
        this.f42770a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f42770a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f42770a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f42770a.size();
    }
}
