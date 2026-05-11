package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.n4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2737n4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f26183a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2642b5 f26184b;

    RunnableC2737n4(C2642b5 c2642b5, boolean z10) {
        this.f26183a = z10;
        Objects.requireNonNull(c2642b5);
        this.f26184b = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2642b5 c2642b5 = this.f26184b;
        C2760q3 c2760q3 = c2642b5.f25694a;
        boolean g10 = c2760q3.g();
        boolean d10 = c2760q3.d();
        boolean z10 = this.f26183a;
        c2760q3.P(z10);
        if (d10 == z10) {
            c2760q3.a().w().b("Default data collection state already set to", Boolean.valueOf(z10));
        }
        if (c2760q3.g() == g10 || c2760q3.g() != c2760q3.d()) {
            c2760q3.a().t().c("Default data collection is different than actual status", Boolean.valueOf(z10), Boolean.valueOf(g10));
        }
        c2642b5.Y();
    }
}
