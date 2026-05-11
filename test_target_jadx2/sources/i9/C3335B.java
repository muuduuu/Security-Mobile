package i9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2484n1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;
import org.conscrypt.BuildConfig;

/* renamed from: i9.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3335B extends AbstractC2444f1 implements Q1 {
    private static final C3335B zza;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private InterfaceC2484n1 zzf = AbstractC2444f1.m();

    static {
        C3335B c3335b = new C3335B();
        zza = c3335b;
        AbstractC2444f1.t(C3335B.class, c3335b);
    }

    private C3335B() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C3346c.class});
        }
        if (i11 == 3) {
            return new C3335B();
        }
        AbstractC3345b abstractC3345b = null;
        if (i11 == 4) {
            return new C3334A(abstractC3345b);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
