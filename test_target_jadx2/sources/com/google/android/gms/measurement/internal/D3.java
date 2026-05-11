package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import java.util.Objects;

/* loaded from: classes2.dex */
final class D3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n7 f25358a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ S3 f25359b;

    D3(S3 s32, n7 n7Var) {
        this.f25358a = n7Var;
        Objects.requireNonNull(s32);
        this.f25359b = s32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S3 s32 = this.f25359b;
        s32.r1().E();
        b7 r12 = s32.r1();
        r12.b().h();
        r12.O0();
        n7 n7Var = this.f25358a;
        AbstractC1287s.g(n7Var.f26197a);
        r12.P0(n7Var);
        r12.Q0(n7Var);
    }
}
