package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFi1vSDK {
    public final String AFAdRevenueData;
    private final boolean getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final AFi1zSDK getMonetizationNetwork;
    public final AFh1dSDK getRevenue;

    public AFi1vSDK(String str) {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.AFAdRevenueData = string;
            this.getCurrencyIso4217Code = jSONObject.optBoolean("test_mode");
            this.getMediationNetwork = str;
            this.getRevenue = string.startsWith("default") ? AFh1dSDK.DEFAULT : AFh1dSDK.CUSTOM;
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            this.getMonetizationNetwork = optJSONObject != null ? new AFi1zSDK(optJSONObject) : null;
        } catch (JSONException e10) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e10);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFi1vSDK.class != obj.getClass()) {
            return false;
        }
        AFi1vSDK aFi1vSDK = (AFi1vSDK) obj;
        if (this.getCurrencyIso4217Code == aFi1vSDK.getCurrencyIso4217Code && this.AFAdRevenueData.equals(aFi1vSDK.AFAdRevenueData)) {
            return this.getMediationNetwork.equals(aFi1vSDK.getMediationNetwork);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.getCurrencyIso4217Code ? 1 : 0) * 31) + this.AFAdRevenueData.hashCode()) * 31) + this.getMediationNetwork.hashCode();
        AFi1zSDK aFi1zSDK = this.getMonetizationNetwork;
        return aFi1zSDK != null ? (hashCode * 31) + aFi1zSDK.hashCode() : hashCode;
    }
}
