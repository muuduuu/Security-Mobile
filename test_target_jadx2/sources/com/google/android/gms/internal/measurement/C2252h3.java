package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2252h3 extends AbstractC2245g5 implements I5 {
    private static final C2252h3 zzf;
    private int zzb;
    private int zzd = 1;
    private InterfaceC2299m5 zze = AbstractC2245g5.y();

    static {
        C2252h3 c2252h3 = new C2252h3();
        zzf = c2252h3;
        AbstractC2245g5.s(C2252h3.class, c2252h3);
    }

    private C2252h3() {
    }

    public static C2234f3 C() {
        return (C2234f3) zzf.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", C2243g3.f24511a, "zze", U2.class});
        }
        if (i11 == 3) {
            return new C2252h3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2234f3(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    final /* synthetic */ void D(U2 u22) {
        u22.getClass();
        InterfaceC2299m5 interfaceC2299m5 = this.zze;
        if (!interfaceC2299m5.zza()) {
            this.zze = AbstractC2245g5.z(interfaceC2299m5);
        }
        this.zze.add(u22);
    }
}
