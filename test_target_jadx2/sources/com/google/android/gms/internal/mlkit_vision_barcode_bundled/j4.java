package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class j4 extends AbstractC2444f1 implements Q1 {
    private static final j4 zza;
    private int zzd;
    private InterfaceC2484n1 zze = AbstractC2444f1.m();
    private String zzf = BuildConfig.FLAVOR;

    static {
        j4 j4Var = new j4();
        zza = j4Var;
        AbstractC2444f1.t(j4.class, j4Var);
    }

    private j4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new j4();
        }
        d4 d4Var = null;
        if (i11 == 4) {
            return new i4(d4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
