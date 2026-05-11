package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFg1ySDK implements AFg1xSDK {
    private final AppsFlyerProperties getMonetizationNetwork;
    private final Context getRevenue;

    public AFg1ySDK(Context context, AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.getRevenue = context;
        this.getMonetizationNetwork = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1xSDK
    public final AFf1bSDK getMediationNetwork() {
        String string;
        if (!Boolean.parseBoolean(this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getRevenue);
            int i10 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i11 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i12 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i13 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = BuildConfig.FLAVOR;
            if (i10 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", BuildConfig.FLAVOR)) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFf1bSDK(i12, i10, i11, i13, str);
        } catch (Exception e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DMA, "TCF data collection exception", e10, false, false, false, false, 120, null);
            return null;
        }
    }
}
