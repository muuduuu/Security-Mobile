package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes3.dex */
abstract class u extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private final int f36549a;

    /* renamed from: b, reason: collision with root package name */
    private List f36550b;

    /* renamed from: c, reason: collision with root package name */
    private Map f36551c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36552d;

    /* renamed from: e, reason: collision with root package name */
    private volatile e f36553e;

    static class a extends u {
        a(int i10) {
            super(i10, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.u
        public void n() {
            if (!m()) {
                for (int i10 = 0; i10 < i(); i10++) {
                    Map.Entry h10 = h(i10);
                    if (((h.b) h10.getKey()).j()) {
                        h10.setValue(Collections.unmodifiableList((List) h10.getValue()));
                    }
                }
                for (Map.Entry entry : j()) {
                    if (((h.b) entry.getKey()).j()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.n();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.p((h.b) obj, obj2);
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator f36554a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable f36555b = new C0533b();

        static class a implements Iterator {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.u$b$b, reason: collision with other inner class name */
        static class C0533b implements Iterable {
            C0533b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return b.f36554a;
            }
        }

        static Iterable b() {
            return f36555b;
        }
    }

    private class c implements Comparable, Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        private final Comparable f36556a;

        /* renamed from: b, reason: collision with root package name */
        private Object f36557b;

        c(u uVar, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean c(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f36556a;
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
            return c(this.f36556a, entry.getKey()) && c(this.f36557b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f36557b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f36556a;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f36557b;
            return hashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            u.this.f();
            Object obj2 = this.f36557b;
            this.f36557b = obj;
            return obj2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f36556a);
            String valueOf2 = String.valueOf(this.f36557b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append("=");
            sb2.append(valueOf2);
            return sb2.toString();
        }

        c(Comparable comparable, Object obj) {
            this.f36556a = comparable;
            this.f36557b = obj;
        }
    }

    private class e extends AbstractSet {
        private e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            u.this.p((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = u.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new d(u.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            u.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.size();
        }

        /* synthetic */ e(u uVar, a aVar) {
            this();
        }
    }

    /* synthetic */ u(int i10, a aVar) {
        this(i10);
    }

    private int e(Comparable comparable) {
        int i10;
        int size = this.f36550b.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((c) this.f36550b.get(i11)).getKey());
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
            int compareTo2 = comparable.compareTo(((c) this.f36550b.get(i13)).getKey());
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
    public void f() {
        if (this.f36552d) {
            throw new UnsupportedOperationException();
        }
    }

    private void g() {
        f();
        if (!this.f36550b.isEmpty() || (this.f36550b instanceof ArrayList)) {
            return;
        }
        this.f36550b = new ArrayList(this.f36549a);
    }

    private SortedMap l() {
        f();
        if (this.f36551c.isEmpty() && !(this.f36551c instanceof TreeMap)) {
            this.f36551c = new TreeMap();
        }
        return (SortedMap) this.f36551c;
    }

    static u o(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object q(int i10) {
        f();
        Object value = ((c) this.f36550b.remove(i10)).getValue();
        if (!this.f36551c.isEmpty()) {
            Iterator it = l().entrySet().iterator();
            this.f36550b.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f36550b.isEmpty()) {
            this.f36550b.clear();
        }
        if (this.f36551c.isEmpty()) {
            return;
        }
        this.f36551c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f36551c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f36553e == null) {
            this.f36553e = new e(this, null);
        }
        return this.f36553e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        return e10 >= 0 ? ((c) this.f36550b.get(e10)).getValue() : this.f36551c.get(comparable);
    }

    public Map.Entry h(int i10) {
        return (Map.Entry) this.f36550b.get(i10);
    }

    public int i() {
        return this.f36550b.size();
    }

    public Iterable j() {
        return this.f36551c.isEmpty() ? b.b() : this.f36551c.entrySet();
    }

    public boolean m() {
        return this.f36552d;
    }

    public void n() {
        if (this.f36552d) {
            return;
        }
        this.f36551c = this.f36551c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f36551c);
        this.f36552d = true;
    }

    public Object p(Comparable comparable, Object obj) {
        f();
        int e10 = e(comparable);
        if (e10 >= 0) {
            return ((c) this.f36550b.get(e10)).setValue(obj);
        }
        g();
        int i10 = -(e10 + 1);
        if (i10 >= this.f36549a) {
            return l().put(comparable, obj);
        }
        int size = this.f36550b.size();
        int i11 = this.f36549a;
        if (size == i11) {
            c cVar = (c) this.f36550b.remove(i11 - 1);
            l().put(cVar.getKey(), cVar.getValue());
        }
        this.f36550b.add(i10, new c(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        if (e10 >= 0) {
            return q(e10);
        }
        if (this.f36551c.isEmpty()) {
            return null;
        }
        return this.f36551c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f36550b.size() + this.f36551c.size();
    }

    private class d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private int f36559a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f36560b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator f36561c;

        private d() {
            this.f36559a = -1;
        }

        private Iterator a() {
            if (this.f36561c == null) {
                this.f36561c = u.this.f36551c.entrySet().iterator();
            }
            return this.f36561c;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f36560b = true;
            int i10 = this.f36559a + 1;
            this.f36559a = i10;
            return i10 < u.this.f36550b.size() ? (Map.Entry) u.this.f36550b.get(this.f36559a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36559a + 1 < u.this.f36550b.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f36560b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f36560b = false;
            u.this.f();
            if (this.f36559a >= u.this.f36550b.size()) {
                a().remove();
                return;
            }
            u uVar = u.this;
            int i10 = this.f36559a;
            this.f36559a = i10 - 1;
            uVar.q(i10);
        }

        /* synthetic */ d(u uVar, a aVar) {
            this();
        }
    }

    private u(int i10) {
        this.f36549a = i10;
        this.f36550b = Collections.emptyList();
        this.f36551c = Collections.emptyMap();
    }
}
