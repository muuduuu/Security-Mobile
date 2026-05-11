package com.google.android.gms.internal.measurement;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2260i2 extends AbstractC2245g5 implements I5 {
    private static final C2260i2 zzh;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        C2260i2 c2260i2 = new C2260i2();
        zzh = c2260i2;
        AbstractC2245g5.s(C2260i2.class, c2260i2);
    }

    private C2260i2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2260i2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2251h2(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }

    public final boolean D() {
        return (this.zzb & 2) != 0;
    }

    public final boolean E() {
        return this.zze;
    }

    public final boolean F() {
        return (this.zzb & 4) != 0;
    }

    public final boolean G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzb & 8) != 0;
    }

    public final int I() {
        return this.zzg;
    }

    final /* synthetic */ void J(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
