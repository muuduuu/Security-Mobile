package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class U2 extends AbstractC2444f1 implements Q1 {
    private static final U2 zza;
    private int zzd;
    private int zze;
    private a4 zzf;
    private M3 zzg;
    private O3 zzh;

    static {
        U2 u22 = new U2();
        zza = u22;
        AbstractC2444f1.t(U2.class, u22);
    }

    private U2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"zzd", "zze", C2515t3.f24950a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new U2();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new T2(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
