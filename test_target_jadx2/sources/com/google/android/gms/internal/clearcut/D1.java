package com.google.android.gms.internal.clearcut;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.clearcut.AbstractC2109a0;

/* loaded from: classes2.dex */
public final class D1 extends AbstractC2109a0 implements D0 {
    private static final D1 zzbfc;
    private static volatile K0 zzbg;
    private int zzbb;
    private int zzbfa = -1;
    private int zzbfb;

    public static final class a extends AbstractC2109a0.a implements D0 {
        private a() {
            super(D1.zzbfc);
        }

        /* synthetic */ a(F1 f12) {
            this();
        }
    }

    public enum b implements InterfaceC2118d0 {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);

        private static final InterfaceC2121e0 zzbq = new G1();
        private final int value;

        b(int i10) {
            this.value = i10;
        }

        public static b zzaz(int i10) {
            if (i10 == 100) {
                return COMBINED;
            }
            switch (i10) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case 9:
                    return HSUPA;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    return HSPA;
                case 11:
                    return IDEN;
                case 12:
                    return EVDO_B;
                case 13:
                    return LTE;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    return EHRPD;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    return HSPAP;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    return GSM;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        public static InterfaceC2121e0 zzd() {
            return zzbq;
        }

        public final int zzc() {
            return this.value;
        }
    }

    public enum c implements InterfaceC2118d0 {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);

        private static final InterfaceC2121e0 zzbq = new H1();
        private final int value;

        c(int i10) {
            this.value = i10;
        }

        public static c zzba(int i10) {
            switch (i10) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    return MOBILE_IA;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    return MOBILE_EMERGENCY;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    return PROXY;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    return VPN;
                default:
                    return null;
            }
        }

        public static InterfaceC2121e0 zzd() {
            return zzbq;
        }

        public final int zzc() {
            return this.value;
        }
    }

    static {
        D1 d12 = new D1();
        zzbfc = d12;
        AbstractC2109a0.h(D1.class, d12);
    }

    private D1() {
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [com.google.android.gms.internal.clearcut.K0, com.google.android.gms.internal.clearcut.a0$b] */
    @Override // com.google.android.gms.internal.clearcut.AbstractC2109a0
    protected final Object e(int i10, Object obj, Object obj2) {
        F1 f12 = null;
        switch (F1.f23825a[i10 - 1]) {
            case 1:
                return new D1();
            case 2:
                return new a(f12);
            case 3:
                return AbstractC2109a0.f(zzbfc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzbb", "zzbfa", c.zzd(), "zzbfb", b.zzd()});
            case 4:
                return zzbfc;
            case 5:
                K0 k02 = zzbg;
                K0 k03 = k02;
                if (k02 == null) {
                    synchronized (D1.class) {
                        try {
                            K0 k04 = zzbg;
                            K0 k05 = k04;
                            if (k04 == null) {
                                ?? bVar = new AbstractC2109a0.b(zzbfc);
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
