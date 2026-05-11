package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public final class AFg1iSDK {
    public static boolean getMonetizationNetwork(Context context) {
        boolean isInstantApp;
        if (Build.VERSION.SDK_INT >= 26) {
            isInstantApp = context.getPackageManager().isInstantApp();
            return isInstantApp;
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (ClassNotFoundException e10) {
            AFLogger.afErrorLogForExcManagerOnly("InstantAppsRuntime not found", e10, true);
            return false;
        }
    }
}
