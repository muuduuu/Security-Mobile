package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2421a3 extends AbstractC2444f1 implements Q1 {
    private static final C2421a3 zza;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;

    static {
        C2421a3 c2421a3 = new C2421a3();
        zza = c2421a3;
        AbstractC2444f1.t(C2421a3.class, c2421a3);
    }

    private C2421a3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2421a3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new Z2(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
