package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2401y0;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2704j3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2401y0 f26128a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f26129b;

    RunnableC2704j3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2401y0 interfaceC2401y0) {
        this.f26128a = interfaceC2401y0;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f26129b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26129b.f25307f.J().r(this.f26128a);
    }
}
