package com.webengage.sdk.android.actions.render;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.PendingIntentFactory;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.actions.render.CallToAction;
import com.webengage.sdk.android.j2;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.htmlspanner.WEHtmlParserInterface;
import com.webengage.sdk.android.utils.http.RequestMethod;
import com.webengage.sdk.android.utils.http.RequestObject;
import com.webengage.sdk.android.utils.http.WENetworkUtil;
import com.webengage.sdk.android.v1;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class g {
    int a(long j10) {
        int currentTimeMillis = ((int) (((j10 - System.currentTimeMillis()) % 60000) / 1000)) % 10;
        if (currentTimeMillis != 9) {
            return currentTimeMillis < 5 ? (currentTimeMillis + 1) * (-1) : 9 - currentTimeMillis;
        }
        return 0;
    }

    void b(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(R.id.app_name_native, 8);
        remoteViews.setViewVisibility(R.id.custom_summary_native, 8);
        remoteViews.setViewVisibility(R.id.custom_notification_time_native, 8);
        remoteViews.setViewVisibility(R.id.custom_title_native, 8);
        remoteViews.setViewVisibility(R.id.custom_message_native, 8);
    }

    public void c(RemoteViews remoteViews, Integer num) {
        if (Build.VERSION.SDK_INT < 31 || num == null) {
            return;
        }
        remoteViews.setColorStateList(R.id.we_notification_progressBar, "setProgressTintList", ColorStateList.valueOf(num.intValue()));
    }

    Notification a(Notification.Builder builder) {
        builder.setAutoCancel(true);
        builder.setOnlyAlertOnce(true);
        builder.setShowWhen(true);
        return builder.build();
    }

    void b(RemoteViews remoteViews, int i10) {
        remoteViews.setBoolean(R.id.custom_title, "setSingleLine", false);
        remoteViews.setBoolean(R.id.custom_title_native, "setSingleLine", false);
        remoteViews.setInt(R.id.custom_title, "setMaxLines", i10);
        remoteViews.setInt(R.id.custom_title_native, "setMaxLines", i10);
    }

    Bitmap a(InputStream inputStream) {
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

    public void b(RemoteViews remoteViews, Integer num) {
        if (Build.VERSION.SDK_INT < 31 || num == null) {
            return;
        }
        remoteViews.setColorStateList(R.id.we_notification_progressBar, "setProgressBackgroundTintList", ColorStateList.valueOf(num.intValue()));
    }

    Bitmap a(String str, Context context) {
        InputStream inputStream;
        if (str != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("accept", "image/webp");
            try {
                inputStream = (InputStream) WENetworkUtil.makeRequest(context, new RequestObject.Builder(str, RequestMethod.GET, context).setCachePolicy(6).b("landscape").setHeaders(hashMap).build(), true, true).get("data");
                try {
                    Bitmap a10 = a(inputStream);
                    inputStream.close();
                    if (a10 != null) {
                        return a10;
                    }
                } catch (Exception e10) {
                    e = e10;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    e.printStackTrace();
                    return null;
                }
            } catch (Exception e12) {
                e = e12;
                inputStream = null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    RemoteViews a(Context context, PushNotificationData pushNotificationData, long j10, int i10) {
        int i11;
        Icon createWithResource;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i10);
        int i12 = context.getApplicationInfo().targetSdkVersion;
        boolean z10 = pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000");
        boolean z11 = Build.VERSION.SDK_INT >= 31 && context.getApplicationInfo().targetSdkVersion >= 31;
        if (i12 >= 24) {
            int i13 = R.id.custom_small_head_container;
            if (z11) {
                remoteViews.setViewVisibility(i13, 8);
            } else {
                remoteViews.setViewVisibility(i13, 0);
                int smallIcon = pushNotificationData.getSmallIcon();
                if (smallIcon != -1) {
                    remoteViews.setImageViewResource(R.id.small_icon, smallIcon);
                } else {
                    remoteViews.setImageViewIcon(R.id.small_icon, Icon.createWithResource(context, context.getApplicationInfo().icon));
                }
                String appName = pushNotificationData.getAppName();
                if (appName != null) {
                    remoteViews.setTextViewText(R.id.app_name, appName);
                    remoteViews.setTextViewText(R.id.app_name_native, appName);
                }
            }
            if (z11) {
                int dimensionPixelSize = !z10 ? 0 : context.getResources().getDimensionPixelSize(R.dimen.we_push_content_margin_colorbg);
                remoteViews.setViewPadding(R.id.custom_head_container, dimensionPixelSize, 0, dimensionPixelSize, 0);
            }
            if (z10) {
                remoteViews.setInt(R.id.push_base_container, "setBackgroundColor", pushNotificationData.getBackgroundColor());
            }
        } else {
            remoteViews.setViewVisibility(R.id.custom_small_head_container, 8);
        }
        if (pushNotificationData.getLargeIcon() != null) {
            i11 = R.id.large_icon;
            createWithResource = Icon.createWithBitmap(pushNotificationData.getLargeIcon());
        } else {
            if (pushNotificationData.getLargeIcon() != null) {
                remoteViews.setImageViewBitmap(R.id.large_icon, pushNotificationData.getLargeIcon());
                remoteViews.setViewVisibility(R.id.push_base_margin_view, 8);
                if (z10) {
                    b(remoteViews);
                } else {
                    a(remoteViews);
                }
                if (TextUtils.isEmpty(pushNotificationData.getTitle())) {
                    remoteViews.setTextViewText(R.id.custom_title, new WEHtmlParserInterface().fromHtml(pushNotificationData.getTitle()));
                    remoteViews.setTextViewText(R.id.custom_title_native, new WEHtmlParserInterface().fromHtml(pushNotificationData.getTitle()));
                } else {
                    remoteViews.setViewVisibility(R.id.custom_title, 8);
                    remoteViews.setViewVisibility(R.id.custom_title_native, 8);
                }
                if (!TextUtils.isEmpty(pushNotificationData.getContentText()) || pushNotificationData.getContentText().equals("null")) {
                    remoteViews.setViewVisibility(R.id.custom_message, 8);
                    remoteViews.setViewVisibility(R.id.custom_message_native, 8);
                } else {
                    remoteViews.setTextViewText(R.id.custom_message, new WEHtmlParserInterface().fromHtml(pushNotificationData.getContentText()));
                    remoteViews.setTextViewText(R.id.custom_message_native, new WEHtmlParserInterface().fromHtml(pushNotificationData.getContentText()));
                }
                if (TextUtils.isEmpty(pushNotificationData.getContentSummary())) {
                    remoteViews.setTextViewText(R.id.custom_summary, new WEHtmlParserInterface().fromHtml(pushNotificationData.getContentSummary()));
                    remoteViews.setTextViewText(R.id.custom_summary_native, new WEHtmlParserInterface().fromHtml(pushNotificationData.getContentSummary()));
                } else {
                    remoteViews.setViewVisibility(R.id.custom_summary, 8);
                    remoteViews.setViewVisibility(R.id.custom_summary_native, 8);
                }
                remoteViews.setImageViewResource(R.id.small_icon, pushNotificationData.getSmallIcon());
                String format = DateFormat.getTimeFormat(context).format(Long.valueOf(j10));
                remoteViews.setTextViewText(R.id.custom_notification_time, format);
                remoteViews.setTextViewText(R.id.custom_notification_time_native, format);
                return remoteViews;
            }
            i11 = R.id.large_icon;
            createWithResource = Icon.createWithResource(context, context.getApplicationInfo().icon);
        }
        remoteViews.setImageViewIcon(i11, createWithResource);
        remoteViews.setViewVisibility(R.id.push_base_margin_view, 8);
        if (z10) {
        }
        if (TextUtils.isEmpty(pushNotificationData.getTitle())) {
        }
        if (TextUtils.isEmpty(pushNotificationData.getContentText())) {
        }
        remoteViews.setViewVisibility(R.id.custom_message, 8);
        remoteViews.setViewVisibility(R.id.custom_message_native, 8);
        if (TextUtils.isEmpty(pushNotificationData.getContentSummary())) {
        }
        remoteViews.setImageViewResource(R.id.small_icon, pushNotificationData.getSmallIcon());
        String format2 = DateFormat.getTimeFormat(context).format(Long.valueOf(j10));
        remoteViews.setTextViewText(R.id.custom_notification_time, format2);
        remoteViews.setTextViewText(R.id.custom_notification_time_native, format2);
        return remoteViews;
    }

    String a(PushNotificationData pushNotificationData, Context context) {
        String channelId = pushNotificationData.getChannelId();
        return Build.VERSION.SDK_INT >= 26 ? (channelId == null || !j2.b(channelId, context)) ? j2.a() : channelId : channelId;
    }

    void a(Notification.Builder builder, PushNotificationData pushNotificationData, Context context) {
        int i10 = Build.VERSION.SDK_INT;
        builder.setVisibility(0);
        builder.setSmallIcon(pushNotificationData.getSmallIcon());
        if (!TextUtils.isEmpty(pushNotificationData.getTitle())) {
            builder.setContentTitle(new WEHtmlParserInterface().fromHtml(pushNotificationData.getTitle()));
        }
        if (!TextUtils.isEmpty(pushNotificationData.getContentText()) && !pushNotificationData.getContentText().equals("null")) {
            builder.setContentText(new WEHtmlParserInterface().fromHtml(pushNotificationData.getContentText()));
        }
        if (pushNotificationData.getContentSummary() != null) {
            builder.setSubText(new WEHtmlParserInterface().fromHtml(pushNotificationData.getContentSummary()));
        }
        if (pushNotificationData.getLargeIcon() != null) {
            builder.setLargeIcon(pushNotificationData.getLargeIcon());
        } else {
            builder.setLargeIcon(Icon.createWithResource(context, context.getApplicationInfo().icon));
        }
        if (pushNotificationData.isSticky()) {
            builder.setOngoing(true);
        }
        if (i10 < 26) {
            int[] iArr = {-2, -1, 0, 1, 2};
            if (5 < pushNotificationData.getPriority() + 2) {
                builder.setPriority(iArr[pushNotificationData.getPriority() + 2]);
            }
        }
        if (i10 < 26) {
            if (pushNotificationData.getVibrateFlag() && v1.a("android.permission.VIBRATE", context)) {
                builder.setDefaults(2);
            }
            if (pushNotificationData.getSound() != null) {
                builder.setSound(pushNotificationData.getSound());
            }
            if (pushNotificationData.getLedColor() != 0) {
                builder.setLights(pushNotificationData.getLedColor(), 500, 1000);
            }
        }
    }

    void a(Notification notification, Context context, int i10) {
        ((NotificationManager) context.getSystemService("notification")).notify(i10, notification);
    }

    void a(Notification notification, Context context, long j10, int i10) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (System.currentTimeMillis() < j10) {
            notificationManager.notify(i10, notification);
        }
    }

    void a(Context context, PushNotificationData pushNotificationData, long j10, long j11, boolean z10) {
        long j12 = (j11 - j10) / 100;
        if (j12 < 5000) {
            j12 = 5000;
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Bundle bundle = new Bundle();
        bundle.putLong("when", j10);
        bundle.putBoolean("we_wk_render", true);
        if (z10) {
            Logger.d("WebEngage", "Schedule Progress Bar Notification using Alarm due to Service Failure");
            bundle.putBoolean("SERVICE_FAILED", true);
        }
        PendingIntent constructProgressBarRerenderPendingIntent = PendingIntentFactory.constructProgressBarRerenderPendingIntent(context, pushNotificationData, "progressbar_update", bundle);
        if (Build.VERSION.SDK_INT < 31 || (v1.a("android.permission.SCHEDULE_EXACT_ALARM", context) && context.checkSelfPermission("android.permission.SCHEDULE_EXACT_ALARM") == 0)) {
            alarmManager.setExact(1, System.currentTimeMillis() + j12, constructProgressBarRerenderPendingIntent);
        } else {
            alarmManager.set(1, System.currentTimeMillis() + j12, constructProgressBarRerenderPendingIntent);
        }
    }

    public void a(Bitmap bitmap, RemoteViews remoteViews, int i10) {
        remoteViews.setImageViewIcon(i10, Icon.createWithBitmap(bitmap));
    }

    void a(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(R.id.app_name, 8);
        remoteViews.setViewVisibility(R.id.custom_summary, 8);
        remoteViews.setViewVisibility(R.id.custom_notification_time, 8);
        remoteViews.setViewVisibility(R.id.custom_title, 8);
        remoteViews.setViewVisibility(R.id.custom_message, 8);
    }

    void a(RemoteViews remoteViews, int i10) {
        remoteViews.setInt(R.id.custom_message, "setMaxLines", i10);
        remoteViews.setInt(R.id.custom_message_native, "setMaxLines", i10);
    }

    public void a(RemoteViews remoteViews, long j10, int i10) {
        remoteViews.setChronometer(i10, (j10 - System.currentTimeMillis()) + SystemClock.elapsedRealtime(), "%s", true);
    }

    public void a(RemoteViews remoteViews, long j10, long j11) {
        remoteViews.setViewVisibility(R.id.we_notification_progressBar, 0);
        remoteViews.setProgressBar(R.id.we_notification_progressBar, (int) (j10 - j11), (int) (System.currentTimeMillis() - j11), false);
    }

    public void a(RemoteViews remoteViews, long j10, PushNotificationData pushNotificationData) {
        int i10;
        if (WebEngageConstant.STYLE.PROGRESS_BAR.equals(pushNotificationData.getStyle())) {
            remoteViews.setViewVisibility(R.id.we_push_right_layout, 8);
            remoteViews.setViewVisibility(R.id.we_progress_bar_timer, 0);
            i10 = R.id.we_progress_bar_timer;
        } else {
            remoteViews.setViewVisibility(R.id.large_icon, 8);
            remoteViews.setViewVisibility(R.id.we_notification_timer, 0);
            i10 = R.id.we_notification_timer;
        }
        a(remoteViews, j10, i10);
    }

    void a(RemoteViews remoteViews, Notification.Builder builder, PushNotificationData pushNotificationData, Context context) {
        int i10;
        List<CallToAction> callToActions = pushNotificationData.getCallToActions();
        if (callToActions != null && callToActions.size() > 0) {
            int i11 = 0;
            for (CallToAction callToAction : callToActions) {
                if (!callToAction.isPrimeAction() && callToAction.isNative()) {
                    PendingIntent constructPushClickPendingIntent = PendingIntentFactory.constructPushClickPendingIntent(context, pushNotificationData, callToAction, true);
                    try {
                        if (callToAction.getType() != null && callToAction.getType().equals(CallToAction.TYPE.CUSTOM) && callToAction.getCustomActionJSON() != null && "dismiss".equals(callToAction.getCustomActionJSON().getString("at"))) {
                            constructPushClickPendingIntent = PendingIntentFactory.constructPushDeletePendingIntent(context, pushNotificationData);
                        }
                    } catch (JSONException unused) {
                    }
                    i11++;
                    if (i11 != 1) {
                        i10 = i11 != 2 ? i11 != 3 ? -1 : pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000") ? R.id.action3_native : R.id.action3_adaptive : pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000") ? R.id.action2_native : R.id.action2_adaptive;
                    } else {
                        if (Build.VERSION.SDK_INT <= 27) {
                            remoteViews.setInt(R.id.action_list, "setBackgroundColor", Color.parseColor("#e8e8e8"));
                        }
                        remoteViews.setViewVisibility(R.id.action_list, 0);
                        i10 = pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000") ? R.id.action1_native : R.id.action1_adaptive;
                    }
                    if (i10 != -1) {
                        remoteViews.setViewVisibility(i10, 0);
                        remoteViews.setTextViewText(i10, new WEHtmlParserInterface().fromHtml(callToAction.getText()));
                        remoteViews.setOnClickPendingIntent(i10, constructPushClickPendingIntent);
                    }
                }
            }
        }
        builder.setDeleteIntent(PendingIntentFactory.constructPushDeletePendingIntent(context, pushNotificationData));
    }

    public void a(RemoteViews remoteViews, Integer num) {
        if (num != null) {
            remoteViews.setInt(R.id.we_hr_1, "setTextColor", num.intValue());
            remoteViews.setInt(R.id.we_hr_2, "setTextColor", num.intValue());
            remoteViews.setInt(R.id.hr_min_delimiter, "setTextColor", num.intValue());
            remoteViews.setInt(R.id.we_min_1, "setTextColor", num.intValue());
            remoteViews.setInt(R.id.we_min_2, "setTextColor", num.intValue());
            remoteViews.setInt(R.id.min_sec_delimiter, "setTextColor", num.intValue());
            remoteViews.setInt(R.id.we_sec_1, "setTextColor", num.intValue());
        }
    }

    public void a(RemoteViews remoteViews, Integer num, int i10) {
        if (num != null) {
            remoteViews.setInt(i10, "setTextColor", num.intValue());
        }
    }

    void a(RemoteViews remoteViews, boolean z10, long j10, Context context, PushNotificationData pushNotificationData) {
        long currentTimeMillis = j10 - System.currentTimeMillis();
        int i10 = (int) (currentTimeMillis / 3600000);
        int i11 = (int) ((currentTimeMillis % 3600000) / 60000);
        int i12 = (int) ((currentTimeMillis % 60000) / 1000);
        int i13 = R.id.we_hr_1;
        if (i10 > 0) {
            remoteViews.setTextViewText(i13, Integer.toString(i10 / 10));
            remoteViews.setTextViewText(R.id.we_hr_2, Integer.toString(i10 % 10));
        } else {
            remoteViews.setViewVisibility(i13, 8);
            remoteViews.setViewVisibility(R.id.we_hr_2, 8);
            remoteViews.setViewVisibility(R.id.hr_min_delimiter, 8);
        }
        remoteViews.setTextViewText(R.id.we_min_1, Integer.toString(i11 / 10));
        remoteViews.setTextViewText(R.id.we_min_2, Integer.toString(i11 % 10));
        remoteViews.setTextViewText(R.id.we_sec_1, Integer.toString(i12 / 10));
        a(z10, remoteViews, R.id.we_sec_2, context, pushNotificationData);
    }

    private void a(boolean z10, RemoteViews remoteViews, int i10, Context context, PushNotificationData pushNotificationData) {
        for (int i11 = 9; i11 >= 0; i11--) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.vf_expanded_layout);
            remoteViews2.setTextViewText(R.id.tv_item, String.valueOf(i11));
            if (z10) {
                remoteViews2.setTextViewTextSize(R.id.tv_item, 2, 25.0f);
            }
            if (pushNotificationData.getTimerStyleData().getTimerColor() != Color.parseColor("#00000000")) {
                remoteViews2.setInt(R.id.tv_item, "setTextColor", pushNotificationData.getTimerStyleData().getTimerColor());
            }
            remoteViews.addView(i10, remoteViews2);
        }
        remoteViews.setInt(i10, "setFlipInterval", 1000);
    }

    public boolean a(Context context, String str) {
        NotificationChannel notificationChannel;
        int importance;
        if (Build.VERSION.SDK_INT < 26) {
            return androidx.core.app.v.b(context).a();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str);
        importance = notificationChannel.getImportance();
        return importance != 0;
    }

    boolean a(PushNotificationData pushNotificationData) {
        List<CallToAction> callToActions = pushNotificationData.getCallToActions();
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
}
