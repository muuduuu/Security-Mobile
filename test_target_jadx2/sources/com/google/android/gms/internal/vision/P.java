package com.google.android.gms.internal.vision;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;

/* loaded from: classes2.dex */
public enum P implements Q0 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);

    private static final T0 zzq = new T0() { // from class: com.google.android.gms.internal.vision.O
    };
    private final int zzr;

    P(int i10) {
        this.zzr = i10;
    }

    public static S0 zzb() {
        return T.f25083a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + P.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzr + " name=" + name() + '>';
    }

    @Override // com.google.android.gms.internal.vision.Q0
    public final int zza() {
        return this.zzr;
    }

    public static P zza(int i10) {
        switch (i10) {
            case 0:
                return UNRECOGNIZED;
            case 1:
                return CODE_128;
            case 2:
                return CODE_39;
            case 3:
                return CODE_93;
            case 4:
                return CODABAR;
            case 5:
                return DATA_MATRIX;
            case 6:
                return EAN_13;
            case 7:
                return EAN_8;
            case 8:
                return ITF;
            case 9:
                return QR_CODE;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return UPC_A;
            case 11:
                return UPC_E;
            case 12:
                return PDF417;
            case 13:
                return AZTEC;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return DATABAR;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            default:
                return null;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return TEZ_CODE;
        }
    }
}
