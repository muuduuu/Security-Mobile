package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class O2 extends AbstractC2245g5 implements I5 {
    private static final O2 zzd;
    private InterfaceC2299m5 zzb = AbstractC2245g5.y();

    static {
        O2 o22 = new O2();
        zzd = o22;
        AbstractC2245g5.s(O2.class, o22);
    }

    private O2() {
    }

    public static H2 D() {
        return (H2) zzd.o();
    }

    public static O2 E() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", L2.class});
        }
        if (i11 == 3) {
            return new O2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new H2(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List C() {
        return this.zzb;
    }

    final /* synthetic */ void F(Iterable iterable) {
        InterfaceC2299m5 interfaceC2299m5 = this.zzb;
        if (!interfaceC2299m5.zza()) {
            this.zzb = AbstractC2245g5.z(interfaceC2299m5);
        }
        AbstractC2369u4.f(iterable, this.zzb);
    }
}
