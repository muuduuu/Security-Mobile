package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class Y3 extends AbstractC2444f1 implements Q1 {
    private static final Y3 zza;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;

    static {
        Y3 y32 = new Y3();
        zza = y32;
        AbstractC2444f1.t(Y3.class, y32);
    }

    private Y3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new Y3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new X3(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
