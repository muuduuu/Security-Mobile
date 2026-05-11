package mc;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mc.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3669e extends AbstractC3665a {

    /* renamed from: a, reason: collision with root package name */
    private final C3668d f37470a;

    public C3669e(C3668d backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f37470a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.AbstractC3571f
    public int c() {
        return this.f37470a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f37470a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f37470a.o(elements);
    }

    @Override // mc.AbstractC3665a
    public boolean h(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f37470a.q(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f37470a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f37470a.u();
    }

    @Override // mc.AbstractC3665a
    public boolean j(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f37470a.L(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f37470a.m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f37470a.m();
        return super.retainAll(elements);
    }
}
