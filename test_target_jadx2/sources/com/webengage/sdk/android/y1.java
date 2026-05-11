package com.webengage.sdk.android;

import android.content.Context;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.webengage.sdk.android.actions.exception.ImageLoadException;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.Response;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
class y1 implements m1 {
    y1() {
    }

    @Override // com.webengage.sdk.android.m1
    public Response a(Response response, Context context) {
        Response.Builder a10;
        if (response.e() != null) {
            Map<String, List<String>> responseHeaders = response.getResponseHeaders();
            List<String> list = (responseHeaders == null || !responseHeaders.containsKey(Keys.CONTENT_TYPE)) ? null : response.getResponseHeaders().get(Keys.CONTENT_TYPE);
            String str = (list == null || list.isEmpty()) ? BuildConfig.FLAVOR : list.get(0);
            if (str == null || !str.equals(WebEngageConstant.IMAGE_GIF_TYPE)) {
                try {
                    if ("landscape".equalsIgnoreCase(response.e())) {
                        return response.getCurrentState().setInputStream(new ByteArrayInputStream(WebEngageUtils.a(com.webengage.sdk.android.utils.b.a(response, 192.0f, context.getApplicationContext())))).build();
                    }
                    if ("portrait".equalsIgnoreCase(response.e())) {
                        return response.getCurrentState().setInputStream(new ByteArrayInputStream(WebEngageUtils.a(com.webengage.sdk.android.utils.b.a(response, 192.0f, 192.0f, context.getApplicationContext())))).build();
                    }
                    if ("large_icon".equalsIgnoreCase(response.e())) {
                        return response.getCurrentState().setInputStream(new ByteArrayInputStream(WebEngageUtils.a(com.webengage.sdk.android.utils.b.a(response, 48.0f, 48.0f, context.getApplicationContext())))).build();
                    }
                } catch (Exception e10) {
                    a10 = response.getCurrentState().a(new ImageLoadException(e10.getMessage()));
                    return a10.setInputStream(null).build();
                } catch (OutOfMemoryError unused) {
                    a10 = response.getCurrentState().a(new ImageLoadException("OutOfMemoryError"));
                    return a10.setInputStream(null).build();
                }
            }
        }
        return response;
    }

    @Override // com.webengage.sdk.android.m1
    public boolean a(RequestObject requestObject, Context context) {
        return true;
    }
}
