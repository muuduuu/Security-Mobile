package i9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;
import org.conscrypt.BuildConfig;

/* renamed from: i9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3346c extends AbstractC2444f1 implements Q1 {
    private static final C3346c zza;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;
    private String zzk = BuildConfig.FLAVOR;
    private String zzl = BuildConfig.FLAVOR;
    private String zzm = BuildConfig.FLAVOR;

    static {
        C3346c c3346c = new C3346c();
        zza = c3346c;
        AbstractC2444f1.t(C3346c.class, c3346c);
    }

    private C3346c() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new C3346c();
        }
        AbstractC3345b abstractC3345b = null;
        if (i11 == 4) {
            return new P(abstractC3345b);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
