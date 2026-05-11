package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2528w1 extends AbstractC2493p0 implements RandomAccess, InterfaceC2533x1 {

    /* renamed from: c, reason: collision with root package name */
    private static final C2528w1 f24973c;

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC2533x1 f24974d;

    /* renamed from: b, reason: collision with root package name */
    private final List f24975b;

    static {
        C2528w1 c2528w1 = new C2528w1(false);
        f24973c = c2528w1;
        f24974d = c2528w1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2528w1(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.f24975b = arrayList;
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof E0 ? ((E0) obj).J(AbstractC2489o1.f24885b) : AbstractC2489o1.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        c();
        this.f24975b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        c();
        if (collection instanceof InterfaceC2533x1) {
            collection = ((InterfaceC2533x1) collection).d();
        }
        boolean addAll = this.f24975b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f24975b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2533x1
    public final List d() {
        return Collections.unmodifiableList(this.f24975b);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.f24975b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof E0) {
            E0 e02 = (E0) obj;
            String J10 = e02.J(AbstractC2489o1.f24885b);
            if (e02.B()) {
                this.f24975b.set(i10, J10);
            }
            return J10;
        }
        byte[] bArr = (byte[]) obj;
        String d10 = AbstractC2489o1.d(bArr);
        if (O2.g(bArr)) {
            this.f24975b.set(i10, d10);
        }
        return d10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2533x1
    public final InterfaceC2533x1 g() {
        return a() ? new E2(this) : this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2484n1
    public final /* bridge */ /* synthetic */ InterfaceC2484n1 l(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f24975b);
        return new C2528w1(arrayList);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        Object remove = this.f24975b.remove(i10);
        ((AbstractList) this).modCount++;
        return h(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        c();
        return h(this.f24975b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24975b.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2533x1
    public final Object z(int i10) {
        return this.f24975b.get(i10);
    }

    private C2528w1(ArrayList arrayList) {
        super(true);
        this.f24975b = arrayList;
    }

    private C2528w1(boolean z10) {
        super(false);
        this.f24975b = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2493p0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
