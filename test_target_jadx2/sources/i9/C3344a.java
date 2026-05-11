package i9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2484n1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;
import java.util.List;
import org.conscrypt.BuildConfig;

/* renamed from: i9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3344a extends AbstractC2444f1 implements Q1 {
    private static final C3344a zza;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private InterfaceC2484n1 zze = AbstractC2444f1.m();
    private String zzg = BuildConfig.FLAVOR;
    private E0 zzh = E0.f24749b;

    static {
        C3344a c3344a = new C3344a();
        zza = c3344a;
        AbstractC2444f1.t(C3344a.class, c3344a);
    }

    private C3344a() {
    }

    public static C3344a H(byte[] bArr, Q0 q02) {
        return (C3344a) AbstractC2444f1.i(zza, bArr, q02);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", s.class, "zzf", C3353j.f34151a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C3344a();
        }
        AbstractC3345b abstractC3345b = null;
        if (i11 == 4) {
            return new z(abstractC3345b);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List I() {
        return this.zze;
    }
}
