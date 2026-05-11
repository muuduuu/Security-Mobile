package com.webengage.sdk.android;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes2.dex */
public class NotificationClickHandlerService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        Bundle extras;
        try {
            WebEngage.get();
            String action = intent.getAction();
            Logger.d("WebEngage", "NotificationClickHandlerService received intent with action : " + action);
            if ("com.webengage.sdk.android.intent.ACTION".equals(action) && (extras = intent.getExtras()) != null) {
                String string = extras.getString("action");
                Logger.d("WebEngage", "NotificationClickHandlerService received intent with task : " + string);
                if ("WebEngageDeeplink".equals(string)) {
                    WebEngage.get().a(intent, (BroadcastReceiver) null);
                } else if ("push_rerender".equals(string)) {
                    WebEngage.get().d(intent);
                }
            }
        } catch (Exception e10) {
            Logger.e("WebEngage", "Exception while executing push click", e10);
        }
        stopSelf(i11);
        return 2;
    }
}
