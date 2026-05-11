package kotlin.collections;

import java.util.AbstractList;
import java.util.List;

/* renamed from: kotlin.collections.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3570e extends AbstractList implements List, yc.d {
    protected AbstractC3570e() {
    }

    public abstract int c();

    public abstract Object e(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return e(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return c();
    }
}
