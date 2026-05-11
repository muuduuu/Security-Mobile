package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2486n3 extends AbstractC2444f1 implements Q1 {
    private static final C2486n3 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        C2486n3 c2486n3 = new C2486n3();
        zza = c2486n3;
        AbstractC2444f1.t(C2486n3.class, c2486n3);
    }

    private C2486n3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", C2491o3.f24892a, "zzf"});
        }
        if (i11 == 3) {
            return new C2486n3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new C2481m3(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
