package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2401y0;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.s5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2777s5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2401y0 f26339a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f26340b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f26341c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f26342d;

    RunnableC2777s5(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2401y0 interfaceC2401y0, String str, String str2) {
        this.f26339a = interfaceC2401y0;
        this.f26340b = str;
        this.f26341c = str2;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f26342d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26342d.f25307f.J().f0(this.f26339a, this.f26340b, this.f26341c);
    }
}
