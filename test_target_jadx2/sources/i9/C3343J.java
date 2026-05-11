package i9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;
import org.conscrypt.BuildConfig;

/* renamed from: i9.J, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3343J extends AbstractC2444f1 implements Q1 {
    private static final C3343J zza;
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
    private String zzn = BuildConfig.FLAVOR;
    private String zzo = BuildConfig.FLAVOR;
    private String zzp = BuildConfig.FLAVOR;
    private String zzq = BuildConfig.FLAVOR;
    private String zzr = BuildConfig.FLAVOR;

    static {
        C3343J c3343j = new C3343J();
        zza = c3343j;
        AbstractC2444f1.t(C3343J.class, c3343j);
    }

    private C3343J() {
    }

    public static C3343J H() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i11 == 3) {
            return new C3343J();
        }
        AbstractC3345b abstractC3345b = null;
        if (i11 == 4) {
            return new C3342I(abstractC3345b);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final String I() {
        return this.zzk;
    }

    public final String J() {
        return this.zzl;
    }

    public final String K() {
        return this.zzj;
    }

    public final String L() {
        return this.zzm;
    }

    public final String M() {
        return this.zzq;
    }

    public final String N() {
        return this.zze;
    }

    public final String O() {
        return this.zzp;
    }

    public final String P() {
        return this.zzf;
    }

    public final String Q() {
        return this.zzi;
    }

    public final String R() {
        return this.zzo;
    }

    public final String S() {
        return this.zzr;
    }

    public final String T() {
        return this.zzh;
    }

    public final String U() {
        return this.zzn;
    }

    public final String V() {
        return this.zzg;
    }
}
