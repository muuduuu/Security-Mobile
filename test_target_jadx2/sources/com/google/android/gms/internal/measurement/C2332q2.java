package com.google.android.gms.internal.measurement;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2332q2 extends AbstractC2245g5 implements I5 {
    private static final C2332q2 zzf;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;

    static {
        C2332q2 c2332q2 = new C2332q2();
        zzf = c2332q2;
        AbstractC2245g5.s(C2332q2.class, c2332q2);
    }

    private C2332q2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C2332q2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2323p2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }
}
