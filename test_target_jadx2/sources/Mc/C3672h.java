package mc;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC3571f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mc.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3672h extends AbstractC3571f implements Set, Serializable, yc.f {

    /* renamed from: b, reason: collision with root package name */
    private static final a f37473b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final C3672h f37474c = new C3672h(C3668d.f37449n.e());

    /* renamed from: a, reason: collision with root package name */
    private final C3668d f37475a;

    /* renamed from: mc.h$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3672h(C3668d backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f37475a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f37475a.i(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f37475a.m();
        return super.addAll(elements);
    }

    @Override // kotlin.collections.AbstractC3571f
    public int c() {
        return this.f37475a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f37475a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f37475a.containsKey(obj);
    }

    public final Set e() {
        this.f37475a.l();
        return size() > 0 ? this : f37474c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f37475a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f37475a.F();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f37475a.O(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f37475a.m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f37475a.m();
        return super.retainAll(elements);
    }

    public C3672h() {
        this(new C3668d());
    }
}
