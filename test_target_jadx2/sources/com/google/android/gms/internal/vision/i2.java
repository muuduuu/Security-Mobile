package com.google.android.gms.internal.vision;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class i2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f25167a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ f2 f25168b;

    i2(f2 f2Var) {
        InterfaceC2560d1 interfaceC2560d1;
        this.f25168b = f2Var;
        interfaceC2560d1 = f2Var.f25131a;
        this.f25167a = interfaceC2560d1.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25167a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f25167a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
