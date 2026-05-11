package com.google.android.gms.internal.measurement;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2377v3 extends AbstractC2245g5 implements I5 {
    private static final C2377v3 zzj;
    private int zzb;
    private long zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        C2377v3 c2377v3 = new C2377v3();
        zzj = c2377v3;
        AbstractC2245g5.s(C2377v3.class, c2377v3);
    }

    private C2377v3() {
    }

    public static C2368u3 N() {
        return (C2368u3) zzj.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C2377v3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2368u3(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final long D() {
        return this.zzd;
    }

    public final String E() {
        return this.zze;
    }

    public final boolean F() {
        return (this.zzb & 4) != 0;
    }

    public final String G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzb & 8) != 0;
    }

    public final long I() {
        return this.zzg;
    }

    public final boolean J() {
        return (this.zzb & 16) != 0;
    }

    public final float K() {
        return this.zzh;
    }

    public final boolean L() {
        return (this.zzb & 32) != 0;
    }

    public final double M() {
        return this.zzi;
    }

    final /* synthetic */ void O(long j10) {
        this.zzb |= 1;
        this.zzd = j10;
    }

    final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    final /* synthetic */ void R() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    final /* synthetic */ void S(long j10) {
        this.zzb |= 8;
        this.zzg = j10;
    }

    final /* synthetic */ void T() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    final /* synthetic */ void U(double d10) {
        this.zzb |= 32;
        this.zzi = d10;
    }

    final /* synthetic */ void V() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }
}
