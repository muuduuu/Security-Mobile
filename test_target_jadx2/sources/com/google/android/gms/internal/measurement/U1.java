package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class U1 extends AbstractC2245g5 implements I5 {
    private static final U1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        U1 u12 = new U1();
        zzf = u12;
        AbstractC2245g5.s(U1.class, u12);
    }

    private U1() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            InterfaceC2272j5 interfaceC2272j5 = X1.f24408a;
            return AbstractC2245g5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", interfaceC2272j5, "zze", interfaceC2272j5});
        }
        if (i11 == 3) {
            return new U1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new T1(bArr);
        }
        if (i11 == 5) {
            return zzf;
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
        int a10 = Z1.a(this.zze);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
