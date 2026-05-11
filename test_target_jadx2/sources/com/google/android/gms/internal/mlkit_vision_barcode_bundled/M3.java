package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class M3 extends AbstractC2444f1 implements Q1 {
    private static final M3 zza;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private S3 zzf;

    static {
        M3 m32 = new M3();
        zza = m32;
        AbstractC2444f1.t(M3.class, m32);
    }

    private M3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new M3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new L3(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
