package com.google.android.gms.internal.auth;

import java.util.List;

/* loaded from: classes2.dex */
public final class I1 extends C0 implements InterfaceC2034a1 {
    private static final I1 zzb;
    private E0 zzd = C0.e();

    static {
        I1 i12 = new I1();
        zzb = i12;
        C0.l(I1.class, i12);
    }

    private I1() {
    }

    public static I1 r(byte[] bArr) {
        return (I1) C0.d(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.auth.C0
    protected final Object o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return C0.i(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new I1();
        }
        G1 g12 = null;
        if (i11 == 4) {
            return new H1(g12);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final List s() {
        return this.zzd;
    }
}
