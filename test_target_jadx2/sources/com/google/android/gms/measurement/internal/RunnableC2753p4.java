package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2401y0;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.p4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2753p4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2401y0 f26237a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f26238b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f26239c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f26240d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f26241e;

    RunnableC2753p4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2401y0 interfaceC2401y0, String str, String str2, boolean z10) {
        this.f26237a = interfaceC2401y0;
        this.f26238b = str;
        this.f26239c = str2;
        this.f26240d = z10;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f26241e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26241e.f25307f.J().h0(this.f26237a, this.f26238b, this.f26239c, this.f26240d);
    }
}
