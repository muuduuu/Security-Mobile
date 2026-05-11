package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class B1 extends AbstractC2245g5 implements I5 {
    private static final B1 zzi;
    private int zzb;
    private int zzd;
    private InterfaceC2299m5 zze = AbstractC2245g5.y();
    private InterfaceC2299m5 zzf = AbstractC2245g5.y();
    private boolean zzg;
    private boolean zzh;

    static {
        B1 b12 = new B1();
        zzi = b12;
        AbstractC2245g5.s(B1.class, b12);
    }

    private B1() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", L1.class, "zzf", D1.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new B1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new A1(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final List E() {
        return this.zze;
    }

    public final int F() {
        return this.zze.size();
    }

    public final L1 G(int i10) {
        return (L1) this.zze.get(i10);
    }

    public final List H() {
        return this.zzf;
    }

    public final int I() {
        return this.zzf.size();
    }

    public final D1 J(int i10) {
        return (D1) this.zzf.get(i10);
    }

    final /* synthetic */ void K(int i10, L1 l12) {
        l12.getClass();
        InterfaceC2299m5 interfaceC2299m5 = this.zze;
        if (!interfaceC2299m5.zza()) {
            this.zze = AbstractC2245g5.z(interfaceC2299m5);
        }
        this.zze.set(i10, l12);
    }

    final /* synthetic */ void L(int i10, D1 d12) {
        d12.getClass();
        InterfaceC2299m5 interfaceC2299m5 = this.zzf;
        if (!interfaceC2299m5.zza()) {
            this.zzf = AbstractC2245g5.z(interfaceC2299m5);
        }
        this.zzf.set(i10, d12);
    }
}
