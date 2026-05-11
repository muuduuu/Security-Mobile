package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.vision.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2584l extends N0 implements InterfaceC2615v1 {
    private static final C2584l zzg;
    private static volatile E1 zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.vision.l$a */
    public static final class a extends N0.b implements InterfaceC2615v1 {
        private a() {
            super(C2584l.zzg);
        }

        /* synthetic */ a(AbstractC2625z abstractC2625z) {
            this();
        }
    }

    static {
        C2584l c2584l = new C2584l();
        zzg = c2584l;
        N0.n(C2584l.class, c2584l);
    }

    private C2584l() {
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    @Override // com.google.android.gms.internal.vision.N0
    protected final Object j(int i10, Object obj, Object obj2) {
        AbstractC2625z abstractC2625z = null;
        switch (AbstractC2625z.f25224a[i10 - 1]) {
            case 1:
                return new C2584l();
            case 2:
                return new a(abstractC2625z);
            case 3:
                return N0.l(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", P.zzb(), "zze", S.zzb(), "zzf"});
            case 4:
                return zzg;
            case 5:
                E1 e12 = zzh;
                E1 e13 = e12;
                if (e12 == null) {
                    synchronized (C2584l.class) {
                        try {
                            E1 e14 = zzh;
                            E1 e15 = e14;
                            if (e14 == null) {
                                ?? aVar = new N0.a(zzg);
                                zzh = aVar;
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
