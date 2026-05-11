package i9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class q extends AbstractC2444f1 implements Q1 {
    private static final q zza;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    static {
        q qVar = new q();
        zza = qVar;
        AbstractC2444f1.t(q.class, qVar);
    }

    private q() {
    }

    public static q H() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", C3358o.f34152a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new q();
        }
        AbstractC3345b abstractC3345b = null;
        if (i11 == 4) {
            return new C3356m(abstractC3345b);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String I() {
        return this.zzg;
    }

    public final String J() {
        return this.zze;
    }

    public final int K() {
        int a10 = AbstractC3359p.a(this.zzf);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
