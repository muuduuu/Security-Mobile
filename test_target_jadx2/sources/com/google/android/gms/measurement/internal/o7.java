package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class o7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int C10 = W6.b.C(parcel);
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        int i12 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str11 = null;
        String str12 = null;
        int i13 = 100;
        boolean z13 = true;
        boolean z14 = true;
        long j17 = -2147483648L;
        while (parcel.dataPosition() < C10) {
            int t10 = W6.b.t(parcel);
            switch (W6.b.m(t10)) {
                case 2:
                    str5 = W6.b.g(parcel, t10);
                    break;
                case 3:
                    str6 = W6.b.g(parcel, t10);
                    break;
                case 4:
                    str7 = W6.b.g(parcel, t10);
                    break;
                case 5:
                    str8 = W6.b.g(parcel, t10);
                    break;
                case 6:
                    j10 = W6.b.x(parcel, t10);
                    break;
                case 7:
                    j11 = W6.b.x(parcel, t10);
                    break;
                case 8:
                    str9 = W6.b.g(parcel, t10);
                    break;
                case 9:
                    z13 = W6.b.n(parcel, t10);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    z10 = W6.b.n(parcel, t10);
                    break;
                case 11:
                    j17 = W6.b.x(parcel, t10);
                    break;
                case 12:
                    str10 = W6.b.g(parcel, t10);
                    break;
                case 13:
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                case 19:
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                default:
                    W6.b.B(parcel, t10);
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    j12 = W6.b.x(parcel, t10);
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    i10 = W6.b.v(parcel, t10);
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    z14 = W6.b.n(parcel, t10);
                    break;
                case 18:
                    z11 = W6.b.n(parcel, t10);
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    bool = W6.b.o(parcel, t10);
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    j13 = W6.b.x(parcel, t10);
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    arrayList = W6.b.i(parcel, t10);
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    str = W6.b.g(parcel, t10);
                    break;
                case 26:
                    str2 = W6.b.g(parcel, t10);
                    break;
                case 27:
                    str11 = W6.b.g(parcel, t10);
                    break;
                case 28:
                    z12 = W6.b.n(parcel, t10);
                    break;
                case 29:
                    j14 = W6.b.x(parcel, t10);
                    break;
                case 30:
                    i13 = W6.b.v(parcel, t10);
                    break;
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    str3 = W6.b.g(parcel, t10);
                    break;
                case 32:
                    i11 = W6.b.v(parcel, t10);
                    break;
                case 34:
                    j15 = W6.b.x(parcel, t10);
                    break;
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    str12 = W6.b.g(parcel, t10);
                    break;
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    str4 = W6.b.g(parcel, t10);
                    break;
                case HVError.INVALID_FILE_ERROR /* 37 */:
                    j16 = W6.b.x(parcel, t10);
                    break;
                case 38:
                    i12 = W6.b.v(parcel, t10);
                    break;
            }
        }
        W6.b.l(parcel, C10);
        return new n7(str5, str6, str7, str8, j10, j11, str9, z13, z10, j17, str10, j12, i10, z14, z11, bool, j13, arrayList, str, str2, str11, z12, j14, i13, str3, i11, j15, str12, str4, j16, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n7[i10];
    }
}
