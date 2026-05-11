package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.h6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2691h6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b7 f26093a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f26094b;

    RunnableC2691h6(C2731m6 c2731m6, b7 b7Var, Runnable runnable) {
        this.f26093a = b7Var;
        this.f26094b = runnable;
        Objects.requireNonNull(c2731m6);
    }

    @Override // java.lang.Runnable
    public final void run() {
        b7 b7Var = this.f26093a;
        b7Var.E();
        b7Var.D(this.f26094b);
        b7Var.r();
    }
}
