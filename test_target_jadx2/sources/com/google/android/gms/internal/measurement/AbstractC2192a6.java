package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.a6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2192a6 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f24447a;

    /* renamed from: b, reason: collision with root package name */
    private int f24448b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24450d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Z5 f24451e;

    /* renamed from: c, reason: collision with root package name */
    private Map f24449c = Collections.emptyMap();

    /* renamed from: f, reason: collision with root package name */
    private Map f24452f = Collections.emptyMap();

    /* synthetic */ AbstractC2192a6(byte[] bArr) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object g(int i10) {
        h();
        Object value = ((X5) this.f24447a[i10]).getValue();
        Object[] objArr = this.f24447a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f24448b - i10) - 1);
        this.f24448b--;
        if (!this.f24449c.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            Object[] objArr2 = this.f24447a;
            int i11 = this.f24448b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new X5(this, (Comparable) entry.getKey(), entry.getValue());
            this.f24448b++;
            it.remove();
        }
        return value;
    }

    private final int n(Comparable comparable) {
        int i10 = this.f24448b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((X5) this.f24447a[i11]).b());
            if (compareTo > 0) {
                return -(i10 + 1);
            }
            if (compareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = comparable.compareTo(((X5) this.f24447a[i13]).b());
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void h() {
        if (this.f24450d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap p() {
        h();
        if (this.f24449c.isEmpty() && !(this.f24449c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f24449c = treeMap;
            this.f24452f = treeMap.descendingMap();
        }
        return (SortedMap) this.f24449c;
    }

    public void a() {
        if (this.f24450d) {
            return;
        }
        this.f24449c = this.f24449c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f24449c);
        this.f24452f = this.f24452f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f24452f);
        this.f24450d = true;
    }

    public final boolean b() {
        return this.f24450d;
    }

    public final int c() {
        return this.f24448b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.f24448b != 0) {
            this.f24447a = null;
            this.f24448b = 0;
        }
        if (this.f24449c.isEmpty()) {
            return;
        }
        this.f24449c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return n(comparable) >= 0 || this.f24449c.containsKey(comparable);
    }

    public final Map.Entry d(int i10) {
        if (i10 < this.f24448b) {
            return (X5) this.f24447a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final Iterable e() {
        return this.f24449c.isEmpty() ? Collections.emptySet() : this.f24449c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f24451e == null) {
            this.f24451e = new Z5(this, null);
        }
        return this.f24451e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2192a6)) {
            return super.equals(obj);
        }
        AbstractC2192a6 abstractC2192a6 = (AbstractC2192a6) obj;
        int size = size();
        if (size != abstractC2192a6.size()) {
            return false;
        }
        int i10 = this.f24448b;
        if (i10 != abstractC2192a6.f24448b) {
            return entrySet().equals(abstractC2192a6.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!d(i11).equals(abstractC2192a6.d(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f24449c.equals(abstractC2192a6.f24449c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int n10 = n(comparable);
        if (n10 >= 0) {
            return ((X5) this.f24447a[n10]).setValue(obj);
        }
        h();
        if (this.f24447a == null) {
            this.f24447a = new Object[16];
        }
        int i10 = -(n10 + 1);
        if (i10 >= 16) {
            return p().put(comparable, obj);
        }
        if (this.f24448b == 16) {
            X5 x52 = (X5) this.f24447a[15];
            this.f24448b = 15;
            p().put(x52.b(), x52.getValue());
        }
        Object[] objArr = this.f24447a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f24447a[i10] = new X5(this, comparable, obj);
        this.f24448b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int n10 = n(comparable);
        return n10 >= 0 ? ((X5) this.f24447a[n10]).getValue() : this.f24449c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f24448b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += this.f24447a[i12].hashCode();
        }
        return this.f24449c.size() > 0 ? i11 + this.f24449c.hashCode() : i11;
    }

    final /* synthetic */ Object[] i() {
        return this.f24447a;
    }

    final /* synthetic */ int j() {
        return this.f24448b;
    }

    final /* synthetic */ Map l() {
        return this.f24449c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int n10 = n(comparable);
        if (n10 >= 0) {
            return g(n10);
        }
        if (this.f24449c.isEmpty()) {
            return null;
        }
        return this.f24449c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f24448b + this.f24449c.size();
    }
}
