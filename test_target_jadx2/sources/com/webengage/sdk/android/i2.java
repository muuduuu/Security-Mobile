package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import com.webengage.sdk.android.utils.http.RequestMethod;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.WENetworkUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.conscrypt.BuildConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i2 extends AbstractC2951a {

    /* renamed from: c, reason: collision with root package name */
    private Context f30649c;

    protected i2(Context context) {
        super(context);
        this.f30649c = context;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object d(Object obj) {
        Map<String, Object> map;
        JSONObject optJSONObject;
        try {
            map = WENetworkUtil.makeRequest(this.f30649c, (RequestObject) obj, true, true);
        } catch (Exception e10) {
            e10.printStackTrace();
            map = null;
        }
        InputStream inputStream = (InputStream) map.get("data");
        try {
            if (((Integer) map.get("status")).intValue() == 200) {
                JSONObject jSONObject = new JSONObject(com.webengage.sdk.android.utils.b.a(inputStream));
                if ("success".equals(jSONObject.optString("status", BuildConfig.FLAVOR)) && (optJSONObject = jSONObject.optJSONObject("data")) != null && optJSONObject != JSONObject.NULL) {
                    a(optJSONObject.optLong("next", 180L) * 60000);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("pushPayloads");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("message_data");
                            if (!jSONObject3.has("amplified")) {
                                jSONObject3.put("amplified", true);
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("source", jSONObject2.getString("source"));
                            hashMap.put("message_action", jSONObject2.getString("message_action"));
                            hashMap.put("message_data", String.valueOf(jSONObject3));
                            o3.a(this.f30649c).a(y3.f31159d, WebEngageUtils.c(hashMap));
                        }
                    }
                }
                inputStream.close();
            }
        } catch (Exception e11) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            Logger.e("WebEngage", "Exception while parsing push amplification data", e11);
            b(e11);
        }
        return null;
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected Object e(Map<String, Object> map) {
        String a10 = WebEngageConstant.e.a(WebEngage.get().getWebEngageConfig().getWebEngageKey(), h(), d());
        return new RequestObject.Builder(a10, RequestMethod.GET, this.f30649c).setCachePolicy(3).setHeaders(new HashMap()).build();
    }

    @Override // com.webengage.sdk.android.AbstractC2951a
    protected void e(Object obj) {
    }
}
