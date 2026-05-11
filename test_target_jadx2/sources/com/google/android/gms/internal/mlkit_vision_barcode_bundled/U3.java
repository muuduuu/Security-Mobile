package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class U3 extends AbstractC2444f1 implements Q1 {
    private static final U3 zza;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private int zzh;
    private int zzi;
    private C2525v3 zzj;
    private boolean zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private long zzp;

    static {
        U3 u32 = new U3();
        zza = u32;
        AbstractC2444f1.t(U3.class, u32);
    }

    private U3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005င\u0004\u0006ဉ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဂ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", V3.f24823a, "zzi", "zzj", "zzk", "zzl", W3.f24824a, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i11 == 3) {
            return new U3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new T3(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
