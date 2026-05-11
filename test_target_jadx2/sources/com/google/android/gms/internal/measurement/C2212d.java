package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2212d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f24473a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f24474b;

    C2212d(C2230f c2230f, Iterator it, Iterator it2) {
        this.f24473a = it;
        this.f24474b = it2;
        Objects.requireNonNull(c2230f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f24473a.hasNext()) {
            return true;
        }
        return this.f24474b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f24473a;
        if (it.hasNext()) {
            return new C2364u(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f24474b;
        if (it2.hasNext()) {
            return new C2364u((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
