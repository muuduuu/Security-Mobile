package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.auth.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2051g0 extends AbstractC2057i0 {

    /* renamed from: a, reason: collision with root package name */
    private int f23710a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f23711b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2081q0 f23712c;

    C2051g0(AbstractC2081q0 abstractC2081q0) {
        this.f23712c = abstractC2081q0;
        this.f23711b = abstractC2081q0.h();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23710a < this.f23711b;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2066l0
    public final byte zza() {
        int i10 = this.f23710a;
        if (i10 >= this.f23711b) {
            throw new NoSuchElementException();
        }
        this.f23710a = i10 + 1;
        return this.f23712c.e(i10);
    }
}
