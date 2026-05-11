package f8;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class o extends AbstractC2444f1 implements Q1 {
    private static final o zza;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private E0 zzf;
    private String zzg;
    private E0 zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        o oVar = new o();
        zza = oVar;
        AbstractC2444f1.t(o.class, oVar);
    }

    private o() {
        E0 e02 = E0.f24749b;
        this.zzf = e02;
        this.zzg = BuildConfig.FLAVOR;
        this.zzh = e02;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    public static n G() {
        return (n) zza.d();
    }

    static /* synthetic */ void I(o oVar, E0 e02) {
        e02.getClass();
        oVar.zzd |= 2;
        oVar.zzf = e02;
    }

    static /* synthetic */ void J(o oVar, E0 e02) {
        e02.getClass();
        oVar.zzd |= 8;
        oVar.zzh = e02;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new o();
        }
        m mVar = null;
        if (i11 == 4) {
            return new n(mVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
