package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC2109a0;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class C1 extends AbstractC2109a0 implements D0 {
    private static volatile K0 zzbg;
    private static final C1 zztx;
    private int zzbb;
    private int zztu;
    private String zztv = BuildConfig.FLAVOR;
    private String zztw = BuildConfig.FLAVOR;

    public static final class a extends AbstractC2109a0.a implements D0 {
        private a() {
            super(C1.zztx);
        }

        /* synthetic */ a(F1 f12) {
            this();
        }
    }

    static {
        C1 c12 = new C1();
        zztx = c12;
        AbstractC2109a0.h(C1.class, c12);
    }

    private C1() {
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.K0, com.google.android.gms.internal.clearcut.a0$b] */
    @Override // com.google.android.gms.internal.clearcut.AbstractC2109a0
    protected final Object e(int i10, Object obj, Object obj2) {
        F1 f12 = null;
        switch (F1.f23825a[i10 - 1]) {
            case 1:
                return new C1();
            case 2:
                return new a(f12);
            case 3:
                return AbstractC2109a0.f(zztx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"zzbb", "zztu", "zztv", "zztw"});
            case 4:
                return zztx;
            case 5:
                K0 k02 = zzbg;
                K0 k03 = k02;
                if (k02 == null) {
                    synchronized (C1.class) {
                        try {
                            K0 k04 = zzbg;
                            K0 k05 = k04;
                            if (k04 == null) {
                                ?? bVar = new AbstractC2109a0.b(zztx);
                                zzbg = bVar;
                                k05 = bVar;
                            }
                        } finally {
                        }
                    }
                }
                return k03;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
