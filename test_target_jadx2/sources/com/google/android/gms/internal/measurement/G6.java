package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class G6 implements F6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24221a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2316o4 f24222b;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        b10.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        b10.d("measurement.set_default_event_parameters_with_backfill.service", true);
        b10.c("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f24221a = b10.d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f24222b = b10.d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        b10.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final boolean zza() {
        return ((Boolean) f24221a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final boolean zzb() {
        return ((Boolean) f24222b.d()).booleanValue();
    }
}
