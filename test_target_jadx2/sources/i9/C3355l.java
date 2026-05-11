package i9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;
import org.conscrypt.BuildConfig;

/* renamed from: i9.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3355l extends AbstractC2444f1 implements Q1 {
    private static final C3355l zza;
    private int zzd;
    private byte zzg = 2;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;

    static {
        C3355l c3355l = new C3355l();
        zza = c3355l;
        AbstractC2444f1.t(C3355l.class, c3355l);
    }

    private C3355l() {
    }

    public static C3355l H() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C3355l();
        }
        AbstractC3345b abstractC3345b = null;
        if (i11 == 4) {
            return new C3354k(abstractC3345b);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String I() {
        return this.zze;
    }

    public final String J() {
        return this.zzf;
    }
}
