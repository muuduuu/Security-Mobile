package r7;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
final class I extends G implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ J f39436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I(J j10) {
        super(j10);
        this.f39436d = j10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i10;
        boolean isEmpty = this.f39436d.isEmpty();
        a();
        ((ListIterator) this.f39393a).add(obj);
        K k10 = this.f39436d.f39448f;
        i10 = k10.f39466d;
        k10.f39466d = i10 + 1;
        if (isEmpty) {
            this.f39436d.c();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f39393a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f39393a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f39393a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f39393a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f39393a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j10, int i10) {
        super(j10, ((List) j10.f39419b).listIterator(i10));
        this.f39436d = j10;
    }
}
