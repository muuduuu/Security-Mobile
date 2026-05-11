package r7;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
class J extends H implements List {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ K f39448f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(K k10, Object obj, List list, H h10) {
        super(k10, obj, list, h10);
        this.f39448f = k10;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        zzb();
        boolean isEmpty = this.f39419b.isEmpty();
        ((List) this.f39419b).add(i10, obj);
        K k10 = this.f39448f;
        i11 = k10.f39466d;
        k10.f39466d = i11 + 1;
        if (isEmpty) {
            c();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        int i11;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f39419b).addAll(i10, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f39419b.size();
        K k10 = this.f39448f;
        i11 = k10.f39466d;
        k10.f39466d = i11 + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        c();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzb();
        return ((List) this.f39419b).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f39419b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f39419b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new I(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        zzb();
        Object remove = ((List) this.f39419b).remove(i10);
        K k10 = this.f39448f;
        i11 = k10.f39466d;
        k10.f39466d = i11 - 1;
        e();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.f39419b).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zzb();
        K k10 = this.f39448f;
        Object obj = this.f39418a;
        List subList = ((List) this.f39419b).subList(i10, i11);
        H h10 = this.f39420c;
        if (h10 == null) {
            h10 = this;
        }
        return k10.i(obj, subList, h10);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zzb();
        return new I(this, i10);
    }
}
