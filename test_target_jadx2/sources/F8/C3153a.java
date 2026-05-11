package f8;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;

/* renamed from: f8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3153a extends AbstractC2444f1 implements Q1 {
    private static final C3153a zza;
    private int zzd;
    private j zze;
    private o zzf;

    static {
        C3153a c3153a = new C3153a();
        zza = c3153a;
        AbstractC2444f1.t(C3153a.class, c3153a);
    }

    private C3153a() {
    }

    public static l G() {
        return (l) zza.d();
    }

    static /* synthetic */ void I(C3153a c3153a, j jVar) {
        jVar.getClass();
        c3153a.zze = jVar;
        c3153a.zzd |= 1;
    }

    static /* synthetic */ void J(C3153a c3153a, o oVar) {
        oVar.getClass();
        c3153a.zzf = oVar;
        c3153a.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C3153a();
        }
        k kVar = null;
        if (i11 == 4) {
            return new l(kVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
