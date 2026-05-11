package com.webengage.sdk.android.callbacks;

import android.content.Context;
import android.os.Bundle;
import com.webengage.sdk.android.actions.render.PushNotificationData;

/* loaded from: classes2.dex */
public interface CustomPushRerender {
    boolean onRerender(Context context, PushNotificationData pushNotificationData, Bundle bundle);
}
