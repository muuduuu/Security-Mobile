package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2136j0 extends AbstractC2161s implements InterfaceC2139k0, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private static final C2136j0 f24074c;

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC2139k0 f24075d;

    /* renamed from: b, reason: collision with root package name */
    private final List f24076b;

    static {
        C2136j0 c2136j0 = new C2136j0();
        f24074c = c2136j0;
        c2136j0.q();
        f24075d = c2136j0;
    }

    public C2136j0() {
        this(10);
    }

    private static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC2179y ? ((AbstractC2179y) obj).A() : AbstractC2115c0.h((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2161s, com.google.android.gms.internal.clearcut.InterfaceC2124f0
    public final /* bridge */ /* synthetic */ boolean H() {
        return super.H();
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2139k0
    public final InterfaceC2139k0 N1() {
        return H() ? new C2116c1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        c();
        this.f24076b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2161s, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        c();
        if (collection instanceof InterfaceC2139k0) {
            collection = ((InterfaceC2139k0) collection).o0();
        }
        boolean addAll = this.f24076b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2161s, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f24076b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2161s, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        Object obj = this.f24076b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2179y) {
            AbstractC2179y abstractC2179y = (AbstractC2179y) obj;
            String A10 = abstractC2179y.A();
            if (abstractC2179y.k()) {
                this.f24076b.set(i10, A10);
            }
            return A10;
        }
        byte[] bArr = (byte[]) obj;
        String h10 = AbstractC2115c0.h(bArr);
        if (AbstractC2115c0.g(bArr)) {
            this.f24076b.set(i10, h10);
        }
        return h10;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2161s, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2124f0
    public final /* synthetic */ InterfaceC2124f0 l1(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f24076b);
        return new C2136j0(arrayList);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2139k0
    public final List o0() {
        return Collections.unmodifiableList(this.f24076b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        c();
        Object remove = this.f24076b.remove(i10);
        ((AbstractList) this).modCount++;
        return e(remove);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2161s, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2161s, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2139k0
    public final Object s(int i10) {
        return this.f24076b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        c();
        return e(this.f24076b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24076b.size();
    }

    public C2136j0(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2161s, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2161s, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private C2136j0(ArrayList arrayList) {
        this.f24076b = arrayList;
    }
}
