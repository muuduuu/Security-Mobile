package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class Q3 extends AbstractC2444f1 implements Q1 {
    private static final Q3 zza;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        Q3 q32 = new Q3();
        zza = q32;
        AbstractC2444f1.t(Q3.class, q32);
    }

    private Q3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new Q3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new P3(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
