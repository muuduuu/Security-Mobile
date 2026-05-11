package com.appsflyer.internal;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFg1pSDK extends AFe1fSDK<Map<String, Object>> {
    private static final List<String> component2 = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private String AFKeystoreWrapper;
    private final AFh1xSDK copy;
    private final AFd1nSDK copydefault;
    private final AFc1oSDK equals;
    private Map<String, Object> hashCode;
    private final AFc1qSDK toString;

    public AFg1pSDK(AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.GCDSDK, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, aFd1zSDK, "GCD-FETCH");
        this.copydefault = aFd1zSDK.getRevenue();
        this.toString = aFd1zSDK.component4();
        this.copy = aFd1zSDK.areAllFieldsValid();
        this.equals = aFd1zSDK.AFAdRevenueData();
        this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
        this.getCurrencyIso4217Code.add(AFe1pSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AFd1hSDK<Map<String, Object>> AFAdRevenueData(String str) {
        String str2;
        String AFAdRevenueData = AFa1ySDK.AFAdRevenueData(this.toString, this.equals.component3());
        if (AFAdRevenueData != null && !AFAdRevenueData.trim().isEmpty()) {
            if (!component2.contains(AFAdRevenueData.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(AFAdRevenueData);
                AFd1hSDK<Map<String, Object>> monetizationNetwork = this.copydefault.getMonetizationNetwork(str2, str);
                StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
                sb2.append(monetizationNetwork.getMonetizationNetwork.getMediationNetwork);
                AFLogger.afInfoLog(sb2.toString());
                return monetizationNetwork;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", AFAdRevenueData));
        }
        str2 = BuildConfig.FLAVOR;
        AFd1hSDK<Map<String, Object>> monetizationNetwork2 = this.copydefault.getMonetizationNetwork(str2, str);
        StringBuilder sb22 = new StringBuilder("[GCD-B01] URL: ");
        sb22.append(monetizationNetwork2.getMonetizationNetwork.getMediationNetwork);
        AFLogger.afInfoLog(sb22.toString());
        return monetizationNetwork2;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        Map<String, Object> map = this.hashCode;
        String str = this.AFKeystoreWrapper;
        if (map != null) {
            AFg1oSDK.getCurrencyIso4217Code(map);
        } else if (str == null || str.isEmpty()) {
            AFg1oSDK.getRevenue("Unknown error");
        } else {
            AFg1oSDK.getRevenue(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() {
        AFe1uSDK aFe1uSDK;
        AFe1uSDK aFe1uSDK2;
        if (((AFe1fSDK) this).component1.getCurrencyIso4217Code()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.AFKeystoreWrapper = "'isStopTracking' enabled";
            throw new AFe1iSDK();
        }
        AFe1uSDK aFe1uSDK3 = AFe1uSDK.FAILURE;
        int i10 = 0;
        while (i10 <= 2) {
            boolean z10 = true;
            boolean z11 = i10 >= 2;
            this.copy.toString = System.currentTimeMillis();
            try {
                try {
                    aFe1uSDK = super.getRevenue();
                    ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
                    if (responseNetwork != null) {
                        int statusCode = responseNetwork.getStatusCode();
                        if (statusCode != 403 && statusCode < 500) {
                            z10 = false;
                        }
                        if (!responseNetwork.isSuccessful() && statusCode != 404) {
                            if (!z11) {
                                if (!z10) {
                                }
                            }
                            this.AFKeystoreWrapper = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFe1uSDK2 = AFe1uSDK.FAILURE;
                            return aFe1uSDK2;
                        }
                        Map<String, Object> map = (Map) responseNetwork.getBody();
                        int statusCode2 = responseNetwork.getStatusCode();
                        Boolean bool = (Boolean) map.get("iscache");
                        if (statusCode2 == 404) {
                            map.remove("error_reason");
                            map.remove("status_code");
                            map.put("af_status", "Organic");
                            map.put("af_message", "organic install");
                        }
                        if (bool != null && !bool.booleanValue()) {
                            this.toString.AFAdRevenueData("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                        }
                        if (map.containsKey("af_siteid")) {
                            if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                StringBuilder sb2 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                sb2.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                AFLogger.afDebugLog(sb2.toString());
                            } else {
                                AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                            }
                        }
                        map.put("is_first_launch", Boolean.FALSE);
                        this.toString.getRevenue("attributionId", new JSONObject(map).toString());
                        if (!this.toString.getMediationNetwork("sixtyDayConversionData", false)) {
                            map.put("is_first_launch", Boolean.TRUE);
                        }
                        this.hashCode = map;
                        aFe1uSDK2 = AFe1uSDK.SUCCESS;
                        return aFe1uSDK2;
                    }
                } catch (AFe1nSDK e10) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.AFKeystoreWrapper = "AppsFlyer dev key is missing";
                    throw e10;
                } catch (Exception e11) {
                    StringBuilder sb3 = new StringBuilder("[GCD] Error: ");
                    sb3.append(e11.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e11, false, false);
                    aFe1uSDK = AFe1uSDK.FAILURE;
                    if (z11) {
                        this.AFKeystoreWrapper = e11.getMessage();
                        throw e11;
                    }
                }
                aFe1uSDK3 = aFe1uSDK;
                i10++;
            } finally {
                this.copy.getMonetizationNetwork(i10);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFe1uSDK3;
    }
}
