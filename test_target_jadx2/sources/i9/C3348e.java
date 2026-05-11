package i9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;

/* renamed from: i9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3348e extends AbstractC2444f1 implements Q1 {
    private static final C3348e zza;
    private int zzd;
    private double zze;
    private double zzf;
    private byte zzg = 2;

    static {
        C3348e c3348e = new C3348e();
        zza = c3348e;
        AbstractC2444f1.t(C3348e.class, c3348e);
    }

    private C3348e() {
    }

    public static C3348e J() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C3348e();
        }
        AbstractC3345b abstractC3345b = null;
        if (i11 == 4) {
            return new C3347d(abstractC3345b);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final double G() {
        return this.zze;
    }

    public final double H() {
        return this.zzf;
    }
}
