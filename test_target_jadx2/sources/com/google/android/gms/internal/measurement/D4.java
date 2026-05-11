package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
abstract class D4 implements F4 {
    D4() {
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
