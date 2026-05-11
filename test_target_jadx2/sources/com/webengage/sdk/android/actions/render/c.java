package com.webengage.sdk.android.actions.render;

import android.app.Notification;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.utils.htmlspanner.WEHtmlParserInterface;

/* loaded from: classes2.dex */
public class c extends k implements CustomPushRender, CustomPushRerender {

    /* renamed from: n, reason: collision with root package name */
    private boolean f30317n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f30318o = false;

    private RemoteViews m() {
        RemoteViews h10 = h();
        if (this.f30317n) {
            h10.setBoolean(R.id.custom_title, "setSingleLine", false);
            h10.setBoolean(R.id.custom_title_native, "setSingleLine", false);
            h10.setInt(R.id.custom_title, "setMaxLines", 2);
            h10.setInt(R.id.custom_title_native, "setMaxLines", 2);
        }
        h10.setInt(R.id.custom_message, "setMaxLines", 7);
        h10.setInt(R.id.custom_message_native, "setMaxLines", 7);
        h10.setViewVisibility(R.id.custom_base_container, 0);
        PushNotificationData.BigTextStyle bigTextStyleData = this.f30383b.getBigTextStyleData();
        if (bigTextStyleData != null) {
            h10.setTextViewText(R.id.custom_title, new WEHtmlParserInterface().fromHtml(this.f30383b.getTitle()));
            h10.setTextViewText(R.id.custom_message, new WEHtmlParserInterface().fromHtml(bigTextStyleData.getBigText()));
            h10.setTextViewText(R.id.custom_title_native, new WEHtmlParserInterface().fromHtml(this.f30383b.getTitle()));
            h10.setTextViewText(R.id.custom_message_native, new WEHtmlParserInterface().fromHtml(bigTextStyleData.getBigText()));
            if (TextUtils.isEmpty(this.f30383b.getContentSummary())) {
                h10.setViewVisibility(R.id.custom_summary, 8);
                h10.setViewVisibility(R.id.custom_summary_native, 8);
            } else {
                h10.setTextViewText(R.id.custom_summary, new WEHtmlParserInterface().fromHtml(bigTextStyleData.getSummary()));
                h10.setTextViewText(R.id.custom_summary_native, new WEHtmlParserInterface().fromHtml(bigTextStyleData.getSummary()));
            }
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
    void d() {
        if (this.f30383b.getBigTextStyleData() != null) {
            if (!this.f30385d && this.f30383b.getBackgroundColor() == Color.parseColor("#00000000")) {
                Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
                bigTextStyle.setBigContentTitle(new WEHtmlParserInterface().fromHtml(this.f30383b.getBigTextStyleData().getBigContentTitle()));
                bigTextStyle.bigText(new WEHtmlParserInterface().fromHtml(this.f30383b.getBigTextStyleData().getBigText()));
                if (!TextUtils.isEmpty(this.f30383b.getBigTextStyleData().getSummary())) {
                    bigTextStyle.setSummaryText(new WEHtmlParserInterface().fromHtml(this.f30383b.getBigTextStyleData().getSummary()));
                }
                this.f30387f.setStyle(bigTextStyle);
                return;
            }
            this.f30388g = m();
            RemoteViews remoteViews = new RemoteViews(this.f30382a.getPackageName(), R.layout.big_text);
            this.f30388g.removeAllViews(R.id.custom_base_container);
            this.f30388g.addView(R.id.custom_base_container, remoteViews);
            if (Color.parseColor("#00000000") == this.f30383b.getBackgroundColor()) {
                o();
            } else {
                n();
            }
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void g() {
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void j() {
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRender
    public boolean onRender(Context context, PushNotificationData pushNotificationData) {
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            this.f30318o = true;
        }
        if (Build.VERSION.SDK_INT >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            this.f30317n = true;
        }
        return super.onRender(context, pushNotificationData);
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRerender
    public boolean onRerender(Context context, PushNotificationData pushNotificationData, Bundle bundle) {
        super.onRerender(context, pushNotificationData, bundle);
        return true;
    }
}
