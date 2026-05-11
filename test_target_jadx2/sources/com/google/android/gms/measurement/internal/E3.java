package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class E3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f25380a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ S3 f25381b;

    E3(S3 s32, n7 n7Var) {
        this.f25380a = n7Var;
        Objects.requireNonNull(s32);
        this.f25381b = s32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        S3 s32 = this.f25381b;
        s32.r1().E();
        return new C2748p(s32.r1().S0(this.f25380a.f26197a));
    }
}
