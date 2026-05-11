package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
final class C4 extends D4 {

    /* renamed from: a, reason: collision with root package name */
    private int f24203a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24204b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ J4 f24205c;

    C4(J4 j42) {
        Objects.requireNonNull(j42);
        this.f24205c = j42;
        this.f24203a = 0;
        this.f24204b = j42.h();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24203a < this.f24204b;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    public final byte zza() {
        int i10 = this.f24203a;
        if (i10 >= this.f24204b) {
            throw new NoSuchElementException();
        }
        this.f24203a = i10 + 1;
        return this.f24205c.e(i10);
    }
}
