package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2714k5 {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzg;

    EnumC2714k5(int i10) {
        this.zzg = i10;
    }

    public static EnumC2714k5 zzb(int i10) {
        for (EnumC2714k5 enumC2714k5 : values()) {
            if (enumC2714k5.zzg == i10) {
                return enumC2714k5;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.zzg;
    }
}
