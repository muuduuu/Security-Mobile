package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2476l3 extends AbstractC2444f1 implements Q1 {
    private static final C2476l3 zza;
    private int zzd;
    private int zze;
    private int zzf;
    private InterfaceC2484n1 zzg = AbstractC2444f1.m();
    private int zzh;

    static {
        C2476l3 c2476l3 = new C2476l3();
        zza = c2476l3;
        AbstractC2444f1.t(C2476l3.class, c2476l3);
    }

    private C2476l3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zzd", "zze", C2471k3.f24882a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2476l3();
        }
        S2 s22 = null;
        if (i11 == 4) {
            return new C2466j3(s22);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
