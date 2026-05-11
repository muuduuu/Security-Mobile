package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;

/* renamed from: kotlin.collections.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3571f extends AbstractSet implements Set, yc.f {
    protected AbstractC3571f() {
    }

    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return c();
    }
}
