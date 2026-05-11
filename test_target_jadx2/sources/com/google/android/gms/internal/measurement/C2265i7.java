package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2265i7 implements InterfaceC2256h7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24535a;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        b10.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f24535a = b10.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        b10.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2256h7
    public final boolean zza() {
        return ((Boolean) f24535a.d()).booleanValue();
    }
}
