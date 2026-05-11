package com.webengage.sdk.android.callbacks;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public interface LifeCycleCallbacks {
    void onAppInstalled(Context context, Intent intent);

    void onAppUpgraded(Context context, int i10, int i11);

    void onGCMMessageReceived(Context context, Intent intent);

    void onGCMRegistered(Context context, String str);

    void onNewSessionStarted();
}
