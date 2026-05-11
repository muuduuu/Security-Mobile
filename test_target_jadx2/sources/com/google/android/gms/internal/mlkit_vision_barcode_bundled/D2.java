package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class D2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f24744a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E2 f24745b;

    D2(E2 e22) {
        InterfaceC2533x1 interfaceC2533x1;
        this.f24745b = e22;
        interfaceC2533x1 = e22.f24755a;
        this.f24744a = interfaceC2533x1.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24744a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f24744a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
