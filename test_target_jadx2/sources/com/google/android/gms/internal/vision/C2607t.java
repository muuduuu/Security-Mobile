package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.vision.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2607t extends N0 implements InterfaceC2615v1 {
    private static final C2607t zzj;
    private static volatile E1 zzk;
    private int zzc;
    private long zze;
    private C2578j zzf;
    private C2596p zzh;
    private C2581k zzi;
    private String zzd = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.vision.t$a */
    public static final class a extends N0.b implements InterfaceC2615v1 {
        private a() {
            super(C2607t.zzj);
        }

        /* synthetic */ a(AbstractC2625z abstractC2625z) {
            this();
        }
    }

    static {
        C2607t c2607t = new C2607t();
        zzj = c2607t;
        N0.n(C2607t.class, c2607t);
    }

    private C2607t() {
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    @Override // com.google.android.gms.internal.vision.N0
    protected final Object j(int i10, Object obj, Object obj2) {
        AbstractC2625z abstractC2625z = null;
        switch (AbstractC2625z.f25224a[i10 - 1]) {
            case 1:
                return new C2607t();
            case 2:
                return new a(abstractC2625z);
            case 3:
                return N0.l(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                E1 e12 = zzk;
                E1 e13 = e12;
                if (e12 == null) {
                    synchronized (C2607t.class) {
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
