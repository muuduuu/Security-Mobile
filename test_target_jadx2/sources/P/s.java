package p;

import android.content.Context;
import android.util.Log;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
abstract class s {
    static String a(Context context, int i10) {
        if (context == null) {
            return BuildConfig.FLAVOR;
        }
        if (i10 == 1) {
            return context.getString(AbstractC3780B.f38077d);
        }
        if (i10 != 7) {
            switch (i10) {
                case 9:
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    return context.getString(AbstractC3780B.f38081h);
                case 11:
                    return context.getString(AbstractC3780B.f38080g);
                case 12:
                    return context.getString(AbstractC3780B.f38078e);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i10);
                    return context.getString(AbstractC3780B.f38075b);
            }
        }
        return context.getString(AbstractC3780B.f38079f);
    }

    static boolean b(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return true;
            case 6:
            default:
                return false;
        }
    }

    static boolean c(int i10) {
        return i10 == 7 || i10 == 9;
    }
}
