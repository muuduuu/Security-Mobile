package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class I0 extends AbstractC2039c0 implements RandomAccess, J0 {

    /* renamed from: c, reason: collision with root package name */
    private static final I0 f23609c;

    /* renamed from: d, reason: collision with root package name */
    public static final J0 f23610d;

    /* renamed from: b, reason: collision with root package name */
    private final List f23611b;

    static {
        I0 i02 = new I0(false);
        f23609c = i02;
        f23610d = i02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.f23611b = arrayList;
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC2081q0 ? ((AbstractC2081q0) obj).w(G0.f23597b) : G0.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        c();
        this.f23611b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2039c0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        c();
        if (collection instanceof J0) {
            collection = ((J0) collection).i();
        }
        boolean addAll = this.f23611b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2039c0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f23611b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.f23611b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2081q0) {
            AbstractC2081q0 abstractC2081q0 = (AbstractC2081q0) obj;
            String w10 = abstractC2081q0.w(G0.f23597b);
            if (abstractC2081q0.r()) {
                this.f23611b.set(i10, w10);
            }
            return w10;
        }
        byte[] bArr = (byte[]) obj;
        String d10 = G0.d(bArr);
        if (F1.b(bArr)) {
            this.f23611b.set(i10, d10);
        }
        return d10;
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final J0 g() {
        return a() ? new C2099w1(this) : this;
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final List i() {
        return Collections.unmodifiableList(this.f23611b);
    }

    @Override // com.google.android.gms.internal.auth.E0
    public final /* bridge */ /* synthetic */ E0 l(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f23611b);
        return new I0(arrayList);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2039c0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        Object remove = this.f23611b.remove(i10);
        ((AbstractList) this).modCount++;
        return h(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        c();
        return h(this.f23611b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23611b.size();
    }

    private I0(ArrayList arrayList) {
        super(true);
        this.f23611b = arrayList;
    }

    private I0(boolean z10) {
        super(false);
        this.f23611b = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2039c0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
