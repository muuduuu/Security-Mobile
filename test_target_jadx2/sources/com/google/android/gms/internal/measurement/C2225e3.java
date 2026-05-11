package com.google.android.gms.internal.measurement;

import java.util.List;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* renamed from: com.google.android.gms.internal.measurement.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2225e3 extends AbstractC2245g5 implements I5 {
    private static final C2225e3 zzat;
    private int zzA;
    private boolean zzD;
    private int zzG;
    private int zzH;
    private int zzI;
    private long zzK;
    private long zzL;
    private int zzO;
    private C2252h3 zzQ;
    private long zzS;
    private long zzT;
    private int zzW;
    private boolean zzX;
    private boolean zzZ;
    private Y2 zzaa;
    private long zzae;
    private boolean zzaf;
    private boolean zzah;
    private int zzaj;
    private E2 zzal;
    private int zzam;
    private A2 zzan;
    private C2359t3 zzap;
    private long zzaq;
    private O2 zzas;
    private int zzb;
    private int zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private int zzq;
    private long zzu;
    private long zzv;
    private boolean zzx;
    private long zzz;
    private InterfaceC2299m5 zzf = AbstractC2245g5.y();
    private InterfaceC2299m5 zzg = AbstractC2245g5.y();
    private String zzm = BuildConfig.FLAVOR;
    private String zzn = BuildConfig.FLAVOR;
    private String zzo = BuildConfig.FLAVOR;
    private String zzp = BuildConfig.FLAVOR;
    private String zzr = BuildConfig.FLAVOR;
    private String zzs = BuildConfig.FLAVOR;
    private String zzt = BuildConfig.FLAVOR;
    private String zzw = BuildConfig.FLAVOR;
    private String zzy = BuildConfig.FLAVOR;
    private String zzB = BuildConfig.FLAVOR;
    private String zzC = BuildConfig.FLAVOR;
    private InterfaceC2299m5 zzE = AbstractC2245g5.y();
    private String zzF = BuildConfig.FLAVOR;
    private String zzJ = BuildConfig.FLAVOR;
    private String zzM = BuildConfig.FLAVOR;
    private String zzN = BuildConfig.FLAVOR;
    private String zzP = BuildConfig.FLAVOR;
    private InterfaceC2281k5 zzR = AbstractC2245g5.v();
    private String zzU = BuildConfig.FLAVOR;
    private String zzV = BuildConfig.FLAVOR;
    private String zzY = BuildConfig.FLAVOR;
    private String zzab = BuildConfig.FLAVOR;
    private InterfaceC2299m5 zzac = AbstractC2245g5.y();
    private String zzad = BuildConfig.FLAVOR;
    private String zzag = BuildConfig.FLAVOR;
    private String zzai = BuildConfig.FLAVOR;
    private String zzak = BuildConfig.FLAVOR;
    private String zzao = BuildConfig.FLAVOR;
    private String zzar = BuildConfig.FLAVOR;

    static {
        C2225e3 c2225e3 = new C2225e3();
        zzat = c2225e3;
        AbstractC2245g5.s(C2225e3.class, c2225e3);
    }

    private C2225e3() {
    }

    public static C2216d3 h0() {
        return (C2216d3) zzat.o();
    }

    public static C2216d3 i0(C2225e3 c2225e3) {
        AbstractC2227e5 o10 = zzat.o();
        o10.w(c2225e3);
        return (C2216d3) o10;
    }

    private final void j2() {
        InterfaceC2299m5 interfaceC2299m5 = this.zzf;
        if (interfaceC2299m5.zza()) {
            return;
        }
        this.zzf = AbstractC2245g5.z(interfaceC2299m5);
    }

    private final void k2() {
        InterfaceC2299m5 interfaceC2299m5 = this.zzg;
        if (interfaceC2299m5.zza()) {
            return;
        }
        this.zzg = AbstractC2245g5.z(interfaceC2299m5);
    }

    final /* synthetic */ void A0() {
        this.zzb &= -33;
        this.zzl = 0L;
    }

    final /* synthetic */ void A1(E2 e22) {
        e22.getClass();
        this.zzal = e22;
        this.zzd |= 4194304;
    }

    public final String A2() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2245g5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2245g5.t(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"zzb", "zzd", "zze", "zzf", S2.class, "zzg", C2377v3.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", G2.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", C2376v2.f24670a, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i11 == 3) {
            return new C2225e3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2216d3(bArr);
        }
        if (i11 == 5) {
            return zzat;
        }
        throw null;
    }

    final /* synthetic */ void B0(String str) {
        this.zzb |= 64;
        this.zzm = "android";
    }

    final /* synthetic */ void B1(int i10) {
        this.zzd |= 8388608;
        this.zzam = i10;
    }

    public final String B2() {
        return this.zzn;
    }

    public final String C() {
        return this.zzs;
    }

    final /* synthetic */ void C0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
    }

    final /* synthetic */ void C1(A2 a22) {
        a22.getClass();
        this.zzan = a22;
        this.zzd |= 16777216;
    }

    public final String C2() {
        return this.zzo;
    }

    public final String D() {
        return this.zzt;
    }

    public final boolean D0() {
        return (this.zzd & 2) != 0;
    }

    final /* synthetic */ void D1(C2359t3 c2359t3) {
        this.zzap = c2359t3;
        this.zzd |= 67108864;
    }

    public final String D2() {
        return this.zzp;
    }

    public final boolean E() {
        return (this.zzb & 16384) != 0;
    }

    public final int E0() {
        return this.zzO;
    }

    final /* synthetic */ void E1(long j10) {
        this.zzd |= 134217728;
        this.zzaq = j10;
    }

    public final boolean E2() {
        return (this.zzb & 1024) != 0;
    }

    public final long F() {
        return this.zzu;
    }

    public final boolean F0() {
        return (this.zzd & 16) != 0;
    }

    final /* synthetic */ void F1(String str) {
        this.zzd |= 268435456;
        this.zzar = BuildConfig.FLAVOR;
    }

    public final int F2() {
        return this.zzq;
    }

    public final boolean G() {
        return (this.zzb & 32768) != 0;
    }

    public final long G0() {
        return this.zzS;
    }

    final /* synthetic */ void G1(O2 o22) {
        o22.getClass();
        this.zzas = o22;
        this.zzd |= 536870912;
    }

    public final String G2() {
        return this.zzr;
    }

    public final long H() {
        return this.zzv;
    }

    public final boolean H0() {
        return (this.zzd & 128) != 0;
    }

    final /* synthetic */ void H1(String str) {
        str.getClass();
        this.zzb |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        this.zzo = str;
    }

    public final String I() {
        return this.zzw;
    }

    public final String I0() {
        return this.zzV;
    }

    final /* synthetic */ void I1() {
        this.zzb &= -257;
        this.zzo = zzat.zzo;
    }

    public final boolean J() {
        return (this.zzb & 131072) != 0;
    }

    public final boolean J0() {
        return (this.zzd & 8192) != 0;
    }

    final /* synthetic */ void J1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzp = str;
    }

    public final boolean K() {
        return this.zzx;
    }

    public final String K0() {
        return this.zzab;
    }

    final /* synthetic */ void K1(int i10) {
        this.zzb |= 1024;
        this.zzq = i10;
    }

    public final String L() {
        return this.zzy;
    }

    public final boolean L0() {
        return (this.zzd & 32768) != 0;
    }

    final /* synthetic */ void L1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzr = str;
    }

    public final boolean M() {
        return (this.zzb & 524288) != 0;
    }

    public final long M0() {
        return this.zzae;
    }

    final /* synthetic */ void M1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzs = str;
    }

    public final long N() {
        return this.zzz;
    }

    public final boolean N0() {
        return this.zzaf;
    }

    final /* synthetic */ void N1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzt = str;
    }

    public final boolean O() {
        return (this.zzb & 1048576) != 0;
    }

    public final boolean O0() {
        return (this.zzd & 131072) != 0;
    }

    final /* synthetic */ void O1(long j10) {
        this.zzb |= 16384;
        this.zzu = j10;
    }

    public final int P() {
        return this.zzA;
    }

    public final String P0() {
        return this.zzag;
    }

    final /* synthetic */ void P1(long j10) {
        this.zzb |= 32768;
        this.zzv = 133005L;
    }

    public final String Q() {
        return this.zzB;
    }

    public final boolean Q0() {
        return (this.zzd & 262144) != 0;
    }

    final /* synthetic */ void Q1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzw = str;
    }

    public final String R() {
        return this.zzC;
    }

    public final boolean R0() {
        return this.zzah;
    }

    final /* synthetic */ void R1() {
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
    }

    public final boolean S() {
        return (this.zzb & 8388608) != 0;
    }

    public final boolean S0() {
        return (this.zzd & 524288) != 0;
    }

    final /* synthetic */ void S1(boolean z10) {
        this.zzb |= 131072;
        this.zzx = z10;
    }

    public final boolean T() {
        return this.zzD;
    }

    public final String T0() {
        return this.zzai;
    }

    final /* synthetic */ void T1() {
        this.zzb &= -131073;
        this.zzx = false;
    }

    public final List U() {
        return this.zzE;
    }

    public final int U0() {
        return this.zzaj;
    }

    final /* synthetic */ void U1(String str) {
        str.getClass();
        this.zzb |= 262144;
        this.zzy = str;
    }

    public final String V() {
        return this.zzF;
    }

    public final boolean V0() {
        return (this.zzd & 4194304) != 0;
    }

    final /* synthetic */ void V1() {
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
    }

    public final boolean W() {
        return (this.zzb & 33554432) != 0;
    }

    public final E2 W0() {
        E2 e22 = this.zzal;
        return e22 == null ? E2.K() : e22;
    }

    final /* synthetic */ void W1(long j10) {
        this.zzb |= 524288;
        this.zzz = j10;
    }

    public final int X() {
        return this.zzG;
    }

    public final boolean X0() {
        return (this.zzd & 8388608) != 0;
    }

    final /* synthetic */ void X1(int i10) {
        this.zzb |= 1048576;
        this.zzA = i10;
    }

    public final boolean Y() {
        return (this.zzb & 536870912) != 0;
    }

    public final int Y0() {
        return this.zzam;
    }

    final /* synthetic */ void Y1(String str) {
        this.zzb |= 2097152;
        this.zzB = str;
    }

    public final long Z() {
        return this.zzK;
    }

    public final boolean Z0() {
        return (this.zzd & 16777216) != 0;
    }

    final /* synthetic */ void Z1() {
        this.zzb &= -2097153;
        this.zzB = zzat.zzB;
    }

    public final boolean a0() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final A2 a1() {
        A2 a22 = this.zzan;
        return a22 == null ? A2.d0() : a22;
    }

    final /* synthetic */ void a2(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzC = str;
    }

    public final String b0() {
        return this.zzM;
    }

    public final boolean b1() {
        return (this.zzd & 67108864) != 0;
    }

    final /* synthetic */ void b2(boolean z10) {
        this.zzb |= 8388608;
        this.zzD = z10;
    }

    public final boolean c0() {
        return (this.zzb & 1) != 0;
    }

    public final C2359t3 c1() {
        C2359t3 c2359t3 = this.zzap;
        return c2359t3 == null ? C2359t3.E() : c2359t3;
    }

    final /* synthetic */ void c2(Iterable iterable) {
        InterfaceC2299m5 interfaceC2299m5 = this.zzE;
        if (!interfaceC2299m5.zza()) {
            this.zzE = AbstractC2245g5.z(interfaceC2299m5);
        }
        AbstractC2369u4.f(iterable, this.zzE);
    }

    public final boolean d0() {
        return (this.zzd & 134217728) != 0;
    }

    public final int d1() {
        return this.zze;
    }

    final /* synthetic */ void d2() {
        this.zzE = AbstractC2245g5.y();
    }

    public final long e0() {
        return this.zzaq;
    }

    final /* synthetic */ void e1(long j10) {
        this.zzb |= 536870912;
        this.zzK = j10;
    }

    final /* synthetic */ void e2(String str) {
        str.getClass();
        this.zzb |= 16777216;
        this.zzF = str;
    }

    public final boolean f0() {
        return (this.zzd & 536870912) != 0;
    }

    final /* synthetic */ void f1(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzM = str;
    }

    final /* synthetic */ void f2(int i10) {
        this.zzb |= 33554432;
        this.zzG = i10;
    }

    public final O2 g0() {
        O2 o22 = this.zzas;
        return o22 == null ? O2.E() : o22;
    }

    final /* synthetic */ void g1() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzM = zzat.zzM;
    }

    final /* synthetic */ void g2() {
        this.zzb &= -268435457;
        this.zzJ = zzat.zzJ;
    }

    final /* synthetic */ void h1(int i10) {
        this.zzd |= 2;
        this.zzO = i10;
    }

    public final List h2() {
        return this.zzf;
    }

    final /* synthetic */ void j0(int i10) {
        this.zzb |= 1;
        this.zze = 1;
    }

    final /* synthetic */ void j1(C2252h3 c2252h3) {
        c2252h3.getClass();
        this.zzQ = c2252h3;
        this.zzd |= 8;
    }

    final /* synthetic */ void k0(int i10, S2 s22) {
        s22.getClass();
        j2();
        this.zzf.set(i10, s22);
    }

    final /* synthetic */ void k1(Iterable iterable) {
        InterfaceC2281k5 interfaceC2281k5 = this.zzR;
        if (!interfaceC2281k5.zza()) {
            int size = interfaceC2281k5.size();
            this.zzR = interfaceC2281k5.O1(size + size);
        }
        AbstractC2369u4.f(iterable, this.zzR);
    }

    final /* synthetic */ void l0(S2 s22) {
        s22.getClass();
        j2();
        this.zzf.add(s22);
    }

    final /* synthetic */ void l1(long j10) {
        this.zzd |= 16;
        this.zzS = j10;
    }

    public final int l2() {
        return this.zzf.size();
    }

    final /* synthetic */ void m0(Iterable iterable) {
        j2();
        AbstractC2369u4.f(iterable, this.zzf);
    }

    public final S2 m2(int i10) {
        return (S2) this.zzf.get(i10);
    }

    final /* synthetic */ void n0() {
        this.zzf = AbstractC2245g5.y();
    }

    final /* synthetic */ void n1(long j10) {
        this.zzd |= 32;
        this.zzT = j10;
    }

    public final List n2() {
        return this.zzg;
    }

    final /* synthetic */ void o0(int i10) {
        j2();
        this.zzf.remove(i10);
    }

    final /* synthetic */ void o1(String str) {
        this.zzd |= 128;
        this.zzV = str;
    }

    public final int o2() {
        return this.zzg.size();
    }

    final /* synthetic */ void p0(int i10, C2377v3 c2377v3) {
        c2377v3.getClass();
        k2();
        this.zzg.set(i10, c2377v3);
    }

    final /* synthetic */ void p1(String str) {
        str.getClass();
        this.zzd |= 8192;
        this.zzab = str;
    }

    public final C2377v3 p2(int i10) {
        return (C2377v3) this.zzg.get(i10);
    }

    final /* synthetic */ void q0(C2377v3 c2377v3) {
        c2377v3.getClass();
        k2();
        this.zzg.add(c2377v3);
    }

    final /* synthetic */ void q1() {
        this.zzd &= -8193;
        this.zzab = zzat.zzab;
    }

    public final boolean q2() {
        return (this.zzb & 2) != 0;
    }

    final /* synthetic */ void r0(Iterable iterable) {
        k2();
        AbstractC2369u4.f(iterable, this.zzg);
    }

    final /* synthetic */ void r1(Iterable iterable) {
        InterfaceC2299m5 interfaceC2299m5 = this.zzac;
        if (!interfaceC2299m5.zza()) {
            this.zzac = AbstractC2245g5.z(interfaceC2299m5);
        }
        AbstractC2369u4.f(iterable, this.zzac);
    }

    public final long r2() {
        return this.zzh;
    }

    final /* synthetic */ void s0(int i10) {
        k2();
        this.zzg.remove(i10);
    }

    final /* synthetic */ void s1(String str) {
        str.getClass();
        this.zzd |= 16384;
        this.zzad = str;
    }

    public final boolean s2() {
        return (this.zzb & 4) != 0;
    }

    final /* synthetic */ void t0(long j10) {
        this.zzb |= 2;
        this.zzh = j10;
    }

    public final long t2() {
        return this.zzi;
    }

    final /* synthetic */ void u0() {
        this.zzb &= -3;
        this.zzh = 0L;
    }

    final /* synthetic */ void u1(long j10) {
        this.zzd |= 32768;
        this.zzae = j10;
    }

    public final boolean u2() {
        return (this.zzb & 8) != 0;
    }

    final /* synthetic */ void v0(long j10) {
        this.zzb |= 4;
        this.zzi = j10;
    }

    final /* synthetic */ void v1(boolean z10) {
        this.zzd |= 65536;
        this.zzaf = z10;
    }

    public final long v2() {
        return this.zzj;
    }

    final /* synthetic */ void w0(long j10) {
        this.zzb |= 8;
        this.zzj = j10;
    }

    final /* synthetic */ void w1(String str) {
        this.zzd |= 131072;
        this.zzag = str;
    }

    public final boolean w2() {
        return (this.zzb & 16) != 0;
    }

    final /* synthetic */ void x0(long j10) {
        this.zzb |= 16;
        this.zzk = j10;
    }

    final /* synthetic */ void x1(boolean z10) {
        this.zzd |= 262144;
        this.zzah = z10;
    }

    public final long x2() {
        return this.zzk;
    }

    final /* synthetic */ void y0() {
        this.zzb &= -17;
        this.zzk = 0L;
    }

    final /* synthetic */ void y1(String str) {
        str.getClass();
        this.zzd |= 524288;
        this.zzai = str;
    }

    public final boolean y2() {
        return (this.zzb & 32) != 0;
    }

    final /* synthetic */ void z0(long j10) {
        this.zzb |= 32;
        this.zzl = j10;
    }

    final /* synthetic */ void z1(int i10) {
        this.zzd |= 1048576;
        this.zzaj = i10;
    }

    public final long z2() {
        return this.zzl;
    }
}
