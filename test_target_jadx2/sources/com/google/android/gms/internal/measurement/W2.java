package com.google.android.gms.internal.measurement;

import java.util.List;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class W2 extends AbstractC2245g5 implements I5 {
    private static final W2 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private InterfaceC2299m5 zzi = AbstractC2245g5.y();

    static {
        W2 w22 = new W2();
        zzj = w22;
        AbstractC2245g5.s(W2.class, w22);
    }

    private W2() {
    }

    public static V2 O() {
        return (V2) zzj.o();
    }

    private final void a0() {
        InterfaceC2299m5 interfaceC2299m5 = this.zzi;
        if (interfaceC2299m5.zza()) {
            return;
        }
        this.zzi = AbstractC2245g5.z(interfaceC2299m5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", W2.class});
        }
        if (i11 == 3) {
            return new W2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new V2(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final String D() {
        return this.zzd;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final String F() {
        return this.zze;
    }

    public final boolean G() {
        return (this.zzb & 4) != 0;
    }

    public final long H() {
        return this.zzf;
    }

    public final boolean I() {
        return (this.zzb & 8) != 0;
    }

    public final float J() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzb & 16) != 0;
    }

    public final double L() {
        return this.zzh;
    }

    public final List M() {
        return this.zzi;
    }

    public final int N() {
        return this.zzi.size();
    }

    final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void R() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    final /* synthetic */ void S(long j10) {
        this.zzb |= 4;
        this.zzf = j10;
    }

    final /* synthetic */ void T() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    final /* synthetic */ void U(double d10) {
        this.zzb |= 16;
        this.zzh = d10;
    }

    final /* synthetic */ void V() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    final /* synthetic */ void W(W2 w22) {
        w22.getClass();
        a0();
        this.zzi.add(w22);
    }

    final /* synthetic */ void X(Iterable iterable) {
        a0();
        AbstractC2369u4.f(iterable, this.zzi);
    }

    final /* synthetic */ void Y() {
        this.zzi = AbstractC2245g5.y();
    }
}
