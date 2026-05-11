package S6;

import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;

/* loaded from: classes2.dex */
public abstract class d {
    public static String a(int i10) {
        switch (i10) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
                sb2.append("unknown status code: ");
                sb2.append(i10);
                return sb2.toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return "INTERRUPTED";
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return "TIMEOUT";
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return "CANCELED";
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
