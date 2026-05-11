package t7;

import java.util.List;
import java.util.ListIterator;

/* renamed from: t7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4737o extends C4723m implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4744p f43102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4737o(C4744p c4744p) {
        super(c4744p);
        this.f43102d = c4744p;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.f43102d.isEmpty();
        a();
        ((ListIterator) this.f43058a).add(obj);
        AbstractC4751q.h(this.f43102d.f43113f);
        if (isEmpty) {
            this.f43102d.c();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f43058a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f43058a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f43058a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f43058a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f43058a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4737o(C4744p c4744p, int i10) {
        super(c4744p, ((List) c4744p.f43079b).listIterator(i10));
        this.f43102d = c4744p;
    }
}
