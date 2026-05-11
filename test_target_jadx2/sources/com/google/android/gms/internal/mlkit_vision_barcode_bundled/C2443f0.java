package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2443f0 extends AbstractC2444f1 implements Q1 {
    private static final C2443f0 zza;
    private int zzd;
    private int zze;
    private B1 zzg;
    private byte zzh = 2;
    private InterfaceC2484n1 zzf = AbstractC2444f1.m();

    static {
        C2443f0 c2443f0 = new C2443f0();
        zza = c2443f0;
        AbstractC2444f1.t(C2443f0.class, c2443f0);
    }

    private C2443f0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", C2428c0.f24852a, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2443f0();
        }
        Z z10 = null;
        if (i11 == 4) {
            return new C2418a0(z10);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List H() {
        return this.zzf;
    }

    public final int I() {
        int a10 = AbstractC2438e0.a(this.zze);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
