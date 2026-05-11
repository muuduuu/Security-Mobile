package com.google.android.gms.internal.measurement;

import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;

/* renamed from: com.google.android.gms.internal.measurement.o3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2315o3 implements InterfaceC2263i5 {
    CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN(0),
    CLIENT_UPLOAD_ELIGIBLE(1),
    MEASUREMENT_SERVICE_NOT_ENABLED(2),
    ANDROID_TOO_OLD(3),
    NON_PLAY_MODE(4),
    SDK_TOO_OLD(5),
    MISSING_JOB_SCHEDULER(6),
    NOT_ENABLED_IN_MANIFEST(7),
    CLIENT_FLAG_OFF(8),
    SERVICE_FLAG_OFF(20),
    PINNED_TO_SERVICE_UPLOAD(21),
    MISSING_SGTM_SERVER_URL(22);

    private final int zzm;

    EnumC2315o3(int i10) {
        this.zzm = i10;
    }

    public static EnumC2315o3 zzb(int i10) {
        switch (i10) {
            case 0:
                return CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN;
            case 1:
                return CLIENT_UPLOAD_ELIGIBLE;
            case 2:
                return MEASUREMENT_SERVICE_NOT_ENABLED;
            case 3:
                return ANDROID_TOO_OLD;
            case 4:
                return NON_PLAY_MODE;
            case 5:
                return SDK_TOO_OLD;
            case 6:
                return MISSING_JOB_SCHEDULER;
            case 7:
                return NOT_ENABLED_IN_MANIFEST;
            case 8:
                return CLIENT_FLAG_OFF;
            default:
                switch (i10) {
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                        return SERVICE_FLAG_OFF;
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                        return PINNED_TO_SERVICE_UPLOAD;
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                        return MISSING_SGTM_SERVER_URL;
                    default:
                        return null;
                }
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzm);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2263i5
    public final int zza() {
        return this.zzm;
    }
}
