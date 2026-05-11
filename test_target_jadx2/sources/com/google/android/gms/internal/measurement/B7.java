package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class B7 implements A7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24201a;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        f24201a = b10.d("measurement.session_stitching_token_enabled", false);
        b10.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.A7
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.A7
    public final boolean zzb() {
        return ((Boolean) f24201a.d()).booleanValue();
    }
}
