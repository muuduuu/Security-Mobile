package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class S1 extends AbstractC2245g5 implements I5 {
    private static final S1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        S1 s12 = new S1();
        zzg = s12;
        AbstractC2245g5.s(S1.class, s12);
    }

    private S1() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", X1.f24408a, "zze", V1.f24395a, "zzf", C2206c2.f24468a});
        }
        if (i11 == 3) {
            return new S1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new R1(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int D() {
        int a10 = Z1.a(this.zzd);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final int E() {
        int a10 = W1.a(this.zze);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final int F() {
        int a10 = AbstractC2215d2.a(this.zzf);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
