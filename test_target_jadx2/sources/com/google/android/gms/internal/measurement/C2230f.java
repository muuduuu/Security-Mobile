package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2230f implements Iterable, InterfaceC2329q, InterfaceC2293m {

    /* renamed from: a, reason: collision with root package name */
    final SortedMap f24497a;

    /* renamed from: b, reason: collision with root package name */
    final Map f24498b;

    public C2230f() {
        this.f24497a = new TreeMap();
        this.f24498b = new TreeMap();
    }

    public final int A() {
        return this.f24497a.size();
    }

    public final InterfaceC2329q B(int i10) {
        InterfaceC2329q interfaceC2329q;
        if (i10 < w()) {
            return (!E(i10) || (interfaceC2329q = (InterfaceC2329q) this.f24497a.get(Integer.valueOf(i10))) == null) ? InterfaceC2329q.f24620U : interfaceC2329q;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void D(int i10, InterfaceC2329q interfaceC2329q) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Out of bounds index: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (interfaceC2329q == null) {
            this.f24497a.remove(Integer.valueOf(i10));
        } else {
            this.f24497a.put(Integer.valueOf(i10), interfaceC2329q);
        }
    }

    public final boolean E(int i10) {
        if (i10 >= 0) {
            SortedMap sortedMap = this.f24497a;
            if (i10 <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i10));
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final void F() {
        this.f24497a.clear();
    }

    public final void G(int i10, InterfaceC2329q interfaceC2329q) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Invalid value index: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 >= w()) {
            D(i10, interfaceC2329q);
            return;
        }
        SortedMap sortedMap = this.f24497a;
        for (int intValue = ((Integer) sortedMap.lastKey()).intValue(); intValue >= i10; intValue--) {
            Integer valueOf = Integer.valueOf(intValue);
            InterfaceC2329q interfaceC2329q2 = (InterfaceC2329q) sortedMap.get(valueOf);
            if (interfaceC2329q2 != null) {
                D(intValue + 1, interfaceC2329q2);
                sortedMap.remove(valueOf);
            }
        }
        D(i10, interfaceC2329q);
    }

    public final void I(int i10) {
        SortedMap sortedMap = this.f24497a;
        int intValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i10 > intValue || i10 < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i10));
        if (i10 == intValue) {
            int i11 = i10 - 1;
            Integer valueOf = Integer.valueOf(i11);
            if (sortedMap.containsKey(valueOf) || i11 < 0) {
                return;
            }
            sortedMap.put(valueOf, InterfaceC2329q.f24620U);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i10);
            InterfaceC2329q interfaceC2329q = (InterfaceC2329q) sortedMap.get(valueOf2);
            if (interfaceC2329q != null) {
                sortedMap.put(Integer.valueOf(i10 - 1), interfaceC2329q);
                sortedMap.remove(valueOf2);
            }
        }
    }

    public final String J(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f24497a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? BuildConfig.FLAVOR : str;
                if (i10 >= w()) {
                    break;
                }
                InterfaceC2329q B10 = B(i10);
                sb2.append(str2);
                if (!(B10 instanceof C2373v) && !(B10 instanceof C2311o)) {
                    sb2.append(B10.a());
                }
                i10++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final String a() {
        return J(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2293m
    public final InterfaceC2329q e(String str) {
        InterfaceC2329q interfaceC2329q;
        return "length".equals(str) ? new C2266j(Double.valueOf(w())) : (!t(str) || (interfaceC2329q = (InterfaceC2329q) this.f24498b.get(str)) == null) ? InterfaceC2329q.f24620U : interfaceC2329q;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2230f)) {
            return false;
        }
        C2230f c2230f = (C2230f) obj;
        if (w() != c2230f.w()) {
            return false;
        }
        SortedMap sortedMap = this.f24497a;
        if (sortedMap.isEmpty()) {
            return c2230f.f24497a.isEmpty();
        }
        for (int intValue = ((Integer) sortedMap.firstKey()).intValue(); intValue <= ((Integer) sortedMap.lastKey()).intValue(); intValue++) {
            if (!B(intValue).equals(c2230f.B(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Double f() {
        SortedMap sortedMap = this.f24497a;
        return sortedMap.size() == 1 ? B(0).f() : sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Boolean g() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final Iterator h() {
        return new C2212d(this, this.f24497a.keySet().iterator(), this.f24498b.keySet().iterator());
    }

    public final int hashCode() {
        return this.f24497a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2221e(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q j() {
        C2230f c2230f = new C2230f();
        for (Map.Entry entry : this.f24497a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2293m) {
                c2230f.f24497a.put((Integer) entry.getKey(), (InterfaceC2329q) entry.getValue());
            } else {
                c2230f.f24497a.put((Integer) entry.getKey(), ((InterfaceC2329q) entry.getValue()).j());
            }
        }
        return c2230f;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2293m
    public final void k(String str, InterfaceC2329q interfaceC2329q) {
        if (interfaceC2329q == null) {
            this.f24498b.remove(str);
        } else {
            this.f24498b.put(str, interfaceC2329q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q m(String str, Y1 y12, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? D.a(str, this, y12, list) : InterfaceC2293m.c(this, new C2364u(str), y12, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2293m
    public final boolean t(String str) {
        return "length".equals(str) || this.f24498b.containsKey(str);
    }

    public final String toString() {
        return J(",");
    }

    public final List u() {
        ArrayList arrayList = new ArrayList(w());
        for (int i10 = 0; i10 < w(); i10++) {
            arrayList.add(B(i10));
        }
        return arrayList;
    }

    public final Iterator v() {
        return this.f24497a.keySet().iterator();
    }

    public final int w() {
        SortedMap sortedMap = this.f24497a;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public C2230f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                D(i10, (InterfaceC2329q) list.get(i10));
            }
        }
    }
}
