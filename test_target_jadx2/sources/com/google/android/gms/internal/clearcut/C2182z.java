package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.clearcut.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2182z implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f24114a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f24115b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ AbstractC2179y f24116c;

    C2182z(AbstractC2179y abstractC2179y) {
        this.f24116c = abstractC2179y;
        this.f24115b = abstractC2179y.size();
    }

    private final byte e() {
        try {
            AbstractC2179y abstractC2179y = this.f24116c;
            int i10 = this.f24114a;
            this.f24114a = i10 + 1;
            return abstractC2179y.v(i10);
        } catch (IndexOutOfBoundsException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24114a < this.f24115b;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(e());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
