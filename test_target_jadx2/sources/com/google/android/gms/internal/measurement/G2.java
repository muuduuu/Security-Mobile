package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class G2 extends AbstractC2245g5 implements I5 {
    private static final G2 zzh;
    private int zzb;
    private int zzd;
    private C2270j3 zze;
    private C2270j3 zzf;
    private boolean zzg;

    static {
        G2 g22 = new G2();
        zzh = g22;
        AbstractC2245g5.s(G2.class, g22);
    }

    private G2() {
    }

    public static F2 J() {
        return (F2) zzh.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new G2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new F2(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final C2270j3 E() {
        C2270j3 c2270j3 = this.zze;
        return c2270j3 == null ? C2270j3.L() : c2270j3;
    }

    public final boolean F() {
        return (this.zzb & 4) != 0;
    }

    public final C2270j3 G() {
        C2270j3 c2270j3 = this.zzf;
        return c2270j3 == null ? C2270j3.L() : c2270j3;
    }

    public final boolean H() {
        return (this.zzb & 8) != 0;
    }

    public final boolean I() {
        return this.zzg;
    }

    final /* synthetic */ void K(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    final /* synthetic */ void L(C2270j3 c2270j3) {
        c2270j3.getClass();
        this.zze = c2270j3;
        this.zzb |= 2;
    }

    final /* synthetic */ void M(C2270j3 c2270j3) {
        this.zzf = c2270j3;
        this.zzb |= 4;
    }

    final /* synthetic */ void N(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }
}
