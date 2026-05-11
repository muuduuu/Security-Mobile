package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2355t implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f24655a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2364u f24656b;

    C2355t(C2364u c2364u) {
        Objects.requireNonNull(c2364u);
        this.f24656b = c2364u;
        this.f24655a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24655a < this.f24656b.c().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C2364u c2364u = this.f24656b;
        String c10 = c2364u.c();
        int i10 = this.f24655a;
        if (i10 >= c10.length()) {
            throw new NoSuchElementException();
        }
        this.f24655a = i10 + 1;
        return new C2364u(String.valueOf(c2364u.c().charAt(i10)));
    }
}
