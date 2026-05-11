package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.n6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2739n6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f26190a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2810w6 f26191b;

    RunnableC2739n6(C2810w6 c2810w6, long j10) {
        this.f26190a = j10;
        Objects.requireNonNull(c2810w6);
        this.f26191b = c2810w6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26191b.r(this.f26190a);
    }
}
