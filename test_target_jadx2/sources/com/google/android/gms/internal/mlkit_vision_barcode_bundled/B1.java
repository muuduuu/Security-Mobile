package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class B1 extends AbstractC2444f1 implements Q1 {
    public static final C2439e1 zza;
    private static final B1 zzd;
    private int zze;
    private h4 zzj;
    private B1 zzk;
    private v4 zzl;
    private byte zzm = 2;
    private String zzf = BuildConfig.FLAVOR;
    private InterfaceC2484n1 zzg = AbstractC2444f1.m();
    private InterfaceC2484n1 zzh = AbstractC2444f1.m();
    private InterfaceC2484n1 zzi = AbstractC2444f1.m();

    static {
        B1 b12 = new B1();
        zzd = b12;
        AbstractC2444f1.t(B1.class, b12);
        zza = AbstractC2444f1.f(h4.I(), b12, b12, null, 12208774, P2.zzk, B1.class);
    }

    private B1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zzd, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zze", "zzg", C3.class, "zzi", C3.class, "zzh", j4.class, "zzj", "zzf", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new B1();
        }
        C0 c02 = null;
        if (i11 == 4) {
            return new C2429c1(c02);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
