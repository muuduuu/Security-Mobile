package com.google.android.gms.internal.vision;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
abstract class O1 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private final int f25062a;

    /* renamed from: b, reason: collision with root package name */
    private List f25063b;

    /* renamed from: c, reason: collision with root package name */
    private Map f25064c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25065d;

    /* renamed from: e, reason: collision with root package name */
    private volatile V1 f25066e;

    /* renamed from: f, reason: collision with root package name */
    private Map f25067f;

    /* renamed from: g, reason: collision with root package name */
    private volatile P1 f25068g;

    private O1(int i10) {
        this.f25062a = i10;
        this.f25063b = Collections.emptyList();
        this.f25064c = Collections.emptyMap();
        this.f25067f = Collections.emptyMap();
    }

    private final int a(Comparable comparable) {
        int i10;
        int size = this.f25063b.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo((Comparable) ((T1) this.f25063b.get(i11)).getKey());
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
            int compareTo2 = comparable.compareTo((Comparable) ((T1) this.f25063b.get(i13)).getKey());
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

    static O1 b(int i10) {
        return new N1(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(int i10) {
        q();
        Object value = ((T1) this.f25063b.remove(i10)).getValue();
        if (!this.f25064c.isEmpty()) {
            Iterator it = r().entrySet().iterator();
            this.f25063b.add(new T1(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        if (this.f25065d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap r() {
        q();
        if (this.f25064c.isEmpty() && !(this.f25064c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f25064c = treeMap;
            this.f25067f = treeMap.descendingMap();
        }
        return (SortedMap) this.f25064c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        q();
        if (!this.f25063b.isEmpty()) {
            this.f25063b.clear();
        }
        if (this.f25064c.isEmpty()) {
            return;
        }
        this.f25064c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f25064c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        q();
        int a10 = a(comparable);
        if (a10 >= 0) {
            return ((T1) this.f25063b.get(a10)).setValue(obj);
        }
        q();
        if (this.f25063b.isEmpty() && !(this.f25063b instanceof ArrayList)) {
            this.f25063b = new ArrayList(this.f25062a);
        }
        int i10 = -(a10 + 1);
        if (i10 >= this.f25062a) {
            return r().put(comparable, obj);
        }
        int size = this.f25063b.size();
        int i11 = this.f25062a;
        if (size == i11) {
            T1 t12 = (T1) this.f25063b.remove(i11 - 1);
            r().put((Comparable) t12.getKey(), t12.getValue());
        }
        this.f25063b.add(i10, new T1(this, comparable, obj));
        return null;
    }

    public void e() {
        if (this.f25065d) {
            return;
        }
        this.f25064c = this.f25064c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f25064c);
        this.f25067f = this.f25067f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f25067f);
        this.f25065d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f25066e == null) {
            this.f25066e = new V1(this, null);
        }
        return this.f25066e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O1)) {
            return super.equals(obj);
        }
        O1 o12 = (O1) obj;
        int size = size();
        if (size != o12.size()) {
            return false;
        }
        int j10 = j();
        if (j10 != o12.j()) {
            return entrySet().equals(o12.entrySet());
        }
        for (int i10 = 0; i10 < j10; i10++) {
            if (!h(i10).equals(o12.h(i10))) {
                return false;
            }
        }
        if (j10 != size) {
            return this.f25064c.equals(o12.f25064c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        return a10 >= 0 ? ((T1) this.f25063b.get(a10)).getValue() : this.f25064c.get(comparable);
    }

    public final Map.Entry h(int i10) {
        return (Map.Entry) this.f25063b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int j10 = j();
        int i10 = 0;
        for (int i11 = 0; i11 < j10; i11++) {
            i10 += ((T1) this.f25063b.get(i11)).hashCode();
        }
        return this.f25064c.size() > 0 ? i10 + this.f25064c.hashCode() : i10;
    }

    public final boolean i() {
        return this.f25065d;
    }

    public final int j() {
        return this.f25063b.size();
    }

    public final Iterable n() {
        return this.f25064c.isEmpty() ? S1.a() : this.f25064c.entrySet();
    }

    final Set p() {
        if (this.f25068g == null) {
            this.f25068g = new P1(this, null);
        }
        return this.f25068g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        q();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return l(a10);
        }
        if (this.f25064c.isEmpty()) {
            return null;
        }
        return this.f25064c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f25063b.size() + this.f25064c.size();
    }

    /* synthetic */ O1(int i10, N1 n12) {
        this(i10);
    }
}
