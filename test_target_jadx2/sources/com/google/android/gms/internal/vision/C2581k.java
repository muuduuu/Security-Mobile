package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2581k extends N0 implements InterfaceC2615v1 {
    private static final U0 zzd = new A();
    private static final C2581k zze;
    private static volatile E1 zzf;
    private V0 zzc = N0.r();

    /* renamed from: com.google.android.gms.internal.vision.k$a */
    public static final class a extends N0.b implements InterfaceC2615v1 {
        private a() {
            super(C2581k.zze);
        }

        /* synthetic */ a(AbstractC2625z abstractC2625z) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.A, com.google.android.gms.internal.vision.U0] */
    static {
        C2581k c2581k = new C2581k();
        zze = c2581k;
        N0.n(C2581k.class, c2581k);
    }

    private C2581k() {
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    @Override // com.google.android.gms.internal.vision.N0
    protected final Object j(int i10, Object obj, Object obj2) {
        AbstractC2625z abstractC2625z = null;
        switch (AbstractC2625z.f25224a[i10 - 1]) {
            case 1:
                return new C2581k();
            case 2:
                return new a(abstractC2625z);
            case 3:
                return N0.l(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", P.zzb()});
            case 4:
                return zze;
            case 5:
                E1 e12 = zzf;
                E1 e13 = e12;
                if (e12 == null) {
                    synchronized (C2581k.class) {
                        try {
                            E1 e14 = zzf;
                            E1 e15 = e14;
                            if (e14 == null) {
                                ?? aVar = new N0.a(zze);
                                zzf = aVar;
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
