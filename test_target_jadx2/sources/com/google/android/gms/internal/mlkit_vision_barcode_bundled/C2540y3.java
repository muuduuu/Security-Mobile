package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2540y3 extends AbstractC2444f1 implements Q1 {
    private static final C2540y3 zza;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzg = true;
    private String zzl = BuildConfig.FLAVOR;
    private String zzm = BuildConfig.FLAVOR;

    static {
        C2540y3 c2540y3 = new C2540y3();
        zza = c2540y3;
        AbstractC2444f1.t(C2540y3.class, c2540y3);
    }

    private C2540y3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            InterfaceC2464j1 interfaceC2464j1 = A3.f24725a;
            InterfaceC2464j1 interfaceC2464j12 = C2530w3.f24976a;
            InterfaceC2464j1 interfaceC2464j13 = C2545z3.f24992a;
            return AbstractC2444f1.p(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bဈ\u0007\tဈ\b", new Object[]{"zzd", "zze", "zzf", interfaceC2464j1, "zzg", "zzh", interfaceC2464j12, "zzi", interfaceC2464j13, "zzj", interfaceC2464j13, "zzk", interfaceC2464j13, "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new C2540y3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new C2535x3(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
