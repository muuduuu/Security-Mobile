package com.google.android.gms.internal.measurement;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2367u2 extends AbstractC2245g5 implements I5 {
    private static final C2367u2 zzi;
    private int zzb;
    private int zzg;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;

    static {
        C2367u2 c2367u2 = new C2367u2();
        zzi = c2367u2;
        AbstractC2245g5.s(C2367u2.class, c2367u2);
    }

    private C2367u2() {
    }

    public static C2367u2 G() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2367u2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2358t2(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }

    public final String D() {
        return this.zze;
    }

    public final int E() {
        return this.zzg;
    }

    public final String F() {
        return this.zzh;
    }
}
