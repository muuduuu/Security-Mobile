package com.google.common.collect;

import com.google.common.collect.h;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class j implements Map, Serializable {

    /* renamed from: d, reason: collision with root package name */
    static final Map.Entry[] f27891d = new Map.Entry[0];

    /* renamed from: a, reason: collision with root package name */
    private transient k f27892a;

    /* renamed from: b, reason: collision with root package name */
    private transient k f27893b;

    /* renamed from: c, reason: collision with root package name */
    private transient h f27894c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Comparator f27895a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f27896b;

        /* renamed from: c, reason: collision with root package name */
        int f27897c;

        /* renamed from: d, reason: collision with root package name */
        boolean f27898d;

        /* renamed from: e, reason: collision with root package name */
        C0410a f27899e;

        /* renamed from: com.google.common.collect.j$a$a, reason: collision with other inner class name */
        static final class C0410a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f27900a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f27901b;

            /* renamed from: c, reason: collision with root package name */
            private final Object f27902c;

            C0410a(Object obj, Object obj2, Object obj3) {
                this.f27900a = obj;
                this.f27901b = obj2;
                this.f27902c = obj3;
            }

            IllegalArgumentException a() {
                String valueOf = String.valueOf(this.f27900a);
                String valueOf2 = String.valueOf(this.f27901b);
                String valueOf3 = String.valueOf(this.f27900a);
                String valueOf4 = String.valueOf(this.f27902c);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb2.append("Multiple entries with same key: ");
                sb2.append(valueOf);
                sb2.append("=");
                sb2.append(valueOf2);
                sb2.append(" and ");
                sb2.append(valueOf3);
                sb2.append("=");
                sb2.append(valueOf4);
                return new IllegalArgumentException(sb2.toString());
            }
        }

        public a() {
            this(4);
        }

        private j b(boolean z10) {
            Object[] objArr;
            C0410a c0410a;
            C0410a c0410a2;
            if (z10 && (c0410a2 = this.f27899e) != null) {
                throw c0410a2.a();
            }
            int i10 = this.f27897c;
            if (this.f27895a == null) {
                objArr = this.f27896b;
            } else {
                if (this.f27898d) {
                    this.f27896b = Arrays.copyOf(this.f27896b, i10 * 2);
                }
                objArr = this.f27896b;
                if (!z10) {
                    objArr = e(objArr, this.f27897c);
                    if (objArr.length < this.f27896b.length) {
                        i10 = objArr.length >>> 1;
                    }
                }
                j(objArr, i10, this.f27895a);
            }
            this.f27898d = true;
            u o10 = u.o(i10, objArr, this);
            if (!z10 || (c0410a = this.f27899e) == null) {
                return o10;
            }
            throw c0410a.a();
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f27896b;
            if (i11 > objArr.length) {
                this.f27896b = Arrays.copyOf(objArr, h.b.a(objArr.length, i11));
                this.f27898d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static void j(Object[] objArr, int i10, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, r.a(comparator).b(o.c()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public j a() {
            return c();
        }

        public j c() {
            return b(true);
        }

        public a f(Object obj, Object obj2) {
            d(this.f27897c + 1);
            d.a(obj, obj2);
            Object[] objArr = this.f27896b;
            int i10 = this.f27897c;
            objArr[i10 * 2] = obj;
            objArr[(i10 * 2) + 1] = obj2;
            this.f27897c = i10 + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.f27897c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }

        public a i(Map map) {
            return h(map.entrySet());
        }

        a(int i10) {
            this.f27896b = new Object[i10 * 2];
            this.f27897c = 0;
            this.f27898d = false;
        }
    }

    j() {
    }

    public static a a() {
        return new a();
    }

    public static j b(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static j h() {
        return u.f27909h;
    }

    public static j i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        d.a(obj, obj2);
        d.a(obj3, obj4);
        d.a(obj5, obj6);
        d.a(obj7, obj8);
        return u.n(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static j j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        d.a(obj, obj2);
        d.a(obj3, obj4);
        d.a(obj5, obj6);
        d.a(obj7, obj8);
        d.a(obj9, obj10);
        return u.n(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static j l(Map.Entry... entryArr) {
        return b(Arrays.asList(entryArr));
    }

    abstract k c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract k d();

    abstract h e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return o.a(this, obj);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public k entrySet() {
        k kVar = this.f27892a;
        if (kVar != null) {
            return kVar;
        }
        k c10 = c();
        this.f27892a = c10;
        return c10;
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public k keySet() {
        k kVar = this.f27893b;
        if (kVar != null) {
            return kVar;
        }
        k d10 = d();
        this.f27893b = d10;
        return d10;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return w.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public h values() {
        h hVar = this.f27894c;
        if (hVar != null) {
            return hVar;
        }
        h e10 = e();
        this.f27894c = e10;
        return e10;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return o.b(this);
    }
}
