package com.google.android.gms.internal.measurement;

import java.util.List;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2207c3 extends AbstractC2245g5 implements I5 {
    private static final C2207c3 zzh;
    private int zzb;
    private InterfaceC2299m5 zzd = AbstractC2245g5.y();
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private int zzg;

    static {
        C2207c3 c2207c3 = new C2207c3();
        zzh = c2207c3;
        AbstractC2245g5.s(C2207c3.class, c2207c3);
    }

    private C2207c3() {
    }

    public static Z2 J() {
        return (Z2) zzh.o();
    }

    public static Z2 K(C2207c3 c2207c3) {
        AbstractC2227e5 o10 = zzh.o();
        o10.w(c2207c3);
        return (Z2) o10;
    }

    private final void S() {
        InterfaceC2299m5 interfaceC2299m5 = this.zzd;
        if (interfaceC2299m5.zza()) {
            return;
        }
        this.zzd = AbstractC2245g5.z(interfaceC2299m5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", C2225e3.class, "zze", "zzf", "zzg", C2198b3.f24461a});
        }
        if (i11 == 3) {
            return new C2207c3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new Z2(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List C() {
        return this.zzd;
    }

    public final int D() {
        return this.zzd.size();
    }

    public final C2225e3 E(int i10) {
        return (C2225e3) this.zzd.get(i10);
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final String G() {
        return this.zze;
    }

    public final boolean H() {
        return (this.zzb & 2) != 0;
    }

    public final String I() {
        return this.zzf;
    }

    final /* synthetic */ void L(int i10, C2225e3 c2225e3) {
        c2225e3.getClass();
        S();
        this.zzd.set(i10, c2225e3);
    }

    final /* synthetic */ void M(C2225e3 c2225e3) {
        c2225e3.getClass();
        S();
        this.zzd.add(c2225e3);
    }

    final /* synthetic */ void N(Iterable iterable) {
        S();
        AbstractC2369u4.f(iterable, this.zzd);
    }

    final /* synthetic */ void O() {
        this.zzd = AbstractC2245g5.y();
    }

    final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }
}
