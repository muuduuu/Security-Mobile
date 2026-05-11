package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class AFb1qSDK {
    public static Uri k_(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1gSDK aFj1gSDK = new AFj1gSDK(intent);
        Uri uri = (Uri) aFj1gSDK.H_("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String AFAdRevenueData = aFj1gSDK.AFAdRevenueData("android.intent.extra.REFERRER_NAME");
        if (AFAdRevenueData != null) {
            return Uri.parse(AFAdRevenueData);
        }
        return null;
    }
}
