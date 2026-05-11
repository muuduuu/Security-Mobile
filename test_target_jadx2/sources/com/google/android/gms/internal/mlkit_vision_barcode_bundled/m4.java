package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class m4 extends AbstractC2444f1 implements Q1 {
    private static final m4 zza;
    private int zzd;
    private h4 zzj;
    private byte zzk = 2;
    private InterfaceC2474l1 zze = AbstractC2444f1.l();
    private InterfaceC2469k1 zzf = AbstractC2444f1.j();
    private boolean zzg = true;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;

    static {
        m4 m4Var = new m4();
        zza = m4Var;
        AbstractC2444f1.t(m4.class, m4Var);
    }

    private m4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new m4();
        }
        k4 k4Var = null;
        if (i11 == 4) {
            return new l4(k4Var);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
