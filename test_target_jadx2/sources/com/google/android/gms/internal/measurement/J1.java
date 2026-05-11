package com.google.android.gms.internal.measurement;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class J1 extends AbstractC2245g5 implements I5 {
    private static final J1 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;

    static {
        J1 j12 = new J1();
        zzi = j12;
        AbstractC2245g5.s(J1.class, j12);
    }

    private J1() {
    }

    public static J1 L() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", H1.f24228a, "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new J1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new G1(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final boolean D() {
        return (this.zzb & 2) != 0;
    }

    public final boolean E() {
        return this.zze;
    }

    public final boolean F() {
        return (this.zzb & 4) != 0;
    }

    public final String G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzb & 8) != 0;
    }

    public final String I() {
        return this.zzg;
    }

    public final boolean J() {
        return (this.zzb & 16) != 0;
    }

    public final String K() {
        return this.zzh;
    }

    public final int N() {
        int a10 = I1.a(this.zzd);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
