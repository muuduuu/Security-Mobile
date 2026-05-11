package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class E2 extends AbstractC2245g5 implements I5 {
    private static final E2 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        E2 e22 = new E2();
        zzk = e22;
        AbstractC2245g5.s(E2.class, e22);
    }

    private E2() {
    }

    public static D2 J() {
        return (D2) zzk.o();
    }

    public static E2 K() {
        return zzk;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new E2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new D2(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        throw null;
    }

    public final boolean C() {
        return this.zzd;
    }

    public final boolean D() {
        return this.zze;
    }

    public final boolean E() {
        return this.zzf;
    }

    public final boolean F() {
        return this.zzg;
    }

    public final boolean G() {
        return this.zzh;
    }

    public final boolean H() {
        return this.zzi;
    }

    public final boolean I() {
        return this.zzj;
    }

    final /* synthetic */ void L(boolean z10) {
        this.zzb |= 1;
        this.zzd = z10;
    }

    final /* synthetic */ void M(boolean z10) {
        this.zzb |= 2;
        this.zze = z10;
    }

    final /* synthetic */ void N(boolean z10) {
        this.zzb |= 4;
        this.zzf = z10;
    }

    final /* synthetic */ void O(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }

    final /* synthetic */ void P(boolean z10) {
        this.zzb |= 16;
        this.zzh = z10;
    }

    final /* synthetic */ void Q(boolean z10) {
        this.zzb |= 32;
        this.zzi = z10;
    }

    final /* synthetic */ void R(boolean z10) {
        this.zzb |= 64;
        this.zzj = z10;
    }
}
