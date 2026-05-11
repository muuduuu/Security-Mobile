package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2319o7 implements InterfaceC2310n7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24601a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2316o4 f24602b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC2316o4 f24603c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC2316o4 f24604d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC2316o4 f24605e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC2316o4 f24606f;

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC2316o4 f24607g;

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC2316o4 f24608h;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        b10.d("measurement.rb.attribution.ad_campaign_info", true);
        b10.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f24601a = b10.d("measurement.rb.attribution.client2", true);
        f24602b = b10.d("measurement.rb.attribution.followup1.service", false);
        b10.d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f24603c = b10.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        b10.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f24604d = b10.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f24605e = b10.d("measurement.rb.attribution.retry_disposition", false);
        f24606f = b10.d("measurement.rb.attribution.service", true);
        f24607g = b10.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f24608h = b10.d("measurement.rb.attribution.uuid_generation", true);
        b10.c("measurement.id.rb.attribution.retry_disposition", 0L);
        b10.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2310n7
    public final boolean a() {
        return ((Boolean) f24602b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2310n7
    public final boolean d() {
        return ((Boolean) f24607g.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2310n7
    public final boolean f() {
        return ((Boolean) f24603c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2310n7
    public final boolean g() {
        return ((Boolean) f24604d.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2310n7
    public final boolean h() {
        return ((Boolean) f24605e.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2310n7
    public final boolean i() {
        return ((Boolean) f24606f.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2310n7
    public final boolean l() {
        return ((Boolean) f24608h.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2310n7
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2310n7
    public final boolean zzb() {
        return ((Boolean) f24601a.d()).booleanValue();
    }
}
