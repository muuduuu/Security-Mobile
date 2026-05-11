package com.webengage.sdk.android.callbacks;

import android.content.Context;
import com.webengage.sdk.android.actions.render.PushNotificationData;

/* loaded from: classes2.dex */
public interface CustomPushRender {
    boolean onRender(Context context, PushNotificationData pushNotificationData);
}
