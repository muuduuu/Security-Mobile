package com.google.android.gms.internal.measurement;

import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class A2 extends AbstractC2245g5 implements I5 {
    private static final A2 zzn;
    private int zzb;
    private long zzg;
    private long zzk;
    private B5 zzl = B5.a();
    private B5 zzm = B5.a();
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;

    static {
        A2 a22 = new A2();
        zzn = a22;
        AbstractC2245g5.s(A2.class, a22);
    }

    private A2() {
    }

    public static C2385w2 c0() {
        return (C2385w2) zzn.o();
    }

    public static A2 d0() {
        return zzn;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", AbstractC2394x2.f24686a, "zzm", AbstractC2403y2.f24697a});
        }
        if (i11 == 3) {
            return new A2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2385w2(bArr);
        }
        if (i11 == 5) {
            return zzn;
        }
        throw null;
    }

    final /* synthetic */ void C(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    final /* synthetic */ void D() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    final /* synthetic */ void E(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    final /* synthetic */ void F() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    final /* synthetic */ void G(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    final /* synthetic */ void H() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    final /* synthetic */ void I(long j10) {
        this.zzb |= 128;
        this.zzk = j10;
    }

    final /* synthetic */ Map J() {
        if (!this.zzl.i()) {
            this.zzl = this.zzl.d();
        }
        return this.zzl;
    }

    final /* synthetic */ Map K() {
        if (!this.zzm.i()) {
            this.zzm = this.zzm.d();
        }
        return this.zzm;
    }

    public final boolean M() {
        return (this.zzb & 1) != 0;
    }

    public final String N() {
        return this.zzd;
    }

    public final boolean O() {
        return (this.zzb & 2) != 0;
    }

    public final String P() {
        return this.zze;
    }

    public final boolean Q() {
        return (this.zzb & 4) != 0;
    }

    public final String R() {
        return this.zzf;
    }

    public final boolean S() {
        return (this.zzb & 8) != 0;
    }

    public final long T() {
        return this.zzg;
    }

    public final boolean U() {
        return (this.zzb & 16) != 0;
    }

    public final String V() {
        return this.zzh;
    }

    public final boolean W() {
        return (this.zzb & 32) != 0;
    }

    public final String X() {
        return this.zzi;
    }

    public final boolean Y() {
        return (this.zzb & 64) != 0;
    }

    public final String Z() {
        return this.zzj;
    }

    public final boolean a0() {
        return (this.zzb & 128) != 0;
    }

    public final long b0() {
        return this.zzk;
    }

    final /* synthetic */ void e0(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void f0() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    final /* synthetic */ void g0(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void h0() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    final /* synthetic */ void i0(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    final /* synthetic */ void j0() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    final /* synthetic */ void k0(long j10) {
        this.zzb |= 8;
        this.zzg = j10;
    }
}
