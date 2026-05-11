package com.webengage.sdk.android.actions.render;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.PendingIntentFactory;
import com.webengage.sdk.android.PushUtils;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.render.CallToAction;
import com.webengage.sdk.android.j2;
import com.webengage.sdk.android.l1;
import com.webengage.sdk.android.n0;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.htmlspanner.WEHtmlParserInterface;
import com.webengage.sdk.android.utils.http.RequestMethod;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.WENetworkUtil;
import com.webengage.sdk.android.v1;
import com.webengage.sdk.android.y3;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: c, reason: collision with root package name */
    protected int f30384c;

    /* renamed from: h, reason: collision with root package name */
    protected Long f30389h;

    /* renamed from: a, reason: collision with root package name */
    protected Context f30382a = null;

    /* renamed from: b, reason: collision with root package name */
    protected PushNotificationData f30383b = null;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f30385d = false;

    /* renamed from: e, reason: collision with root package name */
    protected List<Bitmap> f30386e = null;

    /* renamed from: f, reason: collision with root package name */
    protected Notification.Builder f30387f = null;

    /* renamed from: g, reason: collision with root package name */
    protected RemoteViews f30388g = null;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30390i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30391j = false;

    /* renamed from: k, reason: collision with root package name */
    protected long f30392k = -1;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f30393l = false;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f30394m = true;

    private RemoteViews b(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(R.id.app_name_native, 8);
        remoteViews.setViewVisibility(R.id.custom_summary_native, 8);
        remoteViews.setViewVisibility(R.id.custom_notification_time_native, 8);
        remoteViews.setViewVisibility(R.id.custom_title_native, 8);
        remoteViews.setViewVisibility(R.id.custom_message_native, 8);
        return remoteViews;
    }

    private RemoteViews f() {
        RemoteViews h10 = h();
        h10.setViewVisibility(R.id.push_base_margin_view, 0);
        h10.setTextViewText(R.id.custom_title, new WEHtmlParserInterface().fromHtml(this.f30383b.getTitle()));
        h10.setTextViewText(R.id.custom_message, new WEHtmlParserInterface().fromHtml(this.f30383b.getContentText()));
        h10.setTextViewText(R.id.custom_title_native, new WEHtmlParserInterface().fromHtml(this.f30383b.getTitle()));
        h10.setTextViewText(R.id.custom_message_native, new WEHtmlParserInterface().fromHtml(this.f30383b.getContentText()));
        if (TextUtils.isEmpty(this.f30383b.getContentSummary())) {
            h10.setViewVisibility(R.id.custom_summary, 8);
            h10.setViewVisibility(R.id.custom_summary_native, 8);
        } else {
            h10.setTextViewText(R.id.custom_summary, new WEHtmlParserInterface().fromHtml(this.f30383b.getContentSummary()));
            h10.setTextViewText(R.id.custom_summary_native, new WEHtmlParserInterface().fromHtml(this.f30383b.getContentSummary()));
        }
        h10.setImageViewResource(R.id.small_icon, this.f30383b.getSmallIcon());
        if (this.f30389h == null) {
            this.f30389h = Long.valueOf(System.currentTimeMillis());
        }
        String format = DateFormat.getTimeFormat(this.f30382a).format(new Date());
        h10.setTextViewText(R.id.custom_notification_time, format);
        h10.setTextViewText(R.id.custom_notification_time_native, format);
        if (this.f30390i) {
            a(h10);
        } else {
            b(h10);
        }
        return h10;
    }

    protected Bitmap a(InputStream inputStream) {
        String str;
        if (inputStream == null) {
            return null;
        }
        try {
            return BitmapFactory.decodeStream(inputStream);
        } catch (Exception e10) {
            e = e10;
            str = "Exception while decoding input stream to bitmap.";
            Logger.e("WebEngage", str, e);
            return null;
        } catch (OutOfMemoryError e11) {
            e = e11;
            str = "Error while decoding input stream to bitmap.";
            Logger.e("WebEngage", str, e);
            return null;
        }
    }

    void c() {
        Notification.Builder builder;
        Notification.Builder builder2;
        String channelId = this.f30383b.getChannelId();
        String a10 = j2.a();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            if (channelId == null || !j2.b(channelId, this.f30382a)) {
                channelId = a10;
            }
            u.a();
            builder = t.a(this.f30382a, channelId);
        } else {
            builder = new Notification.Builder(this.f30382a);
        }
        this.f30387f = builder;
        this.f30387f.setVisibility(0);
        this.f30387f.setSmallIcon(this.f30383b.getSmallIcon());
        if (this.f30385d || this.f30390i) {
            this.f30387f.setCustomContentView(f());
        }
        this.f30387f.setContentTitle(new WEHtmlParserInterface().fromHtml(this.f30383b.getTitle())).setContentText(new WEHtmlParserInterface().fromHtml(this.f30383b.getContentText()));
        if (this.f30383b.getContentSummary() != null) {
            this.f30387f.setSubText(new WEHtmlParserInterface().fromHtml(this.f30383b.getContentSummary()));
        }
        if (this.f30383b.getLargeIcon() != null) {
            this.f30387f.setLargeIcon(this.f30383b.getLargeIcon());
        } else {
            Notification.Builder builder3 = this.f30387f;
            Context context = this.f30382a;
            builder3.setLargeIcon(Icon.createWithResource(context, context.getApplicationInfo().icon));
        }
        if (this.f30383b.isSticky()) {
            this.f30387f.setOngoing(true);
        }
        if (i10 >= 26) {
            long j10 = this.f30392k;
            if (j10 != -1) {
                if (this.f30389h != null) {
                    builder2 = this.f30387f;
                    j10 -= System.currentTimeMillis() - this.f30389h.longValue();
                } else {
                    builder2 = this.f30387f;
                }
                builder2.setTimeoutAfter(j10);
            }
        }
    }

    abstract void d();

    void e() {
        if (this.f30383b.getAutoDismissTime().split(":").length == 2) {
            try {
                this.f30392k = ((Integer.parseInt(r0[0]) * 60) + Integer.parseInt(r0[1])) * 60000;
                return;
            } catch (NumberFormatException unused) {
            }
        }
        Logger.e("WebEngage", "Could not parse auto dismiss time");
    }

    abstract void g();

    protected RemoteViews h() {
        RemoteViews remoteViews = new RemoteViews(this.f30382a.getPackageName(), R.layout.push_base);
        if (this.f30382a.getApplicationInfo().targetSdkVersion >= 24) {
            if (this.f30391j) {
                remoteViews.setViewVisibility(R.id.custom_small_head_container, 8);
            } else {
                remoteViews.setViewVisibility(R.id.custom_small_head_container, 0);
                int smallIcon = this.f30383b.getSmallIcon();
                if (smallIcon != -1) {
                    remoteViews.setImageViewResource(R.id.small_icon, smallIcon);
                } else {
                    int i10 = R.id.small_icon;
                    Context context = this.f30382a;
                    remoteViews.setImageViewIcon(i10, Icon.createWithResource(context, context.getApplicationInfo().icon));
                }
                String appName = this.f30383b.getAppName();
                if (appName != null) {
                    remoteViews.setTextViewText(R.id.app_name, appName);
                    remoteViews.setTextViewText(R.id.app_name_native, appName);
                }
                if (this.f30389h == null) {
                    this.f30389h = Long.valueOf(System.currentTimeMillis());
                }
                this.f30387f.setWhen(this.f30389h.longValue());
                String format = DateFormat.getTimeFormat(this.f30382a).format(new Date());
                remoteViews.setTextViewText(R.id.custom_notification_time, format);
                remoteViews.setTextViewText(R.id.custom_notification_time_native, format);
            }
            if (this.f30391j) {
                remoteViews.setViewPadding(R.id.custom_head_container, !this.f30390i ? 0 : this.f30382a.getResources().getDimensionPixelSize(R.dimen.we_push_content_margin_colorbg), 0, 0, 0);
            }
            if (this.f30390i) {
                remoteViews.setInt(R.id.push_base_container, "setBackgroundColor", this.f30383b.getBackgroundColor());
            }
        } else {
            remoteViews.setViewVisibility(R.id.custom_small_head_container, 8);
        }
        if (this.f30383b.getLargeIcon() != null) {
            a(this.f30383b.getLargeIcon(), remoteViews, R.id.custom_icon);
        } else {
            int i11 = R.id.custom_icon;
            Context context2 = this.f30382a;
            remoteViews.setImageViewIcon(i11, Icon.createWithResource(context2, context2.getApplicationInfo().icon));
        }
        int dimensionPixelSize = this.f30382a.getResources().getDimensionPixelSize(R.dimen.we_push_content_margin_colorbg);
        if (this.f30390i) {
            remoteViews.setViewPadding(R.id.custom_icon, 0, dimensionPixelSize, dimensionPixelSize, 0);
        }
        remoteViews.setViewVisibility(R.id.push_base_margin_view, 8);
        return remoteViews;
    }

    protected boolean i() {
        String stringFromHtml = PushUtils.getStringFromHtml(this.f30383b.getTitle());
        String stringFromHtml2 = PushUtils.getStringFromHtml(this.f30383b.getContentText());
        if (!this.f30386e.isEmpty() || !TextUtils.isEmpty(stringFromHtml) || !TextUtils.isEmpty(stringFromHtml2)) {
            return true;
        }
        a(this.f30382a, WebEngageConstant.c.INVALID_PUSH_CONTENT);
        return false;
    }

    abstract void j();

    void k() {
        String largeIconUrl;
        InputStream inputStream;
        if (this.f30383b.getLargeIconUrl() == null || (largeIconUrl = this.f30383b.getLargeIconUrl()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("accept", "image/webp");
        try {
            inputStream = (InputStream) WENetworkUtil.makeRequest(this.f30382a, new RequestObject.Builder(largeIconUrl, RequestMethod.GET, this.f30382a).setCachePolicy(2).b("large_icon").setHeaders(hashMap).build(), true, true).get("data");
            try {
                Bitmap a10 = a(inputStream);
                if (a10 != null) {
                    this.f30383b.setLargerIcon(a10);
                }
                inputStream.close();
            } catch (Exception unused) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                this.f30383b.createLargeIconFromAsset(this.f30382a);
            }
        } catch (Exception unused2) {
            inputStream = null;
        }
    }

    void l() {
        Notification build = this.f30387f.build();
        this.f30387f.setShowWhen(true);
        RemoteViews remoteViews = this.f30388g;
        if (remoteViews != null) {
            build = this.f30387f.setCustomBigContentView(remoteViews).build();
        }
        if (this.f30383b.getAccentColor() != -1) {
            build.color = this.f30383b.getAccentColor();
        }
        build.flags |= 24;
        NotificationManager notificationManager = (NotificationManager) this.f30382a.getSystemService("notification");
        try {
            notificationManager.notify(this.f30384c, build);
        } catch (SecurityException unused) {
            build.defaults = 5;
            notificationManager.notify(this.f30384c, build);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean onRender(Context context, PushNotificationData pushNotificationData) {
        a(context, pushNotificationData);
        g();
        j();
        boolean i10 = i();
        this.f30394m = i10;
        if (!i10) {
            return false;
        }
        k();
        c();
        d();
        a();
        l();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean onRerender(Context context, PushNotificationData pushNotificationData, Bundle bundle) {
        if (bundle != null) {
            this.f30389h = Long.valueOf(bundle.getLong("when"));
        }
        a(context, pushNotificationData);
        k();
        j();
        c();
        d();
        a();
        l();
        return true;
    }

    private RemoteViews a(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(R.id.app_name, 8);
        remoteViews.setViewVisibility(R.id.custom_summary, 8);
        remoteViews.setViewVisibility(R.id.custom_notification_time, 8);
        remoteViews.setViewVisibility(R.id.custom_title, 8);
        remoteViews.setViewVisibility(R.id.custom_message, 8);
        return remoteViews;
    }

    protected boolean b() {
        List<CallToAction> callToActions = this.f30383b.getCallToActions();
        if (callToActions == null || callToActions.size() <= 0) {
            return false;
        }
        for (CallToAction callToAction : callToActions) {
            if (!callToAction.isPrimeAction() && callToAction.isNative()) {
                return true;
            }
        }
        return false;
    }

    protected InputStream a(RequestObject requestObject) {
        InputStream inputStream;
        Exception e10;
        Map<String, Object> makeRequest;
        InputStream inputStream2 = null;
        for (int i10 = 0; i10 < 5; i10++) {
            try {
                makeRequest = WENetworkUtil.makeRequest(this.f30382a, requestObject, true, true);
                inputStream = (InputStream) makeRequest.get("data");
            } catch (Exception e11) {
                inputStream = inputStream2;
                e10 = e11;
            }
            try {
                inputStream.close();
                int intValue = ((Integer) makeRequest.get("status")).intValue();
                if (intValue >= 400 || intValue == 200 || intValue == 304) {
                    return inputStream;
                }
            } catch (Exception e12) {
                e10 = e12;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                e10.printStackTrace();
                inputStream2 = inputStream;
            }
            inputStream2 = inputStream;
        }
        return inputStream2;
    }

    private void a() {
        int i10;
        List<CallToAction> callToActions = this.f30383b.getCallToActions();
        if (callToActions != null && callToActions.size() > 0) {
            int i11 = 0;
            for (CallToAction callToAction : callToActions) {
                if (callToAction.isPrimeAction()) {
                    this.f30387f.setContentIntent(PendingIntentFactory.constructPushClickPendingIntent(this.f30382a, this.f30383b, callToAction, true));
                } else if (callToAction.isNative()) {
                    PendingIntent constructPushClickPendingIntent = PendingIntentFactory.constructPushClickPendingIntent(this.f30382a, this.f30383b, callToAction, true);
                    try {
                        if (callToAction.getType() != null && callToAction.getType().equals(CallToAction.TYPE.CUSTOM) && callToAction.getCustomActionJSON() != null && "dismiss".equals(callToAction.getCustomActionJSON().getString("at"))) {
                            constructPushClickPendingIntent = PendingIntentFactory.constructPushDeletePendingIntent(this.f30382a, this.f30383b);
                        }
                    } catch (JSONException unused) {
                    }
                    if (this.f30385d || this.f30390i || this.f30393l) {
                        if (this.f30388g != null && ((!WebEngageConstant.STYLE.PROGRESS_BAR.equals(this.f30383b.getStyle()) && !WebEngageConstant.STYLE.TIMER.equals(this.f30383b.getStyle()) && !WebEngageConstant.STYLE.BIG_TIMER.equals(this.f30383b.getStyle())) || this.f30393l)) {
                            i11++;
                            if (i11 != 1) {
                                i10 = i11 != 2 ? i11 != 3 ? -1 : R.id.action3_native : R.id.action2_native;
                            } else {
                                int i12 = Build.VERSION.SDK_INT;
                                if (i12 <= 27) {
                                    this.f30388g.setInt(R.id.action_list, "setBackgroundColor", Color.parseColor("#e8e8e8"));
                                }
                                if (this.f30382a.getApplicationInfo().targetSdkVersion >= 31 && i12 >= 31) {
                                    this.f30388g.setViewPadding(R.id.actions, this.f30382a.getResources().getDimensionPixelSize(R.dimen.we_push_content_margin_colorbg), 0, 0, 0);
                                    this.f30388g.setViewLayoutHeight(R.id.actions, this.f30382a.getResources().getDimension(R.dimen.we_push_action_list_height_template), 0);
                                }
                                this.f30388g.setViewVisibility(R.id.action_list, 0);
                                i10 = R.id.action1_native;
                            }
                            if (i10 != -1) {
                                this.f30388g.setViewVisibility(i10, 0);
                                this.f30388g.setTextViewText(i10, new WEHtmlParserInterface().fromHtml(callToAction.getText()));
                                this.f30388g.setOnClickPendingIntent(i10, constructPushClickPendingIntent);
                            }
                        }
                    } else {
                        this.f30387f.addAction(new Notification.Action.Builder((Icon) null, new WEHtmlParserInterface().fromHtml(callToAction.getText()), constructPushClickPendingIntent).build());
                    }
                }
            }
        }
        this.f30387f.setDeleteIntent(PendingIntentFactory.constructPushDeletePendingIntent(this.f30382a, this.f30383b));
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 26) {
            int[] iArr = {-2, -1, 0, 1, 2};
            if (5 < this.f30383b.getPriority() + 2) {
                this.f30387f.setPriority(iArr[this.f30383b.getPriority() + 2]);
            }
        }
        if (i13 < 26) {
            if (this.f30383b.getVibrateFlag() && v1.a("android.permission.VIBRATE", this.f30382a)) {
                this.f30387f.setDefaults(2);
            }
            if (this.f30383b.getSound() != null) {
                this.f30387f.setSound(this.f30383b.getSound());
            }
            if (this.f30383b.getLedColor() != 0) {
                this.f30387f.setLights(this.f30383b.getLedColor(), 500, 1000);
            }
        }
    }

    private void a(Context context, PushNotificationData pushNotificationData) {
        this.f30382a = context.getApplicationContext();
        this.f30383b = pushNotificationData;
        this.f30384c = pushNotificationData.getVariationId().hashCode();
        this.f30386e = new ArrayList();
        Bundle customData = pushNotificationData.getCustomData();
        this.f30385d = customData != null && customData.containsKey("we_push_custom") && Boolean.parseBoolean(customData.getString("we_push_custom"));
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            this.f30390i = true;
        }
        if (Build.VERSION.SDK_INT >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            this.f30391j = true;
        }
        if (pushNotificationData.getAutoDismissTime() != null) {
            e();
        }
    }

    protected void a(Context context, WebEngageConstant.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", Integer.valueOf(cVar.a()));
        hashMap.put("reason", cVar.toString());
        hashMap.put("error_message", cVar.b());
        hashMap.put("amplified", Boolean.valueOf(this.f30383b.isAmplified()));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("experiment_id", this.f30383b.getExperimentId());
        hashMap2.put("id", this.f30383b.getVariationId());
        WebEngage.startService(l1.a(y3.f31158c, n0.b("push_notification_failed", hashMap2, hashMap, null, context), context), context);
    }

    void a(Bitmap bitmap, Icon icon, RemoteViews remoteViews, int i10) {
        remoteViews.setImageViewIcon(i10, icon);
    }

    void a(Bitmap bitmap, RemoteViews remoteViews, int i10) {
        remoteViews.setImageViewIcon(i10, Icon.createWithBitmap(bitmap));
    }

    protected void a(Exception exc) {
        WebEngage.startService(l1.a(y3.f31163h, exc, this.f30382a), this.f30382a);
    }
}
