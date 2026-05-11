package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;
import yc.InterfaceC5192b;

/* renamed from: kotlin.collections.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3569d extends AbstractCollection implements Collection, InterfaceC5192b {
    protected AbstractC3569d() {
    }

    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }
}
