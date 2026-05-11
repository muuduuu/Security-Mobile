package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.vision.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2590n extends N0 implements InterfaceC2615v1 {
    private static final C2590n zzl;
    private static volatile E1 zzm;
    private int zzc;
    private boolean zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private String zzd = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.vision.n$a */
    public static final class a extends N0.b implements InterfaceC2615v1 {
        private a() {
            super(C2590n.zzl);
        }

        /* synthetic */ a(AbstractC2625z abstractC2625z) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.n$b */
    public enum b implements Q0 {
        REASON_UNKNOWN(0),
        REASON_MISSING(1),
        REASON_UPGRADE(2),
        REASON_INVALID(3);

        private static final T0 zze = new B();
        private final int zzf;

        b(int i10) {
            this.zzf = i10;
        }

        public static S0 zzb() {
            return C.f25001a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.Q0
        public final int zza() {
            return this.zzf;
        }

        public static b zza(int i10) {
            if (i10 == 0) {
                return REASON_UNKNOWN;
            }
            if (i10 == 1) {
                return REASON_MISSING;
            }
            if (i10 == 2) {
                return REASON_UPGRADE;
            }
            if (i10 != 3) {
                return null;
            }
            return REASON_INVALID;
        }
    }

    static {
        C2590n c2590n = new C2590n();
        zzl = c2590n;
        N0.n(C2590n.class, c2590n);
    }

    private C2590n() {
    }

    /* JADX WARN: Type inference failed for: r11v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    @Override // com.google.android.gms.internal.vision.N0
    protected final Object j(int i10, Object obj, Object obj2) {
        AbstractC2625z abstractC2625z = null;
        switch (AbstractC2625z.f25224a[i10 - 1]) {
            case 1:
                return new C2590n();
            case 2:
                return new a(abstractC2625z);
            case 3:
                return N0.l(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", b.zzb(), "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                E1 e12 = zzm;
                E1 e13 = e12;
                if (e12 == null) {
                    synchronized (C2590n.class) {
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
