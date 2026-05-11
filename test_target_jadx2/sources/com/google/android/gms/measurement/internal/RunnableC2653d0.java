package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2653d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f25870a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E0 f25871b;

    RunnableC2653d0(E0 e02, long j10) {
        this.f25870a = j10;
        Objects.requireNonNull(e02);
        this.f25871b = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25871b.n(this.f25870a);
    }
}
