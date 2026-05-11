package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class D6 implements C6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24209a;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        b10.d("measurement.client.3p_consent_state_v1", true);
        f24209a = b10.c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.C6
    public final long zza() {
        return ((Long) f24209a.d()).longValue();
    }
}
