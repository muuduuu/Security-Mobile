package t7;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: t7.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4717l0 extends AbstractSet {
    AbstractC4717l0() {
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return AbstractC4724m0.b(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
