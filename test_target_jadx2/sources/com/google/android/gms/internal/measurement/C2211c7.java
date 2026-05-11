package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2211c7 implements InterfaceC2202b7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24472a;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        b10.d("measurement.gbraid_campaign.gbraid.client", true);
        f24472a = b10.d("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2202b7
    public final boolean zza() {
        return ((Boolean) f24472a.d()).booleanValue();
    }
}
