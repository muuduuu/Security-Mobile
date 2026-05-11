package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3701b implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    c f37502a;

    /* renamed from: b, reason: collision with root package name */
    private c f37503b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f37504c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    private int f37505d = 0;

    /* renamed from: n.b$a */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.C3701b.e
        c b(c cVar) {
            return cVar.f37509d;
        }

        @Override // n.C3701b.e
        c c(c cVar) {
            return cVar.f37508c;
        }
    }

    /* renamed from: n.b$b, reason: collision with other inner class name */
    private static class C0567b extends e {
        C0567b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.C3701b.e
        c b(c cVar) {
            return cVar.f37508c;
        }

        @Override // n.C3701b.e
        c c(c cVar) {
            return cVar.f37509d;
        }
    }

    /* renamed from: n.b$c */
    static class c implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        final Object f37506a;

        /* renamed from: b, reason: collision with root package name */
        final Object f37507b;

        /* renamed from: c, reason: collision with root package name */
        c f37508c;

        /* renamed from: d, reason: collision with root package name */
        c f37509d;

        c(Object obj, Object obj2) {
            this.f37506a = obj;
            this.f37507b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f37506a.equals(cVar.f37506a) && this.f37507b.equals(cVar.f37507b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f37506a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f37507b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f37506a.hashCode() ^ this.f37507b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f37506a + "=" + this.f37507b;
        }
    }

    /* renamed from: n.b$d */
    public class d extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private c f37510a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f37511b = true;

        d() {
        }

        @Override // n.C3701b.f
        void a(c cVar) {
            c cVar2 = this.f37510a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f37509d;
                this.f37510a = cVar3;
                this.f37511b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f37511b) {
                this.f37511b = false;
                this.f37510a = C3701b.this.f37502a;
            } else {
                c cVar = this.f37510a;
                this.f37510a = cVar != null ? cVar.f37508c : null;
            }
            return this.f37510a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f37511b) {
                return C3701b.this.f37502a != null;
            }
            c cVar = this.f37510a;
            return (cVar == null || cVar.f37508c == null) ? false : true;
        }
    }

    /* renamed from: n.b$e */
    private static abstract class e extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        c f37513a;

        /* renamed from: b, reason: collision with root package name */
        c f37514b;

        e(c cVar, c cVar2) {
            this.f37513a = cVar2;
            this.f37514b = cVar;
        }

        private c f() {
            c cVar = this.f37514b;
            c cVar2 = this.f37513a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // n.C3701b.f
        public void a(c cVar) {
            if (this.f37513a == cVar && cVar == this.f37514b) {
                this.f37514b = null;
                this.f37513a = null;
            }
            c cVar2 = this.f37513a;
            if (cVar2 == cVar) {
                this.f37513a = b(cVar2);
            }
            if (this.f37514b == cVar) {
                this.f37514b = f();
            }
        }

        abstract c b(c cVar);

        abstract c c(c cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f37514b;
            this.f37514b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37514b != null;
        }
    }

    /* renamed from: n.b$f */
    public static abstract class f {
        abstract void a(c cVar);
    }

    public Iterator c() {
        C0567b c0567b = new C0567b(this.f37503b, this.f37502a);
        this.f37504c.put(c0567b, Boolean.FALSE);
        return c0567b;
    }

    public Map.Entry e() {
        return this.f37502a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3701b)) {
            return false;
        }
        C3701b c3701b = (C3701b) obj;
        if (size() != c3701b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c3701b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    protected c h(Object obj) {
        c cVar = this.f37502a;
        while (cVar != null && !cVar.f37506a.equals(obj)) {
            cVar = cVar.f37508c;
        }
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((Map.Entry) it.next()).hashCode();
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f37502a, this.f37503b);
        this.f37504c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public d j() {
        d dVar = new d();
        this.f37504c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry k() {
        return this.f37503b;
    }

    c m(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f37505d++;
        c cVar2 = this.f37503b;
        if (cVar2 == null) {
            this.f37502a = cVar;
            this.f37503b = cVar;
            return cVar;
        }
        cVar2.f37508c = cVar;
        cVar.f37509d = cVar2;
        this.f37503b = cVar;
        return cVar;
    }

    public Object r(Object obj, Object obj2) {
        c h10 = h(obj);
        if (h10 != null) {
            return h10.f37507b;
        }
        m(obj, obj2);
        return null;
    }

    public int size() {
        return this.f37505d;
    }

    public Object t(Object obj) {
        c h10 = h(obj);
        if (h10 == null) {
            return null;
        }
        this.f37505d--;
        if (!this.f37504c.isEmpty()) {
            Iterator it = this.f37504c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(h10);
            }
        }
        c cVar = h10.f37509d;
        if (cVar != null) {
            cVar.f37508c = h10.f37508c;
        } else {
            this.f37502a = h10.f37508c;
        }
        c cVar2 = h10.f37508c;
        if (cVar2 != null) {
            cVar2.f37509d = cVar;
        } else {
            this.f37503b = cVar;
        }
        h10.f37508c = null;
        h10.f37509d = null;
        return h10.f37507b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
