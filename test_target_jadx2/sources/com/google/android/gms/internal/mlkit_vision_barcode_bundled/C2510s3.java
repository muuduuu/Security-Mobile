package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2510s3 extends AbstractC2444f1 implements Q1 {
    private static final C2510s3 zza;
    private int zzd;
    private int zze;
    private C2476l3 zzh;
    private int zzj;
    private int zzk;
    private InterfaceC2484n1 zzf = AbstractC2444f1.m();
    private int zzg = -1;
    private String zzi = BuildConfig.FLAVOR;
    private InterfaceC2474l1 zzl = AbstractC2444f1.l();
    private String zzm = BuildConfig.FLAVOR;

    static {
        C2510s3 c2510s3 = new C2510s3();
        zza = c2510s3;
        AbstractC2444f1.t(C2510s3.class, c2510s3);
    }

    private C2510s3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006᠌\u0004\u0007᠌\u0005\b'\tဈ\u0006", new Object[]{"zzd", "zze", C2491o3.f24892a, "zzf", C2486n3.class, "zzg", "zzh", "zzi", "zzj", C2501q3.f24910a, "zzk", C2505r3.f24926a, "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new C2510s3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new C2496p3(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
