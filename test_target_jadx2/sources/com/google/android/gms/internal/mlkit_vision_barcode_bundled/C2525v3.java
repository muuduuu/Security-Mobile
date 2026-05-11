package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2525v3 extends AbstractC2444f1 implements Q1 {
    private static final C2525v3 zza;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C2525v3 c2525v3 = new C2525v3();
        zza = c2525v3;
        AbstractC2444f1.t(C2525v3.class, c2525v3);
    }

    private C2525v3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2525v3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new C2520u3(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
