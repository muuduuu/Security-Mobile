package i9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;

/* renamed from: i9.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3337D extends AbstractC2444f1 implements Q1 {
    private static final C3337D zza;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        C3337D c3337d = new C3337D();
        zza = c3337d;
        AbstractC2444f1.t(C3337D.class, c3337d);
    }

    private C3337D() {
    }

    public static C3337D N() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C3337D();
        }
        AbstractC3345b abstractC3345b = null;
        if (i11 == 4) {
            return new C3336C(abstractC3345b);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final int G() {
        return this.zzg;
    }

    public final int H() {
        return this.zzh;
    }

    public final int I() {
        return this.zzi;
    }

    public final int J() {
        return this.zzf;
    }

    public final int K() {
        return this.zzj;
    }

    public final int L() {
        return this.zze;
    }

    public final boolean O() {
        return this.zzk;
    }
}
