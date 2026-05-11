package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2524v2 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private final int f24960a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24963d;

    /* renamed from: e, reason: collision with root package name */
    private volatile C2514t2 f24964e;

    /* renamed from: b, reason: collision with root package name */
    private List f24961b = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    private Map f24962c = Collections.emptyMap();

    /* renamed from: f, reason: collision with root package name */
    private Map f24965f = Collections.emptyMap();

    private final int l(Comparable comparable) {
        int size = this.f24961b.size();
        int i10 = size - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((C2495p2) this.f24961b.get(i10)).b());
            if (compareTo > 0) {
                return -(size + 1);
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((C2495p2) this.f24961b.get(i12)).b());
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(int i10) {
        o();
        Object value = ((C2495p2) this.f24961b.remove(i10)).getValue();
        if (!this.f24962c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            List list = this.f24961b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C2495p2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap n() {
        o();
        if (this.f24962c.isEmpty() && !(this.f24962c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f24962c = treeMap;
            this.f24965f = treeMap.descendingMap();
        }
        return (SortedMap) this.f24962c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.f24963d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f24963d) {
            return;
        }
        this.f24962c = this.f24962c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f24962c);
        this.f24965f = this.f24965f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f24965f);
        this.f24963d = true;
    }

    public final int b() {
        return this.f24961b.size();
    }

    public final Iterable c() {
        return this.f24962c.isEmpty() ? AbstractC2490o2.a() : this.f24962c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (!this.f24961b.isEmpty()) {
            this.f24961b.clear();
        }
        if (this.f24962c.isEmpty()) {
            return;
        }
        this.f24962c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.f24962c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        o();
        int l10 = l(comparable);
        if (l10 >= 0) {
            return ((C2495p2) this.f24961b.get(l10)).setValue(obj);
        }
        o();
        if (this.f24961b.isEmpty() && !(this.f24961b instanceof ArrayList)) {
            this.f24961b = new ArrayList(this.f24960a);
        }
        int i10 = -(l10 + 1);
        if (i10 >= this.f24960a) {
            return n().put(comparable, obj);
        }
        int size = this.f24961b.size();
        int i11 = this.f24960a;
        if (size == i11) {
            C2495p2 c2495p2 = (C2495p2) this.f24961b.remove(i11 - 1);
            n().put(c2495p2.b(), c2495p2.getValue());
        }
        this.f24961b.add(i10, new C2495p2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f24964e == null) {
            this.f24964e = new C2514t2(this, null);
        }
        return this.f24964e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2524v2)) {
            return super.equals(obj);
        }
        AbstractC2524v2 abstractC2524v2 = (AbstractC2524v2) obj;
        int size = size();
        if (size != abstractC2524v2.size()) {
            return false;
        }
        int b10 = b();
        if (b10 != abstractC2524v2.b()) {
            return entrySet().equals(abstractC2524v2.entrySet());
        }
        for (int i10 = 0; i10 < b10; i10++) {
            if (!g(i10).equals(abstractC2524v2.g(i10))) {
                return false;
            }
        }
        if (b10 != size) {
            return this.f24962c.equals(abstractC2524v2.f24962c);
        }
        return true;
    }

    public final Map.Entry g(int i10) {
        return (Map.Entry) this.f24961b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int l10 = l(comparable);
        return l10 >= 0 ? ((C2495p2) this.f24961b.get(l10)).getValue() : this.f24962c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b10 = b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10; i11++) {
            i10 += ((C2495p2) this.f24961b.get(i11)).hashCode();
        }
        return this.f24962c.size() > 0 ? i10 + this.f24962c.hashCode() : i10;
    }

    public final boolean j() {
        return this.f24963d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int l10 = l(comparable);
        if (l10 >= 0) {
            return m(l10);
        }
        if (this.f24962c.isEmpty()) {
            return null;
        }
        return this.f24962c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f24961b.size() + this.f24962c.size();
    }
}
