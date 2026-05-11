package com.google.android.gms.internal.measurement;

import java.util.List;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2278k2 extends AbstractC2245g5 implements I5 {
    private static final C2278k2 zzu;
    private int zzb;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private C2224e2 zzp;
    private C2314o2 zzq;
    private C2367u2 zzr;
    private C2332q2 zzs;
    private C2296m2 zzt;
    private String zze = BuildConfig.FLAVOR;
    private InterfaceC2299m5 zzg = AbstractC2245g5.y();
    private InterfaceC2299m5 zzh = AbstractC2245g5.y();
    private InterfaceC2299m5 zzi = AbstractC2245g5.y();
    private String zzj = BuildConfig.FLAVOR;
    private InterfaceC2299m5 zzl = AbstractC2245g5.y();
    private InterfaceC2299m5 zzm = AbstractC2245g5.y();
    private String zzn = BuildConfig.FLAVOR;
    private String zzo = BuildConfig.FLAVOR;

    static {
        C2278k2 c2278k2 = new C2278k2();
        zzu = c2278k2;
        AbstractC2245g5.s(C2278k2.class, c2278k2);
    }

    private C2278k2() {
    }

    public static C2269j2 S() {
        return (C2269j2) zzu.o();
    }

    public static C2278k2 T() {
        return zzu;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", C2349s2.class, "zzh", C2260i2.class, "zzi", B1.class, "zzj", "zzk", "zzl", C3.class, "zzm", C2242g2.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i11 == 3) {
            return new C2278k2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2269j2(bArr);
        }
        if (i11 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final long D() {
        return this.zzd;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final String F() {
        return this.zze;
    }

    public final List G() {
        return this.zzg;
    }

    public final int H() {
        return this.zzh.size();
    }

    public final C2260i2 I(int i10) {
        return (C2260i2) this.zzh.get(i10);
    }

    public final List J() {
        return this.zzi;
    }

    public final List K() {
        return this.zzl;
    }

    public final int L() {
        return this.zzl.size();
    }

    public final List M() {
        return this.zzm;
    }

    public final String N() {
        return this.zzn;
    }

    public final boolean O() {
        return (this.zzb & 128) != 0;
    }

    public final C2224e2 P() {
        C2224e2 c2224e2 = this.zzp;
        return c2224e2 == null ? C2224e2.I() : c2224e2;
    }

    public final boolean Q() {
        return (this.zzb & 512) != 0;
    }

    public final C2367u2 R() {
        C2367u2 c2367u2 = this.zzr;
        return c2367u2 == null ? C2367u2.G() : c2367u2;
    }

    final /* synthetic */ void U(int i10, C2260i2 c2260i2) {
        c2260i2.getClass();
        InterfaceC2299m5 interfaceC2299m5 = this.zzh;
        if (!interfaceC2299m5.zza()) {
            this.zzh = AbstractC2245g5.z(interfaceC2299m5);
        }
        this.zzh.set(i10, c2260i2);
    }

    final /* synthetic */ void V() {
        this.zzi = AbstractC2245g5.y();
    }

    final /* synthetic */ void W() {
        this.zzl = AbstractC2245g5.y();
    }
}
