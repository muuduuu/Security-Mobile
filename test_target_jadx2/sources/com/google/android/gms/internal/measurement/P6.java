package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class P6 implements O6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24332a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2316o4 f24333b;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        b10.d("measurement.collection.event_safelist", true);
        f24332a = b10.d("measurement.service.store_null_safelist", true);
        f24333b = b10.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.O6
    public final boolean a() {
        return ((Boolean) f24333b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.O6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.O6
    public final boolean zzb() {
        return ((Boolean) f24332a.d()).booleanValue();
    }
}
