package r7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class V extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4040b0 f39764a;

    V(C4040b0 c4040b0) {
        this.f39764a = c4040b0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f39764a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int r10;
        Map j10 = this.f39764a.j();
        if (j10 != null) {
            return j10.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            r10 = this.f39764a.r(entry.getKey());
            if (r10 != -1) {
                Object[] objArr = this.f39764a.f39913d;
                objArr.getClass();
                if (r.a(objArr[r10], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C4040b0 c4040b0 = this.f39764a;
        Map j10 = c4040b0.j();
        return j10 != null ? j10.entrySet().iterator() : new T(c4040b0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int q10;
        int i10;
        Map j10 = this.f39764a.j();
        if (j10 != null) {
            return j10.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C4040b0 c4040b0 = this.f39764a;
        if (c4040b0.p()) {
            return false;
        }
        q10 = c4040b0.q();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object h10 = C4040b0.h(this.f39764a);
        C4040b0 c4040b02 = this.f39764a;
        int[] iArr = c4040b02.f39911b;
        iArr.getClass();
        Object[] objArr = c4040b02.f39912c;
        objArr.getClass();
        Object[] objArr2 = c4040b02.f39913d;
        objArr2.getClass();
        int b10 = AbstractC4050c0.b(key, value, q10, h10, iArr, objArr, objArr2);
        if (b10 == -1) {
            return false;
        }
        this.f39764a.o(b10, q10);
        C4040b0 c4040b03 = this.f39764a;
        i10 = c4040b03.f39915f;
        c4040b03.f39915f = i10 - 1;
        this.f39764a.m();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f39764a.size();
    }
}
