package com.webengage.sdk.android.actions.render;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import com.webengage.sdk.android.utils.gifUtils.WEGifHelper;
import com.webengage.sdk.android.utils.htmlspanner.WEHtmlParserInterface;
import com.webengage.sdk.android.utils.http.RequestMethod;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.WENetworkUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.webengage.sdk.android.actions.render.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2953b extends k implements CustomPushRender, CustomPushRerender {

    /* renamed from: n, reason: collision with root package name */
    private boolean f30314n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f30315o = false;

    /* renamed from: p, reason: collision with root package name */
    private final WEGifHelper f30316p = new WEGifHelper();

    private void c(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(R.id.big_picture_image, 0);
        remoteViews.setViewVisibility(R.id.big_picture_viewflipper, 8);
        a(this.f30386e.get(0), remoteViews, R.id.big_picture_image);
    }

    private RemoteViews m() {
        RemoteViews h10 = h();
        if (this.f30314n) {
            h10.setBoolean(R.id.custom_title, "setSingleLine", false);
            h10.setBoolean(R.id.custom_title_native, "setSingleLine", false);
            h10.setInt(R.id.custom_title, "setMaxLines", 2);
            h10.setInt(R.id.custom_title_native, "setMaxLines", 2);
            h10.setInt(R.id.custom_message, "setMaxLines", 2);
            h10.setInt(R.id.custom_message_native, "setMaxLines", 2);
        }
        h10.setViewVisibility(R.id.custom_base_container, 0);
        PushNotificationData.BigPictureStyle bigPictureStyleData = this.f30383b.getBigPictureStyleData();
        if (bigPictureStyleData != null) {
            h10.setTextViewText(R.id.custom_title, new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getBigContentTitle()));
            h10.setTextViewText(R.id.custom_message, new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getMessage()));
            h10.setTextViewText(R.id.custom_title_native, new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getBigContentTitle()));
            h10.setTextViewText(R.id.custom_message_native, new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getMessage()));
            if (TextUtils.isEmpty(bigPictureStyleData.getSummary())) {
                h10.setViewVisibility(R.id.custom_summary, 8);
                h10.setViewVisibility(R.id.custom_summary_native, 8);
            } else {
                h10.setTextViewText(R.id.custom_summary, new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getSummary()));
                h10.setTextViewText(R.id.custom_summary_native, new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getSummary()));
            }
            h10.setImageViewResource(R.id.small_icon, this.f30383b.getSmallIcon());
        }
        if (!b()) {
            h10.setViewVisibility(R.id.push_base_margin_view, 0);
        }
        return h10;
    }

    private void n() {
        this.f30388g.setViewVisibility(R.id.app_name, 8);
        this.f30388g.setViewVisibility(R.id.custom_summary, 8);
        this.f30388g.setViewVisibility(R.id.custom_notification_time, 8);
        this.f30388g.setViewVisibility(R.id.custom_title, 8);
        this.f30388g.setViewVisibility(R.id.custom_message, 8);
    }

    private void o() {
        this.f30388g.setViewVisibility(R.id.app_name_native, 8);
        this.f30388g.setViewVisibility(R.id.custom_summary_native, 8);
        this.f30388g.setViewVisibility(R.id.custom_notification_time_native, 8);
        this.f30388g.setViewVisibility(R.id.custom_title_native, 8);
        this.f30388g.setViewVisibility(R.id.custom_message_native, 8);
    }

    @Override // com.webengage.sdk.android.actions.render.k
    protected void d() {
        if (!this.f30383b.isBigNotification() || this.f30383b.getStyle() == null || this.f30383b.getBigPictureStyleData() == null) {
            return;
        }
        PushNotificationData.BigPictureStyle bigPictureStyleData = this.f30383b.getBigPictureStyleData();
        if (!this.f30385d && this.f30383b.getBackgroundColor() == Color.parseColor("#00000000") && !this.f30393l) {
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            bigPictureStyle.setBigContentTitle(new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getBigContentTitle()));
            bigPictureStyle.setSummaryText(new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getMessage()));
            try {
                bigPictureStyle.bigPicture(this.f30386e.get(0));
                this.f30387f.setStyle(bigPictureStyle);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        this.f30388g = m();
        RemoteViews remoteViews = new RemoteViews(this.f30382a.getPackageName(), R.layout.big_picture);
        if (!this.f30386e.isEmpty()) {
            if (this.f30393l) {
                d(remoteViews);
            } else {
                c(remoteViews);
            }
        }
        this.f30388g.removeAllViews(R.id.custom_base_container);
        this.f30388g.addView(R.id.custom_base_container, remoteViews);
        if (b()) {
            this.f30388g.setInt(R.id.big_picture_image, "setMaxHeight", WebEngageUtils.a(161.0f, this.f30382a));
        }
        if (this.f30315o) {
            n();
        } else {
            o();
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void g() {
    }

    @Override // com.webengage.sdk.android.actions.render.k
    protected void j() {
        String bigPictureUrl;
        if (this.f30383b.getBigPictureStyleData() == null || (bigPictureUrl = this.f30383b.getBigPictureStyleData().getBigPictureUrl()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("accept", WENetworkUtil.getAcceptHeadersForPushImages(bigPictureUrl));
        InputStream inputStream = null;
        try {
            Map<String, Object> makeRequest = WENetworkUtil.makeRequest(this.f30382a, new RequestObject.Builder(bigPictureUrl, RequestMethod.GET, this.f30382a).setCachePolicy(3).b("landscape").setHeaders(hashMap).build(), true, true);
            InputStream inputStream2 = (InputStream) makeRequest.get("data");
            try {
                String str = (String) makeRequest.get(Keys.CONTENT_TYPE);
                if (WebEngageConstant.IMAGE_GIF_TYPE.equals(str)) {
                    this.f30393l = true;
                    this.f30386e.addAll(this.f30316p.a(inputStream2));
                } else {
                    if (bigPictureUrl.endsWith(".gif")) {
                        Logger.d("WebEngage", "URL ending with .gif but content-type found is " + str + " ,hence rendering normal notification");
                    }
                    Bitmap a10 = a(inputStream2);
                    if (a10 != null) {
                        this.f30386e.add(a10);
                    }
                }
                inputStream2.close();
            } catch (Exception e10) {
                e = e10;
                inputStream = inputStream2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                e.printStackTrace();
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRender
    public boolean onRender(Context context, PushNotificationData pushNotificationData) {
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            this.f30315o = true;
        }
        if (Build.VERSION.SDK_INT >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            this.f30314n = true;
        }
        return super.onRender(context, pushNotificationData);
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRerender
    public boolean onRerender(Context context, PushNotificationData pushNotificationData, Bundle bundle) {
        super.onRerender(context, pushNotificationData, bundle);
        return true;
    }

    private void d(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(R.id.big_picture_viewflipper, 0);
        remoteViews.setViewVisibility(R.id.big_picture_image, 8);
        this.f30316p.a(remoteViews, this.f30386e, this.f30382a, R.id.big_picture_viewflipper);
    }
}
