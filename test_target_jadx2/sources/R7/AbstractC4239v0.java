package r7;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: r7.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4239v0 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f40319a;

    /* renamed from: b, reason: collision with root package name */
    private transient Collection f40320b;

    AbstractC4239v0() {
    }

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f40319a;
        if (set != null) {
            return set;
        }
        Set a10 = a();
        this.f40319a = a10;
        return a10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f40320b;
        if (collection != null) {
            return collection;
        }
        C4229u0 c4229u0 = new C4229u0(this);
        this.f40320b = c4229u0;
        return c4229u0;
    }
}
