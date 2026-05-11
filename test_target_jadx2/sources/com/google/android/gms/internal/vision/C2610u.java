package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2610u extends N0 implements InterfaceC2615v1 {
    private static final C2610u zzf;
    private static volatile E1 zzg;
    private int zzc;
    private long zzd;
    private long zze;

    /* renamed from: com.google.android.gms.internal.vision.u$a */
    public static final class a extends N0.b implements InterfaceC2615v1 {
        private a() {
            super(C2610u.zzf);
        }

        /* synthetic */ a(AbstractC2625z abstractC2625z) {
            this();
        }
    }

    static {
        C2610u c2610u = new C2610u();
        zzf = c2610u;
        N0.n(C2610u.class, c2610u);
    }

    private C2610u() {
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    @Override // com.google.android.gms.internal.vision.N0
    protected final Object j(int i10, Object obj, Object obj2) {
        AbstractC2625z abstractC2625z = null;
        switch (AbstractC2625z.f25224a[i10 - 1]) {
            case 1:
                return new C2610u();
            case 2:
                return new a(abstractC2625z);
            case 3:
                return N0.l(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                E1 e12 = zzg;
                E1 e13 = e12;
                if (e12 == null) {
                    synchronized (C2610u.class) {
                        try {
                            E1 e14 = zzg;
                            E1 e15 = e14;
                            if (e14 == null) {
                                ?? aVar = new N0.a(zzf);
                                zzg = aVar;
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
