package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.o6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2747o6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f26232a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2810w6 f26233b;

    RunnableC2747o6(C2810w6 c2810w6, long j10) {
        this.f26232a = j10;
        Objects.requireNonNull(c2810w6);
        this.f26233b = c2810w6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26233b.s(this.f26232a);
    }
}
