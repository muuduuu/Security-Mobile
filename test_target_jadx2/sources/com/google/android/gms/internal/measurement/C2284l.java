package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2284l implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f24557a;

    C2284l(Iterator it) {
        this.f24557a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24557a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C2364u((String) this.f24557a.next());
    }
}
