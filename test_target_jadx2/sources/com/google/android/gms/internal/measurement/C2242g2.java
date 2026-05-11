package com.google.android.gms.internal.measurement;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2242g2 extends AbstractC2245g5 implements I5 {
    private static final C2242g2 zzg;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private InterfaceC2299m5 zze = AbstractC2245g5.y();
    private boolean zzf;

    static {
        C2242g2 c2242g2 = new C2242g2();
        zzg = c2242g2;
        AbstractC2245g5.s(C2242g2.class, c2242g2);
    }

    private C2242g2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", C2332q2.class, "zzf"});
        }
        if (i11 == 3) {
            return new C2242g2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2233f2(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }
}
