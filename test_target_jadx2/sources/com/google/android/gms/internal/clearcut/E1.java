package com.google.android.gms.internal.clearcut;

/* loaded from: classes2.dex */
public enum E1 implements InterfaceC2118d0 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);

    private static final InterfaceC2121e0 zzbq = new InterfaceC2121e0() { // from class: com.google.android.gms.internal.clearcut.I1
        @Override // com.google.android.gms.internal.clearcut.InterfaceC2121e0
        public final /* synthetic */ InterfaceC2118d0 n(int i10) {
            return E1.zzbc(i10);
        }
    };
    private final int value;

    E1(int i10) {
        this.value = i10;
    }

    public static E1 zzbc(int i10) {
        if (i10 == 0) {
            return DEFAULT;
        }
        if (i10 == 1) {
            return UNMETERED_ONLY;
        }
        if (i10 == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i10 == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i10 != 4) {
            return null;
        }
        return NEVER;
    }

    public static InterfaceC2121e0 zzd() {
        return zzbq;
    }

    public final int zzc() {
        return this.value;
    }
}
