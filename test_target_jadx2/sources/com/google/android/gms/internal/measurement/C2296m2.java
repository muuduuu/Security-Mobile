package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2296m2 extends AbstractC2245g5 implements I5 {
    private static final C2296m2 zzd;
    private InterfaceC2299m5 zzb = AbstractC2245g5.y();

    static {
        C2296m2 c2296m2 = new C2296m2();
        zzd = c2296m2;
        AbstractC2245g5.s(C2296m2.class, c2296m2);
    }

    private C2296m2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new C2296m2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2287l2(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
