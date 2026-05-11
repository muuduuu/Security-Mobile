package kotlin.collections;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.collections.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3573h extends AbstractC3570e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f36351d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Object[] f36352e = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    private int f36353a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f36354b = f36352e;

    /* renamed from: c, reason: collision with root package name */
    private int f36355c;

    /* renamed from: kotlin.collections.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void A() {
        ((AbstractList) this).modCount++;
    }

    private final void D(int i10, int i11) {
        int w10 = w(this.f36353a + (i10 - 1));
        int w11 = w(this.f36353a + (i11 - 1));
        while (i10 > 0) {
            int i12 = w10 + 1;
            int min = Math.min(i10, Math.min(i12, w11 + 1));
            Object[] objArr = this.f36354b;
            int i13 = w11 - min;
            int i14 = w10 - min;
            AbstractC3574i.h(objArr, objArr, i13 + 1, i14 + 1, i12);
            w10 = u(i14);
            w11 = u(i13);
            i10 -= min;
        }
    }

    private final void E(int i10, int i11) {
        int w10 = w(this.f36353a + i11);
        int w11 = w(this.f36353a + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f36354b;
            i11 = Math.min(size, Math.min(objArr.length - w10, objArr.length - w11));
            Object[] objArr2 = this.f36354b;
            int i12 = w10 + i11;
            AbstractC3574i.h(objArr2, objArr2, w11, w10, i12);
            w10 = w(i12);
            w11 = w(w11 + i11);
        }
    }

    private final void h(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f36354b.length;
        while (i10 < length && it.hasNext()) {
            this.f36354b[i10] = it.next();
            i10++;
        }
        int i11 = this.f36353a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f36354b[i12] = it.next();
        }
        this.f36355c = size() + collection.size();
    }

    private final void j(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f36354b;
        AbstractC3574i.h(objArr2, objArr, 0, this.f36353a, objArr2.length);
        Object[] objArr3 = this.f36354b;
        int length = objArr3.length;
        int i11 = this.f36353a;
        AbstractC3574i.h(objArr3, objArr, length - i11, 0, i11);
        this.f36353a = 0;
        this.f36354b = objArr;
    }

    private final int m(int i10) {
        return i10 == 0 ? AbstractC3574i.D(this.f36354b) : i10 - 1;
    }

    private final void r(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f36354b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f36352e) {
            this.f36354b = new Object[kotlin.ranges.d.d(i10, 10)];
        } else {
            j(AbstractC3568c.f36342a.e(objArr.length, i10));
        }
    }

    private final int t(int i10) {
        if (i10 == AbstractC3574i.D(this.f36354b)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int u(int i10) {
        return i10 < 0 ? i10 + this.f36354b.length : i10;
    }

    private final void v(int i10, int i11) {
        if (i10 < i11) {
            AbstractC3574i.o(this.f36354b, null, i10, i11);
            return;
        }
        Object[] objArr = this.f36354b;
        AbstractC3574i.o(objArr, null, i10, objArr.length);
        AbstractC3574i.o(this.f36354b, null, 0, i11);
    }

    private final int w(int i10) {
        Object[] objArr = this.f36354b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final Object B() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        A();
        r(size() + elements.size());
        h(w(this.f36353a + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        A();
        r(size() + 1);
        int m10 = m(this.f36353a);
        this.f36353a = m10;
        this.f36354b[m10] = obj;
        this.f36355c = size() + 1;
    }

    public final void addLast(Object obj) {
        A();
        r(size() + 1);
        this.f36354b[w(this.f36353a + size())] = obj;
        this.f36355c = size() + 1;
    }

    @Override // kotlin.collections.AbstractC3570e
    public int c() {
        return this.f36355c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            A();
            v(this.f36353a, w(this.f36353a + size()));
        }
        this.f36353a = 0;
        this.f36355c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractC3570e
    public Object e(int i10) {
        AbstractC3568c.f36342a.b(i10, size());
        if (i10 == CollectionsKt.l(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        A();
        int w10 = w(this.f36353a + i10);
        Object obj = this.f36354b[w10];
        if (i10 < (size() >> 1)) {
            int i11 = this.f36353a;
            if (w10 >= i11) {
                Object[] objArr = this.f36354b;
                AbstractC3574i.h(objArr, objArr, i11 + 1, i11, w10);
            } else {
                Object[] objArr2 = this.f36354b;
                AbstractC3574i.h(objArr2, objArr2, 1, 0, w10);
                Object[] objArr3 = this.f36354b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f36353a;
                AbstractC3574i.h(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f36354b;
            int i13 = this.f36353a;
            objArr4[i13] = null;
            this.f36353a = t(i13);
        } else {
            int w11 = w(this.f36353a + CollectionsKt.l(this));
            if (w10 <= w11) {
                Object[] objArr5 = this.f36354b;
                AbstractC3574i.h(objArr5, objArr5, w10, w10 + 1, w11 + 1);
            } else {
                Object[] objArr6 = this.f36354b;
                AbstractC3574i.h(objArr6, objArr6, w10, w10 + 1, objArr6.length);
                Object[] objArr7 = this.f36354b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC3574i.h(objArr7, objArr7, 0, 1, w11 + 1);
            }
            this.f36354b[w11] = null;
        }
        this.f36355c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC3568c.f36342a.b(i10, size());
        return this.f36354b[w(this.f36353a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int w10 = w(this.f36353a + size());
        int i11 = this.f36353a;
        if (i11 < w10) {
            while (i11 < w10) {
                if (Intrinsics.b(obj, this.f36354b[i11])) {
                    i10 = this.f36353a;
                } else {
                    i11++;
                }
            }
            return -1;
        }
        if (i11 < w10) {
            return -1;
        }
        int length = this.f36354b.length;
        while (true) {
            if (i11 >= length) {
                for (int i12 = 0; i12 < w10; i12++) {
                    if (Intrinsics.b(obj, this.f36354b[i12])) {
                        i11 = i12 + this.f36354b.length;
                        i10 = this.f36353a;
                    }
                }
                return -1;
            }
            if (Intrinsics.b(obj, this.f36354b[i11])) {
                i10 = this.f36353a;
                break;
            }
            i11++;
        }
        return i11 - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int D10;
        int i10;
        int w10 = w(this.f36353a + size());
        int i11 = this.f36353a;
        if (i11 < w10) {
            D10 = w10 - 1;
            if (i11 <= D10) {
                while (!Intrinsics.b(obj, this.f36354b[D10])) {
                    if (D10 != i11) {
                        D10--;
                    }
                }
                i10 = this.f36353a;
                return D10 - i10;
            }
            return -1;
        }
        if (i11 > w10) {
            int i12 = w10 - 1;
            while (true) {
                if (-1 >= i12) {
                    D10 = AbstractC3574i.D(this.f36354b);
                    int i13 = this.f36353a;
                    if (i13 <= D10) {
                        while (!Intrinsics.b(obj, this.f36354b[D10])) {
                            if (D10 != i13) {
                                D10--;
                            }
                        }
                        i10 = this.f36353a;
                    }
                } else {
                    if (Intrinsics.b(obj, this.f36354b[i12])) {
                        D10 = i12 + this.f36354b.length;
                        i10 = this.f36353a;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int w10;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f36354b.length != 0) {
            int w11 = w(this.f36353a + size());
            int i10 = this.f36353a;
            if (i10 < w11) {
                w10 = i10;
                while (i10 < w11) {
                    Object obj = this.f36354b[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f36354b[w10] = obj;
                        w10++;
                    }
                    i10++;
                }
                AbstractC3574i.o(this.f36354b, null, w10, w11);
            } else {
                int length = this.f36354b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f36354b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f36354b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                w10 = w(i11);
                for (int i12 = 0; i12 < w11; i12++) {
                    Object[] objArr2 = this.f36354b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f36354b[w10] = obj3;
                        w10 = t(w10);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                A();
                this.f36355c = u(w10 - this.f36353a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        A();
        Object[] objArr = this.f36354b;
        int i10 = this.f36353a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f36353a = t(i10);
        this.f36355c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        A();
        int w10 = w(this.f36353a + CollectionsKt.l(this));
        Object[] objArr = this.f36354b;
        Object obj = objArr[w10];
        objArr[w10] = null;
        this.f36355c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        AbstractC3568c.f36342a.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            remove(i10);
            return;
        }
        A();
        if (i10 < size() - i11) {
            D(i10, i11);
            int w10 = w(this.f36353a + i12);
            v(this.f36353a, w10);
            this.f36353a = w10;
        } else {
            E(i10, i11);
            int w11 = w(this.f36353a + size());
            v(u(w11 - i12), w11);
        }
        this.f36355c = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int w10;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f36354b.length != 0) {
            int w11 = w(this.f36353a + size());
            int i10 = this.f36353a;
            if (i10 < w11) {
                w10 = i10;
                while (i10 < w11) {
                    Object obj = this.f36354b[i10];
                    if (elements.contains(obj)) {
                        this.f36354b[w10] = obj;
                        w10++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                AbstractC3574i.o(this.f36354b, null, w10, w11);
            } else {
                int length = this.f36354b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f36354b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f36354b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                w10 = w(i11);
                for (int i12 = 0; i12 < w11; i12++) {
                    Object[] objArr2 = this.f36354b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f36354b[w10] = obj3;
                        w10 = t(w10);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                A();
                this.f36355c = u(w10 - this.f36353a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        AbstractC3568c.f36342a.b(i10, size());
        int w10 = w(this.f36353a + i10);
        Object[] objArr = this.f36354b;
        Object obj2 = objArr[w10];
        objArr[w10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = C3575j.a(array, size());
        }
        int w10 = w(this.f36353a + size());
        int i10 = this.f36353a;
        if (i10 < w10) {
            AbstractC3574i.k(this.f36354b, array, 0, i10, w10, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f36354b;
            AbstractC3574i.h(objArr, array, 0, this.f36353a, objArr.length);
            Object[] objArr2 = this.f36354b;
            AbstractC3574i.h(objArr2, array, objArr2.length - this.f36353a, 0, w10);
        }
        return CollectionsKt.f(size(), array);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        AbstractC3568c.f36342a.c(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        A();
        r(size() + 1);
        int w10 = w(this.f36353a + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int m10 = m(w10);
            int m11 = m(this.f36353a);
            int i11 = this.f36353a;
            if (m10 >= i11) {
                Object[] objArr = this.f36354b;
                objArr[m11] = objArr[i11];
                AbstractC3574i.h(objArr, objArr, i11, i11 + 1, m10 + 1);
            } else {
                Object[] objArr2 = this.f36354b;
                AbstractC3574i.h(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f36354b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC3574i.h(objArr3, objArr3, 0, 1, m10 + 1);
            }
            this.f36354b[m10] = obj;
            this.f36353a = m11;
        } else {
            int w11 = w(this.f36353a + size());
            if (w10 < w11) {
                Object[] objArr4 = this.f36354b;
                AbstractC3574i.h(objArr4, objArr4, w10 + 1, w10, w11);
            } else {
                Object[] objArr5 = this.f36354b;
                AbstractC3574i.h(objArr5, objArr5, 1, 0, w11);
                Object[] objArr6 = this.f36354b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC3574i.h(objArr6, objArr6, w10 + 1, w10, objArr6.length - 1);
            }
            this.f36354b[w10] = obj;
        }
        this.f36355c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractC3568c.f36342a.c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        A();
        r(size() + elements.size());
        int w10 = w(this.f36353a + size());
        int w11 = w(this.f36353a + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f36353a;
            int i12 = i11 - size;
            if (w11 < i11) {
                Object[] objArr = this.f36354b;
                AbstractC3574i.h(objArr, objArr, i12, i11, objArr.length);
                if (size >= w11) {
                    Object[] objArr2 = this.f36354b;
                    AbstractC3574i.h(objArr2, objArr2, objArr2.length - size, 0, w11);
                } else {
                    Object[] objArr3 = this.f36354b;
                    AbstractC3574i.h(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f36354b;
                    AbstractC3574i.h(objArr4, objArr4, 0, size, w11);
                }
            } else if (i12 >= 0) {
                Object[] objArr5 = this.f36354b;
                AbstractC3574i.h(objArr5, objArr5, i12, i11, w11);
            } else {
                Object[] objArr6 = this.f36354b;
                i12 += objArr6.length;
                int i13 = w11 - i11;
                int length = objArr6.length - i12;
                if (length >= i13) {
                    AbstractC3574i.h(objArr6, objArr6, i12, i11, w11);
                } else {
                    AbstractC3574i.h(objArr6, objArr6, i12, i11, i11 + length);
                    Object[] objArr7 = this.f36354b;
                    AbstractC3574i.h(objArr7, objArr7, 0, this.f36353a + length, w11);
                }
            }
            this.f36353a = i12;
            h(u(w11 - size), elements);
        } else {
            int i14 = w11 + size;
            if (w11 < w10) {
                int i15 = size + w10;
                Object[] objArr8 = this.f36354b;
                if (i15 <= objArr8.length) {
                    AbstractC3574i.h(objArr8, objArr8, i14, w11, w10);
                } else if (i14 >= objArr8.length) {
                    AbstractC3574i.h(objArr8, objArr8, i14 - objArr8.length, w11, w10);
                } else {
                    int length2 = w10 - (i15 - objArr8.length);
                    AbstractC3574i.h(objArr8, objArr8, 0, length2, w10);
                    Object[] objArr9 = this.f36354b;
                    AbstractC3574i.h(objArr9, objArr9, i14, w11, length2);
                }
            } else {
                Object[] objArr10 = this.f36354b;
                AbstractC3574i.h(objArr10, objArr10, size, 0, w10);
                Object[] objArr11 = this.f36354b;
                if (i14 >= objArr11.length) {
                    AbstractC3574i.h(objArr11, objArr11, i14 - objArr11.length, w11, objArr11.length);
                } else {
                    AbstractC3574i.h(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f36354b;
                    AbstractC3574i.h(objArr12, objArr12, i14, w11, objArr12.length - size);
                }
            }
            h(w11, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
