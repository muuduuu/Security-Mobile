package f8;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2484n1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;

/* loaded from: classes2.dex */
public final class g extends AbstractC2444f1 implements Q1 {
    private static final g zza;
    private InterfaceC2484n1 zzd = AbstractC2444f1.m();

    static {
        g gVar = new g();
        zza = gVar;
        AbstractC2444f1.t(g.class, gVar);
    }

    private g() {
    }

    public static f G() {
        return (f) zza.d();
    }

    static /* synthetic */ void I(g gVar, d dVar) {
        dVar.getClass();
        InterfaceC2484n1 interfaceC2484n1 = gVar.zzd;
        if (!interfaceC2484n1.a()) {
            gVar.zzd = AbstractC2444f1.n(interfaceC2484n1);
        }
        gVar.zzd.add(dVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", d.class});
        }
        if (i11 == 3) {
            return new g();
        }
        e eVar = null;
        if (i11 == 4) {
            return new f(eVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
