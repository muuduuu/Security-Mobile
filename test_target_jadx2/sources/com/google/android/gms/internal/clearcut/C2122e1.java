package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.clearcut.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2122e1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f24040a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2116c1 f24041b;

    C2122e1(C2116c1 c2116c1) {
        InterfaceC2139k0 interfaceC2139k0;
        this.f24041b = c2116c1;
        interfaceC2139k0 = c2116c1.f24023a;
        this.f24040a = interfaceC2139k0.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24040a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f24040a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
