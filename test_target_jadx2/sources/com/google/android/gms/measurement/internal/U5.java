package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* loaded from: classes2.dex */
final class U5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Y5 f25705a;

    U5(Y5 y52) {
        Objects.requireNonNull(y52);
        this.f25705a = y52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2667e6 c2667e6 = this.f25705a.f25747c;
        C2760q3 c2760q3 = c2667e6.f25694a;
        Context e10 = c2760q3.e();
        c2760q3.c();
        c2667e6.K(new ComponentName(e10, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
