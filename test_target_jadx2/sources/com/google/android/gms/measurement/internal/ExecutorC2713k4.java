package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.measurement.internal.k4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ExecutorC2713k4 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2642b5 f26144a;

    ExecutorC2713k4(C2642b5 c2642b5) {
        Objects.requireNonNull(c2642b5);
        this.f26144a = c2642b5;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f26144a.f25694a.b().t(runnable);
    }
}
