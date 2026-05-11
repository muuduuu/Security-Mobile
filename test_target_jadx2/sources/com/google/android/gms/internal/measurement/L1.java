package com.google.android.gms.internal.measurement;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class L1 extends AbstractC2245g5 implements I5 {
    private static final L1 zzj;
    private int zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private F1 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        L1 l12 = new L1();
        zzj = l12;
        AbstractC2245g5.s(L1.class, l12);
    }

    private L1() {
    }

    public static K1 K() {
        return (K1) zzj.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new L1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new K1(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final String E() {
        return this.zze;
    }

    public final F1 F() {
        F1 f12 = this.zzf;
        return f12 == null ? F1.K() : f12;
    }

    public final boolean G() {
        return this.zzg;
    }

    public final boolean H() {
        return this.zzh;
    }

    public final boolean I() {
        return (this.zzb & 32) != 0;
    }

    public final boolean J() {
        return this.zzi;
    }

    final /* synthetic */ void L(String str) {
        this.zzb |= 2;
        this.zze = str;
    }
}
