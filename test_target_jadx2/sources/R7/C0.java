package r7;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class C0 extends AbstractC4170o0 {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC4160n0 f39301c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f39302d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f39303e;

    C0(AbstractC4160n0 abstractC4160n0, Object[] objArr, int i10, int i11) {
        this.f39301c = abstractC4160n0;
        this.f39302d = objArr;
        this.f39303e = i11;
    }

    @Override // r7.AbstractC4090g0
    final int c(Object[] objArr, int i10) {
        return k().c(objArr, i10);
    }

    @Override // r7.AbstractC4090g0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f39301c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // r7.AbstractC4170o0
    final AbstractC4140l0 m() {
        return new B0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f39303e;
    }
}
