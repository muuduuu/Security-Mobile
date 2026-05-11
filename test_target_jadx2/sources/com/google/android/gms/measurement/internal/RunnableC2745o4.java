package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.o4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2745o4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2642b5 f26226a;

    RunnableC2745o4(C2642b5 c2642b5) {
        Objects.requireNonNull(c2642b5);
        this.f26226a = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26226a.f25802r.a();
    }
}
