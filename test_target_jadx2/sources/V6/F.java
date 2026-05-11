package V6;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.common.AbstractC2021m;
import com.google.android.gms.common.AbstractC2026s;
import d7.C2998d;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    private static final j0.i f10851a = new j0.i();

    /* renamed from: b, reason: collision with root package name */
    private static Locale f10852b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C2998d.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? resources.getString(R.string.ok) : resources.getString(P6.c.f7526a) : resources.getString(P6.c.f7535j) : resources.getString(P6.c.f7529d);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 == 1) {
            return resources.getString(P6.c.f7530e, a10);
        }
        if (i10 == 2) {
            return com.google.android.gms.common.util.j.d(context) ? resources.getString(P6.c.f7539n) : resources.getString(P6.c.f7536k, a10);
        }
        if (i10 == 3) {
            return resources.getString(P6.c.f7527b, a10);
        }
        if (i10 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", a10);
        }
        if (i10 == 7) {
            return g(context, "common_google_play_services_network_error_text", a10);
        }
        if (i10 == 9) {
            return resources.getString(P6.c.f7534i, a10);
        }
        if (i10 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", a10);
        }
        switch (i10) {
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return g(context, "common_google_play_services_api_unavailable_text", a10);
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return g(context, "common_google_play_services_sign_in_failed_text", a10);
            case 18:
                return resources.getString(P6.c.f7538m, a10);
            default:
                return resources.getString(AbstractC2026s.f23518a, a10);
        }
    }

    public static String d(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i10);
    }

    public static String e(Context context, int i10) {
        String h10 = i10 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i10);
        return h10 == null ? context.getResources().getString(P6.c.f7533h) : h10;
    }

    public static String f(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(P6.c.f7531f);
            case 2:
                return resources.getString(P6.c.f7537l);
            case 3:
                return resources.getString(P6.c.f7528c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i10);
                return null;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h10 = h(context, str);
        if (h10 == null) {
            h10 = resources.getString(AbstractC2026s.f23518a);
        }
        return String.format(resources.getConfiguration().locale, h10, str2);
    }

    private static String h(Context context, String str) {
        j0.i iVar = f10851a;
        synchronized (iVar) {
            try {
                Locale c10 = androidx.core.os.e.a(context.getResources().getConfiguration()).c(0);
                if (!c10.equals(f10852b)) {
                    iVar.clear();
                    f10852b = c10;
                }
                String str2 = (String) iVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources f10 = AbstractC2021m.f(context);
                if (f10 == null) {
                    return null;
                }
                int identifier = f10.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = f10.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    iVar.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
