package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2314o2 extends AbstractC2245g5 implements I5 {
    private static final C2314o2 zzi;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;
    private int zzg = 13;
    private int zzh = 11;

    static {
        C2314o2 c2314o2 = new C2314o2();
        zzi = c2314o2;
        AbstractC2245g5.s(C2314o2.class, c2314o2);
    }

    private C2314o2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2314o2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2305n2(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }
}
