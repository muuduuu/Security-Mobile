package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class F3 extends AbstractC2444f1 implements Q1 {
    private static final F3 zza;
    private int zzd;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zze = -1;
    private E0 zzh = E0.f24749b;
    private String zzi = BuildConfig.FLAVOR;
    private boolean zzk = true;
    private boolean zzl = true;

    static {
        F3 f32 = new F3();
        zza = f32;
        AbstractC2444f1.t(F3.class, f32);
    }

    private F3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            InterfaceC2464j1 interfaceC2464j1 = D3.f24746a;
            InterfaceC2464j1 interfaceC2464j12 = E3.f24756a;
            return AbstractC2444f1.p(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\t᠌\b\n᠌\t\u000bဇ\n", new Object[]{"zzd", "zze", "zzf", "zzg", interfaceC2464j1, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", interfaceC2464j12, "zzn", interfaceC2464j12, "zzo"});
        }
        if (i11 == 3) {
            return new F3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new B3(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
