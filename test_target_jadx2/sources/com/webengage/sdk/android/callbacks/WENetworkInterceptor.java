package com.webengage.sdk.android.callbacks;

import android.content.Context;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.Response;

/* loaded from: classes2.dex */
public interface WENetworkInterceptor {
    RequestObject onRequest(Context context, RequestObject requestObject);

    Response onResponse(Context context, Response response);
}
