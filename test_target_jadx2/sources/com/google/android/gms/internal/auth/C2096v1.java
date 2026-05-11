package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.auth.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2096v1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f23782a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2099w1 f23783b;

    C2096v1(C2099w1 c2099w1) {
        J0 j02;
        this.f23783b = c2099w1;
        j02 = c2099w1.f23784a;
        this.f23782a = j02.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23782a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f23782a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
