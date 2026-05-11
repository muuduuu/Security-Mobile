package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2467k extends AbstractC2444f1 implements Q1 {
    public static final C2439e1 zza;
    private static final InterfaceC2479m1 zzd = new C2452h();
    private static final C2467k zze;
    private int zzf;
    private v4 zzl;
    private h4 zzm;
    private byte zzn = 2;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private InterfaceC2474l1 zzi = AbstractC2444f1.l();
    private String zzj = BuildConfig.FLAVOR;
    private String zzk = BuildConfig.FLAVOR;

    static {
        C2467k c2467k = new C2467k();
        zze = c2467k;
        AbstractC2444f1.t(C2467k.class, c2467k);
        zza = AbstractC2444f1.f(h4.I(), c2467k, c2467k, null, 308676116, P2.zzk, C2467k.class);
    }

    private C2467k() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zze, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", C2462j.f24876a, "zzj", "zzk", "zzm", "zzl"});
        }
        if (i11 == 3) {
            return new C2467k();
        }
        AbstractC2447g abstractC2447g = null;
        if (i11 == 4) {
            return new C2457i(abstractC2447g);
        }
        if (i11 == 5) {
            return zze;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
