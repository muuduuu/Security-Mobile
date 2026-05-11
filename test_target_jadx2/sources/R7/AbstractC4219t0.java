package r7;

import java.util.Iterator;
import java.util.Map;

/* renamed from: r7.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4219t0 extends G0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f40274a;

    AbstractC4219t0(Map map) {
        this.f40274a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f40274a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f40274a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f40274a.size();
    }
}
