package q7;

import java.util.Iterator;

/* renamed from: q7.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3947v extends AbstractC3943q {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC3942p f38826c;

    /* renamed from: d, reason: collision with root package name */
    private final transient AbstractC3939m f38827d;

    C3947v(AbstractC3942p abstractC3942p, AbstractC3939m abstractC3939m) {
        this.f38826c = abstractC3942p;
        this.f38827d = abstractC3939m;
    }

    @Override // q7.AbstractC3936j
    final int c(Object[] objArr, int i10) {
        return this.f38827d.c(objArr, 0);
    }

    @Override // q7.AbstractC3936j, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f38826c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f38827d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f38826c.size();
    }
}
