package com.webengage.sdk.android.actions.render;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.PendingIntentFactory;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.utils.WebEngageConstant;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TimerService extends Service {

    /* renamed from: c, reason: collision with root package name */
    private PushNotificationData f30305c;

    /* renamed from: d, reason: collision with root package name */
    private long f30306d;

    /* renamed from: a, reason: collision with root package name */
    private long f30303a = 0;

    /* renamed from: b, reason: collision with root package name */
    private CountDownTimer f30304b = null;

    /* renamed from: e, reason: collision with root package name */
    private Notification.Builder f30307e = null;

    /* renamed from: f, reason: collision with root package name */
    private Context f30308f = null;

    /* renamed from: g, reason: collision with root package name */
    private g f30309g = null;

    /* renamed from: h, reason: collision with root package name */
    boolean f30310h = false;

    /* renamed from: i, reason: collision with root package name */
    Notification f30311i = null;

    class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PendingIntent f30312a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, long j11, PendingIntent pendingIntent) {
            super(j10, j11);
            this.f30312a = pendingIntent;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            try {
                this.f30312a.send();
            } catch (PendingIntent.CanceledException unused) {
            }
            TimerService.this.stopSelf();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            if (System.currentTimeMillis() - TimerService.this.f30306d <= 0) {
                try {
                    this.f30312a.send();
                } catch (PendingIntent.CanceledException unused) {
                }
                TimerService.this.stopSelf();
                return;
            }
            TimerService.this.c();
            try {
                g gVar = TimerService.this.f30309g;
                TimerService timerService = TimerService.this;
                gVar.a(timerService.f30311i, timerService.f30308f, TimerService.this.f30303a, TimerService.this.f30305c.getVariationId().hashCode());
            } catch (RuntimeException e10) {
                Logger.e("WebEngage", "RunTimeException: Failed to show notification: " + e10.getMessage());
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        stopForeground(2);
        CountDownTimer countDownTimer = this.f30304b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        String str;
        Notification.Builder builder;
        if (intent == null || intent.getAction() == null) {
            str = "Received invalid Intent in TimerService";
        } else {
            String action = intent.getAction();
            action.hashCode();
            if (!action.equals("com.webengage.sdk.android.intent.PROGRESS_BAR")) {
                if (!action.equals("STOP_SERVICE_CANCEL_NOTIFICATION")) {
                    Logger.e("WebEngage", "Unknown action received");
                    return 3;
                }
                stopForeground(1);
                CountDownTimer countDownTimer = this.f30304b;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                    this.f30304b = null;
                }
                stopSelf(i11);
                return 3;
            }
            if (this.f30304b != null && this.f30305c != null) {
                stopForeground(1);
                if (this.f30305c != null) {
                    ((NotificationManager) getSystemService("notification")).cancel(this.f30305c.getVariationId().hashCode());
                }
                this.f30304b.cancel();
            }
            this.f30308f = getApplicationContext();
            if (intent.getExtras() == null || !intent.getExtras().containsKey("data")) {
                str = "TimerService: Missing intent data";
            } else {
                try {
                    String string = intent.getExtras().getString("data");
                    if (TextUtils.isEmpty(string)) {
                        Logger.e("WebEngage", "TimerService: Invalid data received from Intent");
                        return 2;
                    }
                    PushNotificationData pushNotificationData = new PushNotificationData(new JSONObject(string), this.f30308f);
                    this.f30305c = pushNotificationData;
                    if (pushNotificationData.getStyle() != null && this.f30305c.getTimerStyleData() != null && !TextUtils.isEmpty(this.f30305c.getVariationId())) {
                        if (this.f30309g == null) {
                            this.f30309g = new g();
                        }
                        String a10 = this.f30309g.a(this.f30305c, this.f30308f);
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 >= 26) {
                            u.a();
                            builder = t.a(this.f30308f, a10);
                        } else {
                            builder = new Notification.Builder(this.f30308f);
                        }
                        this.f30307e = builder;
                        this.f30306d = intent.getExtras().getLong("when");
                        this.f30303a = intent.getLongExtra("epochTime", 0L);
                        this.f30310h = this.f30305c.getBackgroundColor() != Color.parseColor("#00000000");
                        if (this.f30303a - System.currentTimeMillis() <= 0) {
                            return 2;
                        }
                        d();
                        if (i12 >= 31) {
                            this.f30307e.setForegroundServiceBehavior(1);
                        }
                        this.f30307e.setAutoCancel(true);
                        this.f30307e.setOnlyAlertOnce(true);
                        try {
                            startForeground(this.f30305c.getVariationId().hashCode(), this.f30307e.build());
                            e();
                            return 3;
                        } catch (IllegalStateException unused) {
                            new g().a(this.f30308f, this.f30305c, this.f30306d, this.f30303a, true);
                            return 3;
                        }
                    }
                    str = "TimerService : Invalid PushNotification Data to render the notification";
                } catch (Exception unused2) {
                    str = "TimerService : Failed to parse pushNotificationData json";
                }
            }
        }
        Logger.e("WebEngage", str);
        return 2;
    }

    private RemoteViews a() {
        RemoteViews a10 = this.f30309g.a(this.f30308f, this.f30305c, this.f30306d, R.layout.timer_push_base);
        int i10 = R.id.push_base_container;
        Context context = this.f30308f;
        PushNotificationData pushNotificationData = this.f30305c;
        a10.setOnClickPendingIntent(i10, PendingIntentFactory.constructPushClickPendingIntent(context, pushNotificationData, pushNotificationData.getPrimeCallToAction(), true));
        if (WebEngageConstant.STYLE.PROGRESS_BAR.equals(this.f30305c.getStyle())) {
            a10.setViewVisibility(R.id.custom_message, 8);
            a10.setViewVisibility(R.id.custom_message_native, 8);
            this.f30309g.a(a10, this.f30303a, this.f30306d);
            this.f30309g.a(a10, this.f30303a, this.f30305c);
            this.f30309g.a(a10, Integer.valueOf(this.f30305c.getTimerStyleData().getTimerColor()), R.id.we_progress_bar_timer);
            this.f30309g.c(a10, Integer.valueOf(this.f30305c.getTimerStyleData().getProgressBarColor()));
            this.f30309g.b(a10, Integer.valueOf(this.f30305c.getTimerStyleData().getProgressBarBackgroundColor()));
        } else if (WebEngageConstant.STYLE.BIG_TIMER.equals(this.f30305c.getStyle())) {
            a10.setViewVisibility(R.id.we_big_timer_collapsed, 0);
            a10.setViewVisibility(R.id.large_icon, 8);
            long a11 = this.f30303a + (this.f30309g.a(this.f30303a) * 1000);
            this.f30303a = a11;
            this.f30309g.a(a10, true, a11, this.f30308f, this.f30305c);
            this.f30309g.a(a10, Integer.valueOf(this.f30305c.getTimerStyleData().getTimerColor()));
        }
        this.f30309g.b(a10, 1);
        this.f30309g.a(a10, 1);
        a10.setViewVisibility(R.id.push_base_margin_view, 0);
        return a10;
    }

    private RemoteViews b() {
        RemoteViews a10 = this.f30309g.a(this.f30308f, this.f30305c, this.f30306d, R.layout.timer_push_base);
        int i10 = R.id.push_base_container;
        Context context = this.f30308f;
        PushNotificationData pushNotificationData = this.f30305c;
        a10.setOnClickPendingIntent(i10, PendingIntentFactory.constructPushClickPendingIntent(context, pushNotificationData, pushNotificationData.getPrimeCallToAction(), true));
        this.f30309g.b(a10, 1);
        Bitmap a11 = this.f30309g.a(this.f30305c.getTimerStyleData().getImageUrl(), this.f30308f);
        RemoteViews remoteViews = new RemoteViews(this.f30308f.getPackageName(), R.layout.timer_layout);
        WebEngageConstant.STYLE style = WebEngageConstant.STYLE.PROGRESS_BAR;
        if (style.equals(this.f30305c.getStyle())) {
            this.f30309g.a(a10, 1);
            a10.setViewVisibility(R.id.custom_base_container, 0);
            if (a11 != null) {
                remoteViews.setViewVisibility(R.id.big_picture_image, 0);
                this.f30309g.a(a11, remoteViews, R.id.big_picture_image);
            }
        } else if (WebEngageConstant.STYLE.BIG_TIMER.equals(this.f30305c.getStyle())) {
            this.f30309g.a(a10, 2);
            a10.setViewVisibility(R.id.custom_base_container, 0);
            remoteViews = new RemoteViews(this.f30308f.getPackageName(), R.layout.big_timer);
            if (a11 != null) {
                this.f30309g.a(a11, a10, R.id.large_icon);
                if (this.f30308f.getApplicationInfo().targetSdkVersion >= 31 && Build.VERSION.SDK_INT >= 31 && this.f30305c.getTimerStyleData().getProgressBarColor() != Color.parseColor("#00000000")) {
                    a10.setViewPadding(R.id.large_icon, 0, this.f30308f.getResources().getDimensionPixelSize(R.dimen.we_push_image_margin_colorbg), 0, 0);
                }
            }
            long a12 = this.f30303a + (this.f30309g.a(this.f30303a) * 1000);
            this.f30303a = a12;
            this.f30309g.a(remoteViews, false, a12, this.f30308f, this.f30305c);
            this.f30309g.a(remoteViews, Integer.valueOf(this.f30305c.getTimerStyleData().getTimerColor()));
        }
        if (!this.f30309g.a(this.f30305c)) {
            remoteViews.setViewVisibility(R.id.push_action_margin_view, 0);
        }
        a10.removeAllViews(R.id.custom_base_container);
        a10.addView(R.id.custom_base_container, remoteViews);
        this.f30309g.a(remoteViews, this.f30307e, this.f30305c, this.f30308f);
        if (style.equals(this.f30305c.getStyle())) {
            this.f30309g.a(a10, this.f30303a, this.f30306d);
            this.f30309g.c(a10, Integer.valueOf(this.f30305c.getTimerStyleData().getProgressBarColor()));
            this.f30309g.b(a10, Integer.valueOf(this.f30305c.getTimerStyleData().getProgressBarBackgroundColor()));
            this.f30309g.a(a10, Integer.valueOf(this.f30305c.getTimerStyleData().getTimerColor()), R.id.we_progress_bar_timer);
            this.f30309g.a(a10, this.f30303a, this.f30305c);
        }
        return a10;
    }

    private void e() {
        long currentTimeMillis = this.f30303a - System.currentTimeMillis();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f30307e.setTimeoutAfter(currentTimeMillis);
        }
        a aVar = new a(currentTimeMillis, WebEngageConstant.STYLE.BIG_TIMER.equals(this.f30305c.getStyle()) ? 10000L : 1000L, PendingIntentFactory.constructPushDeletePendingIntent(this.f30308f, this.f30305c));
        this.f30304b = aVar;
        aVar.start();
    }

    void c() {
        this.f30307e.setProgress((int) (this.f30303a - this.f30306d), (int) (System.currentTimeMillis() - this.f30306d), false);
        this.f30309g.a(this.f30307e, this.f30305c, this.f30308f);
        this.f30307e.setOngoing(true);
        this.f30307e.setWhen(this.f30306d);
        this.f30307e.setCustomContentView(a());
        this.f30311i = this.f30309g.a(this.f30307e);
        this.f30311i = this.f30307e.setCustomBigContentView(b()).build();
    }

    void d() {
        c();
    }
}
