package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2478m0 extends AbstractC2444f1 implements Q1 {
    private static final C2478m0 zza;
    private int zzd;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;

    static {
        C2478m0 c2478m0 = new C2478m0();
        zza = c2478m0;
        AbstractC2444f1.t(C2478m0.class, c2478m0);
    }

    private C2478m0() {
    }

    public static C2478m0 H() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C2468k0.f24877a, "zzf"});
        }
        if (i11 == 3) {
            return new C2478m0();
        }
        Z z10 = null;
        if (i11 == 4) {
            return new C2458i0(z10);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final String I() {
        return this.zzf;
    }

    public final int J() {
        int a10 = AbstractC2473l0.a(this.zze);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
