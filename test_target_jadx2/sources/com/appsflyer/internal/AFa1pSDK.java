package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1pSDK implements AFe1zSDK<DdlResponse> {
    @Override // com.appsflyer.internal.AFe1zSDK
    public final /* synthetic */ DdlResponse getRevenue(String str) {
        JSONObject optJSONObject;
        DeepLink deepLink = null;
        if (str == null || str.length() == 0) {
            return new DdlResponse(false, null, 3, null);
        }
        JSONObject jSONObject = new JSONObject(str);
        boolean optBoolean = jSONObject.optBoolean("found", false);
        boolean optBoolean2 = jSONObject.optBoolean("is_second_ping", true);
        if (optBoolean && (optJSONObject = jSONObject.optJSONObject("click_event")) != null) {
            deepLink = DeepLink.getMediationNetwork(optJSONObject);
            deepLink.AFAdRevenueData.put("is_deferred", true);
        }
        return new DdlResponse(optBoolean2, deepLink);
    }
}
