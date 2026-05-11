package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class i0 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private List f16388a;

    /* renamed from: b, reason: collision with root package name */
    private Map f16389b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16390c;

    /* renamed from: d, reason: collision with root package name */
    private volatile f f16391d;

    /* renamed from: e, reason: collision with root package name */
    private Map f16392e;

    /* renamed from: f, reason: collision with root package name */
    private volatile c f16393f;

    class a extends i0 {
        a() {
            super(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.s((Comparable) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public void q() {
            if (!p()) {
                if (l() > 0) {
                    android.support.v4.media.session.b.a(j(0).getKey());
                    throw null;
                }
                Iterator it = n().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.q();
        }
    }

    private class c extends f {
        private c() {
            super(i0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(i0.this, null);
        }

        /* synthetic */ c(i0 i0Var, a aVar) {
            this();
        }
    }

    private class d implements Map.Entry, Comparable {

        /* renamed from: a, reason: collision with root package name */
        private final Comparable f16398a;

        /* renamed from: b, reason: collision with root package name */
        private Object f16399b;

        d(i0 i0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean c(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f16398a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c(this.f16398a, entry.getKey()) && c(this.f16399b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f16399b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f16398a;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f16399b;
            return hashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            i0.this.g();
            Object obj2 = this.f16399b;
            this.f16399b = obj;
            return obj2;
        }

        public String toString() {
            return this.f16398a + "=" + this.f16399b;
        }

        d(Comparable comparable, Object obj) {
            this.f16398a = comparable;
            this.f16399b = obj;
        }
    }

    private class f extends AbstractSet {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            i0.this.s((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(i0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            i0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i0.this.size();
        }

        /* synthetic */ f(i0 i0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ i0(a aVar) {
        this();
    }

    private int f(Comparable comparable) {
        int i10;
        int size = this.f16388a.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((d) this.f16388a.get(i11)).getKey());
            if (compareTo > 0) {
                i10 = size + 1;
                return -i10;
            }
            if (compareTo == 0) {
                return i11;
            }
        }
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = comparable.compareTo(((d) this.f16388a.get(i13)).getKey());
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        i10 = i12 + 1;
        return -i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f16390c) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f16388a.isEmpty() || (this.f16388a instanceof ArrayList)) {
            return;
        }
        this.f16388a = new ArrayList(16);
    }

    private SortedMap o() {
        g();
        if (this.f16389b.isEmpty() && !(this.f16389b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16389b = treeMap;
            this.f16392e = treeMap.descendingMap();
        }
        return (SortedMap) this.f16389b;
    }

    static i0 r() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object t(int i10) {
        g();
        Object value = ((d) this.f16388a.remove(i10)).getValue();
        if (!this.f16389b.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            this.f16388a.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f16388a.isEmpty()) {
            this.f16388a.clear();
        }
        if (this.f16389b.isEmpty()) {
            return;
        }
        this.f16389b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f16389b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f16391d == null) {
            this.f16391d = new f(this, null);
        }
        return this.f16391d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        int size = size();
        if (size != i0Var.size()) {
            return false;
        }
        int l10 = l();
        if (l10 != i0Var.l()) {
            return entrySet().equals(i0Var.entrySet());
        }
        for (int i10 = 0; i10 < l10; i10++) {
            if (!j(i10).equals(i0Var.j(i10))) {
                return false;
            }
        }
        if (l10 != size) {
            return this.f16389b.equals(i0Var.f16389b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        return f10 >= 0 ? ((d) this.f16388a.get(f10)).getValue() : this.f16389b.get(comparable);
    }

    Set h() {
        if (this.f16393f == null) {
            this.f16393f = new c(this, null);
        }
        return this.f16393f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int l10 = l();
        int i10 = 0;
        for (int i11 = 0; i11 < l10; i11++) {
            i10 += ((d) this.f16388a.get(i11)).hashCode();
        }
        return m() > 0 ? i10 + this.f16389b.hashCode() : i10;
    }

    public Map.Entry j(int i10) {
        return (Map.Entry) this.f16388a.get(i10);
    }

    public int l() {
        return this.f16388a.size();
    }

    public int m() {
        return this.f16389b.size();
    }

    public Iterable n() {
        return this.f16389b.isEmpty() ? Collections.emptySet() : this.f16389b.entrySet();
    }

    public boolean p() {
        return this.f16390c;
    }

    public void q() {
        if (this.f16390c) {
            return;
        }
        this.f16389b = this.f16389b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f16389b);
        this.f16392e = this.f16392e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f16392e);
        this.f16390c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return t(f10);
        }
        if (this.f16389b.isEmpty()) {
            return null;
        }
        return this.f16389b.remove(comparable);
    }

    public Object s(Comparable comparable, Object obj) {
        g();
        int f10 = f(comparable);
        if (f10 >= 0) {
            return ((d) this.f16388a.get(f10)).setValue(obj);
        }
        i();
        int i10 = -(f10 + 1);
        if (i10 >= 16) {
            return o().put(comparable, obj);
        }
        if (this.f16388a.size() == 16) {
            d dVar = (d) this.f16388a.remove(15);
            o().put(dVar.getKey(), dVar.getValue());
        }
        this.f16388a.add(i10, new d(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f16388a.size() + this.f16389b.size();
    }

    private class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private int f16394a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator f16395b;

        private b() {
            this.f16394a = i0.this.f16388a.size();
        }

        private Iterator a() {
            if (this.f16395b == null) {
                this.f16395b = i0.this.f16392e.entrySet().iterator();
            }
            return this.f16395b;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = i0.this.f16388a;
            int i10 = this.f16394a - 1;
            this.f16394a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f16394a;
            return (i10 > 0 && i10 <= i0.this.f16388a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(i0 i0Var, a aVar) {
            this();
        }
    }

    private class e implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private int f16401a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f16402b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator f16403c;

        private e() {
            this.f16401a = -1;
        }

        private Iterator a() {
            if (this.f16403c == null) {
                this.f16403c = i0.this.f16389b.entrySet().iterator();
            }
            return this.f16403c;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f16402b = true;
            int i10 = this.f16401a + 1;
            this.f16401a = i10;
            return i10 < i0.this.f16388a.size() ? (Map.Entry) i0.this.f16388a.get(this.f16401a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16401a + 1 >= i0.this.f16388a.size()) {
                return !i0.this.f16389b.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f16402b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f16402b = false;
            i0.this.g();
            if (this.f16401a >= i0.this.f16388a.size()) {
                a().remove();
                return;
            }
            i0 i0Var = i0.this;
            int i10 = this.f16401a;
            this.f16401a = i10 - 1;
            i0Var.t(i10);
        }

        /* synthetic */ e(i0 i0Var, a aVar) {
            this();
        }
    }

    private i0() {
        this.f16388a = Collections.emptyList();
        this.f16389b = Collections.emptyMap();
        this.f16392e = Collections.emptyMap();
    }
}
