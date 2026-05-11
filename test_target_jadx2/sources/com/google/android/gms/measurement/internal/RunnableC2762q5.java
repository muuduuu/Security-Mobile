package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.q5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2762q5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f26295a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2793u5 f26296b;

    RunnableC2762q5(C2793u5 c2793u5, long j10) {
        this.f26295a = j10;
        Objects.requireNonNull(c2793u5);
        this.f26296b = c2793u5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2793u5 c2793u5 = this.f26296b;
        c2793u5.f25694a.M().k(this.f26295a);
        c2793u5.f26379e = null;
    }
}
