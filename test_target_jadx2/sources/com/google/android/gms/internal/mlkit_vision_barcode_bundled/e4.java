package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class e4 extends AbstractC2444f1 implements Q1 {
    private static final e4 zza;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        e4 e4Var = new e4();
        zza = e4Var;
        AbstractC2444f1.t(e4.class, e4Var);
    }

    private e4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", b4.f24851a});
        }
        if (i11 == 3) {
            return new e4();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new c4(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
