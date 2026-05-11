package t7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: t7.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4813z extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ F f43305a;

    C4813z(F f10) {
        this.f43305a = f10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f43305a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int y10;
        Map o10 = this.f43305a.o();
        if (o10 != null) {
            return o10.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            y10 = this.f43305a.y(entry.getKey());
            if (y10 != -1 && x6.a(F.m(this.f43305a, y10), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        F f10 = this.f43305a;
        Map o10 = f10.o();
        return o10 != null ? o10.entrySet().iterator() : new C4799x(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int x10;
        int[] C10;
        Object[] a10;
        Object[] b10;
        Map o10 = this.f43305a.o();
        if (o10 != null) {
            return o10.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        F f10 = this.f43305a;
        if (f10.t()) {
            return false;
        }
        x10 = f10.x();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object n10 = F.n(this.f43305a);
        C10 = this.f43305a.C();
        a10 = this.f43305a.a();
        b10 = this.f43305a.b();
        int b11 = G.b(key, value, x10, n10, C10, a10, b10);
        if (b11 == -1) {
            return false;
        }
        this.f43305a.s(b11, x10);
        F.d(this.f43305a);
        this.f43305a.q();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f43305a.size();
    }
}
