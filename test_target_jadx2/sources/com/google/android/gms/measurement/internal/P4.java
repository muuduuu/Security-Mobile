package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class P4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ U6 f25616a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f25617b;

    P4(AppMeasurementDynamiteService appMeasurementDynamiteService, U6 u62) {
        this.f25616a = u62;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f25617b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25617b.f25307f.B().I(this.f25616a);
    }
}
