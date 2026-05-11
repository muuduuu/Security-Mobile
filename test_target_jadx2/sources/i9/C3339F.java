package i9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;
import org.conscrypt.BuildConfig;

/* renamed from: i9.F, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3339F extends AbstractC2444f1 implements Q1 {
    private static final C3339F zza;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private C3337D zzj;
    private C3337D zzk;

    static {
        C3339F c3339f = new C3339F();
        zza = c3339f;
        AbstractC2444f1.t(C3339F.class, c3339f);
    }

    private C3339F() {
    }

    public static C3339F J() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C3339F();
        }
        AbstractC3345b abstractC3345b = null;
        if (i11 == 4) {
            return new C3338E(abstractC3345b);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final C3337D G() {
        C3337D c3337d = this.zzk;
        return c3337d == null ? C3337D.N() : c3337d;
    }

    public final C3337D H() {
        C3337D c3337d = this.zzj;
        return c3337d == null ? C3337D.N() : c3337d;
    }

    public final String K() {
        return this.zzf;
    }

    public final String L() {
        return this.zzg;
    }

    public final String M() {
        return this.zzh;
    }

    public final String N() {
        return this.zzi;
    }

    public final String O() {
        return this.zze;
    }
}
