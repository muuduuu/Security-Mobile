package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2221e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f24482a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2230f f24483b;

    C2221e(C2230f c2230f) {
        Objects.requireNonNull(c2230f);
        this.f24483b = c2230f;
        this.f24482a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24482a < this.f24483b.w();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C2230f c2230f = this.f24483b;
        if (this.f24482a < c2230f.w()) {
            int i10 = this.f24482a;
            this.f24482a = i10 + 1;
            return c2230f.B(i10);
        }
        int i11 = this.f24482a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i11);
        throw new NoSuchElementException(sb2.toString());
    }
}
