package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class S6 implements R6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24365a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2316o4 f24366b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC2316o4 f24367c;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        b10.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f24365a = b10.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f24366b = b10.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f24367c = b10.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean a() {
        return ((Boolean) f24366b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean f() {
        return ((Boolean) f24367c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean zzb() {
        return ((Boolean) f24365a.d()).booleanValue();
    }
}
