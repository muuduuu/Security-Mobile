package s7;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class U5 extends Q5 {

    /* renamed from: c, reason: collision with root package name */
    private final transient P5 f41062c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f41063d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f41064e;

    U5(P5 p52, Object[] objArr, int i10, int i11) {
        this.f41062c = p52;
        this.f41063d = objArr;
        this.f41064e = i11;
    }

    @Override // s7.M4
    final int c(Object[] objArr, int i10) {
        return k().c(objArr, 0);
    }

    @Override // s7.M4, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f41062c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // s7.Q5
    final N5 m() {
        return new T5(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41064e;
    }
}
