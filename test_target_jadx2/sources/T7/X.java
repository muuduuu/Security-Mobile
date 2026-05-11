package t7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class X extends AbstractC4717l0 {
    X() {
    }

    abstract Map c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        c().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return c().isEmpty();
    }

    @Override // t7.AbstractC4717l0, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return AbstractC4724m0.b(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            return AbstractC4724m0.c(this, collection.iterator());
        }
    }

    @Override // t7.AbstractC4717l0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i10;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                AbstractC4785v.a(size, "expectedSize");
                i10 = size + 1;
            } else {
                i10 = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i10);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return ((C4695i) c()).f42990d.k().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return c().size();
    }
}
