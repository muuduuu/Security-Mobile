package com.webengage.sdk.android;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.appsflyer.AdRevenueScheme;

/* loaded from: classes2.dex */
public class c4 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f30491a = {"time_spent", AppConstants.LATITUDE, AppConstants.LONGITUDE, "city", AdRevenueScheme.COUNTRY, "region", "postal_code", "locality", "opt_in_push", "opt_in_inapp", "last_logged_in", "first_logged_in", "last_seen", "first_session_start_time", "session_count", "campaign_id", "campaign_source", "campaign_medium", "campaign_term", "campaign_content", "campaign_gclid", "referrer"};

    public static boolean a(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f30491a;
            if (i10 >= strArr.length) {
                return false;
            }
            if (strArr[i10].equals(str)) {
                return true;
            }
            i10++;
        }
    }
}
