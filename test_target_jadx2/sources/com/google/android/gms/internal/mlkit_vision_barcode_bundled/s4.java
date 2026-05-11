package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class s4 extends AbstractC2444f1 implements Q1 {
    public static final C2439e1 zza;
    private static final s4 zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private h4 zzh;
    private byte zzi = 2;

    static {
        s4 s4Var = new s4();
        zzd = s4Var;
        AbstractC2444f1.t(s4.class, s4Var);
        zza = AbstractC2444f1.f(h4.I(), s4Var, s4Var, null, 13258261, P2.zzk, s4.class);
    }

    private s4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new s4();
        }
        q4 q4Var = null;
        if (i11 == 4) {
            return new r4(q4Var);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
