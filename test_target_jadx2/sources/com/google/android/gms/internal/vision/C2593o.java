package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.vision.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2593o extends N0 implements InterfaceC2615v1 {
    private static final C2593o zzl;
    private static volatile E1 zzm;
    private int zzc;
    private int zzg;
    private long zzi;
    private long zzj;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private X0 zzf = N0.s();
    private String zzh = BuildConfig.FLAVOR;
    private X0 zzk = N0.s();

    /* renamed from: com.google.android.gms.internal.vision.o$a */
    public enum a implements Q0 {
        RESULT_UNKNOWN(0),
        RESULT_SUCCESS(1),
        RESULT_FAIL(2),
        RESULT_SKIPPED(3);

        private static final T0 zze = new E();
        private final int zzf;

        a(int i10) {
            this.zzf = i10;
        }

        public static S0 zzb() {
            return D.f25007a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.Q0
        public final int zza() {
            return this.zzf;
        }

        public static a zza(int i10) {
            if (i10 == 0) {
                return RESULT_UNKNOWN;
            }
            if (i10 == 1) {
                return RESULT_SUCCESS;
            }
            if (i10 == 2) {
                return RESULT_FAIL;
            }
            if (i10 != 3) {
                return null;
            }
            return RESULT_SKIPPED;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.o$b */
    public static final class b extends N0.b implements InterfaceC2615v1 {
        private b() {
            super(C2593o.zzl);
        }

        public final b s(long j10) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            ((C2593o) this.f25051b).u(j10);
            return this;
        }

        public final b w(Iterable iterable) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            ((C2593o) this.f25051b).z(iterable);
            return this;
        }

        public final b x(String str) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            ((C2593o) this.f25051b).B(str);
            return this;
        }

        public final b y(long j10) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            ((C2593o) this.f25051b).D(j10);
            return this;
        }

        /* synthetic */ b(AbstractC2625z abstractC2625z) {
            this();
        }
    }

    static {
        C2593o c2593o = new C2593o();
        zzl = c2593o;
        N0.n(C2593o.class, c2593o);
    }

    private C2593o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(long j10) {
        this.zzc |= 32;
        this.zzj = j10;
    }

    public static b t() {
        return (b) zzl.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(long j10) {
        this.zzc |= 16;
        this.zzi = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(Iterable iterable) {
        X0 x02 = this.zzk;
        if (!x02.zza()) {
            this.zzk = N0.i(x02);
        }
        X.c(iterable, this.zzk);
    }

    /* JADX WARN: Type inference failed for: r12v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    @Override // com.google.android.gms.internal.vision.N0
    protected final Object j(int i10, Object obj, Object obj2) {
        AbstractC2625z abstractC2625z = null;
        switch (AbstractC2625z.f25224a[i10 - 1]) {
            case 1:
                return new C2593o();
            case 2:
                return new b(abstractC2625z);
            case 3:
                return N0.l(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", a.zzb(), "zzh", "zzi", "zzj", "zzk", C2616w.class});
            case 4:
                return zzl;
            case 5:
                E1 e12 = zzm;
                E1 e13 = e12;
                if (e12 == null) {
                    synchronized (C2593o.class) {
                        try {
                            E1 e14 = zzm;
                            E1 e15 = e14;
                            if (e14 == null) {
                                ?? aVar = new N0.a(zzl);
                                zzm = aVar;
                                e15 = aVar;
                            }
                        } finally {
                        }
                    }
                }
                return e13;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
