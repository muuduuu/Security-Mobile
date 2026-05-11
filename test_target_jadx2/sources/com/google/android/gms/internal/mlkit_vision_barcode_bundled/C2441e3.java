package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2441e3 extends AbstractC2444f1 implements Q1 {
    private static final C2441e3 zza;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private int zzf = 1;
    private boolean zzg;
    private int zzh;

    static {
        C2441e3 c2441e3 = new C2441e3();
        zza = c2441e3;
        AbstractC2444f1.t(C2441e3.class, c2441e3);
    }

    private C2441e3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", C2436d3.f24857a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2441e3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new C2431c3(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
