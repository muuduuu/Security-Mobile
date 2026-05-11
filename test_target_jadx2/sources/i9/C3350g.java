package i9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;

/* renamed from: i9.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3350g extends AbstractC2444f1 implements Q1 {
    private static final C3350g zza;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C3350g c3350g = new C3350g();
        zza = c3350g;
        AbstractC2444f1.t(C3350g.class, c3350g);
    }

    private C3350g() {
    }

    public static C3349f I() {
        return (C3349f) zza.d();
    }

    static /* synthetic */ void K(C3350g c3350g, int i10) {
        c3350g.zzd |= 1;
        c3350g.zze = i10;
    }

    static /* synthetic */ void L(C3350g c3350g, int i10) {
        c3350g.zzd |= 2;
        c3350g.zzf = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C3350g();
        }
        AbstractC3345b abstractC3345b = null;
        if (i11 == 4) {
            return new C3349f(abstractC3345b);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int G() {
        return this.zze;
    }

    public final int H() {
        return this.zzf;
    }
}
