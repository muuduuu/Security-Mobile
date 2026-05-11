package com.google.android.gms.internal.measurement;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class F1 extends AbstractC2245g5 implements I5 {
    private static final F1 zzh;
    private int zzb;
    private P1 zzd;
    private J1 zze;
    private boolean zzf;
    private String zzg = BuildConfig.FLAVOR;

    static {
        F1 f12 = new F1();
        zzh = f12;
        AbstractC2245g5.s(F1.class, f12);
    }

    private F1() {
    }

    public static F1 K() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new F1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new E1(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final P1 D() {
        P1 p12 = this.zzd;
        return p12 == null ? P1.J() : p12;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final J1 F() {
        J1 j12 = this.zze;
        return j12 == null ? J1.L() : j12;
    }

    public final boolean G() {
        return (this.zzb & 4) != 0;
    }

    public final boolean H() {
        return this.zzf;
    }

    public final boolean I() {
        return (this.zzb & 8) != 0;
    }

    public final String J() {
        return this.zzg;
    }

    final /* synthetic */ void L(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
