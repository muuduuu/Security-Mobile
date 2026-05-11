package com.webengage.sdk.android.callbacks;

import android.content.Context;
import com.webengage.sdk.android.actions.render.InAppNotificationData;

/* loaded from: classes2.dex */
public interface InAppNotificationCallbacks {
    boolean onInAppNotificationClicked(Context context, InAppNotificationData inAppNotificationData, String str);

    void onInAppNotificationDismissed(Context context, InAppNotificationData inAppNotificationData);

    InAppNotificationData onInAppNotificationPrepared(Context context, InAppNotificationData inAppNotificationData);

    void onInAppNotificationShown(Context context, InAppNotificationData inAppNotificationData);
}
