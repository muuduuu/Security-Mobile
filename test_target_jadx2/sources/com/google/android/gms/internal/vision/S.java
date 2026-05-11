package com.google.android.gms.internal.vision;

import com.appsflyer.attribution.RequestError;

/* loaded from: classes2.dex */
public enum S implements Q0 {
    UNKNOWN_FORMAT(0),
    CONTACT_INFO(1),
    EMAIL(2),
    ISBN(3),
    PHONE(4),
    PRODUCT(5),
    SMS(6),
    TEXT(7),
    URL(8),
    WIFI(9),
    GEO(10),
    CALENDAR_EVENT(11),
    DRIVER_LICENSE(12),
    BOARDING_PASS(13);

    private static final T0 zzo = new T0() { // from class: com.google.android.gms.internal.vision.V
    };
    private final int zzp;

    S(int i10) {
        this.zzp = i10;
    }

    public static S0 zzb() {
        return U.f25087a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + S.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzp + " name=" + name() + '>';
    }

    @Override // com.google.android.gms.internal.vision.Q0
    public final int zza() {
        return this.zzp;
    }

    public static S zza(int i10) {
        switch (i10) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return CONTACT_INFO;
            case 2:
                return EMAIL;
            case 3:
                return ISBN;
            case 4:
                return PHONE;
            case 5:
                return PRODUCT;
            case 6:
                return SMS;
            case 7:
                return TEXT;
            case 8:
                return URL;
            case 9:
                return WIFI;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return GEO;
            case 11:
                return CALENDAR_EVENT;
            case 12:
                return DRIVER_LICENSE;
            case 13:
                return BOARDING_PASS;
            default:
                return null;
        }
    }
}
