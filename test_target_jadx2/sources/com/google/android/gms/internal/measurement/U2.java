package com.google.android.gms.internal.measurement;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class U2 extends AbstractC2245g5 implements I5 {
    private static final U2 zzf;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private long zze;

    static {
        U2 u22 = new U2();
        zzf = u22;
        AbstractC2245g5.s(U2.class, u22);
    }

    private U2() {
    }

    public static T2 C() {
        return (T2) zzf.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new U2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new T2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void E(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }
}
