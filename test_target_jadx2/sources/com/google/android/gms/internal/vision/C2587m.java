package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2587m extends N0 implements InterfaceC2615v1 {
    private static final C2587m zzd;
    private static volatile E1 zze;
    private X0 zzc = N0.s();

    /* renamed from: com.google.android.gms.internal.vision.m$a */
    public static final class a extends N0.b implements InterfaceC2615v1 {
        private a() {
            super(C2587m.zzd);
        }

        /* synthetic */ a(AbstractC2625z abstractC2625z) {
            this();
        }
    }

    static {
        C2587m c2587m = new C2587m();
        zzd = c2587m;
        N0.n(C2587m.class, c2587m);
    }

    private C2587m() {
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    @Override // com.google.android.gms.internal.vision.N0
    protected final Object j(int i10, Object obj, Object obj2) {
        AbstractC2625z abstractC2625z = null;
        switch (AbstractC2625z.f25224a[i10 - 1]) {
            case 1:
                return new C2587m();
            case 2:
                return new a(abstractC2625z);
            case 3:
                return N0.l(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C2613v.class});
            case 4:
                return zzd;
            case 5:
                E1 e12 = zze;
                E1 e13 = e12;
                if (e12 == null) {
                    synchronized (C2587m.class) {
                        try {
                            E1 e14 = zze;
                            E1 e15 = e14;
                            if (e14 == null) {
                                ?? aVar = new N0.a(zzd);
                                zze = aVar;
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
