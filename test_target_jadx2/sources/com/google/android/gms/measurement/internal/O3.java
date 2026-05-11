package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2401y0;
import java.util.Objects;

/* loaded from: classes2.dex */
final class O3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2401y0 f25595a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I f25596b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f25597c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f25598d;

    O3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2401y0 interfaceC2401y0, I i10, String str) {
        this.f25595a = interfaceC2401y0;
        this.f25596b = i10;
        this.f25597c = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f25598d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25598d.f25307f.J().B(this.f25595a, this.f25596b, this.f25597c);
    }
}
