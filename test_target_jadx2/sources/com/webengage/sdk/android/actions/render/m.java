package com.webengage.sdk.android.actions.render;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.RemoteViews;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.appsflyer.attribution.RequestError;
import com.webengage.sdk.android.PendingIntentFactory;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.gifUtils.WEGifHelper;
import com.webengage.sdk.android.utils.htmlspanner.WEHtmlParserInterface;
import com.webengage.sdk.android.utils.http.RequestMethod;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.WENetworkUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class m extends k implements CustomPushRender, CustomPushRerender {

    /* renamed from: n, reason: collision with root package name */
    private Long f30396n;

    /* renamed from: o, reason: collision with root package name */
    private Integer f30397o = 0;

    /* renamed from: p, reason: collision with root package name */
    private boolean f30398p = false;

    /* renamed from: q, reason: collision with root package name */
    private final WEGifHelper f30399q = new WEGifHelper();

    m() {
    }

    private void a(RemoteViews remoteViews, int i10, Bitmap bitmap, Icon icon) {
        a(bitmap, icon, remoteViews, i10);
    }

    private void b(RemoteViews remoteViews, int i10, Bitmap bitmap, Icon icon) {
        a(bitmap, icon, remoteViews, i10);
    }

    private RemoteViews m() {
        RemoteViews h10 = h();
        if (this.f30398p) {
            h10.setBoolean(R.id.custom_title, "setSingleLine", false);
            h10.setBoolean(R.id.custom_title_native, "setSingleLine", false);
            h10.setInt(R.id.custom_title, "setMaxLines", 2);
            h10.setInt(R.id.custom_title_native, "setMaxLines", 2);
            h10.setInt(R.id.custom_message, "setMaxLines", 2);
            h10.setInt(R.id.custom_message_native, "setMaxLines", 2);
        }
        h10.setViewVisibility(R.id.custom_base_container, 0);
        h10.setOnClickPendingIntent(R.id.custom_base_container, null);
        PushNotificationData.RatingV1 ratingV1 = this.f30383b.getRatingV1();
        h10.setOnClickPendingIntent(R.id.custom_head_container, null);
        if (ratingV1 != null) {
            h10.setTextViewText(R.id.custom_title, new WEHtmlParserInterface().fromHtml(ratingV1.getBigContentTitle()));
            h10.setTextViewText(R.id.custom_message, new WEHtmlParserInterface().fromHtml(ratingV1.getMessage()));
            h10.setTextViewText(R.id.custom_title_native, new WEHtmlParserInterface().fromHtml(ratingV1.getBigContentTitle()));
            h10.setTextViewText(R.id.custom_message_native, new WEHtmlParserInterface().fromHtml(ratingV1.getMessage()));
            if (TextUtils.isEmpty(ratingV1.getSummary())) {
                h10.setViewVisibility(R.id.custom_summary_native, 8);
                h10.setViewVisibility(R.id.custom_summary, 8);
            } else {
                h10.setTextViewText(R.id.custom_summary, new WEHtmlParserInterface().fromHtml(ratingV1.getSummary()));
                h10.setTextViewText(R.id.custom_summary_native, new WEHtmlParserInterface().fromHtml(ratingV1.getSummary()));
            }
            h10.setInt(R.id.custom_container, "setBackgroundColor", this.f30383b.getBackgroundColor());
        }
        return h10;
    }

    private void n() {
        this.f30388g.setViewVisibility(R.id.app_name, 8);
        this.f30388g.setViewVisibility(R.id.custom_summary, 8);
        this.f30388g.setViewVisibility(R.id.custom_notification_time, 8);
        this.f30388g.setViewVisibility(R.id.custom_title, 8);
        this.f30388g.setViewVisibility(R.id.custom_message, 8);
        this.f30388g.setViewVisibility(R.id.rating_v1_submit, 8);
    }

    private void o() {
        this.f30388g.setViewVisibility(R.id.app_name_native, 8);
        this.f30388g.setViewVisibility(R.id.custom_summary_native, 8);
        this.f30388g.setViewVisibility(R.id.custom_notification_time_native, 8);
        this.f30388g.setViewVisibility(R.id.custom_title_native, 8);
        this.f30388g.setViewVisibility(R.id.custom_message_native, 8);
        this.f30388g.setViewVisibility(R.id.rating_v1_submit_native, 8);
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void d() {
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        PushNotificationData.RatingV1 ratingV1 = this.f30383b.getRatingV1();
        this.f30388g = m();
        RemoteViews remoteViews = new RemoteViews(this.f30382a.getPackageName(), R.layout.rating_v1);
        remoteViews.setInt(R.id.rating_v1_star_body, "setBackgroundColor", this.f30383b.getBackgroundColor());
        if (this.f30396n == null) {
            this.f30396n = Long.valueOf(System.currentTimeMillis());
        }
        this.f30387f.setWhen(this.f30396n.longValue());
        int applyDimension = (int) TypedValue.applyDimension(1, this.f30398p ? 4 : 16, this.f30382a.getResources().getDisplayMetrics());
        if (!this.f30386e.isEmpty() || this.f30383b.getRatingV1().getContentMessage() != null || this.f30383b.getRatingV1().getContentTitle() != null) {
            remoteViews.setViewVisibility(R.id.rating_v1_frame, 0);
        }
        if (this.f30393l) {
            remoteViews.setViewVisibility(R.id.rating_v1_image, 8);
            this.f30399q.a(remoteViews, this.f30386e, this.f30382a, R.id.rating_viewflipper);
        } else if (this.f30386e.size() == 1) {
            remoteViews.setViewVisibility(R.id.rating_v1_image, 0);
            a(this.f30386e.get(0), remoteViews, R.id.rating_v1_image);
        } else {
            remoteViews.setInt(R.id.rating_v1_frame, "setBackgroundColor", ratingV1.getContentBackgroundColor());
        }
        if (this.f30383b.getRatingV1().getContentTitle() != null) {
            remoteViews.setViewVisibility(R.id.rating_v1_title, 0);
            remoteViews.setTextViewText(R.id.rating_v1_title, new WEHtmlParserInterface().fromHtml(ratingV1.getContentTitle()));
            remoteViews.setTextColor(R.id.rating_v1_title, this.f30383b.getRatingV1().getContentTextColor());
            remoteViews.setViewPadding(R.id.rating_v1_title, applyDimension, 0, applyDimension, 0);
        }
        if (this.f30383b.getRatingV1().getContentMessage() != null) {
            remoteViews.setViewVisibility(R.id.rating_v1_message, 0);
            remoteViews.setTextViewText(R.id.rating_v1_message, new WEHtmlParserInterface().fromHtml(ratingV1.getContentMessage()));
            remoteViews.setTextColor(R.id.rating_v1_message, this.f30383b.getRatingV1().getContentTextColor());
            remoteViews.setViewPadding(R.id.rating_v1_message, applyDimension, 0, applyDimension, 0);
        }
        if (TextUtils.isEmpty(ratingV1.getSummary())) {
            remoteViews.setViewVisibility(R.id.custom_summary, 8);
            remoteViews.setViewVisibility(R.id.custom_summary_native, 8);
        } else {
            remoteViews.setTextViewText(R.id.custom_summary, new WEHtmlParserInterface().fromHtml(ratingV1.getSummary()));
            remoteViews.setTextViewText(R.id.custom_summary_native, new WEHtmlParserInterface().fromHtml(ratingV1.getSummary()));
            if (i12 >= 31) {
                this.f30387f.setSubText(new WEHtmlParserInterface().fromHtml(ratingV1.getSummary()));
            }
        }
        remoteViews.setTextViewText(R.id.rating_v1_submit, new WEHtmlParserInterface().fromHtml(this.f30383b.getRatingV1().getSubmitCTA().getText()));
        remoteViews.setTextViewText(R.id.rating_v1_submit_native, new WEHtmlParserInterface().fromHtml(this.f30383b.getRatingV1().getSubmitCTA().getText()));
        if (this.f30397o.intValue() <= 0) {
            remoteViews.setOnClickPendingIntent(R.id.rating_v1_submit, null);
            remoteViews.setOnClickPendingIntent(R.id.rating_v1_submit_native, null);
        } else {
            PendingIntent constructPushRatingSubmitPendingIntent = PendingIntentFactory.constructPushRatingSubmitPendingIntent(this.f30382a, this.f30383b, this.f30397o.intValue());
            remoteViews.setOnClickPendingIntent(R.id.rating_v1_submit, constructPushRatingSubmitPendingIntent);
            remoteViews.setOnClickPendingIntent(R.id.rating_v1_submit_native, constructPushRatingSubmitPendingIntent);
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f30382a.getResources(), R.drawable.star_selected);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(this.f30382a.getResources(), R.drawable.star_unselected);
        Icon createWithResource = Icon.createWithResource(this.f30382a, R.drawable.star_selected);
        Icon createWithResource2 = Icon.createWithResource(this.f30382a, R.drawable.star_unselected);
        for (int i13 = 1; i13 <= this.f30383b.getRatingV1().getRateScale(); i13++) {
            Bundle bundle = new Bundle();
            bundle.putInt("current", i13);
            bundle.putLong("when", this.f30396n.longValue());
            bundle.putBoolean("we_wk_render", true);
            PendingIntent constructRerenderPendingIntent = PendingIntentFactory.constructRerenderPendingIntent(this.f30382a, this.f30383b, "rating_v1_star" + i13, bundle);
            switch (i13) {
                case 1:
                    remoteViews.setViewVisibility(R.id.rating_v1_star1, 0);
                    remoteViews.setOnClickPendingIntent(R.id.rating_v1_star1, constructRerenderPendingIntent);
                    if (i13 <= this.f30397o.intValue()) {
                        i11 = R.id.rating_v1_star1;
                        a(remoteViews, i11, decodeResource, createWithResource);
                        break;
                    } else {
                        i10 = R.id.rating_v1_star1;
                        b(remoteViews, i10, decodeResource2, createWithResource2);
                        break;
                    }
                case 2:
                    remoteViews.setViewVisibility(R.id.rating_v1_star2, 0);
                    remoteViews.setOnClickPendingIntent(R.id.rating_v1_star2, constructRerenderPendingIntent);
                    if (i13 <= this.f30397o.intValue()) {
                        i11 = R.id.rating_v1_star2;
                        a(remoteViews, i11, decodeResource, createWithResource);
                        break;
                    } else {
                        i10 = R.id.rating_v1_star2;
                        b(remoteViews, i10, decodeResource2, createWithResource2);
                        break;
                    }
                case 3:
                    remoteViews.setViewVisibility(R.id.rating_v1_star3, 0);
                    remoteViews.setOnClickPendingIntent(R.id.rating_v1_star3, constructRerenderPendingIntent);
                    if (i13 <= this.f30397o.intValue()) {
                        i11 = R.id.rating_v1_star3;
                        a(remoteViews, i11, decodeResource, createWithResource);
                        break;
                    } else {
                        i10 = R.id.rating_v1_star3;
                        b(remoteViews, i10, decodeResource2, createWithResource2);
                        break;
                    }
                case 4:
                    remoteViews.setViewVisibility(R.id.rating_v1_star4, 0);
                    remoteViews.setOnClickPendingIntent(R.id.rating_v1_star4, constructRerenderPendingIntent);
                    if (i13 <= this.f30397o.intValue()) {
                        i11 = R.id.rating_v1_star4;
                        a(remoteViews, i11, decodeResource, createWithResource);
                        break;
                    } else {
                        i10 = R.id.rating_v1_star4;
                        b(remoteViews, i10, decodeResource2, createWithResource2);
                        break;
                    }
                case 5:
                    remoteViews.setViewVisibility(R.id.rating_v1_star5, 0);
                    remoteViews.setOnClickPendingIntent(R.id.rating_v1_star5, constructRerenderPendingIntent);
                    if (i13 <= this.f30397o.intValue()) {
                        i11 = R.id.rating_v1_star5;
                        a(remoteViews, i11, decodeResource, createWithResource);
                        break;
                    } else {
                        i10 = R.id.rating_v1_star5;
                        b(remoteViews, i10, decodeResource2, createWithResource2);
                        break;
                    }
                case 6:
                    remoteViews.setViewVisibility(R.id.rating_v1_star6, 0);
                    remoteViews.setOnClickPendingIntent(R.id.rating_v1_star6, constructRerenderPendingIntent);
                    if (i13 <= this.f30397o.intValue()) {
                        i11 = R.id.rating_v1_star6;
                        a(remoteViews, i11, decodeResource, createWithResource);
                        break;
                    } else {
                        i10 = R.id.rating_v1_star6;
                        b(remoteViews, i10, decodeResource2, createWithResource2);
                        break;
                    }
                case 7:
                    remoteViews.setViewVisibility(R.id.rating_v1_star7, 0);
                    remoteViews.setOnClickPendingIntent(R.id.rating_v1_star7, constructRerenderPendingIntent);
                    if (i13 <= this.f30397o.intValue()) {
                        i11 = R.id.rating_v1_star7;
                        a(remoteViews, i11, decodeResource, createWithResource);
                        break;
                    } else {
                        i10 = R.id.rating_v1_star7;
                        b(remoteViews, i10, decodeResource2, createWithResource2);
                        break;
                    }
                case 8:
                    remoteViews.setViewVisibility(R.id.rating_v1_star8, 0);
                    remoteViews.setOnClickPendingIntent(R.id.rating_v1_star8, constructRerenderPendingIntent);
                    if (i13 <= this.f30397o.intValue()) {
                        i11 = R.id.rating_v1_star8;
                        a(remoteViews, i11, decodeResource, createWithResource);
                        break;
                    } else {
                        i10 = R.id.rating_v1_star8;
                        b(remoteViews, i10, decodeResource2, createWithResource2);
                        break;
                    }
                case 9:
                    remoteViews.setViewVisibility(R.id.rating_v1_star9, 0);
                    remoteViews.setOnClickPendingIntent(R.id.rating_v1_star9, constructRerenderPendingIntent);
                    if (i13 <= this.f30397o.intValue()) {
                        i11 = R.id.rating_v1_star9;
                        a(remoteViews, i11, decodeResource, createWithResource);
                        break;
                    } else {
                        i10 = R.id.rating_v1_star9;
                        b(remoteViews, i10, decodeResource2, createWithResource2);
                        break;
                    }
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    remoteViews.setViewVisibility(R.id.rating_v1_star10, 0);
                    remoteViews.setOnClickPendingIntent(R.id.rating_v1_star10, constructRerenderPendingIntent);
                    if (i13 <= this.f30397o.intValue()) {
                        i11 = R.id.rating_v1_star10;
                        a(remoteViews, i11, decodeResource, createWithResource);
                        break;
                    } else {
                        i10 = R.id.rating_v1_star10;
                        b(remoteViews, i10, decodeResource2, createWithResource2);
                        break;
                    }
            }
        }
        this.f30388g.removeAllViews(R.id.custom_base_container);
        this.f30388g.addView(R.id.custom_base_container, remoteViews);
        this.f30388g.setInt(R.id.custom_base_container, "setBackgroundColor", this.f30383b.getBackgroundColor());
        if (Color.parseColor("#00000000") == this.f30383b.getBackgroundColor()) {
            o();
        } else {
            n();
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void g() {
        HashMap hashMap = new HashMap();
        if (this.f30383b.getRatingV1() != null) {
            if (this.f30383b.getRatingV1().getImageUrl() != null) {
                hashMap.put("accept", WENetworkUtil.getAcceptHeadersForPushImages(this.f30383b.getRatingV1().getImageUrl()));
                InputStream a10 = a(new RequestObject.Builder(this.f30383b.getRatingV1().getImageUrl(), RequestMethod.GET, this.f30382a).setCachePolicy(6).b("landscape").setHeaders(hashMap).a(1).build());
                if (a10 != null) {
                    try {
                        a10.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            if (this.f30383b.getRatingV1().getIconUrl() != null) {
                hashMap.put("accept", WENetworkUtil.getAcceptHeadersForPushImages(this.f30383b.getRatingV1().getIconUrl()));
                InputStream a11 = a(new RequestObject.Builder(this.f30383b.getRatingV1().getIconUrl(), RequestMethod.GET, this.f30382a).setCachePolicy(6).b("portrait").setHeaders(hashMap).a(1).build());
                if (a11 != null) {
                    try {
                        a11.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // com.webengage.sdk.android.actions.render.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void j() {
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3 = null;
        if (this.f30383b.getRatingV1().getImageUrl() != null) {
            try {
                Map<String, Object> makeRequest = WENetworkUtil.makeRequest(this.f30382a, new RequestObject.Builder(this.f30383b.getRatingV1().getImageUrl(), RequestMethod.GET, this.f30382a).setCachePolicy(4).build(), true, true);
                inputStream2 = (InputStream) makeRequest.get("data");
                try {
                    if (WebEngageConstant.IMAGE_GIF_TYPE.equals((String) makeRequest.get(Keys.CONTENT_TYPE))) {
                        this.f30393l = true;
                        ArrayList<Bitmap> a10 = this.f30399q.a(inputStream2);
                        if (a10 != null) {
                            this.f30386e.addAll(a10);
                        }
                    } else {
                        Bitmap a11 = a(inputStream2);
                        if (a11 != null) {
                            this.f30386e.add(a11);
                        }
                    }
                    inputStream2.close();
                } catch (Exception unused) {
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (this.f30383b.getRatingV1().getIconUrl() == null) {
                    }
                }
            } catch (Exception unused2) {
                inputStream2 = null;
            }
        }
        if (this.f30383b.getRatingV1().getIconUrl() == null) {
            try {
                inputStream = (InputStream) WENetworkUtil.makeRequest(this.f30382a, new RequestObject.Builder(this.f30383b.getRatingV1().getIconUrl(), RequestMethod.GET, this.f30382a).setCachePolicy(4).build(), true, true).get("data");
            } catch (Exception e11) {
                e = e11;
            }
            try {
                Bitmap a12 = a(inputStream);
                if (a12 != null) {
                    this.f30386e.add(a12);
                }
                inputStream.close();
            } catch (Exception e12) {
                e = e12;
                inputStream3 = inputStream;
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                e.printStackTrace();
            }
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRender
    public boolean onRender(Context context, PushNotificationData pushNotificationData) {
        if (Build.VERSION.SDK_INT >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            this.f30398p = true;
        }
        return super.onRender(context, pushNotificationData);
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRerender
    public boolean onRerender(Context context, PushNotificationData pushNotificationData, Bundle bundle) {
        if (bundle != null) {
            this.f30396n = Long.valueOf(bundle.getLong("when"));
            this.f30397o = Integer.valueOf(bundle.getInt("current"));
        }
        if (Build.VERSION.SDK_INT >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            this.f30398p = true;
        }
        return super.onRerender(context, pushNotificationData, bundle);
    }
}
