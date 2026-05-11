package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class O3 extends AbstractC2444f1 implements Q1 {
    private static final O3 zza;
    private int zzd;
    private InterfaceC2484n1 zze = AbstractC2444f1.m();
    private Q3 zzf;
    private W2 zzg;

    static {
        O3 o32 = new O3();
        zza = o32;
        AbstractC2444f1.t(O3.class, o32);
    }

    private O3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", a4.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new O3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new N3(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
