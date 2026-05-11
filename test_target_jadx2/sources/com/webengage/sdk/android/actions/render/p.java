package com.webengage.sdk.android.actions.render;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.RemoteViews;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.PushUtils;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.htmlspanner.WEHtmlParserInterface;
import com.webengage.sdk.android.v1;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class p extends k implements CustomPushRender, CustomPushRerender {

    /* renamed from: n, reason: collision with root package name */
    private long f30430n = 0;

    /* renamed from: o, reason: collision with root package name */
    long f30431o = 0;

    /* renamed from: p, reason: collision with root package name */
    g f30432p = null;

    private void a(RemoteViews remoteViews, int i10) {
        this.f30432p.a(remoteViews, Integer.valueOf(this.f30383b.getTimerStyleData().getTimerColor()), i10);
    }

    private void m() {
        StringBuilder sb2;
        String str;
        PushNotificationData.TimerStyle timerStyleData = this.f30383b.getTimerStyleData();
        if (timerStyleData.getFutureTime() != null && !timerStyleData.getFutureTime().isEmpty()) {
            String futureTime = timerStyleData.getFutureTime();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            try {
                TimeZone timeZone = PushUtils.getTimeZone(this.f30383b);
                Objects.requireNonNull(timeZone);
                simpleDateFormat.setTimeZone(timeZone);
                this.f30430n = simpleDateFormat.parse(futureTime).getTime();
                return;
            } catch (Exception unused) {
                a(this.f30382a, WebEngageConstant.c.UNKNOWN_SDK_FAILURE);
                sb2 = new StringBuilder();
                str = "Could not parse futureTime format, push with experimentId = ";
            }
        } else if (timerStyleData.getDuration() == null || timerStyleData.getDuration().isEmpty()) {
            a(this.f30382a, WebEngageConstant.c.UNKNOWN_SDK_FAILURE);
            sb2 = new StringBuilder();
            str = "FutureTime & Duration not found, push with experimentId = ";
        } else {
            if (timerStyleData.getDuration().split(":").length == 2) {
                try {
                    this.f30430n = this.f30389h.longValue() + (((Integer.parseInt(r0[0]) * 60) + Integer.parseInt(r0[1])) * 60000);
                    return;
                } catch (NumberFormatException unused2) {
                    a(this.f30382a, WebEngageConstant.c.UNKNOWN_SDK_FAILURE);
                    sb2 = new StringBuilder();
                }
            } else {
                a(this.f30382a, WebEngageConstant.c.UNKNOWN_SDK_FAILURE);
                sb2 = new StringBuilder();
            }
            str = "Could not parse duration format, push with experimentId = ";
        }
        sb2.append(str);
        sb2.append(this.f30383b.getExperimentId());
        sb2.append(" will not render");
        Logger.e("WebEngage", sb2.toString());
    }

    private RemoteViews n() {
        RemoteViews a10 = this.f30432p.a(this.f30382a, this.f30383b, this.f30389h.longValue(), R.layout.timer_push_base);
        this.f30432p.b(a10, 1);
        this.f30432p.a(a10, 2);
        a10.setViewVisibility(R.id.custom_base_container, 0);
        PushNotificationData.TimerStyle timerStyleData = this.f30383b.getTimerStyleData();
        if (WebEngageConstant.STYLE.TIMER.equals(this.f30383b.getStyle()) || WebEngageConstant.STYLE.PROGRESS_BAR.equals(this.f30383b.getStyle())) {
            a10.setViewVisibility(R.id.large_icon, 8);
            a10.setViewVisibility(R.id.we_notification_timer, 0);
            a(timerStyleData, a10);
        }
        return a10;
    }

    private void o() {
        Intent intent = new Intent(this.f30382a, (Class<?>) TimerService.class);
        intent.setAction("com.webengage.sdk.android.intent.PROGRESS_BAR");
        intent.putExtra("data", this.f30383b.getPushPayloadJSON().toString());
        intent.putExtra("when", this.f30389h);
        intent.putExtra("epochTime", this.f30430n);
        PushNotificationData pushNotificationData = this.f30383b;
        if (pushNotificationData == null || pushNotificationData.getPushPayloadJSON() == null) {
            a(new Exception("Invalid Push Notification data to start Timer"));
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f30382a.startForegroundService(intent);
            } else {
                this.f30382a.startService(intent);
            }
        } catch (Exception unused) {
            this.f30432p.a(this.f30382a, this.f30383b, this.f30389h.longValue(), this.f30430n, true);
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void c() {
        Notification.Builder builder;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            String a10 = this.f30432p.a(this.f30383b, this.f30382a);
            u.a();
            builder = t.a(this.f30382a, a10);
        } else {
            builder = new Notification.Builder(this.f30382a);
        }
        this.f30387f = builder;
        this.f30387f.setSmallIcon(this.f30383b.getSmallIcon());
        if (this.f30383b.getContentSummary() != null) {
            this.f30387f.setSubText(new WEHtmlParserInterface().fromHtml(this.f30383b.getContentSummary()));
        }
        RemoteViews a11 = this.f30432p.a(this.f30382a, this.f30383b, this.f30389h.longValue(), R.layout.timer_push_base);
        PushNotificationData.TimerStyle timerStyleData = this.f30383b.getTimerStyleData();
        this.f30432p.b(a11, 1);
        this.f30432p.a(a11, 1);
        if (timerStyleData != null) {
            if (WebEngageConstant.STYLE.TIMER.equals(this.f30383b.getStyle()) || WebEngageConstant.STYLE.PROGRESS_BAR.equals(this.f30383b.getStyle())) {
                if (WebEngageConstant.STYLE.PROGRESS_BAR.equals(this.f30383b.getStyle())) {
                    a11.setViewVisibility(R.id.custom_message, 8);
                    a11.setViewVisibility(R.id.custom_message_native, 8);
                }
                a(timerStyleData, a11);
            } else {
                a11.setViewVisibility(R.id.large_icon, 8);
                a11.setViewVisibility(R.id.we_notification_big_timer_collapsed, 0);
                a(a11, R.id.we_notification_big_timer_collapsed);
                if (i10 >= 26 && this.f30430n - System.currentTimeMillis() > 0) {
                    this.f30387f.setTimeoutAfter(this.f30430n - System.currentTimeMillis());
                }
                this.f30432p.a(a11, this.f30430n, R.id.we_notification_big_timer_collapsed);
            }
        }
        this.f30387f.setCustomContentView(a11);
        this.f30387f.setContentTitle(new WEHtmlParserInterface().fromHtml(this.f30383b.getTitle())).setContentText(new WEHtmlParserInterface().fromHtml(this.f30383b.getContentText()));
        if (this.f30383b.isSticky()) {
            this.f30387f.setOngoing(true);
        }
        this.f30387f.setVisibility(0);
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void d() {
        RemoteViews remoteViews;
        if (this.f30383b.getStyle() == null || this.f30383b.getTimerStyleData() == null) {
            return;
        }
        this.f30387f.setWhen(this.f30389h.longValue());
        this.f30388g = n();
        if (WebEngageConstant.STYLE.TIMER.equals(this.f30383b.getStyle()) || WebEngageConstant.STYLE.PROGRESS_BAR.equals(this.f30383b.getStyle())) {
            remoteViews = new RemoteViews(this.f30382a.getPackageName(), R.layout.timer_layout);
            if (this.f30386e.size() > 0) {
                remoteViews.setViewVisibility(R.id.big_picture_image, 0);
                a(this.f30386e.get(0), remoteViews, R.id.big_picture_image);
            }
            if (WebEngageConstant.STYLE.PROGRESS_BAR.equals(this.f30383b.getStyle())) {
                this.f30432p.a(this.f30388g, 1);
            }
        } else if (WebEngageConstant.STYLE.BIG_TIMER.equals(this.f30383b.getStyle())) {
            remoteViews = new RemoteViews(this.f30382a.getPackageName(), R.layout.big_timer);
            if (this.f30386e.size() > 0) {
                a(this.f30386e.get(0), this.f30388g, R.id.large_icon);
                if (this.f30382a.getApplicationInfo().targetSdkVersion >= 31 && Build.VERSION.SDK_INT >= 31 && this.f30383b.getTimerStyleData().getProgressBarColor() != Color.parseColor("#00000000")) {
                    this.f30388g.setViewPadding(R.id.large_icon, 0, this.f30382a.getResources().getDimensionPixelSize(R.dimen.we_push_image_margin_colorbg), 0, 0);
                }
            }
            remoteViews.setViewVisibility(R.id.we_big_timer_expanded_layout, 8);
            remoteViews.setViewVisibility(R.id.we_notification_big_timer_expanded, 0);
            this.f30432p.a(remoteViews, this.f30430n, R.id.we_notification_big_timer_expanded);
            a(remoteViews, R.id.we_notification_big_timer_expanded);
            if (Build.VERSION.SDK_INT >= 26 && this.f30430n - System.currentTimeMillis() > 0) {
                this.f30387f.setTimeoutAfter(this.f30430n - System.currentTimeMillis());
            }
        } else {
            remoteViews = null;
        }
        if (remoteViews != null) {
            if (!b()) {
                remoteViews.setViewVisibility(R.id.push_action_margin_view, 0);
            }
            this.f30388g.removeAllViews(R.id.custom_base_container);
            this.f30388g.addView(R.id.custom_base_container, remoteViews);
        }
        this.f30432p.a(this.f30388g, this.f30387f, this.f30383b, this.f30382a);
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void g() {
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void j() {
        if (this.f30383b.getTimerStyleData() == null || this.f30383b.getTimerStyleData().getImageUrl() == null) {
            return;
        }
        try {
            Bitmap a10 = this.f30432p.a(this.f30383b.getTimerStyleData().getImageUrl(), this.f30382a);
            if (a10 != null) {
                this.f30386e.add(a10);
            }
        } catch (Exception e10) {
            Logger.d("WebEngage", "Timer renderer can not load image with exception ->" + e10);
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k
    void l() {
        if (this.f30383b.getTimerStyleData() != null) {
            WebEngageConstant.STYLE style = WebEngageConstant.STYLE.PROGRESS_BAR;
            if (style.equals(this.f30383b.getStyle()) || WebEngageConstant.STYLE.BIG_TIMER.equals(this.f30383b.getStyle())) {
                int i10 = Build.VERSION.SDK_INT;
                int i11 = this.f30382a.getApplicationInfo().targetSdkVersion;
                boolean a10 = v1.a("android.permission.FOREGROUND_SERVICE", this.f30382a);
                boolean z10 = false;
                boolean z11 = i10 < 28;
                boolean z12 = i10 < 34 && a10;
                if (i11 >= 34 && a10 && PushUtils.isForegroundServiceTypeAdded(this.f30382a)) {
                    z10 = true;
                }
                if (z11 || z12 || z10) {
                    o();
                    return;
                } else if (style.equals(this.f30383b.getStyle())) {
                    this.f30432p.a(this.f30382a, this.f30383b, this.f30389h.longValue(), this.f30430n, false);
                }
            }
        }
        super.l();
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRender
    public boolean onRender(Context context, PushNotificationData pushNotificationData) {
        a(pushNotificationData, (Bundle) null);
        if (this.f30430n - System.currentTimeMillis() > 0) {
            return super.onRender(context, pushNotificationData);
        }
        a(context, WebEngageConstant.c.TIMER_DATE_EXPIRED);
        return false;
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRerender
    public boolean onRerender(Context context, PushNotificationData pushNotificationData, Bundle bundle) {
        a(pushNotificationData, bundle);
        if (this.f30432p == null) {
            this.f30432p = new g();
        }
        if (this.f30430n - System.currentTimeMillis() > 0) {
            if (System.currentTimeMillis() - this.f30389h.longValue() < 0) {
                return true;
            }
            super.onRerender(context, pushNotificationData, null);
            if (bundle.getBoolean("sn", false) || !WebEngageConstant.STYLE.PROGRESS_BAR.equals(pushNotificationData.getStyle())) {
                return true;
            }
            this.f30432p.a(this.f30382a, pushNotificationData, this.f30389h.longValue(), this.f30430n, false);
            return true;
        }
        Logger.e("WebEngage", "Timer end time (" + this.f30430n + ") has passed current time (" + System.currentTimeMillis() + ")push with experimentId = " + pushNotificationData.getExperimentId() + " will not render");
        return false;
    }

    private void a(PushNotificationData.TimerStyle timerStyle, RemoteViews remoteViews) {
        long currentTimeMillis = this.f30430n - System.currentTimeMillis();
        this.f30431o = currentTimeMillis;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f30387f.setTimeoutAfter(currentTimeMillis);
        }
        long elapsedRealtime = this.f30431o + SystemClock.elapsedRealtime();
        int i10 = R.id.we_notification_timer;
        if (WebEngageConstant.STYLE.PROGRESS_BAR.equals(this.f30383b.getStyle())) {
            i10 = R.id.we_progress_bar_timer;
            remoteViews.setViewVisibility(R.id.we_push_right_layout, 8);
            remoteViews.setViewVisibility(R.id.we_progress_bar_timer, 0);
            remoteViews.setChronometer(R.id.we_progress_bar_timer, elapsedRealtime, "%s", true);
            remoteViews.setViewVisibility(R.id.we_notification_progressBar, 0);
            this.f30432p.c(remoteViews, Integer.valueOf(timerStyle.getProgressBarColor()));
            this.f30432p.b(remoteViews, Integer.valueOf(timerStyle.getProgressBarBackgroundColor()));
            remoteViews.setProgressBar(R.id.we_notification_progressBar, (int) (this.f30430n - this.f30389h.longValue()), (int) (System.currentTimeMillis() - this.f30389h.longValue()), false);
        } else if (WebEngageConstant.STYLE.TIMER.equals(this.f30383b.getStyle())) {
            remoteViews.setViewVisibility(R.id.large_icon, 8);
            remoteViews.setViewVisibility(R.id.we_notification_timer, 0);
            remoteViews.setChronometer(R.id.we_notification_timer, elapsedRealtime, "%s", true);
        }
        a(remoteViews, i10);
    }

    private void a(PushNotificationData pushNotificationData, Bundle bundle) {
        if (this.f30432p == null) {
            this.f30432p = new g();
        }
        this.f30383b = pushNotificationData;
        if (bundle != null) {
            this.f30389h = Long.valueOf(bundle.getLong("when", System.currentTimeMillis()));
        }
        if (this.f30389h == null) {
            this.f30389h = Long.valueOf(System.currentTimeMillis());
        }
        m();
    }
}
