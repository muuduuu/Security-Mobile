package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2362t6 implements InterfaceC2353s6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24660a;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        f24660a = b10.d("measurement.service.ad_impression.convert_value_to_double", true);
        b10.d("measurement.service.separate_public_internal_event_blacklisting", true);
        b10.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2353s6
    public final boolean zza() {
        return ((Boolean) f24660a.d()).booleanValue();
    }
}
