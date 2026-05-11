package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.auth.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2099w1 extends AbstractList implements RandomAccess, J0 {

    /* renamed from: a, reason: collision with root package name */
    private final J0 f23784a;

    public C2099w1(J0 j02) {
        this.f23784a = j02;
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final J0 g() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((I0) this.f23784a).get(i10);
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final List i() {
        return this.f23784a.i();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2096v1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C2093u1(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23784a.size();
    }
}
