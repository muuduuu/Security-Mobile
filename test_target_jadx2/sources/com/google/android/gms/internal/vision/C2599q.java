package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2599q extends N0 implements InterfaceC2615v1 {
    private static final C2599q zzj;
    private static volatile E1 zzk;
    private int zzc;
    private float zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;

    /* renamed from: com.google.android.gms.internal.vision.q$a */
    public static final class a extends N0.b implements InterfaceC2615v1 {
        private a() {
            super(C2599q.zzj);
        }

        /* synthetic */ a(AbstractC2625z abstractC2625z) {
            this();
        }
    }

    static {
        C2599q c2599q = new C2599q();
        zzj = c2599q;
        N0.n(C2599q.class, c2599q);
    }

    private C2599q() {
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    @Override // com.google.android.gms.internal.vision.N0
    protected final Object j(int i10, Object obj, Object obj2) {
        AbstractC2625z abstractC2625z = null;
        switch (AbstractC2625z.f25224a[i10 - 1]) {
            case 1:
                return new C2599q();
            case 2:
                return new a(abstractC2625z);
            case 3:
                return N0.l(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                E1 e12 = zzk;
                E1 e13 = e12;
                if (e12 == null) {
                    synchronized (C2599q.class) {
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
