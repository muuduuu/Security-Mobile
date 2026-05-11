package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2604s extends N0 implements InterfaceC2615v1 {
    private static final C2604s zzi;
    private static volatile E1 zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    /* renamed from: com.google.android.gms.internal.vision.s$a */
    public enum a implements Q0 {
        FORMAT_UNKNOWN(0),
        FORMAT_LUMINANCE(1),
        FORMAT_RGB8(2),
        FORMAT_MONOCHROME(3);

        private static final T0 zze = new M();
        private final int zzf;

        a(int i10) {
            this.zzf = i10;
        }

        public static S0 zzb() {
            return L.f25044a;
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
                return FORMAT_UNKNOWN;
            }
            if (i10 == 1) {
                return FORMAT_LUMINANCE;
            }
            if (i10 == 2) {
                return FORMAT_RGB8;
            }
            if (i10 != 3) {
                return null;
            }
            return FORMAT_MONOCHROME;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.s$b */
    public static final class b extends N0.b implements InterfaceC2615v1 {
        private b() {
            super(C2604s.zzi);
        }

        public final b s(long j10) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            ((C2604s) this.f25051b).u(j10);
            return this;
        }

        public final b w(long j10) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            ((C2604s) this.f25051b).y(j10);
            return this;
        }

        public final b x(long j10) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            ((C2604s) this.f25051b).B(j10);
            return this;
        }

        public final b y(long j10) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            ((C2604s) this.f25051b).D(j10);
            return this;
        }

        /* synthetic */ b(AbstractC2625z abstractC2625z) {
            this();
        }
    }

    static {
        C2604s c2604s = new C2604s();
        zzi = c2604s;
        N0.n(C2604s.class, c2604s);
    }

    private C2604s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(long j10) {
        this.zzc |= 8;
        this.zzg = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(long j10) {
        this.zzc |= 16;
        this.zzh = j10;
    }

    public static b t() {
        return (b) zzi.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(long j10) {
        this.zzc |= 2;
        this.zze = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(long j10) {
        this.zzc |= 4;
        this.zzf = j10;
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    @Override // com.google.android.gms.internal.vision.N0
    protected final Object j(int i10, Object obj, Object obj2) {
        AbstractC2625z abstractC2625z = null;
        switch (AbstractC2625z.f25224a[i10 - 1]) {
            case 1:
                return new C2604s();
            case 2:
                return new b(abstractC2625z);
            case 3:
                return N0.l(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", a.zzb(), "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                E1 e12 = zzj;
                E1 e13 = e12;
                if (e12 == null) {
                    synchronized (C2604s.class) {
                        try {
                            E1 e14 = zzj;
                            E1 e15 = e14;
                            if (e14 == null) {
                                ?? aVar = new N0.a(zzi);
                                zzj = aVar;
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
