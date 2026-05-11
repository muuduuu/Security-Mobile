package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: io.sentry.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3408f extends AbstractCollection implements Queue, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient Object[] f35120a;

    /* renamed from: b, reason: collision with root package name */
    private transient int f35121b = 0;

    /* renamed from: c, reason: collision with root package name */
    private transient int f35122c = 0;

    /* renamed from: d, reason: collision with root package name */
    private transient boolean f35123d = false;

    /* renamed from: e, reason: collision with root package name */
    private final int f35124e;

    /* renamed from: io.sentry.f$a */
    class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private int f35125a;

        /* renamed from: b, reason: collision with root package name */
        private int f35126b = -1;

        /* renamed from: c, reason: collision with root package name */
        private boolean f35127c;

        a() {
            this.f35125a = C3408f.this.f35121b;
            this.f35127c = C3408f.this.f35123d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f35127c || this.f35125a != C3408f.this.f35122c;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f35127c = false;
            int i10 = this.f35125a;
            this.f35126b = i10;
            this.f35125a = C3408f.this.w(i10);
            return C3408f.this.f35120a[this.f35126b];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i10 = this.f35126b;
            if (i10 == -1) {
                throw new IllegalStateException();
            }
            if (i10 == C3408f.this.f35121b) {
                C3408f.this.remove();
                this.f35126b = -1;
                return;
            }
            int i11 = this.f35126b + 1;
            if (C3408f.this.f35121b >= this.f35126b || i11 >= C3408f.this.f35122c) {
                while (i11 != C3408f.this.f35122c) {
                    if (i11 >= C3408f.this.f35124e) {
                        C3408f.this.f35120a[i11 - 1] = C3408f.this.f35120a[0];
                        i11 = 0;
                    } else {
                        C3408f.this.f35120a[C3408f.this.v(i11)] = C3408f.this.f35120a[i11];
                        i11 = C3408f.this.w(i11);
                    }
                }
            } else {
                System.arraycopy(C3408f.this.f35120a, i11, C3408f.this.f35120a, this.f35126b, C3408f.this.f35122c - i11);
            }
            this.f35126b = -1;
            C3408f c3408f = C3408f.this;
            c3408f.f35122c = c3408f.v(c3408f.f35122c);
            C3408f.this.f35120a[C3408f.this.f35122c] = null;
            C3408f.this.f35123d = false;
            this.f35125a = C3408f.this.v(this.f35125a);
        }
    }

    C3408f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i10];
        this.f35120a = objArr;
        this.f35124e = objArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v(int i10) {
        int i11 = i10 - 1;
        return i11 < 0 ? this.f35124e - 1 : i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int w(int i10) {
        int i11 = i10 + 1;
        if (i11 >= this.f35124e) {
            return 0;
        }
        return i11;
    }

    public boolean A() {
        return size() == this.f35124e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if (A()) {
            remove();
        }
        Object[] objArr = this.f35120a;
        int i10 = this.f35122c;
        int i11 = i10 + 1;
        this.f35122c = i11;
        objArr[i10] = obj;
        if (i11 >= this.f35124e) {
            this.f35122c = 0;
        }
        if (this.f35122c == this.f35121b) {
            this.f35123d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f35123d = false;
        this.f35121b = 0;
        this.f35122c = 0;
        Arrays.fill(this.f35120a, (Object) null);
    }

    @Override // java.util.Queue
    public Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        return add(obj);
    }

    @Override // java.util.Queue
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f35120a[this.f35121b];
    }

    @Override // java.util.Queue
    public Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        Object[] objArr = this.f35120a;
        int i10 = this.f35121b;
        Object obj = objArr[i10];
        if (obj != null) {
            int i11 = i10 + 1;
            this.f35121b = i11;
            objArr[i10] = null;
            if (i11 >= this.f35124e) {
                this.f35121b = 0;
            }
            this.f35123d = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i10 = this.f35122c;
        int i11 = this.f35121b;
        if (i10 < i11) {
            return (this.f35124e - i11) + i10;
        }
        if (i10 == i11) {
            return this.f35123d ? this.f35124e : 0;
        }
        return i10 - i11;
    }
}
