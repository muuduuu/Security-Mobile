package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class h4 extends AbstractC2424b1 implements Q1 {
    private static final h4 zzd;
    private byte zze = 2;

    static {
        h4 h4Var = new h4();
        zzd = h4Var;
        AbstractC2444f1.t(h4.class, h4Var);
    }

    private h4() {
    }

    public static h4 I() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zze);
        }
        f4 f4Var = null;
        if (i11 == 2) {
            return AbstractC2444f1.p(zzd, "\u0003\u0000", null);
        }
        if (i11 == 3) {
            return new h4();
        }
        if (i11 == 4) {
            return new g4(f4Var);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
