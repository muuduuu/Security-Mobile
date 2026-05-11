package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2270j3 extends AbstractC2245g5 implements I5 {
    private static final C2270j3 zzg;
    private InterfaceC2290l5 zzb = AbstractC2245g5.w();
    private InterfaceC2290l5 zzd = AbstractC2245g5.w();
    private InterfaceC2299m5 zze = AbstractC2245g5.y();
    private InterfaceC2299m5 zzf = AbstractC2245g5.y();

    static {
        C2270j3 c2270j3 = new C2270j3();
        zzg = c2270j3;
        AbstractC2245g5.s(C2270j3.class, c2270j3);
    }

    private C2270j3() {
    }

    public static C2261i3 K() {
        return (C2261i3) zzg.o();
    }

    public static C2270j3 L() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", Q2.class, "zzf", C2288l3.class});
        }
        if (i11 == 3) {
            return new C2270j3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2261i3(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List C() {
        return this.zzb;
    }

    public final int D() {
        return this.zzb.size();
    }

    public final List E() {
        return this.zzd;
    }

    public final int F() {
        return this.zzd.size();
    }

    public final List G() {
        return this.zze;
    }

    public final int H() {
        return this.zze.size();
    }

    public final List I() {
        return this.zzf;
    }

    public final int J() {
        return this.zzf.size();
    }

    final /* synthetic */ void M(Iterable iterable) {
        InterfaceC2290l5 interfaceC2290l5 = this.zzb;
        if (!interfaceC2290l5.zza()) {
            this.zzb = AbstractC2245g5.x(interfaceC2290l5);
        }
        AbstractC2369u4.f(iterable, this.zzb);
    }

    final /* synthetic */ void N() {
        this.zzb = AbstractC2245g5.w();
    }

    final /* synthetic */ void O(Iterable iterable) {
        InterfaceC2290l5 interfaceC2290l5 = this.zzd;
        if (!interfaceC2290l5.zza()) {
            this.zzd = AbstractC2245g5.x(interfaceC2290l5);
        }
        AbstractC2369u4.f(iterable, this.zzd);
    }

    final /* synthetic */ void P() {
        this.zzd = AbstractC2245g5.w();
    }

    final /* synthetic */ void Q(Iterable iterable) {
        InterfaceC2299m5 interfaceC2299m5 = this.zze;
        if (!interfaceC2299m5.zza()) {
            this.zze = AbstractC2245g5.z(interfaceC2299m5);
        }
        AbstractC2369u4.f(iterable, this.zze);
    }

    final /* synthetic */ void R() {
        this.zze = AbstractC2245g5.y();
    }

    final /* synthetic */ void S(Iterable iterable) {
        InterfaceC2299m5 interfaceC2299m5 = this.zzf;
        if (!interfaceC2299m5.zza()) {
            this.zzf = AbstractC2245g5.z(interfaceC2299m5);
        }
        AbstractC2369u4.f(iterable, this.zzf);
    }

    final /* synthetic */ void T() {
        this.zzf = AbstractC2245g5.y();
    }
}
