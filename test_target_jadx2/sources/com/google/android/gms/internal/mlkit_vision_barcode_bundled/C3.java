package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class C3 extends AbstractC2444f1 implements Q1 {
    private static final C3 zza;
    private int zzd;
    private int zzg;
    private s4 zzh;
    private m4 zzi;
    private h4 zzj;
    private int zzk;
    private byte zzm = 2;
    private int zze = 17;
    private InterfaceC2484n1 zzf = AbstractC2444f1.m();
    private InterfaceC2484n1 zzl = AbstractC2444f1.m();

    static {
        C3 c32 = new C3();
        zza = c32;
        AbstractC2444f1.t(C3.class, c32);
    }

    private C3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001᠌\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzd", "zze", C2426b3.f24850a, "zzf", C2467k.class, "zzg", "zzh", "zzi", "zzk", "zzl", C2482n.class, "zzj"});
        }
        if (i11 == 3) {
            return new C3();
        }
        AbstractC2420a2 abstractC2420a2 = null;
        if (i11 == 4) {
            return new A2(abstractC2420a2);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
