package mc;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractC3568c;
import kotlin.collections.AbstractC3570e;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* renamed from: mc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3666b extends AbstractC3570e implements List, RandomAccess, Serializable, yc.d {

    /* renamed from: d, reason: collision with root package name */
    private static final C0563b f37431d = new C0563b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final C3666b f37432e;

    /* renamed from: a, reason: collision with root package name */
    private Object[] f37433a;

    /* renamed from: b, reason: collision with root package name */
    private int f37434b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37435c;

    /* renamed from: mc.b$a */
    public static final class a extends AbstractC3570e implements List, RandomAccess, Serializable, yc.d {

        /* renamed from: a, reason: collision with root package name */
        private Object[] f37436a;

        /* renamed from: b, reason: collision with root package name */
        private final int f37437b;

        /* renamed from: c, reason: collision with root package name */
        private int f37438c;

        /* renamed from: d, reason: collision with root package name */
        private final a f37439d;

        /* renamed from: e, reason: collision with root package name */
        private final C3666b f37440e;

        /* renamed from: mc.b$a$a, reason: collision with other inner class name */
        private static final class C0562a implements ListIterator, InterfaceC5191a {

            /* renamed from: a, reason: collision with root package name */
            private final a f37441a;

            /* renamed from: b, reason: collision with root package name */
            private int f37442b;

            /* renamed from: c, reason: collision with root package name */
            private int f37443c;

            /* renamed from: d, reason: collision with root package name */
            private int f37444d;

            public C0562a(a list, int i10) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.f37441a = list;
                this.f37442b = i10;
                this.f37443c = -1;
                this.f37444d = ((AbstractList) list).modCount;
            }

            private final void a() {
                if (((AbstractList) this.f37441a.f37440e).modCount != this.f37444d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                a();
                a aVar = this.f37441a;
                int i10 = this.f37442b;
                this.f37442b = i10 + 1;
                aVar.add(i10, obj);
                this.f37443c = -1;
                this.f37444d = ((AbstractList) this.f37441a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f37442b < this.f37441a.f37438c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f37442b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                a();
                if (this.f37442b >= this.f37441a.f37438c) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f37442b;
                this.f37442b = i10 + 1;
                this.f37443c = i10;
                return this.f37441a.f37436a[this.f37441a.f37437b + this.f37443c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f37442b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                a();
                int i10 = this.f37442b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f37442b = i11;
                this.f37443c = i11;
                return this.f37441a.f37436a[this.f37441a.f37437b + this.f37443c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f37442b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i10 = this.f37443c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f37441a.remove(i10);
                this.f37442b = this.f37443c;
                this.f37443c = -1;
                this.f37444d = ((AbstractList) this.f37441a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                a();
                int i10 = this.f37443c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f37441a.set(i10, obj);
            }
        }

        public a(Object[] backing, int i10, int i11, a aVar, C3666b root) {
            Intrinsics.checkNotNullParameter(backing, "backing");
            Intrinsics.checkNotNullParameter(root, "root");
            this.f37436a = backing;
            this.f37437b = i10;
            this.f37438c = i11;
            this.f37439d = aVar;
            this.f37440e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void A() {
            if (D()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean B(List list) {
            boolean h10;
            h10 = AbstractC3667c.h(this.f37436a, this.f37437b, this.f37438c, list);
            return h10;
        }

        private final boolean D() {
            return this.f37440e.f37435c;
        }

        private final void E() {
            ((AbstractList) this).modCount++;
        }

        private final Object F(int i10) {
            E();
            a aVar = this.f37439d;
            this.f37438c--;
            return aVar != null ? aVar.F(i10) : this.f37440e.O(i10);
        }

        private final void G(int i10, int i11) {
            if (i11 > 0) {
                E();
            }
            a aVar = this.f37439d;
            if (aVar != null) {
                aVar.G(i10, i11);
            } else {
                this.f37440e.P(i10, i11);
            }
            this.f37438c -= i11;
        }

        private final int I(int i10, int i11, Collection collection, boolean z10) {
            a aVar = this.f37439d;
            int I10 = aVar != null ? aVar.I(i10, i11, collection, z10) : this.f37440e.R(i10, i11, collection, z10);
            if (I10 > 0) {
                E();
            }
            this.f37438c -= I10;
            return I10;
        }

        private final void u(int i10, Collection collection, int i11) {
            E();
            a aVar = this.f37439d;
            if (aVar != null) {
                aVar.u(i10, collection, i11);
            } else {
                this.f37440e.B(i10, collection, i11);
            }
            this.f37436a = this.f37440e.f37433a;
            this.f37438c += i11;
        }

        private final void v(int i10, Object obj) {
            E();
            a aVar = this.f37439d;
            if (aVar != null) {
                aVar.v(i10, obj);
            } else {
                this.f37440e.D(i10, obj);
            }
            this.f37436a = this.f37440e.f37433a;
            this.f37438c++;
        }

        private final void w() {
            if (((AbstractList) this.f37440e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            A();
            w();
            v(this.f37437b + this.f37438c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            A();
            w();
            int size = elements.size();
            u(this.f37437b + this.f37438c, elements, size);
            return size > 0;
        }

        @Override // kotlin.collections.AbstractC3570e
        public int c() {
            w();
            return this.f37438c;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            A();
            w();
            G(this.f37437b, this.f37438c);
        }

        @Override // kotlin.collections.AbstractC3570e
        public Object e(int i10) {
            A();
            w();
            AbstractC3568c.f36342a.b(i10, this.f37438c);
            return F(this.f37437b + i10);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            w();
            return obj == this || ((obj instanceof List) && B((List) obj));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            w();
            AbstractC3568c.f36342a.b(i10, this.f37438c);
            return this.f37436a[this.f37437b + i10];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10;
            w();
            i10 = AbstractC3667c.i(this.f37436a, this.f37437b, this.f37438c);
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            w();
            for (int i10 = 0; i10 < this.f37438c; i10++) {
                if (Intrinsics.b(this.f37436a[this.f37437b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            w();
            return this.f37438c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            w();
            for (int i10 = this.f37438c - 1; i10 >= 0; i10--) {
                if (Intrinsics.b(this.f37436a[this.f37437b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            A();
            w();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                remove(indexOf);
            }
            return indexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            A();
            w();
            return I(this.f37437b, this.f37438c, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            A();
            w();
            return I(this.f37437b, this.f37438c, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            A();
            w();
            AbstractC3568c.f36342a.b(i10, this.f37438c);
            Object[] objArr = this.f37436a;
            int i11 = this.f37437b;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            AbstractC3568c.f36342a.d(i10, i11, this.f37438c);
            return new a(this.f37436a, this.f37437b + i10, i11 - i10, this, this.f37440e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            w();
            int length = array.length;
            int i10 = this.f37438c;
            if (length >= i10) {
                Object[] objArr = this.f37436a;
                int i11 = this.f37437b;
                AbstractC3574i.h(objArr, array, 0, i11, i10 + i11);
                return CollectionsKt.f(this.f37438c, array);
            }
            Object[] objArr2 = this.f37436a;
            int i12 = this.f37437b;
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i12, i10 + i12, array.getClass());
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String j10;
            w();
            j10 = AbstractC3667c.j(this.f37436a, this.f37437b, this.f37438c, this);
            return j10;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            w();
            AbstractC3568c.f36342a.c(i10, this.f37438c);
            return new C0562a(this, i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            A();
            w();
            AbstractC3568c.f36342a.c(i10, this.f37438c);
            v(this.f37437b + i10, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            A();
            w();
            AbstractC3568c.f36342a.c(i10, this.f37438c);
            int size = elements.size();
            u(this.f37437b + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            w();
            Object[] objArr = this.f37436a;
            int i10 = this.f37437b;
            return AbstractC3574i.m(objArr, i10, this.f37438c + i10);
        }
    }

    /* renamed from: mc.b$b, reason: collision with other inner class name */
    private static final class C0563b {
        public /* synthetic */ C0563b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0563b() {
        }
    }

    /* renamed from: mc.b$c */
    private static final class c implements ListIterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private final C3666b f37445a;

        /* renamed from: b, reason: collision with root package name */
        private int f37446b;

        /* renamed from: c, reason: collision with root package name */
        private int f37447c;

        /* renamed from: d, reason: collision with root package name */
        private int f37448d;

        public c(C3666b list, int i10) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f37445a = list;
            this.f37446b = i10;
            this.f37447c = -1;
            this.f37448d = ((AbstractList) list).modCount;
        }

        private final void a() {
            if (((AbstractList) this.f37445a).modCount != this.f37448d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            a();
            C3666b c3666b = this.f37445a;
            int i10 = this.f37446b;
            this.f37446b = i10 + 1;
            c3666b.add(i10, obj);
            this.f37447c = -1;
            this.f37448d = ((AbstractList) this.f37445a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f37446b < this.f37445a.f37434b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f37446b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            a();
            if (this.f37446b >= this.f37445a.f37434b) {
                throw new NoSuchElementException();
            }
            int i10 = this.f37446b;
            this.f37446b = i10 + 1;
            this.f37447c = i10;
            return this.f37445a.f37433a[this.f37447c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f37446b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            a();
            int i10 = this.f37446b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f37446b = i11;
            this.f37447c = i11;
            return this.f37445a.f37433a[this.f37447c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f37446b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i10 = this.f37447c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f37445a.remove(i10);
            this.f37446b = this.f37447c;
            this.f37447c = -1;
            this.f37448d = ((AbstractList) this.f37445a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            a();
            int i10 = this.f37447c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f37445a.set(i10, obj);
        }
    }

    static {
        C3666b c3666b = new C3666b(0);
        c3666b.f37435c = true;
        f37432e = c3666b;
    }

    public C3666b() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(int i10, Collection collection, int i11) {
        M();
        L(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f37433a[i10 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int i10, Object obj) {
        M();
        L(i10, 1);
        this.f37433a[i10] = obj;
    }

    private final void F() {
        if (this.f37435c) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean G(List list) {
        boolean h10;
        h10 = AbstractC3667c.h(this.f37433a, 0, this.f37434b, list);
        return h10;
    }

    private final void I(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f37433a;
        if (i10 > objArr.length) {
            this.f37433a = AbstractC3667c.e(this.f37433a, AbstractC3568c.f36342a.e(objArr.length, i10));
        }
    }

    private final void J(int i10) {
        I(this.f37434b + i10);
    }

    private final void L(int i10, int i11) {
        J(i11);
        Object[] objArr = this.f37433a;
        AbstractC3574i.h(objArr, objArr, i10 + i11, i10, this.f37434b);
        this.f37434b += i11;
    }

    private final void M() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O(int i10) {
        M();
        Object[] objArr = this.f37433a;
        Object obj = objArr[i10];
        AbstractC3574i.h(objArr, objArr, i10, i10 + 1, this.f37434b);
        AbstractC3667c.f(this.f37433a, this.f37434b - 1);
        this.f37434b--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(int i10, int i11) {
        if (i11 > 0) {
            M();
        }
        Object[] objArr = this.f37433a;
        AbstractC3574i.h(objArr, objArr, i10, i10 + i11, this.f37434b);
        Object[] objArr2 = this.f37433a;
        int i12 = this.f37434b;
        AbstractC3667c.g(objArr2, i12 - i11, i12);
        this.f37434b -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f37433a[i14]) == z10) {
                Object[] objArr = this.f37433a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f37433a;
        AbstractC3574i.h(objArr2, objArr2, i10 + i13, i11 + i10, this.f37434b);
        Object[] objArr3 = this.f37433a;
        int i16 = this.f37434b;
        AbstractC3667c.g(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            M();
        }
        this.f37434b -= i15;
        return i15;
    }

    public final List E() {
        F();
        this.f37435c = true;
        return this.f37434b > 0 ? this : f37432e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        F();
        D(this.f37434b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        F();
        int size = elements.size();
        B(this.f37434b, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractC3570e
    public int c() {
        return this.f37434b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        F();
        P(0, this.f37434b);
    }

    @Override // kotlin.collections.AbstractC3570e
    public Object e(int i10) {
        F();
        AbstractC3568c.f36342a.b(i10, this.f37434b);
        return O(i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && G((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC3568c.f36342a.b(i10, this.f37434b);
        return this.f37433a[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10;
        i10 = AbstractC3667c.i(this.f37433a, 0, this.f37434b);
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f37434b; i10++) {
            if (Intrinsics.b(this.f37433a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f37434b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f37434b - 1; i10 >= 0; i10--) {
            if (Intrinsics.b(this.f37433a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        F();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        F();
        return R(0, this.f37434b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        F();
        return R(0, this.f37434b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        F();
        AbstractC3568c.f36342a.b(i10, this.f37434b);
        Object[] objArr = this.f37433a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i10, int i11) {
        AbstractC3568c.f36342a.d(i10, i11, this.f37434b);
        return new a(this.f37433a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i10 = this.f37434b;
        if (length >= i10) {
            AbstractC3574i.h(this.f37433a, array, 0, 0, i10);
            return CollectionsKt.f(this.f37434b, array);
        }
        Object[] copyOfRange = Arrays.copyOfRange(this.f37433a, 0, i10, array.getClass());
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j10;
        j10 = AbstractC3667c.j(this.f37433a, 0, this.f37434b, this);
        return j10;
    }

    public C3666b(int i10) {
        this.f37433a = AbstractC3667c.d(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        AbstractC3568c.f36342a.c(i10, this.f37434b);
        return new c(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        F();
        AbstractC3568c.f36342a.c(i10, this.f37434b);
        D(i10, obj);
    }

    public /* synthetic */ C3666b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        F();
        AbstractC3568c.f36342a.c(i10, this.f37434b);
        int size = elements.size();
        B(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC3574i.m(this.f37433a, 0, this.f37434b);
    }
}
