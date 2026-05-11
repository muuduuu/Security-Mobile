package i9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2478m0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2474l1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2484n1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Q1;
import java.util.List;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes2.dex */
public final class s extends AbstractC2444f1 implements Q1 {
    private static final s zza;
    private int zzd;
    private int zze;
    private E0 zzf;
    private String zzg;
    private int zzh;
    private C3341H zzi;
    private O zzj;
    private C2478m0 zzk;
    private C3352i zzl;
    private q zzm;
    private C3355l zzn;
    private C3348e zzo;
    private C3339F zzp;
    private C3343J zzq;
    private C3335B zzr;
    private InterfaceC2484n1 zzs;
    private InterfaceC2474l1 zzt;
    private String zzu;
    private InterfaceC2484n1 zzv;
    private boolean zzw;
    private double zzx;
    private E0 zzy;
    private byte zzz = 2;

    static {
        s sVar = new s();
        zza = sVar;
        AbstractC2444f1.t(s.class, sVar);
    }

    private s() {
        E0 e02 = E0.f24749b;
        this.zzf = e02;
        this.zzg = BuildConfig.FLAVOR;
        this.zzs = AbstractC2444f1.m();
        this.zzt = AbstractC2444f1.l();
        this.zzu = BuildConfig.FLAVOR;
        this.zzv = AbstractC2444f1.m();
        this.zzw = true;
        this.zzy = e02;
    }

    static /* synthetic */ void V(s sVar, int i10, C3350g c3350g) {
        c3350g.getClass();
        InterfaceC2484n1 interfaceC2484n1 = sVar.zzs;
        if (!interfaceC2484n1.a()) {
            sVar.zzs = AbstractC2444f1.n(interfaceC2484n1);
        }
        sVar.zzs.set(i10, c3350g);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2444f1
    protected final Object F(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzz);
        }
        if (i11 == 2) {
            return AbstractC2444f1.p(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bЛ\fဈ\u000e\rЛ\u000eည\u0011\u000fᐉ\n\u0010ဉ\u000b\u0011ဉ\f\u0012\u0016\u0013ဉ\r\u0014ဇ\u000f\u0015က\u0010", new Object[]{"zzd", "zze", u.f34154a, "zzf", "zzg", "zzh", x.f34156a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzs", C3350g.class, "zzu", "zzv", C3350g.class, "zzy", "zzo", "zzp", "zzq", "zzt", "zzr", "zzw", "zzx"});
        }
        if (i11 == 3) {
            return new s();
        }
        AbstractC3345b abstractC3345b = null;
        if (i11 == 4) {
            return new r(abstractC3345b);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzz = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int G() {
        int a10 = y.a(this.zzh);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }

    public final int H() {
        return this.zzs.size();
    }

    public final C2478m0 I() {
        C2478m0 c2478m0 = this.zzk;
        return c2478m0 == null ? C2478m0.H() : c2478m0;
    }

    public final C3339F K() {
        C3339F c3339f = this.zzp;
        return c3339f == null ? C3339F.J() : c3339f;
    }

    public final C3341H L() {
        C3341H c3341h = this.zzi;
        return c3341h == null ? C3341H.I() : c3341h;
    }

    public final C3343J M() {
        C3343J c3343j = this.zzq;
        return c3343j == null ? C3343J.H() : c3343j;
    }

    public final O N() {
        O o10 = this.zzj;
        return o10 == null ? O.H() : o10;
    }

    public final C3348e O() {
        C3348e c3348e = this.zzo;
        return c3348e == null ? C3348e.J() : c3348e;
    }

    public final C3352i P() {
        C3352i c3352i = this.zzl;
        return c3352i == null ? C3352i.H() : c3352i;
    }

    public final C3355l Q() {
        C3355l c3355l = this.zzn;
        return c3355l == null ? C3355l.H() : c3355l;
    }

    public final q R() {
        q qVar = this.zzm;
        return qVar == null ? q.H() : qVar;
    }

    public final E0 S() {
        return this.zzf;
    }

    public final String T() {
        return this.zzg;
    }

    public final List U() {
        return this.zzs;
    }

    public final boolean W() {
        return (this.zzd & 2048) != 0;
    }

    public final boolean X() {
        return (this.zzd & 16) != 0;
    }

    public final boolean Y() {
        return (this.zzd & 4096) != 0;
    }

    public final boolean Z() {
        return (this.zzd & 32) != 0;
    }

    public final boolean a0() {
        return (this.zzd & 1024) != 0;
    }

    public final boolean b0() {
        return (this.zzd & 64) != 0;
    }

    public final boolean c0() {
        return (this.zzd & 128) != 0;
    }

    public final boolean d0() {
        return (this.zzd & 512) != 0;
    }

    public final boolean e0() {
        return (this.zzd & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
    }

    public final int f0() {
        int a10 = v.a(this.zze);
        if (a10 == 0) {
            return 1;
        }
        return a10;
    }
}
