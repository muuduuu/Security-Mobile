package t7;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: t7.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4640a0 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f42807a;

    /* renamed from: b, reason: collision with root package name */
    private transient Collection f42808b;

    AbstractC4640a0() {
    }

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f42807a;
        if (set != null) {
            return set;
        }
        Set a10 = a();
        this.f42807a = a10;
        return a10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f42808b;
        if (collection != null) {
            return collection;
        }
        Z z10 = new Z(this);
        this.f42808b = z10;
        return z10;
    }
}
