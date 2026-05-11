package t7;

import java.util.Iterator;
import java.util.Map;

/* renamed from: t7.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4689h0 extends T {

    /* renamed from: c, reason: collision with root package name */
    private final transient S f42975c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f42976d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f42977e;

    C4689h0(S s10, Object[] objArr, int i10, int i11) {
        this.f42975c = s10;
        this.f42976d = objArr;
        this.f42977e = i11;
    }

    @Override // t7.K
    final int c(Object[] objArr, int i10) {
        return k().c(objArr, 0);
    }

    @Override // t7.K, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f42975c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // t7.T
    final P m() {
        return new C4682g0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f42977e;
    }
}
