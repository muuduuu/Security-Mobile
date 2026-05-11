package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2456h3 extends AbstractC2444f1 implements Q1 {
    private static final C2456h3 zza;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 2;

    static {
        C2456h3 c2456h3 = new C2456h3();
        zza = c2456h3;
        AbstractC2444f1.t(C2456h3.class, c2456h3);
    }

    private C2456h3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", C2451g3.f24868a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2456h3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new C2446f3(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
