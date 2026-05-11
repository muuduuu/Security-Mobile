package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2453h0 extends AbstractC2444f1 implements Q1 {
    private static final C2453h0 zza;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;
    private String zzk = BuildConfig.FLAVOR;

    static {
        C2453h0 c2453h0 = new C2453h0();
        zza = c2453h0;
        AbstractC2444f1.t(C2453h0.class, c2453h0);
    }

    private C2453h0() {
    }

    public static C2453h0 H() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C2453h0();
        }
        Z z10 = null;
        if (i11 == 4) {
            return new C2448g0(z10);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final String I() {
        return this.zzh;
    }

    public final String J() {
        return this.zze;
    }

    public final String K() {
        return this.zzj;
    }

    public final String L() {
        return this.zzi;
    }

    public final String M() {
        return this.zzg;
    }

    public final String N() {
        return this.zzf;
    }

    public final String O() {
        return this.zzk;
    }
}
