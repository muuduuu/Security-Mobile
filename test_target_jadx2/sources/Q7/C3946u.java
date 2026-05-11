package q7;

import java.util.Iterator;
import java.util.Map;

/* renamed from: q7.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3946u extends AbstractC3943q {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC3942p f38823c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f38824d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f38825e;

    C3946u(AbstractC3942p abstractC3942p, Object[] objArr, int i10, int i11) {
        this.f38823c = abstractC3942p;
        this.f38824d = objArr;
        this.f38825e = i11;
    }

    @Override // q7.AbstractC3936j
    final int c(Object[] objArr, int i10) {
        return k().c(objArr, 0);
    }

    @Override // q7.AbstractC3936j, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f38823c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // q7.AbstractC3943q
    final AbstractC3939m m() {
        return new C3945t(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f38825e;
    }
}
