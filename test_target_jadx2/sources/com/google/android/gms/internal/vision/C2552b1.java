package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2552b1 extends AbstractC2547a0 implements InterfaceC2560d1, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private static final C2552b1 f25103c;

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC2560d1 f25104d;

    /* renamed from: b, reason: collision with root package name */
    private final List f25105b;

    static {
        C2552b1 c2552b1 = new C2552b1();
        f25103c = c2552b1;
        c2552b1.zzb();
        f25104d = c2552b1;
    }

    public C2552b1() {
        this(10);
    }

    private static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC2570g0 ? ((AbstractC2570g0) obj).B() : R0.i((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        c();
        this.f25105b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.vision.X0
    public final /* synthetic */ X0 b(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f25105b);
        return new C2552b1(arrayList);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f25105b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2560d1
    public final List f() {
        return Collections.unmodifiableList(this.f25105b);
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2560d1
    public final InterfaceC2560d1 g() {
        return zza() ? new f2(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        Object obj = this.f25105b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2570g0) {
            AbstractC2570g0 abstractC2570g0 = (AbstractC2570g0) obj;
            String B10 = abstractC2570g0.B();
            if (abstractC2570g0.a()) {
                this.f25105b.set(i10, B10);
            }
            return B10;
        }
        byte[] bArr = (byte[]) obj;
        String i11 = R0.i(bArr);
        if (R0.h(bArr)) {
            this.f25105b.set(i10, i11);
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2560d1
    public final Object n(int i10) {
        return this.f25105b.get(i10);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        c();
        return e(this.f25105b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25105b.size();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC2560d1
    public final void z1(AbstractC2570g0 abstractC2570g0) {
        c();
        this.f25105b.add(abstractC2570g0);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, com.google.android.gms.internal.vision.X0
    public final /* bridge */ /* synthetic */ boolean zza() {
        return super.zza();
    }

    public C2552b1(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        c();
        if (collection instanceof InterfaceC2560d1) {
            collection = ((InterfaceC2560d1) collection).f();
        }
        boolean addAll = this.f25105b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        c();
        Object remove = this.f25105b.remove(i10);
        ((AbstractList) this).modCount++;
        return e(remove);
    }

    private C2552b1(ArrayList arrayList) {
        this.f25105b = arrayList;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2547a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }
}
