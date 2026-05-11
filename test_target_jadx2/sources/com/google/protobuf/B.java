package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class B extends AbstractC2872c implements C, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private static final B f28666c;

    /* renamed from: d, reason: collision with root package name */
    public static final C f28667d;

    /* renamed from: b, reason: collision with root package name */
    private final List f28668b;

    static {
        B b10 = new B();
        f28666c = b10;
        b10.x();
        f28667d = b10;
    }

    public B() {
        this(10);
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC2877h ? ((AbstractC2877h) obj).G() : AbstractC2893y.i((byte[]) obj);
    }

    @Override // com.google.protobuf.C
    public C K() {
        return N() ? new l0(this) : this;
    }

    @Override // com.google.protobuf.AbstractC2872c, com.google.protobuf.AbstractC2893y.b
    public /* bridge */ /* synthetic */ boolean N() {
        return super.N();
    }

    @Override // com.google.protobuf.AbstractC2872c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.AbstractC2872c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        this.f28668b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        c();
        this.f28668b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC2872c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.protobuf.AbstractC2872c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f28668b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2877h) {
            AbstractC2877h abstractC2877h = (AbstractC2877h) obj;
            String G10 = abstractC2877h.G();
            if (abstractC2877h.u()) {
                this.f28668b.set(i10, G10);
            }
            return G10;
        }
        byte[] bArr = (byte[]) obj;
        String i11 = AbstractC2893y.i(bArr);
        if (AbstractC2893y.g(bArr)) {
            this.f28668b.set(i10, i11);
        }
        return i11;
    }

    @Override // com.google.protobuf.AbstractC2893y.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public B y(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f28668b);
        return new B(arrayList);
    }

    @Override // com.google.protobuf.AbstractC2872c, java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        c();
        Object remove = this.f28668b.remove(i10);
        ((AbstractList) this).modCount++;
        return h(remove);
    }

    @Override // com.google.protobuf.C
    public List o() {
        return Collections.unmodifiableList(this.f28668b);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        c();
        return h(this.f28668b.set(i10, str));
    }

    @Override // com.google.protobuf.AbstractC2872c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC2872c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.protobuf.C
    public Object s(int i10) {
        return this.f28668b.get(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28668b.size();
    }

    public B(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.google.protobuf.AbstractC2872c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC2872c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        c();
        if (collection instanceof C) {
            collection = ((C) collection).o();
        }
        boolean addAll = this.f28668b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.AbstractC2872c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private B(ArrayList arrayList) {
        this.f28668b = arrayList;
    }
}
