package f8;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2469k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.U2;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class j extends AbstractC2444f1 implements Q1 {
    private static final j zza;
    private int zzd;
    private g zzj;
    private U2 zzm;
    private String zze = BuildConfig.FLAVOR;
    private E0 zzf = E0.f24749b;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private InterfaceC2469k1 zzk = AbstractC2444f1.j();
    private int zzl = 1;
    private int zzn = 320;
    private int zzo = 4;
    private int zzp = 2;

    static {
        j jVar = new j();
        zza = jVar;
        AbstractC2444f1.t(j.class, jVar);
    }

    private j() {
    }

    public static i G() {
        return (i) zza.d();
    }

    static /* synthetic */ void I(j jVar, g gVar) {
        gVar.getClass();
        jVar.zzj = gVar;
        jVar.zzd |= 32;
    }

    static /* synthetic */ void J(j jVar, E0 e02) {
        e02.getClass();
        jVar.zzd |= 2;
        jVar.zzf = e02;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\u0007\u0013\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i11 == 3) {
            return new j();
        }
        h hVar = null;
        if (i11 == 4) {
            return new i(hVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
