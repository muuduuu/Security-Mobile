package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
final class F implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f25388a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ G f25389b;

    F(G g10) {
        Objects.requireNonNull(g10);
        this.f25389b = g10;
        this.f25388a = g10.a1().keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f25388a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25388a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
