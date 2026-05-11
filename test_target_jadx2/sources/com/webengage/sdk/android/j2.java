package com.webengage.sdk.android;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class j2 {
    private static NotificationChannel a(PushChannelConfiguration pushChannelConfiguration) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        Q2.v.a();
        NotificationChannel a10 = Q2.u.a(pushChannelConfiguration.getNotificationChannelId(), pushChannelConfiguration.getNotificationChannelName(), pushChannelConfiguration.getNotificationChannelImportance());
        if (pushChannelConfiguration.getNotificationChannelDescription() != null) {
            a10.setDescription(pushChannelConfiguration.getNotificationChannelDescription());
        }
        if (pushChannelConfiguration.getNotificationChannelGroup() != null) {
            a10.setGroup(pushChannelConfiguration.getNotificationChannelGroup());
        }
        if (pushChannelConfiguration.getNotificationChannelLightColor() != -1) {
            a10.enableLights(true);
            a10.setLightColor(pushChannelConfiguration.getNotificationChannelLightColor());
        }
        a10.setLockscreenVisibility(pushChannelConfiguration.getNotificationChannelLockScreenVisibility());
        a10.setShowBadge(pushChannelConfiguration.isNotificationChannelShowBadge());
        return a10;
    }

    public static synchronized boolean b(String str, Context context) {
        NotificationChannel notificationChannel;
        synchronized (j2.class) {
            if (Build.VERSION.SDK_INT < 26) {
                return true;
            }
            if (str != null && context != null) {
                notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str);
                return notificationChannel != null;
            }
            return false;
        }
    }

    public static String a() {
        return WebEngage.get().getWebEngageConfig().getDefaultPushChannelConfiguration().getNotificationChannelId();
    }

    public static synchronized void a(PushChannelConfiguration pushChannelConfiguration, Context context) {
        Uri defaultUri;
        synchronized (j2.class) {
            try {
                if (context == null || pushChannelConfiguration == null) {
                    throw new IllegalArgumentException("Invalid Arguments");
                }
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (Build.VERSION.SDK_INT < 26 || (pushChannelConfiguration.isNotificationChannelIdSet() && b(pushChannelConfiguration.getNotificationChannelId(), context))) {
                    if (b(pushChannelConfiguration.getNotificationChannelId(), context)) {
                        Logger.d("WebEngage", "Not creating notification channel as a channel is already present with same channelID");
                    }
                }
                Logger.d("WebEngage", "Creating default notification channel with Channel ID = " + pushChannelConfiguration.getNotificationChannelId() + " and name = " + pushChannelConfiguration.getNotificationChannelName());
                NotificationChannel a10 = a(pushChannelConfiguration);
                if (a10 != null) {
                    if (pushChannelConfiguration.getNotificationChannelSound() != null) {
                        int identifier = context.getResources().getIdentifier(pushChannelConfiguration.getNotificationChannelSound(), "raw", context.getPackageName());
                        if (identifier != 0) {
                            defaultUri = Uri.parse("android.resource://" + context.getPackageName() + "/" + identifier);
                        } else {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                            Logger.e("WebEngage", "No sound resources found in raw folder for name: " + pushChannelConfiguration.getNotificationChannelSound() + ", using default tone.");
                        }
                        a10.setSound(defaultUri, null);
                    }
                    a10.enableVibration(pushChannelConfiguration.isNotificationChannelVibration());
                    notificationManager.createNotificationChannel(a10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized boolean a(String str, Context context) {
        List notificationChannelGroups;
        String id2;
        synchronized (j2.class) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (str != null && context != null) {
                    notificationChannelGroups = ((NotificationManager) context.getSystemService("notification")).getNotificationChannelGroups();
                    if (notificationChannelGroups != null) {
                        Iterator it = notificationChannelGroups.iterator();
                        while (it.hasNext()) {
                            id2 = J.a(it.next()).getId();
                            if (str.equals(id2)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return false;
        }
    }
}
