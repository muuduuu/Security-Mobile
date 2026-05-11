package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2346s implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f24647a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2364u f24648b;

    C2346s(C2364u c2364u) {
        Objects.requireNonNull(c2364u);
        this.f24648b = c2364u;
        this.f24647a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24647a < this.f24648b.c().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String c10 = this.f24648b.c();
        int i10 = this.f24647a;
        if (i10 >= c10.length()) {
            throw new NoSuchElementException();
        }
        this.f24647a = i10 + 1;
        return new C2364u(String.valueOf(i10));
    }
}
