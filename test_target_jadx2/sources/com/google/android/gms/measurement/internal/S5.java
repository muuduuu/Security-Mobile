package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2401y0;
import java.util.Objects;

/* loaded from: classes2.dex */
final class S5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2401y0 f25687a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f25688b;

    S5(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2401y0 interfaceC2401y0) {
        this.f25687a = interfaceC2401y0;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f25688b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f25688b;
        appMeasurementDynamiteService.f25307f.C().e0(this.f25687a, appMeasurementDynamiteService.f25307f.d());
    }
}
