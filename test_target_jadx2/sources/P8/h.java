package P8;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class h extends AbstractMap implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator f7592i = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Comparator f7593a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7594b;

    /* renamed from: c, reason: collision with root package name */
    e f7595c;

    /* renamed from: d, reason: collision with root package name */
    int f7596d;

    /* renamed from: e, reason: collision with root package name */
    int f7597e;

    /* renamed from: f, reason: collision with root package name */
    final e f7598f;

    /* renamed from: g, reason: collision with root package name */
    private b f7599g;

    /* renamed from: h, reason: collision with root package name */
    private c f7600h;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e c10;
            if (!(obj instanceof Map.Entry) || (c10 = h.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            h.this.f(c10, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f7596d;
        }
    }

    final class c extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a().f7614f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f7596d;
        }
    }

    private abstract class d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        e f7605a;

        /* renamed from: b, reason: collision with root package name */
        e f7606b = null;

        /* renamed from: c, reason: collision with root package name */
        int f7607c;

        d() {
            this.f7605a = h.this.f7598f.f7612d;
            this.f7607c = h.this.f7597e;
        }

        final e a() {
            e eVar = this.f7605a;
            h hVar = h.this;
            if (eVar == hVar.f7598f) {
                throw new NoSuchElementException();
            }
            if (hVar.f7597e != this.f7607c) {
                throw new ConcurrentModificationException();
            }
            this.f7605a = eVar.f7612d;
            this.f7606b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f7605a != h.this.f7598f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f7606b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            h.this.f(eVar, true);
            this.f7606b = null;
            this.f7607c = h.this.f7597e;
        }
    }

    public h() {
        this(f7592i, true);
    }

    private static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void e(e eVar, boolean z10) {
        while (eVar != null) {
            e eVar2 = eVar.f7610b;
            e eVar3 = eVar.f7611c;
            int i10 = eVar2 != null ? eVar2.f7617i : 0;
            int i11 = eVar3 != null ? eVar3.f7617i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e eVar4 = eVar3.f7610b;
                e eVar5 = eVar3.f7611c;
                int i13 = (eVar4 != null ? eVar4.f7617i : 0) - (eVar5 != null ? eVar5.f7617i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e eVar6 = eVar2.f7610b;
                e eVar7 = eVar2.f7611c;
                int i14 = (eVar6 != null ? eVar6.f7617i : 0) - (eVar7 != null ? eVar7.f7617i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f7617i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f7617i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f7609a;
        }
    }

    private void h(e eVar, e eVar2) {
        e eVar3 = eVar.f7609a;
        eVar.f7609a = null;
        if (eVar2 != null) {
            eVar2.f7609a = eVar3;
        }
        if (eVar3 == null) {
            this.f7595c = eVar2;
        } else if (eVar3.f7610b == eVar) {
            eVar3.f7610b = eVar2;
        } else {
            eVar3.f7611c = eVar2;
        }
    }

    private void i(e eVar) {
        e eVar2 = eVar.f7610b;
        e eVar3 = eVar.f7611c;
        e eVar4 = eVar3.f7610b;
        e eVar5 = eVar3.f7611c;
        eVar.f7611c = eVar4;
        if (eVar4 != null) {
            eVar4.f7609a = eVar;
        }
        h(eVar, eVar3);
        eVar3.f7610b = eVar;
        eVar.f7609a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f7617i : 0, eVar4 != null ? eVar4.f7617i : 0) + 1;
        eVar.f7617i = max;
        eVar3.f7617i = Math.max(max, eVar5 != null ? eVar5.f7617i : 0) + 1;
    }

    private void j(e eVar) {
        e eVar2 = eVar.f7610b;
        e eVar3 = eVar.f7611c;
        e eVar4 = eVar2.f7610b;
        e eVar5 = eVar2.f7611c;
        eVar.f7610b = eVar5;
        if (eVar5 != null) {
            eVar5.f7609a = eVar;
        }
        h(eVar, eVar2);
        eVar2.f7611c = eVar;
        eVar.f7609a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f7617i : 0, eVar5 != null ? eVar5.f7617i : 0) + 1;
        eVar.f7617i = max;
        eVar2.f7617i = Math.max(max, eVar4 != null ? eVar4.f7617i : 0) + 1;
    }

    e b(Object obj, boolean z10) {
        int i10;
        e eVar;
        Comparator comparator = this.f7593a;
        e eVar2 = this.f7595c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f7592i ? (Comparable) obj : null;
            while (true) {
                i10 = comparable != null ? comparable.compareTo(eVar2.f7614f) : comparator.compare(obj, eVar2.f7614f);
                if (i10 == 0) {
                    return eVar2;
                }
                e eVar3 = i10 < 0 ? eVar2.f7610b : eVar2.f7611c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        e eVar4 = this.f7598f;
        if (eVar2 != null) {
            eVar = new e(this.f7594b, eVar2, obj, eVar4, eVar4.f7613e);
            if (i10 < 0) {
                eVar2.f7610b = eVar;
            } else {
                eVar2.f7611c = eVar;
            }
            e(eVar2, true);
        } else {
            if (comparator == f7592i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.f7594b, eVar2, obj, eVar4, eVar4.f7613e);
            this.f7595c = eVar;
        }
        this.f7596d++;
        this.f7597e++;
        return eVar;
    }

    e c(Map.Entry entry) {
        e d10 = d(entry.getKey());
        if (d10 == null || !a(d10.f7616h, entry.getValue())) {
            return null;
        }
        return d10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f7595c = null;
        this.f7596d = 0;
        this.f7597e++;
        e eVar = this.f7598f;
        eVar.f7613e = eVar;
        eVar.f7612d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    e d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f7599g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f7599g = bVar2;
        return bVar2;
    }

    void f(e eVar, boolean z10) {
        int i10;
        if (z10) {
            e eVar2 = eVar.f7613e;
            eVar2.f7612d = eVar.f7612d;
            eVar.f7612d.f7613e = eVar2;
        }
        e eVar3 = eVar.f7610b;
        e eVar4 = eVar.f7611c;
        e eVar5 = eVar.f7609a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f7610b = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f7611c = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f7596d--;
            this.f7597e++;
            return;
        }
        e b10 = eVar3.f7617i > eVar4.f7617i ? eVar3.b() : eVar4.a();
        f(b10, false);
        e eVar6 = eVar.f7610b;
        if (eVar6 != null) {
            i10 = eVar6.f7617i;
            b10.f7610b = eVar6;
            eVar6.f7609a = b10;
            eVar.f7610b = null;
        } else {
            i10 = 0;
        }
        e eVar7 = eVar.f7611c;
        if (eVar7 != null) {
            i11 = eVar7.f7617i;
            b10.f7611c = eVar7;
            eVar7.f7609a = b10;
            eVar.f7611c = null;
        }
        b10.f7617i = Math.max(i10, i11) + 1;
        h(eVar, b10);
    }

    e g(Object obj) {
        e d10 = d(obj);
        if (d10 != null) {
            f(d10, true);
        }
        return d10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e d10 = d(obj);
        if (d10 != null) {
            return d10.f7616h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f7600h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f7600h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f7594b) {
            throw new NullPointerException("value == null");
        }
        e b10 = b(obj, true);
        Object obj3 = b10.f7616h;
        b10.f7616h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e g10 = g(obj);
        if (g10 != null) {
            return g10.f7616h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f7596d;
    }

    public h(boolean z10) {
        this(f7592i, z10);
    }

    public h(Comparator comparator, boolean z10) {
        this.f7596d = 0;
        this.f7597e = 0;
        this.f7593a = comparator == null ? f7592i : comparator;
        this.f7594b = z10;
        this.f7598f = new e(z10);
    }

    static final class e implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        e f7609a;

        /* renamed from: b, reason: collision with root package name */
        e f7610b;

        /* renamed from: c, reason: collision with root package name */
        e f7611c;

        /* renamed from: d, reason: collision with root package name */
        e f7612d;

        /* renamed from: e, reason: collision with root package name */
        e f7613e;

        /* renamed from: f, reason: collision with root package name */
        final Object f7614f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f7615g;

        /* renamed from: h, reason: collision with root package name */
        Object f7616h;

        /* renamed from: i, reason: collision with root package name */
        int f7617i;

        e(boolean z10) {
            this.f7614f = null;
            this.f7615g = z10;
            this.f7613e = this;
            this.f7612d = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f7610b; eVar2 != null; eVar2 = eVar2.f7610b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f7611c; eVar2 != null; eVar2 = eVar2.f7611c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f7614f;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f7616h;
            if (obj3 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!obj3.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f7614f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f7616h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f7614f;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f7616h;
            return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f7615g) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f7616h;
            this.f7616h = obj;
            return obj2;
        }

        public String toString() {
            return this.f7614f + "=" + this.f7616h;
        }

        e(boolean z10, e eVar, Object obj, e eVar2, e eVar3) {
            this.f7609a = eVar;
            this.f7614f = obj;
            this.f7615g = z10;
            this.f7617i = 1;
            this.f7612d = eVar2;
            this.f7613e = eVar3;
            eVar3.f7612d = this;
            eVar2.f7613e = this;
        }
    }
}
