package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes2.dex */
final class I4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ A f25496a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2642b5 f25497b;

    I4(C2642b5 c2642b5, A a10) {
        this.f25496a = a10;
        Objects.requireNonNull(c2642b5);
        this.f25497b = c2642b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2642b5 c2642b5 = this.f25497b;
        C2760q3 c2760q3 = c2642b5.f25694a;
        Q2 x10 = c2760q3.x();
        C2760q3 c2760q32 = x10.f25694a;
        x10.h();
        A u10 = x10.u();
        A a10 = this.f25496a;
        if (!C2633a4.u(a10.b(), u10.b())) {
            c2760q3.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(a10.b()));
            return;
        }
        SharedPreferences.Editor edit = x10.p().edit();
        edit.putString("dma_consent_settings", a10.e());
        edit.apply();
        c2760q3.a().w().b("Setting DMA consent(FE)", a10);
        C2760q3 c2760q33 = c2642b5.f25694a;
        if (c2760q33.J().D()) {
            c2760q33.J().a0();
        } else {
            c2760q33.J().Y(false);
        }
    }
}
