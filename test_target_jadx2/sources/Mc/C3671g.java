package mc;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC3569d;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5192b;

/* renamed from: mc.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3671g extends AbstractC3569d implements Collection, InterfaceC5192b {

    /* renamed from: a, reason: collision with root package name */
    private final C3668d f37472a;

    public C3671g(C3668d backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f37472a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.AbstractC3569d
    public int c() {
        return this.f37472a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f37472a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f37472a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f37472a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f37472a.R();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f37472a.P(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f37472a.m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f37472a.m();
        return super.retainAll(elements);
    }
}
