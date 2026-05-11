package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2292l7 implements InterfaceC2283k7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24562a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2316o4 f24563b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC2316o4 f24564c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC2316o4 f24565d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC2316o4 f24566e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC2316o4 f24567f;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        f24562a = b10.d("measurement.test.boolean_flag", false);
        f24563b = b10.c("measurement.test.cached_long_flag", -1L);
        f24564c = b10.e("measurement.test.double_flag", -3.0d);
        f24565d = b10.c("measurement.test.int_flag", -2L);
        f24566e = b10.c("measurement.test.long_flag", -1L);
        f24567f = b10.f("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2283k7
    public final double a() {
        return ((Double) f24564c.d()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2283k7
    public final long f() {
        return ((Long) f24565d.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2283k7
    public final long g() {
        return ((Long) f24566e.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2283k7
    public final String h() {
        return (String) f24567f.d();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2283k7
    public final boolean zza() {
        return ((Boolean) f24562a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2283k7
    public final long zzb() {
        return ((Long) f24563b.d()).longValue();
    }
}
