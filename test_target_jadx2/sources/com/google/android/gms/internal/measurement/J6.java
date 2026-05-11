package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class J6 implements I6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24249a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2316o4 f24250b;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        f24249a = b10.d("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        f24250b = b10.d("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.I6
    public final boolean zza() {
        return ((Boolean) f24249a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.I6
    public final boolean zzb() {
        return ((Boolean) f24250b.d()).booleanValue();
    }
}
