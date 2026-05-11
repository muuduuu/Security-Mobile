package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes2.dex */
final class m7 implements InterfaceC2673f4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.E0 f26179a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f26180b;

    m7(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.E0 e02) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f26180b = appMeasurementDynamiteService;
        this.f26179a = e02;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2673f4
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f26179a.j(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            C2760q3 c2760q3 = this.f26180b.f25307f;
            if (c2760q3 != null) {
                c2760q3.a().r().b("Event listener threw exception", e10);
            }
        }
    }
}
