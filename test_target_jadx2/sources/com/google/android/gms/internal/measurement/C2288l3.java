package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2288l3 extends AbstractC2245g5 implements I5 {
    private static final C2288l3 zzf;
    private int zzb;
    private int zzd;
    private InterfaceC2290l5 zze = AbstractC2245g5.w();

    static {
        C2288l3 c2288l3 = new C2288l3();
        zzf = c2288l3;
        AbstractC2245g5.s(C2288l3.class, c2288l3);
    }

    private C2288l3() {
    }

    public static C2279k3 H() {
        return (C2279k3) zzf.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C2288l3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2279k3(bArr);
        }
        if (i11 == 5) {
            return zzf;
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

    public final long G(int i10) {
        return this.zze.O0(i10);
    }

    final /* synthetic */ void I(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    final /* synthetic */ void J(Iterable iterable) {
        InterfaceC2290l5 interfaceC2290l5 = this.zze;
        if (!interfaceC2290l5.zza()) {
            this.zze = AbstractC2245g5.x(interfaceC2290l5);
        }
        AbstractC2369u4.f(iterable, this.zze);
    }
}
