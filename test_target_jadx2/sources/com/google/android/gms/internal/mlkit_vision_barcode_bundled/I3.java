package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class I3 extends AbstractC2444f1 implements Q1 {
    private static final I3 zza;
    private int zzd;
    private int zze;
    private int zzf = 100;
    private int zzg;

    static {
        I3 i32 = new I3();
        zza = i32;
        AbstractC2444f1.t(I3.class, i32);
    }

    private I3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", G3.f24761a, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new I3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new H3(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
