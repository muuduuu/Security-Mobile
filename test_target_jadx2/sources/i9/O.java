package i9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class O extends AbstractC2444f1 implements Q1 {
    private static final O zza;
    private int zzd;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;

    static {
        O o10 = new O();
        zza = o10;
        AbstractC2444f1.t(O.class, o10);
    }

    private O() {
    }

    public static O H() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", M.f34149a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new O();
        }
        AbstractC3345b abstractC3345b = null;
        if (i11 == 4) {
            return new K(abstractC3345b);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final String I() {
        return this.zzf;
    }

    public final String J() {
        return this.zzh;
    }

    public final String K() {
        return this.zzg;
    }

    public final int L() {
        int a10 = N.a(this.zze);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
