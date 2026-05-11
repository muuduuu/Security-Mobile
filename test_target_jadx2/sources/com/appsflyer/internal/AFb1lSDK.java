package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.oaid.OaidClient;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFb1lSDK {
    public static Boolean AFAdRevenueData;
    public static String getMonetizationNetwork;

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AFb1jSDK getMediationNetwork(Context context) {
        Boolean bool;
        OaidClient.Info fetch;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String str = getMonetizationNetwork;
        boolean z10 = str != null;
        if (!z10) {
            Boolean bool2 = AFAdRevenueData;
            if ((bool2 != null && bool2.booleanValue()) || (AFAdRevenueData == null && appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_OAID, true))) {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(appsFlyerProperties.isEnableLog());
                    fetch = oaidClient.fetch();
                } catch (Throwable unused) {
                    str = null;
                }
                if (fetch != null) {
                    String id2 = fetch.getId();
                    try {
                        bool = fetch.getLat();
                        str = id2;
                    } catch (Throwable unused2) {
                        str = id2;
                        AFLogger.afDebugLog("No OAID library");
                        bool = null;
                        if (str != null) {
                        }
                    }
                    if (str != null) {
                        return null;
                    }
                    AFb1jSDK aFb1jSDK = new AFb1jSDK(str, bool);
                    aFb1jSDK.getMonetizationNetwork = Boolean.valueOf(z10);
                    return aFb1jSDK;
                }
            }
            bool = null;
            str = null;
            if (str != null) {
            }
        }
        bool = null;
        if (str != null) {
        }
    }

    public static AFb1jSDK l_(ContentResolver contentResolver) {
        String str;
        if (!getMediationNetwork() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i10 == 0) {
            return new AFb1jSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i10 == 2) {
            return null;
        }
        try {
            str = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            str = BuildConfig.FLAVOR;
        }
        return new AFb1jSDK(str, Boolean.TRUE);
    }

    private static boolean getMediationNetwork() {
        Boolean bool = AFAdRevenueData;
        return bool == null || bool.booleanValue();
    }
}
