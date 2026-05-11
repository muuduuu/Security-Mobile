package com.google.android.gms.measurement.internal;

import co.hyperverge.hypersnapsdk.utils.AppConstants;

/* renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2641b4 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f25783a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", AppConstants.VIDEO_RECORDING_ERROR, "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f25784b = {"ad_impression"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f25785c = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f25786d = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    public static String a(String str) {
        return AbstractC2722l5.c(str, f25785c, f25783a);
    }

    public static String b(String str) {
        return AbstractC2722l5.c(str, f25783a, f25785c);
    }
}
