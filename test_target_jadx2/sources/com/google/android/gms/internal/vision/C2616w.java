package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2616w extends N0 implements InterfaceC2615v1 {
    private static final C2616w zzh;
    private static volatile E1 zzi;
    private int zzc;
    private C2587m zzd;
    private int zze;
    private C2599q zzf;
    private C2584l zzg;

    /* renamed from: com.google.android.gms.internal.vision.w$a */
    public static final class a extends N0.b implements InterfaceC2615v1 {
        private a() {
            super(C2616w.zzh);
        }

        /* synthetic */ a(AbstractC2625z abstractC2625z) {
            this();
        }
    }

    static {
        C2616w c2616w = new C2616w();
        zzh = c2616w;
        N0.n(C2616w.class, c2616w);
    }

    private C2616w() {
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    @Override // com.google.android.gms.internal.vision.N0
    protected final Object j(int i10, Object obj, Object obj2) {
        AbstractC2625z abstractC2625z = null;
        switch (AbstractC2625z.f25224a[i10 - 1]) {
            case 1:
                return new C2616w();
            case 2:
                return new a(abstractC2625z);
            case 3:
                return N0.l(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                E1 e12 = zzi;
                E1 e13 = e12;
                if (e12 == null) {
                    synchronized (C2616w.class) {
                        try {
                            E1 e14 = zzi;
                            E1 e15 = e14;
                            if (e14 == null) {
                                ?? aVar = new N0.a(zzh);
                                zzi = aVar;
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
