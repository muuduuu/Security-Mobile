package t7;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: t7.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C4744p extends AbstractC4730n implements List {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC4751q f43113f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4744p(AbstractC4751q abstractC4751q, Object obj, List list, AbstractC4730n abstractC4730n) {
        super(abstractC4751q, obj, list, abstractC4730n);
        this.f43113f = abstractC4751q;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        zzb();
        boolean isEmpty = this.f43079b.isEmpty();
        ((List) this.f43079b).add(i10, obj);
        AbstractC4751q.h(this.f43113f);
        if (isEmpty) {
            c();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f43079b).addAll(i10, collection);
        if (!addAll) {
            return addAll;
        }
        AbstractC4751q.j(this.f43113f, this.f43079b.size() - size);
        if (size != 0) {
            return addAll;
        }
        c();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzb();
        return ((List) this.f43079b).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f43079b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f43079b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C4737o(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        zzb();
        Object remove = ((List) this.f43079b).remove(i10);
        AbstractC4751q.i(this.f43113f);
        e();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.f43079b).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zzb();
        AbstractC4751q abstractC4751q = this.f43113f;
        Object obj = this.f43078a;
        List subList = ((List) this.f43079b).subList(i10, i11);
        AbstractC4730n abstractC4730n = this.f43080c;
        if (abstractC4730n == null) {
            abstractC4730n = this;
        }
        return abstractC4751q.n(obj, subList, abstractC4730n);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zzb();
        return new C4737o(this, i10);
    }
}
