package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2482n extends AbstractC2444f1 implements Q1 {
    private static final C2482n zza;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    static {
        C2482n c2482n = new C2482n();
        zza = c2482n;
        AbstractC2444f1.t(C2482n.class, c2482n);
    }

    private C2482n() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2482n();
        }
        AbstractC2472l abstractC2472l = null;
        if (i11 == 4) {
            return new C2477m(abstractC2472l);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
