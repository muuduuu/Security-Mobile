package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
enum EnumC2732n {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzk;

    EnumC2732n(char c10) {
        this.zzk = c10;
    }

    public static EnumC2732n zza(char c10) {
        for (EnumC2732n enumC2732n : values()) {
            if (enumC2732n.zzk == c10) {
                return enumC2732n;
            }
        }
        return UNSET;
    }

    final /* synthetic */ char zzb() {
        return this.zzk;
    }
}
