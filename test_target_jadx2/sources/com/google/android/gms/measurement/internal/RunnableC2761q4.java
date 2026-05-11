package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.q4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2761q4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f26293a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2642b5 f26294b;

    RunnableC2761q4(C2642b5 c2642b5, long j10) {
        this.f26293a = j10;
        Objects.requireNonNull(c2642b5);
        this.f26294b = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2760q3 c2760q3 = this.f26294b.f25694a;
        N2 n22 = c2760q3.x().f25639l;
        long j10 = this.f26293a;
        n22.b(j10);
        c2760q3.a().v().b("Session timeout duration set", Long.valueOf(j10));
    }
}
