package com.webengage.sdk.android;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.text.TextUtils;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.utils.htmlspanner.WEHtmlParserInterface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PushUtils {
    public static boolean checkForPushOptIn(Context context) {
        try {
            return ((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled();
        } catch (Exception unused) {
            return true;
        }
    }

    public static String getStringFromHtml(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        try {
            return removeEmptyAndSpecialChars(new WEHtmlParserInterface().fromHtml(str).toString());
        } catch (Exception e10) {
            Logger.e("WebEngage", "Error processing HTML content: " + str + "\n" + e10.getMessage());
            return BuildConfig.FLAVOR;
        }
    }

    public static TimeZone getTimeZone(PushNotificationData pushNotificationData) {
        String sb2;
        if (pushNotificationData.getTimerStyleData().getTimeZone().equals("USER")) {
            sb2 = TimeZone.getDefault().getID();
        } else {
            if (!pushNotificationData.getTimerStyleData().getTimeZone().equals("ACCOUNT")) {
                return null;
            }
            long longValue = DataHolder.get().H().longValue();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("GMT");
            sb3.append(longValue >= 0 ? "+" : BuildConfig.FLAVOR);
            sb3.append(longValue / 3600);
            sb3.append(":");
            sb3.append((longValue % 3600) / 60);
            sb2 = sb3.toString();
        }
        return TimeZone.getTimeZone(sb2);
    }

    public static boolean isForegroundServiceTypeAdded(Context context) {
        int foregroundServiceType;
        try {
            Integer num = null;
            for (ServiceInfo serviceInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 4100).services) {
                if (serviceInfo.name.equals("com.webengage.sdk.android.actions.render.TimerService") && Build.VERSION.SDK_INT >= 29) {
                    foregroundServiceType = serviceInfo.getForegroundServiceType();
                    num = Integer.valueOf(foregroundServiceType);
                }
            }
            if (num == null) {
                return false;
            }
            int intValue = num.intValue();
            if (intValue == 1) {
                return v1.a("android.permission.FOREGROUND_SERVICE_DATA_SYNC", context);
            }
            if (intValue == 2) {
                return v1.a("android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK", context);
            }
            switch (intValue) {
                case 4:
                    break;
                case 8:
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    break;
                case 32:
                    break;
                case 64:
                    break;
                case 128:
                    break;
                case PSKKeyManager.MAX_KEY_LENGTH_BYTES /* 256 */:
                    break;
                case 512:
                    break;
                case 1024:
                    break;
                case 2048:
                    break;
                case 1073741824:
                    break;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.d("WebEngage", "Foreground service type name not found");
            return false;
        }
    }

    public static Map<String, String> prepareMap(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static String removeEmptyAndSpecialChars(String str) {
        return TextUtils.isEmpty(str) ? BuildConfig.FLAVOR : str.replaceAll("[\\u200B-\\u200F\\u00A0\\uFEFF\\p{C}]", BuildConfig.FLAVOR).trim();
    }
}
