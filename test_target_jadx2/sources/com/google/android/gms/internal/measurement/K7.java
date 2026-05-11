package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class K7 implements J7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24270a;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        f24270a = b10.d("measurement.tcf.consent_fix", true);
        b10.d("measurement.tcf.client", true);
        b10.d("measurement.tcf.empty_pref_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.J7
    public final boolean zza() {
        return ((Boolean) f24270a.d()).booleanValue();
    }
}
