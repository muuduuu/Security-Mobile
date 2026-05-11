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
import com.webengage.sdk.android.PendingIntentFactory;
import com.webengage.sdk.android.PushUtils;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.gifUtils.WEGifHelper;
import com.webengage.sdk.android.utils.http.RequestMethod;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.WENetworkUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class h extends k implements CustomPushRender, CustomPushRerender {

    /* renamed from: s, reason: collision with root package name */
    private WEGifHelper f30346s;

    /* renamed from: t, reason: collision with root package name */
    private WEGifHelper f30347t;

    /* renamed from: n, reason: collision with root package name */
    g f30341n = null;

    /* renamed from: o, reason: collision with root package name */
    private Notification.Builder f30342o = null;

    /* renamed from: p, reason: collision with root package name */
    List<Bitmap> f30343p = null;

    /* renamed from: q, reason: collision with root package name */
    List<Bitmap> f30344q = null;

    /* renamed from: r, reason: collision with root package name */
    Notification f30345r = null;

    /* renamed from: u, reason: collision with root package name */
    Boolean f30348u = Boolean.FALSE;

    private RemoteViews a(Context context, int i10) {
        RemoteViews a10 = this.f30341n.a(context, this.f30383b, this.f30389h.longValue(), i10);
        int i11 = R.id.we_notification_container;
        PushNotificationData pushNotificationData = this.f30383b;
        a10.setOnClickPendingIntent(i11, PendingIntentFactory.constructPushClickPendingIntent(context, pushNotificationData, pushNotificationData.getPrimeCallToAction(), true));
        return a10;
    }

    private void e(RemoteViews remoteViews, Context context) {
        remoteViews.setViewVisibility(R.id.we_notification_half_image, 0);
        remoteViews.setViewVisibility(R.id.collapsed_half_view_flipper, 8);
        a(remoteViews, R.id.we_notification_half_image, context);
    }

    private void f(RemoteViews remoteViews, Context context) {
        remoteViews.setViewVisibility(R.id.we_notification_collapsed_bg_image, 8);
        remoteViews.setViewVisibility(R.id.collapsed_view_flipper, 8);
        if (this.f30343p.isEmpty()) {
            c(remoteViews);
            return;
        }
        this.f30347t.a(remoteViews, this.f30343p, context, R.id.we_notification_expanded_view_flipper);
        remoteViews.setViewVisibility(R.id.we_notification_expanded_view_flipper, 0);
        remoteViews.setViewVisibility(R.id.expanded_image_container, 0);
        remoteViews.setViewVisibility(R.id.we_notification_expanded_bg_image, 8);
    }

    private boolean m() {
        if (this.f30343p.isEmpty()) {
            return false;
        }
        String subStyle = this.f30383b.getOverlayStyle().getSubStyle();
        if (subStyle.equals("OVERLAY1") || subStyle.equals("OVERLAY2")) {
            return !this.f30344q.isEmpty();
        }
        return true;
    }

    public RemoteViews b(Context context, PushNotificationData pushNotificationData) {
        String subStyle = pushNotificationData.getOverlayStyle().getSubStyle() != null ? pushNotificationData.getOverlayStyle().getSubStyle() : BuildConfig.FLAVOR;
        subStyle.hashCode();
        return !subStyle.equals("OVERLAY2") ? !subStyle.equals("OVERLAY3") ? a(a(context, R.layout.overlay_layout), context, pushNotificationData) : a(a(context, R.layout.overlay_layout), pushNotificationData) : b(a(context, R.layout.overlay_half_layout), context, pushNotificationData);
    }

    public RemoteViews c(Context context, PushNotificationData pushNotificationData) {
        RemoteViews a10 = this.f30341n.a(context, pushNotificationData, this.f30389h.longValue(), R.layout.overlay_layout);
        a10.setOnClickPendingIntent(R.id.we_notification_container, PendingIntentFactory.constructPushClickPendingIntent(context, pushNotificationData, pushNotificationData.getPrimeCallToAction(), true));
        this.f30341n.b(a10, 2);
        this.f30341n.a(a10, 2);
        if (this.f30393l) {
            f(a10, context);
        } else {
            d(a10);
        }
        a(a10, context);
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            a10.setInt(R.id.we_notification_container, "setBackgroundColor", pushNotificationData.getBackgroundColor());
        }
        this.f30341n.a(a10, this.f30342o, pushNotificationData, context);
        a10.setViewVisibility(R.id.we_notification_collapsed_bg_image, 8);
        a10.setViewVisibility(R.id.large_icon, 8);
        if (Boolean.FALSE.equals(pushNotificationData.getOverlayStyle().getAppNameVisibility())) {
            a10.setViewVisibility(R.id.top_base_layout, 8);
        }
        return a10;
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void d() {
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void g() {
    }

    @Override // com.webengage.sdk.android.actions.render.k
    protected boolean i() {
        boolean m10 = m();
        String stringFromHtml = PushUtils.getStringFromHtml(this.f30383b.getTitle());
        String stringFromHtml2 = PushUtils.getStringFromHtml(this.f30383b.getContentText());
        if (m10 || !TextUtils.isEmpty(stringFromHtml) || !TextUtils.isEmpty(stringFromHtml2)) {
            return true;
        }
        a(this.f30382a, WebEngageConstant.c.INVALID_PUSH_CONTENT);
        return false;
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void j() {
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRender
    public boolean onRender(Context context, PushNotificationData pushNotificationData) {
        if (!d(context, pushNotificationData)) {
            return false;
        }
        k();
        a(context);
        this.f30345r = this.f30341n.a(this.f30342o);
        b(context);
        this.f30341n.a(this.f30345r, context, pushNotificationData.getVariationId().hashCode());
        return true;
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRerender
    public boolean onRerender(Context context, PushNotificationData pushNotificationData, Bundle bundle) {
        if (!d(context, pushNotificationData)) {
            return false;
        }
        a(context);
        this.f30345r = this.f30341n.a(this.f30342o);
        b(context);
        this.f30341n.a(this.f30345r, context, pushNotificationData.getVariationId().hashCode());
        return true;
    }

    private RemoteViews a(RemoteViews remoteViews, Context context, PushNotificationData pushNotificationData) {
        if (this.f30348u.booleanValue()) {
            c(remoteViews, context);
            a(remoteViews, context);
        } else {
            d(remoteViews, context);
        }
        this.f30341n.b(remoteViews, 1);
        this.f30341n.a(remoteViews, 1);
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            remoteViews.setInt(R.id.we_notification_container, "setBackgroundColor", pushNotificationData.getBackgroundColor());
        }
        if (Boolean.FALSE.equals(pushNotificationData.getOverlayStyle().getAppNameVisibility())) {
            remoteViews.setViewVisibility(R.id.top_base_layout, 8);
        }
        remoteViews.setViewVisibility(R.id.large_icon, 8);
        return remoteViews;
    }

    private RemoteViews b(RemoteViews remoteViews, Context context, PushNotificationData pushNotificationData) {
        if (this.f30348u.booleanValue()) {
            b(remoteViews, context);
        } else {
            e(remoteViews, context);
        }
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            remoteViews.setInt(R.id.we_notification_container, "setBackgroundColor", pushNotificationData.getBackgroundColor());
        }
        if (Boolean.FALSE.equals(pushNotificationData.getOverlayStyle().getAppNameVisibility())) {
            remoteViews.setViewVisibility(R.id.top_base_layout, 8);
        }
        remoteViews.setViewVisibility(R.id.large_icon, 8);
        this.f30341n.b(remoteViews, 1);
        this.f30341n.a(remoteViews, 1);
        remoteViews.setViewVisibility(R.id.push_base_margin_view, 0);
        return remoteViews;
    }

    private void c(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(R.id.we_notification_expanded_bg_image, 8);
        remoteViews.setViewVisibility(R.id.we_notification_expanded_view_flipper, 8);
        remoteViews.setViewVisibility(R.id.expanded_image_container, 8);
    }

    private void d(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(R.id.we_notification_collapsed_bg_image, 8);
        remoteViews.setViewVisibility(R.id.collapsed_view_flipper, 8);
        if (this.f30343p.isEmpty() || this.f30343p.get(0) == null) {
            c(remoteViews);
        } else {
            a(this.f30343p.get(0), remoteViews, R.id.we_notification_expanded_bg_image);
            remoteViews.setViewVisibility(R.id.expanded_image_container, 0);
        }
    }

    private RemoteViews a(RemoteViews remoteViews, PushNotificationData pushNotificationData) {
        remoteViews.setViewVisibility(R.id.we_notification_expanded_bg_image, 4);
        remoteViews.setViewVisibility(R.id.we_notification_half_image, 8);
        remoteViews.setViewVisibility(R.id.we_notification_collapsed_bg_image, 8);
        remoteViews.setViewVisibility(R.id.large_icon, 0);
        this.f30341n.b(remoteViews, 1);
        this.f30341n.a(remoteViews, 1);
        remoteViews.setViewVisibility(R.id.push_base_margin_view, 0);
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            remoteViews.setInt(R.id.we_notification_container, "setBackgroundColor", pushNotificationData.getBackgroundColor());
        }
        if (Boolean.FALSE.equals(pushNotificationData.getOverlayStyle().getAppNameVisibility())) {
            remoteViews.setViewVisibility(R.id.top_base_layout, 8);
        }
        return remoteViews;
    }

    private void b(Context context) {
        this.f30345r = this.f30342o.setCustomBigContentView(c(context, this.f30383b)).build();
    }

    private void c(RemoteViews remoteViews, Context context) {
        int i10;
        if (this.f30344q.isEmpty()) {
            remoteViews.setViewVisibility(R.id.we_notification_collapsed_bg_image, 8);
            i10 = R.id.collapsed_view_flipper;
        } else {
            this.f30346s.a(remoteViews, this.f30344q, context, R.id.collapsed_view_flipper);
            remoteViews.setViewVisibility(R.id.we_notification_expanded_view_flipper, 0);
            i10 = R.id.we_notification_expanded_bg_image;
        }
        remoteViews.setViewVisibility(i10, 8);
    }

    private void d(RemoteViews remoteViews, Context context) {
        remoteViews.setViewVisibility(R.id.we_notification_expanded_bg_image, 4);
        remoteViews.setViewVisibility(R.id.we_notification_expanded_view_flipper, 8);
        remoteViews.setViewVisibility(R.id.we_notification_collapsed_bg_image, 0);
        a(remoteViews, R.id.we_notification_collapsed_bg_image, context);
        remoteViews.setViewVisibility(R.id.push_base_margin_view, 0);
    }

    private List<Bitmap> a(Context context, String str, String str2) {
        ArrayList<Bitmap> a10;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("accept", WENetworkUtil.getAcceptHeadersForPushImages(str));
                InputStream inputStream = null;
                try {
                    Map<String, Object> makeRequest = WENetworkUtil.makeRequest(context, new RequestObject.Builder(str, RequestMethod.GET, context).setCachePolicy(6).b("landscape").setHeaders(hashMap).build(), true, true);
                    InputStream inputStream2 = (InputStream) makeRequest.get("data");
                    try {
                        String str3 = BuildConfig.FLAVOR;
                        if (makeRequest.containsKey(Keys.CONTENT_TYPE)) {
                            str3 = (String) makeRequest.get(Keys.CONTENT_TYPE);
                        }
                        if (WebEngageConstant.IMAGE_GIF_TYPE.equals(str3)) {
                            if (str2.equals("expanded")) {
                                WEGifHelper wEGifHelper = new WEGifHelper();
                                this.f30347t = wEGifHelper;
                                a10 = wEGifHelper.a(inputStream2);
                                this.f30393l = true;
                            } else {
                                WEGifHelper wEGifHelper2 = new WEGifHelper();
                                this.f30346s = wEGifHelper2;
                                a10 = wEGifHelper2.a(inputStream2);
                                this.f30348u = Boolean.TRUE;
                            }
                            if (a10 != null) {
                                arrayList.addAll(a10);
                            }
                        } else {
                            Bitmap a11 = this.f30341n.a(inputStream2);
                            if (a11 != null) {
                                arrayList.add(a11);
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
                        return arrayList;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                Logger.e("WebEngage", "Overlay renderer can not load " + str2 + " image with exception ->" + e13);
            }
        }
        return arrayList;
    }

    private void b(RemoteViews remoteViews, Context context) {
        if (this.f30344q.isEmpty()) {
            remoteViews.setViewVisibility(R.id.we_notification_half_image, 8);
            remoteViews.setViewVisibility(R.id.collapsed_half_view_flipper, 8);
        } else {
            this.f30346s.a(remoteViews, this.f30344q, context, R.id.collapsed_half_view_flipper);
            remoteViews.setViewVisibility(R.id.we_notification_half_image, 8);
            remoteViews.setViewVisibility(R.id.collapsed_half_view_flipper, 0);
        }
    }

    private boolean d(Context context, PushNotificationData pushNotificationData) {
        Notification.Builder builder;
        if (this.f30341n == null) {
            this.f30341n = new g();
        }
        if (this.f30389h == null) {
            this.f30389h = Long.valueOf(System.currentTimeMillis());
        }
        this.f30383b = pushNotificationData;
        this.f30343p = new ArrayList();
        this.f30344q = new ArrayList();
        this.f30382a = context;
        this.f30386e = new ArrayList();
        a(pushNotificationData, context);
        if (!i()) {
            return false;
        }
        String a10 = this.f30341n.a(pushNotificationData, context);
        int i10 = Build.VERSION.SDK_INT;
        this.f30342o = i10 >= 26 ? t.a(context, a10) : new Notification.Builder(context);
        this.f30341n.a(this.f30342o, pushNotificationData, context);
        if (pushNotificationData.getAutoDismissTime() != null) {
            e();
        }
        if (i10 < 26) {
            return true;
        }
        long j10 = this.f30392k;
        if (j10 == -1) {
            return true;
        }
        if (this.f30389h != null) {
            builder = this.f30342o;
            j10 -= System.currentTimeMillis() - this.f30389h.longValue();
        } else {
            builder = this.f30342o;
        }
        builder.setTimeoutAfter(j10);
        return true;
    }

    private void a(Context context) {
        this.f30342o.setCustomContentView(b(context, this.f30383b));
    }

    private void a(RemoteViews remoteViews, int i10, Context context) {
        if (this.f30344q.isEmpty() || this.f30344q.get(0) == null) {
            remoteViews.setViewVisibility(i10, 8);
        } else {
            a(this.f30344q.get(0), remoteViews, i10);
            a(remoteViews, context);
        }
    }

    private void a(RemoteViews remoteViews, Context context) {
        if (Build.VERSION.SDK_INT < 31 || context.getApplicationInfo().targetSdkVersion < 31) {
            return;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.we_push_content_margin_colorbg);
        remoteViews.setViewPadding(R.id.custom_head_container, dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    private void a(PushNotificationData pushNotificationData, Context context) {
        if (pushNotificationData.getOverlayStyle() != null && !TextUtils.isEmpty(pushNotificationData.getOverlayStyle().getExpandedImageUrl())) {
            this.f30343p.addAll(a(context, pushNotificationData.getOverlayStyle().getExpandedImageUrl(), "expanded"));
        }
        if (pushNotificationData.getOverlayStyle() == null || TextUtils.isEmpty(pushNotificationData.getOverlayStyle().getCollapsedImageUrl())) {
            return;
        }
        this.f30344q.addAll(a(context, pushNotificationData.getOverlayStyle().getCollapsedImageUrl(), "collapsed"));
    }
}
