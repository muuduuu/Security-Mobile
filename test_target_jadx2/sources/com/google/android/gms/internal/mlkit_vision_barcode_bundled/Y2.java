package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class Y2 extends AbstractC2444f1 implements Q1 {
    private static final Y2 zza;
    private int zzd;
    private int zze = -1;

    static {
        Y2 y22 = new Y2();
        zza = y22;
        AbstractC2444f1.t(Y2.class, y22);
    }

    private Y2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new Y2();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new X2(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
