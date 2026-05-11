package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2238f7 implements InterfaceC2229e7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24503a;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        b10.d("measurement.gmscore_feature_tracking", true);
        f24503a = b10.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2229e7
    public final boolean zza() {
        return ((Boolean) f24503a.d()).booleanValue();
    }
}
