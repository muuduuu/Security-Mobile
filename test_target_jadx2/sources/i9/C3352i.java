package i9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;
import org.conscrypt.BuildConfig;

/* renamed from: i9.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3352i extends AbstractC2444f1 implements Q1 {
    private static final C3352i zza;
    private int zzd;
    private byte zzg = 2;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;

    static {
        C3352i c3352i = new C3352i();
        zza = c3352i;
        AbstractC2444f1.t(C3352i.class, c3352i);
    }

    private C3352i() {
    }

    public static C3352i H() {
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
            return new C3352i();
        }
        AbstractC3345b abstractC3345b = null;
        if (i11 == 4) {
            return new C3351h(abstractC3345b);
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
