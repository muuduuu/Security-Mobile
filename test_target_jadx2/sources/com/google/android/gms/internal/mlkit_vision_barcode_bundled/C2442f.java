package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2442f extends AbstractC2444f1 implements Q1 {
    private static final C2442f zza;
    private int zzd;
    private int zze = 4369;
    private String zzf = BuildConfig.FLAVOR;

    static {
        C2442f c2442f = new C2442f();
        zza = c2442f;
        AbstractC2444f1.t(C2442f.class, c2442f);
    }

    private C2442f() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", o4.f24893a, "zzf"});
        }
        if (i11 == 3) {
            return new C2442f();
        }
        AbstractC2432d abstractC2432d = null;
        if (i11 == 4) {
            return new C2437e(abstractC2432d);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
