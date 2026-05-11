package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2596p extends N0 implements InterfaceC2615v1 {
    private static final C2596p zzj;
    private static volatile E1 zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    /* renamed from: com.google.android.gms.internal.vision.p$a */
    public static final class a extends N0.b implements InterfaceC2615v1 {
        private a() {
            super(C2596p.zzj);
        }

        /* synthetic */ a(AbstractC2625z abstractC2625z) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$b */
    public enum b implements Q0 {
        CLASSIFICATION_UNKNOWN(0),
        CLASSIFICATION_NONE(1),
        CLASSIFICATION_ALL(2);

        private static final T0 zzd = new F();
        private final int zze;

        b(int i10) {
            this.zze = i10;
        }

        public static S0 zzb() {
            return G.f25027a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.Q0
        public final int zza() {
            return this.zze;
        }

        public static b zza(int i10) {
            if (i10 == 0) {
                return CLASSIFICATION_UNKNOWN;
            }
            if (i10 == 1) {
                return CLASSIFICATION_NONE;
            }
            if (i10 != 2) {
                return null;
            }
            return CLASSIFICATION_ALL;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$c */
    public enum c implements Q0 {
        LANDMARK_UNKNOWN(0),
        LANDMARK_NONE(1),
        LANDMARK_ALL(2),
        LANDMARK_CONTOUR(3);

        private static final T0 zze = new I();
        private final int zzf;

        c(int i10) {
            this.zzf = i10;
        }

        public static S0 zzb() {
            return H.f25031a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.Q0
        public final int zza() {
            return this.zzf;
        }

        public static c zza(int i10) {
            if (i10 == 0) {
                return LANDMARK_UNKNOWN;
            }
            if (i10 == 1) {
                return LANDMARK_NONE;
            }
            if (i10 == 2) {
                return LANDMARK_ALL;
            }
            if (i10 != 3) {
                return null;
            }
            return LANDMARK_CONTOUR;
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.p$d */
    public enum d implements Q0 {
        MODE_UNKNOWN(0),
        MODE_ACCURATE(1),
        MODE_FAST(2),
        MODE_SELFIE(3);

        private static final T0 zze = new J();
        private final int zzf;

        d(int i10) {
            this.zzf = i10;
        }

        public static S0 zzb() {
            return K.f25041a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.vision.Q0
        public final int zza() {
            return this.zzf;
        }

        public static d zza(int i10) {
            if (i10 == 0) {
                return MODE_UNKNOWN;
            }
            if (i10 == 1) {
                return MODE_ACCURATE;
            }
            if (i10 == 2) {
                return MODE_FAST;
            }
            if (i10 != 3) {
                return null;
            }
            return MODE_SELFIE;
        }
    }

    static {
        C2596p c2596p = new C2596p();
        zzj = c2596p;
        N0.n(C2596p.class, c2596p);
    }

    private C2596p() {
    }

    /* JADX WARN: Type inference failed for: r11v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    @Override // com.google.android.gms.internal.vision.N0
    protected final Object j(int i10, Object obj, Object obj2) {
        AbstractC2625z abstractC2625z = null;
        switch (AbstractC2625z.f25224a[i10 - 1]) {
            case 1:
                return new C2596p();
            case 2:
                return new a(abstractC2625z);
            case 3:
                return N0.l(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", d.zzb(), "zze", c.zzb(), "zzf", b.zzb(), "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                E1 e12 = zzk;
                E1 e13 = e12;
                if (e12 == null) {
                    synchronized (C2596p.class) {
                        try {
                            E1 e14 = zzk;
                            E1 e15 = e14;
                            if (e14 == null) {
                                ?? aVar = new N0.a(zzj);
                                zzk = aVar;
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
