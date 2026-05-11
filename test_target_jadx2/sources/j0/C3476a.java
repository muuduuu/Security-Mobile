package j0;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import k0.AbstractC3526a;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3476a extends i implements Map {

    /* renamed from: d, reason: collision with root package name */
    C0513a f35669d;

    /* renamed from: e, reason: collision with root package name */
    c f35670e;

    /* renamed from: f, reason: collision with root package name */
    e f35671f;

    /* renamed from: j0.a$a, reason: collision with other inner class name */
    final class C0513a extends AbstractSet {
        C0513a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C3476a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3476a.this.size();
        }
    }

    /* renamed from: j0.a$b */
    final class b extends j0.e {
        b() {
            super(C3476a.this.size());
        }

        @Override // j0.e
        protected Object a(int i10) {
            return C3476a.this.f(i10);
        }

        @Override // j0.e
        protected void b(int i10) {
            C3476a.this.h(i10);
        }
    }

    /* renamed from: j0.a$d */
    final class d implements Iterator, Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        int f35675a;

        /* renamed from: b, reason: collision with root package name */
        int f35676b = -1;

        /* renamed from: c, reason: collision with root package name */
        boolean f35677c;

        d() {
            this.f35675a = C3476a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f35676b++;
            this.f35677c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f35677c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC3526a.c(entry.getKey(), C3476a.this.f(this.f35676b)) && AbstractC3526a.c(entry.getValue(), C3476a.this.j(this.f35676b));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f35677c) {
                return C3476a.this.f(this.f35676b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f35677c) {
                return C3476a.this.j(this.f35676b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f35676b < this.f35675a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f35677c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object f10 = C3476a.this.f(this.f35676b);
            Object j10 = C3476a.this.j(this.f35676b);
            return (f10 == null ? 0 : f10.hashCode()) ^ (j10 != null ? j10.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f35677c) {
                throw new IllegalStateException();
            }
            C3476a.this.h(this.f35676b);
            this.f35676b--;
            this.f35675a--;
            this.f35677c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f35677c) {
                return C3476a.this.i(this.f35676b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: j0.a$f */
    final class f extends j0.e {
        f() {
            super(C3476a.this.size());
        }

        @Override // j0.e
        protected Object a(int i10) {
            return C3476a.this.j(i10);
        }

        @Override // j0.e
        protected void b(int i10) {
            C3476a.this.h(i10);
        }
    }

    public C3476a() {
    }

    static boolean m(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // j0.i, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // j0.i, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        C0513a c0513a = this.f35669d;
        if (c0513a != null) {
            return c0513a;
        }
        C0513a c0513a2 = new C0513a();
        this.f35669d = c0513a2;
        return c0513a2;
    }

    @Override // j0.i, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.f35670e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f35670e = cVar2;
        return cVar2;
    }

    public boolean l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean n(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    public boolean o(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(f(size2))) {
                h(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        b(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // j0.i, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f35671f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f35671f = eVar2;
        return eVar2;
    }

    public C3476a(int i10) {
        super(i10);
    }

    /* renamed from: j0.a$c */
    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C3476a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C3476a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return C3476a.this.l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C3476a.m(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i10 = 0;
            for (int size = C3476a.this.size() - 1; size >= 0; size--) {
                Object f10 = C3476a.this.f(size);
                i10 += f10 == null ? 0 : f10.hashCode();
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C3476a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C3476a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int d10 = C3476a.this.d(obj);
            if (d10 < 0) {
                return false;
            }
            C3476a.this.h(d10);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return C3476a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return C3476a.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C3476a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C3476a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C3476a.this.f(i10);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C3476a.this.f(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* renamed from: j0.a$e */
    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C3476a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C3476a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C3476a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C3476a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int a10 = C3476a.this.a(obj);
            if (a10 < 0) {
                return false;
            }
            C3476a.this.h(a10);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = C3476a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(C3476a.this.j(i10))) {
                    C3476a.this.h(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = C3476a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(C3476a.this.j(i10))) {
                    C3476a.this.h(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return C3476a.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C3476a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C3476a.this.j(i10);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C3476a.this.j(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public C3476a(i iVar) {
        super(iVar);
    }
}
