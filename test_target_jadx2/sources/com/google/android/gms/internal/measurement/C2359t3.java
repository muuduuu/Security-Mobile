package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2359t3 extends AbstractC2245g5 implements I5 {
    private static final C2359t3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C2359t3 c2359t3 = new C2359t3();
        zzg = c2359t3;
        AbstractC2245g5.s(C2359t3.class, c2359t3);
    }

    private C2359t3() {
    }

    public static C2297m3 D() {
        return (C2297m3) zzg.o();
    }

    public static C2359t3 E() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", C2341r3.f24643a, "zze", C2306n3.f24579a, "zzf", C2324p3.f24616a});
        }
        if (i11 == 3) {
            return new C2359t3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2297m3(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final EnumC2315o3 C() {
        EnumC2315o3 zzb = EnumC2315o3.zzb(this.zze);
        return zzb == null ? EnumC2315o3.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : zzb;
    }

    final /* synthetic */ void F(EnumC2315o3 enumC2315o3) {
        this.zze = enumC2315o3.zza();
        this.zzb |= 2;
    }

    public final int H() {
        int a10 = AbstractC2350s3.a(this.zzd);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final int I() {
        int a10 = AbstractC2333q3.a(this.zzf);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    final /* synthetic */ void J(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void K(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 4;
    }
}
