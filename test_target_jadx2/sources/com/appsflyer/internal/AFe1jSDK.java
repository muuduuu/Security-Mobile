package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AFe1jSDK extends AFe1fSDK<String> {
    private final AFe1pSDK component2;
    private final AFc1qSDK copy;
    private final Map<String, Object> copydefault;
    private final AFc1oSDK equals;
    private final AFg1nSDK hashCode;
    private final AFf1fSDK toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1jSDK(AFe1pSDK aFe1pSDK, AFe1pSDK[] aFe1pSDKArr, AFd1zSDK aFd1zSDK, String str, Map<String, ? extends Object> map) {
        super(aFe1pSDK, aFe1pSDKArr, aFd1zSDK, null);
        Intrinsics.checkNotNullParameter(aFe1pSDK, "");
        Intrinsics.checkNotNullParameter(aFe1pSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component2 = aFe1pSDK;
        this.copydefault = map;
        AFc1oSDK AFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        this.equals = AFAdRevenueData;
        AFc1qSDK component4 = aFd1zSDK.component4();
        Intrinsics.checkNotNullExpressionValue(component4, "");
        this.copy = component4;
        AFg1nSDK component3 = aFd1zSDK.component3();
        Intrinsics.checkNotNullExpressionValue(component3, "");
        this.hashCode = component3;
        AFf1fSDK afDebugLog = aFd1zSDK.afDebugLog();
        Intrinsics.checkNotNullExpressionValue(afDebugLog, "");
        this.toString = afDebugLog;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AFd1hSDK<String> AFAdRevenueData(String str) {
        AFd1bSDK aFd1bSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> w10 = kotlin.collections.G.w(this.copydefault);
        String currencyIso4217Code = getCurrencyIso4217Code(w10);
        String monetizationNetwork = getMonetizationNetwork(w10);
        Map<String, Object> w11 = kotlin.collections.G.w(w10);
        getMonetizationNetwork(w11, currencyIso4217Code);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String areAllFieldsValid = this.equals.areAllFieldsValid();
        if (areAllFieldsValid != null && !StringsKt.Z(areAllFieldsValid)) {
            linkedHashMap.put("advertising_id", areAllFieldsValid);
        }
        AFb1jSDK mediationNetwork = AFb1lSDK.getMediationNetwork(this.equals.getCurrencyIso4217Code.getMonetizationNetwork);
        String str2 = null;
        String str3 = mediationNetwork != null ? mediationNetwork.getRevenue : null;
        if (str3 != null && !StringsKt.Z(str3)) {
            linkedHashMap.put("oaid", str3);
        }
        AFb1jSDK l_ = AFb1lSDK.l_(this.equals.getCurrencyIso4217Code.getMonetizationNetwork.getContentResolver());
        String str4 = l_ != null ? l_.getRevenue : null;
        if (str4 != null && !StringsKt.Z(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            w11.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        } else {
            String monetizationNetwork2 = ((AFe1fSDK) this).component1.getMonetizationNetwork(this.copy);
            if (monetizationNetwork2 != null && !StringsKt.Z(monetizationNetwork2)) {
                linkedHashMap.put("imei", monetizationNetwork2);
            }
        }
        String currencyIso4217Code2 = AFb1kSDK.getCurrencyIso4217Code(this.equals.getMediationNetwork);
        if (currencyIso4217Code2 == null) {
            currencyIso4217Code2 = BuildConfig.FLAVOR;
        }
        linkedHashMap.put("appsflyer_id", currencyIso4217Code2);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.17.5");
        if (monetizationNetwork != null && !StringsKt.Z(monetizationNetwork)) {
            linkedHashMap.put("sdk_connector_version", monetizationNetwork);
        }
        this.hashCode.getMediationNetwork(linkedHashMap, this.component2);
        w11.put("device_data", linkedHashMap);
        this.toString.getCurrencyIso4217Code(w11, this.component2);
        AFd1hSDK<String> revenue = getRevenue(w11, str, currencyIso4217Code);
        if (revenue != null && (aFd1bSDK = revenue.getMonetizationNetwork) != null) {
            str2 = aFd1bSDK.getMediationNetwork;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject(w11);
            AFg1aSDK.getRevenue(toString() + ": preparing data: ", jSONObject);
            AFd1oSDK aFd1oSDK = this.component3;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            aFd1oSDK.getRevenue(str2, jSONObject2);
        }
        return revenue;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final AppsFlyerRequestListener component2() {
        return null;
    }

    protected boolean component3() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    protected final boolean copydefault() {
        return true;
    }

    protected String getCurrencyIso4217Code(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    protected String getMonetizationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public abstract AFd1hSDK<String> getRevenue(Map<String, Object> map, String str, String str2);

    protected void getMonetizationNetwork(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.equals.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName());
        String revenue = AFc1oSDK.getRevenue();
        if (revenue != null) {
            map.put("cuid", revenue);
        }
        map.put("app_version_name", this.equals.n_().versionName);
        if (component3()) {
            map.put("event_timestamp", Long.valueOf(this.hashCode.getCurrencyIso4217Code()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }
}
