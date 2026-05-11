package com.webengage.sdk.android;

import android.content.Context;
import android.util.Log;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import com.webengage.sdk.android.utils.http.RequestMethod;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.WENetworkUtil;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class q0 extends AbstractC2951a {

    /* renamed from: c, reason: collision with root package name */
    private Context f30771c;

    q0(Context context) {
        super(context);
        this.f30771c = null;
        this.f30771c = context.getApplicationContext();
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object d(Object obj) {
        try {
            Exception exc = (Exception) ((Map) obj).get("action_data");
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_id", Integer.toString(2));
            hashMap.put("luid", h());
            if (!d().isEmpty()) {
                hashMap.put("cuid", d());
            }
            hashMap.put("source", "webengage");
            hashMap.put(Keys.EVENT, URLEncoder.encode(exc.getClass().getSimpleName(), "UTF-8"));
            hashMap.put("type", "exception");
            hashMap.put("category", WebEngage.get().getWebEngageConfig().getWebEngageKey());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", WebEngage.get().getWebEngageConfig().getWebEngageVersion());
            jSONObject.put("text", Log.getStackTraceString(exc));
            hashMap.put("data", URLEncoder.encode(jSONObject.toString(), "UTF-8"));
            WENetworkUtil.makeRequest(this.f30771c, new RequestObject.Builder(WebEngageConstant.e.EXCEPTION_END_POINT.toString() + "/?" + WebEngageUtils.b(hashMap), RequestMethod.GET, this.f30771c).setHeaders(new HashMap()).build(), false, true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception Logged: ");
            sb2.append(Log.getStackTraceString(exc));
            Logger.e("WebEngage", sb2.toString());
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object e(Map<String, Object> map) {
        return map;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected void e(Object obj) {
    }
}
