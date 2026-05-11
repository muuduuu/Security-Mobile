package i9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2443f0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2453h0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2478m0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2484n1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;
import java.util.List;
import org.conscrypt.BuildConfig;

/* renamed from: i9.H, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3341H extends AbstractC2444f1 implements Q1 {
    private static final C3341H zza;
    private int zzd;
    private C2453h0 zze;
    private byte zzm = 2;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private InterfaceC2484n1 zzh = AbstractC2444f1.m();
    private InterfaceC2484n1 zzi = AbstractC2444f1.m();
    private InterfaceC2484n1 zzj = AbstractC2444f1.m();
    private InterfaceC2484n1 zzk = AbstractC2444f1.m();
    private String zzl = BuildConfig.FLAVOR;

    static {
        C3341H c3341h = new C3341H();
        zza = c3341h;
        AbstractC2444f1.t(C3341H.class, c3341h);
    }

    private C3341H() {
    }

    public static C3341H I() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C2478m0.class, "zzi", O.class, "zzj", "zzk", C2443f0.class, "zzl"});
        }
        if (i11 == 3) {
            return new C3341H();
        }
        AbstractC3345b abstractC3345b = null;
        if (i11 == 4) {
            return new C3340G(abstractC3345b);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final C2453h0 G() {
        C2453h0 c2453h0 = this.zze;
        return c2453h0 == null ? C2453h0.H() : c2453h0;
    }

    public final String J() {
        return this.zzf;
    }

    public final String K() {
        return this.zzg;
    }

    public final List L() {
        return this.zzk;
    }

    public final List M() {
        return this.zzi;
    }

    public final List N() {
        return this.zzh;
    }

    public final List O() {
        return this.zzj;
    }
}
