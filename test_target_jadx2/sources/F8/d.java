package f8;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2469k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;

/* loaded from: classes2.dex */
public final class d extends AbstractC2444f1 implements Q1 {
    private static final d zza;
    private int zzd;
    private InterfaceC2469k1 zze = AbstractC2444f1.j();
    private InterfaceC2469k1 zzf = AbstractC2444f1.j();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        d dVar = new d();
        zza = dVar;
        AbstractC2444f1.t(d.class, dVar);
    }

    private d() {
    }

    public static c G() {
        return (c) zza.d();
    }

    static /* synthetic */ void I(d dVar, int i10) {
        dVar.zzd |= 2;
        dVar.zzh = i10;
    }

    static /* synthetic */ void J(d dVar, float f10) {
        InterfaceC2469k1 interfaceC2469k1 = dVar.zze;
        if (!interfaceC2469k1.a()) {
            dVar.zze = AbstractC2444f1.k(interfaceC2469k1);
        }
        dVar.zze.M1(f10);
    }

    static /* synthetic */ void K(d dVar, float f10) {
        InterfaceC2469k1 interfaceC2469k1 = dVar.zzf;
        if (!interfaceC2469k1.a()) {
            dVar.zzf = AbstractC2444f1.k(interfaceC2469k1);
        }
        dVar.zzf.M1(f10);
    }

    static /* synthetic */ void L(d dVar, int i10) {
        dVar.zzd |= 1;
        dVar.zzg = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new d();
        }
        b bVar = null;
        if (i11 == 4) {
            return new c(bVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
