package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* renamed from: kotlin.collections.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3568c extends AbstractC3566a implements List, InterfaceC5191a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36342a = new a(null);

    /* renamed from: kotlin.collections.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        public final int e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            return i12 - 2147483639 > 0 ? i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i12;
        }

        public final boolean f(Collection c10, Collection other) {
            Intrinsics.checkNotNullParameter(c10, "c");
            Intrinsics.checkNotNullParameter(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.b(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection c10) {
            Intrinsics.checkNotNullParameter(c10, "c");
            Iterator it = c10.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i10;
        }

        private a() {
        }
    }

    /* renamed from: kotlin.collections.c$b */
    private class b implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private int f36343a;

        public b() {
        }

        protected final int a() {
            return this.f36343a;
        }

        protected final void b(int i10) {
            this.f36343a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36343a < AbstractC3568c.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC3568c abstractC3568c = AbstractC3568c.this;
            int i10 = this.f36343a;
            this.f36343a = i10 + 1;
            return abstractC3568c.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.c$c, reason: collision with other inner class name */
    private class C0526c extends b implements ListIterator, InterfaceC5191a {
        public C0526c(int i10) {
            super();
            AbstractC3568c.f36342a.c(i10, AbstractC3568c.this.size());
            b(i10);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC3568c abstractC3568c = AbstractC3568c.this;
            b(a() - 1);
            return abstractC3568c.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.c$d */
    private static final class d extends AbstractC3568c implements RandomAccess {

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC3568c f36346b;

        /* renamed from: c, reason: collision with root package name */
        private final int f36347c;

        /* renamed from: d, reason: collision with root package name */
        private int f36348d;

        public d(AbstractC3568c list, int i10, int i11) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f36346b = list;
            this.f36347c = i10;
            AbstractC3568c.f36342a.d(i10, i11, list.size());
            this.f36348d = i11 - i10;
        }

        @Override // kotlin.collections.AbstractC3566a
        public int c() {
            return this.f36348d;
        }

        @Override // kotlin.collections.AbstractC3568c, java.util.List
        public Object get(int i10) {
            AbstractC3568c.f36342a.b(i10, this.f36348d);
            return this.f36346b.get(this.f36347c + i10);
        }
    }

    protected AbstractC3568c() {
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f36342a.f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f36342a.g(this);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (Intrinsics.b(it.next(), obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.b(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C0526c(0);
    }

    @Override // java.util.List
    public Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    public ListIterator listIterator(int i10) {
        return new C0526c(i10);
    }
}
