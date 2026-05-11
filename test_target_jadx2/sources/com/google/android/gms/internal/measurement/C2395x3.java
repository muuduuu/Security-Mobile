package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2395x3 extends AbstractC2245g5 implements I5 {
    private static final C2395x3 zzd;
    private InterfaceC2299m5 zzb = AbstractC2245g5.y();

    static {
        C2395x3 c2395x3 = new C2395x3();
        zzd = c2395x3;
        AbstractC2245g5.s(C2395x3.class, c2395x3);
    }

    private C2395x3() {
    }

    public static C2395x3 E() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C2413z3.class});
        }
        if (i11 == 3) {
            return new C2395x3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2386w3(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List C() {
        return this.zzb;
    }

    public final int D() {
        return this.zzb.size();
    }
}
