package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.q6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2763q6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final long f26297a;

    /* renamed from: b, reason: collision with root package name */
    final long f26298b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2770r6 f26299c;

    RunnableC2763q6(C2770r6 c2770r6, long j10, long j11) {
        Objects.requireNonNull(c2770r6);
        this.f26299c = c2770r6;
        this.f26297a = j10;
        this.f26298b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26299c.f26314b.f25694a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.p6
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                RunnableC2763q6 runnableC2763q6 = RunnableC2763q6.this;
                C2810w6 c2810w6 = runnableC2763q6.f26299c.f26314b;
                c2810w6.h();
                C2760q3 c2760q3 = c2810w6.f25694a;
                c2760q3.a().v().a("Application going to the background");
                c2760q3.x().f25647t.b(true);
                c2810w6.o(true);
                if (!c2760q3.w().N()) {
                    long j10 = runnableC2763q6.f26298b;
                    C2794u6 c2794u6 = c2810w6.f26444f;
                    c2794u6.d(false, false, j10);
                    c2794u6.b(j10);
                }
                c2760q3.a().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(runnableC2763q6.f26297a));
                C2760q3 c2760q32 = c2810w6.f25694a;
                C2642b5 B10 = c2760q32.B();
                B10.h();
                C2760q3 c2760q33 = B10.f25694a;
                B10.j();
                C2667e6 J10 = c2760q33.J();
                J10.h();
                J10.j();
                if (!J10.y() || J10.f25694a.C().W() >= 242600) {
                    c2760q33.J().t();
                }
                if (c2760q3.w().H(null, AbstractC2671f2.f25964O0)) {
                    long D10 = c2760q3.C().P(c2760q3.e().getPackageName(), c2760q3.w().R()) ? 1000L : c2760q3.w().D(c2760q3.e().getPackageName(), AbstractC2671f2.f25943E);
                    c2760q3.a().w().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(D10));
                    c2760q32.N().o(D10);
                }
            }
        });
    }
}
