package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class v4 extends AbstractC2444f1 implements Q1 {
    private static final v4 zza;
    private int zzd;
    private C2427c zze;

    static {
        v4 v4Var = new v4();
        zza = v4Var;
        AbstractC2444f1.t(v4.class, v4Var);
    }

    private v4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new v4();
        }
        t4 t4Var = null;
        if (i11 == 4) {
            return new u4(t4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
