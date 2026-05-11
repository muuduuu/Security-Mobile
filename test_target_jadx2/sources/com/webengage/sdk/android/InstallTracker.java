package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public class InstallTracker extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            WebEngage.get().analytics().installed(intent);
            x.a(context.getApplicationContext()).onAppInstalled(context, intent);
        } catch (Exception unused) {
        }
    }
}
