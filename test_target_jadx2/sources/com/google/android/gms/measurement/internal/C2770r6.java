package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.r6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2770r6 {

    /* renamed from: a, reason: collision with root package name */
    private RunnableC2763q6 f26313a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2810w6 f26314b;

    C2770r6(C2810w6 c2810w6) {
        Objects.requireNonNull(c2810w6);
        this.f26314b = c2810w6;
    }

    final void a() {
        C2810w6 c2810w6 = this.f26314b;
        c2810w6.h();
        RunnableC2763q6 runnableC2763q6 = this.f26313a;
        if (runnableC2763q6 != null) {
            c2810w6.t().removeCallbacks(runnableC2763q6);
        }
        C2760q3 c2760q3 = c2810w6.f25694a;
        c2760q3.x().f25647t.b(false);
        c2810w6.o(false);
        if (c2760q3.w().H(null, AbstractC2671f2.f25976U0)) {
            C2760q3 c2760q32 = c2810w6.f25694a;
            if (c2760q32.B().v0()) {
                c2760q3.a().w().a("Retrying trigger URI registration in foreground");
                c2760q32.B().x0();
            }
        }
    }

    final void b(long j10) {
        C2810w6 c2810w6 = this.f26314b;
        this.f26313a = new RunnableC2763q6(this, c2810w6.f25694a.f().a(), j10);
        c2810w6.t().postDelayed(this.f26313a, 2000L);
    }
}
