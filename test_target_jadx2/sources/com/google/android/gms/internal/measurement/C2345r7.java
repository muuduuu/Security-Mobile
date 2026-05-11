package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2345r7 implements InterfaceC2337q7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2316o4 f24646a;

    static {
        C2262i4 b10 = new C2262i4(AbstractC2217d4.a("com.google.android.gms.measurement")).a().b();
        f24646a = b10.d("measurement.add_first_launch_logging_timestamp.service", false);
        b10.c("measurement.id.add_first_launch_logging_timestamp.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2337q7
    public final boolean zza() {
        return ((Boolean) f24646a.d()).booleanValue();
    }
}
