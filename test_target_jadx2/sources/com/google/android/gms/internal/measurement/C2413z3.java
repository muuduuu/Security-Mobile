package com.google.android.gms.internal.measurement;

import java.util.List;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2413z3 extends AbstractC2245g5 implements I5 {
    private static final C2413z3 zzf;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private InterfaceC2299m5 zze = AbstractC2245g5.y();

    static {
        C2413z3 c2413z3 = new C2413z3();
        zzf = c2413z3;
        AbstractC2245g5.s(C2413z3.class, c2413z3);
    }

    private C2413z3() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", G3.class});
        }
        if (i11 == 3) {
            return new C2413z3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2404y3(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }

    public final List D() {
        return this.zze;
    }
}
