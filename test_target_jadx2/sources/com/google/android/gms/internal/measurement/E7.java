package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class E7 implements D7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24214a;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        f24214a = b10.d("measurement.client.sessions.enable_fix_background_engagement", false);
        b10.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        b10.c("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.D7
    public final boolean zza() {
        return ((Boolean) f24214a.d()).booleanValue();
    }
}
