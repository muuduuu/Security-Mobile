package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2427c extends AbstractC2444f1 implements Q1 {
    private static final C2427c zza;
    private int zzd;
    private C2442f zze;
    private boolean zzf;

    static {
        C2427c c2427c = new C2427c();
        zza = c2427c;
        AbstractC2444f1.t(C2427c.class, c2427c);
    }

    private C2427c() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2427c();
        }
        w4 w4Var = null;
        if (i11 == 4) {
            return new C2422b(w4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
