package com.webengage.sdk.android.utils.http;

import android.content.Context;
import android.text.TextUtils;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.WebEngageConfig;
import com.webengage.sdk.android.l1;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.x;
import com.webengage.sdk.android.y3;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class WENetworkUtil {
    private static String a(String str) {
        return WebEngage.get().getWebEngageConfig().getProxyURL();
    }

    private static boolean b(String str, String str2) {
        return (TextUtils.isEmpty(str2) || str.startsWith(str2)) ? false : true;
    }

    public static String getAcceptHeadersForPushImages(String str) {
        return str.endsWith(".gif") ? WebEngageConstant.IMAGE_GIF_TYPE : "image/gif, image/webp";
    }

    public static Map<String, Object> makeRequest(Context context, RequestObject requestObject, boolean z10, boolean z11) {
        return makeRequest(context, requestObject, z10, z11, WebEngage.get().getCUID());
    }

    public static String readEntireStream(InputStream inputStream) {
        return com.webengage.sdk.android.utils.b.a(inputStream);
    }

    private static Map<String, Object> a(Context context, RequestObject requestObject, boolean z10) {
        List<String> list;
        HashMap hashMap = new HashMap();
        Response a10 = requestObject.a();
        int responseCode = a10.getResponseCode();
        hashMap.put("status", Integer.valueOf(a10.getResponseCode()));
        Map<String, List<String>> responseHeaders = a10.getResponseHeaders();
        String str = (responseHeaders == null || !responseHeaders.containsKey(Keys.CONTENT_TYPE) || (list = responseHeaders.get(Keys.CONTENT_TYPE)) == null || list.isEmpty()) ? BuildConfig.FLAVOR : list.get(0);
        try {
            if (!a10.isReadable()) {
                a(a10, hashMap, responseCode, context, z10);
                a10.a();
            } else if (responseCode < 200 || responseCode >= 400) {
                a(a10, hashMap, responseCode, context, z10);
            } else {
                hashMap.put("data", a10.getInputStream());
                hashMap.put(Keys.CONTENT_TYPE, str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return hashMap;
    }

    public static Map<String, Object> makeRequest(Context context, RequestObject requestObject, boolean z10, boolean z11, String str) {
        Map<String, String> headers = requestObject.getHeaders();
        if (headers == null) {
            headers = new HashMap<>();
        }
        WebEngageConfig webEngageConfig = WebEngage.get().getWebEngageConfig();
        if (a(requestObject.e(), webEngageConfig.getEnvironment())) {
            headers.put("lc", webEngageConfig.getWebEngageKey());
            if (z10 && !TextUtils.isEmpty(str)) {
                headers.put("cuid", str);
                headers.put("Authorization", "Bearer " + WebEngage.get().getSecurityToken(str));
            }
        }
        if (!webEngageConfig.getShouldTrackIPLocation()) {
            headers.put("x-geo-ignore", "true");
        }
        String a10 = a(webEngageConfig.getWebEngageKey());
        if (b(requestObject.getRequestURL(), a10)) {
            requestObject.a(WebEngageConstant.e.b(requestObject.getRequestURL(), a10));
        }
        return a(context, requestObject, z11);
    }

    private static Map<String, Object> a(InputStream inputStream) {
        return com.webengage.sdk.android.utils.b.a(inputStream, false);
    }

    private static void a(Response response, Map<String, Object> map, int i10, Context context, boolean z10) {
        Logger.e("WebEngage", "Error " + response.getResponseCode() + " while fetching response from url " + response.getRequestURL());
        try {
            if (i10 == 503) {
                map.put(AppConstants.VIDEO_RECORDING_ERROR, new HashMap().put("message", "503 service Temporarily Unavailable"));
                return;
            }
            if (response.getErrorStream() == null) {
                map.put(AppConstants.VIDEO_RECORDING_ERROR, null);
            } else {
                try {
                    map.put(AppConstants.VIDEO_RECORDING_ERROR, a(response.getErrorStream()));
                } catch (Exception unused) {
                    map.put(AppConstants.VIDEO_RECORDING_ERROR, BuildConfig.FLAVOR);
                }
            }
            if (response.getException() != null) {
                map.put("exception", response.getException());
                if (i10 != -1) {
                    Objects.toString(response.getException());
                    response.getRequestURL();
                    response.getResponseCode();
                    response.getInputStream();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Exception: ");
                    sb2.append(response.getException());
                    sb2.append("\nURL: ");
                    sb2.append(response.getRequestURL());
                    sb2.append("\nResponseCode: ");
                    sb2.append(response.getResponseCode());
                    sb2.append("\nIsInputStreamNull: ");
                    sb2.append(response.getInputStream() == null);
                    a(new Exception(sb2.toString()), context);
                }
            }
            if (i10 == 401 && z10) {
                x.a(context).onSecurityException(map);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void a(Object obj, Context context) {
        WebEngage.startService(l1.a(y3.f31163h, obj, context), context);
    }

    private static boolean a(String str, String str2) {
        return str.startsWith(WebEngageConstant.e.URL_BASE.toString()) && !str.startsWith(WebEngageConstant.e.EXCEPTION_END_POINT.toString());
    }
}
